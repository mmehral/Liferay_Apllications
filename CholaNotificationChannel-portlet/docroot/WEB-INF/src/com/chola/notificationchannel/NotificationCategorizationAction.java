package com.chola.notificationchannel;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


import org.bouncycastle.crypto.engines.RijndaelEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PKCS7Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import com.chola.calendar.service.corporateeventsdataLocalServiceUtil;
import com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingcalendarLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import peoplepowerapi.PeoplePowerAPI;

public class NotificationCategorizationAction extends MVCPortlet {
	private static final Log logger = LogFactoryUtil.getLog(NotificationCategorizationAction.class);
	
	public String encryptPeoplePower(String plaintext)
	{
	String data="";

	try
	{
	byte[] sessionKey = "asfuyjkdhfcholae".getBytes("UTF-8"); 
	byte[] iv = "42309842389462374623784692423642".getBytes("UTF-8");

	logger.info("Emp ID for SSO : "+plaintext);

	byte [] dataBytes = plaintext.getBytes();

	PaddedBufferedBlockCipher cipher = new PaddedBufferedBlockCipher(
	new CBCBlockCipher(new RijndaelEngine(256)), new PKCS7Padding());
	cipher.init(true, new ParametersWithIV(new KeyParameter(sessionKey), iv));

	byte[] encrypted = new byte[cipher.getOutputSize(dataBytes.length)];
	int oLen = cipher.processBytes(dataBytes, 0, dataBytes.length, encrypted, 16);
	cipher.doFinal(encrypted, oLen); 
	data = Base64.getEncoder().encodeToString(encrypted);

	} catch (Exception e) {
	logger.error("Error",e);
	}
	return data; 
	}
	
	
	//Start : Code for Hobby Club,  to get list of notifications for message board 
	public static List<UserNotificationEvent> getDeliveredMessageBoard(long UserId){
		
		try{	
			
			
	List<UserNotificationEvent> allList= UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEvents(UserId, UserNotificationDeliveryConstants.TYPE_WEBSITE, true);
	List<UserNotificationEvent> mbList=new ArrayList<UserNotificationEvent>();

	for(UserNotificationEvent unv:allList){

		String portletType=unv.getType();
		boolean archived=unv.getArchived();
		
		if(portletType.equalsIgnoreCase("com_liferay_message_boards_web_portlet_MBPortlet")){
			if(!archived){
			mbList.add(unv);
			}
			}
	}
	return mbList;
		}catch (Exception e) {
	e.printStackTrace();
	return null;
		}
		}
	//End : Code for Hobby Club,  to get list of notifications for message board 
	
	 public static int getAge(Calendar dob) throws Exception {
	        Calendar today = Calendar.getInstance();

	        int curYear = today.get(Calendar.YEAR);
	        int dobYear = dob.get(Calendar.YEAR);

	        int age = curYear - dobYear;

	        // if dob is month or day is behind today's month or day
	        // reduce age by 1
	        int curMonth = today.get(Calendar.MONTH);
	        int dobMonth = dob.get(Calendar.MONTH);
	        if (dobMonth > curMonth) { // this year can't be counted!
	            age--;
	        } else if (dobMonth == curMonth) { // same month? check for day
	            int curDay = today.get(Calendar.DAY_OF_MONTH);
	            int dobDay = dob.get(Calendar.DAY_OF_MONTH);
	            if (dobDay > curDay) { // this year can't be counted!
	                age--;
	            }
	        }

	        return age;
	    }
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("updateTables")) {
			System.out.println("Inside Ajax updateTables");
			
			
			try {
				ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
				
				System.out.println(themeDisplay.getUserId());
				
				User thisUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
				String empId=NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(thisUser.getScreenName());
			PeoplePowerAPI pp=new PeoplePowerAPI();
			org.json.JSONObject employeeinfo=null;
			//employeeinfo=pp.getEmployeeInfo(empId);
			
			/*Code change from people power hit to table fetch 16_07_2017*/
			List<Object[]> activeEmployeeInfo=NoticationCategoryCountLocalServiceUtil.getActiveEmployeeInfoFromTable(empId);
			
			if(activeEmployeeInfo!=null){
				for (Object[] singleObjEmpInfo : activeEmployeeInfo) {
					JSONObject obj = new JSONObject();
					System.out.println("Business : " + singleObjEmpInfo[0].toString());
					System.out.println("Unit: " + singleObjEmpInfo[1].toString());
					System.out.println("FunctionName : " + singleObjEmpInfo[2].toString());
					System.out.println("Department: " + singleObjEmpInfo[3].toString());
					System.out.println("Designation : " + singleObjEmpInfo[4].toString());
					System.out.println("Product : " + singleObjEmpInfo[5].toString());
					System.out.println("Zone : " + singleObjEmpInfo[6].toString());
					System.out.println("Grade : " + singleObjEmpInfo[7].toString());
					System.out.println("Region : " + singleObjEmpInfo[8].toString());
					System.out.println("Branch : " + singleObjEmpInfo[9].toString());
					System.out.println("Location : " + singleObjEmpInfo[10].toString());
					System.out.println("gender : " + singleObjEmpInfo[11]);
					System.out.println("DOJ : " + singleObjEmpInfo[12].toString());
					System.out.println("Anniversary : " + singleObjEmpInfo[13]);
					System.out.println("Name : " + singleObjEmpInfo[14]);
					System.out.println("Birthday : " + singleObjEmpInfo[15].toString());
					System.out.println("EmpId : " + singleObjEmpInfo[16].toString());
					
				}
			}
			
			/*asasd*/
			
			
			PrintWriter writer=resourceResponse.getWriter();
			if(activeEmployeeInfo==null){
				System.out.println("Employee Info is null");
				JSONObject objPeoplePower = new JSONObject();
				JSONArray jArray = new JSONArray();
				JSONObject obj = new JSONObject();
				objPeoplePower.put("name", "");
				objPeoplePower.put("count", "");
				jArray.add(objPeoplePower);
				System.out.println(jArray);
				obj.put("data", jArray);
				writer.println(obj);
			}else{
				
			//JSONObject employeeinfo=null;
			  String content_idVal=null; 
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
			
			  
			  String birthday="";
			  String empID="";
			  for (Object[] singleObjEmpInfo : activeEmployeeInfo) {
				  
				  businessVal=singleObjEmpInfo[0].toString();
				  unitVal=singleObjEmpInfo[1].toString();
				  functionVal=singleObjEmpInfo[2].toString();
				  departmentVal=singleObjEmpInfo[3].toString();
				  designationVal=singleObjEmpInfo[4].toString();
				  productVal=singleObjEmpInfo[5].toString();
				  zoneVal=singleObjEmpInfo[6].toString();
				  gradeVal=singleObjEmpInfo[7].toString();
				  regionVal=singleObjEmpInfo[8].toString();
				  branchVal=singleObjEmpInfo[9].toString();
				  locationVal=singleObjEmpInfo[10].toString();
				  if(singleObjEmpInfo[11]!=null){
					  genderVal=singleObjEmpInfo[11].toString();
				  }
				  birthday=singleObjEmpInfo[15].toString();
				  empID=singleObjEmpInfo[16].toString();
				  

					
				}
			  
			  
			  
			  
			  
			  
				try {
					
					 SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

					 Calendar dob = Calendar.getInstance();
					 
					         dob.setTime(sdf.parse(birthday));

					 age_Val=getAge(dob);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
				logger.info("Visu Age is : "+age_Val);
			 	  
			  //Notification For all User
			  
			 List<Object[]> contentForAllUserlist = NoticationCategoryCountLocalServiceUtil
						.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
			  for(Object obj: contentForAllUserlist){
				  
				 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(obj.toString()), 1);
				  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
			  }
			  
			  //Notification for intended User
			  //Unit Match
			  if((unitVal != null && !unitVal.isEmpty() && !unitVal.equals("N.A"))){
			List<Object[]> contentForUnitIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
			for(Object objUnit: contentForUnitIntendedUserlist){
				  
				 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUnit.toString()), 1);
				  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
			  }
			  }
			  
			  //Function Match
			  if((functionVal != null && !functionVal.isEmpty() && !functionVal.equals("N.A"))){
				  List<Object[]> contentForFunctionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
					for(Object objFunction: contentForFunctionIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objFunction.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Department Match
			  if((departmentVal != null && !departmentVal.isEmpty() && !departmentVal.equals("N.A"))){
				  List<Object[]> contentForDepartmentIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
					for(Object objDepartment: contentForDepartmentIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDepartment.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Designation Match
			  if((designationVal != null && !designationVal.isEmpty() && !designationVal.equals("N.A"))){
				  List<Object[]> contentForDesignationIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
					for(Object objDesignation: contentForDesignationIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDesignation.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Product Match
			  if((productVal != null && !productVal.isEmpty() && !productVal.equals("N.A"))){
				  List<Object[]> contentForProductIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
					for(Object objProduct: contentForProductIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objProduct.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Zone Match
			  if((zoneVal != null && !zoneVal.isEmpty() && !zoneVal.equals("N.A"))){
				  List<Object[]> contentForZoneIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
					for(Object objZone: contentForZoneIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objZone.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Grade Match
			  if((gradeVal != null && !gradeVal.isEmpty() && !gradeVal.equals("N.A"))){
				  List<Object[]> contentForGradeIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
					for(Object objGrade: contentForGradeIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objGrade.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Region Match
			  if((regionVal != null && !regionVal.isEmpty() && !regionVal.equals("N.A"))){
				  List<Object[]> contentForRegionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
					for(Object objRegion: contentForRegionIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objRegion.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Branch Match
			  if((branchVal != null && !branchVal.isEmpty() && !branchVal.equals("N.A"))){
				  List<Object[]> contentForBranchIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
					for(Object objBranch: contentForBranchIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objBranch.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Location Match
			  if((locationVal != null && !locationVal.isEmpty() && !locationVal.equals("N.A"))){
				  List<Object[]> contentForLocationIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeLocation(1, genderVal, businessVal, locationVal, String.valueOf(age_Val));
					for(Object objLocation: contentForLocationIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objLocation.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Notification Based on Selected user ID
			  
			  List<Object[]> contentForUserIdBasedlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeUserId(2, businessVal, empID);
			  
			  for(Object objUserId: contentForUserIdBasedlist){
				  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUserId.toString()), 1);
					  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
			  
			  
			 /*XXXXXXXXXXXXXXXXXXXXXTraining Calendar DataXXXXXXXXXXXXXXXXXXXXXXX*/
			  
			  
			//Notification For all User
			  
				 List<Object[]> contentForTrainingAllUserlist = trainingcalendarLocalServiceUtil
							.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
				  for(Object obj: contentForTrainingAllUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(obj.toString()), 1);
					  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
				  
				  //Notification for intended User
				  //Unit Match
				  if((unitVal != null && !unitVal.isEmpty() && !unitVal.equals("N.A"))){
				List<Object[]> contentForUnitIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
				for(Object objUnit: contentForUnitIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUnit.toString()), 1);
					  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
				  }
				  
				  //Function Match
				  if((functionVal != null && !functionVal.isEmpty() && !functionVal.equals("N.A"))){
					  List<Object[]> contentForFunctionIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
						for(Object objFunction: contentForFunctionIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objFunction.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Department Match
				  if((departmentVal != null && !departmentVal.isEmpty() && !departmentVal.equals("N.A"))){
					  List<Object[]> contentForDepartmentIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
						for(Object objDepartment: contentForDepartmentIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDepartment.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Designation Match
				  if((designationVal != null && !designationVal.isEmpty() && !designationVal.equals("N.A"))){
					  List<Object[]> contentForDesignationIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
						for(Object objDesignation: contentForDesignationIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDesignation.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Product Match
				  if((productVal != null && !productVal.isEmpty() && !productVal.equals("N.A"))){
					  List<Object[]> contentForProductIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
						for(Object objProduct: contentForProductIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objProduct.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Zone Match
				  if((zoneVal != null && !zoneVal.isEmpty() && !zoneVal.equals("N.A"))){
					  List<Object[]> contentForZoneIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
						for(Object objZone: contentForZoneIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objZone.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Grade Match
				  if((gradeVal != null && !gradeVal.isEmpty() && !gradeVal.equals("N.A"))){
					  List<Object[]> contentForGradeIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
						for(Object objGrade: contentForGradeIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objGrade.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Region Match
				  if((regionVal != null && !regionVal.isEmpty() && !regionVal.equals("N.A"))){
					  List<Object[]> contentForRegionIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
						for(Object objRegion: contentForRegionIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objRegion.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Branch Match
				  if((branchVal != null && !branchVal.isEmpty() && !branchVal.equals("N.A"))){
					  List<Object[]> contentForBranchIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
						for(Object objBranch: contentForBranchIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objBranch.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Location Match
				  if((locationVal != null && !locationVal.isEmpty() && !locationVal.equals("N.A"))){
					  List<Object[]> contentForLocationIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeLocation(1, genderVal, businessVal, locationVal, String.valueOf(age_Val));
						for(Object objLocation: contentForLocationIntendedUserlist){
							  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objLocation.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
				  }
				  
				  //Notification Based on Selected user ID
				  
				  List<Object[]> contentForTrainingUserIdBasedlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeUserId(2, businessVal, empID);
				  
				  for(Object objUserId: contentForTrainingUserIdBasedlist){
					  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUserId.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
				  
				  
				  /*XXXXXXXXXXXXXXXXXXXXX Corporate Event Calendar DataXXXXXXXXXXXXXXXXXXXXXXX*/
				  
				//Condition to Match in PeronalisedContent for  All USer
					List<Object[]> contentForCorporateAllUserlist = corporateeventsdataLocalServiceUtil
							.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
					  for(Object obj: contentForCorporateAllUserlist){
						  
							 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(obj.toString()), 1);
							  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
					//Condition to Match in PeronalisedContent for  Intended USer
					  //Unit Match
					  if((unitVal != null && !unitVal.isEmpty() && !unitVal.equals("N.A"))){
					List<Object[]> contentForCorporateUnitIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
					for(Object objUnit: contentForCorporateUnitIntendedUserlist){
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUnit.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
					  }
					  
					  //Function Match
					  if((functionVal != null && !functionVal.isEmpty() && !functionVal.equals("N.A"))){
						  List<Object[]> contentForCorporateFunctionIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
							for(Object objFunction: contentForCorporateFunctionIntendedUserlist){
								 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objFunction.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							}
					  }
					  
					  //Department Match
					  if((departmentVal != null && !departmentVal.isEmpty() && !departmentVal.equals("N.A"))){
						  List<Object[]> contentForCorporateDepartmentIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
							for(Object objDepartment: contentForCorporateDepartmentIntendedUserlist){

								 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDepartment.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							}
					  }
					  
					  //Designation Match
					  if((designationVal != null && !designationVal.isEmpty() && !designationVal.equals("N.A"))){
						  List<Object[]> contentForCorporateDesignationIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
							for(Object objDesignation: contentForCorporateDesignationIntendedUserlist){
								 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDesignation.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							  }
					  }
					  
					  //Product Match
					  if((productVal != null && !productVal.isEmpty() && !productVal.equals("N.A"))){
						  List<Object[]> contentForCorporateProductIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
							for(Object objProduct: contentForCorporateProductIntendedUserlist){
								boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objProduct.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							  }
					  }
					  
					  //Zone Match
					  if((zoneVal != null && !zoneVal.isEmpty() && !zoneVal.equals("N.A"))){
						  List<Object[]> contentForCorporateZoneIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
							for(Object objZone: contentForCorporateZoneIntendedUserlist){
								boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objZone.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							  }
					  }
					  
					  //Grade Match
					  if((gradeVal != null && !gradeVal.isEmpty() && !gradeVal.equals("N.A"))){
						  List<Object[]> contentForCorporateGradeIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
							for(Object objGrade: contentForCorporateGradeIntendedUserlist){
								 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objGrade.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							  }
					  }
					  
					  //Region Match
					  if((regionVal != null && !regionVal.isEmpty() && !regionVal.equals("N.A"))){
						  List<Object[]> contentForCorporateRegionIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
							for(Object objRegion: contentForCorporateRegionIntendedUserlist){
								boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objRegion.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							  }
					  }
					  
					  //Branch Match
					  if((branchVal != null && !branchVal.isEmpty() && !branchVal.equals("N.A"))){
						  List<Object[]> contentForCorporateBranchIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
							for(Object objBranch: contentForCorporateBranchIntendedUserlist){
								 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objBranch.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							  }
					  }
					  
					  //Location Match
					  if((locationVal != null && !locationVal.isEmpty() && !locationVal.equals("N.A"))){
						  List<Object[]> contentForCorporateLocationIntendedUserlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeLocation(1, genderVal, businessVal, locationVal, String.valueOf(age_Val));
							for(Object objLocation: contentForCorporateLocationIntendedUserlist){
								boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objLocation.toString()), 1);
								  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
							  }
					  }
				//Condition to Match in PeronalisedContent based on userId
					 List<Object[]> contentForCorporateUserIdBasedlist = corporateeventsdataLocalServiceUtil.getContentBasedOnNotificationTypeUserId(2, businessVal, empID);
					  
					  for(Object objUserId: contentForCorporateUserIdBasedlist){
						  boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUserId.toString()), 1);
						  logger.info("Insert In CholaUSerNotiification Table : "+isInsert);
						  }
					  
					  
			// TODO Auto-generated method stub
			logger.info("FILTER NOTIFY====");
			List<Object[]> list = NoticationCategoryCountLocalServiceUtil
					.getNotficationCategoryCount(themeDisplay.getUserId());
			resourceRequest.setAttribute("notificationCategoryCount", list);
			
			
			
			PortletSession session=resourceRequest.getPortletSession();
			session.setAttribute("notificationCategoryCount", list);
			
			
			JSONArray jArray = new JSONArray();
			JSONObject obj = new JSONObject();
			
			//Logic for Content notification
			Iterator it = list.iterator();
			while (it.hasNext()) 
			 {
			 Object[] object = (Object[]) it.next();
			 JSONObject obj1 = new JSONObject();
			 obj1.put("name", object[0].toString());
			 obj1.put("count", object[1].toString());
			 jArray.add(obj1);
			 }
			
			
			//people power logic
			
			//Fetching from table instead of API hit
/*			List<Object[]> objectPeoplePowerTable=NoticationCategoryCountLocalServiceUtil.getPeoplePowerNotificationDetails(empId);
			
			
			if(objectPeoplePowerTable!=null){
				
				JSONObject objPeoplePower = new JSONObject();
				int ModCnt = 0;
				for(Object[] singleObjPPInfo:objectPeoplePowerTable){
					
					System.out.println("ID : " + singleObjPPInfo[0].toString());
					System.out.println("FunctionalityCode: " + singleObjPPInfo[1].toString());
					System.out.println("ModCnt : " + singleObjPPInfo[2].toString());
					System.out.println("Targeted_Url: " + singleObjPPInfo[3].toString());
					System.out.println("Identification_Flag : " + singleObjPPInfo[4].toString());
					System.out.println("Notification_Text : " + singleObjPPInfo[5].toString());
					System.out.println("EmpId : " + singleObjPPInfo[6].toString());
					System.out.println("ApprovalCategory : " + singleObjPPInfo[7].toString());
					System.out.println("ErrorStatus : " + singleObjPPInfo[8].toString());
					
					ModCnt=ModCnt+Integer.parseInt(singleObjPPInfo[2].toString());
				}
				
				
				objPeoplePower.put("name", "People Power");
				objPeoplePower.put("count", ModCnt);
				jArray.add(objPeoplePower);	
				
			}*/
			
			
			
			//Fetching from API
			JSONObject objPeoplePower = new JSONObject();
			
			Object objectData=PeoplePowerAPI.getNotificationList(empId);
			
			System.out.println("People Power Data Object : "+objectData);
			if(objectData!=null){
				int ModCnt = 0;
				if(objectData instanceof org.json.JSONArray){
					org.json.JSONArray jsonArray = new org.json.JSONArray(objectData.toString());
					
					for(int i = 0; i < jsonArray.length(); i++)
					{
						org.json.JSONObject objects = jsonArray.getJSONObject(i);
					    ModCnt = objects.getInt("ModCnt")+ModCnt;
					  	System.out.println(ModCnt);
					}
				}else{
					org.json.JSONObject jsonObject = new org.json.JSONObject(objectData.toString());
					ModCnt = jsonObject.getInt("ModCnt");
					System.out.println(ModCnt);
					
				}
				objPeoplePower.put("name", "People Power");
				objPeoplePower.put("count", ModCnt);
				jArray.add(objPeoplePower);	
			}

			 //ends
			
			//Start : Qtrac Notification Logic
			
			
			//fetch from table instead of table
/*List<Object[]> objectQtracTable=NoticationCategoryCountLocalServiceUtil.getQtracNotificationDetails(empId);
			
			
			if(objectQtracTable!=null){
				
				JSONObject objQtrac = new JSONObject();
				int MomodCntQrac = 0;
				for(Object[] singleObjQtracInfo:objectQtracTable){
					
					System.out.println("ID : " + singleObjQtracInfo[0].toString());
					System.out.println("FunctionalityCode: " + singleObjQtracInfo[1].toString());
					System.out.println("ModCnt : " + singleObjQtracInfo[2].toString());
					System.out.println("Targeted_Url: " + singleObjQtracInfo[3].toString());
					System.out.println("Identification_Flag : " + singleObjQtracInfo[4].toString());
					System.out.println("Notification_Text : " + singleObjQtracInfo[5].toString());
					System.out.println("EmpId : " + singleObjQtracInfo[6].toString());
					System.out.println("ApprovalCategory : " + singleObjQtracInfo[7].toString());
					System.out.println("ErrorStatus : " + singleObjQtracInfo[8].toString());
					
					MomodCntQrac=MomodCntQrac+Integer.parseInt(singleObjQtracInfo[2].toString());
				}
				
				
				objQtrac.put("name", "Qtrac");
				objQtrac.put("count", MomodCntQrac);
				jArray.add(objQtrac);	
				
			}*/
			JSONObject objQtrac = new JSONObject();
			
			Object objectQtracData=PeoplePowerAPI.getQtrackNotificationList(empId);
			
			System.out.println("Qtrac Data Object : "+objectQtracData);
			
			if(objectQtracData!=null){
				int modCntQrac = 0;
				if(objectQtracData instanceof org.json.JSONArray){
					org.json.JSONArray jsonArray = new org.json.JSONArray(objectQtracData.toString());
					for(int i = 0; i < jsonArray.length(); i++)
					{
						org.json.JSONObject objects = jsonArray.getJSONObject(i);
						modCntQrac = objects.getInt("ModCnt")+modCntQrac;
					}
				}else{
					org.json.JSONObject jsonObject = new org.json.JSONObject(objectQtracData.toString());
					modCntQrac = jsonObject.getInt("ModCnt");
					
				}
				objQtrac.put("name", "Qtrac");
				objQtrac.put("count", modCntQrac);
				jArray.add(objQtrac);	
			}

			//End : Qtrac Notification Logic
			
			//Hobby Club logic
			JSONObject objHobbyClub = new JSONObject();
			List<UserNotificationEvent> myhcList=NotificationCategorizationAction.getDeliveredMessageBoard(themeDisplay.getUserId());
			
			objHobbyClub.put("name", "Hobby Club");
			objHobbyClub.put("count", myhcList.size());
			jArray.add(objHobbyClub);
			 //Hobby Club logic ends
		
			
			JSONArray sortedArray=new JSONArray();
			
			sortedArray=sortJsonByKey(jArray, "name");
		
			obj.put("data", sortedArray);
			writer.println(obj);
			}
		} catch (Exception e1) {
e1.printStackTrace();
		}
			
		}
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("NotificationList")) {
			try {
				int val = 0;
				System.out.println("NotificationList MEthod........");
				String myVal = resourceRequest.getParameter("val");
				ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

				System.out.println("Resource Val : : : " + myVal);
				System.out.println("User Id : : : " + themeDisplay.getUserId());
				
				List<Object[]> lt = com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil
						.getNotficationCategoryList(themeDisplay.getUserId(), myVal);
				System.out.println("List Payload : " + lt);
				Iterator it = lt.iterator();
				JSONArray finalOb = new JSONArray();
				for (Object[] obje : lt) {
					JSONObject obj = new JSONObject();
					System.out.println("First Object : " + obje[0].toString());
					System.out.println("Seconf Object : " + obje[1].toString());
					obj.put("id", obje[0]);
					obj.put("user_id", obje[1]);
					obj.put("content_id", obje[2].toString());
					obj.put("content_type", obje[3]);
					obj.put("notification_text", obje[4]);
					obj.put("url", obje[5]);
					finalOb.add(obj);
				}

				System.out.println("IT-----" + lt);
				PrintWriter writer = resourceResponse.getWriter();
				System.out.println("Final Obj : " + finalOb);
				System.out.println(lt.toString());
//				JSONObject js=new JSONObject();
//				js.put("data", finalOb);
//				System.out.println("JS : "+js);
				writer.print(finalOb);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (resourceRequest.getResourceID().equalsIgnoreCase("EventId")) {

			boolean flag = false;
			System.out.println("EVENT ID Method");
			String eventId = resourceRequest.getParameter("val1");
			String tableuserId = resourceRequest.getParameter("val2");
			String contentId = resourceRequest.getParameter("val3");
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long longEventId=0;
			long longTableuserId=0;
			long longContentId=0;
			
			if (eventId != null) {
				longEventId = Long.parseLong(eventId);
				longTableuserId = Long.parseLong(tableuserId);
				longContentId = Long.parseLong(contentId);
			}
			flag = NoticationCategoryCountLocalServiceUtil.updatenotificationstatus(2, themeDisplay.getUserId(), longEventId,longContentId,longTableuserId);
			PrintWriter writer = resourceResponse.getWriter();
			if (flag) {
				writer.print(flag);
			} else {
				writer.print(flag);
			}

		}
		
		
		//Call to get My hobby Notification list
		if (resourceRequest.getResourceID().equalsIgnoreCase("myMBList")) {
		try {
		PrintWriter writer;
		writer = resourceResponse.getWriter();
		
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
	                                    long userId = themeDisplay.getUserId();
			System.out.println("In MB Notification List");
			List<UserNotificationEvent> mbList=NotificationCategorizationAction.getDeliveredMessageBoard(themeDisplay.getUserId());
			JSONArray finalOb = new JSONArray();
			JSONObject objF = new JSONObject();
			for(UserNotificationEvent unv:mbList){
			JSONObject obj = new JSONObject();
			obj.put("event_id", unv.getUserNotificationEventId());
			obj.put("event_payload", unv.getPayload());
			obj.put("event_timestamp", unv.getTimestamp());
			finalOb.add(obj);
		}
			objF.put("data", finalOb);
			writer.print(objF);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		//Call to update read status hobby club 
		if (resourceRequest.getResourceID().equalsIgnoreCase("myMBMarkAsRead")) {
			System.out.println("Mark As Read Method ");
			System.out.println(resourceRequest.getParameter("eventId"));
			String eventId=resourceRequest.getParameter("eventId");
			
			UserNotificationEvent unv=UserNotificationEventLocalServiceUtil.fetchUserNotificationEvent(Long.parseLong(eventId));
			unv.setArchived(true);
			unv=UserNotificationEventLocalServiceUtil.updateUserNotificationEvent(unv);
		}
	}
	
	
	public static JSONArray sortJsonByKey(JSONArray json, String key)
    {
        JSONArray sorted = new JSONArray();
        SortedMap map = new TreeMap();

        for (Object o : json) {
            JSONObject tmp = (JSONObject) o;
            map.put(tmp.get(key),tmp);
        }

        Set<String> numbers = map.keySet();

        for (String number : numbers) {
            sorted.add(map.get(number));
        }

        return sorted;
    }
}
