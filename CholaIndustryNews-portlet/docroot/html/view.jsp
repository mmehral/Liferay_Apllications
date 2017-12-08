<%@page import="com.chola.industrynews.IndustryNewsMainAction"%>
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


  <script type='text/javascript'>

(function()
{
if( window.localStorage )
{
if( !localStorage.getItem('firstLoad') )
{
localStorage['firstLoad'] = true;
window.location.reload();
} 
else
localStorage.removeItem('firstLoad');
}
})();

</script> 
<%-- <link
href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet"
href="<%=request.getContextPath()%>/css/validationEngine.jquery.css"
type="text/css" />
<script type="text/javascript"
src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
src="<%=request.getContextPath()%>/js/jquery-ui-1.8.19.custom.min.js"></script>

<script
src="<%=request.getContextPath()%>/js/jquery.validationEngine-en.js"
type="text/javascript" charset="utf-8"></script>
<script
src="<%=request.getContextPath()%>/js/jquery.validationEngine.js"
type="text/javascript" charset="utf-8"></script>
<link href="<%=request.getContextPath()%>/css/jquery-ui.css"
rel="stylesheet" />
 --%>

<script type="text/javascript">
function checkdd(that){
	var id=that.id;
	if (isValidDate(that.value)) {

	} else {
	alert("Please enter valid date formate DD/MM/YYYY ");
	document.getElementById(id).value="";
	}
	}

	function isValidDate(sText) {
	var reDate = /(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/;
	return reDate.test(sText);
	}
</script>



 <script>
$(document).ready(function() {
$("#datepicker-13").datepicker({
dateFormat : 'dd/mm/yy'

});
$("#datepicker-14").datepicker({
dateFormat : 'dd/mm/yy',
minDate : 0
});
jQuery("#myForm").validationEngine();
});
</script> 
<portlet:actionURL var="industryURL" windowState="normal"
	name="industryAction">
</portlet:actionURL>

<script>
	$(document).ready(function() {
		// $( "#datepicker" ).datepicker();
		$.ajax({
			url : "<portlet:resourceURL id='ContentNewsCall'/>",
			type : 'POST',
			dataType : 'json',
			success : function(data) {
				console.log(JSON.stringify(data));
				for ( var i in data) {

					$("#con").append(data[i].content);

				}
				//alert("Content :"+data[i].content)
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
	});

	/* $("#datepicker").change(function() {
		$('#con').empty()
		alert("in function");
		var createDate = $(this).val();
		alert("create date" + createDate); */

		function fetch()
		{		
		
			
		 $("#con").empty()
		
		 var createDate=$("#datepicker-13").val();  
			if(createDate==""||createDate==null)
			{
				alert("Please Enter date.");
				return false;
				
			} 			
		
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
				/* alert("content.....");
				$("#content").append(data.content);*/
				
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
		}
	
	
</script>
<!-- <script type="text/javascript">
function checkdd(that){
	var id=that.id;
	if (isValidDate(that.value)) {

	} else {
	alert("Please enter valid date formate DD/MM/YYYY ");
	document.getElementById(id).value="";
	}
	}

	function isValidDate(sText) {
	var reDate = /(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/;
	return reDate.test(sText);
	}
</script> -->
<script>  
function validateform(){
	//alert("in function...")

var x = document.forms["form"]["createDate"].value;
if (x == ""||x== null)
{
    alert("Date must be filled out");
    return false;
}
}
</script>
<portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/html/addmenu.jsp" />
</portlet:renderURL>
<%
	ThemeDisplay display = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if (display.isSignedIn()) {
		if (request.isUserInRole("Administrator") || request.isUserInRole("Marketing Admin")) {
%>
<a href="<%= showjspURL.toString() %>"  style="float: right;">Add Industry News</a><br>
<%
	} 
%>

<!-- <form id="myForm" name="form" onSubmit="return validateform()" method="post"> -->
<!-- Select Date :<input type="date" name="createDate" min="2000-01-02"><br><br>  -->
Select Date :(dd/mm/yyyy format only)<br><input type="text" id="datepicker-13" name="createDate" placeholder="dd/mm/yyyy"/><hr>
 <!-- <input type="date" id="datepicker-13" name="createDate"/>  -->
<!--     <input id="datepicker" type="text" name="createDate" placeholder="DD/MM/YYYY" onchange="return checkdd(this)"/>(dd/mm/yyyy) --> 
 <input type="submit" value="Fetch News" onclick="fetch()">
 <!-- </form> -->
<br>
<br>
 Get News :
<div id="con" >
 
<%
}
%>
</div>
<!-- <script>
YUI().use('aui-datepicker', function (Y) {

    var datePicker = new Y.DatePicker({
        trigger: '#date'
    });

    Y.one('#icon').on('click', function(event) {
        // Cannot do datePicker.show(); because of https://issues.liferay.com/browse/AUI-1795
        var date = document.getElementById('date');
        date.focus();
        date.click();
    });
});
</script> --><br><br>
<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
<div>
<liferay-ui:ratings
className="<%=IndustryNewsMainAction.class.getName()%>"
classPK="11311" 
numberOfStars="5"
/> 
</div>
<div>
<liferay-ui:discussion 
classPK="11311" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=IndustryNewsMainAction.class.getName()%>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%=true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/>
</div>