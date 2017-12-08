<%@page import="com.chola.halloffame.service.usersLocalServiceUtil"%>
<%@page import="com.chola.halloffame.model.users"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />
	
<portlet:actionURL name="uploadData" var="saveURL" />
<aui:form action="<%=saveURL %>" method="post" name="fm" enctype="multipart/form-data">
		<aui:input type="file" name="uploadedFile" label="Select a file to upload">
		 <aui:validator name="required"></aui:validator>     
		 <aui:validator name="acceptFiles">
			'xlsx'
		</aui:validator>
		</aui:input>
		<aui:button-row>
          <aui:button type="submit" value="Submit"/>
      </aui:button-row>
</aui:form>
</body>
</html>
