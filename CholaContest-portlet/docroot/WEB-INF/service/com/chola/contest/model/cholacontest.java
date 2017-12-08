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

package com.chola.contest.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the cholacontest service. Represents a row in the &quot;chola_cholacontest&quot; database table, with each column mapped to a property of this class.
 *
 * @author cloverliferay01
 * @see cholacontestModel
 * @see com.chola.contest.model.impl.cholacontestImpl
 * @see com.chola.contest.model.impl.cholacontestModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.contest.model.impl.cholacontestImpl")
@ProviderType
public interface cholacontest extends cholacontestModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.contest.model.impl.cholacontestImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<cholacontest, Long> ID_ACCESSOR = new Accessor<cholacontest, Long>() {
			@Override
			public Long get(cholacontest cholacontest) {
				return cholacontest.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<cholacontest> getTypeClass() {
				return cholacontest.class;
			}
		};
}