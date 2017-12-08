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

package com.portlet.sample.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the SampleEntry service. Represents a row in the &quot;Sample_SampleEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay01
 * @see SampleEntryModel
 * @see com.portlet.sample.model.impl.SampleEntryImpl
 * @see com.portlet.sample.model.impl.SampleEntryModelImpl
 * @generated
 */
@ImplementationClassName("com.portlet.sample.model.impl.SampleEntryImpl")
@ProviderType
public interface SampleEntry extends SampleEntryModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.portlet.sample.model.impl.SampleEntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SampleEntry, Long> ENTRY_ID_ACCESSOR = new Accessor<SampleEntry, Long>() {
			@Override
			public Long get(SampleEntry sampleEntry) {
				return sampleEntry.getEntryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<SampleEntry> getTypeClass() {
				return SampleEntry.class;
			}
		};
}