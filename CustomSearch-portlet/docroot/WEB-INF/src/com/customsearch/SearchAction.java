package com.customsearch;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONObject;

import com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import peoplepowerapi.PeoplePowerAPI;

public class SearchAction extends MVCPortlet{
	private static Log logger = LogFactoryUtil.getLog(SearchAction.class);
	/*public void updatePageLayout(ActionRequest request, ActionResponse response)throws PortletException, IOException
	{
		response.sendRedirect("http://localhost:8080/web/guest/demo?key=chola");
		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY); 
		long groupId = themeDisplay.getScopeGroupId(); 
		String friendlyURL = "/demo"; 
		boolean privateLayout = false; 
		long userId = themeDisplay.getUserId(); 
		try 
		{
			Layout layout =LayoutLocalServiceUtil.getFriendlyURLLayout(groupId, privateLayout, friendlyURL); 
			LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layout.getLayoutType(); 
			layoutTypePortlet.setLayoutTemplateId(userId, "1_columns"); 
			LayoutLocalServiceUtil.updateLayout(layout.getGroupId(), 
					layout.getPrivateLayout(),layout.getLayoutId(), 
					layout.getTypeSettings()); 
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		}
		
	} */
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String screenname=themeDisplay.getUser().getScreenName();
		List<Long> data = getUniqueContentIdBasedOnLoggedInUser(screenname);
		try {
			if ("SearchCall".equalsIgnoreCase(resourceRequest.getResourceID())) {
				logger.info("Inside Ajax");
				String content_id = resourceRequest.getParameter("content_id");
				logger.info("content_id : "+content_id);
				PrintWriter writer = resourceResponse.getWriter();
				JSONObject jsonObject = new JSONObject();
				
				if(data.contains(Long.parseLong(content_id)))
				{
					jsonObject.put("STATUS", "TRUE");
					logger.info("status : "+jsonObject+" Content Id : "+content_id);
				}
				else
				{
						jsonObject.put("STATUS", "FALSE");
						logger.info("status : "+jsonObject+" Content Id : "+content_id);
				}
				writer.print(jsonObject);
			}
			}
			catch (Exception e) {
				logger.error("Error",e);
			}
	}
	
	public static List<Long> getUniqueContentIdBasedOnLoggedInUser(String empId){
		List<Long> finalList=new ArrayList<Long>();
		try{
		empId=NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(empId);
		//org.json.JSONObject employeeinfo=pp.getEmployeeInfo("V481");
		org.json.JSONObject employeeinfo=PeoplePowerAPI.getEmployeeInfo(empId);
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

		//Condition to Match in PeronalisedContent for All USer
		List<Object[]> contentForAllUserlist = NoticationCategoryCountLocalServiceUtil
		.getContentBasedOnNotificationTypeAll(0, genderVal, businessVal, String.valueOf(age_Val));
		for(Object obj: contentForAllUserlist){

		finalList.add(Long.parseLong(obj.toString()));
		}
		//Condition to Match in PeronalisedContent for Intended USer
		//Unit Match
		if((unitVal != null && !unitVal.isEmpty() && !"N.A".equals(unitVal))){
		List<Object[]> contentForUnitIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeUnit(1, genderVal, businessVal, unitVal, String.valueOf(age_Val));
		for(Object objUnit: contentForUnitIntendedUserlist){
		finalList.add(Long.parseLong(objUnit.toString())); 
		}
		}

		//Function Match
		if((functionVal != null && !functionVal.isEmpty() && !"N.A".equals(functionVal))){
		List<Object[]> contentForFunctionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeFunction(1, genderVal, businessVal, functionVal, String.valueOf(age_Val));
		for(Object objFunction: contentForFunctionIntendedUserlist){
		finalList.add(Long.parseLong(objFunction.toString())); 
		}
		}

		//Department Match
		if((departmentVal != null && !departmentVal.isEmpty() && !"N.A".equals(departmentVal))){
		List<Object[]> contentForDepartmentIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDepartment(1, genderVal, businessVal, departmentVal, String.valueOf(age_Val));
		for(Object objDepartment: contentForDepartmentIntendedUserlist){
		finalList.add(Long.parseLong(objDepartment.toString())); 
		}
		}

		//Designation Match
		if((designationVal != null && !designationVal.isEmpty() && !"N.A".equals(designationVal))){
		List<Object[]> contentForDesignationIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeDesignation(1, genderVal, businessVal, designationVal, String.valueOf(age_Val));
		for(Object objDesignation: contentForDesignationIntendedUserlist){
		finalList.add(Long.parseLong(objDesignation.toString())); 
		}
		}

		//Product Match
		if((productVal != null && !productVal.isEmpty() && !"N.A".equals(productVal))){
		List<Object[]> contentForProductIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeProduct(1, genderVal, businessVal, productVal, String.valueOf(age_Val));
		for(Object objProduct: contentForProductIntendedUserlist){
		finalList.add(Long.parseLong(objProduct.toString())); 
		}
		}

		//Zone Match
		if((zoneVal != null && !zoneVal.isEmpty() && !"N.A".equals(zoneVal))){
		List<Object[]> contentForZoneIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeZone(1, genderVal, businessVal, zoneVal, String.valueOf(age_Val));
		for(Object objZone: contentForZoneIntendedUserlist){
		finalList.add(Long.parseLong(objZone.toString())); 
		}
		}

		//Grade Match
		if((gradeVal != null && !gradeVal.isEmpty() && !"N.A".equals(gradeVal))){
		List<Object[]> contentForGradeIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeGrade(1, genderVal, businessVal, gradeVal, String.valueOf(age_Val));
		for(Object objGrade: contentForGradeIntendedUserlist){
		finalList.add(Long.parseLong(objGrade.toString())); 
		}
		}

		//Region Match
		if((regionVal != null && !regionVal.isEmpty() && !"N.A".equals(regionVal))){
		List<Object[]> contentForRegionIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeRegion(1, genderVal, businessVal, regionVal, String.valueOf(age_Val));
		for(Object objRegion: contentForRegionIntendedUserlist){
		finalList.add(Long.parseLong(objRegion.toString())); 
		}
		}

		//Branch Match
		if((branchVal != null && !branchVal.isEmpty() && !"N.A".equals(branchVal))){
		List<Object[]> contentForBranchIntendedUserlist = NoticationCategoryCountLocalServiceUtil.getContentBasedOnNotificationTypeBranch(1, genderVal, businessVal, branchVal, String.valueOf(age_Val));
		for(Object objBranch: contentForBranchIntendedUserlist){
		finalList.add(Long.parseLong(objBranch.toString())); 
		}
		}

		//Location Match
		if((locationVal != null && !locationVal.isEmpty() && !"N.A".equals(locationVal))){
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
		
		}catch (Exception e) {
		logger.error("Error",e);
		}
		return finalList;
		}
}
