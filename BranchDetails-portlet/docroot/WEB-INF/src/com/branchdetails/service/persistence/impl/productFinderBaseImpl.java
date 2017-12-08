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

package com.branchdetails.service.persistence.impl;

import com.branchdetails.model.product;

import com.branchdetails.service.persistence.productPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author adms.java1
 * @generated
 */
public class productFinderBaseImpl extends BasePersistenceImpl<product> {
	/**
	 * Returns the product persistence.
	 *
	 * @return the product persistence
	 */
	public productPersistence getproductPersistence() {
		return productPersistence;
	}

	/**
	 * Sets the product persistence.
	 *
	 * @param productPersistence the product persistence
	 */
	public void setproductPersistence(productPersistence productPersistence) {
		this.productPersistence = productPersistence;
	}

	@BeanReference(type = productPersistence.class)
	protected productPersistence productPersistence;
}