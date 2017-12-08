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

package com.content.service.persistence.impl;

import com.content.model.contentupdate;

import com.content.service.persistence.contentupdatePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class contentupdateFinderBaseImpl extends BasePersistenceImpl<contentupdate> {
	@Override
	public Set<String> getBadColumnNames() {
		return getcontentupdatePersistence().getBadColumnNames();
	}

	/**
	 * Returns the contentupdate persistence.
	 *
	 * @return the contentupdate persistence
	 */
	public contentupdatePersistence getcontentupdatePersistence() {
		return contentupdatePersistence;
	}

	/**
	 * Sets the contentupdate persistence.
	 *
	 * @param contentupdatePersistence the contentupdate persistence
	 */
	public void setcontentupdatePersistence(
		contentupdatePersistence contentupdatePersistence) {
		this.contentupdatePersistence = contentupdatePersistence;
	}

	@BeanReference(type = contentupdatePersistence.class)
	protected contentupdatePersistence contentupdatePersistence;
}