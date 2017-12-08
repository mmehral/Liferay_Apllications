<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>

<script type="text/javascript">
$(document).ready(function() {
	
	 $("#age").change(function () {
	        var val = this.value;
	        console.log(val);
	        
	        if(val=="lessthan")
	        	{
	        	$('input[name=lessthanvalue]').show();
	        	$('input[name=greaterthanvalue]').hide();
	        	$('input[name=betweenfromvalue]').hide();
	        	$('input[name=betweentovalue]').hide();
	        	}
	        
		        if(val=="all")
	        	{
	        	$('input[name=lessthanvalue]').hide();
	        	$('input[name=greaterthanvalue]').hide();
	        	$('input[name=betweenfromvalue]').hide();
	        	$('input[name=betweentovalue]').hide();
	        	}
		        
		        if(val=="greaterthan")
	        	{
	        	$('input[name=greaterthanvalue]').show();
	        	$('input[name=betweenfromvalue]').hide();
	        	$('input[name=betweentovalue]').hide();
	        	$('input[name=lessthanvalue]').hide();
	        	}
		        
		        if(val=="between")
	        	{
	        	$('input[name=betweenfromvalue]').show();
	        	$('input[name=betweentovalue]').show();
	        	$('input[name=lessthanvalue]').hide();
	        	$('input[name=greaterthanvalue]').hide();
	        	}
	    });
});
</script>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>
</head>

<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<a href="<%=back%>">Click here to go back</a>
<%
PortletURL addURL=renderResponse.createActionURL();
addURL.setParameter(actionRequest.ACTION_NAME, "addEventAction");
%>
<form action="<%=addURL.toString()%>" method="post">
<table>

<tr>
<td>Location/Office/Branch</td>
<td><!-- <input type="text" name="location"/> -->
<select name="location" id="location">
  <option value="all">All</option>
</select>
</td>
</tr>
<tr>
<td>Department</td>
<td><!-- <input type="text" name="dept"/> -->
<select name="dept" id="dept">
  <option value="all">All</option>
</select></td>
</tr>
<tr>
<td>Sub Department</td>
<td><!-- <input type="text" name="subdept"> -->
<select name="subdept" id="subdept">
  <option value="all">All</option>
</select></td>
</tr>
<tr>
<tr>
<td>Gender</td>
<td><select name="gender">
  <option value="male">Male</option>
  <option value="female">Female</option>
  </select>
  <!-- <input type="radio" name="gender" value="Male" checked="checked">&nbsp;&nbsp;Male
  <input type="radio" name="gender" value="Female" >&nbsp;&nbsp;Female -->
  </td>
</tr>
<tr>
<td>Grade</td>
<td><!-- <input type="text" name="grade"> -->
<select name="grade" id="grade">
  <option value="all">All</option>
</select></td>
</tr>
<tr>
<td>Age</td>
<td><select name="age" id="age">
  <option value="all">All</option>
  <option value="lessthan">Less than</option>
  <option value="greaterthan">Greater than</option>
  <option value="between">Between</option>
</select>
<input type="text" name="lessthanvalue" placeholder="Less Than" style="display: none">
<input type="text" name="greaterthanvalue" placeholder="Greater Than" style="display: none">
<input type="text" name="betweenfromvalue" placeholder="From" style="display: none">
<input type="text" name="betweentovalue" placeholder="To" style="display: none">
</td>
</tr>
<tr>
<td>Name of the Company</td>
<td><!-- <input type="text" name="companyname"> -->
<select name="companyname" id="companyname">
  <option value="all">All</option>
</select></td>
</tr>

<tr>
<td>User Id</td>
<td><!-- <select name="userid" multiple="multiple">
  <option value="CI2938">CI2938</option>
 <option value="CI2939">CI2939</option>
 <option value="CI2940">CI2940</option>
 <option value="CI2941">CI2941</option>
 <option value="CI2942">CI2942</option>
</select> --><input type="text" name="userid"></td>
</tr>
<tr>
<td>Event Details :</td>
<td><textarea rows="4" cols="50" name="eventdetails"></textarea></td>
</tr>
<tr>
<td>Event From</td>
<td><input type="text" name="eventfrom"></td>
</tr>
<tr>
<td>Event To</td>
<td><input type="text" name="eventto"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Add Event"></td>
</tr>
</table>
</form>
<body>
<form>
</form>
</body>
</html>