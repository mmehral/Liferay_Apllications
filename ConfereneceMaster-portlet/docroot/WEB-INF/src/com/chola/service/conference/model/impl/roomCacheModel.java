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

import com.chola.service.conference.model.room;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing room in entity cache.
 *
 * @author adms.java1
 * @see room
 * @generated
 */
@ProviderType
public class roomCacheModel implements CacheModel<room>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof roomCacheModel)) {
			return false;
		}

		roomCacheModel roomCacheModel = (roomCacheModel)obj;

		if (room_id == roomCacheModel.room_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, room_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{room_id=");
		sb.append(room_id);
		sb.append(", state_id=");
		sb.append(state_id);
		sb.append(", location_id=");
		sb.append(location_id);
		sb.append(", floor_id=");
		sb.append(floor_id);
		sb.append(", room_name=");
		sb.append(room_name);
		sb.append(", room_capacity=");
		sb.append(room_capacity);
		sb.append(", room_extension=");
		sb.append(room_extension);
		sb.append(", room_values=");
		sb.append(room_values);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public room toEntityModel() {
		roomImpl roomImpl = new roomImpl();

		roomImpl.setRoom_id(room_id);
		roomImpl.setState_id(state_id);
		roomImpl.setLocation_id(location_id);
		roomImpl.setFloor_id(floor_id);

		if (room_name == null) {
			roomImpl.setRoom_name(StringPool.BLANK);
		}
		else {
			roomImpl.setRoom_name(room_name);
		}

		roomImpl.setRoom_capacity(room_capacity);
		roomImpl.setRoom_extension(room_extension);

		if (room_values == null) {
			roomImpl.setRoom_values(StringPool.BLANK);
		}
		else {
			roomImpl.setRoom_values(room_values);
		}

		roomImpl.resetOriginalValues();

		return roomImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		room_id = objectInput.readLong();

		state_id = objectInput.readLong();

		location_id = objectInput.readLong();

		floor_id = objectInput.readLong();
		room_name = objectInput.readUTF();

		room_capacity = objectInput.readLong();

		room_extension = objectInput.readLong();
		room_values = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(room_id);

		objectOutput.writeLong(state_id);

		objectOutput.writeLong(location_id);

		objectOutput.writeLong(floor_id);

		if (room_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_name);
		}

		objectOutput.writeLong(room_capacity);

		objectOutput.writeLong(room_extension);

		if (room_values == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(room_values);
		}
	}

	public long room_id;
	public long state_id;
	public long location_id;
	public long floor_id;
	public String room_name;
	public long room_capacity;
	public long room_extension;
	public String room_values;
}