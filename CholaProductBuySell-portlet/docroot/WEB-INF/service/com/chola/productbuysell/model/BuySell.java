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
 * The extended model interface for the BuySell service. Represents a row in the &quot;chola_BuySell&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay03
 * @see BuySellModel
 * @see com.chola.productbuysell.model.impl.BuySellImpl
 * @see com.chola.productbuysell.model.impl.BuySellModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.productbuysell.model.impl.BuySellImpl")
@ProviderType
public interface BuySell extends BuySellModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.productbuysell.model.impl.BuySellImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<BuySell, Long> ID_ACCESSOR = new Accessor<BuySell, Long>() {
			@Override
			public Long get(BuySell buySell) {
				return buySell.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<BuySell> getTypeClass() {
				return BuySell.class;
			}
		};
}