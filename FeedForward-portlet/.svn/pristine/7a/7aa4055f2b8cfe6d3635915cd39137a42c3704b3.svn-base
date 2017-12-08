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

package com.chola.feedforward.service.persistence.impl;

import com.chola.feedforward.model.feedforwardgallery;
import com.chola.feedforward.service.persistence.feedforwardgalleryPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class feedforwardgalleryFinderBaseImpl extends BasePersistenceImpl<feedforwardgallery> {
	@Override
	public Set<String> getBadColumnNames() {
		return getfeedforwardgalleryPersistence().getBadColumnNames();
	}

	/**
	 * Returns the feedforwardgallery persistence.
	 *
	 * @return the feedforwardgallery persistence
	 */
	public feedforwardgalleryPersistence getfeedforwardgalleryPersistence() {
		return feedforwardgalleryPersistence;
	}

	/**
	 * Sets the feedforwardgallery persistence.
	 *
	 * @param feedforwardgalleryPersistence the feedforwardgallery persistence
	 */
	public void setfeedforwardgalleryPersistence(
		feedforwardgalleryPersistence feedforwardgalleryPersistence) {
		this.feedforwardgalleryPersistence = feedforwardgalleryPersistence;
	}

	@BeanReference(type = feedforwardgalleryPersistence.class)
	protected feedforwardgalleryPersistence feedforwardgalleryPersistence;
}