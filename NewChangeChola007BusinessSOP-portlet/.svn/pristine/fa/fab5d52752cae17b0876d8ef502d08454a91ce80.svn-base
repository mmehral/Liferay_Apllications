package com.chola.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
import com.chola.personalisedparameters.model.bsopdetails;
import com.chola.personalisedparameters.model.bsoppath;
import com.chola.personalisedparameters.service.bsopdetailsLocalServiceUtil;
import com.chola.personalisedparameters.service.bsoppathLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

public class BusinessSOPAction extends MVCPortlet {
	
	public void sendNotification(ActionRequest actionRequest, ActionResponse actionResponse) {
		String empId=ParamUtil.getString(actionRequest, "empid");	
		System.out.println("Entered Employee Id : "+empId);
		
		
	}
	
	public void save(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		int arrLength = ParamUtil.getParameterValues(actionRequest, "secondList").length;
		int arrLength1 = ParamUtil.getParameterValues(actionRequest, "thirdList").length;
	
		String uniqueId=ParamUtil.getString(actionRequest, "uniqueId");

		String eventDetails = ParamUtil.getString(actionRequest, "eventdetails");

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String buinesstitle = actionRequest.getParameter("buinesstitle");
		
		String businessSOPUniqueId=actionRequest.getParameter("uniqueId");
		
		String buinessDesc = actionRequest.getParameter("buinessDesc");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		// Size of List.............
		String contestlist = uploadRequest.getParameter("contestlist");
		int contesttableId = Integer.parseInt(contestlist);
		System.out.println(contestlist);
		
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date();
		long uniqueContentId = Long.parseLong(df2.format(date));
		bsoppath path = null;
		try{
			if (arrLength >= 1) {
				long notification_type=1;
				String[] values = ParamUtil.getParameterValues(actionRequest, "secondList");
				String optionValue = ParamUtil.getString(actionRequest, "option");
				String businessId = ParamUtil.getString(actionRequest, "business");
				String gender = ParamUtil.getString(actionRequest, "gender");
				String age_arr = ParamUtil.getString(actionRequest, "age");
				String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
				String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
				String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
				String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");
				String between_from_to_age=between_from_age+"&"+between_to_age;
				
				System.out.println("Gender : "+gender);
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
				
				bsopdetails sop = bsopdetailsLocalServiceUtil.createbsopdetails(CounterLocalServiceUtil.increment());
				sop.setContent_id(uniqueContentId);
				sop.setBtitle(buinesstitle);
				sop.setBdesc(buinessDesc);
				sop.setCreatedby(String.valueOf(themeDisplay.getUserId()));
				sop.setCreateddate(date);
				sop.setFlag("1");
				sop=bsopdetailsLocalServiceUtil.addbsopdetails(sop);
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
					
					path = bsoppathLocalServiceUtil.createbsoppath(CounterLocalServiceUtil.increment());
					path.setBdoc(fileName.toString());
					path.setCreatedby(String.valueOf(themeDisplay.getUserId()));
					path.setCreateddate(date);
					path.setFlag("1");
					path.setFilename(sourceFileName);
					path.setBdetails_id(sop.getId());
					path.setBdetailscontent_id(sop.getContent_id());
					path = bsoppathLocalServiceUtil.addbsoppath(path);

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
					path = bsoppathLocalServiceUtil.createbsoppath(CounterLocalServiceUtil.increment());
					path.setBdoc(fileName.toString());
					path.setCreatedby(String.valueOf(themeDisplay.getUserId()));
					path.setCreateddate(date);
					path.setFlag("1");
					path.setFilename(sourceFileName);
					path.setBdetails_id(sop.getId());
					path.setBdetailscontent_id(sop.getContent_id());
					path = bsoppathLocalServiceUtil.addbsoppath(path);	

					}
				
				Object[] notificationDetails={"Business_SOP","Business SOP has been uploaded",1,3,"Web Content",1,1};
				
				
				boolean insertPersonaliseParameters=bsopdetailsLocalServiceUtil.insertPersonalisedParameters(businessId, values, gender, age_arr, optionValue, uniqueContentId,lessthan_age,greaterthan_age,between_from_to_age,notificationDetails,notification_type);
				
				System.out.println("Is SuccessFully Inserted?  : "+insertPersonaliseParameters);
				
			}
			else if(arrLength1>=1){
				long notification_type=2;
				String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
				String optionValue = ParamUtil.getString(actionRequest, "option");
				String businessId = ParamUtil.getString(actionRequest, "business");
				String gender = ParamUtil.getString(actionRequest, "gender");
				String age_arr = ParamUtil.getString(actionRequest, "age");
				String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
				String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
				String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
				String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");
				String between_from_to_age=between_from_age+"&"+between_to_age;
				
				Object[] notificationDetails={"Business_SOP","Business SOP has been uploaded",1,3,"Web Content",1,1};
				
				//String[] empids = "";
				List<String> empids=new ArrayList<String>();
				for(int i=0;i<values.length;i++){
					String str = values[i].toString();
			        int firstBracket = str.indexOf('(');
			        String empId = str.substring(firstBracket + 1, str.indexOf(')', firstBracket));
			        System.out.println(empId);
			        empids.add(empId);
				}
				System.out.println("List Of employee iDs : "+empids.toString());
				String[] finalValues=empids.toArray(new String[0]);
				
				System.out.println("Final Values : "+finalValues.toString());
				
				boolean insertPersonaliseParameters=bsopdetailsLocalServiceUtil.insertPersonalisedParameters(businessId, finalValues, gender, age_arr, optionValue, uniqueContentId,lessthan_age,greaterthan_age,between_from_to_age,notificationDetails,notification_type);
				System.out.println("Is SuccessFully Inserted?  : "+insertPersonaliseParameters);
			}
			else{
				long notification_type=0;
				String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
				String optionValue = ParamUtil.getString(actionRequest, "option");
				String businessId = ParamUtil.getString(actionRequest, "business");
				String gender = ParamUtil.getString(actionRequest, "gender");
				String age_arr = ParamUtil.getString(actionRequest, "age");
				String lessthan_age = ParamUtil.getString(actionRequest, "lessthanvalue");
				String greaterthan_age = ParamUtil.getString(actionRequest, "greaterthanvalue");
				String between_from_age = ParamUtil.getString(actionRequest, "betweenfromvalue");
				String between_to_age = ParamUtil.getString(actionRequest, "betweentovalue");
				String between_from_to_age=between_from_age+"&"+between_to_age;
				
				System.out.println("Gender : "+gender);
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
				
				Object[] notificationDetails={"Business_SOP","Business SOP has been uploaded",1,3,"Web Content",1,1};
				System.out.println("All User  :" +optionValue);
				System.out.println("Age Type : "+age_arr);
				boolean insertPersonaliseParameters=bsopdetailsLocalServiceUtil.insertPersonalisedParameters(businessId, values, gender, age_arr, optionValue, uniqueContentId,lessthan_age,greaterthan_age,between_from_to_age,notificationDetails,notification_type);
				
				System.out.println("Is SuccessFully Inserted?  : "+insertPersonaliseParameters);
			}
			
			
		}catch (Exception e) {
e.printStackTrace();		}
	}
	
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		System.out.println("In action serveResource");
		System.out.println("Resource Id : " + resourceRequest.getResourceID().toString());
		
		try {

		 if (resourceRequest.getResourceID().equalsIgnoreCase("usersCall")) {
					System.out.println("Fetch User ID");
					
					List<Object[]> lt = bsopdetailsLocalServiceUtil.getUsers();
					
					Iterator it = lt.iterator();

					JSONObject obj = new JSONObject();
					JSONArray jArray = new JSONArray();
					PrintWriter writer = resourceResponse.getWriter();

					while (it.hasNext()) {
						Object object = (Object) it.next();
						JSONObject obj1 = new JSONObject();
						System.out.println("Value : "+object);
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
					List<String> lt = bsopdetailsLocalServiceUtil.getCompany();
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
						lt = bsopdetailsLocalServiceUtil.getUnit(businessId);
					} else if (resourceRequest.getResourceID().equalsIgnoreCase("Function")) {
						lt = bsopdetailsLocalServiceUtil.getFunction(businessId);
					} else if (resourceRequest.getResourceID().equalsIgnoreCase("Department")) {
						lt = bsopdetailsLocalServiceUtil.getDepart(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Designation")) {
						lt = bsopdetailsLocalServiceUtil.getDesignation(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Product")) {
						lt = bsopdetailsLocalServiceUtil.getProduct(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Zone")) {
						lt = bsopdetailsLocalServiceUtil.getZone(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Branch")) {
						lt = bsopdetailsLocalServiceUtil.getBranch(businessId);
					}
					
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Grade")) {
						lt = bsopdetailsLocalServiceUtil.getGrade(businessId);
					}
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Region")) {
						lt = bsopdetailsLocalServiceUtil.getRegion(businessId);
					}
					else if (resourceRequest.getResourceID().equalsIgnoreCase("Location")) {
						lt = bsopdetailsLocalServiceUtil.getLocation(businessId);
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
	
	public String fileUpload(ActionRequest request, ActionResponse response, UploadPortletRequest uploadRequest,
			String fileName, File sourceFile) throws IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		

		String str = "BusinessSopUpload";

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
}
