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

package com.chola.shutterspeed.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the shutterspeedgallerypath service. Represents a row in the &quot;chola_shutterspeedgallerypath&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see shutterspeedgallerypathModel
 * @see com.chola.shutterspeed.model.impl.shutterspeedgallerypathImpl
 * @see com.chola.shutterspeed.model.impl.shutterspeedgallerypathModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.shutterspeed.model.impl.shutterspeedgallerypathImpl")
@ProviderType
public interface shutterspeedgallerypath extends shutterspeedgallerypathModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.shutterspeed.model.impl.shutterspeedgallerypathImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<shutterspeedgallerypath, Long> ID_ACCESSOR = new Accessor<shutterspeedgallerypath, Long>() {
			@Override
			public Long get(shutterspeedgallerypath shutterspeedgallerypath) {
				return shutterspeedgallerypath.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<shutterspeedgallerypath> getTypeClass() {
				return shutterspeedgallerypath.class;
			}
		};
}