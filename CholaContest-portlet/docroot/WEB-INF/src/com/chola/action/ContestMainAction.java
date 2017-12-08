package com.chola.action;

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

import com.chola.contest.model.cholacontest;
import com.chola.contest.service.cholacontestLocalServiceUtil;
import com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import peoplepowerapi.PeoplePowerAPI;

public class ContestMainAction extends MVCPortlet {

	private static final Log logger = LogFactoryUtil.getLog(ContestMainAction.class);
	public void save(ActionRequest actionRequest, ActionResponse actionResponse){
		int arrLength = ParamUtil.getParameterValues(actionRequest, "secondList").length;
		int arrLength1 = ParamUtil.getParameterValues(actionRequest, "thirdList").length;

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		String filepath = null;
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);

		String content = uploadRequest.getParameter("content");
		String startdate = uploadRequest.getParameter("startdate");

		String enddate = uploadRequest.getParameter("enddate");
		String contenttitle = uploadRequest.getParameter("contenttitle");

		long referenceId = ParamUtil.getInteger(actionRequest, "id");
		SimpleDateFormat df1 = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		Date date = new Date();
		long uniqueContentId = Long.parseLong(df1.format(date));

		
		String optionValue = ParamUtil.getString(actionRequest, "option");
		String businessId = ParamUtil.getString(actionRequest, "business");
		String gender = ParamUtil.getString(actionRequest, "gender");
		String age_arr = ParamUtil.getString(actionRequest, "age");
		String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
		String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
		String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
		String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");
		String between_from_to_age=between_from_age+"&"+between_to_age;
		String age_type=age_arr;
		if (age_arr.equalsIgnoreCase("all")) {
		} else if (age_arr.equalsIgnoreCase("lessthan")) {
			age_type = "Less than";
		} else if (age_arr.equalsIgnoreCase("greaterthan")) {
			age_type = "Greater than";
		} else if (age_arr.equalsIgnoreCase("between")) {
			age_type = "Between";
		}
		
		logger.info("Gender : "+gender);
		if (age_arr.equalsIgnoreCase("all")) {
		} else if (age_arr.equalsIgnoreCase("lessthan")) {
			age_arr = "Less than " + lessthan_age;
		} else if (age_arr.equalsIgnoreCase("greaterthan")) {
			age_arr = "Greater than " + greaterthan_age;
		} else if (age_arr.equalsIgnoreCase("between")) {
			age_arr = "Between " + between_from_age + " to " + between_to_age;
		}
		
		String currentPageUrl=themeDisplay.getURLCurrent();

		if(currentPageUrl.contains("?"))
		{
			currentPageUrl = currentPageUrl.substring(0, currentPageUrl.indexOf("?"));
		}
		// list 1
		try{
		
		if (arrLength >= 1) {
			long notification_type=1;
			String[] values = ParamUtil.getParameterValues(actionRequest, "secondList");
			String str = "contestUpload";
			
			java.util.Properties properties = PortalUtil.getPortalProperties();
			
			File destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
			if (!destinationFile.exists()) {
				destinationFile.mkdirs();
			}

			File sourceFile = uploadRequest.getFile("contest_doc");
			String fileName = uploadRequest.getFileName("contest_doc");
				
			cholacontest contest=null;
			if (!fileName.isEmpty()) {
				/**************** SAVE THE DOC ********************************/
				if (destinationFile.exists()) {
					fileName.lastIndexOf(".");
					String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
					String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
					fileName = fileNa;
					SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
					String testDateString = df2.format(date);
					fileName = fileName + "_" + testDateString + fileExtension;

					destinationFile = new File(
							properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + fileName);


				}
				FileUtil.copyFile(sourceFile, destinationFile);

				filepath = destinationFile.toString();
				logger.info("Successfully Saved the Document");
				/*************** ENDED THE SAVING ******************/
			}
			if (referenceId >= 01) {
				modifiedContest(actionRequest, actionResponse, referenceId, contenttitle, content, startdate, enddate,
						fileName, fileName);
				actionResponse.setRenderParameter("jspPage", "/html/show.jsp");
			} else {

				contest = cholacontestLocalServiceUtil.createcholacontest(CounterLocalServiceUtil.increment());
				contest.setContent(content);

				contest.setStartdate(format.parse(startdate));
				contest.setEnddate(format.parse(enddate));
				contest.setCreateDate(new Date());
				contest.setContest_title(contenttitle);
				contest.setContent_id(uniqueContentId);
				contest.setCreateDate(new Date());
				if (!fileName.isEmpty()) {
					contest.setContest_doc(fileName);
					contest.setContest_path(filepath);
					
				}
				contest = cholacontestLocalServiceUtil.addcholacontest(contest);
				logger.info("Successfully added...");
			}
			
Object[] notificationDetails={contest.getContent_id(),1,1,"Contest",contest.getContest_title()+" - New Contest has been added",currentPageUrl};
			
			
			boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, values, gender, age_type, optionValue, contest.getContent_id(), lessthan_age, greaterthan_age, between_from_to_age, notification_type);
			}
			logger.info("Is SuccessFully Inserted?  : "+insert1);
		}
		
		// list 2
		else if(arrLength1>=1){
			long notification_type=2;
			String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");

			String str = "contestUpload";
			
			java.util.Properties properties = PortalUtil.getPortalProperties();
			
			File destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
			if (!destinationFile.exists()) {
				destinationFile.mkdirs();
				logger.info("type directory exists");
			}

			File sourceFile = uploadRequest.getFile("contest_doc");
			String fileName = uploadRequest.getFileName("contest_doc");
				
			cholacontest contest=null;
			if (!fileName.isEmpty()) {
				/**************** SAVE THE DOC ********************************/
				if (destinationFile.exists()) {
					fileName.lastIndexOf(".");
					String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
					String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
					fileName = fileNa;
					SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
					String testDateString = df2.format(date);
					fileName = fileName + "_" + testDateString + fileExtension;

					destinationFile = new File(
							properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + fileName);


				}
				FileUtil.copyFile(sourceFile, destinationFile);

				filepath = destinationFile.toString();
				logger.info("Successfully Saved the Document");
				/*************** ENDED THE SAVING ******************/
			}
			if (referenceId >= 01) {
				modifiedContest(actionRequest, actionResponse, referenceId, contenttitle, content, startdate, enddate,
						fileName, fileName);
				actionResponse.setRenderParameter("jspPage", "/html/show.jsp");
			} else {

				contest = cholacontestLocalServiceUtil.createcholacontest(CounterLocalServiceUtil.increment());
				contest.setContent(content);

				contest.setStartdate(format.parse(startdate));
				contest.setEnddate(format.parse(enddate));
				contest.setCreateDate(new Date());
				contest.setContest_title(contenttitle);
				contest.setContent_id(uniqueContentId);
				if (!fileName.isEmpty()) {
					contest.setContest_doc(fileName);
					contest.setContest_path(filepath);
				}
				contest = cholacontestLocalServiceUtil.addcholacontest(contest);
				logger.info("Successfully added...");
			}
			
			List<String> empids=new ArrayList<String>();
			for(int i=0;i<values.length;i++){
				String str1 = values[i].toString();
		        int firstBracket = str1.indexOf('(');
		        String empId = str1.substring(firstBracket + 1, str1.indexOf(')', firstBracket));
		        empids.add(empId);
			}
			String[] finalValues=empids.toArray(new String[0]);
			
			
Object[] notificationDetails={contest.getContent_id(),1,1,"Contest",contest.getContest_title()+" - New Contest has been added",currentPageUrl};
			
			
			
boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, finalValues, "ALL", "all", optionValue, contest.getContent_id(), null, null, null, notification_type);
			}	
			logger.info("Is SuccessFully Inserted?  : "+insert1);
			
			}

		else{
			long notification_type=0;
			String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
			
String str = "contestUpload";
			
			java.util.Properties properties = PortalUtil.getPortalProperties();
			
			File destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
			if (!destinationFile.exists()) {
				destinationFile.mkdirs();
			}

			File sourceFile = uploadRequest.getFile("contest_doc");
			String fileName = uploadRequest.getFileName("contest_doc");
				
			cholacontest contest=null;
			if (!fileName.isEmpty()) {
				/**************** SAVE THE DOC ********************************/
				if (destinationFile.exists()) {
					fileName.lastIndexOf(".");
					String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
					String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
					// logger.info("FileName:-" + fileNa + " File
					// Extension:-"+ fileExtension4);
					fileName = fileNa;
					SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
					String testDateString = df2.format(date);
					fileName = fileName + "_" + testDateString + fileExtension;

					destinationFile = new File(
							properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + fileName);


				}
				FileUtil.copyFile(sourceFile, destinationFile);

				filepath = destinationFile.toString();
				logger.info("Successfully Saved the Document");
				/*************** ENDED THE SAVING ******************/
			}
			if (referenceId >= 01) {
				modifiedContest(actionRequest, actionResponse, referenceId, contenttitle, content, startdate, enddate,
						fileName, fileName);
				actionResponse.setRenderParameter("jspPage", "/html/show.jsp");
			} else {

				contest = cholacontestLocalServiceUtil.createcholacontest(CounterLocalServiceUtil.increment());
				contest.setContent(content);

				contest.setStartdate(format.parse(startdate));
				contest.setEnddate(format.parse(enddate));
				contest.setCreateDate(new Date());
				contest.setContest_title(contenttitle);
				contest.setContent_id(uniqueContentId);
				if (!fileName.isEmpty()) {
					contest.setContest_doc(fileName);
					contest.setContest_path(filepath);
				}
				contest = cholacontestLocalServiceUtil.addcholacontest(contest);
				logger.info("Successfully added...");
			}
			
			Object[] notificationDetails={contest.getContent_id(),1,1,"Contest",contest.getContest_title()+" - New Contest has been added",currentPageUrl};
			
			boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, values, gender, age_type, optionValue, contest.getContent_id(), lessthan_age, greaterthan_age, between_from_to_age, notification_type);
			}
			
			
			
		}
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	
	public void addContest(ActionRequest actionRequest, ActionResponse actionResponse)
			throws ParseException, IOException {
		String filepath = null;
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);

		String content = uploadRequest.getParameter("content");
		String startdate = uploadRequest.getParameter("startdate");

		String enddate = uploadRequest.getParameter("enddate");
		String contenttitle = uploadRequest.getParameter("contenttitle");

		long referenceId = ParamUtil.getInteger(actionRequest, "id");


		/*******************
		 * Started Creating the Folder As UserName
		 ************************/

		String str = "contestUpload";
		java.util.Properties properties = PortalUtil.getPortalProperties();
		File destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
		}

		File sourceFile = uploadRequest.getFile("contest_doc");
		String fileName = uploadRequest.getFileName("contest_doc");

		if (!fileName.isEmpty()) {
			/**************** SAVE THE DOC ********************************/
			if (destinationFile.exists()) {
				fileName.lastIndexOf(".");
				String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
				String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
				fileName = fileNa;
				SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
				Date date = new Date();
				String testDateString = df2.format(date);
				fileName = fileName + "_" + testDateString + fileExtension;

				destinationFile = new File(
						properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + fileName);


			}
			FileUtil.copyFile(sourceFile, destinationFile);

			filepath = destinationFile.toString();
			logger.info("Successfully Saved the Document");
			/*************** ENDED THE SAVING ******************/
		}
		if (referenceId >= 01) {
			modifiedContest(actionRequest, actionResponse, referenceId, contenttitle, content, startdate, enddate,
					fileName, fileName);
			actionResponse.setRenderParameter("jspPage", "/html/show.jsp");
		} else {

			cholacontest contest = cholacontestLocalServiceUtil.createcholacontest(CounterLocalServiceUtil.increment());
			contest.setContent(content);

			contest.setStartdate(format.parse(startdate));
			contest.setEnddate(format.parse(enddate));
			contest.setCreateDate(new Date());
			contest.setContest_title(contenttitle);
			if (!fileName.isEmpty()) {
				contest.setContest_doc(fileName);
				contest.setContest_path(filepath);
			}
			contest = cholacontestLocalServiceUtil.addcholacontest(contest);
			logger.info("Successfully added...");
		}
	}

	private void modifiedContest(ActionRequest actionRequest, ActionResponse actionResponse, long referenceId,
			String contenttitle, String content, String startdate, String enddate, String fileName, String filepath) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
		cholacontest contest = null;
		try {
			contest = cholacontestLocalServiceUtil.fetchcholacontest(referenceId);

		} catch (SystemException e) {
			
		}
		if (Validator.isNotNull(contest)) {
			contest.setContent(content);

			try {
				contest.setStartdate(format.parse(startdate));

				contest.setEnddate(format.parse(enddate));
				contest.setCreateDate(new Date());
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			contest.setContest_title(contenttitle);

			if (!fileName.isEmpty()) {
				contest.setContest_doc(fileName);
				contest.setContest_path(filepath);
			}
			try {
				cholacontestLocalServiceUtil.updatecholacontest(contest);
				logger.info("Your Updated Successfully");
			} catch (SystemException e) {
				
			}
		}
	}

	public void getTextArea(ActionRequest actionRequest, ActionResponse actionResponse) {
		long id = ParamUtil.getLong(actionRequest, "id");
		String feedback = ParamUtil.getString(actionRequest, "feedback");
		cholacontest ref = null;
		try {
			ref = cholacontestLocalServiceUtil.fetchcholacontest(id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			
		}
		if (Validator.isNotNull(ref)) {
			ref.setFeedback(feedback);
			try {

				cholacontestLocalServiceUtil.updatecholacontest(ref);
				logger.info("Your Updated Successfully");
			} catch (SystemException e) {
				
			}
		}

	}

	public void getFeedBackUpload(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		String filepath = null;
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String contestlist = uploadRequest.getParameter("contestlist");
		int contesttableId = Integer.parseInt(contestlist);
		/*******************
		 * Started Creating the Folder As UserName
		 ************************/

		String str = "contestUpload";
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long userId = themeDisplay.getUserId();
		java.util.Properties properties = PortalUtil.getPortalProperties();
		File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		File destinationFile = new File(
				properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + userId);

		if (!contestfolder.exists()) {
			destinationFile.mkdirs();
		}

		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
		}
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
					String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
					fileName = fileNa;
					fileName = fileName + fileExtension;

					destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str
							+ "/" + userId + "/" + fileName);


				}
				FileUtil.copyFile(sourceFile, destinationFile);
				filepath = destinationFile.toString();
				logger.info("Successfully Save the PAN CARD");
				/***************
				 * ENDED THE SAVING PAN CARD SAVE
				 ******************/
			}
		}
	}

	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			logger.info("Comment is successfully added........");
		} catch (Exception e) {
			
		}
	}

	public void deleteContest(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		logger.info("Delete Contest======");
		long referenceId = ParamUtil.getInteger(actionRequest, "id");
		logger.info("referenceId===" + referenceId);
		if (referenceId >= 01) {
		
	 	try {
	 		cholacontestLocalServiceUtil.deletecholacontest(referenceId);
				logger.info("your deleted successfully");
				actionResponse.setRenderParameter("jspPage","/html/show.jsp");
			
			} catch (PortalException e) {
				
			} catch (SystemException e) {
				
			}
				
		}
		
	}

	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		//New Code with using External Portlet 
				logger.info("In action serveResource");
				
				try {
					String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
					System.out.println("CMD : : : "+cmd);
					 if (cmd.equals("getusers")) {
							logger.info("Fetch User ID");
							
			/*				List<Object[]> lt = contentupdateLocalServiceUtil.getUsers();
							
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

							logger.info("Array : " + jArray);
							obj.put("Users", jArray);
							logger.info("Object : " + obj);
							writer.print(obj);*/
							
							com.liferay.portal.kernel.json.JSONArray usersJSONArray = JSONFactoryUtil.createJSONArray();
							com.liferay.portal.kernel.json.JSONObject userJSON=null;
							
							List<Object[]> lt = contentupdateLocalServiceUtil.getUsers();
							
							Iterator it = lt.iterator();
							
							while (it.hasNext()) {
								Object object = (Object) it.next();
								userJSON=JSONFactoryUtil.createJSONObject();
								userJSON.put("userId",object);
								userJSON.put("email",object);
								userJSON.put("firstName",object);
								usersJSONArray.put(userJSON);
							}
							
							PrintWriter out=resourceResponse.getWriter();
							out.println(usersJSONArray.toString());
						}

						else if (resourceRequest.getResourceID().equalsIgnoreCase("serviceCall")) {

							List<String> lt=contentupdateLocalServiceUtil.getCompany();
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

							writer.print(jArray);

						} else {
							List<String> lt = new ArrayList<String>();
							String businessId = ParamUtil.getString(resourceRequest, "business");

							if (resourceRequest.getResourceID().equalsIgnoreCase("Unit")) {
								lt = contentupdateLocalServiceUtil.getUnit(businessId);
							} else if (resourceRequest.getResourceID().equalsIgnoreCase("Function")) {
								lt = contentupdateLocalServiceUtil.getFunction(businessId);
							} else if (resourceRequest.getResourceID().equalsIgnoreCase("Department")) {
								lt = contentupdateLocalServiceUtil.getDepart(businessId);
							}
							
							else if (resourceRequest.getResourceID().equalsIgnoreCase("Designation")) {
								lt = contentupdateLocalServiceUtil.getDesignation(businessId);
							}
							
							else if (resourceRequest.getResourceID().equalsIgnoreCase("Product")) {
								lt = contentupdateLocalServiceUtil.getProduct(businessId);
							}
							
							else if (resourceRequest.getResourceID().equalsIgnoreCase("Zone")) {
								lt = contentupdateLocalServiceUtil.getZone(businessId);
							}
							
							else if (resourceRequest.getResourceID().equalsIgnoreCase("Branch")) {
								lt = contentupdateLocalServiceUtil.getBranch(businessId);
							}
							
							else if (resourceRequest.getResourceID().equalsIgnoreCase("Grade")) {
								lt = contentupdateLocalServiceUtil.getGrade(businessId);
							}
							else if (resourceRequest.getResourceID().equalsIgnoreCase("Region")) {
								lt = contentupdateLocalServiceUtil.getRegion(businessId);
							}
							else if (resourceRequest.getResourceID().equalsIgnoreCase("Location")) {
								lt = contentupdateLocalServiceUtil.getLocation(businessId);
							}

							logger.info("Inside Serveresource : ");


							JSONObject obj = new JSONObject();
							PrintWriter writer = resourceResponse.getWriter();
							obj.put("unit", lt);
							writer.print(obj);

						}

					} catch (Exception e) {
						
						logger.error(e.getMessage());
					}
	}
	public static List<Long> getUniqueContentIdBasedOnLoggedInUser(String empId){
		try{
		empId=cholacontestLocalServiceUtil.getEmpIdFromUID(empId);
		
		List<Long> finalList=new ArrayList<Long>();
		//PeoplePowerAPI pp=new PeoplePowerAPI();
		//org.json.JSONObject employeeinfo=pp.getEmployeeInfo(empId);
		//logger.info("Data from People Power API getEmpInfo : "+employeeinfo.toString());
		
		List<Object[]> activeEmployeeInfo=NoticationCategoryCountLocalServiceUtil.getActiveEmployeeInfoFromTable(empId);
		  String businessVal=null; 
		  String unitVal=null; 
		  String functionVal=null; 
		  String departmentVal=null; 
		  String designationVal=null; 
		  String productVal=null; 
		  String zoneVal=null; 
		  String branchVal=null; 
		  String gradeVal=null; 
		  String regionVal=null; 
		  String locationVal=null; 
		  String genderVal=null; 
		  int age_Val=0;
		
			String empID="";
			if(activeEmployeeInfo!=null){
				for (Object[] singleObjEmpInfo : activeEmployeeInfo) {
					
					
					 businessVal=singleObjEmpInfo[0].toString();
					  unitVal=singleObjEmpInfo[1].toString();
					  functionVal=singleObjEmpInfo[2].toString();
					  departmentVal=singleObjEmpInfo[3].toString();
					  designationVal=singleObjEmpInfo[4].toString();
					  productVal= singleObjEmpInfo[5].toString();
					  zoneVal=singleObjEmpInfo[6].toString();
					  gradeVal=singleObjEmpInfo[7].toString();
					  regionVal=singleObjEmpInfo[8].toString();
					  branchVal=singleObjEmpInfo[9].toString();
					  locationVal= singleObjEmpInfo[10].toString();
					  if(singleObjEmpInfo[11]!=null){
						  genderVal=singleObjEmpInfo[11].toString();
					  }
					 

					  empID=singleObjEmpInfo[16].toString();
				}
			}
		//Condition to Match in PeronalisedContent for  All USer
			List<Object[]> contentForAllUserlist = NoticationCategoryCountLocalServiceUtil
					.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
			 for(Object obj: contentForAllUserlist){
				  
				 finalList.add(Long.parseLong(obj.toString()));
			 }
			//Condition to Match in PeronalisedContent for  Intended USer
			  //Unit Match
			  if((unitVal != null && !unitVal.isEmpty() && !unitVal.equals("N.A"))){
			List<Object[]> contentForUnitIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
			for(Object objUnit: contentForUnitIntendedUserlist){
				finalList.add(Long.parseLong(objUnit.toString())); 
			  }
			  }
			  
			  //Function Match
			  if((functionVal != null && !functionVal.isEmpty() && !functionVal.equals("N.A"))){
				  List<Object[]> contentForFunctionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
					for(Object objFunction: contentForFunctionIntendedUserlist){
						finalList.add(Long.parseLong(objFunction.toString())); 
					}
			  }
			  
			  //Department Match
			  if((departmentVal != null && !departmentVal.isEmpty() && !departmentVal.equals("N.A"))){
				  List<Object[]> contentForDepartmentIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
					for(Object objDepartment: contentForDepartmentIntendedUserlist){
						finalList.add(Long.parseLong(objDepartment.toString())); 
						}
			  }
			  
			  //Designation Match
			  if((designationVal != null && !designationVal.isEmpty() && !designationVal.equals("N.A"))){
				  List<Object[]> contentForDesignationIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
					for(Object objDesignation: contentForDesignationIntendedUserlist){
						finalList.add(Long.parseLong(objDesignation.toString())); 
					  }
			  }
			  
			  //Product Match
			  if((productVal != null && !productVal.isEmpty() && !productVal.equals("N.A"))){
				  List<Object[]> contentForProductIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
					for(Object objProduct: contentForProductIntendedUserlist){
						finalList.add(Long.parseLong(objProduct.toString())); 
					  }
			  }
			  
			  //Zone Match
			  if((zoneVal != null && !zoneVal.isEmpty() && !zoneVal.equals("N.A"))){
				  List<Object[]> contentForZoneIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
					for(Object objZone: contentForZoneIntendedUserlist){
						finalList.add(Long.parseLong(objZone.toString())); 
					  }
			  }
			  
			  //Grade Match
			  if((gradeVal != null && !gradeVal.isEmpty() && !gradeVal.equals("N.A"))){
				  List<Object[]> contentForGradeIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
					for(Object objGrade: contentForGradeIntendedUserlist){
						finalList.add(Long.parseLong(objGrade.toString())); 
					  }
			  }
			  
			  //Region Match
			  if((regionVal != null && !regionVal.isEmpty() && !regionVal.equals("N.A"))){
				  List<Object[]> contentForRegionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
					for(Object objRegion: contentForRegionIntendedUserlist){
						finalList.add(Long.parseLong(objRegion.toString())); 
					  }
			  }
			  
			  //Branch Match
			  if((branchVal != null && !branchVal.isEmpty() && !branchVal.equals("N.A"))){
				  List<Object[]> contentForBranchIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
					for(Object objBranch: contentForBranchIntendedUserlist){
						finalList.add(Long.parseLong(objBranch.toString())); 
					  }
			  }
			  
			  //Location Match
			  if((locationVal != null && !locationVal.isEmpty() && !locationVal.equals("N.A"))){
				  List<Object[]> contentForLocationIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeLocation(1, genderVal, businessVal, locationVal, String.valueOf(age_Val));
					for(Object objLocation: contentForLocationIntendedUserlist){
						finalList.add(Long.parseLong(objLocation.toString())); 
					  }
			  }
		//Condition to Match in PeronalisedContent based on userId
			 List<Object[]> contentForUserIdBasedlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeUserId(2, businessVal, empID);
			  
			  for(Object objUserId: contentForUserIdBasedlist){
				  finalList.add(Long.parseLong(objUserId.toString()));
				  }
			  
			  logger.info("Final Intended Content Id List : "+finalList);
			  return finalList;
	}catch (Exception e) {
		logger.error(e.getMessage());
		return null;
	}
	}



}
