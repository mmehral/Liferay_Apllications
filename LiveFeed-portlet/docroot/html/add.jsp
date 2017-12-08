<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib prefix="aui"  uri="http://liferay.com/tld/aui"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
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
 <!-- <script type='text/javascript'>

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

</script>   -->
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
rel="stylesheet" /> --%>

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

<script>  
function validateform(){
	//alert("in function...")

var x = document.forms["form"]["title"].value;
if (x == ""||x== null)
{
    alert("Title must be filled out");
    return false;
}
 
/* var y = document.forms["form"]["content"].value;
if (y == ""||y== null)
{
    alert("Content must be filled out");
    return false;
} */

var z = document.forms["form"]["createDate"].value;
if (z == ""||z== null)
{
    alert("Date must be filled out");
    return false;
}
 
  }  
 
</script> 


<liferay-ui:error key="error-key" message="Live Feeds Already Present for same Date" />
<liferay-ui:error key="error-key1" message="Please fill Content" />
<title>Insert title here</title>
</head>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/view.jsp");

%>

<body>
<portlet:actionURL var="industryURL" windowState="normal"
	name="addLivefeedAction">
</portlet:actionURL>
<liferay-ui:header title="Add Live Feeds"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<form action="<%=industryURL%>" id="myForm" name="form" onSubmit="return validateform()" method="post">
	Title:<input type="text" name="title" ><hr>
	
	Live feed Content:<liferay-ui:input-editor name="content" initMethod="initEditor"
		width="100" height="400" resizable="true" />
	<hr>
	Select Date:(dd/mm/yyyy format only)<br><input type="text" id="datepicker-13" name="createDate" placeholder="dd/mm/yyyy"/><hr> 
	<!--  Select Date :<input type="text" id="datepicker-13" name="createDate" label="Select Date"
    class="validate[required]">  -->
   <!--  Select Date :<input type="date" name="createDate" min="2000-01-02"><hr> -->
    
    <input type="submit" value="Submit"/>
    </form>
<aui:script>
	function <portlet:namespace/>initEditor() {
		return "";
	}
</aui:script>
</body>
</html>