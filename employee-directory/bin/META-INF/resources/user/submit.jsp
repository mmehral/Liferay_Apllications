<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="javax.portlet.PortletRequestDispatcher"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="javax.portlet.PortletResponse"%>
<%@page import="javax.portlet.ActionResponse"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="javax.portlet.PortletConfig"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.social.networking.service.WallEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.model.Group"%>
<%@page import="com.liferay.portal.kernel.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.social.networking.model.WallEntry"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try
{
System.out.println("Inside Wish method");

long userIds = Long.parseLong(request.getParameter("userName"));	

String type = request.getParameter("type");


ThemeDisplay themeDisplays = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

	  
System.out.println("wishedBy User ID : "+themeDisplays.getUserId());
System.out.println("wishedTo User ID : "+userIds);

String message = request.getParameter("personalMessage");
System.out.println("Message : "+message);

Group group = GroupLocalServiceUtil.getUserGroup(themeDisplays.getCompanyId(), userIds);

WallEntry wallentry = WallEntryLocalServiceUtil.createWallEntry(CounterLocalServiceUtil.increment());
wallentry.setGroupId(group.getGroupId());
wallentry.setCompanyId(themeDisplays.getCompanyId());
wallentry.setUserId(themeDisplays.getUserId());
wallentry.setUserName(themeDisplays.getUser().getFullName());
wallentry.setComments(type+":"+message);
wallentry.setCreateDate(new Date());
wallentry.setModifiedDate(new Date());
wallentry = WallEntryLocalServiceUtil.addWallEntry(wallentry);

		System.out.println("Appreciation Posted Successfully !!!");

		//redirect to view.jsp from popup
	 	PortletConfig portletConfig = (PortletConfig) request.getAttribute("javax.portlet.config");

		String portletName = portletConfig.getPortletName();
		
		PortletURL successPageURL = PortletURLFactoryUtil.create(request,
				portletName + "_WAR_" + portletName + "portlet",
				themeDisplays.getPlid(), PortletRequest.RENDER_PHASE);

		successPageURL.setParameter("jspPage", "/user/details.jsp");
		//System.out.println(successPageURL.toString()); 
		
		if(wallentry.getComments()!="")
		{
			%>
			<script type="text/javascript">
			$(document).ready(function() {
				 alert("Appreciation Message posted Successfully !!!")
				 window.location.href = '<%=successPageURL.toString()%>';
			});
			</script>
			<%
		}
		else
		{
			
		}
		  
}
catch (Exception e) {
	//e.printStackTrace();
}

%>
</body>
</html>