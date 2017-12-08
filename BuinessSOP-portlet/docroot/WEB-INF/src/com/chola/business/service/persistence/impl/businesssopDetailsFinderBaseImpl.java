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

package com.chola.business.service.persistence.impl;

import com.chola.business.model.businesssopDetails;
import com.chola.business.service.persistence.businesssopDetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author adms.java1
 * @generated
 */
public class businesssopDetailsFinderBaseImpl extends BasePersistenceImpl<businesssopDetails> {
	@Override
	public Set<String> getBadColumnNames() {
		return getbusinesssopDetailsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the businesssop details persistence.
	 *
	 * @return the businesssop details persistence
	 */
	public businesssopDetailsPersistence getbusinesssopDetailsPersistence() {
		return businesssopDetailsPersistence;
	}

	/**
	 * Sets the businesssop details persistence.
	 *
	 * @param businesssopDetailsPersistence the businesssop details persistence
	 */
	public void setbusinesssopDetailsPersistence(
		businesssopDetailsPersistence businesssopDetailsPersistence) {
		this.businesssopDetailsPersistence = businesssopDetailsPersistence;
	}

	@BeanReference(type = businesssopDetailsPersistence.class)
	protected businesssopDetailsPersistence businesssopDetailsPersistence;
}