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

package com.chola.personalisedparameters.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the bsopdetails service. Represents a row in the &quot;chola_bsopdetails&quot; database table, with each column mapped to a property of this class.
 *
 * @author cloverliferay01
 * @see bsopdetailsModel
 * @see com.chola.personalisedparameters.model.impl.bsopdetailsImpl
 * @see com.chola.personalisedparameters.model.impl.bsopdetailsModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.personalisedparameters.model.impl.bsopdetailsImpl")
@ProviderType
public interface bsopdetails extends bsopdetailsModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.personalisedparameters.model.impl.bsopdetailsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<bsopdetails, Long> ID_ACCESSOR = new Accessor<bsopdetails, Long>() {
			@Override
			public Long get(bsopdetails bsopdetails) {
				return bsopdetails.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<bsopdetails> getTypeClass() {
				return bsopdetails.class;
			}
		};
}