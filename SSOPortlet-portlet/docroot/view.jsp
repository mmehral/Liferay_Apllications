
<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="peoplepowerapi.PeoplePowerAPI"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.chola.sso.SSOLogic"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %> 
<portlet:defineObjects />
<html>      
<portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/jsp/detail.jsp"/>
</portlet:renderURL>
<head>
<aui:script>
	function sendId()
	{
		
		AUI().use('aui-base',
		'aui-io-plugin-deprecated',
		'liferay-util-window',
		function(A) {
		var popUpWindow=Liferay.Util.Window.getWindow(
		{
		dialog: {
		centered: true,
		constrain2view: true,
		//cssClass: 'top_header_popup',
		modal: true,
		resizable: false,
		width: 475,
		height:500
		
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Leave Balance Details");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>');
		popUpWindow.io.start();

});
	}
</aui:script>
</head>
<body>
<div class="tabContent"> <span class="abt_text_head">EMPLOYEE&nbsp;<span class="abt_text_headcol">SERVICES</span></span> <span class="abt_text_head_sub"></span> <span class="abt_pr_dashed"></span>
          <div class="col-md-12 abt_pr_panel">
<%
 ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	long userid = themeDisplay.getUserId();
	User user = UserLocalServiceUtil.getUser((userid));
	System.out.println("user>>>>"+user);
	String screenname=themeDisplay.getUser().getScreenName(); 
	System.out.println("Screen name>>"+screenname);
   // String screenname="visuks";
    String empid = "test";
    if(!(screenname.equalsIgnoreCase("test")))
    {
    	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(screenname);
    }
	SSOLogic sso = new SSOLogic();
	String enocodedPeoplePower = sso.encryptPeoplePower(empid);
	String enocodedMediassist = sso.encryptMediassist(empid);
	String encodedADID = URLEncoder.encode(enocodedPeoplePower);
	String enocodedQtrac = sso.encryptPeoplePower(screenname);
	String ssoUrl =  "https://peoplepower.chola.murugappa.com/IntranetSSOLogin.aspx?AD_ID="+encodedADID+"&Empid="+empid.toUpperCase();
 	
	String mediassistUrl= "https://login.mediassistindia.net/SSOLogon.aspx?PartnerCorpId=364&EncryptedSSO="+enocodedMediassist;
	
	String qtrack = "https://qtrac.chola.murugappa.com/mqueue/login.aspx?AD_ID="+enocodedQtrac;
	%>
	
            <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><input type="button" onclick="return sendId()" value="Leave Balance Details"/></div>
            </div>
            
              <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=ssoUrl%>&FunctionalityCode=1005" target="_blank">Pay Slip</a></div>
            </div>
            
             <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=ssoUrl%>&FunctionalityCode=1006" target="_blank">Tax Slip</a></div>
            </div>
            
        <%--       <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=ssoUrl%>" target="_blank">Report lost id card</a></div>
            </div> --%>
            
            <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=mediassistUrl%>" target="_blank">Medical insurance cards, limits & coverage</a></div>
            </div>
            
              <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="http://mmsghbooking.murugappa.com" target="_blank">Guest House booking</a></div>
            </div>
            
            <%--   <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=qtrack%>" target="_blank">Incident Reporting</a></div>
            </div>
            
            <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=qtrack%>" target="_blank">Business Card request</a></div>
            </div>
            
              <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=ssoUrl%>&FunctionalityCode=1001" target="_blank">Team Structure</a></div>
            </div>
             --%>
              <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=qtrack%>" target="_blank">Access Request Application</a></div>
            </div>
            
             <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="https://selfserviceds.chola.murugappa.com/login" target="_blank">Password Reset</a></div>
            </div>
            
            <%--   <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=ssoUrl%>" target="_blank">Organization Structure</a></div>
            </div> --%>
            
              <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=ssoUrl%>&FunctionalityCode=1002" target="_blank">HR Policies</a></div>
            </div>
            
	 <%
}
else
{
	%>
	Please Log In
	<%
}
 
%>
</div>
</div>
</body>
</html>