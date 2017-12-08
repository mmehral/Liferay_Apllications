package com.chola.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.apache.catalina.connector.Request;

import com.chola.app.model.post;
import com.chola.app.service.postLocalService;
import com.chola.app.service.postLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.messaging.proxy.MessageValuesThreadLocal;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

public class Appreciation extends MVCPortlet{

	public void save(ActionRequest actionRequest,ActionResponse actionResponse) throws ParseException
	{
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		sd.setTimeZone(TimeZone.getTimeZone("IST"));
	    Date date = new Date();
		System.out.println("Inside Save Method : "+sd.format(date));
		
		String appMessage = actionRequest.getParameter("appMessage");
		
		System.out.println("appMessage : "+appMessage);
		
		post message = postLocalServiceUtil.createpost(CounterLocalServiceUtil.increment());
		message.setAppTo(themeDisplay.getURLHome());
		message.setAppBy(themeDisplay.getUser().getScreenName());
		message.setAppMessage(appMessage);
		message.setAppDate(sd.parse(sd.format(date)));
		message = postLocalServiceUtil.addpost(message);
		
		System.out.println("Appreciation ID : "+message.getId());
		
	}
}
