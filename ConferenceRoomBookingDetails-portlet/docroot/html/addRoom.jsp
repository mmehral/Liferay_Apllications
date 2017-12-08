<%@page import="com.chola.conferenceroombooking.service.facilitymasterLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.model.facilitymaster"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
$(document).ready(function() {
	$.ajax({
		
	url : "<portlet:resourceURL id='FloorCall'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) 
	{
	console.log(JSON.stringify(data));
	for(var i in data)
	{
	$("#floor").append("<option value=" + data[i].floorwing_id + ">" + data[i].floor_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
		});
		
</script>

<liferay-ui:error key="error-key" message="Please Select Atleast One facility" />
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/addDetails.jsp");
%>

<liferay-ui:header title="Add Room Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="submitRoom"></portlet:actionURL>

<%

List<facilitymaster> list=facilitymasterLocalServiceUtil.getfacilitymasters(0, facilitymasterLocalServiceUtil.getfacilitymastersCount());


System.out.print("List of facility......."+list);

List<KeyValuePair> leftList = new ArrayList<KeyValuePair>();

for(facilitymaster fw:list)
{
leftList.add(new KeyValuePair(fw.getFacility_name(),fw.getFacility_name()));
}
List<KeyValuePair> rightList = new ArrayList<KeyValuePair>();

%>
<aui:form action="${action}"  method="post" name="fm">



Select State :<select required="required" id="state" name="Selectstate">
<option value="">Select State</option>
</select><hr>

Select Location :<select required="required" id="location" name="Selectlocation">
<option value="">Select Location</option>
</select><hr>

Select Floor :<select required="required" id="floor" name="Selectfloor">
<option value="">Select Floor</option>
</select><hr>

<aui:input type="text" name="roomname" label="Enter Room Name(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100">
<aui:validator name="required" errorMessage="Room Name is required"/>
<aui:validator name="maxLength" errorMessage="Room name should not be greater than 100 Characters">100</aui:validator>

</aui:input>
<hr>

<aui:input type="text" name="capacity" label="Enter Capacity" helpMessage="Please Enter Digits Only">
<aui:validator name="required" errorMessage="Capacity field is required"/>
<aui:validator name="digits"/>
</aui:input>
<hr>

<aui:input type="text" name="extension" label="Enter Extension" helpMessage="Please Enter Digits Only">
<aui:validator name="required" errorMessage="Extension field is required"/>
<aui:validator name="digits"/>
</aui:input>
<hr>


<aui:input name="values" type="hidden" id="values"/>
    <liferay-ui:input-move-boxes
        leftBoxName="availableValues"
        leftList="<%=leftList %>"
        leftReorder="true"
        leftTitle="available"
        rightBoxName="selectedValues"
        rightList="<%=rightList %>"
        rightTitle="selected"
    />
 

   <aui:button type="submit" value="Add Room" />
</aui:form>





 <aui:script use="liferay-util-list-fields">
A.one('#<portlet:namespace/>fm').on('submit', function(event) 
		{
    var selectedValues = Liferay.Util.listSelect('#<portlet:namespace/>selectedValues');
   
    if(selectedValues=="")
    {
    	
    	return false;
    }
    else
    {
    	 A.one('#<portlet:namespace/>values').val(selectedValues);
    	 submitForm('#<portlet:namespace/>fm');
    }
   
   
    
});
</aui:script> 