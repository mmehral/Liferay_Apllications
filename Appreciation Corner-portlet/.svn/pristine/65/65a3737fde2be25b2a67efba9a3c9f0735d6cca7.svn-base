<%@taglib uri="http://liferay.com/tld/aui"  prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL name="save" var="saveURL" />
	<aui:form action="<%=saveURL %>" method="post" name="fm">
		<aui:input type="textarea" label="Appreciation Message"
                rows="5" cols="30" name="appMessage" >
          <aui:validator name="max">5000</aui:validator>
          <aui:validator name="required"></aui:validator>     
         </aui:input>
		
       <aui:button-row>
          <aui:button type="submit" value="Submit"/>
      </aui:button-row>
 	
	</aui:form>