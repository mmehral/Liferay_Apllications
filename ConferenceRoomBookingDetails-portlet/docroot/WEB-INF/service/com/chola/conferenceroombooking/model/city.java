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

package com.chola.conferenceroombooking.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the city service. Represents a row in the &quot;branch_city&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see cityModel
 * @see com.chola.conferenceroombooking.model.impl.cityImpl
 * @see com.chola.conferenceroombooking.model.impl.cityModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.conferenceroombooking.model.impl.cityImpl")
@ProviderType
public interface city extends cityModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.conferenceroombooking.model.impl.cityImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<city, Long> CITY_ID_ACCESSOR = new Accessor<city, Long>() {
			@Override
			public Long get(city city) {
				return city.getCity_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<city> getTypeClass() {
				return city.class;
			}
		};
}