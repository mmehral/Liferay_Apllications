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

package com.chola.personalisedparameters.service.persistence.impl;

import com.chola.personalisedparameters.model.bsopdetails;
import com.chola.personalisedparameters.service.persistence.bsopdetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author cloverliferay01
 * @generated
 */
public class bsopdetailsFinderBaseImpl extends BasePersistenceImpl<bsopdetails> {
	@Override
	public Set<String> getBadColumnNames() {
		return getbsopdetailsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the bsopdetails persistence.
	 *
	 * @return the bsopdetails persistence
	 */
	public bsopdetailsPersistence getbsopdetailsPersistence() {
		return bsopdetailsPersistence;
	}

	/**
	 * Sets the bsopdetails persistence.
	 *
	 * @param bsopdetailsPersistence the bsopdetails persistence
	 */
	public void setbsopdetailsPersistence(
		bsopdetailsPersistence bsopdetailsPersistence) {
		this.bsopdetailsPersistence = bsopdetailsPersistence;
	}

	@BeanReference(type = bsopdetailsPersistence.class)
	protected bsopdetailsPersistence bsopdetailsPersistence;
}