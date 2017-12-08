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

package com.contest.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ContestUserDetails service. Represents a row in the &quot;chola_ContestUserDetails&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay01
 * @see ContestUserDetailsModel
 * @see com.contest.model.impl.ContestUserDetailsImpl
 * @see com.contest.model.impl.ContestUserDetailsModelImpl
 * @generated
 */
@ImplementationClassName("com.contest.model.impl.ContestUserDetailsImpl")
@ProviderType
public interface ContestUserDetails extends ContestUserDetailsModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.contest.model.impl.ContestUserDetailsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ContestUserDetails, Long> ID_ACCESSOR = new Accessor<ContestUserDetails, Long>() {
			@Override
			public Long get(ContestUserDetails contestUserDetails) {
				return contestUserDetails.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ContestUserDetails> getTypeClass() {
				return ContestUserDetails.class;
			}
		};
}