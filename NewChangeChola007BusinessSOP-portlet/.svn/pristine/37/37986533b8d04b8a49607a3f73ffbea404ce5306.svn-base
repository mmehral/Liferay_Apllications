<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
 
 
 <portlet:defineObjects/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <link href = "<%=request.getContextPath()%>/js/jquery-ui.css"
         rel = "stylesheet">
      <script src = "<%=request.getContextPath()%>/js/jquery-1.10.2.js"></script>
      <script src = "<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

		<script type="text/javascript">

$(function () { function moveItems(origin, dest) {
    $(origin).find(':selected').appendTo(dest);
}
 
function moveAllItems(origin, dest) {
    $(origin).children().appendTo(dest);
}
 
$('#left').click(function () {
    moveItems('#sbTwo', '#sbOne');
});
 
$('#right').on('click', function () {
    moveItems('#sbOne', '#sbTwo');
});
 
$('#leftall').on('click', function () {
    moveAllItems('#sbTwo', '#sbOne');
});
 
$('#rightall').on('click', function () {
    moveAllItems('#sbOne', '#sbTwo');
});
});

$(document).ready(function() {
	
	$("#age").change(function () {
        var val = this.value;
        console.log(val);
        
        if(val=="lessthan")
        	{
        	$('input[name=lessthanvalue]').show();
        	$('input[name=greaterthanvalue]').hide();
        	$('input[name=betweenfromvalue]').hide();
        	$('input[name=betweentovalue]').hide();
        	}
        
	        if(val=="all")
        	{
        	$('input[name=lessthanvalue]').hide();
        	$('input[name=greaterthanvalue]').hide();
        	$('input[name=betweenfromvalue]').hide();
        	$('input[name=betweentovalue]').hide();
        	}
	        
	        if(val=="greaterthan")
        	{
        	$('input[name=greaterthanvalue]').show();
        	$('input[name=betweenfromvalue]').hide();
        	$('input[name=betweentovalue]').hide();
        	$('input[name=lessthanvalue]').hide();
        	}
	        
	        if(val=="between")
        	{
        	$('input[name=betweenfromvalue]').show();
        	$('input[name=betweentovalue]').show();
        	$('input[name=lessthanvalue]').hide();
        	$('input[name=greaterthanvalue]').hide();
        	}
    });
	
	$("#submit").click(function(){
	  if($('input[name=option]:checked').length <= 0)
	  {
		  console.log("Please select an option");
		  return false;
	    }
	    else
	    	{
	    	return true;
	  		}
	});
	

		$('#users').on("keypress", function(e) {
	        if (e.keyCode == 13) {
	        	var userName = $("#users").val();
	            console.log("Enter pressed");
	            console.log(userName);
	    		$("#sbThree").append("<option value='" + userName + "'>" + userName + "</option>");
	    		$("#sbThree option[value='" + userName + "']").prop("selected", true);
	    		$("#users").val('');
	            return false; // prevent the button click from happening
	        }
	});
	
	$('input[name=option]').click(function(){
          var radioValue = $("input[name='option']:checked").val();
          var businessId = $("#business option:selected").val();
          
          console.log("Business ID : "+businessId);
          if(radioValue){
              console.log("Your are a - " + radioValue);
              var urls="";
          	if(radioValue=="Unit"){
                urls = "<portlet:resourceURL id='Unit'/>";
          	}
          	else if(radioValue=="Department")
          		{
          		urls = "<portlet:resourceURL id='Department'/>";
          		}
          	else if(radioValue=="Function")
      		{
          		urls = "<portlet:resourceURL id='Function'/>";
      		}
          	else if(radioValue=="Designation")
      		{
          		urls = "<portlet:resourceURL id='Designation'/>";
      		}
          	
        	else if(radioValue=="Product")
      		{
          		urls = "<portlet:resourceURL id='Product'/>";
      		}
          	
          	else if(radioValue=="Zone")
      		{
          		urls = "<portlet:resourceURL id='Zone'/>";
      		}
          	
          	else if(radioValue=="Branch")
      		{
          		urls = "<portlet:resourceURL id='Branch'/>";
      		}
          	
          	else if(radioValue=="Grade")
      		{
          		urls = "<portlet:resourceURL id='Grade'/>";
      		}
          	
          	else if(radioValue=="Region")
      		{
          		urls = "<portlet:resourceURL id='Region'/>";
      		}
          	
          	else if(radioValue=="Location")
      		{
          		urls = "<portlet:resourceURL id='Location'/>";
      		}
             
             
              
              if(radioValue=="User ID")
        		{
            	  console.log("User ID selected");
           
            	   $( "#multipleOptions" ).hide();
            	   $("#gender_age").hide();
            	   $( "#sbTwo" ).empty();
        			$( "#singleOptions").show();
        			
            		 $.ajax({
                   		url : "<portlet:resourceURL id='usersCall'/>",
                   		type : 'POST',
                   		dataType : 'json',
                   		success : function(data) {
                   			console.log(JSON.stringify(data));

                   			var values = new Array();
		
		                   	  for (var i in data.Users) 
		                   	   {
		                   	      console.log(data.Users[i].tag);
		                   	      values.push(data.Users[i].tag);
		                   	    }
		                   	  $( "#users" ).autocomplete({
		                   	      source: values
		                   	    }); 
                   		},
                   		
                   			error: function (jqXHR, exception) {
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
                   		          msg = 'Uncaught Error.\n' + jqXHR.responseText;
                   		      }
                   			console.log("There was an error. Try again please! "+msg);
                   		}
                   	}); 
                       
        		}
              else if(radioValue=="All User"){
            	  $( "#multipleOptions" ).hide();
            	  $( "#sbTwo" ).empty();
      			$( "#singleOptions").hide();
      			 $("#gender_age").show();
              }
              
              else{
        			  $( "#multipleOptions" ).show();
          			$( "#singleOptions").hide();
          			 $("#gender_age").show();
        			 $.ajax({
        	          		url : urls,
        	          		type : 'POST',
        	          		dataType : 'json',
        	          		data :{business : businessId},
        	          		success : function(data) {
        	          			console.log(JSON.stringify(data));
        	          
        	          			$( "#sbOne" ).empty();
        	          			$( "#sbTwo" ).empty();
        	          			for(var i in data.unit)
        	          			{
        	          			$("#sbOne").append("<option value='" + data.unit[i] + "'>" + data.unit[i] + "</option>");
        	          			}
        	          		},
        	          		error : function() {
        	          			console.log("There was an error. Try again please! First");
        	          		}
        	          	}); 
        	              
        		}
          }
      });
	  
	$.ajax({
		url : "<portlet:resourceURL id='serviceCall'/>",
		type : 'POST',
		dataType : 'json',
		contentType : 'application/json',
		success : function(data) {
			console.log(JSON.stringify(data));
			 for(var i in data)
			{
			$("#business").append("<option value=" + data[i].business_id + ">" + data[i].business_name + "</option>");
			} 
		},
		error : function() {
			console.log("There was an error. Try again please!");
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
<%String uniqueId=request.getParameter("uniqueId"); %>
<%
PortletURL addURL=renderResponse.createActionURL();
addURL.setParameter(actionRequest.ACTION_NAME, "getIntendedUSerList");
%>

<form  action="<%=addURL.toString()%>" method="post" name="fm">
<input type="hidden" name="uniqueId" id="uniqueId" value='<%=uniqueId%>'/>
Name of the Company : 
<select id=business name="business">
</select><br><br>
Please select one of the option below : <br>
 <input type="radio" name="option" value="Unit"> Unit &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="Function" > Function &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="Department" > Department &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="Designation" > Designation &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="Product" > Product &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="Zone" > Zone &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="Branch" > Branch &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="Grade" > Grade &nbsp;&nbsp;&nbsp;
  <input type="radio" name="option" value="Region" > Region &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="Location" > Location &nbsp;&nbsp;&nbsp;
 <input type="radio" name="option" value="User ID" > User ID &nbsp;&nbsp;&nbsp;
  <input type="radio" name="option" value="All User" >All User<br><br>
<!-- <label for="val"> Name : </label> <input type="text" id="val" name="param" style="display: none"> <input name="add" type="button" id="add" value="Add"> <br> -->
<!-- Cutom Notification Text : <input type="text" name="notification"> (Non - Mandatory)<br> -->
<div id="multipleOptions">
 <select id="sbOne" multiple="multiple" style="height: 250px;
    width: 350px;">
    </select>
  <input type="button" id="left" value="leftarrow" />
    <input type="button" id="right" value="rightarrow"/>
    <input type="button" id="leftall" value="leftall" />
    <input type="button" id="rightall" value="rightall"/>
    <select id="sbTwo" multiple="multiple" name="secondList" style="height: 250px;
    width: 350px;">
    </select>
 
   <br><br>
   </div>
   
   <div id="gender_age">
 Gender : <input type="radio" name="gender" value="male"> Male &nbsp;&nbsp;&nbsp;
  <input type="radio" name="gender" value="female"> Female &nbsp;&nbsp;&nbsp;
  <input type="radio" name="gender" value="both" checked> Both  <br>
 
 Age Group : <select name="age" id="age">
  <option value="all">All</option>
  <option value="lessthan">Less than</option>
  <option value="greaterthan">Greater than</option>
  <option value="between">Between</option>
</select>
<input type="text" name="lessthanvalue" placeholder="Less Than" style="display: none">
<input type="text" name="greaterthanvalue" placeholder="Greater Than" style="display: none">
<input type="text" name="betweenfromvalue" placeholder="From" style="display: none">
<input type="text" name="betweentovalue" placeholder="To" style="display: none">
<br>
</div>
<div id="singleOptions">
User Name : <input type="text" name="users" id="users" placeholder="Type user name to autofill" > <br><br>
Users : <select id="sbThree" name="thirdList" multiple="multiple" style="height: 250px;
    width: 350px;" style="display: none"></select><br><br>
    </div>
<!-- Event Details : <textarea rows="4" cols="50" name="eventdetails"></textarea><br><br>

Event From : <input type="text"  name="eventfrom"><br>
Event To : <input type="text"   name="eventto"><br><br> -->

 <input type="submit" id="submit" value="Submit">
 </form>


</body>
</html>