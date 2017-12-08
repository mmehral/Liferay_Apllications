/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.content.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.content.service.base.contentupdateLocalServiceBaseImpl;
import com.content.service.persistence.contentupdateFinderUtil;

/**
 * The implementation of the contentupdate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.content.service.contentupdateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay02
 * @see contentupdateLocalServiceBaseImpl
 * @see com.content.service.contentupdateLocalServiceUtil
 */
@ProviderType
public class contentupdateLocalServiceImpl
	extends contentupdateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.content.service.contentupdateLocalServiceUtil} to access the contentupdate local service.
	 */
	public boolean insertNotifyStts(int syscode, int val, String sysname, int stts, int sttsflag,long usernotifyId) {
		return contentupdateFinderUtil.insertNotifyStts(syscode, val, sysname, stts, sttsflag, usernotifyId);
	}
	public boolean insertPersonalisedParameters(String businessId,String[] values,String gender,String age,String option,long uniqueContentId,String lessthan_age,String greaterthan_age,String between_from_to_age,Object[] notificationDetails,long notification_type){
		return contentupdateFinderUtil.insertPersonalisedParameters(businessId, values, gender, age, option, uniqueContentId, lessthan_age, greaterthan_age, between_from_to_age,notificationDetails,notification_type);
	}
	       
		
	
	public List<Object[]> getUsers(){
		
		return contentupdateFinderUtil.getUsers();
	}
	
	public List<String> getCompany()
	{
		return contentupdateFinderUtil.getCompany();
	}
	
	public List<String> getUnit(String businessId)
	{
		return contentupdateFinderUtil.getUnit(businessId);
		
	}
	
	public List<String> getFunction(String businessId)
	{
		return contentupdateFinderUtil.getFunction(businessId);
	}
	
	public List<String> getDepart(String businessId)
	{
		return contentupdateFinderUtil.getDepart(businessId);
	}
	
	public List<String> getDesignation(String businessId)
	{
		return contentupdateFinderUtil.getDesignation(businessId);
	}
	
	public List<String> getProduct(String businessId)
	{
		return contentupdateFinderUtil.getProduct(businessId);
	}
	
	public List<String> getZone(String businessId)
	{
		return contentupdateFinderUtil.getZone(businessId);
	}
	
	public List<String> getBranch(String businessId)
	{
		return contentupdateFinderUtil.getBranch(businessId);
	}
	
	public List<String> getGrade(String businessId)
	{
		return contentupdateFinderUtil.getGrade(businessId);
	}
	
	public List<String> getRegion(String businessId)
	{
		return contentupdateFinderUtil.getRegion(businessId);
	}
	
	public List<String> getLocation(String businessId)
	{
		return contentupdateFinderUtil.getLocation(businessId);
	}
	public List<String> getIntendedUser(String businessId, String[] values, String gender,String age, String option)
	{
		return contentupdateFinderUtil.getIntendedUser(businessId, values, gender, age, option);
	}
	
	public List<String> getAllUser(String businessId, String gender,String age, String option)
	{
		return contentupdateFinderUtil.getAllUser(businessId, gender, age, option);
	}
}