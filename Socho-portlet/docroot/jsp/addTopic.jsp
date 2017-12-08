<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<html>
<head>

</head>
<body>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />
<liferay-ui:error key="topic-already-there" message="Topic already there add a different one " />
	<portlet:actionURL name="add" var="addTopic" />
	<aui:form action="<%=addTopic %>" method="post" name="fm">
		<aui:input type="textarea" label="Add a Topic" rows="5" cols="30" name="topic" >
          <aui:validator name="maxLength">200</aui:validator>
          <aui:validator name="required"></aui:validator>             
        </aui:input>
       <aui:button-row>
          <aui:button type="submit" value="Submit"/>
         <aui:button type="reset" value="Reset" last="true"/>
      </aui:button-row>
 	
	</aui:form>
</body>
</html>
