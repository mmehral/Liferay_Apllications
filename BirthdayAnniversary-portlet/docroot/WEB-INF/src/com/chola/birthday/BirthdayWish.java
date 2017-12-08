package com.chola.birthday;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import com.chola.birthday.model.predefinedmessages;
import com.chola.birthday.service.birthdaywishLocalServiceUtil;
import com.chola.birthday.service.predefinedmessagesLocalServiceUtil;
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

public class BirthdayWish extends MVCPortlet{
	private static Log logger = LogFactoryUtil.getLog(BirthdayWish.class);
	
	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {

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
		//fetch userids whom you want to wish
		String userIds = actionRequest.getParameter("userName");

		//get loggedin user information
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Long wishedBy = themeDisplay.getUserId();
		
		logger.info("wishedBy User ID : "+wishedBy);
		
		//get the message written
		String message = actionRequest.getParameter("personalMessage");
		
		//fetch user details on whom the message needs to be posted
			//User user = UserLocalServiceUtil.getUserByScreenName(themeDisplay.getCompanyId(), userIds);
			//logger.info("Posted on : "+user.getUserId());
			
			String postedBy="test";
		    if(!(themeDisplay.getUser().getScreenName().equalsIgnoreCase("test")))
		    {
		    	 postedBy = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(themeDisplay.getUser().getScreenName());
		    }
		    
			boolean flag = birthdaywishLocalServiceUtil.insertData(message,postedBy,userIds);
			
			//insert data into db
			//boolean flag = birthdaywishLocalServiceUtil.insertData(message,String.valueOf(themeDisplay.getUserId()),String.valueOf(user.getUserId()));
			//logger.info("User Id : "+user.getUserId());
			//if success
			if(flag)
			{
				logger.info("Success");
			}
			//if failed
			else
			{
				logger.info("Failed");
			}
			
		// redirect to view.jsp from popup
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
