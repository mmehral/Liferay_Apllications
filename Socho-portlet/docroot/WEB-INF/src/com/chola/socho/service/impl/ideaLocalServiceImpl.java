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

package com.chola.socho.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.socho.model.idea;
import com.chola.socho.model.topics;
import com.chola.socho.service.base.ideaLocalServiceBaseImpl;

/**
 * The implementation of the idea local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.socho.service.ideaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay02
 * @see ideaLocalServiceBaseImpl
 * @see com.chola.socho.service.ideaLocalServiceUtil
 */
@ProviderType
public class ideaLocalServiceImpl extends ideaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.socho.service.ideaLocalServiceUtil} to access the idea local service.
	 */
	public List<idea> customFinder(String topicId)
	{
		return ideaPersistence.findByTOPICS_ID(topicId);
	}
}