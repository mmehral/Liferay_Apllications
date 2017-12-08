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

package com.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the cholatalkies service. Represents a row in the &quot;CholaT_cholatalkies&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see cholatalkiesModel
 * @see com.model.impl.cholatalkiesImpl
 * @see com.model.impl.cholatalkiesModelImpl
 * @generated
 */
@ImplementationClassName("com.model.impl.cholatalkiesImpl")
@ProviderType
public interface cholatalkies extends cholatalkiesModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.model.impl.cholatalkiesImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<cholatalkies, Long> ID_ACCESSOR = new Accessor<cholatalkies, Long>() {
			@Override
			public Long get(cholatalkies cholatalkies) {
				return cholatalkies.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<cholatalkies> getTypeClass() {
				return cholatalkies.class;
			}
		};
}