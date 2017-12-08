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

import com.chola.bsop.model.bsopdetails;
import com.chola.bsop.model.bsoppath;
import com.chola.bsop.service.bsopdetailsLocalServiceUtil;
import com.chola.bsop.service.bsoppathLocalServiceUtil;
import com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import peoplepowerapi.PeoplePowerAPI;

public class BSopAction extends MVCPortlet {
	private static final Log logger = LogFactoryUtil.getLog(BSopAction.class);
	
	public void save(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		int arrLength = ParamUtil.getParameterValues(actionRequest, "secondList").length;
		int arrLength1 = ParamUtil.getParameterValues(actionRequest, "thirdList").length;
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String buinesstitle = actionRequest.getParameter("buinesstitle");
		String buinessDesc = actionRequest.getParameter("buinessDesc");
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		// Size of List.............
		String contestlist = uploadRequest.getParameter("contestlist");
		int contesttableId = Integer.parseInt(contestlist);
		
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		Date date = new Date();
		long uniqueContentId = Long.parseLong(df2.format(date));
		bsoppath path = null;
		
		String optionValue = ParamUtil.getString(actionRequest, "option");
		String businessId = ParamUtil.getString(actionRequest, "business");
		String gender = ParamUtil.getString(actionRequest, "gender");
		String ageArr = ParamUtil.getString(actionRequest, "age");
		String lessThanAge = ParamUtil.getString(actionRequest, "lessthanvalue");
		String greaterThanAge = ParamUtil.getString(actionRequest, "greaterthanvalue");
		String betweenFromAge = ParamUtil.getString(actionRequest, "betweenfromvalue");
		String betweenToAge = ParamUtil.getString(actionRequest, "betweentovalue");
		String betweenFromToAge=betweenFromAge+"&"+betweenToAge;
		String ageType=ageArr;
		if ("all".equalsIgnoreCase(ageArr)) {
		} else if ("lessthan".equalsIgnoreCase(ageArr)) {
			ageType = "Less than";
		} else if ("greaterthan".equalsIgnoreCase(ageArr)) {
			ageType = "Greater than";
		} else if ("between".equalsIgnoreCase(ageArr)) {
			ageType = "Between";
		}
		
		logger.info("Gender : "+gender);
		if ("all".equalsIgnoreCase(ageArr)) {
		} else if ("lessthan".equalsIgnoreCase(ageArr)) {
			ageArr = "Less than " + lessThanAge;
		} else if ("greaterthan".equalsIgnoreCase(ageArr)) {
			ageArr = "Greater than " + greaterThanAge;
		} else if ("between".equalsIgnoreCase(ageArr)) {
			ageArr = "Between " + betweenFromAge + " to " + betweenToAge;
		}
		
		String currentPageUrl=themeDisplay.getURLCurrent();

		if(currentPageUrl.contains("?"))
		{
			currentPageUrl = currentPageUrl.substring(0, currentPageUrl.indexOf("?"));
		}
			try{
			if (arrLength >= 1) {
				long notificationType=1;
				String[] values = ParamUtil.getParameterValues(actionRequest, "secondList");
				bsopdetails sop = bsopdetailsLocalServiceUtil.createbsopdetails(CounterLocalServiceUtil.increment());
				sop.setContent_id(uniqueContentId);
				sop.setBtitle(buinesstitle);
				sop.setBdesc(buinessDesc);
				sop.setCreatedby(String.valueOf(themeDisplay.getUserId()));
				sop.setCreateddate(date);
				sop.setFlag("1");
				sop=bsopdetailsLocalServiceUtil.addbsopdetails(sop);
				
				if (contesttableId == 0) {
					File sourceFile = uploadRequest.getFile("contesttable[0].upload");
					String sourceFileName = uploadRequest.getFileName("contesttable[0].upload");

					String fileName = null;
					if (!sourceFileName.isEmpty()) {
						logger.info("File selected by user");
						fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
					} else {
						logger.info("File not selected by user");
					}
					
					path = bsoppathLocalServiceUtil.createbsoppath(CounterLocalServiceUtil.increment());
					path.setBdoc("/BusinessSopUpload/admin/"+fileName);
					path.setCreatedby(String.valueOf(themeDisplay.getUserId()));
					path.setCreateddate(date);
					path.setFlag("1");
					path.setFilename(sourceFileName);
					path.setBdetails_id(sop.getId());
					path.setBdetailscontent_id(sop.getContent_id());
					bsoppathLocalServiceUtil.addbsoppath(path);

				}
				// The Image upload for more than
				// One.........................................
				for (int i = 0; i < contesttableId - 1; i++) {
					File sourceFile = uploadRequest.getFile("contesttable[" + i + "].upload");
					String sourceFileName = uploadRequest.getFileName("contesttable[" + i + "].upload");
		             String fileName = null;
					if (!sourceFileName.isEmpty()) {
						logger.info("File selected by user");
						fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
					} else {
						logger.info("File not selected by user");
					}
					path = bsoppathLocalServiceUtil.createbsoppath(CounterLocalServiceUtil.increment());
					path.setBdoc("/BusinessSopUpload/admin/"+fileName);
					path.setCreatedby(String.valueOf(themeDisplay.getUserId()));
					path.setCreateddate(date);
					path.setFlag("1");
					path.setFilename(sourceFileName);
					path.setBdetails_id(sop.getId());
					path.setBdetailscontent_id(sop.getContent_id());
					 bsoppathLocalServiceUtil.addbsoppath(path);	
					}
				
				Object[] notificationDetails={sop.getContent_id(),1,1,"Business SOP",sop.getBtitle()+" - Business SOP has been uploaded",currentPageUrl};
				
				
				boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
				
				if(insert1){
					boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, values, gender, ageType, optionValue, sop.getContent_id(), lessThanAge, greaterThanAge, betweenFromToAge, notificationType);
					logger.info(insert2);
				}
				logger.info("Is SuccessFully Inserted?  : "+insert1);
			}
			else if(arrLength1>=1){
				long notificationType=2;
				String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
				
				bsopdetails sop = bsopdetailsLocalServiceUtil.createbsopdetails(CounterLocalServiceUtil.increment());
				sop.setContent_id(uniqueContentId);
				sop.setBtitle(buinesstitle);
				sop.setBdesc(buinessDesc);
				sop.setCreatedby(String.valueOf(themeDisplay.getUserId()));
				sop.setCreateddate(date);
				sop.setFlag("1");
				sop=bsopdetailsLocalServiceUtil.addbsopdetails(sop);
				logger.info("Business Created with ID : " + sop.getId());
				// The Image upload for more than
				
				if (contesttableId == 0) {
					File sourceFile = uploadRequest.getFile("contesttable[0].upload");
					String sourceFileName = uploadRequest.getFileName("contesttable[0].upload");

					String fileName = "";
					if (!sourceFileName.isEmpty()) {
						logger.info("File selected by user");
						fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
					} else {
						logger.info("File not selected by user");
					}
					
					path = bsoppathLocalServiceUtil.createbsoppath(CounterLocalServiceUtil.increment());
					path.setBdoc("/BusinessSopUpload/admin/"+fileName.toString());
					path.setCreatedby(String.valueOf(themeDisplay.getUserId()));
					path.setCreateddate(date);
					path.setFlag("1");
					path.setFilename(sourceFileName);
					path.setBdetails_id(sop.getId());
					path.setBdetailscontent_id(sop.getContent_id());
					 bsoppathLocalServiceUtil.addbsoppath(path);

				}
				// The Image upload for more than
				// One.........................................
				for (int i = 0; i < contesttableId - 1; i++) {
					File sourceFile = uploadRequest.getFile("contesttable[" + i + "].upload");
					String sourceFileName = uploadRequest.getFileName("contesttable[" + i + "].upload");
		             String fileName = null;
					if (!sourceFileName.isEmpty()) {
						logger.info("File selected by user");
						fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
					} else {
						logger.info("File not selected by user");
					}
					path = bsoppathLocalServiceUtil.createbsoppath(CounterLocalServiceUtil.increment());
					path.setBdoc("/BusinessSopUpload/admin/"+fileName);
					path.setCreatedby(String.valueOf(themeDisplay.getUserId()));
					path.setCreateddate(date);
					path.setFlag("1");
					path.setFilename(sourceFileName);
					path.setBdetails_id(sop.getId());
					path.setBdetailscontent_id(sop.getContent_id());
					 bsoppathLocalServiceUtil.addbsoppath(path);	
					}
				
				Object[] notificationDetails={sop.getContent_id(),1,1,"Business SOP",sop.getBtitle()+" - Business SOP has been uploaded",currentPageUrl};
				
				List<String> empids=new ArrayList<>();
				for(int i=0;i<values.length;i++){
					String str = values[i].toString();
			        int firstBracket = str.indexOf('(');
			        String empId = str.substring(firstBracket + 1, str.indexOf(')', firstBracket));
			        logger.info(empId);
			        empids.add(empId);
				}
				logger.info("List Of employee iDs : "+empids.toString());
				String[] finalValues=empids.toArray(new String[0]);
				
boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
				
				if(insert1){
					boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, finalValues, "ALL", "all", optionValue, sop.getContent_id(), null, null, null, notificationType);
					logger.info(insert2);
				}
			}
			else{
				long notificationType=0;
				String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
				logger.info("New AGe Type : "+ageType);
				bsopdetails sop = bsopdetailsLocalServiceUtil.createbsopdetails(CounterLocalServiceUtil.increment());
				sop.setContent_id(uniqueContentId);
				sop.setBtitle(buinesstitle);
				sop.setBdesc(buinessDesc);
				sop.setCreatedby(String.valueOf(themeDisplay.getUserId()));
				sop.setCreateddate(date);
				sop.setFlag("1");
				sop=bsopdetailsLocalServiceUtil.addbsopdetails(sop);
				logger.info("Business Created with ID : " + sop.getId());
				// The Image upload for more than
				// One.........................................
				if (contesttableId == 0) {
					File sourceFile = uploadRequest.getFile("contesttable[0].upload");
					String sourceFileName = uploadRequest.getFileName("contesttable[0].upload");

					String fileName = null;
					if (!sourceFileName.isEmpty()) {
						logger.info("File selected by user");
						fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
					} else {
						logger.info("File not selected by user");
					}
					
					path = bsoppathLocalServiceUtil.createbsoppath(CounterLocalServiceUtil.increment());
					path.setBdoc("/BusinessSopUpload/admin/"+fileName);
					path.setCreatedby(String.valueOf(themeDisplay.getUserId()));
					path.setCreateddate(date);
					path.setFlag("1");
					path.setFilename(sourceFileName);
					path.setBdetails_id(sop.getId());
					path.setBdetailscontent_id(sop.getContent_id());
					bsoppathLocalServiceUtil.addbsoppath(path);
				}

				// The Image upload for more than
				// One.........................................
				for (int i = 0; i < contesttableId - 1; i++) {
					File sourceFile = uploadRequest.getFile("contesttable[" + i + "].upload");
					String sourceFileName = uploadRequest.getFileName("contesttable[" + i + "].upload");
		             String fileName = "";
					if (!sourceFileName.isEmpty()) {
						logger.info("File selected by user");
						fileName = fileUpload(actionRequest, actionResponse, uploadRequest, sourceFileName, sourceFile);
					} else {
						logger.info("File not selected by user");
					}
					path = bsoppathLocalServiceUtil.createbsoppath(CounterLocalServiceUtil.increment());
					path.setBdoc("/BusinessSopUpload/admin/"+fileName.toString());
					path.setCreatedby(String.valueOf(themeDisplay.getUserId()));
					path.setCreateddate(date);
					path.setFlag("1");
					path.setFilename(sourceFileName);
					path.setBdetails_id(sop.getId());
					path.setBdetailscontent_id(sop.getContent_id());
					 bsoppathLocalServiceUtil.addbsoppath(path);	

					}
				Object[] notificationDetails={sop.getContent_id(),1,1,"Business SOP",sop.getBtitle()+" - Business SOP has been uploaded",currentPageUrl};
				
					boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
					
					if(insert1){
						boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, values, gender, ageType, optionValue, sop.getContent_id(), lessThanAge, greaterThanAge, betweenFromToAge, notificationType);
					}
			
			}
		}catch (Exception e) {
logger.error(e.getMessage());}
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
		 if (cmd.equals("get_users")) {
					logger.info("Fetch User ID");
/*					
					List<Object[]> lt = contentupdateLocalServiceUtil.getUsers();
					
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

				else if ("serviceCall".equalsIgnoreCase(resourceRequest.getResourceID())) {

					logger.info("Inside Serveresource");
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
					List<String> lt = new ArrayList<>();
					String businessId = ParamUtil.getString(resourceRequest, "business");

					if ("Unit".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getUnit(businessId);
					} else if ("Function".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getFunction(businessId);
					} else if ("Department".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getDepart(businessId);
					}
					
					else if ("Designation".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getDesignation(businessId);
					}
					
					else if ("Product".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getProduct(businessId);
					}
					
					else if ("Zone".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getZone(businessId);
					}
					
					else if ("Branch".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getBranch(businessId);
					}
					
					else if ("Grade".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getGrade(businessId);
					}
					else if ("Region".equalsIgnoreCase(resourceRequest.getResourceID())) {
						lt = contentupdateLocalServiceUtil.getRegion(businessId);
					}
					else if ("Location".equalsIgnoreCase(resourceRequest.getResourceID())) {
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
	
	public String fileUpload(ActionRequest request, ActionResponse response, UploadPortletRequest uploadRequest,
			String fileName, File sourceFile) throws IOException {
		String str = "BusinessSopUpload";

		String role = "admin";
		java.util.Properties properties = PortalUtil.getPortalProperties();
		logger.info("my properties is...." + properties);
		File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		File destinationFile = new File(
				properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + role);

		if (!contestfolder.exists()) {
			destinationFile.mkdirs();
			logger.info("type directory exists");
		}
		logger.info("my directory is : " + contestfolder);

		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
			logger.info("type directory exists");
		}
		logger.info("my directory is : " + destinationFile);

	
		if (fileName != null) {
			/**************** SAVE THE DOC ********************************/
			if (destinationFile.exists()) {
				String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
				String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
				fileName = fileNa;
				SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
				Date date = new Date();
				String testDateString = df2.format(date);
				fileName = fileName + "_" + testDateString + fileExtension;

				destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str
						+ "/" + role + "/" + fileName);


			}
			FileUtil.copyFile(sourceFile, destinationFile);

			logger.info("Successfully Saved the Document");
			/*************** ENDED THE SAVING ******************/
		}
		return fileName;
	}

	public void deleteSop(ActionRequest request, ActionResponse response) throws PortalException {
		
		logger.info("Inside Delete SOP");
		long id = ParamUtil.getInteger(request, "id");
		if(id>=1)
		{
			bsopdetails sop = bsopdetailsLocalServiceUtil.fetchbsopdetails(id);
			sop.setFlag("2");
			bsopdetailsLocalServiceUtil.updatebsopdetails(sop);
			logger.info("Record deleted Successfully");
			response.setRenderParameter("jspPage", "/html/view.jsp");
			long flag=0;
			String notificationText="Business SOP has been Deleted";
			long content_id=sop.getContent_id();
			boolean updatedeleteSucces=contentupdateLocalServiceUtil.changeContentFlagForUpdateDelete(flag,notificationText, content_id);
			logger.info("Is Flag changed after Delete : "+updatedeleteSucces);
		}
	}

	public void updateSop(ActionRequest request, ActionResponse response) throws PortalException {
	
	ThemeDisplay themeDisplay =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

		logger.info("Inside Update SOP");
		long id = ParamUtil.getInteger(request, "id");
		
		String title = ParamUtil.getString(request, "title");
		String desc = ParamUtil.getString(request, "desc");
		
			bsopdetails sop = bsopdetailsLocalServiceUtil.fetchbsopdetails(id);
			sop.setBtitle(title);
			sop.setBdesc(desc);
			sop.setModifiedby(themeDisplay.getUserId());
			sop.setModifieddate(new Date());
			bsopdetailsLocalServiceUtil.updatebsopdetails(sop);
			
			logger.info("Record Updated Successfully");
			long flag=2;
			String notificationText=sop.getBtitle()+" - Business SOP has been Updated";
			long content_id=sop.getContent_id();
			boolean updatedeleteSucces=contentupdateLocalServiceUtil.changeContentFlagForUpdateDelete(flag,notificationText, content_id);
			logger.info("Is Flag changed after Delete : "+updatedeleteSucces);
			
	}

	public static List<Long> getContentIdBasedOnLoggedInUser(String empId){
	try{
	empId=NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(empId);
	List<Long> finalList=new ArrayList<>();
	//PeoplePowerAPI pp=new PeoplePowerAPI();
	//org.json.JSONObject employeeinfo=pp.getEmployeeInfo("V481");
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
	  String notApplicable="N.A";
	
	//Condition to Match in PeronalisedContent for  All USer
		List<Object[]> contentForAllUserlist = NoticationCategoryCountLocalServiceUtil
				.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
		 for(Object obj: contentForAllUserlist){
			  
			 finalList.add(Long.parseLong(obj.toString()));
		 }
		//Condition to Match in PeronalisedContent for  Intended USer
		  //Unit Match
		  if((unitVal != null && !unitVal.isEmpty() && !unitVal.equals(notApplicable))){
		List<Object[]> contentForUnitIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
		for(Object objUnit: contentForUnitIntendedUserlist){
			finalList.add(Long.parseLong(objUnit.toString())); 
		  }
		  }
		  
		  //Function Match
		  if((functionVal != null && !functionVal.isEmpty() && !functionVal.equals(notApplicable))){
			  List<Object[]> contentForFunctionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
				for(Object objFunction: contentForFunctionIntendedUserlist){
					finalList.add(Long.parseLong(objFunction.toString())); 
				}
		  }
		  
		  //Department Match
		  if((departmentVal != null && !departmentVal.isEmpty() && !departmentVal.equals(notApplicable))){
			  List<Object[]> contentForDepartmentIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
				for(Object objDepartment: contentForDepartmentIntendedUserlist){
					finalList.add(Long.parseLong(objDepartment.toString())); 
					}
		  }
		  
		  //Designation Match
		  if((designationVal != null && !designationVal.isEmpty() && !designationVal.equals(notApplicable))){
			  List<Object[]> contentForDesignationIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
				for(Object objDesignation: contentForDesignationIntendedUserlist){
					finalList.add(Long.parseLong(objDesignation.toString())); 
				  }
		  }
		  
		  //Product Match
		  if((productVal != null && !productVal.isEmpty() && !productVal.equals(notApplicable))){
			  List<Object[]> contentForProductIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
				for(Object objProduct: contentForProductIntendedUserlist){
					finalList.add(Long.parseLong(objProduct.toString())); 
				  }
		  }
		  
		  //Zone Match
		  if((zoneVal != null && !zoneVal.isEmpty() && !zoneVal.equals(notApplicable))){
			  List<Object[]> contentForZoneIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
				for(Object objZone: contentForZoneIntendedUserlist){
					finalList.add(Long.parseLong(objZone.toString())); 
				  }
		  }
		  
		  //Grade Match
		  if((gradeVal != null && !gradeVal.isEmpty() && !gradeVal.equals(notApplicable))){
			  List<Object[]> contentForGradeIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
				for(Object objGrade: contentForGradeIntendedUserlist){
					finalList.add(Long.parseLong(objGrade.toString())); 
				  }
		  }
		  
		  //Region Match
		  if((regionVal != null && !regionVal.isEmpty() && !regionVal.equals(notApplicable))){
			  List<Object[]> contentForRegionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
				for(Object objRegion: contentForRegionIntendedUserlist){
					finalList.add(Long.parseLong(objRegion.toString())); 
				  }
		  }
		  
		  //Branch Match
		  if((branchVal != null && !branchVal.isEmpty() && !branchVal.equals(notApplicable))){
			  List<Object[]> contentForBranchIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
				for(Object objBranch: contentForBranchIntendedUserlist){
					finalList.add(Long.parseLong(objBranch.toString())); 
				  }
		  }
		  
		  //Location Match
		  if((locationVal != null && !locationVal.isEmpty() && !locationVal.equals(notApplicable))){
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
