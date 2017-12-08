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

package com.chola.business.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.business.service.base.businesssopDetailsLocalServiceBaseImpl;
import com.chola.business.service.persistence.businesssopDetailsFinderUtil;

/**
 * The implementation of the businesssop details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.business.service.businesssopDetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see businesssopDetailsLocalServiceBaseImpl
 * @see com.chola.business.service.businesssopDetailsLocalServiceUtil
 */
@ProviderType
public class businesssopDetailsLocalServiceImpl
	extends businesssopDetailsLocalServiceBaseImpl {
	public boolean insertNotifyStts(int syscode, int val, String sysname, int stts, int sttsflag,long usernotifyId) {
		return businesssopDetailsFinderUtil.insertNotifyStts(syscode, val, sysname, stts, sttsflag, usernotifyId);
	}
	       
		
	
	public List<Object[]> getUsers(){
		
		return businesssopDetailsFinderUtil.getUsers();
	}
	
	public List<String> getCompany()
	{
		return businesssopDetailsFinderUtil.getCompany();
	}
	
	public List<String> getUnit(String businessId)
	{
		return businesssopDetailsFinderUtil.getUnit(businessId);
		
	}
	
	public List<String> getFunction(String businessId)
	{
		return businesssopDetailsFinderUtil.getFunction(businessId);
	}
	
	public List<String> getDepart(String businessId)
	{
		return businesssopDetailsFinderUtil.getDepart(businessId);
	}
	
	public List<String> getDesignation(String businessId)
	{
		return businesssopDetailsFinderUtil.getDesignation(businessId);
	}
	
	public List<String> getProduct(String businessId)
	{
		return businesssopDetailsFinderUtil.getProduct(businessId);
	}
	
	public List<String> getZone(String businessId)
	{
		return businesssopDetailsFinderUtil.getZone(businessId);
	}
	
	public List<String> getBranch(String businessId)
	{
		return businesssopDetailsFinderUtil.getBranch(businessId);
	}
	
	public List<String> getGrade(String businessId)
	{
		return businesssopDetailsFinderUtil.getGrade(businessId);
	}
	
	public List<String> getRegion(String businessId)
	{
		return businesssopDetailsFinderUtil.getRegion(businessId);
	}
	
	public List<String> getLocation(String businessId)
	{
		return businesssopDetailsFinderUtil.getLocation(businessId);
	}
	public List<String> getIntendedUser(String businessId, String[] values, String gender,String age, String option)
	{
		return businesssopDetailsFinderUtil.getIntendedUser(businessId, values, gender, age, option);
	}
	
	public List<String> getAllUser(String businessId, String gender,String age, String option)
	{
		return businesssopDetailsFinderUtil.getAllUser(businessId, gender, age, option);
	}
}