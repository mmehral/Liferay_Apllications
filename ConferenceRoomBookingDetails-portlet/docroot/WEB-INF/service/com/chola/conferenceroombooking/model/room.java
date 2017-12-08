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

package com.chola.conferenceroombooking.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the room service. Represents a row in the &quot;branch_room&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see roomModel
 * @see com.chola.conferenceroombooking.model.impl.roomImpl
 * @see com.chola.conferenceroombooking.model.impl.roomModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.conferenceroombooking.model.impl.roomImpl")
@ProviderType
public interface room extends roomModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.conferenceroombooking.model.impl.roomImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<room, Long> ROOM_ID_ACCESSOR = new Accessor<room, Long>() {
			@Override
			public Long get(room room) {
				return room.getRoom_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<room> getTypeClass() {
				return room.class;
			}
		};
}