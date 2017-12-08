package com.chola.books;

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
import com.chola.book.model.bookdetails;
import com.chola.book.service.bookdetailsLocalServiceUtil;
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

public class BookAction extends MVCPortlet {
	private static final Log logger = LogFactoryUtil.getLog(BookAction.class);
	public void save(ActionRequest actionRequest, ActionResponse actionResponse)
			throws ParseException, IOException, PortalException {

		int arrLength = ParamUtil.getParameterValues(actionRequest, "secondList").length;
		int arrLength1 = ParamUtil.getParameterValues(actionRequest, "thirdList").length;


		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String booktitle = actionRequest.getParameter("booktitle");
		
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String sourceFileName = uploadRequest.getFileName("uploadedFile");
		
		
		String fileName=null;
		if(!sourceFileName.equalsIgnoreCase(""))
		{
			logger.info("File selected by user");
			fileName = fileUpload(actionRequest,actionResponse);
		}
		else
		{
			logger.info("File not selected by user");
		}
		
		Date date = new Date();
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		long uniqueContentId = Long.parseLong(df2.format(date));
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
			
			
			
			bookdetails book = bookdetailsLocalServiceUtil.createbookdetails(CounterLocalServiceUtil.increment());
			book.setBooktitle(booktitle);
			book.setCreatedby(themeDisplay.getUserId());
			book.setBookpath("/BookWormUpload/admin/"+fileName);
			book.setBookname(sourceFileName);
			book.setFlag("1");
			book.setContent_id(uniqueContentId);
			book.setCreateddate(new Date());
			book=bookdetailsLocalServiceUtil.addbookdetails(book);
			
			Object[] notificationDetails={book.getContent_id(),1,1,"Book_Worm",book.getBooktitle()+" - Book Worm has been uploaded",currentPageUrl};
			
			
			boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, values, gender, age_type, optionValue, book.getContent_id(), lessthan_age, greaterthan_age, between_from_to_age, notification_type);
			}
			logger.info("Is SuccessFully Inserted?  : "+insert1);
		}
		
		// list 2
		else if(arrLength1>=1){
			long notification_type=2;
			String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
			bookdetails book = bookdetailsLocalServiceUtil.createbookdetails(CounterLocalServiceUtil.increment());
			book.setBooktitle(booktitle);
			book.setCreatedby(themeDisplay.getUserId());
			book.setBookpath("/BookWormUpload/admin/"+fileName);
			book.setBookname(sourceFileName);
			book.setFlag("1");
			book.setContent_id(uniqueContentId);
			book.setCreateddate(new Date());
			book=bookdetailsLocalServiceUtil.addbookdetails(book);
	
			List<String> empids=new ArrayList<String>();
			for(int i=0;i<values.length;i++){
				String str = values[i].toString();
		        int firstBracket = str.indexOf('(');
		        String empId = str.substring(firstBracket + 1, str.indexOf(')', firstBracket));
		        empids.add(empId);
			}
			String[] finalValues=empids.toArray(new String[0]);
			
			logger.info("Final Values : "+finalValues.toString());
			
			Object[] notificationDetails={book.getContent_id(),1,1,"Book_Worm",book.getBooktitle()+" - Book Worm has been uploaded",currentPageUrl};
			
			boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, finalValues, "ALL", "all", optionValue, book.getContent_id(), null, null, null, notification_type);
			}		

			}

		else{
			long notification_type=0;
			String[] values = ParamUtil.getParameterValues(actionRequest, "thirdList");
			
			
			
			bookdetails book = bookdetailsLocalServiceUtil.createbookdetails(CounterLocalServiceUtil.increment());
			book.setBooktitle(booktitle);
			book.setCreatedby(themeDisplay.getUserId());
			book.setBookpath("/BookWormUpload/admin/"+fileName);
			book.setBookname(sourceFileName);
			book.setFlag("1");
			book.setContent_id(uniqueContentId);
			book.setCreateddate(new Date());
			book=bookdetailsLocalServiceUtil.addbookdetails(book);

Object[] notificationDetails={book.getContent_id(),1,1,"Book_Worm",book.getBooktitle()+" - Book Worm has been uploaded",currentPageUrl};
			
			boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, values, gender, age_type, optionValue, book.getContent_id(), lessthan_age, greaterthan_age, between_from_to_age, notification_type);
			}
		}
		}catch (Exception e) {
			
		}
		
	}
	
	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			logger.info("Comment is successfully added........");
		} catch (Exception e) {
			
		}
	}

	public String fileUpload(ActionRequest request, ActionResponse response) throws IOException
	{
		String fileName = null;
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
	    //Creating the folder Structure in Tomcat as WebApps/SochoUpload/userId folder will create

	    String str = "BookWormUpload";

		String userId="admin";
		
		java.util.Properties properties = PortalUtil.getPortalProperties();
		File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		File destinationFile = new File(
				properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + userId);

		if (!contestfolder.exists()) {
			destinationFile.mkdirs();
			logger.info("type directory exists");
		}

		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
			logger.info("type directory exists");
		}
		
				
				
		File sourceFile = uploadRequest.getFile("uploadedFile");
		fileName = uploadRequest.getFileName("uploadedFile");
			
		if(fileName!=null){
				/**************** SAVE THE DOC ********************************/
			if (destinationFile.exists()) {
				fileName.lastIndexOf(".");
				String fileNa = fileName.substring(0,fileName.lastIndexOf("."));
				String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
				//logger.info("FileName:-" + fileNa + " File Extension:-"+ fileExtension4);
				fileName = fileNa;
				SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
				Date date = new Date();
				String testDateString = df2.format(date);
				fileName = fileName +"_"+testDateString +fileExtension;

				destinationFile = new File(
						properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + userId + "/" + fileName);

				logger.info("destinationFile : " + destinationFile);

			}
			logger.info("File : " + fileName);
			FileUtil.copyFile(sourceFile, destinationFile);
			
			
			String FilePath = destinationFile.toString();
			logger.info("Successfully Saved the Document");
			/*************** ENDED THE SAVING ******************/
			logger.info(FilePath);
	}
		return fileName;
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
	
		logger.info("In action serveResource");
		
		//New Code with using External Portlet 
				logger.info("In action serveResource");
				
				try {
					String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
					 if (cmd.equals("getusers")) {
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

						else if (resourceRequest.getResourceID().equalsIgnoreCase("serviceCall")) {

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
	
	
	public void deleteBook(ActionRequest request, ActionResponse response) throws PortalException {
		
		logger.info("Inside Delete Book");
		long id = ParamUtil.getInteger(request, "id");
		
		logger.info("ID to be deleted : "+id);
		
		if(id>=1)
		{
			bookdetails sop = bookdetailsLocalServiceUtil.fetchbookdetails(id);
			sop.setFlag("2");
			bookdetailsLocalServiceUtil.updatebookdetails(sop);
			logger.info("Record deleted Successfully");
			
			response.setRenderParameter("jspPage", "/view.jsp");
			long flag=0;
			String notificationText="Book Worm has been Deleted";
			long content_id=sop.getContent_id();
			
			boolean updatedeleteSucces=contentupdateLocalServiceUtil.changeContentFlagForUpdateDelete(flag,notificationText, content_id);
			logger.info("Is Flag changed after Delete : "+updatedeleteSucces);
		}
		
	}
	
	public void updateBook(ActionRequest request, ActionResponse response) throws PortalException, IOException {
		
	ThemeDisplay themeDisplay =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

		logger.info("Inside Update Book");
		long id = ParamUtil.getInteger(request, "id");
		
		String booktitle = ParamUtil.getString(request, "booktitle");
		
		logger.info("ID to be updated : "+id+" title : "+booktitle);
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		String sourceFileName = uploadRequest.getFileName("uploadedFile");
		
		logger.info("File Name : "+sourceFileName);
		
		String fileName=null;
		if(!sourceFileName.equalsIgnoreCase(""))
		{
			logger.info("File selected by user");
			fileName = fileUpload(request,response);
		}
		else
		{
			logger.info("File not selected by user");
		}
		
		
		
			bookdetails sop = bookdetailsLocalServiceUtil.fetchbookdetails(id);
			sop.setBooktitle(booktitle);
			sop.setBookname(sourceFileName);
			sop.setBookpath("/BookWormUpload/admin/"+fileName);
			sop.setModifiedby(themeDisplay.getUserId());
			sop.setModifieddate(new Date());
			sop.setCreateddate(new Date());
			
			bookdetailsLocalServiceUtil.updatebookdetails(sop);
			
			logger.info("Record Updated Successfully");
			
			long flag=2;
			String notificationText=sop.getBooktitle()+" - Book Worm has been Updated";
			long content_id=sop.getContent_id();
			boolean updatedeleteSucces=contentupdateLocalServiceUtil.changeContentFlagForUpdateDelete(flag,notificationText, content_id);
			logger.info("Is Flag changed after Delete : "+updatedeleteSucces);
	}

public static List<Long> getUniqueContentIdBasedOnLoggedInUser(String empId){
	empId=NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(empId);
		List<Long> finalList=new ArrayList<Long>();
		PeoplePowerAPI pp=new PeoplePowerAPI();
		org.json.JSONObject employeeinfo=pp.getEmployeeInfo(empId);
		//org.json.JSONObject employeeinfo=pp.getEmployeeInfo("V481");
		logger.info("Data from People Power API getEmpInfo : "+employeeinfo.toString());
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
		
		  businessVal=employeeinfo.getString("Business");
		  unitVal=employeeinfo.getString("Unit");
		  functionVal=employeeinfo.getString("FunctionName");
		  departmentVal=employeeinfo.getString("Department");
		  designationVal=employeeinfo.getString("Designation");
		  productVal=employeeinfo.getString("Product");
		  zoneVal=employeeinfo.getString("Zone");
		  gradeVal=employeeinfo.getString("Grade");
		  regionVal=employeeinfo.getString("Region");
		  branchVal=employeeinfo.getString("Branch");
		  locationVal=employeeinfo.getString("Location");
		  genderVal=employeeinfo.getString("Gender");

		  String empID=employeeinfo.getString("EmpId");
		try{
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
