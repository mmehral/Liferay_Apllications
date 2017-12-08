package com.chola.notificationcategorization.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.notificationcategorization.service.NoticationCategoryCountLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

public class NotificationCategorizationAction extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		if (resourceRequest.getResourceID().equalsIgnoreCase("NotificationList")) {
			try {
				int val = 0;
				System.out.println("NotificationList MEthod........");
				String myVal = resourceRequest.getParameter("val");
				ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

				System.out.println("Resource Val : : : " + myVal);
				System.out.println("User Id : : : " + themeDisplay.getUserId());
				
				List<Object[]> lt = NoticationCategoryCountLocalServiceUtil
						.getNotficationCategoryList(themeDisplay.getUserId(), myVal);
				System.out.println("List Payload : " + lt);
				Iterator it = lt.iterator();
				JSONArray finalOb = new JSONArray();
				for (Object[] obje : lt) {
					JSONObject obj = new JSONObject();
					System.out.println("First Object : " + obje[0].toString());
					System.out.println("Seconf Object : " + obje[1].toString());
					obj.put("id", obje[0]);
					obj.put("user_id", obje[1]);
					obj.put("content_id", obje[2].toString());
					obj.put("content_type", obje[3]);
					obj.put("notification_text", obje[4]);
					obj.put("url", obje[5]);
					finalOb.add(obj);
				}

				System.out.println("IT-----" + lt);
				PrintWriter writer = resourceResponse.getWriter();
				System.out.println("Final Obj : " + finalOb);
				System.out.println(lt.toString());
//				JSONObject js=new JSONObject();
//				js.put("data", finalOb);
//				System.out.println("JS : "+js);
				writer.print(finalOb);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (resourceRequest.getResourceID().equalsIgnoreCase("EventId")) {

			boolean flag = false;
			System.out.println("EVENT ID Method");
			String eventId = resourceRequest.getParameter("val1");
			String tableuserId = resourceRequest.getParameter("val2");
			String contentId = resourceRequest.getParameter("val3");
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long longEventId=0;
			long longTableuserId=0;
			long longContentId=0;
			
			if (eventId != null) {
				longEventId = Long.parseLong(eventId);
				longTableuserId = Long.parseLong(tableuserId);
				longContentId = Long.parseLong(contentId);
			}
			flag = NoticationCategoryCountLocalServiceUtil.updatenotificationstatus(2, themeDisplay.getUserId(), longEventId,longContentId,longTableuserId);
			PrintWriter writer = resourceResponse.getWriter();
			if (flag) {
				writer.print(flag);
			} else {
				writer.print(flag);
			}

		}
	}
}
