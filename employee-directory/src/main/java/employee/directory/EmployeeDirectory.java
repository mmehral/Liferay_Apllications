package employee.directory;


import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.social.networking.model.WallEntry;
import com.liferay.social.networking.service.WallEntryLocalServiceUtil;

import java.io.IOException;
import java.util.Date;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.ProcessAction;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

public class EmployeeDirectory extends MVCPortlet{
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		System.out.println("Hiiiiiiiiiiiiiiiiiiii");
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	public void processAction(ActionRequest actionRequest,ActionResponse actionResponse)
	{
		try
		{
		System.out.println("Inside Wish method");
		
		long userIds = ParamUtil.getLong(actionRequest,"userName");	
		
		String type = ParamUtil.getString(actionRequest,"type");
		
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
			  
		System.out.println("wishedBy User ID : "+themeDisplay.getUserId());
		System.out.println("wishedTo User ID : "+userIds);
		
		String message = actionRequest.getParameter("personalMessage");
		System.out.println("Message : "+message);
		
		Group group = GroupLocalServiceUtil.getUserGroup(themeDisplay.getCompanyId(), userIds);

		try
		{
		WallEntry wallentry = WallEntryLocalServiceUtil.createWallEntry(CounterLocalServiceUtil.increment());
		wallentry.setGroupId(group.getGroupId());
		wallentry.setCompanyId(themeDisplay.getCompanyId());
		wallentry.setUserId(themeDisplay.getUserId());
		wallentry.setUserName(themeDisplay.getUser().getFullName());
		wallentry.setComments(type+":"+message);
		wallentry.setCreateDate(new Date());
		wallentry.setModifiedDate(new Date());
		wallentry = WallEntryLocalServiceUtil.addWallEntry(wallentry);

		System.out.println("Birthday Wish Posted Successfully !!!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// redirect to view.jsp from popup
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");

		String portletName = portletConfig.getPortletName();
		
		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
				portletName + "_WAR_" + portletName + "portlet",
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

		successPageURL.setParameter("jspPage", "/user/details.jsp");
		actionResponse.sendRedirect(successPageURL.toString());
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}