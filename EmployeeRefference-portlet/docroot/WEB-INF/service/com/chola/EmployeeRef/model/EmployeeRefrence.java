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

package com.chola.EmployeeRef.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the EmployeeRefrence service. Represents a row in the &quot;emp_EmployeeRefrence&quot; database table, with each column mapped to a property of this class.
 *
 * @author CloverLiferay03
 * @see EmployeeRefrenceModel
 * @see com.chola.EmployeeRef.model.impl.EmployeeRefrenceImpl
 * @see com.chola.EmployeeRef.model.impl.EmployeeRefrenceModelImpl
 * @generated
 */
@ImplementationClassName("com.chola.EmployeeRef.model.impl.EmployeeRefrenceImpl")
@ProviderType
public interface EmployeeRefrence extends EmployeeRefrenceModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.chola.EmployeeRef.model.impl.EmployeeRefrenceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<EmployeeRefrence, Long> REF_ID_ACCESSOR = new Accessor<EmployeeRefrence, Long>() {
			@Override
			public Long get(EmployeeRefrence employeeRefrence) {
				return employeeRefrence.getRefId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<EmployeeRefrence> getTypeClass() {
				return EmployeeRefrence.class;
			}
		};
}