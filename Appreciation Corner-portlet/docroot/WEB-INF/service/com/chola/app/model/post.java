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

package com.chola.app.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the post service. Represents a row in the &quot;appreciation_post&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see postModel
 * @see com.chola.app.model.impl.postImpl
 * @see com.chola.app.model.impl.postModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.app.model.impl.postImpl")
@ProviderType
public interface post extends postModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.app.model.impl.postImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<post, Long> ID_ACCESSOR = new Accessor<post, Long>() {
			@Override
			public Long get(post post) {
				return post.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<post> getTypeClass() {
				return post.class;
			}
		};
}