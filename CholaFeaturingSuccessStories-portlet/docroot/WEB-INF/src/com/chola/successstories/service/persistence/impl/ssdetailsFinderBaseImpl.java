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

package com.chola.successstories.service.persistence.impl;

import com.chola.successstories.model.ssdetails;
import com.chola.successstories.service.persistence.ssdetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author cloverliferay01
 * @generated
 */
public class ssdetailsFinderBaseImpl extends BasePersistenceImpl<ssdetails> {
	@Override
	public Set<String> getBadColumnNames() {
		return getssdetailsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the ssdetails persistence.
	 *
	 * @return the ssdetails persistence
	 */
	public ssdetailsPersistence getssdetailsPersistence() {
		return ssdetailsPersistence;
	}

	/**
	 * Sets the ssdetails persistence.
	 *
	 * @param ssdetailsPersistence the ssdetails persistence
	 */
	public void setssdetailsPersistence(
		ssdetailsPersistence ssdetailsPersistence) {
		this.ssdetailsPersistence = ssdetailsPersistence;
	}

	@BeanReference(type = ssdetailsPersistence.class)
	protected ssdetailsPersistence ssdetailsPersistence;
}