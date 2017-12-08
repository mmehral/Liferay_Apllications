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

import com.contest.model.ContestUserDetails;
import com.contest.service.base.ContestUserDetailsLocalServiceBaseImpl;
import com.contest.service.persistence.ContestUserDetailsPersistence;

/**
 * The implementation of the contest user details local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.contest.service.ContestUserDetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay01
 * @see ContestUserDetailsLocalServiceBaseImpl
 * @see com.contest.service.ContestUserDetailsLocalServiceUtil
 */
@ProviderType
public class ContestUserDetailsLocalServiceImpl
	extends ContestUserDetailsLocalServiceBaseImpl {
	
	public List<ContestUserDetails> getUserIdByContestId(long id){
		return contestUserDetailsPersistence.findByCONTESTUSERREFERENCE_ID(id);
	}
}