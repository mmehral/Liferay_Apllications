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

package com.contest.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;
import com.contest.service.base.CholaContestLocalServiceBaseImpl;
import com.contest.service.persistence.CholaContestFinderUtil;


@ProviderType
public class CholaContestLocalServiceImpl
	extends CholaContestLocalServiceBaseImpl {

	public List<Object[]> syscodeCustomMsg(int syscode) {
		return CholaContestFinderUtil.syscodeCustomMsg(syscode);
	}
	public List<Object[]> ContestList(){
		return CholaContestFinderUtil.ContestList();
	}
	public Integer getContestType(String id){
		return CholaContestFinderUtil.getContestType(id);
	}
	
	
	//007 Parameters
	
	public boolean insertNotifyStts(int syscode, int val, String sysname, int stts, int sttsflag,long usernotifyId) {
		return CholaContestFinderUtil.insertNotifyStts(syscode, val, sysname, stts, sttsflag, usernotifyId);
	}
	       
		
	
	public List<Object[]> getUsers(){
		
		return CholaContestFinderUtil.getUsers();
	}
	
	public List<String> getCompany()
	{
		return CholaContestFinderUtil.getCompany();
	}
	
	public List<String> getUnit(String businessId)
	{
		return CholaContestFinderUtil.getUnit(businessId);
		
	}
	
	public List<String> getFunction(String businessId)
	{
		return CholaContestFinderUtil.getFunction(businessId);
	}
	
	public List<String> getDepart(String businessId)
	{
		return CholaContestFinderUtil.getDepart(businessId);
	}
	
	public List<String> getDesignation(String businessId)
	{
		return CholaContestFinderUtil.getDesignation(businessId);
	}
	
	public List<String> getProduct(String businessId)
	{
		return CholaContestFinderUtil.getProduct(businessId);
	}
	
	public List<String> getZone(String businessId)
	{
		return CholaContestFinderUtil.getZone(businessId);
	}
	
	public List<String> getBranch(String businessId)
	{
		return CholaContestFinderUtil.getBranch(businessId);
	}
	
	public List<String> getGrade(String businessId)
	{
		return CholaContestFinderUtil.getGrade(businessId);
	}
	
	public List<String> getRegion(String businessId)
	{
		return CholaContestFinderUtil.getRegion(businessId);
	}
	
	public List<String> getLocation(String businessId)
	{
		return CholaContestFinderUtil.getLocation(businessId);
	}
	public List<String> getIntendedUser(String businessId, String[] values, String gender,String age, String option)
	{
		return CholaContestFinderUtil.getIntendedUser(businessId, values, gender, age, option);
	}
	
	public List<String> getAllUser(String businessId, String gender,String age, String option)
	{
		return CholaContestFinderUtil.getAllUser(businessId, gender, age, option);
	}
	
	
}