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

import com.chola.business.model.businesssoppath;
import com.chola.business.model.businesssopusers;
import com.chola.business.service.base.businesssopusersLocalServiceBaseImpl;

/**
 * The implementation of the businesssopusers local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.business.service.businesssopusersLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see businesssopusersLocalServiceBaseImpl
 * @see com.chola.business.service.businesssopusersLocalServiceUtil
 */
@ProviderType
public class businesssopusersLocalServiceImpl
	extends businesssopusersLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.business.service.businesssopusersLocalServiceUtil} to access the businesssopusers local service.
	 */
	public List<businesssopusers> getSOPdocuments(long sopId)
	{
		return businesssopusersPersistence.findByBUSINESS_ID(sopId);
	}
	
	public List<businesssopusers> getSOPUsers(long user_id)
	{
		return businesssopusersPersistence.findByUSER_ID(user_id);
	}
}