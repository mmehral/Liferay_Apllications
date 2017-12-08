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

package com.chola.conferenceroombooking.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.model.floorwing;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing floorwing in entity cache.
 *
 * @author adms.java1
 * @see floorwing
 * @generated
 */
@ProviderType
public class floorwingCacheModel implements CacheModel<floorwing>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof floorwingCacheModel)) {
			return false;
		}

		floorwingCacheModel floorwingCacheModel = (floorwingCacheModel)obj;

		if (floorwing_id == floorwingCacheModel.floorwing_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, floorwing_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{floorwing_id=");
		sb.append(floorwing_id);
		sb.append(", state_id=");
		sb.append(state_id);
		sb.append(", location_id=");
		sb.append(location_id);
		sb.append(", floor_name=");
		sb.append(floor_name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public floorwing toEntityModel() {
		floorwingImpl floorwingImpl = new floorwingImpl();

		floorwingImpl.setFloorwing_id(floorwing_id);
		floorwingImpl.setState_id(state_id);
		floorwingImpl.setLocation_id(location_id);

		if (floor_name == null) {
			floorwingImpl.setFloor_name(StringPool.BLANK);
		}
		else {
			floorwingImpl.setFloor_name(floor_name);
		}

		floorwingImpl.resetOriginalValues();

		return floorwingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		floorwing_id = objectInput.readLong();

		state_id = objectInput.readLong();

		location_id = objectInput.readLong();
		floor_name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(floorwing_id);

		objectOutput.writeLong(state_id);

		objectOutput.writeLong(location_id);

		if (floor_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(floor_name);
		}
	}

	public long floorwing_id;
	public long state_id;
	public long location_id;
	public String floor_name;
}