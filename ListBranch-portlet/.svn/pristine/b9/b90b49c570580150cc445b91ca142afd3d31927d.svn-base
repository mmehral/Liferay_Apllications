<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="java.util.List" %>
<%@page import="com.liferay.counter.kernel.service.persistence.CounterFinderUtil" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>

<script>
$(document).ready(function() {
	$.ajax({
		
	url : "<portlet:resourceURL id='ProductCall'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) 
	{
	console.log(JSON.stringify(data));
	for(var i in data)
	{
	$("#product").append("<option value=" + data[i].product_id + ">" + data[i].product_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
		});
		
		
		
		
		
		
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
		$("#state").append("<option value=" + data[i].state_id + ">" + data[i].state_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
	
	$("#state").change(function () {
		
		$('#City').empty();
		var stateId=$(this).val();
		
		
	$.ajax({
			
			url : "<portlet:resourceURL id='CityCall'/>",
			type : 'POST',
			dataType : 'json',
			data:{ stateId: stateId },
			success : function(data) 
			{
			console.log(JSON.stringify(data));
			$("#City").append("<option value=" + "" + ">Select City </option>");
			 for(var i in data)
			{
			$("#City").append("<option value=" + data[i].city_id + ">" + data[i].city_name + "</option>");
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
		
	url : "<portlet:resourceURL id='CityCall'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) 
	{
	console.log(JSON.stringify(data));
	for(var i in data)
	{
	$("#City").append("<option value=" + data[i].city_id + ">" + data[i].city_name + "</option>");
	}
	},
	error : function() {
	console.log("There was an error. Try again please!");
	}
	});
	
	
	
	
	
	
	
	
	
	
	$("#City").change(function () {
		
		$('#branchname').empty();
		var cityId=$(this).val();
		
		
	$.ajax({
			
			url : "<portlet:resourceURL id='BranchCall'/>",
			type : 'POST',
			dataType : 'json',
			data:{ cityId: cityId },
			success : function(data) 
			{
			console.log(JSON.stringify(data));
			$("#branchname").append("<option value=" + "" + ">Select Branch code </option>");
			 for(var i in data)
			{
			$("#branchname").append("<option value=" + data[i].branch_id + ">" + data[i].branch_code + "</option>");
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
	
	var product = document.getElementById("product").value;
	
	if(product == null || product =="")
	{
		alert ("Please Select Product..!!!");
		return false;
		}
	
	var state = document.getElementById("state").value;

	if(state == null || state =="")
	{
		alert ("Please Select State..!!!");
		return false;
		}
	
	var City = document.getElementById("City").value;

	if(City == null || City =="")
	{
		alert ("Please Select City..!!!");
		return false;
		}
	
	var branchname = document.getElementById("branchname").value;
	
	if(branchname == null || branchname =="")
	{
		alert ("Please Select Branchname..!!!");
		return false;
		}
}

</script>
<%
		
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/addDetails.jsp");
		
%>
<liferay-ui:header title="Add Branch-Product Mapping" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitBranchProductMapping"></portlet:actionURL>

<form action="${action}" method="post" onsubmit="return ValidateForm()">
Select Product :<select required="required" id="product" name="Selectproduct"><option value="">Select Product</option></select><br><br>
Select State :<select required="required" id="state" name="Selectstate"><option value="">Select State</option></select><br><br>
Select City :<select required="required" id="City"    name="SelectCity" ><option value="" >Select City</option></select><br><br>
Select BranchCode :<select  required="required" id="branchname" name="Selectbranchname"><option value="">Select Branch Name</option></select><br><br>
<input type="submit" value="Submit"/>
</form>