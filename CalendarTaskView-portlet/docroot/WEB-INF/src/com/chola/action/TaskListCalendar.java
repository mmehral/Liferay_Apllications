package com.chola.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import microsoft.exchange.webservices.data.core.service.item.Appointment;
import microsoft.exchange.webservices.data.core.service.item.Task;
import microsoft.exchange.webservices.data.property.complex.AttendeeCollection;
import com.chola.msappointment.service.calendarmsappointmentLocalServiceUtil;
import com.chola.msexchange.FetchTask;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
  
public class TaskListCalendar extends MVCPortlet {
	private static final Log _log = LogFactoryUtil.getLog(TaskListCalendar.class);
	 
	public void configurePassword(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, IOException {
	  
		
		ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		String microsoftExPassword=ParamUtil.getString(actionRequest, "password");
		
		String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
		User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
		String domain="@cholamandalam.com";
		String actualScreenName="";
		actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(user.getScreenName());
		String userName=actualScreenName+domain;
		
		String conStatus=null;
		
		FetchTask ft=new FetchTask(serviceURL, userName, microsoftExPassword);
		conStatus=ft.checkConnection(serviceURL, userName, microsoftExPassword);
		
		if(conStatus.equals("true")){
			
			user.getExpandoBridge().setAttribute("microsoftexchangeserverpasswordsecret", microsoftExPassword);
			
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			SessionMessages.add(actionRequest, "passMatched");
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
			String portletName = portletConfig.getPortletName();

			PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
			portletName + "_WAR_" + portletName + "portlet",
			themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

			successPageURL.setParameter("jspPage", "/view.jsp");
			actionResponse.sendRedirect(successPageURL.toString());		
		}else{
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			SessionErrors.add(actionRequest, "passMismatched");
			PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
			String portletName = portletConfig.getPortletName();

			PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
			portletName + "_WAR_" + portletName + "portlet",
			themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

			successPageURL.setParameter("jspPage", "/view.jsp");
			actionResponse.sendRedirect(successPageURL.toString());		
			
		}
		}
	
	public void updateTask(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortalException {
		_log.info("In Update task");
		ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String taskId=ParamUtil.getString(actionRequest, "taskid");
		String taskSubject=ParamUtil.getString(actionRequest, "subject");
		String taskBody=ParamUtil.getString(actionRequest, "body");
		String taskStartDate=ParamUtil.getString(actionRequest, "taskStartDate");
		String taskStartTime=ParamUtil.getString(actionRequest, "taskStartTime");
		String taskDueDate=ParamUtil.getString(actionRequest, "taskEndDate");
		String taskDueTime=ParamUtil.getString(actionRequest, "taskEndTime");
		
		
		
		String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
		User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
		String domain="@cholamandalam.com";
		String actualScreenName="";
		actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(user.getScreenName());
		
		if(actualScreenName==null){
			actualScreenName="dummy";
		}
		_log.info("User's Actual Screenname from Table : "+actualScreenName);
		
		String userName=actualScreenName+domain;
		String userMicrosoftPassword=(String) user.getExpandoBridge().getAttribute("microsoftexchangeserverpasswordsecret");
		FetchTask ft=new FetchTask(serviceURL, userName, userMicrosoftPassword);
		
		String isUpdated=ft.updateTask(taskId, taskSubject, taskBody, taskStartDate+" "+taskStartTime, taskDueDate+" "+taskDueTime);
		
		if(isUpdated.equals("Success")){
			_log.info("Task updated Successfully");
		}else{
			_log.info("Something went wrong");
			
		}
		
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
		String portletName = portletConfig.getPortletName();

		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
		portletName + "_WAR_" + portletName + "portlet",
		themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

		successPageURL.setParameter("jspPage", "/view.jsp");
		actionResponse.sendRedirect(successPageURL.toString());	
	}
	
	public void deleteTask(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		_log.info("In Delete Task");
		ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String taskId=ParamUtil.getString(actionRequest, "taskid");
		
		
		String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
		User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
		String domain="@cholamandalam.com";
		String actualScreenName="";
		actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(user.getScreenName());
		
		if(actualScreenName==null){
			actualScreenName="dummy";
		}
		_log.info("User's Actual Screenname from Table : "+actualScreenName);
		
		String userName=actualScreenName+domain;
		String userMicrosoftPassword=(String) user.getExpandoBridge().getAttribute("microsoftexchangeserverpasswordsecret");
		FetchTask ft=new FetchTask(serviceURL, userName, userMicrosoftPassword);

		String isDelete = ft.deleteTask(taskId);

		if(isDelete.equals("Success")){
			_log.info("Task Deleted Successfully");
		}else{
			_log.info("Something went wrong");
		}
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
		String portletName = portletConfig.getPortletName();

		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
		portletName + "_WAR_" + portletName + "portlet",
		themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

		successPageURL.setParameter("jspPage", "/view.jsp");
		actionResponse.sendRedirect(successPageURL.toString());
	}
	
	public void updateAppointment(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortalException {
		
		ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
	_log.info("In update Appointment method");
	
	String taskId=ParamUtil.getString(actionRequest, "appointmentid");
	String taskSubject=ParamUtil.getString(actionRequest, "subject");
	String taskBody=ParamUtil.getString(actionRequest, "body");
	String[] attendeesEmailIds=ParamUtil.getParameterValues(actionRequest, "attendees");
	
	
	String emailIds = attendeesEmailIds[1].replaceAll("\\[", "").replaceAll("\\]","");
	
	_log.info("EmailIds after removing square brackets :  "+emailIds);
	
	List<String> emailIdsList = new ArrayList<String>(Arrays.asList(emailIds.split(",")));
	for(int i=0;i<emailIdsList.size();i++){
	_log.info("Email Ids : "+emailIdsList.get(i));
	}
	
	String taskStartDate=ParamUtil.getString(actionRequest, "taskStartDate");
	String taskStartTime=ParamUtil.getString(actionRequest, "taskStartTime");
	String taskDueDate=ParamUtil.getString(actionRequest, "taskEndDate");
	String taskDueTime=ParamUtil.getString(actionRequest, "taskEndTime");
	
	String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
	User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
	String domain="@cholamandalam.com";
	String actualScreenName="";
	actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(user.getScreenName());
	
	if(actualScreenName==null){
		actualScreenName="dummy";
	}
	_log.info("User's Actual Screenname from Table : "+actualScreenName);
	
	String userName=actualScreenName+domain;
	String userMicrosoftPassword=(String) user.getExpandoBridge().getAttribute("microsoftexchangeserverpasswordsecret");
	FetchTask ft=new FetchTask(serviceURL, userName, userMicrosoftPassword);
	
	String isUpdated=ft.updateAppointment(taskId, taskSubject, taskBody,emailIdsList, taskStartDate+" "+taskStartTime, taskDueDate+" "+taskDueTime);
	
	
	if(isUpdated.equals("Success")){
		_log.info("Appointment updated Successfully");
	}else{
		_log.info("Something went wrong");
		
	}
	
	PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
	String portletName = portletConfig.getPortletName();

	PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
	portletName + "_WAR_" + portletName + "portlet",
	themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

	successPageURL.setParameter("jspPage", "/view.jsp");
	actionResponse.sendRedirect(successPageURL.toString());	
	
	}
	
	public void deleteAppointment(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortalException {
		
		_log.info("In Delete Appointment");
		ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String taskId=ParamUtil.getString(actionRequest, "appointmentid");
		
		String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
		User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
		String domain="@cholamandalam.com";
		String actualScreenName="";
		actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(user.getScreenName());
		
		if(actualScreenName==null){
			actualScreenName="dummy";
		}
		_log.info("User's Actual Screenname from Table : "+actualScreenName);
		
		String userName=actualScreenName+domain;
		String userMicrosoftPassword=(String) user.getExpandoBridge().getAttribute("microsoftexchangeserverpasswordsecret");
		FetchTask ft=new FetchTask(serviceURL, userName, userMicrosoftPassword);

		String isDelete = ft.deleteAppointment(taskId);

		if(isDelete.equals("Success")){
			_log.info("Appointment Deleted Successfully");
		}else{
			_log.info("Something went wrong");
		}
		
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
		String portletName = portletConfig.getPortletName();

		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
		portletName + "_WAR_" + portletName + "portlet",
		themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

		successPageURL.setParameter("jspPage", "/view.jsp");
		actionResponse.sendRedirect(successPageURL.toString());
	}
	
	public void createTask(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
	ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
	User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
	String radioValTA=ParamUtil.getString(actionRequest, "taskApp");
	String taskSubject=ParamUtil.getString(actionRequest, "subject");
	String taskBody=ParamUtil.getString(actionRequest, "body");
	String taskStartDate=ParamUtil.getString(actionRequest, "taskStartDate");
	String taskStartTime=ParamUtil.getString(actionRequest, "taskStartTime");
	String taskDueDate=ParamUtil.getString(actionRequest, "taskEndDate");
	String taskDueTime=ParamUtil.getString(actionRequest, "taskEndTime");
	String password=(String) user.getExpandoBridge().getAttribute("microsoftexchangeserverpasswordsecret");
	
	User particularUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
	String userScreenName=particularUser.getScreenName();
	
	String actualScreenName="";
	actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(userScreenName);
	
	if(actualScreenName==null){
		actualScreenName="";
	}
	
	_log.info("Actual ScreenName from Table : "+actualScreenName);
	
	String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
	String domain="@cholamandalam.com";
	String userName=actualScreenName+domain;
	
	FetchTask ft=new FetchTask(serviceURL, userName, password);
	
	if(radioValTA.equals("task")){
		_log.info("In create task method");
	
		boolean createTaskSuccess=ft.createTask(taskSubject, taskBody, taskStartDate+" "+taskStartTime, taskDueDate+" "+taskDueTime,actionRequest);
		
		_log.info("Is Task Created : "+createTaskSuccess);
	}else if(radioValTA.equals("appointment")){
		String[] attendeesEmailIds=ParamUtil.getParameterValues(actionRequest, "attendees");
		
		_log.info(attendeesEmailIds);
		
		String emailIds = attendeesEmailIds[1].replaceAll("\\[", "").replaceAll("\\]","");
		
		_log.info("EmailIds after removing square brackets :  "+emailIds);
		
		List<String> emailIdsList = new ArrayList<>(Arrays.asList(emailIds.split(",")));
		
		for(int i=0;i<emailIdsList.size();i++){
		_log.info("Email Ids : "+emailIdsList.get(i));
		}
		
		boolean createTaskSuccess=ft.createAppointment(taskSubject, taskBody,emailIdsList, taskStartDate+" "+taskStartTime, taskDueDate+" "+taskDueTime,actionRequest);
		
		_log.info("Is appointment created successfully ? : "+createTaskSuccess);
	}
	
		//actionRequest.setAttribute("formSubmit", "fghfghfgh");
		SessionMessages.add(actionRequest, SessionMessages.KEY_SUFFIX_REFRESH_PORTLET);
		PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
		String portletName = portletConfig.getPortletName();
		PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
		portletName + "_WAR_" + portletName + "portlet",
		themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		successPageURL.setParameter("jspPage", "/view.jsp");
		successPageURL.setParameter("formSubmit", "true");
		//actionResponse.setRenderParameter("formSubmit","sdfsdfsdfsdf");
		//actionResponse.setRenderParameter("mvcPath","/view.jsp");
		actionResponse.sendRedirect(successPageURL.toString());
	
		} catch (Exception e) {
			
			_log.error(e.getMessage());
				ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
				PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
				String portletName = portletConfig.getPortletName();
				PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
				portletName + "_WAR_" + portletName + "portlet",
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
				successPageURL.setParameter("jspPage", "/view.jsp");
				actionResponse.sendRedirect(successPageURL.toString());
		}
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		
		ThemeDisplay themeDisplay=(ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		//Get User email Address Using UserLocalServiceUtil
		JSONArray jArrayForEmailList = new JSONArray();
		
		//Get User email Address Using Custom Query
		List<String> emailList=calendarmsappointmentLocalServiceUtil.getEmailIdsFromUserTable();
		for(String emailId:emailList){
			 jArrayForEmailList.add(emailId);
		}
		
		if(resourceRequest.getResourceID().equalsIgnoreCase("getAttendeesEmailIds")){
			try{
				PrintWriter writer = resourceResponse.getWriter();
				 writer.print(jArrayForEmailList);
			}catch (Exception e) {
				_log.error(e.getMessage());
			}
		}
		if (resourceRequest.getResourceID().equalsIgnoreCase("taskCalendarData")) {
			try {
				String domain="@cholamandalam.com";
				User particularUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
				String userScreenName=particularUser.getScreenName();
				JSONObject isAuthObject=new JSONObject();
				JSONArray isAuthArrayObject=new JSONArray();
				
				if(userScreenName.equals("test")){
					
					isAuthObject.put("status", "0");
					isAuthArrayObject.add(isAuthObject);
					
					JSONArray finalOb = new JSONArray();
					JSONObject objF = new JSONObject();
					JSONObject obj = new JSONObject();
					obj.put("id","");
					obj.put("name","");
					
					 String outputStart = "";
					 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
					 String outputDue = "";
					obj.put("startdate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
								: sdf.format(sdf.parse(outputStart.toString())));
					obj.put("enddate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(outputStart.toString())));
					obj.put("color", "blue");
					obj.put("url", "");
					
					finalOb.add(obj);
					objF.put("monthly", finalOb);
					objF.put("auth", isAuthArrayObject);
				
					_log.info("Test User");
					PrintWriter writer = resourceResponse.getWriter();
					writer.print(objF);
					
				}else{
						
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM");
				_log.info("In Task List Fetch Method");
				String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
				User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
				String actualScreenName="";
				actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(userScreenName);
				if(actualScreenName==null){
					actualScreenName="dummy";
				}
				_log.info("User's Actual Screenname from Table : "+actualScreenName);
				String userName=actualScreenName+domain;
				_log.info("USername to be passed to Microsoft : "+userName);
				String userMicrosoftPassword=(String) user.getExpandoBridge().getAttribute("microsoftexchangeserverpasswordsecret");
				List<Task> lt=null;
				List<Map> lt1=null;
				FetchTask ft=new FetchTask(serviceURL, userName, userMicrosoftPassword);
				 lt = FetchTask.readTask();
				 lt1=FetchTask.readAppointments();
				 String conStatus=null;
				 conStatus=ft.checkConnection(serviceURL, userName, userMicrosoftPassword);
				
				 if(conStatus.equals("true")){
				if(lt!=null||lt1!=null){
					isAuthObject.put("status", "1");
					isAuthArrayObject.add(isAuthObject);
					
					PrintWriter writer = resourceResponse.getWriter();
					JSONArray finalOb = new JSONArray();
					JSONObject objF = new JSONObject();
					
					 DateFormat inputFormat = new SimpleDateFormat("E MMM dd hh:mm:ss Z yyyy");
					 inputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
					 DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
					 outputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
					  
					for(Task task:lt){
						JSONObject obj = new JSONObject();
						obj.put("id",task.getId().toString());
						obj.put("name", task.getSubject().toString());
						
						_log.info("Task Start Date within Loop : "+task.getStartDate().toString());
						 Date dateStart = inputFormat.parse(task.getStartDate().toString());
						 
						 _log.info("Task Start Date within Loop After Parsing : "+dateStart);
						 String outputStart = outputFormat.format(dateStart);
						 
						 _log.info("Task Start Date within Loop after formatting: "+outputStart);
						 
						 Date dateDue = inputFormat.parse(task.getDueDate().toString());
						 String outputDue = outputFormat.format(dateDue);
						obj.put("startdate", outputStart);
						obj.put("enddate", outputDue);
						obj.put("color", "blue");
						obj.put("url", "#javascript;");
						String encodedString=java.net.URLEncoder.encode(task.getId().toString());
						obj.put("onclick", "editDeletTask('"+encodedString+"')");
						finalOb.add(obj);
					}
					
					for(Map list:lt1){
						
						_log.info("Insitde read appointment for loop");
						JSONObject obj = new JSONObject();
						obj.put("id", list.get("appointmentItemId"));
						obj.put("name", list.get("appointmentSubject"));
						_log.info("Appointment Start Date within Loop : "+list.get("appointmentStartTime").toString());
						 Date dateStart = inputFormat.parse(list.get("appointmentStartTime").toString());
						 
						 _log.info("Appointment Start Date within Loop After Parsing : "+dateStart);
						 String outputStart = outputFormat.format(dateStart);
						 
						 _log.info("Appointment Start Date within Loop After formatting : "+outputStart);
						 Date dateDue = inputFormat.parse(list.get("appointmentEndTime").toString());
						 String outputDue = outputFormat.format(dateDue);
						 
						 _log.info("Appointment end Date within Loop After formatting : "+outputDue);
						obj.put("startdate", outputStart);
						
						obj.put("enddate", outputDue);
						obj.put("color", "red");
						obj.put("url", "");
						String encodedString=java.net.URLEncoder.encode(list.get("appointmentItemId").toString());
						obj.put("onclick", "editDeleteAppointment('"+encodedString+"')");
						finalOb.add(obj);
					}
					
					
					objF.put("monthly", finalOb);
					objF.put("auth", isAuthArrayObject);
					writer.print(objF);
				}else{
					isAuthObject.put("status", "1");
					isAuthArrayObject.add(isAuthObject);
					
					JSONArray finalOb = new JSONArray();
					JSONObject objF = new JSONObject();
					JSONObject obj = new JSONObject();
					obj.put("id","");
					obj.put("name","");
					
					 String outputStart = "";
					 String outputDue = "";
					obj.put("startdate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
								: sdf.format(sdf.parse(outputStart.toString())));
					obj.put("enddate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(outputStart.toString())));
					obj.put("color", "blue");
					obj.put("url", "");
					finalOb.add(obj);
					objF.put("monthly", finalOb);
					objF.put("auth", isAuthArrayObject);
					PrintWriter writer = resourceResponse.getWriter();
					writer.print(objF);	
				}
				 }else{
					 isAuthObject.put("status", "0");
						isAuthArrayObject.add(isAuthObject);
						
						JSONArray finalOb = new JSONArray();
						JSONObject objF = new JSONObject();
						JSONObject obj = new JSONObject();
						obj.put("id","");
						obj.put("name","");
						
						 String outputStart = "";
						 String outputDue = "";
						obj.put("startdate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
									: sdf.format(sdf.parse(outputStart.toString())));
						obj.put("enddate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
								: sdf.format(sdf.parse(outputStart.toString())));
						obj.put("color", "blue");
						obj.put("url", "");
						finalOb.add(obj);
						objF.put("monthly", finalOb);
						objF.put("auth", isAuthArrayObject);
						PrintWriter writer = resourceResponse.getWriter();
						writer.print(objF);	 
				 }
				}
			} catch (Exception e) {
				_log.error(e.getMessage());
				
				_log.info("Catch  Block");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM");
				JSONArray finalOb = new JSONArray();
				JSONObject objF = new JSONObject();
				JSONObject obj = new JSONObject();
				obj.put("id","");
				obj.put("name","");
				
				 String outputStart = "";
				 String outputDue = "";
				 try {
					obj.put("startdate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
								: sdf.format(sdf.parse(outputStart.toString())));
				 
					obj.put("enddate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(outputStart.toString())));
				} catch (ParseException e1) {
					_log.error(e.getMessage());
				}
				obj.put("color", "blue");
				obj.put("url", "");
				objF.put("monthly", finalOb);
				
				JSONObject isAuthObject=new JSONObject();
				JSONArray isAuthArrayObject=null;
				
				isAuthObject.put("status", "0");
				isAuthArrayObject.add(isAuthObject);
				objF.put("auth", isAuthArrayObject);

				PrintWriter writer = resourceResponse.getWriter();
				writer.print(objF);
				_log.error(e.getMessage());
				_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
			_log.info("In Catch Block");
			}
		}
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("fetchparticulartaskdetails")) {
			
			try{
			_log.info("In Particular Task Ajax");
			String taskId=resourceRequest.getParameter("taskId");
			_log.info("Task Id : "+taskId);
			String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
			User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
			String domain="@cholamandalam.com";
			
			String actualScreenName="";
			actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(user.getScreenName());
			
			if(actualScreenName==null){
				actualScreenName="dummy";
			}
			_log.info("User's Actual Screenname from Table : "+actualScreenName);
			
			String userName=actualScreenName+domain;
			String userMicrosoftPassword=(String) user.getExpandoBridge().getAttribute("microsoftexchangeserverpasswordsecret");
			
			FetchTask ft=new FetchTask(serviceURL, userName, userMicrosoftPassword);
			List<Task> lt=null;

			lt = FetchTask.readParticularTask(taskId);

			if(lt!=null){
				PrintWriter writer = resourceResponse.getWriter();
				JSONArray finalOb = new JSONArray();
				JSONObject objF = new JSONObject();
				DateFormat inputFormat = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
				 DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					for(Task task:lt){
									JSONObject obj = new JSONObject();
									obj.put("id",task.getId().toString());
									obj.put("subject", task.getSubject().toString());
									obj.put("body", task.getBody().toString());
									
									//Date and time formatting
									SimpleDateFormat onlyDate = new SimpleDateFormat("yyyy/MM/dd");
									onlyDate.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
									SimpleDateFormat onlyTime = new SimpleDateFormat("hh:mm a");
									onlyTime.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
									
									
									String getOnlyStartDate = onlyDate.format(task.getStartDate());
									_log.info("Start Date after formatting : "+getOnlyStartDate);
									
									
									String getOnlyStartTime = onlyTime.format(task.getStartDate());
									_log.info("Start Time after formatting : "+getOnlyStartTime);
									
									String getOnlyEndDate = onlyDate.format(task.getDueDate());
									_log.info("End Date after formatting : "+getOnlyEndDate);
									
									
									String getOnlyEndTime = onlyTime.format(task.getDueDate());
									_log.info("End Time after formatting : "+getOnlyEndTime);
									
									
									
									//
									
									Date dateStart = inputFormat.parse(task.getStartDate().toString());
									 String outputStart = outputFormat.format(dateStart);
									 Date dateDue = inputFormat.parse(task.getDueDate().toString());
									 String outputDue = outputFormat.format(dateDue);
									obj.put("startdate", getOnlyStartDate);
									obj.put("starttime", getOnlyStartTime);
									obj.put("enddate", getOnlyEndDate);
									obj.put("endtime", getOnlyEndTime);
									finalOb.add(obj);
								}
					objF.put("particularTask", finalOb);
					writer.print(objF);
					
			}
			}catch (Exception e) {
				_log.error(e.getMessage());
			}
		}
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("fetchparticularappointmentdetails")) {
			
			try{
			_log.info("In Particular Appointment Ajax");
			String appointmentId=resourceRequest.getParameter("appointmentId");
			_log.info("Task Id : "+appointmentId);
			String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
			User user=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
			String domain="@cholamandalam.com";
			String actualScreenName="";
			actualScreenName=calendarmsappointmentLocalServiceUtil.getScreenNameFromTable(user.getScreenName());
			
			if(actualScreenName==null){
				actualScreenName="dummy";
			}
			_log.info("User's Actual Screenname from Table : "+actualScreenName);
			
			String userName=actualScreenName+domain;
			String userMicrosoftPassword=(String) user.getExpandoBridge().getAttribute("microsoftexchangeserverpasswordsecret");
			
			FetchTask ft=new FetchTask(serviceURL, userName, userMicrosoftPassword);
			List<Appointment> lt=null;

			lt = FetchTask.readParticularAppointment(appointmentId);

			if(lt!=null){
				PrintWriter writer = resourceResponse.getWriter();
				JSONArray finalOb = new JSONArray();
				JSONObject objF = new JSONObject();
				DateFormat inputFormat = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
				 DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					for(Appointment task:lt){
									JSONObject obj = new JSONObject();
									JSONArray objAttendees = new JSONArray();
									obj.put("id",task.getId().toString());
									obj.put("subject", task.getSubject().toString());
									obj.put("body", task.getBody().toString());
									
									AttendeeCollection ac=task.getRequiredAttendees();
									for(int i=0;i<task.getRequiredAttendees().getCount();i++){
										
									_log.info("Get Property : "+ac.getPropertyAtIndex(i));
									
									String myEmailIds = ac.getPropertyAtIndex(i).toString().replaceAll("<.*?>","").trim();
									
									objAttendees.add(myEmailIds);
									}
									_log.info("Object Attendees : "+objAttendees.toString());
									obj.put("attendees", objAttendees);
									
									//Date and time formatting
									SimpleDateFormat onlyDate = new SimpleDateFormat("yyyy/MM/dd");
									onlyDate.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
									SimpleDateFormat onlyTime = new SimpleDateFormat("hh:mm a");
									onlyTime.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
									
									String getOnlyStartDate = onlyDate.format(task.getStart());
									_log.info("Start Date after formatting : "+getOnlyStartDate);
									
									String getOnlyStartTime = onlyTime.format(task.getStart());
									_log.info("Start Time after formatting : "+getOnlyStartTime);
									
									String getOnlyEndDate = onlyDate.format(task.getEnd());
									_log.info("End Date after formatting : "+getOnlyEndDate);
									
									String getOnlyEndTime = onlyTime.format(task.getEnd());
									_log.info("End Time after formatting : "+getOnlyEndTime);
									
									 Date dateStart = inputFormat.parse(task.getStart().toString());
									 String outputStart = outputFormat.format(dateStart);
									 Date dateDue = inputFormat.parse(task.getEnd().toString());
									 String outputDue = outputFormat.format(dateDue);
									obj.put("startdate", getOnlyStartDate);
									obj.put("starttime", getOnlyStartTime);
									obj.put("enddate", getOnlyEndDate);
									obj.put("endtime", getOnlyEndTime);
									finalOb.add(obj);
								}
					objF.put("particularTask", finalOb);
					_log.info("Final Object  : "+objF.toString());
					writer.print(objF);
			}
			}catch (Exception e) { 
				_log.error(e.getMessage());
			}
		}
	}
}