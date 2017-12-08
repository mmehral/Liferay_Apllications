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

import com.chola.conferenceroombooking.model.facilitymaster;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing facilitymaster in entity cache.
 *
 * @author adms.java1
 * @see facilitymaster
 * @generated
 */
@ProviderType
public class facilitymasterCacheModel implements CacheModel<facilitymaster>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof facilitymasterCacheModel)) {
			return false;
		}

		facilitymasterCacheModel facilitymasterCacheModel = (facilitymasterCacheModel)obj;

		if (facility_id == facilitymasterCacheModel.facility_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, facility_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{facility_id=");
		sb.append(facility_id);
		sb.append(", facility_name=");
		sb.append(facility_name);
		sb.append(", facility_description=");
		sb.append(facility_description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public facilitymaster toEntityModel() {
		facilitymasterImpl facilitymasterImpl = new facilitymasterImpl();

		facilitymasterImpl.setFacility_id(facility_id);

		if (facility_name == null) {
			facilitymasterImpl.setFacility_name(StringPool.BLANK);
		}
		else {
			facilitymasterImpl.setFacility_name(facility_name);
		}

		if (facility_description == null) {
			facilitymasterImpl.setFacility_description(StringPool.BLANK);
		}
		else {
			facilitymasterImpl.setFacility_description(facility_description);
		}

		facilitymasterImpl.resetOriginalValues();

		return facilitymasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		facility_id = objectInput.readLong();
		facility_name = objectInput.readUTF();
		facility_description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(facility_id);

		if (facility_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(facility_name);
		}

		if (facility_description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(facility_description);
		}
	}

	public long facility_id;
	public String facility_name;
	public String facility_description;
}