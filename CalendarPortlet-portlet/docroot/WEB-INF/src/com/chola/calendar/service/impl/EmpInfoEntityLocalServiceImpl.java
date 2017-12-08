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

package com.chola.calendar.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.calendar.service.base.EmpInfoEntityLocalServiceBaseImpl;

/**
 * The implementation of the emp info entity local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.calendar.service.EmpInfoEntityLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see EmpInfoEntityLocalServiceBaseImpl
 * @see com.chola.calendar.service.EmpInfoEntityLocalServiceUtil
 */
@ProviderType
public class EmpInfoEntityLocalServiceImpl
	extends EmpInfoEntityLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.calendar.service.EmpInfoEntityLocalServiceUtil} to access the emp info entity local service.
	 */
	
	public List<String> getLocation()
	{
		return eventcalendarFinder.getLocation();
	}
	
	public List<String> getDept()
	{
		return eventcalendarFinder.getDept();
	}
	
	public List<String> getSubDept()
	{
		return eventcalendarFinder.getSubDept();
	}
	
	public List<Object[]> getUsers()
	{
		return eventcalendarFinder.getUsers();
	}
	
	public List twoParams(String[] gender, String[] age)
	{
		return eventcalendarFinder.twoParams(gender,age);
	}
	
	public List threeParams(String[] first, String[] second, String[] third)
	{
		//return eventcalendarPersistence.findByEVENT_ID(20);
				
		return	eventcalendarFinder.threeParams(first,second,third);
	}
	public List customFinder(String eventName)
	{
		return eventcalendarPersistence.findByEVENT_NAME(eventName);
	}
	
	public List getUserId(String name)
	{
		return empInfoEntityPersistence.findByEMP_NAME(name);
	}
	
}