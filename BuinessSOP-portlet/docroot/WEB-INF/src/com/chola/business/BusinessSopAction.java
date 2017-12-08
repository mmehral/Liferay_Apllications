package com.chola.business;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.business.model.businessSOPppusers;
import com.chola.business.model.businesssopDetails;
import com.chola.business.model.businesssoppath;
import com.chola.business.model.businesssopusers;
import com.chola.business.service.businessSOPppusersLocalServiceUtil;
import com.chola.business.service.businesssopDetailsLocalServiceUtil;
import com.chola.business.service.businesssoppathLocalServiceUtil;
import com.chola.business.service.businesssopusersLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

public class BusinessSopAction extends MVCPortlet {
	
	
	public void save(ActionRequest actionRequest, ActionResponse actionResponse)
			throws ParseException, IOException, PortalException {
	

		int arrLength = ParamUtil.getParameterValues(actionRequest, "secondList").length;
		int arrLength1 = ParamUtil.getParameterValues(actionRequest, "thirdList").length;

		System.out.println("Second List length : " + arrLength);
		System.out.println("Third List length : " + arrLength1);
		
		String uniqueId=ParamUtil.getString(actionRequest, "uniqueId");
		System.out.println("Unique Id : "+uniqueId);

		String eventDetails = ParamUtil.getString(actionRequest, "eventdetails");
		System.out.println("eventDetails : " + eventDetails);

		System.out.println("addBuinessSop=========");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String buinesstitle = actionRequest.getParameter("buinesstitle");
		System.out.println("buinesstitle : " + buinesstitle);
		
		String businessSOPUniqueId=actionRequest.getParameter("uniqueId");
		System.out.println("Unique Id from Jsp : "+businessSOPUniqueId);
		
		String buinessDesc = actionRequest.getParameter("buinessDesc");
		System.out.println("buinessDesc : " + buinessDesc);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		// Size of List.............
		String contestlist = uploadRequest.getParameter("contestlist");
		int contesttableId = Integer.parseInt(contestlist);
		System.out.println(contestlist);
		
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date();
		String sopId = "SOP_" + df2.format(date);

		businesssoppath path = null;
		
		// list 1
		try{
		
		if (arrLength >= 1) {
			String[] values = ParamUtil.getParameterValues(actionRequest, "secondList");
			System.out.println("Second " + values.toString());

			String optionValue = ParamUtil.getString(actionRequest, "option");
			System.out.println("optionValue : " + optionValue);

			String businessId = ParamUtil.getString(actionRequest, "business");
			System.out.println("Business ID : " + businessId);

			for (int i = 0; i < values.length; i++) {
				System.out.println("Selected values : " + values[i]);
			}

			String gender = ParamUtil.getString(actionRequest, "gender");
			System.out.println("Gender : " + gender);

			String age_arr = ParamUtil.getString(actionRequest, "age");
			String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
			String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
			String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
			String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");

			if (age_arr.equalsIgnoreCase("all")) {
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("lessthan")) {
				age_arr = "Less than " + lessthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("greaterthan")) {
				age_arr = "Greater than " + greaterthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("between")) {
				age_arr = "Between " + between_from_age + " to " + between_to_age;
				System.out.println("age : " + age_arr);
			}

			
			//ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);	
			long companyId=themeDisplay.getCompanyId();
			
			List<String> list = businesssopDetailsLocalServiceUtil.getIntendedUser(businessId, values, gender, age_arr,
					optionValue);		
			
			User particularUser=null;
			
			businessSOPppusers businessSOPppusers=null;
			
			businesssopDetails sop = businesssopDetailsLocalServiceUtil.createbusinesssopDetails(CounterLocalServiceUtil.increment());
			sop.setBusinesstitle(buinesstitle);;
			sop.setBusinessDesc(buinessDesc);
			sop.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
			sop.setCreatedDate(date);
			sop.setFlag("1");
			sop=businesssopDetailsLocalServiceUtil.addbusinesssopDetails(sop);
			System.out.println("Business Created with ID : " + sop.getId());
			// The Image upload for more than
			// One.........................................
			// for (int i = 0; i < contesttableId - 1; i++) {
			if (contesttableId == 0) {
				File sourceFile = uploadRequest.getFile("contesttable[0].upload");
				String sourceFileName = uploadRequest.getFileName("contesttable[0].upload");

				String fileName = null;
				if (!sourceFileName.isEmpty()) {
					System.out.println("File selected by user");
					fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
				} else {
					System.out.println("File not selected by user");
				}

				path = businesssoppathLocalServiceUtil.createbusinesssoppath(CounterLocalServiceUtil.increment());
				path.setBusinessdoc(fileName.toString());
				path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
				path.setCreatedDate(date);
				path.setFlag("1");
				path.setBusinessdetails_id(sop.getId());
				path = businesssoppathLocalServiceUtil.addbusinesssoppath(path);

			}

			// The Image upload for more than
			// One.........................................
			for (int i = 0; i < contesttableId - 1; i++) {
				File sourceFile = uploadRequest.getFile("contesttable[" + i + "].upload");
				String sourceFileName = uploadRequest.getFileName("contesttable[" + i + "].upload");
	             String fileName = null;
				if (!sourceFileName.isEmpty()) {
					System.out.println("File selected by user");
					fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
				} else {
					System.out.println("File not selected by user");
				}
				path = businesssoppathLocalServiceUtil.createbusinesssoppath(CounterLocalServiceUtil.increment());
				path.setBusinessdoc(fileName.toString());
				path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
				path.setCreatedDate(date);
				path.setFlag("1");
				path.setBusinessdetails_id(sop.getId());
				path = businesssoppathLocalServiceUtil.addbusinesssoppath(path);

			}
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			String urllink = themeDisplay.getPortalURL() + themeDisplay.getURLCurrent();
			for(int j = 0; j < list.size(); j++){
				try{
					System.out.println("Screen Name from List : "+ list.get(j).toString().trim());
					
					particularUser=UserLocalServiceUtil.getUserByScreenName(companyId, list.get(j).toString().trim());
					
					if(particularUser!=null){
						businesssopusers sopUsers = businesssopusersLocalServiceUtil.createbusinesssopusers(CounterLocalServiceUtil.increment());
						sopUsers.setUser_id(particularUser.getUserId());
						sopUsers.setBusinessdetails_id(sop.getId());
						
						businesssopusersLocalServiceUtil.addbusinesssopusers(sopUsers);
						String notificationText = "Business SOP has been uploaded";
						sendNotification(actionRequest, actionResponse, particularUser.getUserId(),serviceContext,urllink,notificationText);
				}
				}catch (Exception e) {
				e.printStackTrace();
				}
			}
			System.out.println("Out of For Loop");
		}
		
		// list 2
		else if(arrLength1>=1){
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			System.out.println(themeDisplay.getURLHome());
			String url = null;
			
			if (themeDisplay.getURLCurrent().indexOf("?") != -1) {
				int count = themeDisplay.getURLCurrent().indexOf("?");
				url = themeDisplay.getURLCurrent().substring(0, count);
				System.out.println(url);
			} else {
				url = themeDisplay.getURLCurrent();
			}
			String urllink = themeDisplay.getPortalURL() + url;
			
			String[] list = ParamUtil.getParameterValues(actionRequest, "thirdList");
			System.out.println("Third " + list.toString());
			System.out.println("Third List length : " + list.length);
		
			long companyId=themeDisplay.getCompanyId();
			User particularUser=null;
			businessSOPppusers businessSOPppusers=null;
			//ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			//String urllink = themeDisplay.getPortalURL() + themeDisplay.getURLCurrent();
			for (int j = 0; j < list.length; j++) {
				//List<EmpInfoEntity> userId = EmpInfoEntityLocalServiceUtil.getUserId(list[i].toString());
				System.out.println();
				String str = list[j].toString();
		        int firstBracket = str.indexOf('(');
		        String empId = str.substring(firstBracket + 1, str.indexOf(')', firstBracket));
		        System.out.println(empId);
		        
				try{
					System.out.println("Screen Name from List : "+ empId);
					particularUser=UserLocalServiceUtil.getUserByScreenName(companyId, empId.toString().trim());
					
					//boolean flagForInsert=businesssopDetailsLocalServiceUtil
					if(particularUser!=null){
						
						businesssopDetails sop = businesssopDetailsLocalServiceUtil.createbusinesssopDetails(CounterLocalServiceUtil.increment());
						sop.setBusinesstitle(buinesstitle);;
						sop.setBusinessDesc(buinessDesc);
						sop.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
						sop.setCreatedDate(date);
						sop.setFlag("1");
						sop=businesssopDetailsLocalServiceUtil.addbusinesssopDetails(sop);
						
						System.out.println("Business Created with ID : " + sop.getId());
						// The Image upload for more than
						// One.........................................
						// for (int i = 0; i < contesttableId - 1; i++) {
						if (contesttableId == 0) {
							File sourceFile = uploadRequest.getFile("contesttable[0].upload");
							String sourceFileName = uploadRequest.getFileName("contesttable[0].upload");

							String fileName = null;
							if (!sourceFileName.isEmpty()) {
								System.out.println("File selected by user");
								fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
							} else {
								System.out.println("File not selected by user");
							}

							path = businesssoppathLocalServiceUtil.createbusinesssoppath(CounterLocalServiceUtil.increment());
							path.setBusinessdoc(fileName.toString());
							path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
							path.setCreatedDate(date);
							path.setFlag("1");
							path.setBusinessdetails_id(sop.getId());
							path = businesssoppathLocalServiceUtil.addbusinesssoppath(path);
						}

						// The Image upload for more than
						// One.........................................
						for (int i = 0; i < contesttableId - 1; i++) {
							File sourceFile = uploadRequest.getFile("contesttable[" + i + "].upload");
							String sourceFileName = uploadRequest.getFileName("contesttable[" + i + "].upload");
				             String fileName = null;
							if (!sourceFileName.isEmpty()) {
								System.out.println("File selected by user");
								fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
							} else {
								System.out.println("File not selected by user");
							}
							path = businesssoppathLocalServiceUtil.createbusinesssoppath(CounterLocalServiceUtil.increment());
							path.setBusinessdoc(fileName.toString());
							path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
							path.setCreatedDate(date);
							path.setFlag("1");
							path.setBusinessdetails_id(sop.getId());
							path = businesssoppathLocalServiceUtil.addbusinesssoppath(path);
						}
						String notificationText = "Business SOP has been uploaded";
						sendNotification(actionRequest, actionResponse, particularUser.getUserId(),serviceContext,urllink,notificationText);
					}
						
				}catch (Exception e) {
				e.printStackTrace();
				}
			}
			System.out.println("Out of For Loop");
		/*	actionResponse.setRenderParameter("business_uniqueid",uniqueId);
			actionResponse.setRenderParameter("jspPage", "/html/view.jsp");*/
			}

		else{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			String optionValue = ParamUtil.getString(actionRequest, "option");
			System.out.println("optionValue : " + optionValue);

			String businessId = ParamUtil.getString(actionRequest, "business");
			System.out.println("Business ID : " + businessId);
			
			String gender = ParamUtil.getString(actionRequest, "gender");
			System.out.println("Gender : " + gender);

			String age_arr = ParamUtil.getString(actionRequest, "age");
			String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
			String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
			String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
			String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");

			if (age_arr.equalsIgnoreCase("all")) {
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("lessthan")) {
				age_arr = "Less than " + lessthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("greaterthan")) {
				age_arr = "Greater than " + greaterthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("between")) {
				age_arr = "Between " + between_from_age + " to " + between_to_age;
				System.out.println("age : " + age_arr);
			}
			
			List<String> list = businesssopDetailsLocalServiceUtil.getAllUser(businessId, gender, age_arr, optionValue);

			long companyId=themeDisplay.getCompanyId();
			User particularUser=null;
			
			businessSOPppusers businessSOPppusers=null;
			//ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			String urllink = themeDisplay.getPortalURL() + themeDisplay.getURLCurrent();
			for(int j = 0; j < list.size(); j++){
				try{
					System.out.println("Screen Name from List : "+ list.get(j).toString().trim());
					
				
					particularUser=UserLocalServiceUtil.getUserByScreenName(companyId, list.get(j).toString().trim());
					
					//boolean flagForInsert=businesssopDetailsLocalServiceUtil
					if(particularUser!=null){
						
						businesssopDetails sop = businesssopDetailsLocalServiceUtil.createbusinesssopDetails(CounterLocalServiceUtil.increment());
						sop.setBusinesstitle(buinesstitle);;
						sop.setBusinessDesc(buinessDesc);
						sop.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
						sop.setCreatedDate(date);
						sop.setFlag("1");
						sop=businesssopDetailsLocalServiceUtil.addbusinesssopDetails(sop);
						System.out.println("Business Created with ID : " + sop.getId());
						// The Image upload for more than
						// One.........................................
						// for (int i = 0; i < contesttableId - 1; i++) {
						if (contesttableId == 0) {
							File sourceFile = uploadRequest.getFile("contesttable[0].upload");
							String sourceFileName = uploadRequest.getFileName("contesttable[0].upload");

							String fileName = null;
							if (!sourceFileName.isEmpty()) {
								System.out.println("File selected by user");
								fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
							} else {
								System.out.println("File not selected by user");
							}

							path = businesssoppathLocalServiceUtil.createbusinesssoppath(CounterLocalServiceUtil.increment());
							path.setBusinessdoc(fileName.toString());
							path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
							path.setCreatedDate(date);
							path.setFlag("1");
							path.setBusinessdetails_id(sop.getId());
							path = businesssoppathLocalServiceUtil.addbusinesssoppath(path);

						}

						// The Image upload for more than
						// One.........................................
						for (int i = 0; i < contesttableId - 1; i++) {
							File sourceFile = uploadRequest.getFile("contesttable[" + i + "].upload");
							String sourceFileName = uploadRequest.getFileName("contesttable[" + i + "].upload");
				             String fileName = null;
							if (!sourceFileName.isEmpty()) {
								System.out.println("File selected by user");
								fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
							} else {
								System.out.println("File not selected by user");
							}
							path = businesssoppathLocalServiceUtil.createbusinesssoppath(CounterLocalServiceUtil.increment());
							path.setBusinessdoc(fileName.toString());
							path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
							path.setCreatedDate(date);
							path.setFlag("1");
							path.setBusinessdetails_id(sop.getId());
							path = businesssoppathLocalServiceUtil.addbusinesssoppath(path);

						}
						String notificationText = "Business SOP has been Uploaded";
						sendNotification(actionRequest, actionResponse, particularUser.getUserId(),serviceContext,urllink,notificationText);
					}
				}catch (Exception e) {
				e.printStackTrace();
				}
			}
			System.out.println("Out of For Loop");
			
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void getIntendedUSerList(ActionRequest actionRequest, ActionResponse actionResponse)
			throws ParseException, IOException, PortalException {
		System.out.println("In getIntendedUSerList Action ");
		
		int arrLength = ParamUtil.getParameterValues(actionRequest, "secondList").length;
		int arrLength1 = ParamUtil.getParameterValues(actionRequest, "thirdList").length;

		System.out.println("Second List length : " + arrLength);
		System.out.println("Third List length : " + arrLength1);
		
		String uniqueId=ParamUtil.getString(actionRequest, "uniqueId");
		System.out.println("Unique Id : "+uniqueId);

		String eventDetails = ParamUtil.getString(actionRequest, "eventdetails");
		System.out.println("eventDetails : " + eventDetails);

		List<String> finalUsersList=null;
		
		// list 1
		try{
		
		if (arrLength >= 1) {
			String[] values = ParamUtil.getParameterValues(actionRequest, "secondList");
			System.out.println("Second " + values.toString());

			String optionValue = ParamUtil.getString(actionRequest, "option");
			System.out.println("optionValue : " + optionValue);

			String businessId = ParamUtil.getString(actionRequest, "business");
			System.out.println("Business ID : " + businessId);

			for (int i = 0; i < values.length; i++) {
				System.out.println("Selected values : " + values[i]);
			}

			String gender = ParamUtil.getString(actionRequest, "gender");
			System.out.println("Gender : " + gender);

			String age_arr = ParamUtil.getString(actionRequest, "age");
			String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
			String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
			String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
			String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");

			if (age_arr.equalsIgnoreCase("all")) {
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("lessthan")) {
				age_arr = "Less than " + lessthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("greaterthan")) {
				age_arr = "Greater than " + greaterthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("between")) {
				age_arr = "Between " + between_from_age + " to " + between_to_age;
				System.out.println("age : " + age_arr);
			}
			
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);	
			long companyId=themeDisplay.getCompanyId();
			
			List<String> list = businesssopDetailsLocalServiceUtil.getIntendedUser(businessId, values, gender, age_arr,
					optionValue);		
	
			finalUsersList=list;
			User particularUser=null;
			
			businessSOPppusers businessSOPppusers=null;
			
			for(int i = 0; i < list.size(); i++){
				try{
					System.out.println("Screen Name from List : "+ list.get(i).toString().trim());
					
					particularUser=UserLocalServiceUtil.getUserByScreenName(companyId, list.get(i).toString().trim());
					
					//boolean flagForInsert=businesssopDetailsLocalServiceUtil
					if(particularUser!=null){
						businessSOPppusers=businessSOPppusersLocalServiceUtil.createbusinessSOPppusers(CounterLocalServiceUtil.increment());
						businessSOPppusers.setBusinesssop_uniqueid(uniqueId);
						businessSOPppusers.setUser_id(String.valueOf(particularUser.getUserId()));
						businessSOPppusers=businessSOPppusersLocalServiceUtil.addbusinessSOPppusers(businessSOPppusers);
					System.out.println("Successfully Inserted in Contest Personalised Parameters Users");
					}
					
				}catch (Exception e) {
				e.printStackTrace();
				}
			}
			System.out.println("Out of For Loop");
		/*	actionResponse.setRenderParameter("business_uniqueid",uniqueId);
			actionResponse.setRenderParameter("jspPage", "/html/view.jsp");*/
		}
		
		// list 2
		else if(arrLength1>=1){
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			
			System.out.println(themeDisplay.getURLHome());
			String url = null;
			
			if (themeDisplay.getURLCurrent().indexOf("?") != -1) {
				int count = themeDisplay.getURLCurrent().indexOf("?");
				url = themeDisplay.getURLCurrent().substring(0, count);
				System.out.println(url);
			} else {
				url = themeDisplay.getURLCurrent();
			}
			String urllink = themeDisplay.getPortalURL() + url;
			
			String[] list = ParamUtil.getParameterValues(actionRequest, "thirdList");
			System.out.println("Third " + list.toString());
			System.out.println("Third List length : " + list.length);
		
			for (int i = 0; i < list.length; i++) {
				//List<EmpInfoEntity> userId = EmpInfoEntityLocalServiceUtil.getUserId(list[i].toString());
				System.out.println();
				String str = list[i].toString();
		        int firstBracket = str.indexOf('(');
		        String empId = str.substring(firstBracket + 1, str.indexOf(')', firstBracket));
				
		        System.out.println(empId);
		        finalUsersList.add(empId);
			}
		}
		
		else{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			String optionValue = ParamUtil.getString(actionRequest, "option");
			System.out.println("optionValue : " + optionValue);

			String businessId = ParamUtil.getString(actionRequest, "business");
			System.out.println("Business ID : " + businessId);
			
			String gender = ParamUtil.getString(actionRequest, "gender");
			System.out.println("Gender : " + gender);

			String age_arr = ParamUtil.getString(actionRequest, "age");
			String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
			String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
			String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
			String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");

			if (age_arr.equalsIgnoreCase("all")) {
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("lessthan")) {
				age_arr = "Less than " + lessthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("greaterthan")) {
				age_arr = "Greater than " + greaterthan_age;
				System.out.println("age : " + age_arr);
			} else if (age_arr.equalsIgnoreCase("between")) {
				age_arr = "Between " + between_from_age + " to " + between_to_age;
				System.out.println("age : " + age_arr);
			}
				
			List<String> list = businesssopDetailsLocalServiceUtil.getAllUser(businessId, gender, age_arr, optionValue);
			
			finalUsersList=list;
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	// On 25 April 2017 Changes added by Add and delete Script.......
	public void addBuinessSop(ActionRequest request, ActionResponse response) throws PortalException, IOException {
		System.out.println("addBuinessSop=========");
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		String buinesstitle = request.getParameter("buinesstitle");
		System.out.println("buinesstitle : " + buinesstitle);
		
		String businessSOPUniqueId=request.getParameter("uniqueId");
		System.out.println("Unique Id from Jsp : "+businessSOPUniqueId);
		
		String buinessDesc = request.getParameter("buinessDesc");
		System.out.println("buinessDesc : " + buinessDesc);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		// Size of List.............
		String contestlist = uploadRequest.getParameter("contestlist");
		int contesttableId = Integer.parseInt(contestlist);
		System.out.println(contestlist);

		// UploadPortletRequest uploadPortletRequest =
		// PortalUtil.getUploadPortletRequest(request);
		// String[] sourceFileName =
		// uploadPortletRequest.getFileNames("uploadedFile");
		// File[] sourceFile = uploadPortletRequest.getFiles("uploadedFile");
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date();
		String sopId = "SOP_" + df2.format(date);

		businesssoppath path = null;
		// The Image upload for more than
		// One.........................................
		// for (int i = 0; i < contesttableId - 1; i++) {
		if (contesttableId == 0) {
			File sourceFile = uploadRequest.getFile("contesttable[0].upload");
			String sourceFileName = uploadRequest.getFileName("contesttable[0].upload");

			String fileName = null;
			if (!sourceFileName.isEmpty()) {
				System.out.println("File selected by user");
				fileName = fileUpload(request, response, uploadRequest, sourceFileName, sourceFile);
			} else {
				System.out.println("File not selected by user");
			}

			path = businesssoppathLocalServiceUtil.createbusinesssoppath(CounterLocalServiceUtil.increment());
			path.setBusinessdoc(fileName.toString());
			path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
			path.setCreatedDate(date);
			path.setFlag("1");
			path = businesssoppathLocalServiceUtil.addbusinesssoppath(path);

		}

		// The Image upload for more than
		// One.........................................
		for (int i = 0; i < contesttableId - 1; i++) {
			File sourceFile = uploadRequest.getFile("contesttable[" + i + "].upload");
			String sourceFileName = uploadRequest.getFileName("contesttable[" + i + "].upload");
             String fileName = null;
			if (!sourceFileName.isEmpty()) {
				System.out.println("File selected by user");
				fileName = fileUpload(request, response, uploadRequest, sourceFileName, sourceFile);
			} else {
				System.out.println("File not selected by user");
			}
			path = businesssoppathLocalServiceUtil.createbusinesssoppath(CounterLocalServiceUtil.increment());
			path.setBusinessdoc(fileName.toString());
			path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
			path.setCreatedDate(date);
			path.setFlag("1");
			path = businesssoppathLocalServiceUtil.addbusinesssoppath(path);

		}

		businesssopDetails sop = businesssopDetailsLocalServiceUtil.createbusinesssopDetails(CounterLocalServiceUtil.increment());
		sop.setBusinesstitle(buinesstitle);;
		sop.setBusinessDesc(buinessDesc);
		sop.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
		sop.setCreatedDate(date);
		sop.setFlag("1");
		sop=businesssopDetailsLocalServiceUtil.addbusinesssopDetails(sop);
		System.out.println("Business Created with ID : " + sop.getId());
	}

	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("Comment=======");

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			System.out.println("Comment is successfully added........");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String fileUpload(ActionRequest request, ActionResponse response, UploadPortletRequest uploadRequest,
			String fileName, File sourceFile) throws IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		// String fileName = null;
		// UploadPortletRequest uploadRequest =
		// PortalUtil.getUploadPortletRequest(request);
		// Creating the folder Structure in Tomcat as
		// WebApps/ImageGalleryUpload/userId folder will create

		String str = "BusinessSopUpload";

		// long userId = themeDisplay.getUserId();
		String role = "admin";
		java.util.Properties properties = PortalUtil.getPortalProperties();
		System.out.println("my properties is...." + properties);
		File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		File destinationFile = new File(
				properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + role);

		if (!contestfolder.exists()) {
			destinationFile.mkdirs();
			System.out.println("type directory exists");
		}
		System.out.println("my directory is : " + contestfolder);

		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
			System.out.println("type directory exists");
		}
		System.out.println("my directory is : " + destinationFile);

		// File sourceFile = uploadRequest.getFile("uploadedFile");
		// fileName = uploadRequest.getFileName("uploadedFile");

		if (fileName != null) {
			/**************** SAVE THE DOC ********************************/
			if (destinationFile.exists()) {
				fileName.lastIndexOf(".");
				String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
				System.out.println("fileName : " + fileNa);
				String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
				System.out.println("fileExtension : " + fileExtension);
				fileName = fileNa;
				SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
				Date date = new Date();
				String testDateString = df2.format(date);
				fileName = fileName + "_" + testDateString + fileExtension;

				destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str
						+ "/" + role + "/" + fileName);

				System.out.println("destinationFile : " + destinationFile);

			}
			System.out.println("File : " + fileName);
			FileUtil.copyFile(sourceFile, destinationFile);

			String FilePath = destinationFile.toString();
			System.out.println("Successfully Saved the Document");
			/*************** ENDED THE SAVING ******************/
			System.out.println(FilePath);
		}
		return fileName;
	}
	
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
	
		System.out.println("In action serveResource");
		System.out.println("Resource Id : " + resourceRequest.getResourceID().toString());
		
		try {

		 if (resourceRequest.getResourceID().equalsIgnoreCase("usersCall")) {
					System.out.println("Fetch User ID");
					
					List<Object[]> lt = businesssopDetailsLocalServiceUtil.getUsers();
					
					Iterator it = lt.iterator();

					JSONObject obj = new JSONObject();
					JSONArray jArray = new JSONArray();
					PrintWriter writer = resourceResponse.getWriter();

					while (it.hasNext()) {
						Object object = (Object) it.next();
						JSONObject obj1 = new JSONObject();
						obj1.put("tag", object.toString());
						jArray.add(obj1);
					}

					System.out.println("Array : " + jArray);
					obj.put("Users", jArray);
					System.out.println("Object : " + obj);
					writer.print(obj);
				}

				else if (resourceRequest.getResourceID().equalsIgnoreCase("serviceCall")) {

					System.out.println("Inside Serveresource");
					List<String> lt = businesssopDetailsLocalServiceUtil.getCompany();
					System.out.println("List : " + lt.toString());
					Iterator it = lt.iterator();
					JSONArray jArray = new JSONArray();
					PrintWriter writer = resourceResponse.getWriter();

					while (it.hasNext()) {
						Object[] object = (Object[]) it.next();
						JSONObject obj = new JSONObject();
						obj.put("business_id", object[0].toString());
						obj.put("business_name", object[1].toString());
						jArray.add(obj);
					}

					System.out.println(jArray);
					writer.print(jArray);

				} else {
					List<String> lt = new ArrayList<String>();
					String businessId = ParamUtil.getString(resourceRequest, "business");
					System.out.println("Business ID : " + businessId);

					if (resourceRequest.getResourceID().equalsIgnoreCase("Unit")) {
						lt = businesssopDetailsLocalServiceUtil.getUnit(businessId);
					} else if (resourceRequest.getResourceID().equalsIgnoreCase("Function")) {
						lt = businesssopDetailsLocalServiceUtil.getFunction(businessId);
					} else if (resourceRequest.getResourceID().equalsIgnoreCase("Department")) {
						lt = businesssopDetailsLocalServiceUtil.getDepart(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Designation")) {
						lt = businesssopDetailsLocalServiceUtil.getDesignation(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Product")) {
						lt = businesssopDetailsLocalServiceUtil.getProduct(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Zone")) {
						lt = businesssopDetailsLocalServiceUtil.getZone(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Branch")) {
						lt = businesssopDetailsLocalServiceUtil.getBranch(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Grade")) {
						lt = businesssopDetailsLocalServiceUtil.getGrade(businessId);
					}
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Region")) {
						lt = businesssopDetailsLocalServiceUtil.getRegion(businessId);
					}
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Location")) {
						lt = businesssopDetailsLocalServiceUtil.getLocation(businessId);
					}

					System.out.println("Inside Serveresource : ");

					System.out.println("List : " + lt.toString());

					Iterator it = lt.iterator();
					JSONObject obj = new JSONObject();
					PrintWriter writer = resourceResponse.getWriter();
					obj.put("unit", lt);
					System.out.println(obj);
					writer.print(obj);

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void sendNotification(ActionRequest actionRequest, ActionResponse actionResponse, long userid, ServiceContext serviceContext,String urllink,String notificationText)
	 {
		try
		{
		boolean flag = false;
		com.liferay.portal.kernel.json.JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
		payloadJSON.put("userId", userid);
		payloadJSON.put("url", urllink);
		payloadJSON.put("notificationText", notificationText);
		System.out.println("Pay Load : " + payloadJSON);
		UserNotificationEvent event = UserNotificationEventLocalServiceUtil.addUserNotificationEvent(userid,
				"BUSINESS_SOP", (new Date()).getTime(), userid, payloadJSON.toString(), false, serviceContext);
		System.out.println("EVENT : " + event);
		
		System.out.println(event.getUserNotificationEventId());
		
		flag = businesssopDetailsLocalServiceUtil.insertNotifyStts(1, 3, "Web Content", 1, 1, event.getUserNotificationEventId());
		System.out.println("Flag : " + flag);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}
	
public void deleteSop(ActionRequest request, ActionResponse response) throws PortalException {
		
		System.out.println("Inside Delete SOP");
		long id = ParamUtil.getInteger(request, "id");
		
		System.out.println("ID to be deleted : "+id);
		
		if(id>=1)
		{
			businesssopDetails sop = businesssopDetailsLocalServiceUtil.fetchbusinesssopDetails(id);
			sop.setFlag("2");
			businesssopDetailsLocalServiceUtil.updatebusinesssopDetails(sop);
			System.out.println("Record deleted Successfully");
			response.setRenderParameter("jspPage", "/html/view.jsp");
		}
	}
	
public void updateSop(ActionRequest request, ActionResponse response) throws PortalException {
		
	ThemeDisplay themeDisplay =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

		System.out.println("Inside Update SOP");
		long id = ParamUtil.getInteger(request, "id");
		
		String title = ParamUtil.getString(request, "title");
		String desc = ParamUtil.getString(request, "desc");
		
		System.out.println("ID to be updated : "+id+" title : "+title+" desc : "+desc);
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(request);
		String urllink = themeDisplay.getPortalURL() + themeDisplay.getURLCurrent();
		
			businesssopDetails sop = businesssopDetailsLocalServiceUtil.fetchbusinesssopDetails(id);
			sop.setBusinesstitle(title);
			sop.setBusinessDesc(desc);
			sop.setModifiedBy(themeDisplay.getUserId());
			sop.setModifiedDate(new Date());
			businesssopDetailsLocalServiceUtil.updatebusinesssopDetails(sop);
			
			System.out.println("Record Updated Successfully");
			
			String notificationText = "Business SOP has been updated";
			List<businesssopusers> sopUsers = businesssopusersLocalServiceUtil.getSOPUsers(sop.getId());
			for(businesssopusers users : sopUsers)
			{
			sendNotification(request, response, users.getUser_id(), serviceContext, urllink,notificationText);
			}
			
			System.out.println("Notification sent successfully");
	}

}
