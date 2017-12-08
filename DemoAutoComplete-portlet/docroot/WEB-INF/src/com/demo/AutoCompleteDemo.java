package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

public class AutoCompleteDemo extends MVCPortlet {

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
		if (cmd.equals("get_users")) {
		 getUsers(resourceRequest, resourceResponse);
	}
}
	
	private void getUsers(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
		com.liferay.portal.kernel.json.JSONArray usersJSONArray = JSONFactoryUtil.createJSONArray();
		ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject userJSON=null;
		try {
		List<User> userList=UserLocalServiceUtil.getUsers(0,
		UserLocalServiceUtil.getCompanyUsersCount(themeDisplay.getCompanyId()));
		                           for(User user:userList){
		userJSON=JSONFactoryUtil.createJSONObject();
		userJSON.put("userId",user.getUserId());
		userJSON.put("email",user.getEmailAddress());
		userJSON.put("firstName",user.getFirstName());
		usersJSONArray.put(userJSON);
		}
		} catch (Exception e) {
		}
		PrintWriter out=resourceResponse.getWriter();
		out.println(usersJSONArray.toString());
		}
}


