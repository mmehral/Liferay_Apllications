package com.chola.reports;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.chola.quarterly.model.quarterlyreports;
import com.chola.quarterly.service.quarterlyreportsLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;

public class QuarterlyFinancials  extends MVCPortlet{
	
	public void updateQuaterlyFinancials(ActionRequest actionRequest,ActionResponse actionResponse)
	{
		System.out.println("Inside updateQuaterlyFinancials");
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		//String details = actionRequest.getParameter("details");
		String details = ParamUtil.getString(actionRequest, "content");
		
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		Date date = new Date();
		long uniqueContentId = Long.parseLong(df2.format(date));
		
		String currentPageUrl=themeDisplay.getURLCurrent();
		if(currentPageUrl.contains("?"))
		{
			currentPageUrl = currentPageUrl.substring(0, currentPageUrl.indexOf("?"));
		}
		
		quarterlyreports pr = quarterlyreportsLocalServiceUtil.fetchquarterlyreports(1);
		pr.setDetails(details);
		pr.setUpdatedby(themeDisplay.getUserId());
		pr.setUpdatedon(new Date());
		pr.setUniquecontentid(uniqueContentId);
		quarterlyreportsLocalServiceUtil.updatequarterlyreports(pr);
	    
	    System.out.println("Quaterlyv Financials Successfully Updated");
	    
	    List<String> lt=contentupdateLocalServiceUtil.getCompany();
		Iterator it = lt.iterator();
		 Object[] notificationDetails={pr.getUniquecontentid(),1,1,"Quarterly Financials","New Quarterly Financial has been added",currentPageUrl};
		
		boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
		
		while (it.hasNext()) {
			Object[] object = (Object[]) it.next();
			String businessId=object[0].toString();
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, null, "ALL", "all", "All User", pr.getUniquecontentid(), null, null, null, 0);
			}
		}
	    
	}

}
