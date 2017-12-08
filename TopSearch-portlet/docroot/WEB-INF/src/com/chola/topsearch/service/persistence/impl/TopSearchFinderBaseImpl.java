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

package com.chola.topsearch.service.persistence.impl;

import com.chola.topsearch.model.TopSearch;
import com.chola.topsearch.service.persistence.TopSearchPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author adms.java1
 * @generated
 */
public class TopSearchFinderBaseImpl extends BasePersistenceImpl<TopSearch> {
	/**
	 * Returns the top search persistence.
	 *
	 * @return the top search persistence
	 */
	public TopSearchPersistence getTopSearchPersistence() {
		return topSearchPersistence;
	}

	/**
	 * Sets the top search persistence.
	 *
	 * @param topSearchPersistence the top search persistence
	 */
	public void setTopSearchPersistence(
		TopSearchPersistence topSearchPersistence) {
		this.topSearchPersistence = topSearchPersistence;
	}

	@BeanReference(type = TopSearchPersistence.class)
	protected TopSearchPersistence topSearchPersistence;
}