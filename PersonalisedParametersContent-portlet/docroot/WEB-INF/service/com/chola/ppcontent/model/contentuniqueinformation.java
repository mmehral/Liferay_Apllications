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

package com.chola.ppcontent.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the contentuniqueinformation service. Represents a row in the &quot;chola_contentuniqueinformation&quot; database table, with each column mapped to a property of this class.
 *
 * @author cloverliferay01
 * @see contentuniqueinformationModel
 * @see com.chola.ppcontent.model.impl.contentuniqueinformationImpl
 * @see com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.ppcontent.model.impl.contentuniqueinformationImpl")
@ProviderType
public interface contentuniqueinformation extends contentuniqueinformationModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.ppcontent.model.impl.contentuniqueinformationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<contentuniqueinformation, Long> ID_ACCESSOR = new Accessor<contentuniqueinformation, Long>() {
			@Override
			public Long get(contentuniqueinformation contentuniqueinformation) {
				return contentuniqueinformation.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<contentuniqueinformation> getTypeClass() {
				return contentuniqueinformation.class;
			}
		};
}