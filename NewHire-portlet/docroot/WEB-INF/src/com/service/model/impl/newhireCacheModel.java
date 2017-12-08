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

package com.service.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.service.model.newhire;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing newhire in entity cache.
 *
 * @author adms.java1
 * @see newhire
 * @generated
 */
@ProviderType
public class newhireCacheModel implements CacheModel<newhire>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof newhireCacheModel)) {
			return false;
		}

		newhireCacheModel newhireCacheModel = (newhireCacheModel)obj;

		if (newhire_id == newhireCacheModel.newhire_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newhire_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{newhire_id=");
		sb.append(newhire_id);
		sb.append(", newhire_name=");
		sb.append(newhire_name);
		sb.append(", newhire_designation=");
		sb.append(newhire_designation);
		sb.append(", newhire_profileimage=");
		sb.append(newhire_profileimage);
		sb.append(", newhire_profileimage_path=");
		sb.append(newhire_profileimage_path);
		sb.append(", newhire_detailedimage=");
		sb.append(newhire_detailedimage);
		sb.append(", newhire_detailedimage_path=");
		sb.append(newhire_detailedimage_path);
		sb.append(", newhire_createdate=");
		sb.append(newhire_createdate);
		sb.append(", newhire_modifieddate=");
		sb.append(newhire_modifieddate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public newhire toEntityModel() {
		newhireImpl newhireImpl = new newhireImpl();

		newhireImpl.setNewhire_id(newhire_id);

		if (newhire_name == null) {
			newhireImpl.setNewhire_name(StringPool.BLANK);
		}
		else {
			newhireImpl.setNewhire_name(newhire_name);
		}

		if (newhire_designation == null) {
			newhireImpl.setNewhire_designation(StringPool.BLANK);
		}
		else {
			newhireImpl.setNewhire_designation(newhire_designation);
		}

		if (newhire_profileimage == null) {
			newhireImpl.setNewhire_profileimage(StringPool.BLANK);
		}
		else {
			newhireImpl.setNewhire_profileimage(newhire_profileimage);
		}

		if (newhire_profileimage_path == null) {
			newhireImpl.setNewhire_profileimage_path(StringPool.BLANK);
		}
		else {
			newhireImpl.setNewhire_profileimage_path(newhire_profileimage_path);
		}

		if (newhire_detailedimage == null) {
			newhireImpl.setNewhire_detailedimage(StringPool.BLANK);
		}
		else {
			newhireImpl.setNewhire_detailedimage(newhire_detailedimage);
		}

		if (newhire_detailedimage_path == null) {
			newhireImpl.setNewhire_detailedimage_path(StringPool.BLANK);
		}
		else {
			newhireImpl.setNewhire_detailedimage_path(newhire_detailedimage_path);
		}

		if (newhire_createdate == Long.MIN_VALUE) {
			newhireImpl.setNewhire_createdate(null);
		}
		else {
			newhireImpl.setNewhire_createdate(new Date(newhire_createdate));
		}

		if (newhire_modifieddate == Long.MIN_VALUE) {
			newhireImpl.setNewhire_modifieddate(null);
		}
		else {
			newhireImpl.setNewhire_modifieddate(new Date(newhire_modifieddate));
		}

		newhireImpl.resetOriginalValues();

		return newhireImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		newhire_id = objectInput.readLong();
		newhire_name = objectInput.readUTF();
		newhire_designation = objectInput.readUTF();
		newhire_profileimage = objectInput.readUTF();
		newhire_profileimage_path = objectInput.readUTF();
		newhire_detailedimage = objectInput.readUTF();
		newhire_detailedimage_path = objectInput.readUTF();
		newhire_createdate = objectInput.readLong();
		newhire_modifieddate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(newhire_id);

		if (newhire_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newhire_name);
		}

		if (newhire_designation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newhire_designation);
		}

		if (newhire_profileimage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newhire_profileimage);
		}

		if (newhire_profileimage_path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newhire_profileimage_path);
		}

		if (newhire_detailedimage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newhire_detailedimage);
		}

		if (newhire_detailedimage_path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newhire_detailedimage_path);
		}

		objectOutput.writeLong(newhire_createdate);
		objectOutput.writeLong(newhire_modifieddate);
	}

	public long newhire_id;
	public String newhire_name;
	public String newhire_designation;
	public String newhire_profileimage;
	public String newhire_profileimage_path;
	public String newhire_detailedimage;
	public String newhire_detailedimage_path;
	public long newhire_createdate;
	public long newhire_modifieddate;
}