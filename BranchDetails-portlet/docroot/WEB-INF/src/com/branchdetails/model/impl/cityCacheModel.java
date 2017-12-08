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

import com.branchdetails.model.city;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing city in entity cache.
 *
 * @author adms.java1
 * @see city
 * @generated
 */
@ProviderType
public class cityCacheModel implements CacheModel<city>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cityCacheModel)) {
			return false;
		}

		cityCacheModel cityCacheModel = (cityCacheModel)obj;

		if (city_id == cityCacheModel.city_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, city_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{city_id=");
		sb.append(city_id);
		sb.append(", city_name=");
		sb.append(city_name);
		sb.append(", state_id=");
		sb.append(state_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public city toEntityModel() {
		cityImpl cityImpl = new cityImpl();

		cityImpl.setCity_id(city_id);

		if (city_name == null) {
			cityImpl.setCity_name(StringPool.BLANK);
		}
		else {
			cityImpl.setCity_name(city_name);
		}

		cityImpl.setState_id(state_id);

		cityImpl.resetOriginalValues();

		return cityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		city_id = objectInput.readLong();
		city_name = objectInput.readUTF();

		state_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(city_id);

		if (city_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city_name);
		}

		objectOutput.writeLong(state_id);
	}

	public long city_id;
	public String city_name;
	public long state_id;
}