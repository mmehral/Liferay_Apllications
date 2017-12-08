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

package com.chola.personalisedparameters.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.personalisedparameters.service.base.bsopdetailsLocalServiceBaseImpl;
import com.chola.personalisedparameters.service.persistence.bsopdetailsFinderUtil;


@ProviderType
public class bsopdetailsLocalServiceImpl extends bsopdetailsLocalServiceBaseImpl {
	
	public boolean insertNotifyStts(int syscode, int val, String sysname, int stts, int sttsflag,long usernotifyId) {
		return bsopdetailsFinderUtil.insertNotifyStts(syscode, val, sysname, stts, sttsflag, usernotifyId);
	}
	public boolean insertPersonalisedParameters(String businessId,String[] values,String gender,String age,String option,long uniqueContentId,String lessthan_age,String greaterthan_age,String between_from_to_age,Object[] notificationDetails,long notification_type){
		return bsopdetailsFinderUtil.insertPersonalisedParameters(businessId, values, gender, age, option, uniqueContentId, lessthan_age, greaterthan_age, between_from_to_age,notificationDetails,notification_type);
	}
	       
		
	
	public List<Object[]> getUsers(){
		
		return bsopdetailsFinderUtil.getUsers();
	}
	
	public List<String> getCompany()
	{
		return bsopdetailsFinderUtil.getCompany();
	}
	
	public List<String> getUnit(String businessId)
	{
		return bsopdetailsFinderUtil.getUnit(businessId);
		
	}
	
	public List<String> getFunction(String businessId)
	{
		return bsopdetailsFinderUtil.getFunction(businessId);
	}
	
	public List<String> getDepart(String businessId)
	{
		return bsopdetailsFinderUtil.getDepart(businessId);
	}
	
	public List<String> getDesignation(String businessId)
	{
		return bsopdetailsFinderUtil.getDesignation(businessId);
	}
	
	public List<String> getProduct(String businessId)
	{
		return bsopdetailsFinderUtil.getProduct(businessId);
	}
	
	public List<String> getZone(String businessId)
	{
		return bsopdetailsFinderUtil.getZone(businessId);
	}
	
	public List<String> getBranch(String businessId)
	{
		return bsopdetailsFinderUtil.getBranch(businessId);
	}
	
	public List<String> getGrade(String businessId)
	{
		return bsopdetailsFinderUtil.getGrade(businessId);
	}
	
	public List<String> getRegion(String businessId)
	{
		return bsopdetailsFinderUtil.getRegion(businessId);
	}
	
	public List<String> getLocation(String businessId)
	{
		return bsopdetailsFinderUtil.getLocation(businessId);
	}
	public List<String> getIntendedUser(String businessId, String[] values, String gender,String age, String option)
	{
		return bsopdetailsFinderUtil.getIntendedUser(businessId, values, gender, age, option);
	}
	
	public List<String> getAllUser(String businessId, String gender,String age, String option)
	{
		return bsopdetailsFinderUtil.getAllUser(businessId, gender, age, option);
	}
}