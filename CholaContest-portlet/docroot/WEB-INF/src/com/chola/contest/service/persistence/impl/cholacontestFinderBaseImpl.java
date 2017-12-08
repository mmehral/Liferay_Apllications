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

package com.chola.contest.service.persistence.impl;

import com.chola.contest.model.cholacontest;
import com.chola.contest.service.persistence.cholacontestPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author cloverliferay01
 * @generated
 */
public class cholacontestFinderBaseImpl extends BasePersistenceImpl<cholacontest> {
	@Override
	public Set<String> getBadColumnNames() {
		return getcholacontestPersistence().getBadColumnNames();
	}

	/**
	 * Returns the cholacontest persistence.
	 *
	 * @return the cholacontest persistence
	 */
	public cholacontestPersistence getcholacontestPersistence() {
		return cholacontestPersistence;
	}

	/**
	 * Sets the cholacontest persistence.
	 *
	 * @param cholacontestPersistence the cholacontest persistence
	 */
	public void setcholacontestPersistence(
		cholacontestPersistence cholacontestPersistence) {
		this.cholacontestPersistence = cholacontestPersistence;
	}

	@BeanReference(type = cholacontestPersistence.class)
	protected cholacontestPersistence cholacontestPersistence;
}