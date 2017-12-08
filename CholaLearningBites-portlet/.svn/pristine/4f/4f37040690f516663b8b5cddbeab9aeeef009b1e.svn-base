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

package com.chola.learningbites.service.persistence.impl;

import com.chola.learningbites.model.lbdetails;
import com.chola.learningbites.service.persistence.lbdetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author cloverliferay01
 * @generated
 */
public class lbdetailsFinderBaseImpl extends BasePersistenceImpl<lbdetails> {
	@Override
	public Set<String> getBadColumnNames() {
		return getlbdetailsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the lbdetails persistence.
	 *
	 * @return the lbdetails persistence
	 */
	public lbdetailsPersistence getlbdetailsPersistence() {
		return lbdetailsPersistence;
	}

	/**
	 * Sets the lbdetails persistence.
	 *
	 * @param lbdetailsPersistence the lbdetails persistence
	 */
	public void setlbdetailsPersistence(
		lbdetailsPersistence lbdetailsPersistence) {
		this.lbdetailsPersistence = lbdetailsPersistence;
	}

	@BeanReference(type = lbdetailsPersistence.class)
	protected lbdetailsPersistence lbdetailsPersistence;
}