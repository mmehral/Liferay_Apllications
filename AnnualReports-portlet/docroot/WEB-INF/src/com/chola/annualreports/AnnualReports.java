package com.chola.annualreports;

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

import com.chola.annual.model.annualreports;
import com.chola.annual.service.annualreportsLocalServiceUtil;

import com.content.model.contentupdate;
import com.content.service.contentupdateLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

public class AnnualReports  extends MVCPortlet
{
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
	try
	{
	if (resourceRequest.getResourceID().equalsIgnoreCase("DataCall")) {
		Iterator it = null;
		System.out.println("In content call....");
		//String createdate = resourceRequest.getParameter("create_Date");
		//System.out.println("create date....." + createdate);
		//String dt = dateFormat.format(dateFormat1.parse(createdate));
		//System.out.println("Date======" + dt);
		List<String> list = annualreportsLocalServiceUtil.getdata();
		System.out.println("size of list of date..."+list.size());
		if (list.size() != 0) 
		{
			it = list.iterator();
			JSONArray jArray = new JSONArray();
			PrintWriter writer = resourceResponse.getWriter();

			while (it.hasNext()) {
				Object[] object = (Object[]) it.next();
				JSONObject obj = new JSONObject();
				obj.put("id_", object[0].toString());
				obj.put("details", object[1].toString());
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
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public void updateAnnualReports(ActionRequest actionRequest,ActionResponse actionResponse)
	{
		System.out.println("Inside AnnualReports"); 
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		//String details = actionRequest.getParameter("details");
		String details = ParamUtil.getString(actionRequest, "content");
		System.out.println("details="+details); 
		
		/*if(details.equalsIgnoreCase("") || details.length()>=1)
		{
			System.out.println("ck editor data null>>>>>>");
			SessionErrors.add(actionRequest, "error-key1");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			actionResponse.setRenderParameter("jspPage","/jsp/addannualreports.jsp");
		}*/
		
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		Date date = new Date();
		long uniqueContentId = Long.parseLong(df2.format(date));
		
		String currentPageUrl=themeDisplay.getURLCurrent();
		if(currentPageUrl.contains("?"))
		{
			currentPageUrl = currentPageUrl.substring(0, currentPageUrl.indexOf("?"));
		}
		
		annualreports pr = annualreportsLocalServiceUtil.fetchannualreports(1);
		pr.setDetails(details);
		pr.setUpdatedby(themeDisplay.getUserId());
		pr.setUpdatedon(new Date());
		pr.setUniquecontentid(uniqueContentId);
	
		
		annualreportsLocalServiceUtil.updateannualreports(pr);
	    
	    System.out.println("Annual Reports Successfully Updated");
	    
	    List<String> lt=com.chola.ppcontent.service.contentupdateLocalServiceUtil.getCompany();
		Iterator it = lt.iterator();
		 Object[] notificationDetails={pr.getUniquecontentid(),1,1,"Annual Reports","New Annual Report has been added",currentPageUrl};
		
		boolean insert1=com.chola.ppcontent.service.contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
		
		while (it.hasNext()) {
			Object[] object = (Object[]) it.next();
			String businessId=object[0].toString();
			
			if(insert1){
				boolean insert2=com.chola.ppcontent.service.contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, null, "ALL", "all", "All User", pr.getUniquecontentid(), null, null, null, 0);
			}
		}
	    
	}
}



