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

package com.chola.imagegallery.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.imagegallery.model.imagegallerypath;

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
 * The cache model class for representing imagegallerypath in entity cache.
 *
 * @author CloverLiferay02
 * @see imagegallerypath
 * @generated
 */
@ProviderType
public class imagegallerypathCacheModel implements CacheModel<imagegallerypath>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof imagegallerypathCacheModel)) {
			return false;
		}

		imagegallerypathCacheModel imagegallerypathCacheModel = (imagegallerypathCacheModel)obj;

		if (id == imagegallerypathCacheModel.id) {
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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", albumId=");
		sb.append(albumId);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", albumImagePath=");
		sb.append(albumImagePath);
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
	public imagegallerypath toEntityModel() {
		imagegallerypathImpl imagegallerypathImpl = new imagegallerypathImpl();

		imagegallerypathImpl.setId(id);

		if (albumId == null) {
			imagegallerypathImpl.setAlbumId(StringPool.BLANK);
		}
		else {
			imagegallerypathImpl.setAlbumId(albumId);
		}

		imagegallerypathImpl.setContent_id(content_id);

		if (albumImagePath == null) {
			imagegallerypathImpl.setAlbumImagePath(StringPool.BLANK);
		}
		else {
			imagegallerypathImpl.setAlbumImagePath(albumImagePath);
		}

		if (createdDate == Long.MIN_VALUE) {
			imagegallerypathImpl.setCreatedDate(null);
		}
		else {
			imagegallerypathImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			imagegallerypathImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			imagegallerypathImpl.setCreatedBy(createdBy);
		}

		if (updatedDate == Long.MIN_VALUE) {
			imagegallerypathImpl.setUpdatedDate(null);
		}
		else {
			imagegallerypathImpl.setUpdatedDate(new Date(updatedDate));
		}

		if (updatedBy == null) {
			imagegallerypathImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			imagegallerypathImpl.setUpdatedBy(updatedBy);
		}

		if (flag == null) {
			imagegallerypathImpl.setFlag(StringPool.BLANK);
		}
		else {
			imagegallerypathImpl.setFlag(flag);
		}

		imagegallerypathImpl.resetOriginalValues();

		return imagegallerypathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		albumId = objectInput.readUTF();

		content_id = objectInput.readLong();
		albumImagePath = objectInput.readUTF();
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

		if (albumId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(albumId);
		}

		objectOutput.writeLong(content_id);

		if (albumImagePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(albumImagePath);
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
	public String albumId;
	public long content_id;
	public String albumImagePath;
	public long createdDate;
	public String createdBy;
	public long updatedDate;
	public String updatedBy;
	public String flag;
}