<!doctype html>
<html lang="en">
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
	
	<style>
	
.inpt_sty{height: 31px; background: rgb(217, 220, 222) none repeat scroll 0% 0%; border: 1px solid rgb(158, 158, 158);}
.btn_sty{background:#0b6c9e; border:none;  border: medium none;
                height: 25px; padding: 2px 0px; width: 95px;}
				
.btn_sty:hover{background:#0f8bcb; border:none;  border: medium none;
                height: 25px; padding: 2px 0px; width: 95px;}
	
	</style>
	
<portlet:defineObjects />
<%-- <portlet:resourceURL var="resourceURLs"></portlet:resourceURL>
 --%>
<script>

//on page load this script will be called
		$(document).ready(function() {
			$.ajax({
				url : "<portlet:resourceURL id='ProductCall'/>",
				type : 'POST',
				dataType : 'json',
				success : function(data) {
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
	
// on change this script will be called
			var product_id='';
			$("#product").change(function() {
				
				console.log("Product Id : "+$(this).val());
				product_id = $(this).val();
			$.ajax({
				url : "<portlet:resourceURL id='StateCall'/>",
				type : 'POST',
				dataType : 'json',
				data : { product_id : product_id},
				success : function(data) {
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
			});
			
			var state_id='';
			$("#state").change(function() {
				$('#city').empty()
				console.log("State Id : "+$(this).val());
				state_id = $(this).val();
			$.ajax({
				url : "<portlet:resourceURL id='CityCall'/>",
				type : 'POST',
				dataType : 'json',
				data : { state_id : state_id, product_id : product_id},
				success : function(data) {
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
		});
		
		function getBranch()
		{
			$('#branch').empty();
			$.ajax({
				url : "<portlet:resourceURL id='BranchCall'/>",
				type : 'POST',
				dataType : 'json',
				data : { city_id : $('#city').val() , state_id : $('#state').val(), product_id : $('#product').val()},
				success : function(data) {
					console.log(JSON.stringify(data));
					 
					for(var i in data)
					{
						 var branch_id = data[i].branch_id;
					     var branch_address = data[i].branch_address;
						    
						$("#branch").append("<div id='branch_id'></div><br/><div id='branch_address'>"+branch_address+"</div><br/>");
					}
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
		}
</script>

    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head">LIST OF&nbsp;<span class="abt_text_headcol">CHOLA BRANCHES</span></span>
  			 <div class="row con_main_panel" style="height:auto; overflow:hidden; margin-top:30px;">
  			 
  			  <form class="form-horizontal" role="form">
  		<div class="form-group">	  
<label for="password" class="col-sm-2 control-label" style="text-align: left; color:#f30404;">PRODUCT :</label>
<div class="col-sm-10">
<select id="product" class="form-control inpt_sty"><option value="">Select Product</option></select>
</div>
</div>

 <div class="form-group">
<label for="country" class="col-sm-2 control-label"  style="text-align: left; color:#f30404;">STATE       :</label>
<div class="col-sm-10">
<select id="state" class="form-control inpt_sty"><option value="">Select State</option></select>
</div>
</div>


<div class="form-group">
<label for="country" class="col-sm-2 control-label"  style="text-align: left; color:#f30404;">CITY          :</label>
<div class="col-sm-10">
<select id="city" class="form-control inpt_sty"><option value="">Select City</option></select>

</div>
</div>

<div class="controls">
<center><input class="btn btn-success btn_sty" type="button" onclick="getBranch()" value="SEARCH"></center>
</div>
 </form>
 <div class="container" style="padding:0px; font-weight:bold;">
 <span style="color:#e30000;">ADDRESS</span> <br>
<div id="branch"></div>
 </div>

</div>
</div>
</div>
</div>