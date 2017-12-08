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

package com.chola.productbuysell.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the BuySellProducts service. Represents a row in the &quot;chola_BuySellProducts&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay03
 * @see BuySellProductsModel
 * @see com.chola.productbuysell.model.impl.BuySellProductsImpl
 * @see com.chola.productbuysell.model.impl.BuySellProductsModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.productbuysell.model.impl.BuySellProductsImpl")
@ProviderType
public interface BuySellProducts extends BuySellProductsModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.productbuysell.model.impl.BuySellProductsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<BuySellProducts, Long> ID_ACCESSOR = new Accessor<BuySellProducts, Long>() {
			@Override
			public Long get(BuySellProducts buySellProducts) {
				return buySellProducts.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<BuySellProducts> getTypeClass() {
				return BuySellProducts.class;
			}
		};
}