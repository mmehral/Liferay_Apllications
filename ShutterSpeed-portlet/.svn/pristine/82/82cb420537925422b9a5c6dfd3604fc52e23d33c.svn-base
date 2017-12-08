 <%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<html>
<head>
	<%-- <link href="<%=request.getContextPath()%>/js/jquery-ui.css" rel="stylesheet">
<script src="<%=request.getContextPath()%>/js/jquery-1.10.2.js"></script>

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
	rel="stylesheet" /> --%>
	
<script type="text/javascript">

/* $(document).ready(function () {
    $('#checkboxSOPshowhide').change(function () {
        if (!this.checked) 
        //  ^
           $('#sopdiv').fadeIn('slow');
        else 
            $('#sopdiv').fadeOut('slow');
    });
}); */



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
							console.log(val);

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
								console.log("Please select an option");
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
										console.log("Enter pressed");
										console.log(userName);
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

											console.log("Business ID : "
													+ businessId);
											if (radioValue) {
												console.log("Your are a - "
														+ radioValue);
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
													console
															.log("User ID selected");

													$("#multipleOptions")
															.hide();
													$("#gender_age").hide();
													$("#sbTwo").empty();
													$("#singleOptions").show();

													$
															.ajax({
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
																		console
																				.log(data.Users[i].tag);
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
															});

												} else if (radioValue == "All User") {
													$("#multipleOptions")
															.hide();
													$("#sbTwo").empty();
													$("#singleOptions").hide();
													$("#gender_age").show();
												}

												else {
													$("#multipleOptions")
															.show();
													$("#singleOptions").hide();
													$("#gender_age").show();
													if(businessId==""){
														alert("Please select company first")
													}else{
													$.ajax({
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
										console.log(JSON.stringify(data));
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

						/*  $("#eventfrom").datepicker({
						    dateFormat: "dd-M-yy",
						     minDate: 0,
						    onSelect: function () {
						        var dt2 = $('#eventto');
						        var startDate = $(this).datepicker('getDate');
						        //add 30 days to selected date
						        startDate.setDate(startDate.getDate() + 30);
						        var minDate = $(this).datepicker('getDate');
						        //minDate of dt2 datepicker = dt1 selected day
						        dt2.datepicker('setDate', minDate);
						        //sets dt2 maxDate to the last day of 30 days window
						        dt2.datepicker('option', 'maxDate', startDate);
						        //first day which can be selected in dt2 is selected date in dt1
						        dt2.datepicker('option', 'minDate', minDate);
						        //same for dt1
						        $(this).datepicker('option', 'minDate', minDate);
						    } 
						});
						$('#eventto').datepicker({
						    dateFormat: "dd-M-yy"
						});  */

					});
</script>


	
</head>
<body>
 <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 
<portlet:actionURL name="save" var="saveURL" />
	<aui:form action="<%=saveURL%>" method="post" name="fm"
		enctype="multipart/form-data" id="myForm">

		<div id="parameters_007">

			Name of the Company : <select id=business name="business">
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

		<div id="sopdiv">
				<input type="hidden" id="productlist"
			name="<portlet:namespace/>contestlist" value="0">
			<aui:input type="text" name="albumName" label="Album Name">
		 <aui:validator name="required"></aui:validator>   
		 <aui:validator name="maxLength">100</aui:validator>  
		</aui:input>
		
		<aui:input type="text" name="albumDesc" label="Album Description">
		 <aui:validator name="required"></aui:validator>   
		 <aui:validator name="maxLength">500</aui:validator>    
		</aui:input>
	
		<aui:input type="file" multiple="true" name="uploadedFile" label="Select Images to upload">
			<aui:validator name="required"></aui:validator>
			<aui:validator name="acceptFiles">'jpg,png,tif,gif'</aui:validator>
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
			var upload = document.getElementById("contesttable").value;

			
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
			
			//alert("jiii");
	/* 		var chequeRows = document.getElementById("contesttable").rows.length;
			//alert(chequeRows);
			for (var i = 0; i < chequeRows - 1; i++) {
				var upload = document.getElementById("contesttable[" + i
						+ "].upload").value;
				if (upload == "") {
					alert("Please Select File");
					return false;
				}
			} */

		}

		//receipt2upload added 
		function imageupload(that) {
			var id = that.id;
			var imgpath = document.getElementById(id).value;
			if (imgpath == "") {
				//alert("upload your word file");
				//document.file.word.focus();
				//return false;
			} else {
				// code to get File Extension..

				var arr1 = new Array;
				arr1 = imgpath.split("\\");
				var len = arr1.length;
				var img1 = arr1[len - 1];
				var filext = img1.substring(img1.lastIndexOf(".") + 1);
				// Checking Extension

				/* if (filext == "jpg" || filext == "Jpeg" || filext == "JPG"
						|| filext == "JPEG" || filext == "png" || filext == "PNG"
						|| filext == "pdf" || filext == "xls" || filext == "doc") { */
					var fi = document.getElementById(id);
					//alert(fi.files.length);
					var fsize = fi.files.item(0).size;

					/* if(fsize > 100000){
					 alert("Document size should not be more than 100 KB");
					 document.getElementById(id).value="";
					 return false;
					 } */
					//alert("File has been upload correctly");
					//return false;
				/* } else {
					alert("Invalid File Format,Please select pdf /jpg / png file format");
					//document.form.word.focus();
					document.getElementById(id).value = "";
					return false;
				} */
			}
		}
	</script>


</body>
</html>
 