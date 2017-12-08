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

package com.chola.productbuysell.service.persistence.impl;

import com.chola.productbuysell.model.BuySell;
import com.chola.productbuysell.service.persistence.BuySellPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay03
 * @generated
 */
public class BuySellFinderBaseImpl extends BasePersistenceImpl<BuySell> {
	@Override
	public Set<String> getBadColumnNames() {
		return getBuySellPersistence().getBadColumnNames();
	}

	/**
	 * Returns the buy sell persistence.
	 *
	 * @return the buy sell persistence
	 */
	public BuySellPersistence getBuySellPersistence() {
		return buySellPersistence;
	}

	/**
	 * Sets the buy sell persistence.
	 *
	 * @param buySellPersistence the buy sell persistence
	 */
	public void setBuySellPersistence(BuySellPersistence buySellPersistence) {
		this.buySellPersistence = buySellPersistence;
	}

	@BeanReference(type = BuySellPersistence.class)
	protected BuySellPersistence buySellPersistence;
}