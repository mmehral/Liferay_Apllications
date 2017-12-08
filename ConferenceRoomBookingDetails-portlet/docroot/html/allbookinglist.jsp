<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil"%>
<%@page import="com.chola.conferenceroombooking.action.GetDates"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.chola.conferenceroombooking.action.BookListPojo"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<head>

 <!--  <script type='text/javascript'>

(function()
{
if( window.localStorage )
{
if( !localStorage.getItem('firstLoad') )
{
localStorage['firstLoad'] = true;
window.location.reload();
} 
else
localStorage.removeItem('firstLoad');
}
})();

</script>   -->
<style>
 .conf_bg_gradi {background: linear-gradient(#fff, #d1d1d1);}
table.formtable2 
{
    margin:0px;
    padding:0px;
    border-top:1px solid #fff !important;
    border-left:1px solid #fff !important;
    font-size:11px;
}


.formtable2 tr
{
    height:0px;
    
    }

.formtable2 a
{
    color: #000 !important;
    text-decoration: underline !important;
}
.formtable2 td
{
    margin:0px;
    padding:2px 6px 2px 6px !important;
    line-height:25px;
    font-size:13px;
    border-bottom:1px solid #a08e8e !important;
    border-right:1px solid #a08e8e !important;
    border-left:1px solid #a08e8e !important;
    text-align:left;
    font-weight:bold;
    
    
}
.formtable2 img
{
    margin:0px 0px 0px ;
    padding:0px;
}

.formtable2 a
{
    color:#666666;
}
.formtable2 th
{
    margin:0px;
    padding:0px 6px 0px 6px;
    line-height:21px;
    font-weight:bold;
    background:#85c1e9;
    font-size:15px;
    text-align:center;
    border:1px solid #a08e8e !important;
   
    color:#fff;
    font-weight:bold;
}
</style>

</head>

<portlet:defineObjects />
<!-- <link
			href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
			rel="stylesheet">
		<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
		<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script> -->
		
		<!-- ---------------- -->
 		<%-- <link rel="stylesheet"
			href="<%=request.getContextPath()%>/css/validationEngine.jquery.css"
			type="text/css" /> --%>
			<!-- ----------------- -->
			
		<%--  <script type="text/javascript"
			src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>  --%>
			
			
			<!-- ----------------- -->
		<%-- <script type="text/javascript"
			src="<%=request.getContextPath()%>/js/jquery-ui-1.8.19.custom.min.js"></script>

		<script
			src="<%=request.getContextPath()%>/js/jquery.validationEngine-en.js"
			type="text/javascript" charset="utf-8"></script>
		<script
			src="<%=request.getContextPath()%>/js/jquery.validationEngine.js"
			type="text/javascript" charset="utf-8"></script>
		<link href="<%=request.getContextPath()%>/css/jquery-ui.css"
			rel="stylesheet" /> --%>
			
<script>
			$(document).ready(function() {
				$("#datepicker-13").datepicker({
					dateFormat : 'dd/mm/yy',
					minDate : 0
				});
				$("#datepicker-14").datepicker({
					dateFormat : 'dd/mm/yy',
					minDate : 0
				
				});
				
				
				
				
				jQuery("#myForm").validationEngine();
				
				
			});
		</script>
		
<%
	List<Object[]> obj = conferenceroombookingdetailsLocalServiceUtil.state();
%>

<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:actionURL var="searchList" name="getALLBookingList"></portlet:actionURL>
<%
	PortletURL backURL=renderResponse.createRenderURL();
	backURL.setParameter("jpsPage", "/html/view.jsp");
	
	%>
	
	<liferay-ui:header title="back" backLabel="&laquo; Back to Search" backURL="<%=backURL.toString() %>"></liferay-ui:header>
	<script type="text/javascript">
	
	function validateform(){
		//alert("in function...")

	var x = document.forms["form"]["startDate"].value;
	if (x == ""||x== null)
	{
	    alert("Start date must be filled out");
	    return false;
	}
	//onSubmit="return validateform()"
</script>
<form action="${searchList}" method="post" id="myForm" name="form" >

		<div class="col-md-12 col-sm-12" style="padding:0px;">
    <div class="form-group col-md-6 col-sm-6">
            <label for="State">State <span style="color:red;">*</span></label>                  
          
          <select required="required" class="form-control input-sm conf_bg_gradi" name="state" id="state"
						onchange="return getstate(this)" class="validate[required]">
							<option value="">Select</option>
							<%
								for (Object[] obj1 : obj) {
							%>
							<option value="<%=obj1[0]%>"><%=obj1[1]%></option>
							<%
								}
							%>
					</select>
          
          
        </div>
        
        
        <div class="form-group col-md-6 col-sm-6">
            <label for="Location">Location <span style="color:red;">*</span></label>
             
          
          <select required="required"  class="form-control input-sm conf_bg_gradi" name="location" id="location"
						class="validate[required]">
							<option value="">Select</option>
					</select>
        </div>
        
        

        <div class="form-group col-md-6 col-sm-6">
            <label for="Date">Start Date(dd/mm/yyyy format only) <span style="color:red;">*</span></label>
            <input class="form-control input-sm conf_bg_gradi" type="text" id="datepicker-13" name="startDate" onchange="return getstartdate()"
						class="validate[required]" placeholder="dd/mm/yyyy">
            
          
       </div>
       
        <div class="form-group col-md-6 col-sm-6">
            <label for="Date">End Date(dd/mm/yyyy format only) <span style="color:red;">*</span></label>
            <input class="form-control input-sm conf_bg_gradi" type="text" id="datepicker-14" name="endDate" onchange="return getenddate()"
						class="validate[required]" placeholder="dd/mm/yyyy">
            
          
       </div>
    
<div class="col-md-12 col-sm-12">

<center> <input class="btn btn-primary" type="submit" value="Search" onclick="return getsearch()" /></center><br>
</div>
</div>



	<%-- <table>
		<tr>
			<td>State</td>
			<td><select name="state" id="state"
				onchange="return getstate(this)" class="validate[required]">
					<option value="">Select</option>
					<%
						for (Object[] obj1 : obj) {
					%>
					<option value="<%=obj1[0]%>"><%=obj1[1]%></option>
					<%
						}
					%>
			</select></td>

			<td>Location</td>
			<td><select name="location" id="location" class="validate[required]">
					<option value="">Select</option>
			</select></td>
	
			<td>Start Date</td>
			<td><input type="text" id="datepicker-13" name="startDate" class="validate[required]" onchange="return getstartdate()"></td>

			<td>End Date</td>
			<td><input type="text" id="datepicker-14" name="endDate" class="validate[required]" onchange="return getenddate()"></td>


		
			<td><input type="submit" value="Search" /></td>
		</tr>
	</table> --%>
</form>
<%
	String chk = (String) request.getAttribute("check");
%>
<%
	if (chk != null) {
		List<Object[]> allist = (List<Object[]>) renderRequest.getAttribute("alllist");
		System.out.println("allist=======" + allist.size());
		int allistsize = allist.size();
%>
<%
	if (allistsize != 0) {
%>

<div class="form-group col-md-12 col-sm-12">
	<div class="table-responsive">
<table class="table formtable2" id="book" style="display:inline-block;">
<tr>

		<th>Date</th>
		<th>Start Time</th>
		<th>End Time</th>
		<th>State Name</th>
		<th>Room Location</th>
		<th>Room Name</th>
		<th>Room Faclity</th>
		<!-- <td>Meeting Host Email Id</td>
			<td>Meeting Title</td>
			<td>Agenda</td> -->
		<th>Delete</th>
	</tr>
	<%
		for (Object[] allobj : allist) {
			
			System.out.println("Date...>"+allobj[0].toString());
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
			Date date = formatter.parse(allobj[0].toString());
			String strDate=formatter.format(date);
			System.out.println("Formatted Date....."+strDate);
			
			
			System.out.println("Date...>>"+allobj[0].toString());
			System.out.println("State Name...1..."+allobj[3].toString());
			System.out.println("Room location Name...2..."+allobj[4].toString());
			String statename=null;
			String locationname=null;
			statename=conferenceroombookingdetailsLocalServiceUtil.getStatename(Long.parseLong(allobj[3].toString()));
			locationname=conferenceroombookingdetailsLocalServiceUtil.getlocationname(Long.parseLong(allobj[4].toString()));
	%>
<tr>
			<td><%=strDate%></td>
			<td><%=allobj[1].toString()%></td>
			<td><%=allobj[2].toString()%></td>
			<td><%=statename%></td>
			<td><%=locationname%></td>
			<td><%=allobj[6].toString()%></td>
			<td><%=allobj[9].toString()%></td>
              <td><portlet:actionURL var="deleteURL1" name="deleteMybooking1">
					<portlet:param name="roomid"
						value="<%=String.valueOf(allobj[10].toString())%>" />
				</portlet:actionURL> <a href="${deleteURL1}">Cancel</a></td>

			
		</tr>

	<%
		}
	%>
	</table>
	
	</div>
	</div>
	
	<%
		}else{
	%>
		No Record Found.
	
	<%
		}} 
	else
	{
			String[] str = GetDates.getdates();
			String endate = str[0].toString();
			String startdate = str[1].toString();
			System.out.println("Start Date==" + startdate);
			System.out.println("End Date==" + endate);
			List<Object[]> list = conferenceroombookingdetailsLocalServiceUtil.defaultallBookingList(startdate, endate);
			System.out.println("liiii=======" + list.size());
			int allbookingsize = list.size();
	%>
	<%
		if (allbookingsize != 0) {
	%>
	
	<div class="form-group col-md-12 col-sm-12">
	<div class="table-responsive">
<table class="table formtable2" id="book" style="display:inline-block;">
				<tr>

				
			<th>Date</th>
			<th>Start Time</th>
			<th>End Time</th>
			<th>State Name</th>
			<th>Room Location</th>
			<th>Room Name</th>
			<th>Room Faclity</th>
			<!-- <td>Meeting Host Email Id</td>
			<td>Meeting Title</td>
			<td>Agenda</td> -->
			<th>Delete</th>
		</tr>
		<%
			for (Object[] ob : list) {
				
				System.out.println("Date...>"+ob[0].toString());
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
				Date date = formatter.parse(ob[0].toString());
				String strDate=formatter.format(date);
				System.out.println("Formatted Date....."+strDate);
				
				System.out.println("State Name..."+ob[3].toString());
				System.out.println("Room location Name..."+ob[4].toString());
				String statename=null;
				String locationname=null;
				statename=conferenceroombookingdetailsLocalServiceUtil.getStatename(Long.parseLong(ob[3].toString()));
				locationname=conferenceroombookingdetailsLocalServiceUtil.getlocationname(Long.parseLong(ob[4].toString()));
				System.out.println("Statename..."+statename);
				System.out.println("Locationname..."+locationname);
				
		%>
 

		<tr>
			<td><%=strDate%></td>
			<td><%=ob[1].toString()%></td>
			<td><%=ob[2].toString()%></td>
			<td><%=statename%></td>
			<td><%=locationname%></td>
			<td><%=ob[6].toString()%></td>
			<td><%=ob[9].toString()%></td> 

			<td><portlet:actionURL var="deleteURL" name="deleteMybooking">
					<portlet:param name="roomid"
						value="<%=String.valueOf(ob[10].toString())%>" />
				</portlet:actionURL> <a href="${deleteURL}">Cancel</a></td>
		</tr>
		<%
			}
		%>
	</table>
</div>
</div>


	<%
		}else{
	%>
	No Record Found.
	<%} %>
	<%
		}
	%>
	
	<script>
function getstate(that){
	//alert(that.value);
	var value=that.value;
	$('#location').empty();
	$.ajax({
		url : "<portlet:resourceURL id='conferenceStateCall'/>",
		type : 'POST',
		dataType : 'json',
		data : { stateid : value},
		success : function(data) {
			console.log(JSON.stringify(data));
			$("#location").append("<option value="+""+">Select</option>");
			for(var i in data)
			{
				
			$("#location").append("<option value=" + data[i].state_id + ">" + data[i].state_name + "</option>");
			}
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
}


function getroomlist(){
	var state=document.getElementById("state").value;
	var location=document.getElementById("location").value;
	var startDate=document.getElementById("datepicker-13").value;
	//var endDate=document.getElementById("datepicker-14").value;
	var starthour=document.getElementById("starthour").value;
	var startmint=document.getElementById("startmint").value;
	var startPM=document.getElementById("startPM").value;
	var endhour=document.getElementById("endhour").value;
	var endmint=document.getElementById("endmint").value;
	var endPM=document.getElementById("endPM").value;
		alert("State====="+state);
		alert("location====="+location);
		alert("startDate====="+startDate);
	//	alert("endDate====="+endDate);
		alert("starthour====="+starthour);
		alert("startmint====="+startmint);
		alert("startPM====="+startPM);
		alert("endhour====="+endhour);
		alert("endmint====="+endmint);
		alert("endPM====="+endPM);
		$("#list").empty();
		$.ajax({
			url : "<portlet:resourceURL id='RoomMaster'/>",
			type : 'POST',
			dataType : 'json',
			data : { stateid : state,
				     loctionid : location,
				     startDate : startDate,
				 //    endDate : endDate,
				     starthour : starthour,
				     startmint : startmint,
				     startPM : startPM,
				     endhour : endhour,
				     endmint :endmint,
				     endPM : endPM
			},
			success : function(data) {
				alert(data);
				
				$("#list").append("<tr><td></td><td>Room Name</td><td>Room Location</td><td>Room Facilities</td><td>Capacity</td><td>Extension</td></tr>");
				for(var i in data)
				{
			//	$("#location").append("<option value=" + data[i].state_id + ">" + data[i].state_name + "</option>");
				
					$("#list").append("<tr><td><input type=radio name=check value="+ data[i].room_id + " onclick = getbookinglist(" + data[i].room_id + ")></td><td>"+data[i].room_name+"</td><td>"+data[i].room_desc+"</td><td>"+data[i].room_capacity+"</td><td>"+data[i].room_extension+"</td><td>"+data[i].room_facility+"</td></tr>"  );
					
				}
				
				
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
		
		
		
		
}
		function getsearch() 
		{
		//alert("getsearch()");
		 var createDate=$("#datepicker-13").val();  
			if(createDate==""||createDate==null)
			{
				alert("Please Select Start date.");
				return false;
				
			} 		
			 var endDate=$("#datepicker-14").val();
			 if(endDate==""||enddate==null)
				 {
				 alert("Please Select End date.")
				 }
			}

function getenddate(){	
	var startDate = document.getElementById("datepicker-13").value;
    var endDate = document.getElementById("datepicker-14").value;
   
    if ((Date.parse(startDate) >= Date.parse(endDate))) {
        alert("End date should be greater than Start date");
        document.getElementById("datepicker-14").value = "";
    }
	
}

function getstartdate(){
	var startDate = document.getElementById("datepicker-13").value;
    var endDate = document.getElementById("datepicker-14").value;
   if(endDate!=""){
    if ((Date.parse(startDate) >= Date.parse(endDate))) {
        alert("End date should be greater than Start date");
        document.getElementById("datepicker-13").value = "";
    }
   }
}
	
</script>
