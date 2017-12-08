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

package com.usertheme.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import com.usertheme.model.themecolor;

import com.usertheme.service.persistence.themecolorPersistence;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class themecolorFinderBaseImpl extends BasePersistenceImpl<themecolor> {
	@Override
	public Set<String> getBadColumnNames() {
		return getthemecolorPersistence().getBadColumnNames();
	}

	/**
	 * Returns the themecolor persistence.
	 *
	 * @return the themecolor persistence
	 */
	public themecolorPersistence getthemecolorPersistence() {
		return themecolorPersistence;
	}

	/**
	 * Sets the themecolor persistence.
	 *
	 * @param themecolorPersistence the themecolor persistence
	 */
	public void setthemecolorPersistence(
		themecolorPersistence themecolorPersistence) {
		this.themecolorPersistence = themecolorPersistence;
	}

	@BeanReference(type = themecolorPersistence.class)
	protected themecolorPersistence themecolorPersistence;
}