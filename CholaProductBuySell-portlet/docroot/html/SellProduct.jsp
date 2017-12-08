<%@page import="javax.portlet.PortletURL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
	<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.MultiFile.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/addrow.js"></script>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/validation.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/validationEngine.jquery.css"
	type="text/css" />
<script
	src="<%=request.getContextPath()%>/js/jquery.validationEngine-en.js"
	type="text/javascript" charset="utf-8"></script>
<script
	src="<%=request.getContextPath()%>/js/jquery.validationEngine.js"
	type="text/javascript" charset="utf-8"></script>
<link href="<%=request.getContextPath()%>/css/jquery-ui.css"
	rel="stylesheet" />
<script type="text/javascript">
	$(document).ready(function() {
		
		document.getElementById("contesttable[0].srno").value = 1;

	});
</script>
<script type="text/javascript">
function productFormValidation(that){
	var productTitle=document.getElementById("productTitle").value;
	var productDescription=document.getElementById("productDescription").value;
	var productCategory=document.getElementById("productCategory").value;
	var productLocation=document.getElementById('productLocation').value;
	
	
	if (productTitle==null || productTitle==""){  
		  alert("Please Select Product Title");  
		  return false;  
		}
	else if(productDescription==null || productDescription==""){
		alert("Please Select Product Description");  
		 return false;  
		}
	else if(productCategory==null || productCategory==""){
		alert("Please Select Product Category");  
		 return false;  
		}
	else if(productLocation==null || productLocation==""){
		alert("Please Select Product Location");  
		 return false;  
		}
	
		var chequeRows = document.getElementById("contesttable").rows.length;
		
		for (var i = 0; i < chequeRows - 1; i++) {
			var upload = document.getElementById("contesttable[" + i
					+ "].upload").value;
			if (upload == "") {
				alert("Please Select File");
				return false;
			}
		} 
	return true;

}
</script>
<script type="text/javascript">
$(document).ready(function(){
	
 	$.ajax({
		url : '<portlet:resourceURL id="getLocationList"/>',
		type : 'POST',
		dataType : 'json',
		<%--data:{scName: '<%=screenName%>',trainingId:id}, --%>
		success : function(data) {
			//alert(JSON.stringify(data));
			
			for ( var i in data) {
				$("#<portlet:namespace/>productLocation").append("<option value='"+data[i].id+"''>"+data[i].name+"</option>");
				}	
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});	
	
	
	
 	$.ajax({
		url : '<portlet:resourceURL id="productCategoryList"/>',
		type : 'POST',
		dataType : 'json',
		<%--data:{scName: '<%=screenName%>',trainingId:id}, --%>
		success : function(data) {
			//alert(JSON.stringify(data));
			
			for ( var i in data) {
				$("#<portlet:namespace/>productCategory").append("<option value='"+data[i].id+"''>"+data[i].name+"</option>");
				}	
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});	
});
</script>
</head>
<body>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Back"
	backLabel="Back" backURL="<%=back%>" />
<%PortletURL addURL=renderResponse.createActionURL();
addURL.setParameter(actionRequest.ACTION_NAME, "buySellProAction");
%>

<aui:form action="<%=addURL.toString()%>" method="POST" enctype="multipart/form-data">

<aui:input type="text" name="productTitle" id="productTitle" label="Product Title">
<aui:validator name="required" errorMessage="Please enter product title"></aui:validator>
</aui:input>
 <aui:input type="text" name="productDescription" id="productDescription" label="Product Description">
<aui:validator name="required" errorMessage="Please enter product Description"></aui:validator>
</aui:input>
<aui:input type="text" name="contactNumber" id="contactNumber" label="Contact Number">
<aui:validator name="required" errorMessage="Please enter contact number"></aui:validator>
<aui:validator name="number" errorMessage="Please enter only digits"></aui:validator>
</aui:input>
<aui:input type="text" name="askingPrice" id="askingPrice" label="Asking Price">
<aui:validator name="required" errorMessage="Please enter product price"></aui:validator>
<aui:validator name="number" errorMessage="Please enter only digits"></aui:validator>
</aui:input>

<aui:select id="productCategory" name="productCategory" required="true">
<aui:option selected="true" >Select Category</aui:option>
</aui:select>
<aui:select id="productLocation" name="productLocation" required="true">
<aui:option selected="true" >Select Location</aui:option>
</aui:select>

	<input type="hidden" id="productlist"
			name="<portlet:namespace/>contestlist" value="0">
<table width="50%" border="1" id="contesttable" class="contesttable"
				style="border: 1px solid #000; width: 100%;">
				<thead style="border: 1px solid #000;">
					<tr style="border: 1px solid #000;">
						<td nowrap="nowrap" style="border: 1px solid #000;">Sr No</td>
						<td style="border: 1px solid #000;">Select Documents</td>
						<td style="border: 1px solid #000;"><input type="button"
							value="Add" onclick="addNewRow('contesttable')" /></td>
					</tr>

				</thead>
				<tbody style="border: 1px solid #000;">
					<tr style="border: 1px solid #000;">
						<td style="border: 1px solid #000;"><input type="text"
							id="contesttable[0].srno" name="contesttable[0].srno"
							readonly="readonly" style="max-width: 34px;" size="25"
							class="validate[required]" maxlength="3" /></td>

						<td style="border: 1px solid #000;"><input type="file"
							id="contesttable[0].upload" name="contesttable[0].upload"
							class="validate[required]" onchange="return imageupload(this)" /></td>


						<td style="border: 1px solid #000;"><input type="button"
							name="del[1]" id="del1[1]" value="Delete"
							onclick="removeRow(this,'contesttable')" /></td>
					</tr>


				</tbody>

			</table>

<aui:button type="submit" value="Add Product"></aui:button>
</aui:form>


<%-- <form action="<%=addURL.toString()%>" method="POST" enctype="multipart/form-data" >

Product title : <input type="text" id="productTitle"  name="productTitle"></input><br>
Product Description : <input type="text" id="productDescription"  name="productDescription"></input><br>
Contact Number : <input type="text" id="productDescription"  name="productDescription"></input><br>
Asking Price: <input type="text" id="productDescription"  name="productDescription"></input><br>
	<input type="hidden" id="productlist"
			name="<portlet:namespace/>contestlist" value="0">
<table width="50%" border="1" id="contesttable" class="contesttable"
				style="border: 1px solid #000; width: 100%;">
				<thead style="border: 1px solid #000;">
					<tr style="border: 1px solid #000;">
						<td nowrap="nowrap" style="border: 1px solid #000;">Sr No</td>
						<td style="border: 1px solid #000;">Select Documents</td>
						<td style="border: 1px solid #000;"><input type="button"
							value="Add" onclick="addNewRow('contesttable')" /></td>
					</tr>

				</thead>
				<tbody style="border: 1px solid #000;">
					<tr style="border: 1px solid #000;">
						<td style="border: 1px solid #000;"><input type="text"
							id="contesttable[0].srno" name="contesttable[0].srno"
							readonly="readonly" style="max-width: 34px;" size="25"
							class="validate[required]" maxlength="3" /></td>

						<td style="border: 1px solid #000;"><input type="file"
							id="contesttable[0].upload" name="contesttable[0].upload"
							class="validate[required]" onchange="return imageupload(this)" /></td>


						<td style="border: 1px solid #000;"><input type="button"
							name="del[1]" id="del1[1]" value="Delete"
							onclick="removeRow(this,'contesttable')" /></td>
					</tr>


				</tbody>

			</table>
Select Category : <select id="productCategory" name="productCategory">
<aui:option selected="true" >Select Category</aui:option>
</select><br>


Select Location : <select id="productLocation" name="productLocation">
<aui:option selected="true" >Select Location</aui:option>
</select>

<input type="submit" value="Submit Add" onClick="return productFormValidation(this)"></input>
</form> --%>

</body>
</html>