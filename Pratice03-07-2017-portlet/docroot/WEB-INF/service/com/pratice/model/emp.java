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

package com.pratice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the emp service. Represents a row in the &quot;pratice_emp&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see empModel
 * @see com.pratice.model.impl.empImpl
 * @see com.pratice.model.impl.empModelImpl
 * @generated
 */
@ImplementationClassName("com.pratice.model.impl.empImpl")
@ProviderType
public interface emp extends empModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.pratice.model.impl.empImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<emp, Long> EMP_ID_ACCESSOR = new Accessor<emp, Long>() {
			@Override
			public Long get(emp emp) {
				return emp.getEmpId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<emp> getTypeClass() {
				return emp.class;
			}
		};
}