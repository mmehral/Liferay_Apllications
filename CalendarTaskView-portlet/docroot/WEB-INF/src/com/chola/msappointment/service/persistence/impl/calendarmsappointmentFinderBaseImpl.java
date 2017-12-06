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

package com.chola.msappointment.service.persistence.impl;

import com.chola.msappointment.model.calendarmsappointment;
import com.chola.msappointment.service.persistence.calendarmsappointmentPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay01
 * @generated
 */
public class calendarmsappointmentFinderBaseImpl extends BasePersistenceImpl<calendarmsappointment> {
	@Override
	public Set<String> getBadColumnNames() {
		return getcalendarmsappointmentPersistence().getBadColumnNames();
	}

	/**
	 * Returns the calendarmsappointment persistence.
	 *
	 * @return the calendarmsappointment persistence
	 */
	public calendarmsappointmentPersistence getcalendarmsappointmentPersistence() {
		return calendarmsappointmentPersistence;
	}

	/**
	 * Sets the calendarmsappointment persistence.
	 *
	 * @param calendarmsappointmentPersistence the calendarmsappointment persistence
	 */
	public void setcalendarmsappointmentPersistence(
		calendarmsappointmentPersistence calendarmsappointmentPersistence) {
		this.calendarmsappointmentPersistence = calendarmsappointmentPersistence;
	}

	@BeanReference(type = calendarmsappointmentPersistence.class)
	protected calendarmsappointmentPersistence calendarmsappointmentPersistence;
}