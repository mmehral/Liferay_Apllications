<%@page import="com.chola.swagatam.service.swagatamdataLocalServiceUtil"%>
<%@page import="com.chola.swagatam.model.swagatamdata"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.chola.swagatam.service.swagatampathLocalServiceUtil"%>
<%@page import="com.chola.swagatam.model.swagatampath"%>
<%@page import="com.chola.swagatam.service.swagatamLocalServiceUtil"%>
<%@page import="com.chola.swagatam.model.swagatam"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.io.File"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

<style>

.swag_box_inn{background:#1d5a76; width:auto; height:auto; border-radius:5px; padding:2px; margin-top:0px; color:#fff; font-weight: bold;font-size: 13px;}
.swag_left{float:left;margin-top:0px; padding-left: 0px;}
.swag_right{margin-top: 0px;float: right;padding-right: 0px;text-align: right;}
</style>
</head>
<body>
<portlet:renderURL var="createInduction">
   <portlet:param name="jspPage" value="/jsp/createInduction.jsp" />
</portlet:renderURL>

<portlet:renderURL var="viewGallery">
   <portlet:param name="jspPage" value="/jsp/viewGallery.jsp" />
</portlet:renderURL>

<portlet:renderURL var="updateInducton">
   <portlet:param name="jspPage" value="/jsp/updateInducton.jsp" />
</portlet:renderURL>

<portlet:renderURL var="removeInduction">
   <portlet:param name="jspPage" value="/jsp/removeInduction.jsp" />
</portlet:renderURL> 

    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"><span class="abt_text_headcol">SWAGATAM</span></span> 
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn() && (request.isUserInRole("Administrator") ||request.isUserInRole("L&D Admin")))
{
%>
<a href="<%=createInduction%>">Create Induction</a><br>
<a href="<%=updateInducton%>">Update / Edit Induction</a><br>
<a href="<%=removeInduction%>">Remove Induction</a><br><br>

<%
}
%>
<% 
List<swagatamdata> dataList = swagatamdataLocalServiceUtil.getEmpData(String.valueOf(themeDisplay.getUserId()));
if(dataList.isEmpty() || dataList==null )
{
List<swagatampath> swagList = swagatampathLocalServiceUtil.getswagatampaths(0, swagatampathLocalServiceUtil.getswagatampathsCount());

List values = new ArrayList();
for(swagatampath swagat : swagList)
{
	if(swagat.getFlag().equalsIgnoreCase("1"))
	{
		values.add("http://10.9.50.123:8080/SwagatamUpload/admin/"+swagat.getVideoPath().toString());
	}
}

List<swagatam> swag = swagatamLocalServiceUtil.getswagatams(0, swagatamLocalServiceUtil.getswagatamsCount());
for(swagatam swagat : swag)
{
	if(swagat.getFlag().equalsIgnoreCase("1"))
	{
 %>
  <span class="abt_text_head_sub">Title : <%=swagat.getTitle() %></span><br>
 <span class="abt_text_head_sub">Description : <%= swagat.getDesc()%></span>
 <br>
           <div style="width:100%; float:left;">
 <input style="border:none;margin-bottom: 5px;" class="swag_box_inn" type="button" id="startButton" value="START INDUCTION" onclick="callpro('<%= values %>')" /><br>
 <video width="100%" controls id="myVideo"></video><br>
 
 
</div>
</div>
</div>
 <div class="col-md-3 swag_left">
           
              <span class="swag_box_inn"><i class="fa fa-caret-left" aria-hidden="true"></i><a class="text_link" href="">
 <input style="border: none; padding: 0px;" class="swag_box_inn" type="button" id="prev" value="PREVIOUS" />
 </a></span>
          </div>
    
    <div class="col-md-3 swag_right">
              <span class="swag_box_inn"><a class="text_link" href="">      
 <input style="border: none; padding: 0px;" class="swag_box_inn" type="button" id="next" value="NEXT" />
 <i class="fa fa-caret-right" aria-hidden="true"></i></a></span>
          </div>
   <input type="button" id="ackButton" style="display: none" value="I Acknowledge that I have watched all the videos" onclick="return callack()" /><br>
 </div>
 <%
	}
}
}
else
{
%>
You have already completed your Induction
<%
}
%>

</body>
<script type="text/javascript">


function callack()
{
console.log("Inside Ack");
$.ajax({
	url : "<portlet:resourceURL id='swagatamack'/>",
	type : 'POST',
	dataType : 'json',
	success : function(data) {
		console.log(data);
		//console.log(JSON.stringify(data));
	},
	error : function() {
		console.log("There was an error. Try again please!");
		alert("Acknowledged Successfully");
		$("#ackButton").hide();
		$("#prev").hide();
		$("#startButton").hide();
	}
});
}

function callpro(val)
{
	$("#next").show();
	$("#prev").show();
	var myArray2 = new Array();
	myArray2= new Array(val);
	var videoSource = myArray2.toString();
	videoSource = videoSource.replace("[","");
	videoSource = videoSource.replace("]","");
	videoSource = videoSource.split(",");
	var videoCount = videoSource.length;
	var i=0;
	console.log("Total Videos : "+videoCount);
	console.log("Videos : "+videoSource);
	
		
	    function videoPlay(videoNum)
	    {
		document.getElementById("myVideo").setAttribute("src",videoSource[videoNum]);
		console.log(videoSource[videoNum]);
		document.getElementById("myVideo").load();
		document.getElementById("myVideo").play();
	    }

	   /*  document.getElementById("next").addEventListener("click", myHandler, false);
	    videoPlay(i++); */
	    
	    document.getElementById("next").addEventListener("click", nextHandler,false);
	    function nextHandler() {
			console.log(i);
			i++;
			if(i == (videoCount)){
			$("#next").hide();
			alert("You have completed your induction")
			console.log("Finished");
			$("#ackButton").show();
			}
			else{
			videoPlay(i);
			}
	    }
	    
	    document.getElementById("prev").addEventListener("click", prevHandler,false);
	    function prevHandler() {
	    	$("#ackButton").hide();
	    	$("#next").show();
			console.log(i);
			i--;
			if(i == (videoCount)){
			$("#prev").hide();
			
			}
			else{
			videoPlay(i);
			}
	    }
	    
       document.getElementById('myVideo').addEventListener('ended',myHandler,false);
       videoPlay(0);
		function myHandler() {
		console.log(i);
		i++;
		if(i == (videoCount)){
		i = 0;
		//videoPlay(i);
		alert("You have completed your induction")
		console.log("Finished");
		//$("#startButton").hide();
		$("#ackButton").show();
		//$("#myVideo").hide();
		/* $.ajax({
			url : "<portlet:resourceURL id='swagatam'/>",
			type : 'POST',
			dataType : 'json',
			success : function(data) {
				console.log(data);
				//console.log(JSON.stringify(data));
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		}); */
		}
		else{
		videoPlay(i);
		}
		} 
		}

</script>
</html>