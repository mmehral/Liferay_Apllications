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
 * The extended model interface for the floorwing service. Represents a row in the &quot;cholaconference_floorwing&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see floorwingModel
 * @see com.chola.service.conference.model.impl.floorwingImpl
 * @see com.chola.service.conference.model.impl.floorwingModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.service.conference.model.impl.floorwingImpl")
@ProviderType
public interface floorwing extends floorwingModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.service.conference.model.impl.floorwingImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<floorwing, Long> FLOORWING_ID_ACCESSOR = new Accessor<floorwing, Long>() {
			@Override
			public Long get(floorwing floorwing) {
				return floorwing.getFloorwing_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<floorwing> getTypeClass() {
				return floorwing.class;
			}
		};
}