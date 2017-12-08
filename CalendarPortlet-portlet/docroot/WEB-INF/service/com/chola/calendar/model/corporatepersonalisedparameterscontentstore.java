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

package com.chola.calendar.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the corporatepersonalisedparameterscontentstore service. Represents a row in the &quot;events_corporatepersonalisedparameterscontentstore&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see corporatepersonalisedparameterscontentstoreModel
 * @see com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreImpl
 * @see com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreImpl")
@ProviderType
public interface corporatepersonalisedparameterscontentstore
	extends corporatepersonalisedparameterscontentstoreModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<corporatepersonalisedparameterscontentstore, Long> ID_ACCESSOR =
		new Accessor<corporatepersonalisedparameterscontentstore, Long>() {
			@Override
			public Long get(
				corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
				return corporatepersonalisedparameterscontentstore.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<corporatepersonalisedparameterscontentstore> getTypeClass() {
				return corporatepersonalisedparameterscontentstore.class;
			}
		};
}