<%@page import="com.chola.businessmis.model.businessmisdetails"%>
<%@page import="com.chola.businessmis.service.businessmisdetailsLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<portlet:defineObjects/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">
$( document ).ready(function() {
$(".modal-content").addClass("top_header_popup");
$(".modal-header").addClass("top_header_border");
});
</script>
<style>



table {
font-family: arial, sans-serif;
border-collapse: collapse;
width: 100%;
}

th {
border: 1px solid #dddddd;
text-align: left;
padding: 8px;
background:#8a040b;
color:#fff;
}

td {
border: 1px solid #dddddd;
text-align: left;
padding: 8px;
}

tr:nth-child(even) {
background-color: #dddddd;
}


/* border top start */

.top_header_popup{border-top: 23px solid #284b8b;}
.top_header_border{border-top: 2px solid #ca3646;;}

/* border top end */

.close{color:#8a040b !important; border:1px solid #000 !important; border-radius: 4px; font-size: 12px !important;}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
String myVal = request.getParameter("id");
System.out.print(myVal);


businessmisdetails bmis = businessmisdetailsLocalServiceUtil.getbusinessmisdetails(Long.parseLong(myVal));

%>	 
	<object height="700" width="1200"  data="/BusinessMISUpload/admin/<%=bmis.getFilepath()%>"></object>

<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html>