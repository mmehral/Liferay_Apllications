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

package com.popular.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import com.popular.model.popularlinks;

import com.popular.service.persistence.popularlinksPersistence;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class popularlinksFinderBaseImpl extends BasePersistenceImpl<popularlinks> {
	@Override
	public Set<String> getBadColumnNames() {
		return getpopularlinksPersistence().getBadColumnNames();
	}

	/**
	 * Returns the popularlinks persistence.
	 *
	 * @return the popularlinks persistence
	 */
	public popularlinksPersistence getpopularlinksPersistence() {
		return popularlinksPersistence;
	}

	/**
	 * Sets the popularlinks persistence.
	 *
	 * @param popularlinksPersistence the popularlinks persistence
	 */
	public void setpopularlinksPersistence(
		popularlinksPersistence popularlinksPersistence) {
		this.popularlinksPersistence = popularlinksPersistence;
	}

	@BeanReference(type = popularlinksPersistence.class)
	protected popularlinksPersistence popularlinksPersistence;
}