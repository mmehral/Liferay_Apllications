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

package com.chola.mdspeak.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the MdSpeaks service. Represents a row in the &quot;mdspeak_MdSpeaks&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see MdSpeaksModel
 * @see com.chola.mdspeak.model.impl.MdSpeaksImpl
 * @see com.chola.mdspeak.model.impl.MdSpeaksModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.mdspeak.model.impl.MdSpeaksImpl")
@ProviderType
public interface MdSpeaks extends MdSpeaksModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.mdspeak.model.impl.MdSpeaksImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MdSpeaks, Long> ID_ACCESSOR = new Accessor<MdSpeaks, Long>() {
			@Override
			public Long get(MdSpeaks mdSpeaks) {
				return mdSpeaks.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<MdSpeaks> getTypeClass() {
				return MdSpeaks.class;
			}
		};
}