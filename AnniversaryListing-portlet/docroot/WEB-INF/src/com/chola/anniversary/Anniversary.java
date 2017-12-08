package com.chola.anniversary;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.chola.anniversary.service.anniversarywishLocalServiceUtil;
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

public class Anniversary extends MVCPortlet{
	private static Log logger = LogFactoryUtil.getLog(Anniversary.class);
	
	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		logger.info("Comment=======");

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			logger.info("Comment added Successfully..............");
		} catch (Exception e) {
			logger.error("Error",e);
		}
	}
	
	public void sendWish(ActionRequest actionRequest,ActionResponse actionResponse) throws NumberFormatException, PortalException, IOException
	{
		try
		{
		logger.info("Inside Wish method");
		//get the emnpid to whom you want to wish
		String userIds = actionRequest.getParameter("userName");
		logger.info("userIds  : "+userIds);
		
		//message that you want to post
		String message  = actionRequest.getParameter("personalMessage");
		logger.info("Message is  : "+message);
		
		//get loggedin user information
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Long wishedBy = themeDisplay.getUserId();
		logger.info("wishedBy User ID : "+wishedBy);

		//get user details to whom want to wish
		//User user = UserLocalServiceUtil.getUserByScreenName(themeDisplay.getCompanyId(),userIds);
		//logger.info("Posted By : "+user.getUserId());
		
		 String empid = "test";
		    if(!(themeDisplay.getUser().getScreenName().equalsIgnoreCase("test")))
		    {
		    	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(themeDisplay.getUser().getScreenName());
		    }
		//insert record for employee anniversary wish
		    
			String postedBy="test";
		    if(!(themeDisplay.getUser().getScreenName().equalsIgnoreCase("test")))
		    {
		    	 postedBy = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(themeDisplay.getUser().getScreenName());
		    }
		    
			boolean flag = anniversarywishLocalServiceUtil.insertData(message,postedBy,empid);
		    
		//boolean flag = anniversarywishLocalServiceUtil.insertData(message,String.valueOf(themeDisplay.getUserId()),empid);
		//logger.info("User Id : "+user.getUserId());
			if(flag)
			{
				logger.info("Success");
			}
			else
			{
				logger.error("Failed");
			}
		
		//redirect user to view.jsp
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
