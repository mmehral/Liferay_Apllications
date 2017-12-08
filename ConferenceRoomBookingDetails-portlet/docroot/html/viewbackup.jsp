<%@page import="com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.expando.kernel.service.ExpandoValueLocalServiceUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.chola.conferenceroombooking.action.BookListPojo"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>

<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<portlet:renderURL var="tabURL"/>
<%
String tab = ParamUtil.getString(request, "tabs1","New Booking");
%>
<!--  <style>
table, th, td {
    border: 1px solid black;
}
</style> -->
<liferay-ui:tabs names="New Booking,My Booking,All Booking" url="<%=tabURL.toString()%>" >
 <c:if test='<%= tab.equalsIgnoreCase("New Booking")%>' >
<link
	href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/validationEngine.jquery.css"
	type="text/css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-ui-1.8.19.custom.min.js"></script>

<script
	src="<%=request.getContextPath()%>/js/jquery.validationEngine-en.js"
	type="text/javascript" charset="utf-8"></script>
<script
	src="<%=request.getContextPath()%>/js/jquery.validationEngine.js"
	type="text/javascript" charset="utf-8"></script>
<link href="<%=request.getContextPath()%>/css/jquery-ui.css"
	rel="stylesheet" />
<%
	List<Object[]> obj = conferenceroombookingdetailsLocalServiceUtil.state();
	
%>
<script>
$(document).ready(function() {
	 $( "#datepicker-13" ).datepicker({
		 dateFormat: 'dd/mm/yy',
		 minDate: 0
	 });
	 $( "#datepicker-14" ).datepicker({
		 dateFormat: 'dd/mm/yy',
		 minDate: 0
	 });
	 jQuery("#myForm").validationEngine();
});
</script>
<%
	String chk = (String) request.getAttribute("check");
	%>
<portlet:actionURL var="searchList" name="getConferenceRoomList"></portlet:actionURL>
<form action="${searchList}" method="post" id="myForm">
	
	<table style="width: 100%">
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
		
			<td>Date</td>
			<td><input type="text" id="datepicker-13" name="startDate" class="validate[required]"></td>

			<!-- <td>End Date</td>
<td><input type = "text" id = "datepicker-14" name="endDate"></td>
 -->

		
			<td>Start Time</td>
			<td><select name="starthour" id="starthour" class="validate[required]">
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
					</select> : <select name="startmint" id="startmint">
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
			</select></td>
			<td>End Time</td>
			<td><select name="endhour" id="endhour" class="validate[required]">

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
			</select> : <select name="endmint" id="endmint">
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
			</select></td>
		
			<td><input type="submit" value="Search" onclick="return getsearch()"/></td>
		</tr>
	</table>
</form>
<div>
<%-- <%
PortletURL actionURL=renderResponse.createRenderURL();
actionURL.setParameter("jspPage", "/html/mybooking.jsp");
%>
<%
PortletURL allbookingURL=renderResponse.createRenderURL();
allbookingURL.setParameter("jspPage", "/html/allbookinglist.jsp");
%>
My Booking<a href="<%=actionURL.toString()%>">My Booking</a>
ALL Booking<a href="<%=allbookingURL.toString()%>">All Booking</a>
 --%></div>
<%
	if(chk!=null){
		List<BookListPojo> list=(List<BookListPojo>)renderRequest.getAttribute("list"); 
		System.out.println("liiii======="+list.size());
		int bookingsize=list.size();
%>
<%if(bookingsize!=0){ %>
<portlet:actionURL var="action" name="getBookingDetails"></portlet:actionURL>
<form action="${action}" method="post">
<input type="hidden" name="bookinglist" value="<%=bookingsize%>">
<table style="width: 100%">
<tr style="background-color:  #85c1e9;  font-size: 14px;text-align: center;font-weight: bold;">

<th></th>
<th style="text-align: center;font-weight: bold;width: 10%;">State Name</th>
<th style="text-align: center;font-weight: bold;width: 10%;">Location</th>
<th style="text-align: center;font-weight: bold;width: 10%;">Date</th>
<th style="text-align: center;font-weight: bold;width: 10%;">Start Time</th>
<th style="text-align: center;font-weight: bold;width: 10%;">End Time</th>
<th style="text-align: center;font-weight: bold;width: 10%;">Room Name</th>
<th style="text-align: center;font-weight: bold;width: 10%;">Floor</th>
<th style="text-align: center;font-weight: bold;width: 10%;">Facility</th>
<th style="text-align: center;font-weight: bold;width: 10%;">Capacity</th>
<th style="text-align: center;font-weight: bold;width: 10%;">Extension</th>
</tr>
<%
int i=0;
for (BookListPojo b : list) { %>
<tr>
<td><input type="radio" name="bookid_<%=i%>"/>
<input type="hidden" name="roomid_<%=i%>" value="<%=b.getRoomid()%>">
</td>

<td><input type="text" name="statename_<%=i%>" value="<%=b.getStatename()%>"></td>
<td><input type="text" name="location_<%=i%>" value="<%=b.getLocname()%>"></td>
<td><input type="text" name="startdate_<%=i%>" value="<%=b.getStardate()%>"></td>
<td><input type="text" name="startime_<%=i%>" value="<%=b.getStartime()%>"></td>
<td><input type="text" name="endtime_<%=i%>" value="<%=b.getEndtime()%>"></td>
<td><input type="text" name="roomname_<%=i%>" value="<%=b.getRoomname()%>"></td>
<td><input type="text" name="floor_<%=i%>" value="<%=b.getFloor()%>"></td>
<td><input type="text" name="facility_<%=i%>" value="<%=b.getFacility()%>"></td>
<td><input type="text" name="capacity_<%=i%>" value="<%=b.getCapcity()%>"></td>
<td><input type="text" name="extension_<%=i%>" value="<%=b.getExtension()%>"></td>
</tr>

<%i++;
} %>
</table>
<table>
<tr>
<td><input type="submit" value="Submit"></td>
</tr>

</table>
</form>
<%}else{ %>
No Slots is available....
<%} %>
<%
	}
%>




<div id="conferenceroom">
	<table width="100%" id="list">

	</table>

</div>

</c:if>
 
<c:if test='<%= tab.equalsIgnoreCase("My Booking")%>' >
<jsp:include page="/html/mybooking.jsp"flush="true" />
</c:if>
 
<c:if test='<%= tab.equalsIgnoreCase("All Booking")%>' >
<jsp:include page="/html/allbookinglist.jsp" flush="true" />
</c:if>
 
</liferay-ui:tabs>

<script>
function getstate(that){
	alert(that.value);
	var value=that.value;
	$('#location').empty();
	$.ajax({
		url : "<portlet:resourceURL id='StateCall'/>",
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

function getsearch(){
	alert("getsearch()");
	var strthr=document.getElementById("starthour").value;
	var endhr=document.getElementById("endhour").value;
	var strtmnt=document.getElementById("startmint").value;
	var endmnt=document.getElementById("endmint").value;
	if(strthr ==endhr){
		if(strtmnt==endmnt){
			alert("Select the Proper Time......");
			return false;
		}	
		
		if(strtmnt>endmnt){
			alert("End Time Should be greater than Start Start Time");
			return false;
		}
	}
	if(strthr > endhr){
		alert("End Time Should be greater than Start Start Time!!!!!!!");
		return false;
	}
	
}

</script>