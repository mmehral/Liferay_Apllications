<%@page import="com.ssologic.SSOLogic"%>
<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<style>
.hrheight{
margin-top:4px; 
margin-bottom:4px;
    border-top: 1px solid #000;
}
</style>
<div class="container gdmor_panel">
<div class="col-md-12 right_gradient">
<div style="height: 277px;overflow: auto;">
<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
if (themeDisplay.isSignedIn() && themeDisplay.getUserId()!=20120) 
{
	String screenname=themeDisplay.getUser().getScreenName(); 
	//String screenname="visuks"; 
    String empid = "test";
    if(!(screenname.equalsIgnoreCase("test")))
    {
    	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(screenname);
    }
	   
	String enocodedPeoplePower = SSOLogic.encryptPeoplePower(empid);
	String enocodedQtrac = SSOLogic.encryptPeoplePower(screenname);
	String encodedADID = URLEncoder.encode(enocodedPeoplePower);
	
	String ssoUrlPeoplePower =  "https://peoplepower.chola.murugappa.com/ssologin.aspx?AD_ID="+encodedADID+"&EMP_ID="+empid.toUpperCase();
	String ssoUrlQtrac = "https://qtrac.chola.murugappa.com/mqueue/login.aspx?AD_ID="+enocodedQtrac;
%>
<b>Quick Links :</b> <br><br>
				<a href="<%=ssoUrlQtrac %>" target="_blank" style="color: #000;">QTrack</a> <hr class="hrheight">
				<a href="<%=ssoUrlPeoplePower %>" target="_blank" style="color: #000;">People Power</a> <hr class="hrheight">
				<a  href="http://dmsuatpvt.chola.murugappa.com/share/page" target="_blank" style="color: #000;">Alfresco</a>  <hr class="hrheight">
				<a  href="http://finnsso.chola.murugappa.com/finnsso/" target="_blank" style="color: #000;">Finnone</a>
<%
}
%> 
</div>
</div>
</div>