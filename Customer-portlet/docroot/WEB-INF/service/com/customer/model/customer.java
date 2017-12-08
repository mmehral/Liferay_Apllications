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

package com.customer.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the customer service. Represents a row in the &quot;Z_customer&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay01
 * @see customerModel
 * @see com.customer.model.impl.customerImpl
 * @see com.customer.model.impl.customerModelImpl
 * @generated
 */
@ImplementationClassName("com.customer.model.impl.customerImpl")
@ProviderType
public interface customer extends customerModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.customer.model.impl.customerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<customer, Long> CUSTOMER_ID_ACCESSOR = new Accessor<customer, Long>() {
			@Override
			public Long get(customer customer) {
				return customer.getCustomerId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<customer> getTypeClass() {
				return customer.class;
			}
		};
}