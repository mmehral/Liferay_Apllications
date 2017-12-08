package com.chola.milestone;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.chola.milestone.service.milestoneLocalServiceUtil;
import com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

public class Milestone extends MVCPortlet{
	private static Log logger = LogFactoryUtil.getLog(Milestone.class);
	public void sendWish(ActionRequest actionRequest,ActionResponse actionResponse) throws NumberFormatException, PortalException, IOException
	{
		try
		{
		logger.info("Inside Wish method");
		String userIds = actionRequest.getParameter("userName");
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Long wishedBy = themeDisplay.getUserId();
		
		logger.info("wishedBy User ID : "+wishedBy);
		
		String message = actionRequest.getParameter("personalMessage");
		logger.info("Personal Message is  : "+message);
		 String empid = "test";
		    if(!(themeDisplay.getUser().getScreenName().equalsIgnoreCase("test")))
		    {
		    	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(themeDisplay.getUser().getScreenName());
		    }
		    
		String postedBy="test";
	    if(!(themeDisplay.getUser().getScreenName().equalsIgnoreCase("test")))
	    {
	    	 postedBy = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(themeDisplay.getUser().getScreenName());
	    }
	    
		boolean flag = milestoneLocalServiceUtil.insertData(message,postedBy,empid);
		
			//User user = UserLocalServiceUtil.getUserByScreenName(themeDisplay.getCompanyId(), userIds);
			//logger.info("Posted on : "+user.getUserId());
			//boolean flag = milestoneLocalServiceUtil.insertData(message,String.valueOf(themeDisplay.getUserId())));
			//logger.info("User Id : "+user.getUserId());
			if(flag)
			{
				logger.info("Success");
			}
			else
			{
				logger.info("Failed");
			}
			
		
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");

		String portletName = portletConfig.getPortletName();
		
		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
				portletName + "_WAR_" + portletName + "portlet",
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

		successPageURL.setParameter("jspPage", "/view.jsp");
		actionResponse.sendRedirect(successPageURL.toString());
		
		
		}
		catch (Exception e) {
			logger.error("Error",e);
		}
	}
		
	
}
