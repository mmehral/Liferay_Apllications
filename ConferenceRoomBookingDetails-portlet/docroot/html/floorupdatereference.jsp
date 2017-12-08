<%@page import="com.chola.conferenceroombooking.service.cityLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.city"%>
<%@page import="com.chola.conferenceroombooking.service.locationLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.location"%>
<%@page import="com.chola.conferenceroombooking.service.stateLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.state"%>
<%@page import="com.chola.conferenceroombooking.service.floorwingLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.floorwing"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<script type="text/javascript"
src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script>
$(document).ready(function() {
	$.ajax({
		
	url : "<portlet:resourceURL id='StateCalls'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) 
	{
	console.log(JSON.stringify(data));
	for(var i in data)
	{
		$("#state").append("<option value=" + data[i].state_id + ">" + data[i].state_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
	
	$("#state").change(function () {
		
		$('#location').empty();
		var stateId=$(this).val();
		
		
	$.ajax({
			
			url : "<portlet:resourceURL id='locationCall'/>",
			type : 'POST',
			dataType : 'json',
			data:{ stateId: stateId },
			success : function(data) 
			{
			console.log(JSON.stringify(data));
			$("#location").append("<option value=" + "" + ">Select Location </option>");
			 for(var i in data)
			{
			$("#location").append("<option value=" + data[i].location_id + ">" + data[i].location_name + "</option>");
			} 
			},
			error : function() {
			console.log("There was an error. Try again please!");
			}
			});
			

	});
	
	});
</script>
<script>
function ValidateForm()
{
	
	var names = document.getElementById("state").value;
	
	if(names == null && names =="")
	{
		alert ("Please Select State..!!!");
		return false;
		}
	else if(names!= null)
		{
		alert ("Select State..!!!");
		return false;
		}
		
}
</script>
<%
long floorwingId = ParamUtil.getInteger(request, "floorwingId");
floorwing fw=null;

fw=floorwingLocalServiceUtil.getfloorwing(floorwingId);

String locationname=null;
String floorname=null;
%>

<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/editFloor.jsp");
%>

  <%
  
	state lt = stateLocalServiceUtil.getstate(fw.getState_id());
	System.out.print("lt......................"+lt);
	%>	
		<%
		city ln = cityLocalServiceUtil.getcity(fw.getLocation_id());
		System.out.print("ln......................"+ln.getCity_name()); 

	
	%> 
<liferay-ui:header title="Add Floor/Wing Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="submitFloorWing"></portlet:actionURL>

<aui:form action="${action}"  method="post">

<input type="hidden" name="floorwingId" value="<%=fw.getFloorwing_id()%>"><br />

Select State :<select required="required" id="state" name="Selectstate">
<option value="<%=fw.getState_id()%>"><%=lt.getState_name() %></option>
</select><hr>

Select Location :<select required="required" id="location" name="Selectlocation">
<option value="<%=fw.getLocation_id()%>"><%=ln.getCity_name()%></option>
</select><hr>


<aui:input type="text" name="floorname" label="Enter Floor Name(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100" value="<%=fw.getFloor_name()%>">
<aui:validator name="required" errorMessage="Floor Name is required"/>
<aui:validator name="maxLength" errorMessage="Floor Name should not be greater than 100 Characters">100</aui:validator>

</aui:input>
<hr>
<aui:button type="submit" value="Edit Floor" />

</aui:form>
