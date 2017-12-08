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

package com.chola.feedforward.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the feedforwardgallerypath service. Represents a row in the &quot;chola_feedforwardgallerypath&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see feedforwardgallerypathModel
 * @see com.chola.feedforward.model.impl.feedforwardgallerypathImpl
 * @see com.chola.feedforward.model.impl.feedforwardgallerypathModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.feedforward.model.impl.feedforwardgallerypathImpl")
@ProviderType
public interface feedforwardgallerypath extends feedforwardgallerypathModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.feedforward.model.impl.feedforwardgallerypathImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<feedforwardgallerypath, Long> ID_ACCESSOR = new Accessor<feedforwardgallerypath, Long>() {
			@Override
			public Long get(feedforwardgallerypath feedforwardgallerypath) {
				return feedforwardgallerypath.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<feedforwardgallerypath> getTypeClass() {
				return feedforwardgallerypath.class;
			}
		};
}