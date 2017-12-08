<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />

<portlet:actionURL name="addEmployee" var="addEmployeeURL">

</portlet:actionURL>

<aui:form action="<%=addEmployeeURL.toString()%>" method="post" >

        <aui:input name="Name" value="Name" />
        <aui:input name="Email" value="Email"/>
        <aui:input name="Dept" value="Dept"/>
        <aui:input name="Mobile No" value="Mobile No"/>
         
         <aui:button name="saveButton" type="submit" value="save"  />
 
</aui:form>

