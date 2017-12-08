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

package com.chola.swagatam.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.model.swagatamdata;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing swagatamdata in entity cache.
 *
 * @author CloverLiferay02
 * @see swagatamdata
 * @generated
 */
@ProviderType
public class swagatamdataCacheModel implements CacheModel<swagatamdata>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof swagatamdataCacheModel)) {
			return false;
		}

		swagatamdataCacheModel swagatamdataCacheModel = (swagatamdataCacheModel)obj;

		if (id == swagatamdataCacheModel.id) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", empId=");
		sb.append(empId);
		sb.append(", watched=");
		sb.append(watched);
		sb.append(", acknowledged=");
		sb.append(acknowledged);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public swagatamdata toEntityModel() {
		swagatamdataImpl swagatamdataImpl = new swagatamdataImpl();

		swagatamdataImpl.setId(id);

		if (empId == null) {
			swagatamdataImpl.setEmpId(StringPool.BLANK);
		}
		else {
			swagatamdataImpl.setEmpId(empId);
		}

		if (watched == null) {
			swagatamdataImpl.setWatched(StringPool.BLANK);
		}
		else {
			swagatamdataImpl.setWatched(watched);
		}

		if (acknowledged == null) {
			swagatamdataImpl.setAcknowledged(StringPool.BLANK);
		}
		else {
			swagatamdataImpl.setAcknowledged(acknowledged);
		}

		swagatamdataImpl.resetOriginalValues();

		return swagatamdataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		empId = objectInput.readUTF();
		watched = objectInput.readUTF();
		acknowledged = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (empId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empId);
		}

		if (watched == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(watched);
		}

		if (acknowledged == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(acknowledged);
		}
	}

	public long id;
	public String empId;
	public String watched;
	public String acknowledged;
}