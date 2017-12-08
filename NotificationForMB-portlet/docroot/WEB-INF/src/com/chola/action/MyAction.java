package com.chola.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

public class MyAction extends MVCPortlet {

	
	public static List<UserNotificationEvent> getDeliveredMessageBoard(long UserId){
		
		try{	
			
			
	List<UserNotificationEvent> allList= UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEvents(UserId, UserNotificationDeliveryConstants.TYPE_WEBSITE, true);
	List<UserNotificationEvent> mbList=new ArrayList<UserNotificationEvent>();

	for(UserNotificationEvent unv:allList){

		String portletType=unv.getType();
		boolean archived=unv.getArchived();
		
		if(portletType.equalsIgnoreCase("com_liferay_message_boards_web_portlet_MBPortlet")){
			if(!archived){
			mbList.add(unv);
			}
			}
	}
	return mbList;
		}catch (Exception e) {
	e.printStackTrace();
	return null;
		}
		}
	
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		if (resourceRequest.getResourceID().equalsIgnoreCase("myMBList")) {
		try {
		PrintWriter writer;
		writer = resourceResponse.getWriter();
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
	                                    long userId = themeDisplay.getUserId();
			System.out.println("In MB Notification List");
			List<UserNotificationEvent> mbList=MyAction.getDeliveredMessageBoard(themeDisplay.getUserId());
			JSONArray finalOb = new JSONArray();
			JSONObject objF = new JSONObject();
			for(UserNotificationEvent unv:mbList){
			JSONObject obj = new JSONObject();
			obj.put("event_id", unv.getUserNotificationEventId());
			obj.put("event_payload", unv.getPayload());
			obj.put("event_timestamp", unv.getTimestamp());
			finalOb.add(obj);
		}
			objF.put("data", finalOb);
			writer.print(objF);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("myMBMarkAsRead")) {
			System.out.println("Mark As Read Method ");
			System.out.println(resourceRequest.getParameter("eventId"));
			String eventId=resourceRequest.getParameter("eventId");
			
			UserNotificationEvent unv=UserNotificationEventLocalServiceUtil.fetchUserNotificationEvent(Long.parseLong(eventId));
			unv.setArchived(true);
			unv=UserNotificationEventLocalServiceUtil.updateUserNotificationEvent(unv);
		}
	}
}
