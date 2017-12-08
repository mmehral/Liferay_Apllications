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

package com.chola.anniversary.service.persistence.impl;

import com.chola.anniversary.model.anniversarywish;
import com.chola.anniversary.service.persistence.anniversarywishPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class anniversarywishFinderBaseImpl extends BasePersistenceImpl<anniversarywish> {
	@Override
	public Set<String> getBadColumnNames() {
		return getanniversarywishPersistence().getBadColumnNames();
	}

	/**
	 * Returns the anniversarywish persistence.
	 *
	 * @return the anniversarywish persistence
	 */
	public anniversarywishPersistence getanniversarywishPersistence() {
		return anniversarywishPersistence;
	}

	/**
	 * Sets the anniversarywish persistence.
	 *
	 * @param anniversarywishPersistence the anniversarywish persistence
	 */
	public void setanniversarywishPersistence(
		anniversarywishPersistence anniversarywishPersistence) {
		this.anniversarywishPersistence = anniversarywishPersistence;
	}

	@BeanReference(type = anniversarywishPersistence.class)
	protected anniversarywishPersistence anniversarywishPersistence;
}