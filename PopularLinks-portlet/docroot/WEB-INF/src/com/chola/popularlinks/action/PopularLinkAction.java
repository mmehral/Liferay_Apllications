package com.chola.popularlinks.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.popularlinks.model.externallinks;
import com.chola.popularlinks.model.popularlinks;
import com.chola.popularlinks.service.externallinksLocalServiceUtil;
import com.chola.popularlinks.service.popularlinksLocalServiceUtil;
import com.chola.popularlinks.service.impl.externallinksLocalServiceImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

public class PopularLinkAction extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			
		if (resourceRequest.getResourceID().equalsIgnoreCase("DeleteLink")) {
  
			String id=resourceRequest.getParameter("val1");
				System.out.println("Id : " + id);
				popularlinksLocalServiceUtil.deletepopularlinks(Long.parseLong(id));
				PrintWriter writer = resourceResponse.getWriter();
				writer.println("DDDD");
				System.out.println("Successfully deleted........");
		}
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("HitCount")) {
			System.out.println("Inside Hit Count");
			boolean flag = false;
			String url = null;
			
					// Step 1 :- Check for URL Pattern..............
					if (themeDisplay.getURLCurrent().indexOf("?") != -1) {
						int count = themeDisplay.getURLCurrent().indexOf("?");
						url = themeDisplay.getURLCurrent().substring(0, count);
						
					} else {
						url = themeDisplay.getURLCurrent();
					}
					System.out.println("URL : "+url);
					flag = popularlinksLocalServiceUtil.findurl(url, themeDisplay.getUserId());
					int urlength = url.length();
					int urlcount = url.lastIndexOf("/");
					String tag = url.substring(urlcount + 1, urlength);
					System.out.println("Tag.............." + tag);
					if(!url.equals("/") && !url.equals("/web/guest") && !url.equals("/web/guest/home")){

						if (flag) 
						{

							Object[] value = popularlinksLocalServiceUtil.getcount(url, themeDisplay.getUserId());
							System.out.println(value[0]);
							System.out.println(value[1]);
							BigInteger id = (BigInteger) value[0];
							BigInteger count = (BigInteger) value[1];
							long id1 = id.longValue();
							long count1 = count.longValue();

							popularlinks urllink = popularlinksLocalServiceUtil.fetchpopularlinks(id1);
							urllink.setCount(count1 + 1);
							urllink.setCreateDate(new Date());
							urllink = popularlinksLocalServiceUtil.updatepopularlinks(urllink);
						} else 
						{
							System.out.println("New Records Entry.............");
							popularlinks link = popularlinksLocalServiceUtil
									.createpopularlinks(CounterLocalServiceUtil.increment());
							link.setUrl(url);
							link.setUserid(themeDisplay.getUserId());
							link.setTag(tag);
							link.setCreateDate(new Date());
							link.setFlag(1);
							link.setCount(1);
							link = popularlinksLocalServiceUtil.addpopularlinks(link);
						}

					}
		
			}
		
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteExternal(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("External Links...........");
		try {
			long id = ParamUtil.getLong(actionRequest, "id");
			System.out.println("Id : " + id);

			popularlinksLocalServiceUtil.deletepopularlinks(id);

			System.out.println("Successfully deleted........");
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
