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

package com.chola.book.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the bookdetails service. Represents a row in the &quot;chola_bookdetails&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see bookdetailsModel
 * @see com.chola.book.model.impl.bookdetailsImpl
 * @see com.chola.book.model.impl.bookdetailsModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.book.model.impl.bookdetailsImpl")
@ProviderType
public interface bookdetails extends bookdetailsModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.book.model.impl.bookdetailsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<bookdetails, Long> ID_ACCESSOR = new Accessor<bookdetails, Long>() {
			@Override
			public Long get(bookdetails bookdetails) {
				return bookdetails.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<bookdetails> getTypeClass() {
				return bookdetails.class;
			}
		};
}