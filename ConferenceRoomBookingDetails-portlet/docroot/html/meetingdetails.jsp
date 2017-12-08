<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.chola.conferenceroombooking.action.BookListPojo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>

function validateForm() 
{
  var x = document.forms["meeting"]["title"].value;

if (x == ""||x== null)
    {
        alert("Meeting Title must be filled out");
        return false;
    }
    
var y = document.forms["meeting"]["agenda"].value;

if (y == ""||y== null)
    {
        alert("Agenda must be filled out");
        return false;
    }
}
</script>
<script type="text/javascript">
$( document ).ready(function() {
	$(".nav-tabs").addClass("tabcolor");
});
</script>
 <style>
 .conf_bg_gradi {background: linear-gradient(#fff, #d1d1d1);}
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
    font-size:14px;
    text-align:center;
    border:1px solid #a08e8e !important;
   
    color:#fff;
    font-weight:bold;
}
</style>
</head>
<body>

	<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
	<portlet:defineObjects />

	<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
	<!-- <link
		href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
		rel="stylesheet">
	<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
	<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script> -->
	<link rel="stylesheet"
		href="<%=request.getContextPath()%>/css/validationEngine.jquery.css"
		type="text/css" />
	<%-- <script type="text/javascript"
		src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>
 --%>	<script type="text/javascript"
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
		String tab = ParamUtil.getString(request, "tabs1", "New Booking");
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
	<portlet:actionURL var="action" name="getAddBookingList"></portlet:actionURL>
	<%
		BookListPojo pojo = (BookListPojo) renderRequest.getAttribute("pojo");
		System.out.println("POJOOOOOOOOOOO" + pojo);
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		String strt[] = pojo.getStartime().split(":");
		String end[] = pojo.getEndtime().split(":");
		String strthr = strt[0];
		String strtmin = strt[1];
		String endhr = end[0];
		String endmin = end[1];
		System.out.println("Start HR" + strthr);
		System.out.println("Start MIN" + strtmin);
		System.out.println("End HR" + endhr);
		System.out.println("End MIN" + endmin);
		System.out.println("getEndtime" + pojo.getEndtime());
	%>
	<%
	PortletURL backURL=renderResponse.createRenderURL();
	backURL.setParameter("jpsPage", "/html/view.jsp");
	
	%>
	<liferay-ui:header title="back" backLabel="&laquo; Back to Search" backURL="<%=backURL.toString() %>"></liferay-ui:header>
	<portlet:renderURL var="tabURL" />
	<liferay-ui:tabs names="New Booking" url="<%=tabURL.toString()%>">
		<c:if test='<%=tab.equalsIgnoreCase("New Booking")%>'>
			
			<form action="${action}" method="post" id="myForm"  name="meeting" onsubmit="return validateForm()">
				<input type="hidden" name="roomId" value="<%=pojo.getRoomid()%>">
				<input type="hidden" name="startdate"
					value="<%=pojo.getStardate()%>"> <input type="hidden"
					name="meetstrhour" id="meetstrhour" value="<%=pojo.getStartime()%>" />
				<input type="hidden" name="meetendhour" id="meetendhour"
					value="<%=pojo.getEndtime()%>" />
				<input type="hidden" name="strthr1" id="strthr1" value="<%=strthr%>">
				<input type="hidden" name="strtmin1" id="strtmin1" value="<%=strtmin%>">
				<input type="hidden" name="endhr1" id="endhr1" value="<%=endhr%>">
				<input type="hidden" name="endmin1" id="endmin1" value="<%=endmin%>">	
				
			<div class="col-md-12 col-sm-12" style="padding:0px;">
    		<div class="form-group col-md-3 col-sm-3">
            <label for="State">Meeting Host Email Id <span style="color:red;">*</span></label>
            <input class="form-control input-sm conf_bg_gradi" type="text"  name="emailid" 
            value="<%=themeDisplay.getUser().getEmailAddress()%>"
						class="validate[required]">                  
          <%-- 
          <select class="form-control input-sm" name="state" id="state"
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
           --%>
          
        </div>
        
        
        <div class="form-group col-md-3 col-sm-3">
            <label for="Location">User Name <span style="color:red;">*</span></label>
             
          
          <input class="form-control input-sm conf_bg_gradi" type="text"  name="username" value="<%=themeDisplay.getUser().getLastName()%>"
						class="validate[required]">
        </div>
        
        
        <div class="form-group col-md-3 col-sm-3">
            <label for="Meeting Title">Meeting Title <span style="color:red;">*</span></label>
            <input class="form-control input-sm conf_bg_gradi" type="text"  name="title"
						class="validate[required]">
            
            
        </div>
        
        
        <div class="form-group col-md-3 col-sm-3">
            <label for="Agenda">Agenda <span style="color:red;">*</span></label>
            <textarea class="form-control input-sm conf_bg_gradi" rows="4" cols="20" name="agenda" 
								class="validate[required]"></textarea>
            
        </div>

        <div class="form-group col-md-6 col-sm-6">
            <label for="Start Time">Start Time <span style="color:red;">*</span></label>
            
          <select class="form-control input-sm conf_bg_gradi" name="starthour" id="starthour" onchange="getmybooking()">
							<option value="<%=strthr%>"><%=strthr%></option>
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
          
          <select class="form-control input-sm conf_bg_gradi" name="startmint" id="startmint" onchange="getmybooking()">
							<option value="<%=strtmin%>"><%=strtmin%></option>
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
            
          <select class="form-control input-sm conf_bg_gradi" name="endhour" id="endhour" onchange="getmybooking()">
							<option value="<%=endhr%>"><%=endhr%></option>
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
          <select class="form-control input-sm conf_bg_gradi" name="endmint" id="endmint" onchange="getmybooking()">
							<option value="<%=endmin%>"><%=endmin%></option>
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
   
   <!-- <center> <input class="btn btn-primary" type="submit" value="Book" onclick="return getsearch()" /></center><br> -->
<center> <input class="btn btn-primary" type="submit" value="Book"/></center><br>
</div>
</div>
	
				
				
				<%-- <div style="overflow: auto;">
				<table style="width: 100%" class="formtable2">
					<tr>
						<td>Meeting Host Email Id<font color="red"> * </font></td>
						<td><input type="text" name="emailid"
							value="<%=themeDisplay.getUser().getEmailAddress()%>"
							readonly="readonly" /></td>

						<td>Start Time<font color="red"> * </font></td>
						<td><select name="starthour" id="starthour" onchange="getmybooking()">
								<option value="<%=strthr%>"><%=strthr%></option>
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

						</select> :<select name="startmint" id="startmint" onchange="getmybooking()">
								<option value="<%=strtmin%>"><%=strtmin%></option>
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

						<td>End Time<font color="red"> * </font></td>
						<td><select name="endhour" id="endhour" onchange="getmybooking()">
								<option value="<%=endhr%>"><%=endhr%></option>
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


						</select>:<select name="endmint" id="endmint" onchange="getmybooking()">
								<option value="<%=endmin%>"><%=endmin%></option>
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
					</tr>

					<tr>
						<td>User Name<font color="red"> * </font></td>
						<td><input type="text" name="username"
							class="validate[required]"
							value="<%=themeDisplay.getUser().getFullName()%>"
							readonly="readonly"></td>

						<td>Meeting Title<font color="red"> * </font></td>
						<td><input type="text" name="title" maxlength="100"
							class="validate[required]"></td>

						<td>Agenda<font color="red"> * </font></td>
						<td><textarea rows="4" cols="20" name="agenda" 
								class="validate[required]"></textarea></td>

						<td><input type="submit" value="Book"
							></td>
					</tr>


				</table>
				</div>
 --%>			</form>

			
			
<div class="form-group col-md-12 col-sm-12">
	<div class="table-responsive">
<table class="table formtable2" id="book" style="display:inline-block;">
				<tr>

					<th>State Name</th>
					<th>Location</th>
					<th>Start Date</th>
					<th>Start Time</th>
					<th>End Time</th>
					<th>Room Name</th>
					<th>Floor Name</th>
					<th>Room Facilities</th>
					<th>Capacity</th>
					<th>Extension</th>
				</tr>
				<tr>
					<td><%=pojo.getStatename()%></td>
					<td><%=pojo.getLocname()%></td>
					<td><%=pojo.getStardate()%></td>
					<td><%=pojo.getStartime()%></td>
					<td><%=pojo.getEndtime()%></td>
					<td><%=pojo.getRoomname()%></td>
					<td><%=pojo.getFloor()%></td>
					<td><%=pojo.getFacility()%></td>
					<td><%=pojo.getCapcity()%></td>
					<td><%=pojo.getExtension()%></td>
				</tr>

			</table>
			
			</div>
			</div>
		</c:if>

	</liferay-ui:tabs>
</body>
<script>
	function getmybooking() {

 
		var strthr = document.getElementById("starthour").value;
		var endhr = document.getElementById("endhour").value;
		var strtmnt = document.getElementById("startmint").value;
		var endmnt = document.getElementById("endmint").value;

		var meetstrthr = document.getElementById("meetstrhour").value;
		var meetstrtmin = document.getElementById("meetendhour").value;
		
		var strthr1 = document.getElementById("strthr1").value;
		var strtmin1 = document.getElementById("strtmin1").value;
		var endhr1 = document.getElementById("endhr1").value;
		var endmin1 = document.getElementById("endmin1").value;
		
		$.ajax({
			url : "<portlet:resourceURL id='getvalidation'/>",
			type : 'POST',
			//dataType : 'json',
			data : {
				strthr : strthr,
				endhr : endhr,
				strtmnt : strtmnt,
				endmnt : endmnt,
				meetstrthr : meetstrthr,
				meetstrtmin : meetstrtmin
			},
			success : function(data) {
			//	alert(data);
				if (data == "false") {
					alert("Please select Proper Starttime and End time");
					document.getElementById("starthour").value=strthr1;
					document.getElementById("startmint").value=strtmin1;
					document.getElementById("endhour").value=endhr1;
					document.getElementById("endmint").value=endmin1;
				//	alert(strthr1);
				//	alert(endhr1);
				//	alert(strtmnt1);
				//	alert(endmnt1);
					return data;
				}
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
		if (strthr == endhr) {
			if (strtmnt == endmnt) {
				alert("Select the Proper Time......");
				document.getElementById("starthour").value=strthr1;
				document.getElementById("startmint").value=strtmin1;
				document.getElementById("endhour").value=endhr1;
				document.getElementById("endmint").value=endmin1;
				return false;
			}

			if (strtmnt > endmnt) {
				alert("End Time Should be greater than Start Start Time");
				document.getElementById("starthour").value=strthr1;
				document.getElementById("startmint").value=strtmin1;
				document.getElementById("endhour").value=endhr1;
				document.getElementById("endmint").value=endmin1;
				return false;
			}
		}
		if (strthr > endhr) {
			alert("End Time Should be greater than Start Start Time!!!!!!!");
			document.getElementById("starthour").value=strthr1;
			document.getElementById("startmint").value=strtmin1;
			document.getElementById("endhour").value=endhr1;
			document.getElementById("endmint").value=endmin1;
			return false;
		}

	//	alert("JIIII");
		
	}
</script>
</html>