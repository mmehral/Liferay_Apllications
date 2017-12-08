<%@page import="com.popular.service.popularlinksLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>

<portlet:defineObjects />
<html>
<head>

<script type="text/javascript">
$( document ).ready(function() {
	$(".modal-content").addClass("top_header_popup");
	$(".modal-header").addClass("top_header_border");
});
</script>
<style >
.top_header_popup{border-top: 23px solid #284b8b;}
.top_header_border{border-top: 2px solid #ca3646;;}

/* border top end */

.close{color:#8a040b !important; border:1px solid #000 !important; border-radius: 4px; font-size: 12px !important;}

</style>
</head>
<body>
<% 
// Fetching the List from URL Link Table......
	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if(themeDisplay.isSignedIn())
	{
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
<div><a href="#" onclick="return doDelete(<%=obj[3]%>)">Delete</a><br></div>
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
<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html>
