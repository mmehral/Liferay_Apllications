package com.chola.TodayChola.Action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.TodaycholaNews.model.TodayCholaNews;
import com.chola.TodaycholaNews.service.TodayCholaNewsLocalServiceUtil;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

public class CholaNewsMainAction extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			if (resourceRequest.getResourceID().equalsIgnoreCase("ContentCall")) {
				Iterator it = null;
				String createdate = resourceRequest.getParameter("create_Date");
				System.out.println("create date....." + createdate);
				//String dt = dateFormat.format(dateFormat1.parse(createdate));
				//System.out.println("Date======" + dt);
				List<String> list = TodayCholaNewsLocalServiceUtil.getContent(createdate);
				System.out.println("size of list of date..."+list.size());
				if (list.size() != 0) 
				{
					it = list.iterator();
					JSONArray jArray = new JSONArray();
					PrintWriter writer = resourceResponse.getWriter();

					while (it.hasNext()) {
						Object[] object = (Object[]) it.next();
						JSONObject obj = new JSONObject();
						obj.put("user_id", object[0].toString());
						obj.put("content", object[2].toString());
						jArray.add(obj);

					}

					System.out.println(jArray);
					writer.print(jArray);
				} 
				else 
				{
					System.out.println("no industry news for this date...");
					JSONArray jArray = new JSONArray();
					PrintWriter writer = resourceResponse.getWriter();
					
					
					
						JSONObject obj = new JSONObject();
						obj.put("user_id", 1);
						obj.put("content", "No Industry News Found for Selected Date");
						jArray.add(obj);

				

					System.out.println(jArray);
					writer.print(jArray);

				}

				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (resourceRequest.getResourceID().equalsIgnoreCase("ContentNewsCall")) {
				// String
				// createdate=resourceRequest.getParameter("create_Date");
				// System.out.println("create date....."+createdate);
				List<String> list = TodayCholaNewsLocalServiceUtil.getContentNews();
				System.out.println(list.size());
				Iterator it = list.iterator();
				JSONArray jArray = new JSONArray();
				PrintWriter writer = resourceResponse.getWriter();

				while (it.hasNext()) {
					Object[] object = (Object[]) it.next();
					JSONObject obj = new JSONObject();
					obj.put("user_id", object[0].toString());
					obj.put("content", object[2].toString());
					jArray.add(obj);

				}

				System.out.println(jArray);
				writer.print(jArray);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public void industryAction(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("KIIIIIIIIIIIIIII");
		System.out.println("Industry News....");
		String content = ParamUtil.getString(actionRequest, "content");
		String title = actionRequest.getParameter("title");
		String createDate = actionRequest.getParameter("createDate");
		TodayCholaNews news = TodayCholaNewsLocalServiceUtil
				.createTodayCholaNews(CounterLocalServiceUtil.increment());
		news.setTitle(title);
		news.setContent(content);
		news.setCreatedate(createDate);
		news = TodayCholaNewsLocalServiceUtil.addTodayCholaNews(news);
		System.out.println("SAVED....");

	}
	
	public void deleteindustrynews(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		System.out.println("Delete Vendor======");
		long referenceId = ParamUtil.getInteger(actionRequest, "id");
		System.out.println("referenceId===" + referenceId);
		if (referenceId >= 01) {
		
	 	try {
	 		TodayCholaNewsLocalServiceUtil.deleteTodayCholaNews(referenceId);
	 		
				System.out.println("your deleted successfully");
				actionResponse.setRenderParameter("jspPage","/html/show.jsp");
			
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	}
	public void addComments(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("Comment=======");

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			System.out.println("Comment added Successfully..............");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
