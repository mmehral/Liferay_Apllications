<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page
	import="com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page
	import="com.liferay.expando.kernel.service.ExpandoValueLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.chola.conferenceroombooking.action.BookListPojo"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<portlet:renderURL var="tabURL" />

	<portlet:renderURL var="addurl">
<portlet:param name="mvcPath" value="/html/addmenu.jsp" />
</portlet:renderURL> 

<!-- <script type='text/javascript'>

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

</script> -->


<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

if (themeDisplay.isSignedIn()) {
	
if (request.isUserInRole("Administrator")) {
%>
<a href="<%= addurl.toString() %>" >Add Conference Details</a><hr>

<%
}}

%>

<%
	String tab = ParamUtil.getString(request, "tabs1", "New Booking");
%>
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
    font-size:17px;
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


<script type="text/javascript">
$( document ).ready(function() {
	$(".nav-tabs").addClass("tabcolor");
});
</script>
<style >
.tabcolor{ 
    background: #008ed4 !important; 
    color: #000 !important;
    font-weight: bold;
    }
    
   .nav-tabs > li.active > a, .nav-tabs > li.active > a:hover, .nav-tabs > li.active > a:focus {
    color: #555555;
    background-color: #fdcc03;
    border: 1px solid #ddd;
    border-bottom-color: transparent;
    cursor: default;
}

.nav-tabs > li > a:hover {
    border-color:none !important;
}

.nav > li > a:hover, .nav > li > a:focus {
    text-decoration: none;
    background-color: #fdcc03;
    color:#000;
} 

.nav > li > a {
    position: relative;
    display: block;
    padding: 10px 8px;
    color:#fff !important;
}

</style>
<liferay-ui:tabs names="New Booking,My Booking,All Booking"
	url="<%=tabURL.toString()%>">
	<c:if test='<%=tab.equalsIgnoreCase("New Booking")%>'>
	<!-- 	 <link
			href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
			rel="stylesheet">
 		<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
		<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script> -->
		<!-- ------- -->
		
		<%-- <link rel="stylesheet"
			href="<%=request.getContextPath()%>/css/validationEngine.jquery.css"
			type="text/css" /> --%>
			
			
			
			<!-- -------------- -->
		<%--  <script type="text/javascript"
			src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>  --%>
			
			<!-- --------------------------- -->
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
		<%
			List<Object[]> obj = conferenceroombookingdetailsLocalServiceUtil.state();
		%>
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
			String chk = (String) request.getAttribute("check");
		%>
		
	
		
		<portlet:actionURL var="searchList" name="getConferenceRoomList"></portlet:actionURL>
		<form action="${searchList}" method="post" id="myForm">
			<div style="width:100%; height:100%; overflow:auto;">
		
			<div class="col-md-12 col-sm-12" style="padding:0px;">
    <div class="form-group col-md-4 col-sm-4">
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
        
        
        <div class="form-group col-md-4 col-sm-4">
            <label for="Location">Location <span style="color:red;">*</span></label>
             
          
          <select required="required" class="form-control input-sm conf_bg_gradi" name="location" id="location"
						class="validate[required]">
							<option value="">Select</option>
					</select>
        </div>
        
        
        <div class="form-group col-md-4 col-sm-4">
            <label for="Date">Date(dd/mm/yyyy format only) <span style="color:red;">*</span></label>
            <input class="form-control input-sm conf_bg_gradi" type="text" id="datepicker-13" name="startDate"
						class="validate[required]" placeholder="dd/mm/yyyy">
            
            
        </div>

        <div class="form-group col-md-6 col-sm-6">
            <label for="Start Time">Start Time <span style="color:red;">*</span></label>
            
          
          
          <select required="required" class="form-control input-sm conf_bg_gradi" name="starthour" id="starthour"
						class="validate[required]">
							<option value="01">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
					</select>
          
          
        </div>
        
        

    <div class="form-group col-md-6 col-sm-6">
          <label for="startmint">&nbsp;</label>
          
          <select required="required" class="form-control input-sm conf_bg_gradi" name="startmint" id="startmint">
							<option value="00">00</option>
							<option value="01">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
							<option value="25">25</option>
							<option value="26">26</option>
							<option value="27">27</option>
							<option value="28">28</option>
							<option value="29">29</option>
							<option value="30">30</option>
							<option value="31">31</option>
							<option value="32">32</option>
							<option value="33">33</option>
							<option value="34">34</option>
							<option value="35">35</option>
							<option value="36">36</option>
							<option value="37">37</option>
							<option value="38">38</option>
							<option value="39">39</option>
							<option value="40">40</option>
							<option value="41">41</option>
							<option value="42">42</option>
							<option value="43">43</option>
							<option value="44">44</option>
							<option value="45">45</option>
							<option value="46">46</option>
							<option value="47">47</option>
							<option value="48">48</option>
							<option value="49">49</option>
							<option value="50">50</option>
							<option value="51">51</option>
							<option value="52">52</option>
							<option value="53">53</option>
							<option value="54">54</option>
							<option value="55">55</option>
							<option value="56">56</option>
							<option value="57">57</option>
							<option value="58">58</option>
							<option value="59">59</option>
							<option value="60">60</option>
					</select>
          
          
          
       </div>
       
       
      
        <div class="form-group col-md-6 col-sm-6">
            <label for="End Time">End Time <span style="color:red;">*</span></label>
            
          
          <select required="required" class="form-control input-sm conf_bg_gradi" name="endhour" id="endhour"
						class="validate[required]">

							<option value="01">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
					</select> 
          
        </div>
        
        

    <div class="form-group col-md-6 col-sm-6">
          <label for="endmint">&nbsp;</label>
          
          <select  required="required" class="form-control input-sm conf_bg_gradi" name="endmint" id="endmint">
							<option value="00">00</option>
							<option value="01">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
							<option value="25">25</option>
							<option value="26">26</option>
							<option value="27">27</option>
							<option value="28">28</option>
							<option value="29">29</option>
							<option value="30">30</option>
							<option value="31">31</option>
							<option value="32">32</option>
							<option value="33">33</option>
							<option value="34">34</option>
							<option value="35">35</option>
							<option value="36">36</option>
							<option value="37">37</option>
							<option value="38">38</option>
							<option value="39">39</option>
							<option value="40">40</option>
							<option value="41">41</option>
							<option value="42">42</option>
							<option value="43">43</option>
							<option value="44">44</option>
							<option value="45">45</option>
							<option value="46">46</option>
							<option value="47">47</option>
							<option value="48">48</option>
							<option value="49">49</option>
							<option value="50">50</option>
							<option value="51">51</option>
							<option value="52">52</option>
							<option value="53">53</option>
							<option value="54">54</option>
							<option value="55">55</option>
							<option value="56">56</option>
							<option value="57">57</option>
							<option value="58">58</option>
							<option value="59">59</option>
							<option value="60">60</option>
					</select>
          
          
       </div>
    
<div class="col-md-12 col-sm-12">
   
   <center> <input class="btn btn-primary" type="submit" value="Search" onclick="return getsearch()" /></center><br>
</div>
</div>
			</div>
    

</form>


		
		<%
			if (chk != null) {
						List<BookListPojo> list = (List<BookListPojo>) renderRequest.getAttribute("list");
						System.out.println("liiii=======" + list.size());
						int bookingsize = list.size();
		%>
		<%
			if (bookingsize != 0) {
		%>
		<portlet:actionURL var="action" name="getBookingDetails"></portlet:actionURL>
		<div class="form-group col-md-4 col-sm-4" style=" width: 100%; float: left;">
		<form action="${action}" method="post">
			<input type="hidden" name="bookinglist" value="<%=bookingsize%>">
			<div style="overflow: auto;">
			<table style="width: 80%;" id="book" class="formtable2">
				<tr
					style="background-color: #85c1e9; font-size: 14px; text-align: center; font-weight: bold;">

					<th></th>
					<th style="text-align: center; font-weight: bold;width: 100px ">State Name</th>
					<th style="text-align: center; font-weight: bold; ">Location</th>
					<th style="text-align: center; font-weight: bold;">Date</th>
					<th style="text-align: center; font-weight: bold;">Start Time</th>
					<th style="text-align: center; font-weight: bold; ">End Time</th>
					<th style="text-align: center; font-weight: bold; ">Room Name</th>
					<th style="text-align: center; font-weight: bold; ">Floor Name</th>
					<th style="text-align: center; font-weight: bold;">Facility</th>
					<th style="text-align: center; font-weight: bold;">Capacity</th>
					<th style="text-align: center; font-weight: bold;">Extension</th>
				</tr>
 				<%
					int i = 0;
									for (BookListPojo b : list) {
				%>
				<tr>
					<td><input type="radio" name="bookid" value="<%=i%>"
						id="bookid_<%=i%>" /> <input type="hidden" name="roomid_<%=i%>"
						value="<%=b.getRoomid()%>"></td>

					<td ><input type="text" name="statename_<%=i%>"
						style="font-size:12px;" value="<%=b.getStatename()%>" readonly="readonly"></td>
					<td><input type="text" name="location_<%=i%>"
						style="font-size:12px;" value="<%=b.getLocname()%>" readonly="readonly"></td>
					<td><input type="text" name="startdate_<%=i%>"
						style="font-size:12px;" value="<%=b.getStardate()%>" readonly="readonly"></td>
						
					<td><input type="text" name="startime_<%=i%>"
						style="font-size:12px;" value="<%=b.getStartime()%>" readonly="readonly"></td>
					<td><input type="text" name="endtime_<%=i%>"
						style="font-size:12px;" value="<%=b.getEndtime()%>" readonly="readonly"></td>
					<td><input type="text" name="roomname_<%=i%>"
						style="font-size:12px;" value="<%=b.getRoomname()%>" readonly="readonly"></td>
					<td><input type="text" name="floor_<%=i%>"
						style="font-size:12px;" value="<%=b.getFloor()%>" readonly="readonly" ></td>
					<td><input type="text" name="facility_<%=i%>"
						style="font-size:12px;" value="<%=b.getFacility()%>" readonly="readonly"></td>
					<td><input type="text" name="capacity_<%=i%>"
						style="font-size:12px;" value="<%=b.getCapcity()%>" readonly="readonly"></td>
					<td><input type="text" name="extension_<%=i%>"
						style="font-size:12px;" value="<%=b.getExtension()%>" readonly="readonly"></td>
				</tr>

				<%
					i++;
									}
				%>
			</table>
			
			</div>
			
			<br>
			<center><table>
				<tr>
					<td><input class="btn btn-primary" type="submit" value="Submit"
						onclick="return getvalidation()"></td>
				</tr>

			</table></center><br>
			
		</form>
		</div>
		<%
			} else {
		%>
No Slots is available.
<%
			}
		%>
		<%
			}
		%>




		<div id="conferenceroom">
			<table width="100%" id="list">

			</table>

		</div>

	</c:if>

	<c:if test='<%=tab.equalsIgnoreCase("My Booking")%>'>
		<jsp:include page="/html/mybooking.jsp" flush="true" />
	</c:if>

	<c:if test='<%=tab.equalsIgnoreCase("All Booking")%>'>
		<jsp:include page="/html/allbookinglist.jsp" flush="true" />
	</c:if>

</liferay-ui:tabs>

<script>



	function getstate(that) {
	//	alert(that.value);
		var value = that.value;
		$('#location').empty();
		$.ajax({
			url : "<portlet:resourceURL id='conferenceStateCall'/>",
			type : 'POST',
			dataType : 'json',
			data : {
				stateid : value
			},
			success : function(data) {
				console.log(JSON.stringify(data));
				$("#location").append("<option value="+""+">Select</option>");
				for ( var i in data) {
					
					$("#location").append(
							"<option value=" + data[i].state_id + ">"
									+ data[i].state_name + "</option>");
				}
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
	}

	function getsearch() {
	//	alert("getsearch()");
		var strthr = document.getElementById("starthour").value;
		var endhr = document.getElementById("endhour").value;
		var strtmnt = document.getElementById("startmint").value;
		var endmnt = document.getElementById("endmint").value;

		  var createDate=$("#datepicker-13").val();  
			if(createDate==""||createDate==null)
			{
				alert("Please Enter date.");
				return false;
				
			}  	
		if (strthr == endhr) {
			if (strtmnt == endmnt) {
				alert("Select the Proper Time.");
				return false;
			}

			if (strtmnt > endmnt) {
				alert("End Time Should be greater than Start Start Time");
				return false;
			}
		}
		if (strthr > endhr) {
			alert("End Time Should be greater than Start Time");
			return false;
		}

	}

	function getvalidation() {
	//	alert("getvalidation");
		var bookflag=true;
		var rows = document.getElementById("book").getElementsByTagName("tr").length;
		for (var count = 0; count < rows - 1; count++) {
		//	alert("bookid_" + count);
			var bookid = document.getElementById("bookid_" + count).value;
			var book = document.getElementsByName("bookid");
		//	alert(book);
			if (book[count].checked == true) {
				bookflag=false;
			}

		}
		if(bookflag){
			alert("Please select atleast one conference room details");
			return false;
		}
	}
</script>