<%@page import="peoplepowerapi.PeoplePowerAPI"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.usertheme.service.themecolorLocalServiceUtil"%>
<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="practice.SSOLogic"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="practice.UserInfoMainAction"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="practice.UserDay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects />

<script>
      $(document).ready(function(){
    	  $(".item:first").addClass("active");  
      });
</script>

<style>
.top_paddi{padding-left:3px;font-weight: bold;padding-top: 15px; margin-left: 3px !important;}

#popup h1 {
font-family: Verdana, Arial, Helvetica, sans-serif;
font-size: 16px;
color: #3F5C9A;
border-bottom: 1px #3F5C9A solid;
margin: 0;
padding: 0;
}

#popup h3 {
font-family: Verdana, Arial, Helvetica, sans-serif;
font-size: 14px;
color: #666666;
margin: 0;
padding: 5px 0;
text-align: left;
}

#popup p {
font-family: Verdana, Arial, Helvetica, sans-serif;
font-size: 12px;
color: #666666;
margin: 0;
padding: 5px;
text-align: justify;
}

#popup a {
font-family: Verdana, Arial, Helvetica, sans-serif;
font-size: 12px;
color: blue;
margin: 0;
padding: 5px;
text-align: right;
}

#popup a:hover {
font-family: Verdana, Arial, Helvetica, sans-serif;
font-size: 12px;
color: blue;
margin: 0;
padding: 5px;
text-align: right;
text-decoration:none !important;
}


#overlay-back {
position: fixed;
top: 0;
left: 0;
width: 100%;
height: 100%;
background: #000;
opacity: 0.6;
filter: alpha(opacity = 60);
z-index: 5;
display: none
}

.close-image {
display: block;
float: right;
position: relative;
top: -15px;
right: -15px;
height: 20px;
}

@media only screen and (min-width : 320px) {
#popup {
position: absolute;
display: hidden;
top: 160px;
left: 199%;
width: 95%;
height: auto;
margin-left: -593px;
background-color: white;
z-index: 6;
padding: 20px;
border: solid 5px #333333;
border-radius: 5px;
}
}

}
@media only screen and (min-width : 480px) {
#popup {
position: absolute;
display: hidden;
top: -107px;
left: 50%;
width: 97%;
height: auto;
margin-left: -250px;
background-color: white;
z-index: 6;
padding: 20px;
border: solid 5px #333333;
border-radius: 5px;
}
}

@media only screen and (min-width : 360px) {
#popup {
position: absolute;
display: hidden;
top: -107px;
left: 77%;
width: 95%;
height: auto;
margin-left: -250px;
background-color: white;
z-index: 6;
padding: 20px;
border: solid 5px #333333;
border-radius: 5px;
}
}


@media only screen and (min-width : 640px) {
#popup {
position: absolute;
display: hidden;
top: -107px;
left: 46%;
width: 90%;
height: auto;
margin-left: -250px;
background-color: white;
z-index: 6;
padding: 20px;
border: solid 5px #333333;
border-radius: 5px;
}
}

@media only screen and (min-width : 768px) {
#popup {
position: absolute;
display: hidden;
top: 160px;
left: 37%;
width: 93%;
height: auto;
margin-left: -250px;
background-color: white;
z-index: 6;
padding: 20px;
border: solid 5px #333333;
border-radius: 5px;
}
}

@media only screen and (min-width : 800px) {
#popup {
position: absolute;
display: hidden;
top: 160px;
left: 41%;
width: 85%;
height: auto;
margin-left: -250px;
background-color: white;
z-index: 6;
padding: 20px;
border: solid 5px #333333;
border-radius: 5px;
}
}

@media only screen and (min-width : 1024px) {
#popup {
position: absolute;
display: hidden;
top: 160px;
left: -58%;
width: 100%;
height: auto;
margin-left: -250px;
background-color: white;
z-index: 6;
padding: 20px;
border: solid 5px #333333;
border-radius: 5px;
}
}

@media only screen and (min-width : 1136px) {
#popup {
position: absolute;
display: hidden;
top: 160px;
left: 48%;
width: 500px;
height: auto;
margin-left: -645px;
background-color: white;
z-index: 6;
padding: 20px;
border: solid 5px #333333;
border-radius: 5px;
}
}

.carousel-indicators {
    position: absolute;
    bottom: 10px;
    left: 50%;
    z-index: -15 !important;
    width: 60%;
    margin-left: -30%;
    padding-left: 0;
    list-style: none;
    text-align: center;
}

</style>
<script>
$(document).ready(function() {
$('#overlay-back').fadeIn(500, function() {
$('#popup').show();
});

$(".close-image").on('click', function() {
$('#popup').hide();
$('#overlay-back').fadeOut(500);
});
});
</script>
 <script>
 $(document).ready(function(){
 	$.ajax({
 		url : "<portlet:resourceURL id='getTheme'/>",
 		type : 'POST',
 		dataType : 'json',
 		async: false,
 		contentType : 'application/json',
 		success : function(data) {
 			console.log(data.THEME);
 			if(data.THEME!="")
 				{
 				$(".blue_navheader").css("background-color", data.THEME);		
 				}
 		},
		error : function() {
		console.log("There was an error. Try again please!");
		}
	});

 
 $('#themechange').change(function() {    
	    var item=$(this); 
	    console.log(item.val());
	    if(item.val()!="")
	    {
	    $.ajax({
	 		url : "<portlet:resourceURL id='changeTheme'/>",
	 		type : 'POST',
	 		data : {themename : item.val()},
	 		dataType : 'json',
	 		async: false,
	 		success : function(data) {
	 			console.log(data.RESPONSE);
	 			if(data.RESPONSE=="SUCCESS")
	 			{
	 			$(".blue_navheader").css("background-color", item.val());
	 			}
	 		},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
	    }
	});
 
 });
 </script>

<%



ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
if (themeDisplay.isSignedIn() && themeDisplay.getUserId()!=20120) 
{
	String url=themeDisplay.getURLCurrent();
	
	//System.out.println("Key : "+url.substring(url.lastIndexOf("=")+1,url.length()));
	
	if(url.equalsIgnoreCase("/") || url.contains("/home") || url.equalsIgnoreCase("/group/cholamandalam-investment-and-finance"))
	{
		String screenname=themeDisplay.getUser().getScreenName(); 
	    //String screenname="visuks";
	    String empid = "test";
	    String name="";
	    if(!(screenname.equalsIgnoreCase("test")))
	    {
	    	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(screenname);
	    }
	    List data =  themecolorLocalServiceUtil.getEmpData(empid);
    	Iterator iter=data.iterator();
    	while (iter.hasNext()) {
    	Object[] result= (Object[]) iter.next();
    	name = result[3].toString();
    	System.out.println("Name : "+result[3].toString());  
    	}
		if(empid!=null)
		{
		String enocodedPeoplePower = SSOLogic.encryptPeoplePower(empid);
		String encodedADID = URLEncoder.encode(enocodedPeoplePower);
		String attendanceFlag = PeoplePowerAPI.getEmpDetail(empid);
		//String attendanceFlag = "true";
		System.out.println("attendanceFlag Data : "+attendanceFlag);  
		
		if(attendanceFlag.equalsIgnoreCase("true"))
		{
		%>
		<script type="text/javascript">
		$(document).ready(function() {
			$('#overlay-back').hide();
			});
		
		var attd = confirm("Welcome - Would you like to sign in for attendance");
		if (attd == true) {
			var AD = '<%=encodedADID%>';
			var empid = '<%=empid.toUpperCase()%>';
			window.open("https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID="+AD+"&Empid="+empid+"&FunctionalityCode=999",'_blank');
			
		}
		else
			{
			$(document).ready(function() {
				$('#overlay-back').hide();
				});
			}
		</script>
		<%
		} 
		else if(attendanceFlag.equalsIgnoreCase("false"))
		{
		%>
		<div id="popup">
		<img src="/theme/images/custom/Deep_Close.png" class="close-image" />
		<b>Welcome <%=name %></b>,<br>
		<b>Pending Sign in - </b><a href="https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID=<%=encodedADID %>&Empid=<%=empid%>&FunctionalityCode=7" target="_blank">Regularize</a> your attendance or <a href="https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID=<%=encodedADID %>&Empid=<%=empid%>&FunctionalityCode=1000" target="_blank">Apply leave</a>  
		</div>
		<%
		}
		else if(attendanceFlag.equalsIgnoreCase("AM"))
		{
		%>
		<script type="text/javascript">
			$(document).ready(function() {
				$('#overlay-back').hide();
				});
	    </script>
	    <%
		}
		else
		{
			%>
		    <script type="text/javascript">
		     var error = '<%=attendanceFlag%>'
		     console.log(error);
		     
		     	$(document).ready(function() {
					$('#overlay-back').hide();
					});
		    </script>
		<%
		}     
		}
	}
	else
	{
		%>
		<script type="text/javascript">
		$(document).ready(function() {
		$('#overlay-back').hide();
		});
		</script>
		<%
	}
String day=UserDay.getDayWish();

Date log=themeDisplay.getUser().getLastLoginDate();
String lstdy=UserInfoMainAction.getLastHourDate(log);
System.out.println("Last Login Time : "+lstdy);
	
	String screenname=themeDisplay.getUser().getScreenName(); 
   // String screenname="visuks";
    String empid = "test";
    if(!(screenname.equalsIgnoreCase("test")))
    {
    	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(screenname);
    }
	 
if (!request.isUserInRole("Administrator")) {
%>
<style>
.control-menu-level-1 {
	display: none;
}

#_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_sidenavSliderId{
display: none;
}
</style>
<%
}
else
{%>
<style>
.control-menu-level-1{opacity: 0.2}
.product-menu sidebar sidenav-menu{
display: none;
}
</style>
<%}%>
<div class="container gdmor_panel" style="padding-left:0px; padding-right:0px;">
<div class="col-md-12 right_gradient" style="padding:0px;">
<div class="col-md-3" style="padding: 20px 0px;">
<div style="text-align:center; width:60px; height:80px;float: left;">
			<%
			String name="";
			List data =  themecolorLocalServiceUtil.getEmpData(empid);
	    	Iterator iter=data.iterator();
	    	while (iter.hasNext()) {
	    	Object[] result= (Object[]) iter.next();
	    	name = result[3].toString();
	    	System.out.println("Name : "+result[3].toString());  
	    	
	    	if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<img id="profileImage" src="/theme/images/custom/person.png" class="img-responsive">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" src="/ProfileImages/<%=result[6].toString()%>">
				<%
				}
	    	}
				%>
				</div>
		</div>
		<div class="col-md-9" style="padding: 0px;">
			<div class="col-md-12 text_panel" style="margin-top: 20px; margin-bottom: 10px; width: 100%; word-break: break-all; height: 46px;
			line-height: 18px; word-break: break-all; margin-bottom: 4px;"> 
				<strong><%=day %>,<br><%=name %></strong>
			</div>
			 
			<div class="col-md-12 text_style" style="top: 17px;font-weight: bold;
    font-size: 13px;">
				<p>
				<span class="glyphicon glyphicon-time" style="color: #da1b1c;">
				</span>&nbsp;Last login :
				<%=lstdy%>
				<br> <span
				class="glyphicon glyphicon-off" style="color: #da1b1c;"></span>
				&nbsp;<a href="/c/portal/logout">Logout</a>
				</p>
				
				</div>

</div>
				<div class="col-md-12" style="width:100%;margin-top: 10px;/*padding-left: 0px;*/font-weight: bold;">
				<a href="/group/cholamandalam-investment-and-finance/profile" style="color: #000;">View Profile</a> <span
				style="color: #da1b1c;">|</span> <%-- <a
				href="<%=themeDisplay.getURLMyAccount() %>" style="color: #000;">Edit
				Profile</a> <span style="color: #da1b1c;">|</span>  --%><!-- <a href="#"
				style="color: #000;"> Change Theme</a> -->
				<select disabled="disabled" id="themechange">
				  <option value="">Change Theme</option>
				  <option value="red">Red</option>
				  <option value="green">Green</option>
 				  <option value="yellow">Yellow</option>
 				   <option value="brown">Brown</option>
 				  <option value="#008ed4">Blue</option>
				</select>
				<span style="color: #da1b1c;">|</span>		
				<a href="/group/cholamandalam-investment-and-finance/my-wall" style="color: #000;">My
				Dashboard</a>
				   
				</div>
				<div class="col-md-12 leftpaddi">
                <div class="input-group" style="font-size: 13px;">
                <portlet:actionURL var="updatePageLayout" name="updatePageLayout"></portlet:actionURL> 
				<form name="search" id="search" action="<%=updatePageLayout%>" method="post">
				
				<label class="checkbox-inline top_paddi">
			      <input type="radio" value="people" name="optradio">&nbsp;People
			    </label>
			    <label class="checkbox-inline top_paddi">
			      <input type="radio" value="page" name="optradio">&nbsp;Page
			    </label>
			    <label class="checkbox-inline top_paddi">
			      <input type="radio" value="document" name="optradio">&nbsp;Document
			    </label>
			    <label class="checkbox-inline top_paddi">
			      <input type="radio" value="all" name="optradio" checked="checked">&nbsp;All
			    </label>
				
				<input type="text" style="height: 33px;" class="form-control" placeholder="Search the intranet" name="searchBox" id="searchBox"/> 
				</form>
                  <span class="input-group-btn">
                    <button class="btn btn-default" onclick="myFunction()" type="button" style="margin-top: 36px;background:#1b5a79;color:#fff;border:1px solid #1b5a79;"><span class="glyphicon glyphicon-search"></span></button>
                  </span>
                </div><!-- /input-group -->
            </div>
			</div>
		</div>
		<script>
		function myFunction() {
		    document.getElementById("search").submit();
		}
		</script>
<%
}
else
{
	%>
	Please Login
	<%
}
%>

<div id="overlay-back"></div>

<%-- <!-- chat code -->
<link rel="stylesheet"
href="https://chat.chola.murugappa.com/cometchat/cometchatcss.php">
<script type="text/javascript" src="https://chat.chola.murugappa.com/cometchat/cometchatjs.php"></script>
<script type="text/javascript">
var userid=<%=themeDisplay.getUser().getUserId()%>;
document.cookie="cc_data="+userid;
</script>
<!-- chat code end--> --%>