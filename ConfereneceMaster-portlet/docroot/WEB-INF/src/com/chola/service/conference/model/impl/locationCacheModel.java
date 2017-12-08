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

package com.chola.service.conference.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.service.conference.model.location;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing location in entity cache.
 *
 * @author adms.java1
 * @see location
 * @generated
 */
@ProviderType
public class locationCacheModel implements CacheModel<location>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof locationCacheModel)) {
			return false;
		}

		locationCacheModel locationCacheModel = (locationCacheModel)obj;

		if (location_id == locationCacheModel.location_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, location_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{location_id=");
		sb.append(location_id);
		sb.append(", location_name=");
		sb.append(location_name);
		sb.append(", state_id=");
		sb.append(state_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public location toEntityModel() {
		locationImpl locationImpl = new locationImpl();

		locationImpl.setLocation_id(location_id);

		if (location_name == null) {
			locationImpl.setLocation_name(StringPool.BLANK);
		}
		else {
			locationImpl.setLocation_name(location_name);
		}

		locationImpl.setState_id(state_id);

		locationImpl.resetOriginalValues();

		return locationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		location_id = objectInput.readLong();
		location_name = objectInput.readUTF();

		state_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(location_id);

		if (location_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location_name);
		}

		objectOutput.writeLong(state_id);
	}

	public long location_id;
	public String location_name;
	public long state_id;
}