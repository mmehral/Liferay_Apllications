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

package com.chola.trainingcalendar.service.persistence.impl;

import com.chola.trainingcalendar.model.trainingcalendar;
import com.chola.trainingcalendar.service.persistence.trainingcalendarPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author CloverLiferay01
 * @generated
 */
public class trainingcalendarFinderBaseImpl extends BasePersistenceImpl<trainingcalendar> {
	/**
	 * Returns the trainingcalendar persistence.
	 *
	 * @return the trainingcalendar persistence
	 */
	public trainingcalendarPersistence gettrainingcalendarPersistence() {
		return trainingcalendarPersistence;
	}

	/**
	 * Sets the trainingcalendar persistence.
	 *
	 * @param trainingcalendarPersistence the trainingcalendar persistence
	 */
	public void settrainingcalendarPersistence(
		trainingcalendarPersistence trainingcalendarPersistence) {
		this.trainingcalendarPersistence = trainingcalendarPersistence;
	}

	@BeanReference(type = trainingcalendarPersistence.class)
	protected trainingcalendarPersistence trainingcalendarPersistence;
}