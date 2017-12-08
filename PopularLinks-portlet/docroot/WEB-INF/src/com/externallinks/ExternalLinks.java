package com.externallinks;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.popularlinks.model.popularlinks;

import com.chola.popularlinks.service.popularlinksLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ExternalLinks
 */
public class ExternalLinks extends MVCPortlet {
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		
		try {
		List<Object[]> lt=popularlinksLocalServiceUtil.getExtLinks();
			
		Iterator it = lt.iterator();

		 JSONObject obj = new JSONObject();
		 JSONArray jArray = new JSONArray();
		 PrintWriter writer = resourceResponse.getWriter();

		 
		 while (it.hasNext()) 
		 {
		 Object object = (Object) it.next();
		 JSONObject obj1 = new JSONObject();
		 obj1.put("tag", object.toString());
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
	
	public void external(ActionRequest actionRequest,
			ActionResponse actionResponse) throws SystemException {
		boolean flag = false;
		System.out.println("EXTERNAL");
		String external = ParamUtil.getString(actionRequest, "external");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		flag = popularlinksLocalServiceUtil.findexternalurl(external, themeDisplay.getUserId());
		if (!flag) {
			popularlinks urllink = popularlinksLocalServiceUtil.createpopularlinks(CounterLocalServiceUtil.increment());
			urllink.setUrl(external);
			urllink.setUserid(themeDisplay.getUserId());
			urllink.setCount(1);
			urllink.setTag(external);
			urllink.setFlag(2);
			urllink.setCreateDate(new Date());
			urllink = popularlinksLocalServiceUtil.addpopularlinks(urllink);
			
		}else{
			System.out.println("ERROR");
			SessionErrors.add(actionRequest , "error");
		}
	
	}

	public void addExternalURL(ActionRequest actionRequest,ActionResponse actionResponse){
		boolean flag = false;
		System.out.println("addExternalURL======");
		String tags=ParamUtil.getString(actionRequest, "tags");
		System.out.println("tags===="+tags);
		String url=popularlinksLocalServiceUtil.externalurl(tags);
		System.out.println("URL===="+url);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		flag = popularlinksLocalServiceUtil.findexternalurl(url, themeDisplay.getUserId());
		if (!flag) {
			popularlinks urllink = popularlinksLocalServiceUtil.createpopularlinks(CounterLocalServiceUtil.increment());
			urllink.setUrl(url);
			urllink.setUserid(themeDisplay.getUserId());
			urllink.setCount(1);
			urllink.setTag(tags);
			urllink.setFlag(2);
			urllink.setCreateDate(new Date());
			urllink = popularlinksLocalServiceUtil.addpopularlinks(urllink);
			
		}else{
			System.out.println("ERROR");
			SessionErrors.add(actionRequest , "error");
		}
		
		
	}
	
	
}
