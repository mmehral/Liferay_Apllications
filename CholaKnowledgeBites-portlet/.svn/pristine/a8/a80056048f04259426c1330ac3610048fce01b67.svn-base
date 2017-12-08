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

package com.chola.knowledgebites.service.persistence.impl;

import com.chola.knowledgebites.model.kbdetails;
import com.chola.knowledgebites.service.persistence.kbdetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author cloverliferay01
 * @generated
 */
public class kbdetailsFinderBaseImpl extends BasePersistenceImpl<kbdetails> {
	@Override
	public Set<String> getBadColumnNames() {
		return getkbdetailsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the kbdetails persistence.
	 *
	 * @return the kbdetails persistence
	 */
	public kbdetailsPersistence getkbdetailsPersistence() {
		return kbdetailsPersistence;
	}

	/**
	 * Sets the kbdetails persistence.
	 *
	 * @param kbdetailsPersistence the kbdetails persistence
	 */
	public void setkbdetailsPersistence(
		kbdetailsPersistence kbdetailsPersistence) {
		this.kbdetailsPersistence = kbdetailsPersistence;
	}

	@BeanReference(type = kbdetailsPersistence.class)
	protected kbdetailsPersistence kbdetailsPersistence;
}