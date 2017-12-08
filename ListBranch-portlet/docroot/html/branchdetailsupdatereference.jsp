<%@page import="com.chola.listbranch.service.cityLocalServiceUtil"%>
<%@page import="com.chola.listbranch.service.branchdetailsLocalServiceUtil"%>
<%@page import="com.chola.listbranch.model.branchdetails"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<script>
$(document).ready(function() {
	$.ajax({
		
	url : "<portlet:resourceURL id='CityCall1'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) 
	{
	console.log(JSON.stringify(data));
	for(var i in data)
	{
	$("#city").append("<option value=" + data[i].city_id + ">" + data[i].city_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
		});
</script>

<%
String cityName=null;
long branchId = ParamUtil.getInteger(request, "branchId");
branchdetails bd=null;
bd = branchdetailsLocalServiceUtil.getbranchdetails(branchId);
	
	System.out.println("City Id======" + branchId);
	long cityId=bd.getCity_id();
	System.out.println("City Id............" + cityId);
	
	cityName=cityLocalServiceUtil.getcityName(bd.getCity_id());
	System.out.println("CityName...:"+cityName);
	//EmployeeRefrence ref = null;
	
	if (branchId >= 01) 
	{
		
		System.out.print("...........Branch id.........."+branchId);
		System.out.println("####" + bd);
	
	
	}
%>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/editDetails.jsp");
%>
<liferay-ui:header title="Edit Branch Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitBranchDetails"></portlet:actionURL>

<aui:form action="${action}" method="post">
<input type="hidden" name="branchId" value="<%=bd.getBranch_id()%>"><br/>
Select City :<select id="city" name="<portlet:namespace/>SelectCity"><option value="<%=bd.getCity_id()%>"><%=cityName%></option></select><br><br>
<aui:input type="text" name="BranchCode" label="Enter Branch Code" value="<%=bd.getBranch_code()%>">
<aui:validator name="required"></aui:validator>
<aui:validator name="max">10</aui:validator>
</aui:input><br><br>

<aui:input type="text" name="BranchAddress" label="Enter Branch Address" value="<%=bd.getBranch_address()%>">
<aui:validator name="required"></aui:validator>
</aui:input><br><br>


<input type="submit" value="Submit"/>
</aui:form>







