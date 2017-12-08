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

import com.chola.calendar.service.base.eventcalendarLocalServiceBaseImpl;
import com.chola.calendar.service.persistence.eventcalendarFinderUtil;

/**
 * The implementation of the eventcalendar local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.chola.calendar.service.eventcalendarLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see eventcalendarLocalServiceBaseImpl
 * @see com.chola.calendar.service.eventcalendarLocalServiceUtil
 */
@ProviderType
public class eventcalendarLocalServiceImpl extends eventcalendarLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.chola.calendar.service.eventcalendarLocalServiceUtil} to access the
	 * eventcalendar local service.
	 */

	public List<String> getDetails(long userId) {
		return eventcalendarFinder.getEvents(userId);
	}

	// On 15 April Ashish is addded by Notification code
	public boolean insertNotifyStts(int syscode, int val, String sysname, int stts, int sttsflag, long usernotifyId) {
		return eventcalendarFinderUtil.insertNotifyStts(syscode, val, sysname, stts, sttsflag, usernotifyId);
	}

	public List<Object[]> SyscodeCustomMsg(int syscode) {
		return eventcalendarFinderUtil.SyscodeCustomMsg(syscode);
	}

}