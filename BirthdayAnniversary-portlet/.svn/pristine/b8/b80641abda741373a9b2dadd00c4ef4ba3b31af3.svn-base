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

package com.chola.birthday.service.persistence.impl;

import com.chola.birthday.model.birthdaywish;
import com.chola.birthday.service.persistence.birthdaywishPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class birthdaywishFinderBaseImpl extends BasePersistenceImpl<birthdaywish> {
	@Override
	public Set<String> getBadColumnNames() {
		return getbirthdaywishPersistence().getBadColumnNames();
	}

	/**
	 * Returns the birthdaywish persistence.
	 *
	 * @return the birthdaywish persistence
	 */
	public birthdaywishPersistence getbirthdaywishPersistence() {
		return birthdaywishPersistence;
	}

	/**
	 * Sets the birthdaywish persistence.
	 *
	 * @param birthdaywishPersistence the birthdaywish persistence
	 */
	public void setbirthdaywishPersistence(
		birthdaywishPersistence birthdaywishPersistence) {
		this.birthdaywishPersistence = birthdaywishPersistence;
	}

	@BeanReference(type = birthdaywishPersistence.class)
	protected birthdaywishPersistence birthdaywishPersistence;
}