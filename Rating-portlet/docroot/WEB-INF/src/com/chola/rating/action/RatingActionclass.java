package com.chola.rating.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.struts.PortletActionInvoker;
import com.liferay.portal.kernel.util.ClassResolverUtil;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.PortalClassInvoker;

public class RatingActionclass extends MVCPortlet {

	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("Comment=======");

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			System.out.println("DSADSADASDASDAssssSD");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
