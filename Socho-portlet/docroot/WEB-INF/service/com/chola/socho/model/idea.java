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

package com.chola.socho.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the idea service. Represents a row in the &quot;socho_idea&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see ideaModel
 * @see com.chola.socho.model.impl.ideaImpl
 * @see com.chola.socho.model.impl.ideaModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.socho.model.impl.ideaImpl")
@ProviderType
public interface idea extends ideaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.socho.model.impl.ideaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<idea, Long> ID_ACCESSOR = new Accessor<idea, Long>() {
			@Override
			public Long get(idea idea) {
				return idea.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<idea> getTypeClass() {
				return idea.class;
			}
		};
}