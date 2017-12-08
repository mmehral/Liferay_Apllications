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
 * The extended model interface for the BuySellProductsImages service. Represents a row in the &quot;chola_BuySellProductsImages&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay03
 * @see BuySellProductsImagesModel
 * @see com.chola.productbuysell.model.impl.BuySellProductsImagesImpl
 * @see com.chola.productbuysell.model.impl.BuySellProductsImagesModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.productbuysell.model.impl.BuySellProductsImagesImpl")
@ProviderType
public interface BuySellProductsImages extends BuySellProductsImagesModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.productbuysell.model.impl.BuySellProductsImagesImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<BuySellProductsImages, Long> ID_ACCESSOR = new Accessor<BuySellProductsImages, Long>() {
			@Override
			public Long get(BuySellProductsImages buySellProductsImages) {
				return buySellProductsImages.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<BuySellProductsImages> getTypeClass() {
				return BuySellProductsImages.class;
			}
		};
}