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

import com.chola.swagatam.model.swagatam;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing swagatam in entity cache.
 *
 * @author CloverLiferay02
 * @see swagatam
 * @generated
 */
@ProviderType
public class swagatamCacheModel implements CacheModel<swagatam>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof swagatamCacheModel)) {
			return false;
		}

		swagatamCacheModel swagatamCacheModel = (swagatamCacheModel)obj;

		if (id == swagatamCacheModel.id) {
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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", inductionid=");
		sb.append(inductionid);
		sb.append(", title=");
		sb.append(title);
		sb.append(", desc=");
		sb.append(desc);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", flag=");
		sb.append(flag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public swagatam toEntityModel() {
		swagatamImpl swagatamImpl = new swagatamImpl();

		swagatamImpl.setId(id);

		if (inductionid == null) {
			swagatamImpl.setInductionid(StringPool.BLANK);
		}
		else {
			swagatamImpl.setInductionid(inductionid);
		}

		if (title == null) {
			swagatamImpl.setTitle(StringPool.BLANK);
		}
		else {
			swagatamImpl.setTitle(title);
		}

		if (desc == null) {
			swagatamImpl.setDesc(StringPool.BLANK);
		}
		else {
			swagatamImpl.setDesc(desc);
		}

		if (createdDate == Long.MIN_VALUE) {
			swagatamImpl.setCreatedDate(null);
		}
		else {
			swagatamImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			swagatamImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			swagatamImpl.setCreatedBy(createdBy);
		}

		if (flag == null) {
			swagatamImpl.setFlag(StringPool.BLANK);
		}
		else {
			swagatamImpl.setFlag(flag);
		}

		swagatamImpl.resetOriginalValues();

		return swagatamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		inductionid = objectInput.readUTF();
		title = objectInput.readUTF();
		desc = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		flag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (inductionid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inductionid);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (desc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(desc);
		}

		objectOutput.writeLong(createdDate);

		if (createdBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdBy);
		}

		if (flag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flag);
		}
	}

	public long id;
	public String inductionid;
	public String title;
	public String desc;
	public long createdDate;
	public String createdBy;
	public String flag;
}