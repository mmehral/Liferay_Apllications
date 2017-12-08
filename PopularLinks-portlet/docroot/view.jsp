<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.chola.popularlinks.service.popularlinksLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>

<portlet:defineObjects />
<script type="text/javascript">

		$(document).ready(function() {
			$.ajax({
				url : "<portlet:resourceURL id='HitCount'/>",
				type : 'POST',
				dataType : 'json',
				success : function(data) {
					console.log(JSON.stringify(data));
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
		});
</script>		
<% 
// Fetching the List from URL Link Table......
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		List<Object[]> internallist = popularlinksLocalServiceUtil.getinternallinks(themeDisplay.getUserId());
		List<Object[]> externallist = popularlinksLocalServiceUtil.getExternallinks(themeDisplay.getUserId());

	PortletURL deleteURL=renderResponse.createActionURL();
	deleteURL.setParameter(actionRequest.ACTION_NAME, "deleteExternal");

if(externallist!=null)
{
%>
Links Manually Added : <br>
<%
for(Object[] obj :externallist)
{ 
%>
<div id="ext_<%=obj[3]%>">
<a href="<%=obj[0] %>" target="_blank"><%=obj[1] %></a>&nbsp;&nbsp;&nbsp;
<input type="submit"  value="Delete" onclick="return doDelete(<%=obj[3]%>)"><br>
</div>
<%
} 
}
%>
<hr>

Most frequently used links : <br>
<%if(internallist!=null)
{
for(Object[] obj :internallist)
{ 
%>
<a target="_blank" href="http://localhost:8080<%=obj[0] %>" ><%=obj[1] %></a><br/>
<%
} 
}
%>


<script>

function doDelete(that){
//	alert(that);
	 var val=that;
	 var id="ext_"+val;
	$.ajax({
		url : "<portlet:resourceURL id='DeleteLink'/>",
		type : 'POST',
		//dataType : 'json',
		data:{val1:val},
		success : function(data) {
			$("#"+id).remove();
			console.log(data);
			//return true;
			
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
	
}

</script>
