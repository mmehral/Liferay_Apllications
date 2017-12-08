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

package com.chola.calendar.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the eventcalendar service. Represents a row in the &quot;events_eventcalendar&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see eventcalendarModel
 * @see com.chola.calendar.model.impl.eventcalendarImpl
 * @see com.chola.calendar.model.impl.eventcalendarModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.calendar.model.impl.eventcalendarImpl")
@ProviderType
public interface eventcalendar extends eventcalendarModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.calendar.model.impl.eventcalendarImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<eventcalendar, Long> ID_ACCESSOR = new Accessor<eventcalendar, Long>() {
			@Override
			public Long get(eventcalendar eventcalendar) {
				return eventcalendar.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<eventcalendar> getTypeClass() {
				return eventcalendar.class;
			}
		};
}