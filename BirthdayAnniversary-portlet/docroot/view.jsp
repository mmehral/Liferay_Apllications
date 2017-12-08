<%@page import="java.text.DateFormat"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<%@page import="com.chola.birthday.BirthdayWish"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.chola.birthday.service.birthdaywishLocalServiceUtil"%>
<%@page import="com.chola.birthday.model.birthdaywish"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.chola.birthday.service.predefinedmessagesLocalServiceUtil"%>
<%@page import="com.chola.birthday.model.predefinedmessages"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="java.util.List"%><%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>


<portlet:defineObjects />
<%--  <portlet:actionURL var="sendWishes"  name="sendWishes"></portlet:actionURL> --%>

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
		popUpWindow.titleNode.html("Birthday Wish");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>&id='+id);
		popUpWindow.io.start();

});
	}
</aui:script>
<script type="text/javascript">
/* $(document).ready(function(){

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
}); */
</script>

<%
 ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
String url=themeDisplay.getURLCurrent();
//out.println(url); 
if(url.contains("/birthday-wishes"))
{
%>
<div class="col-md-12 bd_gradient" style="height: 620px;overflow: auto;">
<%-- <form id="wish" action="<%=sendWishes%>" method="post">  --%>
<%
}
else
{ 
	%>
	<div class="col-md-12 bd_gradient" style="height: 290px;overflow: auto;margin-top: -14px;">
	<%	
}
if(themeDisplay.isSignedIn()){
	Date date = new Date();
    DateFormat sdf = new SimpleDateFormat("dd-MMM-");
    String todaysDate = sdf.format(date);
    System.out.println("Current Date : "+todaysDate);
	List birthdayData =  birthdaywishLocalServiceUtil.getEmpData(todaysDate);
	Iterator iter=birthdayData.iterator();
	while (iter.hasNext()) {
	Object[] result= (Object[]) iter.next();
	%>
	<div class="row" style="border-bottom: 1px solid #0e81b8;">
				<div class="col-md-2" style="padding: 0px; text-align: center;">
				<%
				if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<img id="profileImage" src="/theme/images/custom/noimage.png" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
				<%
				}
				else
				{
					%>
					<img id="profileImage" src="/ProfileImages/<%=result[6].toString() %>" class="img-responsive" style="height: 44px;width: 44px;border-radius: 50%;">
					<%
				}
				%>
				</div>
				<div class="col-md-7" style="padding: 0px; padding-left: 10px;font-size: 10px; text-align: left; font-weight: bold;">
                <span style="font-weight:bold;"> <%=result[3] %> </span><br>
                <span style="font-style:italic; color:#8d8d8d;"><%=result[17]%></span></div>
                <div class="col-md-3" style="padding: 3px;">
				<center><button style="border:none; background:none;" onclick="sendEmpId('<%=result[2]%>')">
				<div class="col-md-12" style="padding: 0px;"><center>
				<img src="/theme/images/custom/bd.jpg"></center></div>
				<div class="col-md-12" style="padding: 0px; text-align: center;">
				<span style="background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 8px;">
				    Send Wish</span></div></button></center>
				</div>
				</div>    
	<%
	System.out.println("Name : "+result[3]+" ID : "+result[2]);
	}
	
}else
{
	%>
	Please Sign In to Post Birthday Wish
	<%
}
%>
</div>

<!-- <div class="col-md-12">
     <div class="row text_style" style="text-align:right;"><input type="submit" id="submit" value="Wish All"></div>
     </div>
  </form> -->
  