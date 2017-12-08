package com.chola.popular;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.popular.model.popularlinks;
import com.popular.service.popularlinksLocalServiceUtil;


public class PopularLinks extends MVCPortlet {
	
	private static Log logger = LogFactoryUtil.getLog(PopularLinks.class);
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			logger.info("Inside ServeResource");
			
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			
		if ("DeleteLink".equalsIgnoreCase(resourceRequest.getResourceID())) {
  
			String id=resourceRequest.getParameter("val1");
				logger.info("Id : " + id);
				popularlinksLocalServiceUtil.deletepopularlinks(Long.parseLong(id));
				PrintWriter writer = resourceResponse.getWriter();
				writer.println("DDDD");
				logger.info("Successfully deleted........");
		}
		
		if ("HitCount".equalsIgnoreCase(resourceRequest.getResourceID())) {
			logger.info("Inside Hit Count");
			boolean flag = false;
			String url = null;
			
					if (themeDisplay.getURLCurrent().indexOf("?") != -1) {
						int count = themeDisplay.getURLCurrent().indexOf("?");
						url = themeDisplay.getURLCurrent().substring(0, count);
						
					} else {
						url = themeDisplay.getURLCurrent();
					}
					logger.info("URL : "+url);
					flag = popularlinksLocalServiceUtil.findurl(url, themeDisplay.getUserId());
					int urlength = url.length();
					int urlcount = url.lastIndexOf("/");
					String tag = url.substring(urlcount + 1, urlength);
					logger.info("Tag.............." + tag);
					if(!url.equals("/") && !url.equals("/web/guest") && !url.equals("/web/guest/home")){

						if (flag) 
						{

							Object[] value = popularlinksLocalServiceUtil.getcount(url, themeDisplay.getUserId());
							logger.info(value[0]);
							logger.info(value[1]);
							BigInteger id = (BigInteger) value[0];
							BigInteger count = (BigInteger) value[1];
							long id1 = id.longValue();
							long count1 = count.longValue();

							popularlinks urllink = popularlinksLocalServiceUtil.fetchpopularlinks(id1);
							urllink.setCount(count1 + 1);
							urllink.setCreateDate(new Date());
							popularlinksLocalServiceUtil.updatepopularlinks(urllink);
						} else 
						{
							logger.info("New Records Entry.............");
							popularlinks link = popularlinksLocalServiceUtil
									.createpopularlinks(CounterLocalServiceUtil.increment());
							link.setUrl(url);
							link.setUserid(themeDisplay.getUserId());
							link.setTag(tag);
							link.setCreateDate(new Date());
							link.setFlag(1);
							link.setCount(1);
							popularlinksLocalServiceUtil.addpopularlinks(link);
						}

					}
		
			}
		
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
		} catch (Exception e) {
			logger.error("Error",e);
		}
	}
}
