<%@page import="java.util.List"%>
<%@page import="java.util.Enumeration"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %> 

<portlet:defineObjects />

<portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath" value="/jsp/detail.jsp"/>
</portlet:renderURL>
<style>

.inpt_sty {
    height: 31px;
    background: rgb(217, 220, 222) none repeat scroll 0% 0%;
    border: 1px solid rgb(158, 158, 158);
}


.btn_sty {
    background: #0b6c9e;
    border: none;
    border: medium none;
    height: 25px;
    padding: 2px 0px;
    width: 95px;
}

.btn_sty:hover {
    background: #0f8bcb;
    border: none;
    border: medium none;
    height: 25px;
    padding: 2px 0px;
    width: 95px;
}

.btn-success:focus, .btn-success.focus {
    color: #fff;
    background-color: #0f8bcb !important;
    border-color: #0f8bcb !important;
}

table {
    font-size: 12px;
    font-family: Calibri !important;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    text-align: left;
    border: 1px solid black;
    background-color: #ebedec;
}

/* tr:nth-child(even) {
    background-color: #dddddd;
} */

</style>  
<aui:script>
	function sendId(empid)
	{
		//alert(empid);
		AUI().use('aui-base',
		'aui-io-plugin-deprecated',
		'liferay-util-window',
		function(A) {
		var popUpWindow=Liferay.Util.Window.getWindow(
		{
		dialog: {
		centered: true,
		constrain2view: true,
		//cssClass: 'yourCSSclassName',
		modal: true,
		resizable: false,
		width: 475
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Employee Details");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>&id='+empid);
		popUpWindow.io.start();

});   
	}
</aui:script>

<script>
$(document).ready(function(){
	$.ajax({
		url : "<portlet:resourceURL id='businessCall'/>",
		type : 'POST',
		dataType : 'json',
		async: false,
		contentType : 'application/json',
		success : function(data) {
			//alert(JSON.stringify(data));
			$("#business").append("<option value='*'>-Select-</option>");
			$("#function").empty();
			$("#function").append("<option value='*'>-Select-</option>");
			$("#location").empty();
			$("#location").append("<option value='*'>-Select-</option>");
			$("#branch").empty();
			$("#branch").append("<option value='*'>-Select-</option>");
			$("#department").empty();
			$("#department").append("<option value='*'>-Select-</option>");
			
			 for(var i in data)
			{
			$("#business").append("<option value=" + data[i].business_id + ">" + data[i].business_name + "</option>");
			} 
		},
		error : function() {
		//	alert("There was an error. Try again please!");
		}
	});
	
	
	$("#business").change(function() {
		var businessId = $("#business option:selected").val();
		//alert("businessId : "+businessId);
	$.ajax({
		url : "<portlet:resourceURL id='locationCall'/>",
		type : 'POST',
		data : {business : businessId},
		dataType : 'json',
		async: false,
		success : function(data) {
			//alert(JSON.stringify(data));
		
			 for(var i in data.unit)
			{
			$("#location").append("<option value='"+data.unit[i]+"'>" + data.unit[i] + "</option>");
			} 
		},
		error : function() {
			//alert("There was an error. Try again please!");
		}
	});
	});
	
 $("#business").change(function() {
		var businessId = $("#business option:selected").val();
		//alert("businessId : "+businessId);
	$.ajax({
		url : "<portlet:resourceURL id='branchCall'/>",
		type : 'POST',
		data : {business : businessId},
		dataType : 'json',
		async: false,
		success : function(data) {
			//alert(JSON.stringify(data));
		
			 for(var i in data.unit)
			{
			$("#branch").append("<option value='"+data.unit[i]+"'>" + data.unit[i] + "</option>");
			} 
		},
		error : function() {
			//alert("There was an error. Try again please!");
		}
	});
	});
	
	$("#business").change(function() {
		var businessId = $("#business option:selected").val();
		//alert("businessId : "+businessId);
	$.ajax({
		url : "<portlet:resourceURL id='departmentCall'/>",
		type : 'POST',
		data : {business : businessId},
		dataType : 'json',
		async: false,
		success : function(data) {
			//alert(JSON.stringify(data));
		
			for(var i in data.unit)
			{
			$("#department").append("<option value='"+data.unit[i]+"'>" + data.unit[i] + "</option>");
			} 
		},
		error : function() {
		//	alert("There was an error. Try again please!");
		}
	});
	});
	
	$("#business").change(function() {
		var businessId = $("#business option:selected").val();
		//alert("businessId : "+businessId);
	$.ajax({
		url : "<portlet:resourceURL id='functionCall'/>",
		type : 'POST',
		data : {business : businessId},
		dataType : 'json',
		async: false,
		success : function(data) {
			//alert(JSON.stringify(data));
			
			 for(var i in data.unit)
			{
			$("#function").append("<option value='"+data.unit[i]+"'>" + data.unit[i] + "</option>");
			} 
		},
		error : function() {
			//alert("There was an error. Try again please!");
		}
	});
	}); 
});


function searchMethod()
{
	var business = $('#business option:selected').text();
	if(business=="-Select-")
		{
		business="*";
		}
	if(business!="*")
	{
		business = '\"'+business+'\"';
	}
	
	var name = $('#name').val();
	
	var location = $('#location option:selected').val();
	if(location!="*")
	{
	location = '\"'+location+'\"';
	}
	
	var branch = $('#branch option:selected').val();
	if(branch!="*")
	{
		branch = '\"'+branch+'\"';
	}
	
	var functions = $('#function option:selected').val();
	if(functions!="*")
	{
		functions = '\"'+functions+'\"';
	}
	
	var department = $('#department option:selected').val();
	if(department!="*")
	{
		department = '\"'+department+'\"';
	}
	
	var URL_PREFIX = 'http://10.9.50.123:8983/solr/user/select?indent=on&q=name:('+name;
	var URL_SUFFIX = ')&fq=location:'+location+'&fq=branch:'+branch+'&fq=business:'+encodeURIComponent(business)+'&fq=functionname:'+functions+'&fq=department:'+department+'&wt=json&rows=500';
	
	//alert(keywrd);
	
        	var URL = URL_PREFIX +  URL_SUFFIX;
        	//alert("URL : "+URL);
			var id = [];
			$.ajax({
				url : URL,
				dataType : 'jsonp',
				jsonp : 'json.wrf',
				success : function(dataresponse) {
					$("#results").html('');
					console.log(JSON.stringify(dataresponse));
					
					for(var i=0;i<dataresponse.response.docs.length;i++)
						{
						
							$("#results").append('<div class="col-md-12" style="padding: 30px 0px 0px;">'
									  +'<div class="col-md-7" style="padding:0px;">'
									  +'<div class="col-md-7"><strong>  ID : '+dataresponse.response.docs[i].empid+'</strong></div>'
									  +'<div class="col-md-10"><strong> Employee Name : '+dataresponse.response.docs[i].name+'</strong></div>'
									  +'<div class="col-md-10"><strong> Business : '+dataresponse.response.docs[i].business+'</strong></div>'
									  +'<div class="col-md-10"><strong> Designantion : '+dataresponse.response.docs[i].designation+'</strong></div>'
									  +'<div class="col-md-10"><strong> Department : '+dataresponse.response.docs[i].department+'</strong></div>'
									  +'<div class="col-md-10"><strong> Function : '+dataresponse.response.docs[i].functionname+'</strong></div>'
									  +'<div class="col-md-12"><strong> E-Mail : '+dataresponse.response.docs[i].emailid+'</strong></div>'
									  +'</div>'
									  +'<div class="col-md-5" style="padding:0px;">'
									  +'<div class="col-md-10"><strong> DOJ : '+dataresponse.response.docs[i].doj+'</strong></div>'
									  +'<div class="col-md-10"><strong> Location : '+dataresponse.response.docs[i].location+'</strong></div>'
									  +'</div>'
									  +'<div class="col-md-12" style="padding: 30px 0px 0px; border-bottom:1px solid #275d78;"></div>'
									  );
							
						}
				}
			 });
}
	
</script>

 <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head">EMPLOYEE&nbsp;<span class="abt_text_headcol">DIRECTORY</span></span>
        
       
      
  			 <div class="row con_main_panel" style="height:auto; margin-top:30px;">
         
            <form class="form-horizontal" role="form">
               
                <div class="col-sm-6">
                <div class="form-group">
                    <label for="password" class="col-sm-4 control-label" style="text-align: left; ">Name:</label>
                    <div class="col-sm-8">
                    <input type="text" id="name" name="name" class="form-control inpt_sty">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="country" class="col-sm-4 control-label"  style="text-align: left; ">Location:</label>
                    <div class="col-sm-8">
                        <select name="location" id="location" class="form-control inpt_sty ">
                        </select>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <label for="country" class="col-sm-4 control-label"  style="text-align: left; padding-right:5px; ">Department:</label>
                    <div class="col-sm-8">
                        <select name="department" id="department" class="form-control inpt_sty ">
                        </select>
                    </div>
                </div> <!-- /.form-group -->
             
                </div>
                
                 <div class="col-sm-6">
                <div class="form-group">
                    <label for="password" class="col-sm-4 control-label" style="text-align: left; ">Business :</label>
                    <div class="col-sm-8">
                       <select name="business" id="business" class="form-control inpt_sty ">
                        </select>
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="country" class="col-sm-4 control-label"  style="text-align: left; ">Branch :</label>
                    <div class="col-sm-8">
                        <select name="branch" id="branch" class="form-control inpt_sty ">
                            <option>Bhubaneswar</option>
                            <option>Mumbai</option>
                            <option>Kolkotta</option>
                           <option>Tamilnadu</option>
                        </select>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <label for="country" class="col-sm-4 control-label"  style="text-align: left; ">Function : </label>
                    <div class="col-sm-8"> 
                        <select  name="function" id="function" class="form-control inpt_sty" ><i class="fa fa-chevron-circle-down" aria-hidden="true"></i>
                        </select>
                    </div>
                </div> <!-- /.form-group -->
             
            </div>
                <div class="controls col-sm-12">
                <center><input class="btn btn-success btn_sty" type="button" onclick="searchMethod()" value="Search" id="search"/></center>
              </div>
                
            </form> <!-- /form -->
       <!-- ./container -->
     
       
       	
      <div id="results" style="height:300px; overflow:auto; display: inline-block; margin-top:20px;">
        
     <!--<div class="col-md-12" style="padding: 30px 0px 0px; height:300px; overflow:auto;">
         <div class="col-md-7" style="padding:0px;">
       	   <div class="col-md-7"><strong> ID : D405</strong></div>
           <div class="col-md-10"><strong>Employee Name :Dillibabu D</strong></div>
            <div class="col-md-10"><strong>Designantion : Jr. Manager-</strong></div>
             <div class="col-md-10"> <strong>Creative Services-Chennai-Chola</strong></div>
             <div class="col-md-10"><strong> Department : Marketing & </strong></div>
              <div class="col-md-10"><strong>Corporate Communications</strong></div>
              <div class="col-md-12"><strong>E-Mail : dillibabud@chola.murugappa.com</strong></div>
         
         </div>
             <div class="col-md-5" style="padding:0px;">
               <div class="col-md-10"><strong>Mobile : +91 9551 5477 96</strong></div>
                 <div class="col-md-12"><strong>Internal Phone : 044 - 30007259</strong></div>
                   <div class="col-md-10" style="padding-bottom:60px;"><strong>Birthday : 13 June</strong></div>
                   <div class="col-md-10">
                   <button class="con_btn_styl"><span class="con_more">More +</span></button>
                   </div>
             </div>              
       
       </div>  
         
          <div class="col-md-12" style="padding: 30px 0px 0px; border-bottom:1px solid #275d78;">
          </div>
           
       <div class="col-md-12" style="padding: 30px 0px 0px;">
       <div class="col-md-7" style="padding:0px;">
       	   <div class="col-md-7"><strong> ID : D405</strong></div>
            <div class="col-md-10"><strong>Employee Name :Dillibabu D</strong></div>
             <div class="col-md-10"><strong>Designantion : Jr. Manager-</strong></div>
              <div class="col-md-10"> <strong>Creative Services-Chennai-Chola</strong></div>
               <div class="col-md-10"><strong> Department : Marketing & </strong></div>
                <div class="col-md-10"><strong>Corporate Communications</strong></div>
                 <div class="col-md-12"><strong>E-Mail : dillibabud@chola.murugappa.com</strong></div>
         
         </div>
             <div class="col-md-5" style="padding:0px;">
               <div class="col-md-10"><strong>Mobile : +91 9551 5477 96</strong></div>
                 <div class="col-md-12"><strong>Internal Phone : 044 - 30007259</strong></div>
                   <div class="col-md-10" style="padding-bottom:60px;"><strong>Birthday : 13 June</strong></div>
                   <div class="col-md-10">
                   <button class="con_btn_styl"><span class="con_more">More +</span></button>
                   </div>
             </div>              
       </div>  
          <div class="col-md-12" style="padding: 30px 0px 0px; border-bottom:1px solid #275d78;">
          </div>
       <div class="clearfix"></div>
       
       <div>
       
       
          </div>  
          <br>
          <br>
          <br>
          <br> -->
        </div>
      
      
      </div>
    </div>

<!-- 


Name : <input type="text" id="name" name="name"><br>
Business : <select name="business" id="business"></select><br>
Location : <select name="location" id="location"></select>&nbsp;&nbsp;&nbsp;&nbsp;
Branch : <select name="branch" id="branch"></select><br>
Department : <select name="department" id="department"></select>&nbsp;&nbsp;&nbsp;&nbsp;
Function : <select name="function" id="function"></select><br>
<input type="button" onclick="searchMethod()" value="Search" id="search"/><hr> -->
<body>
<!-- <table id="results">
   <tr>
   <th>Emp Id</th>
   <th>Name</th>
   <th>Designation</th>
   <th>Email Id</th>
   <th>Department</th>
   <th>Function</th>
   <th>Location</th>
   <th>Date of Joining</th>
   <th>Business</th>
   </tr>
</table> -->
</body>
