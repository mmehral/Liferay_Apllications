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

import com.chola.swagatam.model.swagatampath;

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
 * The cache model class for representing swagatampath in entity cache.
 *
 * @author CloverLiferay02
 * @see swagatampath
 * @generated
 */
@ProviderType
public class swagatampathCacheModel implements CacheModel<swagatampath>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof swagatampathCacheModel)) {
			return false;
		}

		swagatampathCacheModel swagatampathCacheModel = (swagatampathCacheModel)obj;

		if (id == swagatampathCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", inductionid=");
		sb.append(inductionid);
		sb.append(", videoPath=");
		sb.append(videoPath);
		sb.append(", videoTitle=");
		sb.append(videoTitle);
		sb.append(", videoDesc=");
		sb.append(videoDesc);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updatedDate=");
		sb.append(updatedDate);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append(", flag=");
		sb.append(flag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public swagatampath toEntityModel() {
		swagatampathImpl swagatampathImpl = new swagatampathImpl();

		swagatampathImpl.setId(id);

		if (inductionid == null) {
			swagatampathImpl.setInductionid(StringPool.BLANK);
		}
		else {
			swagatampathImpl.setInductionid(inductionid);
		}

		if (videoPath == null) {
			swagatampathImpl.setVideoPath(StringPool.BLANK);
		}
		else {
			swagatampathImpl.setVideoPath(videoPath);
		}

		if (videoTitle == null) {
			swagatampathImpl.setVideoTitle(StringPool.BLANK);
		}
		else {
			swagatampathImpl.setVideoTitle(videoTitle);
		}

		if (videoDesc == null) {
			swagatampathImpl.setVideoDesc(StringPool.BLANK);
		}
		else {
			swagatampathImpl.setVideoDesc(videoDesc);
		}

		if (createdDate == Long.MIN_VALUE) {
			swagatampathImpl.setCreatedDate(null);
		}
		else {
			swagatampathImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			swagatampathImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			swagatampathImpl.setCreatedBy(createdBy);
		}

		if (updatedDate == Long.MIN_VALUE) {
			swagatampathImpl.setUpdatedDate(null);
		}
		else {
			swagatampathImpl.setUpdatedDate(new Date(updatedDate));
		}

		if (updatedBy == null) {
			swagatampathImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			swagatampathImpl.setUpdatedBy(updatedBy);
		}

		if (flag == null) {
			swagatampathImpl.setFlag(StringPool.BLANK);
		}
		else {
			swagatampathImpl.setFlag(flag);
		}

		swagatampathImpl.resetOriginalValues();

		return swagatampathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		inductionid = objectInput.readUTF();
		videoPath = objectInput.readUTF();
		videoTitle = objectInput.readUTF();
		videoDesc = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		updatedDate = objectInput.readLong();
		updatedBy = objectInput.readUTF();
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

		if (videoPath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(videoPath);
		}

		if (videoTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(videoTitle);
		}

		if (videoDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(videoDesc);
		}

		objectOutput.writeLong(createdDate);

		if (createdBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdBy);
		}

		objectOutput.writeLong(updatedDate);

		if (updatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(updatedBy);
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
	public String videoPath;
	public String videoTitle;
	public String videoDesc;
	public long createdDate;
	public String createdBy;
	public long updatedDate;
	public String updatedBy;
	public String flag;
}