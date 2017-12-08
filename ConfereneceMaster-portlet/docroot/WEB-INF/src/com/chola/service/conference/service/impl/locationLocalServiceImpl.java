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

package com.chola.service.conference.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.service.conference.service.base.locationLocalServiceBaseImpl;

/**
 * The implementation of the location local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.service.conference.service.locationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see locationLocalServiceBaseImpl
 * @see com.chola.service.conference.service.locationLocalServiceUtil
 */
@ProviderType
public class locationLocalServiceImpl extends locationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.service.conference.service.locationLocalServiceUtil} to access the location local service.
	 */
	
	public List<String> getState()
	{
		return locationFinder.getState();
	}
	public String getStatename(long stateId)
	{
		return locationFinder.getStatename(stateId);
	}
	public List<String> getlocations(long stateID)
	{
		return locationFinder.getlocations(stateID);
	}
	public List<String> getfloorname()
	{
		return locationFinder.getfloorname();
	}
	public String getroomvalues(long roomId)
	{
		return locationFinder.getroomvalues(roomId);
	}
	public String getlocationname(long locationId)
	{
		return locationFinder.getlocationname(locationId);
	}
	public String getfloorname(long floorId)
	{
		return locationFinder.getfloorname(floorId);
	}
}