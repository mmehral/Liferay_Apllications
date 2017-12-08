<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<portlet:actionURL var="saveURL" name="postReply"></portlet:actionURL>
<%
String id = request.getParameter("id");
System.out.println("id : "+id);

String appby = request.getParameter("appby");
System.out.println("appby : "+appby);
		 
%>
	<aui:form action="<%=saveURL %>" method="post" name="fm">
	<input type="hidden" value="<%=id%>" name="id"/>
	<input type="hidden" value="<%=appby%>" name="appby"/>
		<aui:input type="textarea" label="Reply Message"
                rows="5" cols="30" name="replyMessage" >
          <aui:validator name="max">5000</aui:validator>
          <aui:validator name="required"></aui:validator>     
         </aui:input>
       <aui:button-row>
          <aui:button type="submit" value="Submit"/>
      </aui:button-row>
	</aui:form>

</body>
</html>
