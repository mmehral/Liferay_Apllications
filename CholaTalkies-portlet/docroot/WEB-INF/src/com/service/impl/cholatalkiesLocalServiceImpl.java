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

import com.model.cholatalkies;
import com.service.base.cholatalkiesLocalServiceBaseImpl;
import com.service.persistence.cholatalkiesFinderUtil;

/**
 * The implementation of the cholatalkies local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.service.cholatalkiesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiesLocalServiceBaseImpl
 * @see com.service.cholatalkiesLocalServiceUtil
 */
@ProviderType
public class cholatalkiesLocalServiceImpl
	extends cholatalkiesLocalServiceBaseImpl {
	public List<cholatalkies> cholaTalkiesVideoDetails(long contentId){
		return cholatalkiesPersistence.findByCONTENT_ID(contentId);
	}
}