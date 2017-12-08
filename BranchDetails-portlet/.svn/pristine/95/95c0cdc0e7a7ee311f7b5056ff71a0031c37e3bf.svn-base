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

package com.branchdetails.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.branchdetails.model.mapping;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing mapping in entity cache.
 *
 * @author adms.java1
 * @see mapping
 * @generated
 */
@ProviderType
public class mappingCacheModel implements CacheModel<mapping>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof mappingCacheModel)) {
			return false;
		}

		mappingCacheModel mappingCacheModel = (mappingCacheModel)obj;

		if (mapping_id == mappingCacheModel.mapping_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, mapping_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{mapping_id=");
		sb.append(mapping_id);
		sb.append(", product_id=");
		sb.append(product_id);
		sb.append(", state_id=");
		sb.append(state_id);
		sb.append(", city_id=");
		sb.append(city_id);
		sb.append(", branch_id=");
		sb.append(branch_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public mapping toEntityModel() {
		mappingImpl mappingImpl = new mappingImpl();

		mappingImpl.setMapping_id(mapping_id);
		mappingImpl.setProduct_id(product_id);
		mappingImpl.setState_id(state_id);
		mappingImpl.setCity_id(city_id);
		mappingImpl.setBranch_id(branch_id);

		mappingImpl.resetOriginalValues();

		return mappingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mapping_id = objectInput.readLong();

		product_id = objectInput.readLong();

		state_id = objectInput.readLong();

		city_id = objectInput.readLong();

		branch_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(mapping_id);

		objectOutput.writeLong(product_id);

		objectOutput.writeLong(state_id);

		objectOutput.writeLong(city_id);

		objectOutput.writeLong(branch_id);
	}

	public long mapping_id;
	public long product_id;
	public long state_id;
	public long city_id;
	public long branch_id;
}