<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />

<portlet:actionURL name="addcustomer"var="addcustomerActionURL">

</portlet:actionURL>
<aui:form action="<%=addcustomerActionURL.toString()%>" name="addcustomer" method="POST">

<aui:input name="Name" >
 <aui:validator name="required"/>
 <aui:validator name="alpha"/>
</aui:input>

<aui:input name="Product" >
 <aui:validator name="required"/>
 <aui:validator name="alpha"/>
</aui:input> 

<aui:input name="PhoneNo" >
 <aui:validator name="required"/>
 <aui:validator name="int"/>
</aui:input>

<aui:input name="Price">
 <aui:validator name="required"/>
 <aui:validator name="float"/>
</aui:input>  

<aui:input name="Email" >
 <aui:validator name="required"/>
 <aui:validator name="alpha"/>
</aui:input>

<aui:button type="submit" name="" value="Submit"></aui:button>

</aui:form>