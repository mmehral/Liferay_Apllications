 <%@page import="java.util.Random"%>
<%@page import="com.liferay.portal.kernel.dao.search.DisplayTerms"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<portlet:defineObjects />

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
.top_header_border{border-top: 2px solid #ca3646;}

/* border top end */

.close{color:#8a040b !important; border:1px solid #000 !important; border-radius: 4px; font-size: 12px !important;}

</style>


<script type="text/javascript">
function toggle_password(target){
    var d = document;
    var tag = d.getElementById(target);
    var tag2 = d.getElementById("showhide");

    if (tag2.innerHTML == 'Show'){
        tag.setAttribute('type', 'text');   
        tag2.innerHTML = 'Hide';

    } else {
        tag.setAttribute('type', 'password');   
        tag2.innerHTML = 'Show';
    }
}

</script>
</head>
<body>



<portlet:actionURL name="configurePassword" var="configurePassword">
</portlet:actionURL>

<%
String CHAR_LIST = 
"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
int RANDOM_STRING_LENGTH = 5;

StringBuffer randStr = new StringBuffer();
for(int i=0; i<RANDOM_STRING_LENGTH; i++){
    int number =0;
    
    int randomInt = 0;
    Random randomGenerator = new Random();
    randomInt = randomGenerator.nextInt(CHAR_LIST.length());
    if (randomInt - 1 == -1) {
    	number= randomInt;
    } else {
    	number= randomInt - 1;
    }   
    char ch = CHAR_LIST.charAt(number);
    randStr.append(ch);
}

%>

<aui:form name="<%=randStr.toString()%>" action="${configurePassword}" method="POST">
<aui:input required=""  type="password" id="password" name="password" label="Please enter Micrsoft Exchange password">
 <a href="javascript:;" onclick="toggle_password('<portlet:namespace/>password');" id="showhide">Show</a>
 <aui:validator name="required"/>
</aui:input>
 
<aui:button type="submit" value="Configure and Save" ></aui:button>
</aui:form>






<div style="border-bottom:1px solid #cd3947;">&nbsp;</div>
</body>
</html> 

