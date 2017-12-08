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

package com.chola.milestone.service.persistence.impl;

import com.chola.milestone.model.milestone;
import com.chola.milestone.service.persistence.milestonePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class milestoneFinderBaseImpl extends BasePersistenceImpl<milestone> {
	@Override
	public Set<String> getBadColumnNames() {
		return getmilestonePersistence().getBadColumnNames();
	}

	/**
	 * Returns the milestone persistence.
	 *
	 * @return the milestone persistence
	 */
	public milestonePersistence getmilestonePersistence() {
		return milestonePersistence;
	}

	/**
	 * Sets the milestone persistence.
	 *
	 * @param milestonePersistence the milestone persistence
	 */
	public void setmilestonePersistence(
		milestonePersistence milestonePersistence) {
		this.milestonePersistence = milestonePersistence;
	}

	@BeanReference(type = milestonePersistence.class)
	protected milestonePersistence milestonePersistence;
}