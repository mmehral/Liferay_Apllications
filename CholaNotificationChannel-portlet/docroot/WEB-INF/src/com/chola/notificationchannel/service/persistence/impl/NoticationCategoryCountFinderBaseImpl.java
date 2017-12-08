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

package com.chola.notificationchannel.service.persistence.impl;

import com.chola.notificationchannel.model.NoticationCategoryCount;
import com.chola.notificationchannel.service.persistence.NoticationCategoryCountPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author cloverliferay01
 * @generated
 */
public class NoticationCategoryCountFinderBaseImpl extends BasePersistenceImpl<NoticationCategoryCount> {
	/**
	 * Returns the notication category count persistence.
	 *
	 * @return the notication category count persistence
	 */
	public NoticationCategoryCountPersistence getNoticationCategoryCountPersistence() {
		return noticationCategoryCountPersistence;
	}

	/**
	 * Sets the notication category count persistence.
	 *
	 * @param noticationCategoryCountPersistence the notication category count persistence
	 */
	public void setNoticationCategoryCountPersistence(
		NoticationCategoryCountPersistence noticationCategoryCountPersistence) {
		this.noticationCategoryCountPersistence = noticationCategoryCountPersistence;
	}

	@BeanReference(type = NoticationCategoryCountPersistence.class)
	protected NoticationCategoryCountPersistence noticationCategoryCountPersistence;
}