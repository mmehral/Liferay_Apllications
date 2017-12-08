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

package com.chola.book.service.persistence.impl;

import com.chola.book.model.bookdetails;
import com.chola.book.service.persistence.bookdetailsPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.util.Set;

/**
 * @author CloverLiferay02
 * @generated
 */
public class bookdetailsFinderBaseImpl extends BasePersistenceImpl<bookdetails> {
	@Override
	public Set<String> getBadColumnNames() {
		return getbookdetailsPersistence().getBadColumnNames();
	}

	/**
	 * Returns the bookdetails persistence.
	 *
	 * @return the bookdetails persistence
	 */
	public bookdetailsPersistence getbookdetailsPersistence() {
		return bookdetailsPersistence;
	}

	/**
	 * Sets the bookdetails persistence.
	 *
	 * @param bookdetailsPersistence the bookdetails persistence
	 */
	public void setbookdetailsPersistence(
		bookdetailsPersistence bookdetailsPersistence) {
		this.bookdetailsPersistence = bookdetailsPersistence;
	}

	@BeanReference(type = bookdetailsPersistence.class)
	protected bookdetailsPersistence bookdetailsPersistence;
}