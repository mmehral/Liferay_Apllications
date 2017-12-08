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

package com.contest.service.persistence.impl;

import com.contest.model.CholaContest;

import com.contest.service.persistence.CholaContestPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author CloverLiferay01
 * @generated
 */
public class CholaContestFinderBaseImpl extends BasePersistenceImpl<CholaContest> {
	/**
	 * Returns the chola contest persistence.
	 *
	 * @return the chola contest persistence
	 */
	public CholaContestPersistence getCholaContestPersistence() {
		return cholaContestPersistence;
	}

	/**
	 * Sets the chola contest persistence.
	 *
	 * @param cholaContestPersistence the chola contest persistence
	 */
	public void setCholaContestPersistence(
		CholaContestPersistence cholaContestPersistence) {
		this.cholaContestPersistence = cholaContestPersistence;
	}

	@BeanReference(type = CholaContestPersistence.class)
	protected CholaContestPersistence cholaContestPersistence;
}