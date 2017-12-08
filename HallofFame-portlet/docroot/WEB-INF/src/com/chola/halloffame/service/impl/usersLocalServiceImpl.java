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

package com.chola.halloffame.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.halloffame.service.base.usersLocalServiceBaseImpl;

/**
 * The implementation of the users local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.halloffame.service.usersLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay02
 * @see usersLocalServiceBaseImpl
 * @see com.chola.halloffame.service.usersLocalServiceUtil
 */
@ProviderType
public class usersLocalServiceImpl extends usersLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.halloffame.service.usersLocalServiceUtil} to access the users local service.
	 */
	public boolean insertData(String message,String postedBy,String postedOn)
	{
		return usersFinder.insertData(message,postedBy,postedOn);
	}
	
	public List getEmpData(String date)
	{
		return usersFinder.getEmpData(date);
	}
}