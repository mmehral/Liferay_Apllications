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

package com.chola.knowledgebites.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.knowledgebites.model.kbusers;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing kbusers in entity cache.
 *
 * @author cloverliferay01
 * @see kbusers
 * @generated
 */
@ProviderType
public class kbusersCacheModel implements CacheModel<kbusers>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof kbusersCacheModel)) {
			return false;
		}

		kbusersCacheModel kbusersCacheModel = (kbusersCacheModel)obj;

		if (id == kbusersCacheModel.id) {
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
		sb.append(", kbdetails_id=");
		sb.append(kbdetails_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public kbusers toEntityModel() {
		kbusersImpl kbusersImpl = new kbusersImpl();

		kbusersImpl.setId(id);
		kbusersImpl.setUser_id(user_id);
		kbusersImpl.setKbdetails_id(kbdetails_id);

		kbusersImpl.resetOriginalValues();

		return kbusersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		user_id = objectInput.readLong();

		kbdetails_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(user_id);

		objectOutput.writeLong(kbdetails_id);
	}

	public long id;
	public long user_id;
	public long kbdetails_id;
}