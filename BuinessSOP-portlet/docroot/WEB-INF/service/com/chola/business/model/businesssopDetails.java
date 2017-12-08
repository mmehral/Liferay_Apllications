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

package com.chola.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the businesssopDetails service. Represents a row in the &quot;chola_businesssopDetails&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see businesssopDetailsModel
 * @see com.chola.business.model.impl.businesssopDetailsImpl
 * @see com.chola.business.model.impl.businesssopDetailsModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.business.model.impl.businesssopDetailsImpl")
@ProviderType
public interface businesssopDetails extends businesssopDetailsModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.business.model.impl.businesssopDetailsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<businesssopDetails, Long> ID_ACCESSOR = new Accessor<businesssopDetails, Long>() {
			@Override
			public Long get(businesssopDetails businesssopDetails) {
				return businesssopDetails.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<businesssopDetails> getTypeClass() {
				return businesssopDetails.class;
			}
		};
}