

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<portlet:actionURL name="save" var="saveURL" />
	<aui:form action="<%=saveURL%>" method="post" name="fm"
		enctype="multipart/form-data" id="myForm">

<aui:input type="textarea" name="lbtitle" id="lbtitle" label="Title">
				<aui:validator name="required"></aui:validator>
				 <aui:validator name="maxLength">100</aui:validator>
			</aui:input>

			<aui:input type="textarea" name="lbDesc" id="lbDesc"
				label="Description">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="maxLength">200</aui:validator>
			</aui:input>

			<aui:input type="file" name="uploadedFile" label="Select a image file to upload">
			<aui:validator name="required"></aui:validator>
			<aui:validator name="acceptFiles">'html'</aui:validator>
			</aui:input>
		</div>
	
		<aui:button-row>
			<aui:button type="submit" value="Submit" />
		</aui:button-row>
		
		
	</aui:form>
	
	
	<object data="/DemoUpload/admin/htmluploadtest_10_07_2017_12_33_33.html"></object>
	