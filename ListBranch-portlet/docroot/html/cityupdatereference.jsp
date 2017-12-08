
<%@page import="com.chola.listbranch.model.city"%>
<%@page import="com.chola.listbranch.service.cityLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<script>
$(document).ready(function() {
	$.ajax({
		
	url : "<portlet:resourceURL id='StateCall'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) 
	{
	console.log(JSON.stringify(data));
	for(var i in data)
	{
		$("#state").append("<option value="+ data[i].state_id + ">" + data[i].state_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
})
</script>

<%String stateName=null;
long cityId = ParamUtil.getInteger(request, "cityId");
city ct=null;
ct = cityLocalServiceUtil.getcity(cityId);
	
	System.out.println("City Id======" + cityId);
	
	
	stateName=cityLocalServiceUtil.getstateName(ct.getState_id());
	System.out.println("State Id.."+stateName);
	//EmployeeRefrence ref = null;
	
	if (cityId >= 01) 
	{
		System.out.print("...........city id.........."+cityId);
		System.out.println("####" + ct);
	
	
	}
%>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/editDetails.jsp");
%>
<liferay-ui:header title="Edit City Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitCity"></portlet:actionURL>

<aui:form action="${action}" method="post">
<input type="hidden" name="cityId" value="<%=ct.getCity_id()%>"><br />
<aui:input type="text" name="BranchCity" label="Enter City" value="<%=ct.getCity_name()%>">
<aui:validator name="alpha"/>
<aui:validator name="required"></aui:validator>
</aui:input><br><br>
Select State :<select id="state" name="Selectstate"><option value="<%=ct.getState_id()%>"><%=stateName%></option></select><br><br>
<input type="submit" value="Submit"/>
</aui:form>







