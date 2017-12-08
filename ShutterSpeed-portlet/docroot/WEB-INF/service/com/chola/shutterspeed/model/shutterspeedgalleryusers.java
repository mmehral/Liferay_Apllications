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
 * The extended model interface for the shutterspeedgalleryusers service. Represents a row in the &quot;chola_shutterspeedgalleryusers&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see shutterspeedgalleryusersModel
 * @see com.chola.shutterspeed.model.impl.shutterspeedgalleryusersImpl
 * @see com.chola.shutterspeed.model.impl.shutterspeedgalleryusersModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.shutterspeed.model.impl.shutterspeedgalleryusersImpl")
@ProviderType
public interface shutterspeedgalleryusers extends shutterspeedgalleryusersModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.shutterspeed.model.impl.shutterspeedgalleryusersImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<shutterspeedgalleryusers, Long> ID_ACCESSOR = new Accessor<shutterspeedgalleryusers, Long>() {
			@Override
			public Long get(shutterspeedgalleryusers shutterspeedgalleryusers) {
				return shutterspeedgalleryusers.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<shutterspeedgalleryusers> getTypeClass() {
				return shutterspeedgalleryusers.class;
			}
		};
}