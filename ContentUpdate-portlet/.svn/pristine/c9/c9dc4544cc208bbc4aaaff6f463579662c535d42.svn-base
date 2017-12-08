package com.content;

import java.util.List;

import com.content.service.contentupdateLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

public class ContentUpdate extends MVCPortlet{

	public boolean Content(String businessId,String[] values,String gender,String age,String option,long uniqueContentId,String lessthan_age,String greaterthan_age,String between_from_to_age,Object[] notificationDetails,long notification_type)
	{
		return contentupdateLocalServiceUtil.insertPersonalisedParameters(businessId, values, gender, age, option, uniqueContentId,lessthan_age,greaterthan_age,between_from_to_age,notificationDetails,notification_type);
	}
	
    public List<Object[]> getUsers(){
		
		return contentupdateLocalServiceUtil.getUsers();
	}
	
	public List<String> getCompany()
	{
		return contentupdateLocalServiceUtil.getCompany();
	}
	
	public List<String> getUnit(String businessId)
	{
		return contentupdateLocalServiceUtil.getUnit(businessId);
		
	}
	
	public List<String> getFunction(String businessId)
	{
		return contentupdateLocalServiceUtil.getFunction(businessId);
	}
	
	public List<String> getDepart(String businessId)
	{
		return contentupdateLocalServiceUtil.getDepart(businessId);
	}
	
	public List<String> getDesignation(String businessId)
	{
		return contentupdateLocalServiceUtil.getDesignation(businessId);
	}
	
	public List<String> getProduct(String businessId)
	{
		return contentupdateLocalServiceUtil.getProduct(businessId);
	}
	
	public List<String> getZone(String businessId)
	{
		return contentupdateLocalServiceUtil.getZone(businessId);
	}
	
	public List<String> getBranch(String businessId)
	{
		return contentupdateLocalServiceUtil.getBranch(businessId);
	}
	
	public List<String> getGrade(String businessId)
	{
		return contentupdateLocalServiceUtil.getGrade(businessId);
	}
	
	public List<String> getRegion(String businessId)
	{
		return contentupdateLocalServiceUtil.getRegion(businessId);
	}
	
	public List<String> getLocation(String businessId)
	{
		return contentupdateLocalServiceUtil.getLocation(businessId);
	}
	public List<String> getIntendedUser(String businessId, String[] values, String gender,String age, String option)
	{
		return contentupdateLocalServiceUtil.getIntendedUser(businessId, values, gender, age, option);
	}
	
	public List<String> getAllUser(String businessId, String gender,String age, String option)
	{
		return contentupdateLocalServiceUtil.getAllUser(businessId, gender, age, option);
	}
	
}
