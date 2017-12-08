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

package com.chola.appcorner.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.appcorner.model.post;
import com.chola.appcorner.service.base.postLocalServiceBaseImpl;
import com.chola.appcorner.service.persistence.postFinderUtil;
import com.chola.appcorner.service.persistence.impl.postFinderImpl;

/**
 * The implementation of the post local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.appcorner.service.postLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay02
 * @see postLocalServiceBaseImpl
 * @see com.chola.appcorner.service.postLocalServiceUtil
 */
@ProviderType
public class postLocalServiceImpl extends postLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.appcorner.service.postLocalServiceUtil} to access the post local service.
	 */
	public List<post> getAppToData(long appTo)
	{
		return postPersistence.findByAPP_TO(appTo);
	}
	
	public boolean insertNotificationData(int syscode, int val, String sysname, int status, int sttsflag, long usernotifyId) {
		return postFinderUtil.insertNotificationData(syscode, val, sysname, status, sttsflag, usernotifyId);
	}
	
	public List<Object[]> SyscodeCustomMsg(int syscode) {
		return postFinderUtil.SyscodeCustomMsg(syscode);
	}

}