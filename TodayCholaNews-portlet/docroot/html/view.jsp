<%@page import="com.chola.TodayChola.Action.CholaNewsMainAction"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<portlet:actionURL var="industryURL" windowState="normal"
	name="industryAction">
</portlet:actionURL>
     
<script>
	$(document).ready(function() {
		$.ajax({
			url : "<portlet:resourceURL id='ContentNewsCall'/>",
			type : 'POST',
			dataType : 'json',
			success : function(data) {
				console.log(JSON.stringify(data));
				for ( var i in data) {
					$("#con").append(data[i].content);
				}
			
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
		
	});

		function fetch()
		{
		
			$("#con").empty()
			console.log("in fetch function...")
			 var createDate=$("#datepicker").val();  
				if(createDate==""||createDate==null)
				{
					console.log("Please Enter date...");
					return false;
				}
				console.log("Date is "+createDate);
			
			$.ajax({
			url : "<portlet:resourceURL id='ContentCall'/>",
			type : 'POST',
			dataType : 'json',
			data : {
				create_Date : createDate
			},
			success : function(data) {

				for ( var i in data) {

					$("#con").append(data[i].content);

				}
				console.log(" after append.." + data[i].content);
				console.log(" after append con.." + data[i].content);
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
	}
	
	
</script>


<script type="text/javascript">
function checkdd(that){
	var id=that.id;
	if (isValidDate(that.value)) {

	} else {
	console.log("Please enter valid date formate DD/MM/YYYY ");
	document.getElementById(id).value="";
	}
	}

	function isValidDate(sText) {
	var reDate = /(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/;
	return reDate.test(sText);
	}
</script>
<portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/html/addmenu.jsp" />
</portlet:renderURL>
<%
	ThemeDisplay display = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if (display.isSignedIn()) {
		if (request.isUserInRole("Administrator")) {
%>


<a href="<%= showjspURL.toString() %>"  style="float: right;">Add today's Chola live feed</a><br>

<%
	} 
%>

Select Date :
<input id="datepicker" type="text" name="createDate" placeholder="DD/MM/YYYY" onchange="return checkdd(this)">(dd/mm/yyyy)
<input type="submit" value="Fetch News" onclick="fetch()">
<br>
<br>
News :
<div id="con" />

<%
	
	}
%>
<portlet:actionURL var="discussURL1" name="addComments"></portlet:actionURL>
<div>
<liferay-ui:ratings
className="<%=CholaNewsMainAction.class.getName()%>"
classPK="11313" 
numberOfStars="5"
/>
</div>
<div>
<liferay-ui:discussion 
classPK="11313" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=CholaNewsMainAction.class.getName()%>" 
formAction="<%=discussURL1 %>"
ratingsEnabled="<%=true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/>
</div>
