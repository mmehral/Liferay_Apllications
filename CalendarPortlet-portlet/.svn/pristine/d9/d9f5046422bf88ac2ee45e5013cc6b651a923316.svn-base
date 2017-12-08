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

package com.chola.calendar.service.persistence.impl;

import com.chola.calendar.model.eventcalendar;
import com.chola.calendar.service.persistence.eventcalendarPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author adms.java1
 * @generated
 */
public class eventcalendarFinderBaseImpl extends BasePersistenceImpl<eventcalendar> {
	@Override
	public Set<String> getBadColumnNames() {
		return geteventcalendarPersistence().getBadColumnNames();
	}

	/**
	 * Returns the eventcalendar persistence.
	 *
	 * @return the eventcalendar persistence
	 */
	public eventcalendarPersistence geteventcalendarPersistence() {
		return eventcalendarPersistence;
	}

	/**
	 * Sets the eventcalendar persistence.
	 *
	 * @param eventcalendarPersistence the eventcalendar persistence
	 */
	public void seteventcalendarPersistence(
		eventcalendarPersistence eventcalendarPersistence) {
		this.eventcalendarPersistence = eventcalendarPersistence;
	}

	@BeanReference(type = eventcalendarPersistence.class)
	protected eventcalendarPersistence eventcalendarPersistence;
}