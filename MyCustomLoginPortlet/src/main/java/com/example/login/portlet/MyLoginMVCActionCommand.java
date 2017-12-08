package com.example.login.portlet;

import java.util.Base64;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.security.auth.session.AuthenticatedSessionManagerUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

@Component(
	property = {
		"javax.portlet.name=MyLoginPortlet",
		"mvc.command.name=/login/login"
	},
	service = MVCActionCommand.class
)
public class MyLoginMVCActionCommand extends BaseMVCActionCommand {
	private static final String ALPHA_NUMERIC_STRING = "!@#$%^&*()_+ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	@Override
	protected void doProcessAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
		
		HttpServletRequest request = PortalUtil.getOriginalServletRequest(
			PortalUtil.getHttpServletRequest(actionRequest));
		
		HttpServletResponse response = PortalUtil.getHttpServletResponse(
			actionResponse);
		
		
		
		String login = ParamUtil.getString(actionRequest, "login");
		String password = actionRequest.getParameter("password");
String randomString=randomAlphaNumeric();

String newPass=password+randomString;

String asB64 = Base64.getEncoder().encodeToString(newPass.getBytes("utf-8"));
System.out.println("Encoded String"+asB64);

/*byte[] asBytes = Base64.getDecoder().decode(asB64);
String dsB64=new String(asBytes, "utf-8");
System.out.println("Decoded String : "+dsB64); // And the output is: some string

System.out.println("Actual : "+dsB64.substring(0, dsB64.length() - 14));*/


		
	    response.setContentType("text/html");  
	    Cookie ck=new Cookie("sessionmsexchange",asB64);//creating cookie object  
	    response.addCookie(ck);//adding cookie in the response  
	    
		boolean rememberMe = ParamUtil.getBoolean(actionRequest, "rememberMe");
		String authType = CompanyConstants.AUTH_TYPE_SN;
		
		AuthenticatedSessionManagerUtil.login(
			request, response, login, password, rememberMe, authType);
		
		actionResponse.sendRedirect(themeDisplay.getPathMain());
	}
	
	
	
	public static String randomAlphaNumeric() {
		int count=14;
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
		builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
		}

}
