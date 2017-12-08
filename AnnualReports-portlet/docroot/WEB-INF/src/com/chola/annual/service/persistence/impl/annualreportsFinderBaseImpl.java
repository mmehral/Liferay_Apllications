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

package com.chola.annual.service.persistence.impl;

import com.chola.annual.model.annualreports;
import com.chola.annual.service.persistence.annualreportsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class annualreportsFinderBaseImpl extends BasePersistenceImpl<annualreports> {
	@Override
	public Set<String> getBadColumnNames() {
		return getannualreportsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the annualreports persistence.
	 *
	 * @return the annualreports persistence
	 */
	public annualreportsPersistence getannualreportsPersistence() {
		return annualreportsPersistence;
	}

	/**
	 * Sets the annualreports persistence.
	 *
	 * @param annualreportsPersistence the annualreports persistence
	 */
	public void setannualreportsPersistence(
		annualreportsPersistence annualreportsPersistence) {
		this.annualreportsPersistence = annualreportsPersistence;
	}

	@BeanReference(type = annualreportsPersistence.class)
	protected annualreportsPersistence annualreportsPersistence;
}