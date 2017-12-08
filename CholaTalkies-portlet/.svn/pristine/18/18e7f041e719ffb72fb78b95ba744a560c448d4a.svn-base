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

package com.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.model.cholatalkiesusers;
import com.service.base.cholatalkiesusersLocalServiceBaseImpl;

/**
 * The implementation of the cholatalkiesusers local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.service.cholatalkiesusersLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiesusersLocalServiceBaseImpl
 * @see com.service.cholatalkiesusersLocalServiceUtil
 */
@ProviderType
public class cholatalkiesusersLocalServiceImpl
	extends cholatalkiesusersLocalServiceBaseImpl {
	public List<cholatalkiesusers> getCTDetails(long ctId)
	{
		
		return cholatalkiesusersPersistence.findByCHOLATALKIES_ID(ctId);
	}
	
	public List<cholatalkiesusers> getCTUsers(long user_id)
	{
		return cholatalkiesusersPersistence.findByCHOLATALKIES_ID(user_id);
	}
}