
<%@page import="com.chola.listbranch.service.cityLocalServiceUtil"%>
<%@page import="com.chola.listbranch.model.mapping"%>
<%@page import="com.chola.listbranch.service.mappingLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
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
			$("#branchname").append("<option value=" + "" + ">Select Branch name </option>");
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



<%
String cityName=null;
String stateName=null;
String productName=null;
String branchName=null;
long mappingId = ParamUtil.getInteger(request, "mappingId");
mapping map=null;
map = mappingLocalServiceUtil.getmapping(mappingId);
	
	System.out.println("mappingId=====" + mappingId);
	
/* 	long cityId=map.getCity_id();
	System.out.println("City Id............" + cityId); */
	
	System.out.println("product id=====" + map.getProduct_id());
	System.out.println("state id=====" + map.getState_id());
	System.out.println("city id=====" + map.getCity_id());
	System.out.println("branch id=====" + map.getBranch_id());
	
	
	cityName=cityLocalServiceUtil.getcityName(map.getCity_id());
	System.out.println("CityName...:"+cityName);
	
	stateName=cityLocalServiceUtil.getstateName(map.getState_id());
	
	productName=cityLocalServiceUtil.getproductName(map.getProduct_id());
	
	branchName=cityLocalServiceUtil.getbranchName(map.getBranch_id());
	

	System.out.println("product name====="+productName);
	System.out.println("state name====="+stateName);
	System.out.println("city name====="+ cityName);
	System.out.println("branch name====="+branchName);
	if (mappingId >= 01) 
	{
		
		System.out.print("...........Branch id.........."+mappingId);
		System.out.println("####" + map);
	
	
	}
%>
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/html/editDetails.jsp");
%>
<liferay-ui:header title="Edit BranchMapping Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitBranchProductMapping"></portlet:actionURL>

<form action="${action}" method="post">
<input type="hidden" name="mappingId" value="<%=map.getMapping_id()%>"><br />
Select Product :<select required="required" id="product" name="Selectproduct"><option value="<%=map.getProduct_id()%>"><%=productName%></option></select><br><br>
Select State :<select required="required" id="state" name="Selectstate"><option value="<%=map.getState_id()%>"><%=stateName%></option></select><br><br>
Select City :<select required="required" id="City"    name="SelectCity" ><option value="<%=map.getCity_id()%>"><%=cityName%></option></select><br><br>
Select BranchName :<select required="required" id="branchname" name="Selectbranchname"><option value="<%=map.getBranch_id()%>"><%=branchName%></option></select><br><br><br>

<input type="submit" value="Submit"/>
</form>







