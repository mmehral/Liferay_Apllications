package com.chola.contest;

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
import com.contest.model.CholaContest;
import com.contest.model.ContestUserDetails;
import com.contest.service.CholaContestLocalServiceUtil;
import com.contest.service.ContestUserDetailsLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

public class ContestMainAction extends MVCPortlet {
	
	public void save(ActionRequest actionRequest, ActionResponse actionResponse){
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
		
		System.out.println("addContest========");
		String filepath = null;
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);

		String content = uploadRequest.getParameter("content");
		String startdate = uploadRequest.getParameter("startdate");

		String enddate = uploadRequest.getParameter("enddate");
		// String contest_val=uploadRequest.getParameter("contest_val");
		String contenttitle = uploadRequest.getParameter("contenttitle");

		long referenceId = ParamUtil.getInteger(actionRequest, "id");
		System.out.println("referenceId==========" + referenceId);

		System.out.println("Content==" + content + "Start Date===" + startdate + "End Date====" + enddate);
		// System.out.println("Contest Value===="+contest_val);

		
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
			
			
			
			
			List<String> list = CholaContestLocalServiceUtil.getIntendedUser(businessId, values, gender, age_arr,
					optionValue);		
	
			
			User particularUser=null;
			
		
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			String urllink = themeDisplay.getPortalURL() + themeDisplay.getURLCurrent();
			
			

			
			String str = "contestUpload";
			//ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			java.util.Properties properties = PortalUtil.getPortalProperties();
			System.out.println("my properties is...." + properties);
			File destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
			if (!destinationFile.exists()) {
				destinationFile.mkdirs();
				System.out.println("type directory exists");
			}
			System.out.println("my directory issssss" + destinationFile);

			File sourceFile = uploadRequest.getFile("contest_doc");
			String fileName = uploadRequest.getFileName("contest_doc");
			System.out.println("fileName=================" + fileName);
			
			
			
			
			
			
			
			
			
			
			CholaContest contest=null;
			if (!fileName.isEmpty()) {
				/**************** SAVE THE DOC ********************************/
				if (destinationFile.exists()) {
					System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
					fileName.lastIndexOf(".");
					String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
					System.out.println("fileName : " + fileNa);
					String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
					System.out.println("fileExtension : " + fileExtension);
					// System.out.println("FileName:-" + fileNa + " File
					// Extension:-"+ fileExtension4);
					fileName = fileNa;
					SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
					Date date = new Date();
					String testDateString = df2.format(date);
					fileName = fileName + "_" + testDateString + fileExtension;

					destinationFile = new File(
							properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + fileName);

					System.out.println("destinationFile : " + destinationFile);

				}
				System.out.println("File : " + fileName);
				FileUtil.copyFile(sourceFile, destinationFile);

				filepath = destinationFile.toString();
				System.out.println("Successfully Saved the Document");
				/*************** ENDED THE SAVING ******************/
				System.out.println(filepath);
			}
			if (referenceId >= 01) {
				modifiedContest(actionRequest, actionResponse, referenceId, contenttitle, content, startdate, enddate,
						fileName, fileName);
				actionResponse.setRenderParameter("jspPage", "/html/show.jsp");
			} else {

				contest = CholaContestLocalServiceUtil.createCholaContest(CounterLocalServiceUtil.increment());
				// contest.setContest_code(4);
				// contest.setContest_val(Integer.parseInt(contest_val));
				contest.setContent(content);

				contest.setStartdate(format.parse(startdate));
				contest.setEnddate(format.parse(enddate));
				contest.setCreateDate(new Date());
				contest.setContest_title(contenttitle);
				
				if (!fileName.isEmpty()) {
					contest.setContest_doc(fileName);
					contest.setContest_path(filepath);
				}
				contest = CholaContestLocalServiceUtil.addCholaContest(contest);
				System.out.println("Successfully added...");
			}
			
			
			
			ContestUserDetails cud=null;
			
			for(int j = 0; j < list.size(); j++){
				try{
					System.out.println("Screen Name from List : "+ list.get(j).toString().trim());
					
				
					particularUser=UserLocalServiceUtil.getUserByScreenName(companyId, list.get(j).toString().trim());
					
					//boolean flagForInsert=businesssopDetailsLocalServiceUtil
					if(particularUser!=null){
						
						
						cud=ContestUserDetailsLocalServiceUtil.createContestUserDetails(CounterLocalServiceUtil.increment());
						cud.setUser_id(String.valueOf(particularUser.getUserId()));
						cud.setContestreference_id(contest.getId());
						cud=ContestUserDetailsLocalServiceUtil.addContestUserDetails(cud);
						
						sendNotification(actionRequest, actionResponse, particularUser.getUserId(),serviceContext,urllink);
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
			//ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
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
						
						sendNotification(actionRequest, actionResponse, particularUser.getUserId(),serviceContext,urllink);
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
			
			List<String> list = CholaContestLocalServiceUtil.getAllUser(businessId, gender, age_arr, optionValue);

			long companyId=themeDisplay.getCompanyId();
			User particularUser=null;
			
			
			//ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			String urllink = themeDisplay.getPortalURL() + themeDisplay.getURLCurrent();
			for(int j = 0; j < list.size(); j++){
				try{
					System.out.println("Screen Name from List : "+ list.get(j).toString().trim());
					
				
					particularUser=UserLocalServiceUtil.getUserByScreenName(companyId, list.get(j).toString().trim());
					
					//boolean flagForInsert=businesssopDetailsLocalServiceUtil
					if(particularUser!=null){
						
						sendNotification(actionRequest, actionResponse, particularUser.getUserId(),serviceContext,urllink);
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
	
	
	public void addContest(ActionRequest actionRequest, ActionResponse actionResponse)
			throws ParseException, IOException {
		System.out.println("addContest========");
		String filepath = null;
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);

		String content = uploadRequest.getParameter("content");
		String startdate = uploadRequest.getParameter("startdate");

		String enddate = uploadRequest.getParameter("enddate");
		// String contest_val=uploadRequest.getParameter("contest_val");
		String contenttitle = uploadRequest.getParameter("contenttitle");

		long referenceId = ParamUtil.getInteger(actionRequest, "id");
		System.out.println("referenceId==========" + referenceId);

		System.out.println("Content==" + content + "Start Date===" + startdate + "End Date====" + enddate);
		// System.out.println("Contest Value===="+contest_val);

		/*******************
		 * Started Creating the Folder As UserName
		 ************************/

		String str = "contestUpload";
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		java.util.Properties properties = PortalUtil.getPortalProperties();
		System.out.println("my properties is...." + properties);
		File destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
			System.out.println("type directory exists");
		}
		System.out.println("my directory issssss" + destinationFile);

		File sourceFile = uploadRequest.getFile("contest_doc");
		String fileName = uploadRequest.getFileName("contest_doc");
		System.out.println("fileName=================" + fileName);

		if (!fileName.isEmpty()) {
			/**************** SAVE THE DOC ********************************/
			if (destinationFile.exists()) {
				System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
				fileName.lastIndexOf(".");
				String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
				System.out.println("fileName : " + fileNa);
				String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
				System.out.println("fileExtension : " + fileExtension);
				// System.out.println("FileName:-" + fileNa + " File
				// Extension:-"+ fileExtension4);
				fileName = fileNa;
				SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
				Date date = new Date();
				String testDateString = df2.format(date);
				fileName = fileName + "_" + testDateString + fileExtension;

				destinationFile = new File(
						properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + fileName);

				System.out.println("destinationFile : " + destinationFile);

			}
			System.out.println("File : " + fileName);
			FileUtil.copyFile(sourceFile, destinationFile);

			filepath = destinationFile.toString();
			System.out.println("Successfully Saved the Document");
			/*************** ENDED THE SAVING ******************/
			System.out.println(filepath);
		}
		if (referenceId >= 01) {
			modifiedContest(actionRequest, actionResponse, referenceId, contenttitle, content, startdate, enddate,
					fileName, fileName);
			actionResponse.setRenderParameter("jspPage", "/html/show.jsp");
		} else {

			CholaContest contest = CholaContestLocalServiceUtil.createCholaContest(CounterLocalServiceUtil.increment());
			// contest.setContest_code(4);
			// contest.setContest_val(Integer.parseInt(contest_val));
			contest.setContent(content);

			contest.setStartdate(format.parse(startdate));
			contest.setEnddate(format.parse(enddate));
			contest.setCreateDate(new Date());
			contest.setContest_title(contenttitle);
			if (!fileName.isEmpty()) {
				contest.setContest_doc(fileName);
				contest.setContest_path(filepath);
			}
			contest = CholaContestLocalServiceUtil.addCholaContest(contest);
			System.out.println("Successfully added...");
		}
	}

	private void modifiedContest(ActionRequest actionRequest, ActionResponse actionResponse, long referenceId,
			String contenttitle, String content, String startdate, String enddate, String fileName, String filepath) {
		// TODO Auto-generated method stub
		System.out.println("edit the forms======");
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println("myyyyy CompanyId====" + referenceId);
		CholaContest contest = null;
		try {
			contest = CholaContestLocalServiceUtil.fetchCholaContest(referenceId);

		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(contest)) {
			contest.setContent(content);

			try {
				contest.setStartdate(format.parse(startdate));

				contest.setEnddate(format.parse(enddate));
				contest.setCreateDate(new Date());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			contest.setContest_title(contenttitle);

			if (!fileName.isEmpty()) {
				contest.setContest_doc(fileName);
				contest.setContest_path(filepath);
			}
			try {

				CholaContestLocalServiceUtil.updateCholaContest(contest);
				System.out.println("Your Updated Successfully");
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void getTextArea(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("Text.....Area.........");
		long id = ParamUtil.getLong(actionRequest, "id");
		String feedback = ParamUtil.getString(actionRequest, "feedback");
		System.out.println("FeedBack=====" + feedback);
		CholaContest ref = null;
		try {
			ref = CholaContestLocalServiceUtil.fetchCholaContest(id);
			System.out.println("!!!!!!" + ref);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(ref)) {
			ref.setFeedback(feedback);
			try {

				CholaContestLocalServiceUtil.updateCholaContest(ref);
				System.out.println("Your Updated Successfully");
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void getFeedBackUpload(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		System.out.println("Feedback==========");
		String filepath = null;
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String contestlist = uploadRequest.getParameter("contestlist");
		int contesttableId = Integer.parseInt(contestlist);
		System.out.println(contestlist);
		/*******************
		 * Started Creating the Folder As UserName
		 ************************/

		String str = "contestUpload";
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long userId = themeDisplay.getUserId();
		java.util.Properties properties = PortalUtil.getPortalProperties();
		System.out.println("my properties is...." + properties);
		File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		File destinationFile = new File(
				properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + userId);

		if (!contestfolder.exists()) {
			destinationFile.mkdirs();
			System.out.println("type directory exists");
		}
		System.out.println("my directory issssss" + contestfolder);

		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
			System.out.println("type directory exists");
		}
		System.out.println("my directory issssss" + destinationFile);
		for (int i = 0; i < contesttableId - 1; i++) {
			File sourceFile = uploadRequest.getFile("contesttable[" + i + "].upload");

			String fileName = uploadRequest.getFileName("contesttable[" + i + "].upload");

			if (fileName != null) {
				/****************
				 * SAVE THE PAN CARD DOC
				 ********************************/
				if (destinationFile.exists()) {
					fileName.lastIndexOf(".");
					String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
					System.out.println("fileNa+++++++++++++" + fileNa);
					String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
					System.out.println("fileExtension+++++++++++++" + fileExtension);
					System.out.println("FileName:-" + fileNa + " File Extension:-" + fileExtension);
					fileName = fileNa;
					fileName = fileName + fileExtension;

					System.out.println("@@@@@@@@@@@" + fileName);
					destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str
							+ "/" + userId + "/" + fileName);

					System.out.println("destinationFile()()()()" + destinationFile);

				}
				System.out.println("photo_filename" + fileName);
				FileUtil.copyFile(sourceFile, destinationFile);
				filepath = destinationFile.toString();
				System.out.println("Successfully Save the PAN CARD");
				/***************
				 * ENDED THE SAVING PAN CARD SAVE
				 ******************/
				System.out.println("SUCESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
			}
		}
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

	public void deleteContest(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		System.out.println("Delete Contest======");
		long referenceId = ParamUtil.getInteger(actionRequest, "id");
		System.out.println("referenceId===" + referenceId);
		if (referenceId >= 01) {
		
	 	try {
	 		CholaContestLocalServiceUtil.deleteCholaContest(referenceId);
				System.out.println("your deleted successfully");
				actionResponse.setRenderParameter("jspPage","/html/show.jsp");
			
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		
		System.out.println("In action serveResource");
		System.out.println("Resource Id : " + resourceRequest.getResourceID().toString());
		
		try {

			
		

		 if (resourceRequest.getResourceID().equalsIgnoreCase("usersCall")) {
					System.out.println("Fetch User ID");
					
					List<Object[]> lt = CholaContestLocalServiceUtil.getUsers();
					
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
					List<String> lt = CholaContestLocalServiceUtil.getCompany();
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
						lt = CholaContestLocalServiceUtil.getUnit(businessId);
					} else if (resourceRequest.getResourceID().equalsIgnoreCase("Function")) {
						lt = CholaContestLocalServiceUtil.getFunction(businessId);
					} else if (resourceRequest.getResourceID().equalsIgnoreCase("Department")) {
						lt = CholaContestLocalServiceUtil.getDepart(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Designation")) {
						lt = CholaContestLocalServiceUtil.getDesignation(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Product")) {
						lt = CholaContestLocalServiceUtil.getProduct(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Zone")) {
						lt = CholaContestLocalServiceUtil.getZone(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Branch")) {
						lt = CholaContestLocalServiceUtil.getBranch(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Grade")) {
						lt = CholaContestLocalServiceUtil.getGrade(businessId);
					}
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Region")) {
						lt = CholaContestLocalServiceUtil.getRegion(businessId);
					}
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Location")) {
						lt = CholaContestLocalServiceUtil.getLocation(businessId);
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
			}}
	
	public void sendNotification(ActionRequest actionRequest, ActionResponse actionResponse, long userid, ServiceContext serviceContext,String urllink)
	 {
try
{
boolean flag = false;
com.liferay.portal.kernel.json.JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
payloadJSON.put("userId", userid);
payloadJSON.put("url", urllink);
payloadJSON.put("notificationText", "New Contest has been added");
System.out.println("Pay Load : " + payloadJSON);
UserNotificationEvent event = UserNotificationEventLocalServiceUtil.addUserNotificationEvent(userid,
		"Chola_Contest", (new Date()).getTime(), userid, payloadJSON.toString(), false, serviceContext);
System.out.println("EVENT : " + event);

System.out.println(event.getUserNotificationEventId());

flag = CholaContestLocalServiceUtil.insertNotifyStts(1, 3, "Chola Contest", 1, 1, event.getUserNotificationEventId());
System.out.println("Flag : " + flag);
}
catch (Exception e) {
	e.printStackTrace();
}
}

}
