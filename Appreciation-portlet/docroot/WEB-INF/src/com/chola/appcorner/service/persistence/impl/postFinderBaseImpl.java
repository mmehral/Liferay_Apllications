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

package com.chola.appcorner.service.persistence.impl;

import com.chola.appcorner.model.post;
import com.chola.appcorner.service.persistence.postPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class postFinderBaseImpl extends BasePersistenceImpl<post> {
	@Override
	public Set<String> getBadColumnNames() {
		return getpostPersistence().getBadColumnNames();
	}

	/**
	 * Returns the post persistence.
	 *
	 * @return the post persistence
	 */
	public postPersistence getpostPersistence() {
		return postPersistence;
	}

	/**
	 * Sets the post persistence.
	 *
	 * @param postPersistence the post persistence
	 */
	public void setpostPersistence(postPersistence postPersistence) {
		this.postPersistence = postPersistence;
	}

	@BeanReference(type = postPersistence.class)
	protected postPersistence postPersistence;
}