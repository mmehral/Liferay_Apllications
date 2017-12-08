package com.chola.messagewall;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class MessageWall
 */
public class MessageWall extends MVCPortlet {
 
private static Log logger = LogFactoryUtil.getLog(MessageWall.class);
	
	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		logger.info("Comment=======");

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			logger.info("Comment added Successfully..............");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
}
