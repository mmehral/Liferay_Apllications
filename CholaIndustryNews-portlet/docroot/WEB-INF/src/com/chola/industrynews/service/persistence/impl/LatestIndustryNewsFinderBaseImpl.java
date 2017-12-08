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

package com.chola.industrynews.service.persistence.impl;

import com.chola.industrynews.model.LatestIndustryNews;
import com.chola.industrynews.service.persistence.LatestIndustryNewsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay01
 * @generated
 */
public class LatestIndustryNewsFinderBaseImpl extends BasePersistenceImpl<LatestIndustryNews> {
	@Override
	public Set<String> getBadColumnNames() {
		return getLatestIndustryNewsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the latest industry news persistence.
	 *
	 * @return the latest industry news persistence
	 */
	public LatestIndustryNewsPersistence getLatestIndustryNewsPersistence() {
		return latestIndustryNewsPersistence;
	}

	/**
	 * Sets the latest industry news persistence.
	 *
	 * @param latestIndustryNewsPersistence the latest industry news persistence
	 */
	public void setLatestIndustryNewsPersistence(
		LatestIndustryNewsPersistence latestIndustryNewsPersistence) {
		this.latestIndustryNewsPersistence = latestIndustryNewsPersistence;
	}

	@BeanReference(type = LatestIndustryNewsPersistence.class)
	protected LatestIndustryNewsPersistence latestIndustryNewsPersistence;
}