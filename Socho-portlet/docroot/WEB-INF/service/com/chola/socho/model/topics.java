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
 * The extended model interface for the topics service. Represents a row in the &quot;socho_topics&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see topicsModel
 * @see com.chola.socho.model.impl.topicsImpl
 * @see com.chola.socho.model.impl.topicsModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.socho.model.impl.topicsImpl")
@ProviderType
public interface topics extends topicsModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.socho.model.impl.topicsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<topics, Long> ID_ACCESSOR = new Accessor<topics, Long>() {
			@Override
			public Long get(topics topics) {
				return topics.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<topics> getTypeClass() {
				return topics.class;
			}
		};
}