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

package com.service.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the employee service. Represents a row in the &quot;Z_employee&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay02
 * @see employeeModel
 * @see com.service.model.impl.employeeImpl
 * @see com.service.model.impl.employeeModelImpl
 * @generated
 */
@ImplementationClassName("com.service.model.impl.employeeImpl")
@ProviderType
public interface employee extends employeeModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.service.model.impl.employeeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<employee, Long> EMP_ID_ACCESSOR = new Accessor<employee, Long>() {
			@Override
			public Long get(employee employee) {
				return employee.getEmpId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<employee> getTypeClass() {
				return employee.class;
			}
		};
}