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

package com.chola.businessmis.service.persistence.impl;

import com.chola.businessmis.model.businessmisdetails;
import com.chola.businessmis.service.persistence.businessmisdetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay01
 * @generated
 */
public class businessmisdetailsFinderBaseImpl extends BasePersistenceImpl<businessmisdetails> {
	@Override
	public Set<String> getBadColumnNames() {
		return getbusinessmisdetailsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the businessmisdetails persistence.
	 *
	 * @return the businessmisdetails persistence
	 */
	public businessmisdetailsPersistence getbusinessmisdetailsPersistence() {
		return businessmisdetailsPersistence;
	}

	/**
	 * Sets the businessmisdetails persistence.
	 *
	 * @param businessmisdetailsPersistence the businessmisdetails persistence
	 */
	public void setbusinessmisdetailsPersistence(
		businessmisdetailsPersistence businessmisdetailsPersistence) {
		this.businessmisdetailsPersistence = businessmisdetailsPersistence;
	}

	@BeanReference(type = businessmisdetailsPersistence.class)
	protected businessmisdetailsPersistence businessmisdetailsPersistence;
}