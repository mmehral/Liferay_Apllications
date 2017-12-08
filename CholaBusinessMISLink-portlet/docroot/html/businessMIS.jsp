<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/html/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />

<portlet:resourceURL var="getUsers">
   <portlet:param name="<%=Constants.CMD%>" value="get_users" />
 </portlet:resourceURL>

<aui:script>
AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',function (A) {
A.io.request('<%=getUsers%>',{
dataType: 'json',
method: 'GET',
on: {
success: function() {
//continents=this.get('responseData');
//alert(continents[0].name);
new A.AutoCompleteList(
{
allowBrowserAutocomplete: 'true',
activateFirstItem: 'true',
inputNode: '#users',
resultTextLocator: 'email',
resultHighlighter:['phraseMatch'],
resultFilters:['phraseMatch'],
render: 'true',
source:this.get('responseData'),
});
}}
});                  
});
</aui:script>

 <script type="text/javascript">

	$(function() {
		function moveItems(origin, dest) {
			$(origin).find(':selected').appendTo(dest);
		}

		function moveAllItems(origin, dest) {
			$(origin).children().appendTo(dest);
		}

		$('#left').click(function() {
			moveItems('#sbTwo', '#sbOne');
		});

		$('#right').on('click', function() {
			moveItems('#sbOne', '#sbTwo');
		});

		$('#leftall').on('click', function() {
			moveAllItems('#sbTwo', '#sbOne');
		});

		$('#rightall').on('click', function() {
			moveAllItems('#sbOne', '#sbTwo');
		});
	});

	$(document)
			.ready(
					function() {

						$("#age").change(function() {
							var val = this.value;

							if (val == "lessthan") {
								$('input[name=lessthanvalue]').show();
								$('input[name=greaterthanvalue]').hide();
								$('input[name=betweenfromvalue]').hide();
								$('input[name=betweentovalue]').hide();
							}

							if (val == "all") {
								$('input[name=lessthanvalue]').hide();
								$('input[name=greaterthanvalue]').hide();
								$('input[name=betweenfromvalue]').hide();
								$('input[name=betweentovalue]').hide();
							}

							if (val == "greaterthan") {
								$('input[name=greaterthanvalue]').show();
								$('input[name=betweenfromvalue]').hide();
								$('input[name=betweentovalue]').hide();
								$('input[name=lessthanvalue]').hide();
							}

							if (val == "between") {
								$('input[name=betweenfromvalue]').show();
								$('input[name=betweentovalue]').show();
								$('input[name=lessthanvalue]').hide();
								$('input[name=greaterthanvalue]').hide();
							}
						});

						$("#submit").click(function() {
							if ($('input[name=option]:checked').length <= 0) {
								return false;
							} else {
								return true;
							}
						});

						$('#users').on(
								"keypress",
								function(e) {
									if (e.keyCode == 13) {
										var userName = $("#users").val();
										$("#sbThree").append(
												"<option value='" + userName + "'>"
														+ userName
														+ "</option>");
										$(
												"#sbThree option[value='"
														+ userName + "']")
												.prop("selected", true);
										$("#users").val('');
										return false; // prevent the button click from happening
									}
								});

						$('input[name=option]')
								.click(
										function() {
											var radioValue = $(
													"input[name='option']:checked")
													.val();
											var businessId = $(
													"#business option:selected")
													.val();
											if (radioValue) {
												
												var urls = "";
												if (radioValue == "Unit") {
													urls = "<portlet:resourceURL id='Unit'/>";
												} else if (radioValue == "Department") {
													urls = "<portlet:resourceURL id='Department'/>";
												} else if (radioValue == "Function") {
													urls = "<portlet:resourceURL id='Function'/>";
												} else if (radioValue == "Designation") {
													urls = "<portlet:resourceURL id='Designation'/>";
												}

												else if (radioValue == "Product") {
													urls = "<portlet:resourceURL id='Product'/>";
												}

												else if (radioValue == "Zone") {
													urls = "<portlet:resourceURL id='Zone'/>";
												}

												else if (radioValue == "Branch") {
													urls = "<portlet:resourceURL id='Branch'/>";
												}

												else if (radioValue == "Grade") {
													urls = "<portlet:resourceURL id='Grade'/>";
												}

												else if (radioValue == "Region") {
													urls = "<portlet:resourceURL id='Region'/>";
												}

												else if (radioValue == "Location") {
													urls = "<portlet:resourceURL id='Location'/>";
												}

												if (radioValue == "User ID") {
													if(businessId==""){
														alert("Please select company first");
														$('input[name="option"]').attr('checked', false);
														$( "#sbOne" ).empty();
														$( "#sbTwo" ).empty();
														}
													console
															.log("User ID selected");
													$( "#sbTwo" ).empty();
													$("#multipleOptions")
															.hide();
													$("#gender_age").hide();
													$("#singleOptions").show();

			/* 										$.ajax({
																url : "<portlet:resourceURL id='usersCall'/>",
																type : 'POST',
																dataType : 'json',
																success : function(
																		data) {
																	console
																			.log(JSON
																					.stringify(data));

																	var values = new Array();

																	for ( var i in data.Users) {
																		
																		values
																				.push(data.Users[i].tag);
																	}
																	$("#users")
																			.autocomplete(
																					{
																						source : values
																					});
																},

																error : function(
																		jqXHR,
																		exception) {
																	var msg = '';
																	if (jqXHR.status === 0) {
																		msg = 'Not connect.\n Verify Network.';
																	} else if (jqXHR.status == 404) {
																		msg = 'Requested page not found. [404]';
																	} else if (jqXHR.status == 500) {
																		msg = 'Internal Server Error [500].';
																	} else if (exception === 'parsererror') {
																		msg = 'Requested JSON parse failed.';
																	} else if (exception === 'timeout') {
																		msg = 'Time out error.';
																	} else if (exception === 'abort') {
																		msg = 'Ajax request aborted.';
																	} else {
																		msg = 'Uncaught Error.\n'
																				+ jqXHR.responseText;
																	}
																	console
																			.log("There was an error. Try again please! "
																					+ msg);
																}
															}); */

												} else if (radioValue == "All User") {
													if(businessId==""){
														alert("Please select company first");
														$('input[name="option"]').attr('checked', false);
														$( "#sbOne" ).empty();
														$( "#sbTwo" ).empty();
														}
													$("#multipleOptions")
															.hide();
													$( "#sbTwo" ).empty();
													$("#singleOptions").hide();
													$("#gender_age").show();
												}

												else {
													$("#multipleOptions")
															.show();
													$("#singleOptions").hide();
													$("#gender_age").show();
													if(businessId==""){
														alert("Please select company first");
														$('input[name="option"]').attr('checked', false);
														$( "#sbOne" ).empty();
														$( "#sbTwo" ).empty();
													}else{
													
													$
															.ajax({
																url : urls,
																type : 'POST',
																dataType : 'json',
																data : {
																	business : businessId
																},
																success : function(
																		data) {
																	console
																			.log(JSON
																					.stringify(data));

																	$("#sbOne")
																			.empty();
																	$("#sbTwo")
																			.empty();
																	for ( var i in data.unit) {
																		$(
																				"#sbOne")
																				.append(
																						"<option value='" + data.unit[i] + "'>"
																								+ data.unit[i]
																								+ "</option>");
																	}
																},
																error : function() {
																	console
																			.log("There was an error. Try again please! First");
																}
															});
												}

												}
											}
										});

						$
								.ajax({
									url : "<portlet:resourceURL id='serviceCall'/>",
									type : 'POST',
									dataType : 'json',
									contentType : 'application/json',
									success : function(data) {
										for ( var i in data) {
											$("#business")
													.append(
															"<option value=" + data[i].business_id + ">"
																	+ data[i].business_name
																	+ "</option>");
										}
									},
									error : function() {
										console
												.log("There was an error. Try again please!");
									}
								});

					});
	
	function clearFields(){
		
		$('input[name="option"]').attr('checked', false);
		$( "#sbOne" ).empty();
			$( "#sbTwo" ).empty();
	}
</script>
</head>
<body>

<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator")||request.isUserInRole("Business MIS Admin"))
	{
%>
	<portlet:actionURL name="save" var="saveURL" />
	<aui:form action="<%=saveURL%>" method="post" name="fm"
		enctype="multipart/form-data" id="myForm" autocomplete="off">

		<div id="parameters_007">

			Name of the Company : <select id="business" name="business" onchange="clearFields()">
			<option value="">Select Company</option>
			</select><br>
			<br> Please select one of the option below : <br> <input
				type="radio" name="option" value="Unit"> Unit
			&nbsp;&nbsp;&nbsp; <input type="radio" name="option" value="Function">
			Function &nbsp;&nbsp;&nbsp; <input type="radio" name="option"
				value="Department"> Department &nbsp;&nbsp;&nbsp; <input
				type="radio" name="option" value="Designation"> Designation
			&nbsp;&nbsp;&nbsp; <input type="radio" name="option" value="Product">
			Product &nbsp;&nbsp;&nbsp; <input type="radio" name="option"
				value="Zone"> Zone &nbsp;&nbsp;&nbsp; <input type="radio"
				name="option" value="Branch"> Branch &nbsp;&nbsp;&nbsp; <input
				type="radio" name="option" value="Grade"> Grade
			&nbsp;&nbsp;&nbsp; <input type="radio" name="option" value="Region">
			Region &nbsp;&nbsp;&nbsp; <input type="radio" name="option"
				value="Location"> Location &nbsp;&nbsp;&nbsp; <input
				type="radio" name="option" value="User ID"> User ID
			&nbsp;&nbsp;&nbsp; <input type="radio" name="option" value="All User">All
			User<br>
			<br>
			<!-- <label for="val"> Name : </label> <input type="text" id="val" name="param" style="display: none"> <input name="add" type="button" id="add" value="Add"> <br> -->
			<!-- Cutom Notification Text : <input type="text" name="notification"> (Non - Mandatory)<br> -->
			<div id="multipleOptions">
				<select id="sbOne" multiple="multiple"
					style="height: 250px; width: 350px;">
				</select> <input type="button" id="left" value="leftarrow" /> <input
					type="button" id="right" value="rightarrow" /> <input type="button"
					id="leftall" value="leftall" /> <input type="button" id="rightall"
					value="rightall" /> <select id="sbTwo" multiple="multiple"
					name="secondList" style="height: 250px; width: 350px;">
				</select> <br>
				<br>
			</div>

			<div id="gender_age">
				Gender : <input type="radio" name="gender" value="M">
				Male &nbsp;&nbsp;&nbsp; <input type="radio" name="gender"
					value="F"> Female &nbsp;&nbsp;&nbsp; <input
					type="radio" name="gender" value="ALL" checked> Both <br>

				Age Group : <select name="age" id="age">
					<option value="all">All</option>
					<option value="lessthan">Less than</option>
					<option value="greaterthan">Greater than</option>
					<option value="between">Between</option>
				</select> <input type="text" name="lessthanvalue" placeholder="Less Than"
					style="display: none"> <input type="text"
					name="greaterthanvalue" placeholder="Greater Than"
					style="display: none"> <input type="text"
					name="betweenfromvalue" placeholder="From" style="display: none">
				<input type="text" name="betweentovalue" placeholder="To"
					style="display: none"> <br>
			</div>
			<div id="singleOptions">
				User Name : <input type="text" name="users" id="users"
					placeholder="Type user name to autofill"> <br>
				<br> Users : <select id="sbThree" name="thirdList"
					multiple="multiple" style="height: 250px; width: 350px;"
					style="display: none"></select><br>
				<br>
			</div>

		</div>


		<div id="misdiv">
				<input type="hidden" id="productlist"
			name="<portlet:namespace/>contestlist" value="0">
			<aui:input type="textarea" name="buinesstitle" id="buinesstitle" label="Buisness Title">
				<aui:validator name="required"></aui:validator>
				 <aui:validator name="maxLength">100</aui:validator>
				 
			</aui:input>

			<aui:input type="textarea" name="buinessDesc" id="buinessDesc"
				label="Buisness Description">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="maxLength">200</aui:validator>
			</aui:input>

<%-- 	<aui:input type="textarea" name="buinessLink" id="buinessLink"
				label="Buisness Link">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="maxLength">200</aui:validator>
			</aui:input> --%>
			
			<!--Code for uploading html file  -->
				<aui:input type="file" name="uploadedFile" label="Select a html file to upload">
			<aui:validator name="required"></aui:validator>
			<aui:validator name="acceptFiles">'html'</aui:validator>
			</aui:input>

		</div>
	
		<aui:button-row>
			<aui:button type="submit" value="Submit" onClick="return getvalidation()" />
		</aui:button-row>
	</aui:form>


<script>
		function getvalidation() {
			var radioValue=false;
			var company=document.getElementById("business").value;
			var radioOption=document.getElementsByName("option");
			var firstList=document.getElementById("sbTwo").value;
			var businessTitle=document.getElementById("<portlet:namespace/>buinesstitle").value;
			var businessDescription=document.getElementById("<portlet:namespace/>buinessDesc").value;
			var businessLink=document.getElementById("<portlet:namespace/>buinessLink").value;

			
			var i = 0;
		    while (!radioValue && i < radioOption.length) {
		        if (radioOption[i].checked)
		        	radioValue = true;
		        i++;        
		    }
			
			if (company==null || company==""){  
				  alert("Please Select Company");  
				  return false;  
				}
	
		    else if(!radioValue){
		    	alert("Please select an option");
		    	 return false;  
		    }
			
		    else if($('#sbTwo').is(':visible')){
		    	
		    	if(firstList==null||firstList==""){
		    		
		    		    	alert("Please select FirstList");
		    	 return false;  
		    }
		    }
		    else if($('#sbThree').is(':visible')){
		    	
		    	if(seconList==null||seconList==""){
		    		alert("Please select secondList");
			    	 return false;  
		    	}
		    	
		    }
		    
		    else if(businessTitle==null||businessTitle==""){
		    	alert("Please enter Title");
		    return false
		    }
			
		    else if(businessDescription==null||businessDescription==""){
		    	alert("Please Enter Description");
		    return false
		    }
			
		    else if(businessLink==null||businessLink==""){
		    	alert("Please Enter Description Link");
		    return false
		    }

		}

	</script>
<%
}
}
%>
</body>
</html>