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

package com.chola.notificationcategorization.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the NoticationCategoryCount service. Represents a row in the &quot;notify_NoticationCategoryCount&quot; database table, with each column mapped to a property of this class.
 *
 * @author cloverliferay03
 * @see NoticationCategoryCountModel
 * @see com.chola.notificationcategorization.model.impl.NoticationCategoryCountImpl
 * @see com.chola.notificationcategorization.model.impl.NoticationCategoryCountModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.notificationcategorization.model.impl.NoticationCategoryCountImpl")
@ProviderType
public interface NoticationCategoryCount extends NoticationCategoryCountModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.notificationcategorization.model.impl.NoticationCategoryCountImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NoticationCategoryCount, Long> EVENT_ID_ACCESSOR =
		new Accessor<NoticationCategoryCount, Long>() {
			@Override
			public Long get(NoticationCategoryCount noticationCategoryCount) {
				return noticationCategoryCount.getEventId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<NoticationCategoryCount> getTypeClass() {
				return NoticationCategoryCount.class;
			}
		};
}