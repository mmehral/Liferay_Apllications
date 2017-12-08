package com.chola.app;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import org.apache.catalina.connector.Request;

import com.chola.appcorner.model.post;
import com.chola.appcorner.model.replied;
import com.chola.appcorner.service.postLocalServiceUtil;
import com.chola.appcorner.service.repliedLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.messaging.proxy.MessageValuesThreadLocal;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.kernel.service.persistence.PortletUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

public class Appreciation extends MVCPortlet{

	public void save(ActionRequest actionRequest,ActionResponse actionResponse) throws ParseException, PortalException
	{
		ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		sd.setTimeZone(TimeZone.getTimeZone("IST"));
	    Date date = new Date();
		System.out.println("Inside Save Method : "+sd.format(date));
		
		String appMessage = actionRequest.getParameter("appMessage");
		String appTo = actionRequest.getParameter("appTo");
		//String appTo = "test";
		System.out.println("appMessage : "+appMessage);
		System.out.println("App to : "+appTo);
		System.out.println("App from : "+themeDisplay.getUserId());
		
		User user = UserLocalServiceUtil.getUserByScreenName(themeDisplay.getCompanyId(), appTo);
		post message = postLocalServiceUtil.createpost(CounterLocalServiceUtil.increment());
		message.setAppTo(user.getUserId());
		message.setAppBy(themeDisplay.getUserId());
		message.setAppMessage(appMessage);
		message.setAppDate(sd.format(date));
		message = postLocalServiceUtil.addpost(message);
		
		System.out.println("Appreciation ID : "+message.getId());
		String notificationMsg = "An Appreciation has been posted on your wall";
		
		sendNotification(actionRequest, actionResponse, user.getUserId(),serviceContext,themeDisplay,notificationMsg);
		
	}
	
	public void postReply(ActionRequest actionRequest,ActionResponse actionResponse) throws ParseException, PortalException, IOException
	{
		ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		String replyMessage = actionRequest.getParameter("replyMessage");
		System.out.println("replyMessage : "+replyMessage);
		long id = ParamUtil.getLong(actionRequest, "id");
		System.out.println("id : "+id);
		long appby = ParamUtil.getLong(actionRequest,"appby");
		System.out.println("appby : "+appby);
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		sd.setTimeZone(TimeZone.getTimeZone("IST"));
	    Date date = new Date();
	    
		replied reply = repliedLocalServiceUtil.createreplied(CounterLocalServiceUtil.increment());
		reply.setRepliedOnPost(id);
		reply.setRepliedTo(appby);
		reply.setRepliedBy(themeDisplay.getUserId());
		reply.setRepliedMessage(replyMessage);
		reply.setRepliedDate(sd.format(date));
		
		reply = repliedLocalServiceUtil.addreplied(reply);
		
		System.out.println("replied Id : "+reply.getId() +" : "+date);
		
		String notificationMsg = "A reply to your Appreciation has been posted";
		
		sendNotification(actionRequest, actionResponse, appby,serviceContext,themeDisplay,notificationMsg);
		
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");

		String portletName = portletConfig.getPortletName();

		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
				portletName + "_WAR_" + portletName + "portlet",
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

		successPageURL.setParameter("jspPage", "/view.jsp");
		actionResponse.sendRedirect(successPageURL.toString());
	}
	
	public void sendNotification(ActionRequest actionRequest, ActionResponse actionResponse, long userid, ServiceContext serviceContext,ThemeDisplay themeDisplay,String notificationMsg)
	 {
		try
		{
			String url = null;
			if (themeDisplay.getURLCurrent().indexOf("?") != -1) {
				int count = themeDisplay.getURLCurrent().indexOf("?");
				url = themeDisplay.getURLCurrent().substring(0, count);
				System.out.println("URL : "+url);
			} else {
				url = themeDisplay.getURLCurrent();
			}
			String urllink = themeDisplay.getPortalURL() + url;
			
		boolean flag = false;
		com.liferay.portal.kernel.json.JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
		payloadJSON.put("userId", userid);
		payloadJSON.put("url", urllink);
		payloadJSON.put("notificationText", notificationMsg);
		System.out.println("Pay Load : " + payloadJSON);
		UserNotificationEvent event = UserNotificationEventLocalServiceUtil.addUserNotificationEvent(userid,
				"ASHISH_SHRIKANT", (new Date()).getTime(), userid, payloadJSON.toString(), false, serviceContext);
		System.out.println("UserNotificationEvent : " + event);
		
		System.out.println(event.getUserNotificationEventId());
		
		flag = postLocalServiceUtil.insertNotificationData(1, 3, "appreciation_post", 1, 1, event.getUserNotificationEventId());
		System.out.println("Flag : " + flag);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}
}
