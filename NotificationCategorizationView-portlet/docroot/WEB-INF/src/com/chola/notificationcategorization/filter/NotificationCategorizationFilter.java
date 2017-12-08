package com.chola.notificationcategorization.filter;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.RenderFilter;

import org.json.JSONObject;

import com.chola.notificationcategorization.model.NoticationCategoryCount;
import com.chola.notificationcategorization.service.NoticationCategoryCountLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingcalendarLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import peoplepowerapi.PeoplePowerAPI;

public class NotificationCategorizationFilter implements RenderFilter {
	private static final Log _log = LogFactoryUtil.getLog(NotificationCategorizationFilter.class);
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init(FilterConfig arg0) throws PortletException {
		// TODO Auto-generated method stub
	}

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
	public void doFilter(RenderRequest renderRequest, RenderResponse renderResponse, FilterChain filterChain)
			throws IOException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		themeDisplay.getUserId();
		
		try {
			User thisUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		PeoplePowerAPI pp=new PeoplePowerAPI();
		JSONObject employeeinfo=pp.getEmployeeInfo("V481");
		
		_log.info(employeeinfo.toString());
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
		  
		  String doj=employeeinfo.getString("DOJ");
		  String anniversary=employeeinfo.getString("Anniversary");
		  String employeeName=employeeinfo.getString("Name");
		  String birthday=employeeinfo.getString("Birthday");
		  String empID=employeeinfo.getString("EmpId");
			try {
				
				 SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");

				 Calendar dob = Calendar.getInstance();
				 
				         dob.setTime(sdf.parse(birthday));

				 age_Val=getAge(dob);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			_log.info("Visu Age is : "+age_Val);
		 	  
		  //Notification For all User
		  
		 List<Object[]> contentForAllUserlist = NoticationCategoryCountLocalServiceUtil
					.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
		  for(Object obj: contentForAllUserlist){
			  
			 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(obj.toString()), 1);
			  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
		  }
		  
		  //Notification for intended User
		  //Unit Match
		  if((unitVal != null && !unitVal.isEmpty() && !unitVal.equals("N.A"))){
		List<Object[]> contentForUnitIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
		for(Object objUnit: contentForUnitIntendedUserlist){
			  
			 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUnit.toString()), 1);
			  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
		  }
		  }
		  
		  //Function Match
		  if((functionVal != null && !functionVal.isEmpty() && !functionVal.equals("N.A"))){
			  List<Object[]> contentForFunctionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
				for(Object objFunction: contentForFunctionIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objFunction.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Department Match
		  if((departmentVal != null && !departmentVal.isEmpty() && !departmentVal.equals("N.A"))){
			  List<Object[]> contentForDepartmentIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
				for(Object objDepartment: contentForDepartmentIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDepartment.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Designation Match
		  if((designationVal != null && !designationVal.isEmpty() && !designationVal.equals("N.A"))){
			  List<Object[]> contentForDesignationIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
				for(Object objDesignation: contentForDesignationIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDesignation.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Product Match
		  if((productVal != null && !productVal.isEmpty() && !productVal.equals("N.A"))){
			  List<Object[]> contentForProductIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
				for(Object objProduct: contentForProductIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objProduct.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Zone Match
		  if((zoneVal != null && !zoneVal.isEmpty() && !zoneVal.equals("N.A"))){
			  List<Object[]> contentForZoneIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
				for(Object objZone: contentForZoneIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objZone.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Grade Match
		  if((gradeVal != null && !gradeVal.isEmpty() && !gradeVal.equals("N.A"))){
			  List<Object[]> contentForGradeIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
				for(Object objGrade: contentForGradeIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objGrade.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Region Match
		  if((regionVal != null && !regionVal.isEmpty() && !regionVal.equals("N.A"))){
			  List<Object[]> contentForRegionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
				for(Object objRegion: contentForRegionIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objRegion.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Branch Match
		  if((branchVal != null && !branchVal.isEmpty() && !branchVal.equals("N.A"))){
			  List<Object[]> contentForBranchIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
				for(Object objBranch: contentForBranchIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objBranch.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Location Match
		  if((locationVal != null && !locationVal.isEmpty() && !locationVal.equals("N.A"))){
			  List<Object[]> contentForLocationIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeLocation(1, genderVal, businessVal, locationVal, String.valueOf(age_Val));
				for(Object objLocation: contentForLocationIntendedUserlist){
					  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objLocation.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
		  }
		  
		  //Notification Based on Selected user ID
		  
		  List<Object[]> contentForUserIdBasedlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeUserId(2, businessVal, empID);
		  
		  for(Object objUserId: contentForUserIdBasedlist){
			  
				 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUserId.toString()), 1);
				  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
			  }
		  
		  
		 /*XXXXXXXXXXXXXXXXXXXXXTraining Calendar DataXXXXXXXXXXXXXXXXXXXXXXX*/
		  
		  
		//Notification For all User
		  
			 List<Object[]> contentForTrainingAllUserlist = trainingcalendarLocalServiceUtil
						.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
			  for(Object obj: contentForTrainingAllUserlist){
				  
				 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(obj.toString()), 1);
				  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
			  }
			  
			  //Notification for intended User
			  //Unit Match
			  if((unitVal != null && !unitVal.isEmpty() && !unitVal.equals("N.A"))){
			List<Object[]> contentForUnitIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
			for(Object objUnit: contentForUnitIntendedUserlist){
				  
				 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUnit.toString()), 1);
				  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
			  }
			  }
			  
			  //Function Match
			  if((functionVal != null && !functionVal.isEmpty() && !functionVal.equals("N.A"))){
				  List<Object[]> contentForFunctionIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
					for(Object objFunction: contentForFunctionIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objFunction.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Department Match
			  if((departmentVal != null && !departmentVal.isEmpty() && !departmentVal.equals("N.A"))){
				  List<Object[]> contentForDepartmentIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
					for(Object objDepartment: contentForDepartmentIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDepartment.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Designation Match
			  if((designationVal != null && !designationVal.isEmpty() && !designationVal.equals("N.A"))){
				  List<Object[]> contentForDesignationIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
					for(Object objDesignation: contentForDesignationIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objDesignation.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Product Match
			  if((productVal != null && !productVal.isEmpty() && !productVal.equals("N.A"))){
				  List<Object[]> contentForProductIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
					for(Object objProduct: contentForProductIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objProduct.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Zone Match
			  if((zoneVal != null && !zoneVal.isEmpty() && !zoneVal.equals("N.A"))){
				  List<Object[]> contentForZoneIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
					for(Object objZone: contentForZoneIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objZone.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Grade Match
			  if((gradeVal != null && !gradeVal.isEmpty() && !gradeVal.equals("N.A"))){
				  List<Object[]> contentForGradeIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
					for(Object objGrade: contentForGradeIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objGrade.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Region Match
			  if((regionVal != null && !regionVal.isEmpty() && !regionVal.equals("N.A"))){
				  List<Object[]> contentForRegionIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
					for(Object objRegion: contentForRegionIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objRegion.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Branch Match
			  if((branchVal != null && !branchVal.isEmpty() && !branchVal.equals("N.A"))){
				  List<Object[]> contentForBranchIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
					for(Object objBranch: contentForBranchIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objBranch.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Location Match
			  if((locationVal != null && !locationVal.isEmpty() && !locationVal.equals("N.A"))){
				  List<Object[]> contentForLocationIntendedUserlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeLocation(1, genderVal, businessVal, locationVal, String.valueOf(age_Val));
					for(Object objLocation: contentForLocationIntendedUserlist){
						  
						 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objLocation.toString()), 1);
						  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
					  }
			  }
			  
			  //Notification Based on Selected user ID
			  
			  List<Object[]> contentForTrainingUserIdBasedlist = trainingcalendarLocalServiceUtil.getContentBasedOnNotificationTypeUserId(2, businessVal, empID);
			  
			  for(Object objUserId: contentForTrainingUserIdBasedlist){
				  
					 boolean isInsert=NoticationCategoryCountLocalServiceUtil.insertIntoCholaUsernotification(themeDisplay.getUserId(), Long.parseLong(objUserId.toString()), 1);
					  _log.info("Insert In CholaUSerNotiification Table : "+isInsert);
				  }
			  
		  
		// TODO Auto-generated method stub
		_log.info("FILTER NOTIFY====");
		List<Object[]> list = NoticationCategoryCountLocalServiceUtil
				.getNotficationCategoryCount(themeDisplay.getUserId());
		renderRequest.setAttribute("notificationCategoryCount", list);
		
		filterChain.doFilter(renderRequest, renderResponse);
	}

}
