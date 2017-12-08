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

package com.chola.listbranch.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the state service. Represents a row in the &quot;branch_state&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see stateModel
 * @see com.chola.listbranch.model.impl.stateImpl
 * @see com.chola.listbranch.model.impl.stateModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.listbranch.model.impl.stateImpl")
@ProviderType
public interface state extends stateModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.listbranch.model.impl.stateImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<state, Long> STATE_ID_ACCESSOR = new Accessor<state, Long>() {
			@Override
			public Long get(state state) {
				return state.getState_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<state> getTypeClass() {
				return state.class;
			}
		};
}