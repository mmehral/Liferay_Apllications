package com.external;

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

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.popular.model.popularlinks;
import com.popular.service.popularlinksLocalServiceUtil;

/**
 * Portlet implementation class ExternalLink
 */
public class ExternalLink extends MVCPortlet {
 
	private static Log logger = LogFactoryUtil.getLog(ExternalLink.class);
	
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

		 obj.put("monthly", jArray);
		 logger.info(obj);
		 writer.print(obj);
		} catch (Exception e) {
			logger.error("Error",e);
		}
	}
	
	public void deleteExternal(ActionRequest actionRequest, ActionResponse actionResponse) {
		logger.info("External Links...........");
		try {
			long id = ParamUtil.getLong(actionRequest, "id");
			logger.info("Id : " + id);

			popularlinksLocalServiceUtil.deletepopularlinks(id);

			logger.info("Successfully deleted........");
		} catch (PortalException e) {
			logger.error("Error",e);
		}
	}
	
	public void addExternalURL(ActionRequest actionRequest,ActionResponse actionResponse){
		boolean flag = false;
		logger.info("addExternalURL======");
		String tags=ParamUtil.getString(actionRequest, "tags");
		logger.info("tags===="+tags);
		String url=popularlinksLocalServiceUtil.externalurl(tags);
		logger.info("URL===="+url);
		
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
			popularlinksLocalServiceUtil.addpopularlinks(urllink);
			
		}else{
			logger.info("ERROR");
			SessionErrors.add(actionRequest , "error");
		}
		
		
	}
}
