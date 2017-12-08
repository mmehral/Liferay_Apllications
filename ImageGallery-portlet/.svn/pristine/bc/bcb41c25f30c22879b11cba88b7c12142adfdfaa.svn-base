<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
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
<aui:form action="<%=saveURL %>" method="post" name="fm" enctype="multipart/form-data" id="myForm" >
		<aui:input type="text" name="albumName" label="Album Name">
		 <aui:validator name="required"></aui:validator>     
		  <aui:validator name="maxLength">200</aui:validator>   
		</aui:input>
		
		<aui:input type="text" name="albumDesc" label="Album Description">
		 <aui:validator name="required"></aui:validator>
		  <aui:validator name="maxLength">500</aui:validator>       
		</aui:input>
		
		<aui:input type="file" name="uploadedFile" label="Select Images" multiple="true">
		 <aui:validator name="required"></aui:validator>     
		 <aui:validator name="acceptFiles">'jpg,png,tif,gif'</aui:validator>
		</aui:input>
	 
		<aui:button-row>
          <aui:button type="submit" value="Submit"/>
         <aui:button type="reset" value="Reset" last="true"/>
      </aui:button-row>
</aui:form>
</body>
</html>
