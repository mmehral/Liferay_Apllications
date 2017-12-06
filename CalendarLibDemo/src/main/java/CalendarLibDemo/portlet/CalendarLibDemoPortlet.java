package CalendarLibDemo.portlet;

import CalendarLibDemo.constants.CalendarLibDemoPortletKeys;
import microsoft.exchange.webservices.data.core.service.item.Task;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.osgi.service.component.annotations.Component;


/**
 * @author adms.java1
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CalendarLibDemo Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CalendarLibDemoPortletKeys.CalendarLibDemo,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.header-portlet-css=/html/css/monthly.css",
		"com.liferay.portlet.header-portlet-css=/html/css/jquery.datetimepicker.css",
		"com.liferay.portlet.header-portlet-javascript=/html/js/monthly.js",
		"com.liferay.portlet.header-portlet-javascript=/html/js/jquery.datetimepicker.full.js"
	},
	service = Portlet.class
)
public class CalendarLibDemoPortlet extends MVCPortlet {
	
@Override
public void render(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
	super.render(renderRequest, renderResponse);
	
}

public static HttpServletRequest request=null;
private static final Log _log = LogFactoryUtil.getLog(CalendarLibDemoPortlet.class);
public void createAppointment(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
	try{ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
	_log.info("In create Appointment method");
	String taskSubject=ParamUtil.getString(actionRequest, "subject");
	String taskBody=ParamUtil.getString(actionRequest, "body");
	String[] attendeesEmailIds=ParamUtil.getParameterValues(actionRequest, "attendees");
	
	
	String emailIds = attendeesEmailIds[1].replaceAll("\\[", "").replaceAll("\\]","");
	
	System.out.println("EmailIds after removing square brackets :  "+emailIds);
	
	List<String> emailIdsList = new ArrayList<String>(Arrays.asList(emailIds.split(",")));
	
	
	for(int i=0;i<emailIdsList.size();i++){
	System.out.println("Email Ids : "+emailIdsList.get(i));
		
	}
	
	
	String taskStartDate=ParamUtil.getString(actionRequest, "taskStartDate");
	String taskDueDate=ParamUtil.getString(actionRequest, "taskEndDate");
	
	HttpServletRequest request = PortalUtil.getHttpServletRequest(
			actionRequest);
	String password="";
	
	
	
/*	password = CookieUtil.get(request, "sessionmsexchange");
	
	
	User particularUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
	String userScreenName=particularUser.getScreenName();
	
	String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
	String domain="@cholamandalam.com";
	String userName=userScreenName+domain;
	
	
	byte[] asBytes = Base64.getDecoder().decode(password);
	String dsB64=new String(asBytes, "utf-8");
	
	String pass=dsB64.substring(0, dsB64.length() - 14);

	FetchTask ft=new FetchTask(serviceURL, userName, pass);
	
	boolean createTaskSuccess=ft.createAppointment(taskSubject, taskBody,emailIdsList, taskStartDate, taskDueDate,actionRequest);
	
	
	PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
	String portletName = portletConfig.getPortletName();

	PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
	portletName + "_WAR_" + portletName + "portlet",
	themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

	successPageURL.setParameter("jspPage", "/view.jsp");
	actionResponse.sendRedirect(successPageURL.toString());*/
	
	
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void createTask(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
_log.info("In create task method");
ThemeDisplay themeDisplay=(ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
String taskSubject=ParamUtil.getString(actionRequest, "subject");
String taskBody=ParamUtil.getString(actionRequest, "body");
String taskStartDate=ParamUtil.getString(actionRequest, "taskStartDate");
String taskDueDate=ParamUtil.getString(actionRequest, "taskEndDate");

HttpServletRequest request = PortalUtil.getHttpServletRequest(
		actionRequest);

/*String password = com.liferay.util.CookieUtil.get(request, "sessionmsexchange");


User particularUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
String userScreenName=particularUser.getScreenName();

String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
String domain="@cholamandalam.com";
String userName=userScreenName+domain;
byte[] asBytes = Base64.getDecoder().decode(password);
String dsB64=new String(asBytes, "utf-8");
System.out.println("Decoded String : "+dsB64); // And the output is: some string

String pass=dsB64.substring(0, dsB64.length() - 14);
System.out.println("Actual : "+pass);
FetchTask ft=new FetchTask(serviceURL, userName, pass);
boolean createTaskSuccess=ft.createTask(taskSubject, taskBody, taskStartDate, taskDueDate,actionRequest);

_log.info("Is Task Created : "+createTaskSuccess);

	PortletConfig portletConfig = (PortletConfig) actionRequest.getAttribute("javax.portlet.config");
	String portletName = portletConfig.getPortletName();

	PortletURL successPageURL = PortletURLFactoryUtil.create(actionRequest,
	portletName + "_WAR_" + portletName + "portlet",
	themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);

	successPageURL.setParameter("jspPage", "/view.jsp");
	actionResponse.sendRedirect(successPageURL.toString());*/
}

@Override
public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortletException {
	//Get User email Address Using UserLocalServiceUtil
	JSONArray jArrayForEmailList = new JSONArray();
/*	List<User> users = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
	for(User user : users) {
		 jArrayForEmailList.add(user.getEmailAddress().toString());
	}*/
	
	
	//Get User email Address Using Custom Query
	/*List<String> emailList=calendarmsappointmentLocalServiceUtil.getEmailIdsFromUserTable();
	for(String emailId:emailList){
		 jArrayForEmailList.add(emailId);
	}*/
	
	if(resourceRequest.getResourceID().equalsIgnoreCase("getAttendeesEmailIds")){
		try{
			PrintWriter writer = resourceResponse.getWriter();
			 writer.print(jArrayForEmailList);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	if (resourceRequest.getResourceID().equalsIgnoreCase("taskCalendarData")) {
		try {
			ThemeDisplay themeDisplay=(ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			HttpServletRequest request = PortalUtil.getHttpServletRequest(
					resourceRequest);

			//String password = com.liferay.util.CookieUtil.get(request, "sessionmsexchange");
			String password=null;
			Cookie[] cookies = request.getCookies();

	           if (cookies != null) {
	            for (Cookie cookie : cookies) {
	              if (cookie.getName().equals("sessionmsexchange")) {
	                password=cookie.getValue();

	               }
	             }
	           }

			String domain="@cholamandalam.com";
			
			User particularUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
			String userScreenName=particularUser.getScreenName();
			
			if(userScreenName.equals("test")){
				
				JSONArray finalOb = new JSONArray();
				JSONObject objF = new JSONObject();
				JSONObject obj = new JSONObject();
				obj.put("id","");
				obj.put("name","");
				
				 //Date dateStart = inputFormat.parse(task.getStartDate().toString());
				 String outputStart = "";
				 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
				// Date dateDue = inputFormat.parse(task.getDueDate().toString());
				 String outputDue = "";
				obj.put("startdate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(outputStart.toString())));
				//obj.put("enddate", ((task.getDueDate() == null || task.getDueDate().toString().equalsIgnoreCase(""))) ? ""
				//		: sdf.format(sdf.parse(task.getDueDate().toString())));*/
				obj.put("enddate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
						: sdf.format(sdf.parse(outputStart.toString())));
				obj.put("color", "blue");
				obj.put("url", "");
				objF.put("monthly", finalOb);
				PrintWriter writer = resourceResponse.getWriter();
				writer.print(objF);
				
			}else{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM");
			_log.info("In Task List Fetch Method");
			String serviceURL="https://mail.murugappa.com/ews/Exchange.asmx";
			String userName=userScreenName+domain;
			System.out.println("Direct Password from Cookie : "+password);
			byte[] asBytes = Base64.getDecoder().decode(password);
			String dsB64=new String(asBytes, "utf-8");
			System.out.println("Decoded String : "+dsB64); // And the output is: some string
			
			String pass=dsB64.substring(0, dsB64.length() - 14);
			System.out.println("Actual : "+pass);
			List<Task> lt=null;
			//List lt=null;
			List<Map> lt1=null;
		/*	FetchTask ft=new FetchTask(serviceURL, userName, pass);
			 lt = FetchTask.readTask();
			 lt1=FetchTask.readAppointments();*/
			
			if(lt!=null||lt1!=null){
				PrintWriter writer = resourceResponse.getWriter();
				JSONArray finalOb = new JSONArray();
				JSONObject objF = new JSONObject();
				
				 DateFormat inputFormat = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
				 DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				  
				for(Task task:lt){
					JSONObject obj = new JSONObject();
					obj.put("id",task.getId().toString());
					obj.put("name", task.getSubject().toString());
					
					 Date dateStart = inputFormat.parse(task.getStartDate().toString());
					 String outputStart = outputFormat.format(dateStart);
					 
					 Date dateDue = inputFormat.parse(task.getDueDate().toString());
					 String outputDue = outputFormat.format(dateDue);
					obj.put("startdate", outputStart);
					//obj.put("enddate", ((task.getDueDate() == null || task.getDueDate().toString().equalsIgnoreCase(""))) ? ""
					//		: sdf.format(sdf.parse(task.getDueDate().toString())));*/
					obj.put("enddate", outputDue);
					obj.put("color", "blue");
					obj.put("url", "");
					finalOb.add(obj);
				}
				
				for(Map list:lt1){
					JSONObject obj = new JSONObject();
					obj.put("id", list.get("appointmentItemId"));
					obj.put("name", list.get("appointmentSubject"));
					
					 Date dateStart = inputFormat.parse(list.get("appointmentStartTime").toString());
					 String outputStart = outputFormat.format(dateStart);
					 
					 Date dateDue = inputFormat.parse(list.get("appointmentEndTime").toString());
					 String outputDue = outputFormat.format(dateDue);
					obj.put("startdate", outputStart);
					
					obj.put("enddate", outputDue);
					obj.put("color", "red");
					obj.put("url", "");
					finalOb.add(obj);
				}
				
				
				objF.put("monthly", finalOb);
				writer.print(objF);
				
				
			}else{
				JSONArray finalOb = new JSONArray();
				JSONObject objF = new JSONObject();
				JSONObject obj = new JSONObject();
				obj.put("id","");
				obj.put("name","");
				
				 //Date dateStart = inputFormat.parse(task.getStartDate().toString());
				 String outputStart = "";
				// Date dateDue = inputFormat.parse(task.getDueDate().toString());
				 String outputDue = "";
				obj.put("startdate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(outputStart.toString())));
				//obj.put("enddate", ((task.getDueDate() == null || task.getDueDate().toString().equalsIgnoreCase(""))) ? ""
				//		: sdf.format(sdf.parse(task.getDueDate().toString())));*/
				obj.put("enddate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
						: sdf.format(sdf.parse(outputStart.toString())));
				obj.put("color", "blue");
				obj.put("url", "");
				objF.put("monthly", finalOb);
				PrintWriter writer = resourceResponse.getWriter();
				writer.print(objF);
			}
			

			}
		} catch (Exception e) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM");
			JSONArray finalOb = new JSONArray();
			JSONObject objF = new JSONObject();
			JSONObject obj = new JSONObject();
			obj.put("id","");
			obj.put("name","");
			
			 //Date dateStart = inputFormat.parse(task.getStartDate().toString());
			 String outputStart = "";
			// Date dateDue = inputFormat.parse(task.getDueDate().toString());
			 String outputDue = "";
			try {
				obj.put("startdate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
							: sdf.format(sdf.parse(outputStart.toString())));
			 
			//obj.put("enddate", ((task.getDueDate() == null || task.getDueDate().toString().equalsIgnoreCase(""))) ? ""
			//		: sdf.format(sdf.parse(task.getDueDate().toString())));*/
			obj.put("enddate", ((outputStart == null || outputStart.toString().equalsIgnoreCase(""))) ? ""
					: sdf.format(sdf.parse(outputStart.toString())));
			obj.put("color", "blue");
			obj.put("url", "");
			objF.put("monthly", finalOb);
			}catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			PrintWriter writer = resourceResponse.getWriter();
			writer.print(objF);
			e.printStackTrace();
			_log.error("Not able to access Microsoft Exchange Server with logged in username and password");
		}
	}
}
}