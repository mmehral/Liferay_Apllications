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

package com.chola.service.conference.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the facilitymaster service. Represents a row in the &quot;cholaconference_facilitymaster&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see facilitymasterModel
 * @see com.chola.service.conference.model.impl.facilitymasterImpl
 * @see com.chola.service.conference.model.impl.facilitymasterModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.service.conference.model.impl.facilitymasterImpl")
@ProviderType
public interface facilitymaster extends facilitymasterModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.service.conference.model.impl.facilitymasterImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<facilitymaster, Long> FACILITY_ID_ACCESSOR = new Accessor<facilitymaster, Long>() {
			@Override
			public Long get(facilitymaster facilitymaster) {
				return facilitymaster.getFacility_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<facilitymaster> getTypeClass() {
				return facilitymaster.class;
			}
		};
}