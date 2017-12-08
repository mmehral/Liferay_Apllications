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

package com.chola.successstories.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.model.ssusers;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ssusers in entity cache.
 *
 * @author cloverliferay01
 * @see ssusers
 * @generated
 */
@ProviderType
public class ssusersCacheModel implements CacheModel<ssusers>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ssusersCacheModel)) {
			return false;
		}

		ssusersCacheModel ssusersCacheModel = (ssusersCacheModel)obj;

		if (id == ssusersCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append(", ssdetails_id=");
		sb.append(ssdetails_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ssusers toEntityModel() {
		ssusersImpl ssusersImpl = new ssusersImpl();

		ssusersImpl.setId(id);
		ssusersImpl.setUser_id(user_id);
		ssusersImpl.setSsdetails_id(ssdetails_id);

		ssusersImpl.resetOriginalValues();

		return ssusersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		user_id = objectInput.readLong();

		ssdetails_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(user_id);

		objectOutput.writeLong(ssdetails_id);
	}

	public long id;
	public long user_id;
	public long ssdetails_id;
}