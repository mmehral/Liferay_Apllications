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

package com.portlet.sample.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.portlet.sample.model.SampleEntry;
import com.portlet.sample.service.SampleEntryLocalServiceUtil;

/**
 * The extended model base implementation for the SampleEntry service. Represents a row in the &quot;Sample_SampleEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SampleEntryImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see SampleEntryImpl
 * @see SampleEntry
 * @generated
 */
@ProviderType
public abstract class SampleEntryBaseImpl extends SampleEntryModelImpl
	implements SampleEntry {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sample entry model instance should use the {@link SampleEntry} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SampleEntryLocalServiceUtil.addSampleEntry(this);
		}
		else {
			SampleEntryLocalServiceUtil.updateSampleEntry(this);
		}
	}
}