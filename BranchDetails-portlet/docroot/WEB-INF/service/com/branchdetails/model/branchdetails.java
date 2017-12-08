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

package com.branchdetails.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the branchdetails service. Represents a row in the &quot;branch_branchdetails&quot; database table, with each column mapped to a property of this class.
 *
 * @author adms.java1
 * @see branchdetailsModel
 * @see com.branchdetails.model.impl.branchdetailsImpl
 * @see com.branchdetails.model.impl.branchdetailsModelImpl
 * @generated
 */
@ImplementationClassName("com.branchdetails.model.impl.branchdetailsImpl")
@ProviderType
public interface branchdetails extends branchdetailsModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.branchdetails.model.impl.branchdetailsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<branchdetails, Long> BRANCH_ID_ACCESSOR = new Accessor<branchdetails, Long>() {
			@Override
			public Long get(branchdetails branchdetails) {
				return branchdetails.getBranch_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<branchdetails> getTypeClass() {
				return branchdetails.class;
			}
		};
}