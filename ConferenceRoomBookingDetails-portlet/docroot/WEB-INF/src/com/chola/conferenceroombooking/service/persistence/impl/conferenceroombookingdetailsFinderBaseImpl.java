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

package com.chola.conferenceroombooking.service.persistence.impl;

import com.chola.conferenceroombooking.model.conferenceroombookingdetails;
import com.chola.conferenceroombooking.service.persistence.conferenceroombookingdetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author adms.java1
 * @generated
 */
public class conferenceroombookingdetailsFinderBaseImpl
	extends BasePersistenceImpl<conferenceroombookingdetails> {
	/**
	 * Returns the conferenceroombookingdetails persistence.
	 *
	 * @return the conferenceroombookingdetails persistence
	 */
	public conferenceroombookingdetailsPersistence getconferenceroombookingdetailsPersistence() {
		return conferenceroombookingdetailsPersistence;
	}

	/**
	 * Sets the conferenceroombookingdetails persistence.
	 *
	 * @param conferenceroombookingdetailsPersistence the conferenceroombookingdetails persistence
	 */
	public void setconferenceroombookingdetailsPersistence(
		conferenceroombookingdetailsPersistence conferenceroombookingdetailsPersistence) {
		this.conferenceroombookingdetailsPersistence = conferenceroombookingdetailsPersistence;
	}

	@BeanReference(type = conferenceroombookingdetailsPersistence.class)
	protected conferenceroombookingdetailsPersistence conferenceroombookingdetailsPersistence;
}