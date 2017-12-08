package com.chola.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.calendar.model.EmpInfoEntity;
import com.chola.calendar.service.EmpInfoEntityLocalService;
import com.chola.calendar.service.EmpInfoEntityLocalServiceUtil;
import com.chola.calendar.service.eventcalendarLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;


public class EventsCalendar extends MVCPortlet {
	
	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("Comment");

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			System.out.println("comment Added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
@Override
public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {
	
	try {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long userId = themeDisplay.getUserId();
		
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	List<String> lt = eventcalendarLocalServiceUtil.getDetails(userId);

	Iterator it = lt.iterator();

	 JSONObject obj = new JSONObject();
	 JSONArray jArray = new JSONArray();
	 PrintWriter writer = resourceResponse.getWriter();

	 
	 while (it.hasNext()) 
	 {
	 Object[] object = (Object[]) it.next();
	 JSONObject obj1 = new JSONObject();
	 obj1.put("id", object[0].toString());
	 obj1.put("name", object[1].toString());
	 obj1.put("startdate",((object[2]==null || object[2].toString().equalsIgnoreCase(""))) ? "" : sdf.format(sdf.parse(object[2].toString())));
	 obj1.put("enddate",((object[3]==null || object[3].toString().equalsIgnoreCase(""))) ? "" : sdf.format(sdf.parse(object[3].toString())));
	 obj1.put("color", ((object[4]==null || object[4].toString().equalsIgnoreCase(""))) ? "" : (object[4].toString()));
	 obj1.put("url", ((object[5]==null || object[5].toString().equalsIgnoreCase(""))) ? "" : (object[5].toString()));
	 jArray.add(obj1);
	 }

	 System.out.println(jArray);
	 obj.put("monthly", jArray);
	 System.out.println(obj);
	 writer.print(obj);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
