<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
		
	  <!--    <script src="http://code.jquery.com/jquery-1.9.1.js"></script> -->
  <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/> 
<!-- <script src="http://textextjs.com/js/doc.js" type="text/javascript" charset="utf-8"></script>
 -->
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/textext.core.css" type="text/css" />
		<link rel="stylesheet" href="http://textextjs.com//textext/css/textext.plugin.tags.css" type="text/css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/textext.plugin.autocomplete.css" type="text/css" />
		<!-- <link rel="stylesheet" href="http://textextjs.com//textext/css/textext.plugin.focus.css" type="text/css" />
		<link rel="stylesheet" href="http://textextjs.com//textext/css/textext.plugin.prompt.css" type="text/css" />
		<link rel="stylesheet" href="http://textextjs.com//textext/css/textext.plugin.arrow.css" type="text/css" />
		 --><script src="<%=request.getContextPath()%>/js/textext.core.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=request.getContextPath()%>/js/textext.plugin.tags.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=request.getContextPath()%>/js/textext.plugin.autocomplete.js" type="text/javascript" charset="utf-8"></script>
		<script src="<%=request.getContextPath()%>/js/textext.plugin.suggestions.js" type="text/javascript" charset="utf-8"></script>
		<!-- <script src="http://textextjs.com//textext/js/textext.plugin.filter.js" type="text/javascript" charset="utf-8"></script>
		<script src="http://textextjs.com//textext/js/textext.plugin.focus.js" type="text/javascript" charset="utf-8"></script>
		<script src="http://textextjs.com//textext/js/textext.plugin.prompt.js" type="text/javascript" charset="utf-8"></script>
		<script src="http://textextjs.com//textext/js/textext.plugin.ajax.js" type="text/javascript" charset="utf-8"></script>
		<script src="http://textextjs.com//textext/js/textext.plugin.arrow.js" type="text/javascript" charset="utf-8"></script>
		 -->
	
<script type="text/javascript">
$(document).ready(function() {
	
	var values;
	$.ajax({
		url : "<portlet:resourceURL id='Users'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			console.log(JSON.stringify(data));
			values = new Array();
			for(var i in data.Users) {
			console.log("Users : "+data.Users[i]);
			values.push(data.Users[i]);
			}
			
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});

	
$('#userid')
.textext({
	plugins : 'tags autocomplete'
})
.bind('getSuggestions', function(e, data)
{
		var list = values,
		textext = $(e.target).textext()[0],
		query = (data ? data.query : '') || ''
		;

	$(this).trigger(
		'setSuggestions',
		{ result : textext.itemManager().filter(list, query) }
	);
})
;
});

$(document).ready(function() {
	/* $.ajax({
		url : "<portlet:resourceURL id='Location'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			console.log(JSON.stringify(data));
			for(var i in data.location) {
				console.log(data.location[i]);
				$("#location").append("<option value=" + data.location[i] + ">" + data.location[i] + "</option>");
			}
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	}); */
	
	var values;
	$.ajax({
		url : "<portlet:resourceURL id='Location'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			console.log(JSON.stringify(data));
			values = new Array();
			for(var i in data.location) {
			console.log("Location : "+data.location[i]);
			values.push(data.location[i]);
			}
			
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});

	
$('#location')
.textext({
	plugins : 'tags autocomplete'
})
.bind('getSuggestions', function(e, data)
{
		var list = values,
		textext = $(e.target).textext()[0],
		query = (data ? data.query : '') || ''
		;

	$(this).trigger(
		'setSuggestions',
		{ result : textext.itemManager().filter(list, query) }
	);
})
;

	
	/* $("#location").change(function() {
		$('#dept').empty();
		location = $(this).val();
		console.log("location : "+$(this).val());
	$.ajax({
		url : "<portlet:resourceURL id='Department'/>",
		type : 'POST',
		dataType : 'json',
		data : { location : location},
		success : function(data) {
			console.log(JSON.stringify(data));
			for(var i in data.department) {
				console.log(data.department[i]);
				$("#dept").append("<option value='all'>All</option>");
				$("#dept").append("<option value=" + data.department[i] + ">" + data.department[i] + "</option>");
			}
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
	}); */
	var location ;
	$.ajax({
		url : "<portlet:resourceURL id='Department'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			console.log(JSON.stringify(data));
			location = new Array();
			for(var i in data.department) {
			console.log("department : "+data.department[i]);
			location.push(data.department[i]);
			}
			
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});

	
$('#dept')
.textext({
	plugins : 'tags autocomplete'
})
.bind('getSuggestions', function(e, data)
{
		var list = location,
		textext = $(e.target).textext()[0],
		query = (data ? data.query : '') || ''
		;

	$(this).trigger(
		'setSuggestions',
		{ result : textext.itemManager().filter(list, query) }
	);
})
;
	
	/* $("#dept").change(function() {
		$('#subdept').empty();
		dept = $(this).val();
		console.log("dept : "+$(this).val());
	$.ajax({
		url : "<portlet:resourceURL id='SubDepartment'/>",
		type : 'POST',
		dataType : 'json',
		data : { location : location , department : dept},
		success : function(data) {
			console.log(JSON.stringify(data));
			for(var i in data.subdepartment) {
				console.log(data.subdepartment[i]);
				$("#subdept").append("<option value='all'>All</option>");
				$("#subdept").append("<option value=" + data.subdepartment[i] + ">" + data.subdepartment[i] + "</option>");
			}
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
	}); */
	var dept ;
	$.ajax({
		url : "<portlet:resourceURL id='SubDepartment'/>",
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			console.log(JSON.stringify(data));
			dept = new Array();
			for(var i in data.subdepartment) {
			console.log("subdepartment : "+data.subdepartment[i]);
			dept.push(data.subdepartment[i]);
			}
			
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});

	
$('#subdept')
.textext({
	plugins : 'tags autocomplete'
})
.bind('getSuggestions', function(e, data)
{
		var list = dept,
		textext = $(e.target).textext()[0],
		query = (data ? data.query : '') || ''
		;

	$(this).trigger(
		'setSuggestions',
		{ result : textext.itemManager().filter(list, query) }
	);
})
;

$('#grade')
.textext({
plugins : 'tags autocomplete'
})
.bind('getSuggestions', function(e, data)
{
	var list =  ['M1','M2','M3','M4'],
	textext = $(e.target).textext()[0],
	query = (data ? data.query : '') || ''
	;

$(this).trigger(
	'setSuggestions',
	{ result : textext.itemManager().filter(list, query) }
);
})
;


$('#companyname')
.textext({
plugins : 'tags autocomplete'
})
.bind('getSuggestions', function(e, data)
{
	var list =  ['CHOLA','CLOVER','LIFERAY','MYSQL'],
	textext = $(e.target).textext()[0],
	query = (data ? data.query : '') || ''
	;

$(this).trigger(
	'setSuggestions',
	{ result : textext.itemManager().filter(list, query) }
);
})
;


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
});
</script>


  <script>
  $(document).ready(function () {
  $("#eventfrom").datepicker({
      dateFormat: "dd-M-yy",
      minDate: 0,
      onSelect: function (date) {
          var dt2 = $('#eventto');
          var startDate = $(this).datepicker('getDate');
          var minDate = $(this).datepicker('getDate');
          dt2.datepicker('setDate', minDate);
          startDate.setDate(startDate.getDate() + 30);
          //sets dt2 maxDate to the last day of 30 days window
          dt2.datepicker('option', 'maxDate', startDate);
          dt2.datepicker('option', 'minDate', minDate);
          $(this).datepicker('option', 'minDate', minDate);
      }
  });
  $('#eventto').datepicker({
      dateFormat: "dd-M-yy"
  });
  });
  </script>
</head>

 <%
PortletURL addURL=renderResponse.createActionURL();
addURL.setParameter(actionRequest.ACTION_NAME, "addEventAction");
%> 
<form action="<%=addURL.toString() %>" method="post">
<table>

<tr>
<td>Location/Office/Branch</td>
<td><!-- <input type="text" name="location"/> -->
<!-- <select name="location" id="location">
  <option value="all">All</option>
</select> -->
<textarea id="location" name="location" class="example" rows="1" cols="70"></textarea>
</td>
</tr>
<tr>
<td>Department</td>
<td><!-- <input type="text" name="dept"/> -->
<!-- <select name="dept" id="dept">
  <option value="all">All</option>
</select> -->
<textarea id="dept" name="dept" class="example" rows="1" cols="70"></textarea></td>
</tr>
<tr>
<td>Sub Department</td>
<td><!-- <input type="text" name="subdept"> -->
<!-- <select name="subdept" id="subdept">
  <option value="all">All</option>
</select> --><textarea id="subdept" name="subdept" class="example" rows="1" cols="70"></textarea>
</td>
</tr>
<tr>
<tr>
<td>Gender</td>
<td><select name="gender">
	<option value="">None</option>
  <option value="male,female">Both</option>
  <option value="male">Male</option>
  <option value="female">Female</option>
  </select>
  <!-- <input type="radio" name="gender" value="Male" checked="checked">&nbsp;&nbsp;Male
  <input type="radio" name="gender" value="Female" >&nbsp;&nbsp;Female -->
  </td>
</tr>
<tr>
<td>Grade</td>
<td><!-- <input type="text" name="grade"> -->
<!-- <select name="grade" id="grade">
  <option value="all">All</option>
  <option value="m0">M1</option>
  <option value="m1">M2</option>
  <option value="m2">M3</option>
</select> --><textarea id="grade" name="grade" class="example" rows="1" cols="70"></textarea></td>
</tr>
<tr>
<td>Age</td>
<td><select name="age" id="age">
  <option value="">None</option>
  <option value="all">All</option>
  <option value="lessthan">Less than</option>
  <option value="greaterthan">Greater than</option>
  <option value="between">Between</option>
</select>
<input type="text" name="lessthanvalue" placeholder="Less Than" style="display: none">
<input type="text" name="greaterthanvalue" placeholder="Greater Than" style="display: none">
<input type="text" name="betweenfromvalue" placeholder="From" style="display: none">
<input type="text" name="betweentovalue" placeholder="To" style="display: none">
</td>
</tr>
<tr>
<td>Name of the Company</td>
<td><!-- <input type="text" name="companyname"> -->
<!-- <select name="companyname" id="companyname">
  <option value="all">All</option>
  <option value="clover">Clover</option>
  <option value="chola">Chola</option>
  <option value="microsoft">Microsoft</option>
</select> --><textarea id="companyname" name="companyname" class="example" rows="1" cols="70"></textarea></td>
</tr>

<tr>
<td>User Id</td>
<td><!-- <select name="userid" multiple="multiple">
  <option value="CI2938">CI2938</option>
 <option value="CI2939">CI2939</option>
 <option value="CI2940">CI2940</option>
 <option value="CI2941">CI2941</option>
 <option value="CI2942">CI2942</option>
</select> --><textarea id="userid" name="userid" class="example" rows="1" cols="70"></textarea></td>
</tr>
<tr>
<td>Event Details :</td>
<td><textarea rows="4" cols="50" name="eventdetails"></textarea></td>
</tr>
<tr>
<td>Event From</td>
<td><input type="text" name="eventfrom" id="eventfrom"></td>
</tr>
<tr>
<td>Event To</td>
<td><input type="text" name="eventto" id="eventto"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Add Event"></td>
</tr>
</table>
</form>
<body>
<form>
</form>
</body>
</html>