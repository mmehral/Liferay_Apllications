<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.regex.Matcher"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="com.chola.milestone.service.milestoneLocalServiceUtil"%>
<%@page import="org.apache.commons.codec.binary.Base64"%>
<%@page import="javax.crypto.spec.SecretKeySpec"%>
<%@page import="javax.crypto.spec.IvParameterSpec"%>
<%@page import="javax.crypto.Cipher"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.Period"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="java.util.List"%><%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
 <style>
 
 .btn_bord{background:#073a50; color: rgb(255, 255, 255); padding: 2px; font-size: 12px; border-radius: 3px;
}
	.containers {
    /* width: 800px; */
    margin: 0 auto;
    
}

	ul.tabs {
    margin: 0px;
    padding: 0px;
    list-style: none;
    background: #0098da;
    }
		ul.tabs li {
    background: none;
    color: #fff;
    display: inline-block;
    padding: 0px 15px;
    cursor: pointer;
}

		ul.tabs li.current {
    background: #ffcc29;
    color: #fff;
}

		.tab-content {
    display: none;
    background: #fff;
    padding: 15px;
}
.rowborder {border-bottom: 2px solid #dcdcdc; padding: 10px;}

		.tab-content.current{
			display: inherit;
		}
		.viewprofile
		{
		background: rgb(30, 89, 119) none repeat scroll 0% 0%;
    	color: rgb(255, 255, 255);
    	padding: 2px;
		}
  </style>  
  <portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/jsp/detail.jsp"/>
</portlet:renderURL>
  <aui:script>
	function sendEmpId(id)
	{
		console.log("EmpID : "+id);
		
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
		width: 475,
		height:320
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Milestone Awards");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>&id='+id);
		popUpWindow.io.start();

});
	}
</aui:script>
<script type="text/javascript">
$(document).ready(function(){
	$('ul.tabs li').click(function(){
		var tab_id = $(this).attr('data-tab');

		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');

		$(this).addClass('current');
		$("#"+tab_id).addClass('current');
	})
});
</script>  
<script type="text/javascript">

$(document).ready(function(){

$("#submit").click(function(){
    if($('#wish').find('input[type=checkbox]:checked').length == 0)
    {
        alert('Please select atleast one checkbox');
        return false;
    }
    else if(($('input[name=preMessages]:checked').length <= 0) && ($('#personalMessage').val()==null || $('#personalMessage').val()==""))
    {
        alert('Please select atleast one predefind message or write your personal message in below textarea');
        return false;
    }
    else
    	{
    	return true;
    	}
});
});
</script>
<body>

<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn()){
	try
	{
	Map fiveYears = new HashMap<String,String>();
	Map tenYears = new HashMap<String,String>();
	Map fifteenYears = new HashMap<String,String>();
	Map twentyYears = new HashMap<String,String>();
	Map twentyFiveYears = new HashMap<String,String>();
	Map thirtyYears = new HashMap<String,String>();
	
	
	 Date date = new Date();
     DateFormat dateFormat = new SimpleDateFormat("dd-MMM-");
     String strDate = dateFormat.format(date);
     //pass todays date
	 List milestoneData =  milestoneLocalServiceUtil.getEmpData(strDate);
	 
 	Iterator iter=milestoneData.iterator();
 	while (iter.hasNext()) {
 	Object[] result= (Object[]) iter.next();

 		Calendar present = Calendar.getInstance();
        Calendar past = Calendar.getInstance();
        past.setTime(new SimpleDateFormat("dd-MMM-yyyy").parse(result[7].toString()));
       int years = 0;
		    while (past.before(present)) {
		        past.add(Calendar.YEAR, 1);
		        if (past.before(present)) {
		            years++;
		        }
		    }
	
        System.out.println("years : "+years);
		
		if(years==5)
		{
			//System.out.println("Name : " + objects.get("Name") +" No of Years : "+years);
			fiveYears.put(result[2].toString(), result[3].toString()+"<br>"+result[17].toString());
		}
		if(years==10)
		{
			//System.out.println("Name : " + objects.get("Name") +" No of Years : "+years);
			tenYears.put(result[2].toString(), result[3].toString()+"<br>"+result[17].toString());
		}
		if(years==15)
		{
			//System.out.println("Name : " + objects.get("Name") +" No of Years : "+years);
			fifteenYears.put(result[2].toString(), result[3].toString()+"<br>"+result[17].toString());
		}
		if(years==20)
		{
			//System.out.println("Name : " + objects.get("Name") +" No of Years : "+years);
			twentyYears.put(result[2].toString(), result[3].toString()+"<br>"+result[17].toString());
		}
		if(years==25) 
		{
			//System.out.println("Name : " + objects.get("Name") +" No of Years : "+years);
			twentyFiveYears.put(result[2].toString(), result[3].toString()+"<br>"+result[17].toString());
		}
		if(years==30)
		{
			//System.out.println("Name : " + objects.get("Name") +" No of Years : "+years);
			thirtyYears.put(result[2].toString(), result[3].toString()+"<br>"+result[17].toString());
		}
		
	}

%>
<div class="containers">
	<ul class="tabs">
		<li class="tab-link current" data-tab="tab-1">5 Years </li>
		<li class="tab-link" data-tab="tab-2">10 Years</li>
		<li class="tab-link" data-tab="tab-3">15 Years </li>
		<li class="tab-link" data-tab="tab-4">20 Years </li>
		<li class="tab-link" data-tab="tab-5">25 Years </li>
		<li class="tab-link" data-tab="tab-6">30 Years </li>
	</ul>
</div>    

<div id="tab-1" class="tab-content current">
   <%
	 Iterator it = fiveYears.entrySet().iterator();
   if(!fiveYears.isEmpty())
   {
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        List dataValue =  milestoneLocalServiceUtil.getEmpProfile(String.valueOf(pair.getKey()));
    	Iterator iters=dataValue.iterator();
    	while (iters.hasNext()) {
    	Object[] result= (Object[]) iters.next();
    	
	%>
	<div class="row rowborder">
				<div class="col-md-2" style="padding: 0px; text-align: center;">
			<%--  <input type="checkbox" name="userName" value=<%=pair.getKey()%>> --%>
				<%
				if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<img id="profileImage" src="/theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="/ProfileImages/<%=result[6].toString()%>">
				<%
				}
				%>
			
			</div>
				<div class="col-md-7" style="padding: 0px; font-size: 12px; text-align: left; font-weight: bold;">
                <span style="font-weight:bold;"> <%=pair.getValue() %>	  </span>
                </div>
                <div class="col-md-3" style="padding: 3px;">
				<center><button style="border:none; background:none;" onclick="sendEmpId('<%=pair.getKey()%>')">
				<div class="col-md-12" style="padding: 0px; text-align: center;">
				<span class="btn_bord">
				    Send Wish</span></div></button></center>
				</div>
				</div>
				
	<%
	it.remove();
	}
    }
   }else
   {
   	%>
   	No 5 Years Milestone Today
   	<%
   }
    %>
</div>

 <div id="tab-2" class="tab-content">
   <%

	 Iterator it1 = tenYears.entrySet().iterator();
 if(!tenYears.isEmpty())
 {
  while (it1.hasNext()) {
      Map.Entry pair = (Map.Entry)it1.next();
      List dataValue =  milestoneLocalServiceUtil.getEmpProfile(String.valueOf(pair.getKey()));
  	Iterator iters=dataValue.iterator();
  	while (iters.hasNext()) {
  	Object[] result= (Object[]) iters.next();
  	
	%>
	<div class="row rowborder">
				<div class="col-md-2" style="padding: 0px; text-align: center;">
				<%
				if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<img id="profileImage" src="/theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="/ProfileImages/<%=result[6].toString()%>">
				<%
				}
				%>
			
			</div>
				<div class="col-md-7" style="padding: 0px; font-size: 12px; text-align: left; font-weight: bold;">
              <span style="font-weight:bold;"> <%=pair.getValue() %>	  </span>
              </div>
              <div class="col-md-3" style="padding: 3px;">
				<center><button style="border:none; background:none;" onclick="sendEmpId('<%=pair.getKey()%>')">
				<div class="col-md-12" style="padding: 0px; text-align: center;">
				<span class="btn_bord">
				    Send Wish</span></div></button></center>
				</div>
				</div>
				
	<%
	it1.remove();
	}
  }
 }else
 {
 	%>
 	No 10 Years Milestone Today
 	<%
 }
  %>
</div>

<div id="tab-3" class="tab-content">
    <%
    
	 Iterator it2 = fifteenYears.entrySet().iterator();
  if(!fifteenYears.isEmpty())
  {
   while (it2.hasNext()) {
       Map.Entry pair = (Map.Entry)it2.next();
       List dataValue =  milestoneLocalServiceUtil.getEmpProfile(String.valueOf(pair.getKey()));
     	Iterator iters=dataValue.iterator();
   	while (iters.hasNext()) {
   	Object[] result= (Object[]) iters.next();
   	
	%>
	<div class="row rowborder">
				<div class="col-md-2" style="padding: 0px; text-align: center;">
				<%
				if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<img id="profileImage" src="/theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="/ProfileImages/<%=result[6].toString()%>">
				<%
				}
				%>
			
			</div>
				<div class="col-md-7" style="padding: 0px; font-size: 12px; text-align: left; font-weight: bold;">
               <span style="font-weight:bold;"> <%=pair.getValue() %>	  </span>
               </div>
               <div class="col-md-3" style="padding: 3px;">
				<center><button style="border:none; background:none;" onclick="sendEmpId('<%=pair.getKey()%>')">
				<div class="col-md-12" style="padding: 0px; text-align: center;">
				<span class="btn_bord">
				    Send Wish</span></div></button></center>
				</div>
				</div>
				
	<%
	it2.remove();
	}
   }
  }else
  {
  	%>
  	No 15 Years Milestone Today
  	<%
  }
   %>
</div>

<div id="tab-4" class="tab-content">
    <%
	 Iterator it3 = twentyYears.entrySet().iterator();
  if(!twentyYears.isEmpty())
  {
   while (it3.hasNext()) {
       Map.Entry pair = (Map.Entry)it3.next();
       List dataValue =  milestoneLocalServiceUtil.getEmpProfile(String.valueOf(pair.getKey()));
     	Iterator iters=dataValue.iterator();
   	while (iters.hasNext()) {
   	Object[] result= (Object[]) iters.next();
   	
	%>
	<div class="row rowborder">
				<div class="col-md-2" style="padding: 0px; text-align: center;">
				<%
				if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<img id="profileImage" src="/theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="/ProfileImages/<%=result[6].toString()%>">
				<%
				}
				%>
			
			</div>
				<div class="col-md-7" style="padding: 0px; font-size: 12px; text-align: left; font-weight: bold;">
               <span style="font-weight:bold;"> <%=pair.getValue() %>	  </span>
               </div>
               <div class="col-md-3" style="padding: 3px;">
				<center><button style="border:none; background:none;" onclick="sendEmpId('<%=pair.getKey()%>')">
				<div class="col-md-12" style="padding: 0px; text-align: center;">
				<span class="btn_bord">
				    Send Wish</span></div></button></center>
				</div>
				</div>
				
	<%
	it3.remove();
	}
   }
  }else
  {
  	%>
  	No 20 Years Milestone Today
  	<%
  }
   %>
</div> 

<div id="tab-5" class="tab-content">
	
    <%
	 Iterator it4 = twentyFiveYears.entrySet().iterator();
  if(!twentyFiveYears.isEmpty())
  {
   while (it4.hasNext()) {
       Map.Entry pair = (Map.Entry)it4.next();
       List dataValue =  milestoneLocalServiceUtil.getEmpProfile(String.valueOf(pair.getKey()));
     	Iterator iters=dataValue.iterator();
   	while (iters.hasNext()) {
   	Object[] result= (Object[]) iters.next();
   	
	%>
	<div class="row rowborder">
				<div class="col-md-2" style="padding: 0px; text-align: center;">
				<%
				if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<img id="profileImage" src="/theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="/ProfileImages/<%=result[6].toString()%>">
				<%
				}
				%>
			
			</div>
				<div class="col-md-7" style="padding: 0px; font-size: 12px; text-align: left; font-weight: bold;">
               <span style="font-weight:bold;"> <%=pair.getValue() %>	  </span>
               </div>
               <div class="col-md-3" style="padding: 3px;">
				<center><button style="border:none; background:none;" onclick="sendEmpId('<%=pair.getKey()%>')">
				<div class="col-md-12" style="padding: 0px; text-align: center;">
				<span class="btn_bord">
				    Send Wish</span></div></button></center>
				</div>
				</div>
				
	<%
	it4.remove();
	}
   }
  }else
  {
  	%>
  	No 25 Years Milestone Today
  	<%
  }
   %>
</div> 

<div id="tab-6" class="tab-content">
	
    <%
	 Iterator it6 = thirtyYears.entrySet().iterator();
  if(!thirtyYears.isEmpty())
  {
   while (it6.hasNext()) {
       Map.Entry pair = (Map.Entry)it6.next();
       List dataValue =  milestoneLocalServiceUtil.getEmpProfile(String.valueOf(pair.getKey()));
     	Iterator iters=dataValue.iterator();
   	while (iters.hasNext()) {
   	Object[] result= (Object[]) iters.next();
   	
	%>
	<div class="row rowborder">
				<div class="col-md-2" style="padding: 0px; text-align: center;">
			 <input type="checkbox" name="userName" value=<%=pair.getKey()%>>
				<%
				if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<img id="profileImage" src="/theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="/ProfileImages/<%=result[6].toString()%>">
				<%
				}
				%>
			
			</div>
				<div class="col-md-7" style="padding: 0px; font-size: 12px; text-align: left; font-weight: bold;">
               <span style="font-weight:bold;"> <%=pair.getValue() %>	  </span>
               </div>
               <div class="col-md-3" style="padding: 3px;">
				<center><button style="border:none; background:none;" onclick="sendEmpId('<%=pair.getKey()%>')">
				<div class="col-md-12" style="padding: 0px; text-align: center;">
				<span class="btn_bord">
				    Send Wish</span></div></button></center>
				</div>
				</div>
				
	<%
	it6.remove();
	}
   }
  }else
  {
  	%>
  	No 30 Years Milestone Today
  	<%
  }
   %>
  
</div> 
<%
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
%>
<%-- <div class="col-md-12 bd_gradient" style="overflow: auto;">
<form id="wish" action="<%=sendWish%>" method="post">
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn()){
	
	Map fiveYears = new HashMap<String,String>();
	Map tenYears = new HashMap<String,String>();
	Map fifteenYears = new HashMap<String,String>();
	Map twentyYears = new HashMap<String,String>();
	Map twentyFiveYears = new HashMap<String,String>();
	Map thirtyYears = new HashMap<String,String>();
	
	int j =0;
	JSONArray data = (JSONArray)PeoplePowerAPI.GetEmpJoiningAnnivList();
	for(int i = 0; i < data.length(); i++)
	{
		j++;
		JSONObject objects = data.getJSONObject(i);
		String Anniversary = objects.get("Anniversary").toString();
		
		int years = Integer.parseInt(Anniversary.replaceAll("\\D+",""));
		
		System.out.println("No of Years : "+years + " Emp Name : "+objects.get("Name"));
		
		if(years==5)
		{
			System.out.println("Name : " + objects.get("Name"));
			fiveYears.put(result[2].toString(), objects.get("Name"));
		}
		if(years==10)
		{
			System.out.println("Name : " + objects.get("Name"));
			fiveYears.put(result[2].toString(), objects.get("Name"));
		}
		if(years==15)
		{
			System.out.println("Name : " + objects.get("Name"));
			fiveYears.put(result[2].toString(), objects.get("Name"));
		}
		if(years==20)
		{
			System.out.println("Name : " + objects.get("Name"));
			fiveYears.put(result[2].toString(), objects.get("Name"));
		}
		if(years==25) 
		{
			System.out.println("Name : " + objects.get("Name"));
			fiveYears.put(result[2].toString(), objects.get("Name"));
		}
		if(years==30)
		{
			System.out.println("Name : " + objects.get("Name"));
			fiveYears.put(result[2].toString(), objects.get("Name"));
		}
		
		%>
		<input type="checkbox" name="userName" value=<%=result[2]%>>  <%=result[3] %>
		<%
	}

	if(j==0)
	{
		System.out.println("No Milestone's Today");
		out.println("No Milestone's Today");
	}
	else
	{
	%>
	<table border="2">
	<tr>
	<th>Five Years Completed</th>
	<th>Ten Years Completed</th>
	<th>Fifteen Years Completed</th>
	<th>Twenty Years Completed</th>
	<th>Twenty - Five Years Completed</th>
	 <th>Thirty Years Completed</th>
	</tr>
	<tr>
	<td>
	<%
	 Iterator it = fiveYears.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        
        Object image = PeoplePowerAPI.GetEmpImage(String.valueOf(pair.getKey()));
		
	%>
	 <input type="checkbox" name="userName" value=<%=pair.getKey()%>>
				<%
				if(image.equals("ERROR"))
				{
				%>
				<img id="profileImage" src="theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="data:image/jpg;base64,<%=image.toString()%>">
				<%
				}
				%>
			<%=pair.getValue() %>	 
	<%
	it.remove();
	}
    %>
    </td>
	<td>
	<%
	 Iterator it1 = tenYears.entrySet().iterator();
    while (it1.hasNext()) {
        Map.Entry pair = (Map.Entry)it1.next();
        Object image = PeoplePowerAPI.GetEmpImage(String.valueOf(pair.getKey()));
	%>
	
	<input type="checkbox" name="userName" value=<%=pair.getValue()%>>
				<%
				if(image.equals("ERROR"))
				{
				%>
				<img id="profileImage" src="theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="data:image/jpg;base64,<%=image.toString()%>">
				<%
				}
				%>
				 <%=pair.getKey() %>
				
	<%
	it1.remove();
	}
    %>
    </td>
    <td>
	<%
	 Iterator it2 = fifteenYears.entrySet().iterator();
    while (it2.hasNext()) {
        Map.Entry pair = (Map.Entry)it2.next();
        Object image = PeoplePowerAPI.GetEmpImage(String.valueOf(pair.getKey()));
	%>
	<input type="checkbox" name="userName" value=<%=pair.getValue()%>>
				<%
				if(image.equals("ERROR"))
				{
				%>
				<img id="profileImage" src="theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="data:image/jpg;base64,<%=image.toString()%>">
				<%
				}
				%>
				
				<%=pair.getKey() %>
	<%
	it2.remove();
	}
    %>
    </td>
    <td>
	<%
	 Iterator it3 = fiveYears.entrySet().iterator();
    while (it3.hasNext()) {
        Map.Entry pair = (Map.Entry)it3.next();
        Object image = PeoplePowerAPI.GetEmpImage(String.valueOf(pair.getKey()));
	%>
	<input type="checkbox" name="userName" value=<%=pair.getValue()%>>
				<%
				if(image.equals("ERROR"))
				{
				%>
				<img id="profileImage" src="theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="data:image/jpg;base64,<%=image.toString()%>">
				<%
				}
				%>
			
				<%=pair.getKey() %>
	<%
	it3.remove();
	}
    %>
    
	</td>
	<td>
	<%
	 Iterator it4 = fiveYears.entrySet().iterator();
    while (it4.hasNext()) {
        Map.Entry pair = (Map.Entry)it4.next();
        Object image = PeoplePowerAPI.GetEmpImage(String.valueOf(pair.getKey()));
	%>
	<input type="checkbox" name="userName" value=<%=pair.getValue()%>>
				<%
				if(image.equals("ERROR"))
				{
				%>
				<img id="profileImage" src="theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="data:image/jpg;base64,<%=image.toString()%>">
				<%
				}
				%>
				  <%=pair.getKey() %>
	<%
	it4.remove();
	}
    %>
   </td>
   <td>
	<%
	 Iterator it5 = fiveYears.entrySet().iterator();
    while (it5.hasNext()) {
        Map.Entry pair = (Map.Entry)it5.next();
        Object image = PeoplePowerAPI.GetEmpImage(String.valueOf(pair.getKey()));
	%>
	<input type="checkbox" name="userName" value=<%=pair.getValue()%>>
				<%
				if(image.equals("ERROR"))
				{
				%>
				<img id="profileImage" src="theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;" src="data:image/jpg;base64,<%=image.toString()%>">
				<%
				}
				%>
				  <%=pair.getKey() %>
	<%
	it5.remove();
	}
    %>
    </td>
    </tr>
    </table><br><br>
    <textarea id="personalMessage" name="personalMessage" rows="4" cols="70" placeholder="Write Your Wish here !!!"></textarea><br>
	<aui:button type="submit" id="submit" value="Send Wish"></aui:button>
	</form>
    <%
	}
}else
{
	%>
	Please Sign In to Post on Milestone
	<%
}
%>
</div> --%>

</body>
</html>
  