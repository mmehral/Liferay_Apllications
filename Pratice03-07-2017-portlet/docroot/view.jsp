<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>


<portlet:defineObjects />



 <portlet:renderURL var="showRenderURL"> 
 <portlet:param name="mvcPath" value="/html/employee/show.jsp"/> 
 </portlet:renderURL> 
 
 <a href="<%=showRenderURL%>">Go to show</a><br>

<portlet:actionURL name="addEmp" var="addEmpURL"></portlet:actionURL>
<aui:form action="${addEmpURL}" method="post" >
   <aui:input name="empId" type="text"  />
   <aui:input name="empName" type="text"  /> 
   <aui:input name="dept" type="text"  />
   <aui:input name="salary" type="text" />
   
   <aui:button type="submit" name="submit" value="submit" />
</aui:form>




<%-- <portlet:renderURL var="rendrURL" windowState="<%=LiferayWindowState.EXCLUSIVE.toString() %>"> --%>
<%-- <portlet:param name="jspPath" value=""/> --%>

<%-- </portlet:renderURL> --%>

