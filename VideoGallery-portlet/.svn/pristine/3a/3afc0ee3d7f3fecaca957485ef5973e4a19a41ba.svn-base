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

package com.chola.videogallery.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.videogallery.model.videogallerypath;

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
 * The cache model class for representing videogallerypath in entity cache.
 *
 * @author CloverLiferay02
 * @see videogallerypath
 * @generated
 */
@ProviderType
public class videogallerypathCacheModel implements CacheModel<videogallerypath>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof videogallerypathCacheModel)) {
			return false;
		}

		videogallerypathCacheModel videogallerypathCacheModel = (videogallerypathCacheModel)obj;

		if (id == videogallerypathCacheModel.id) {
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
		sb.append(", albumVideoPath=");
		sb.append(albumVideoPath);
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
	public videogallerypath toEntityModel() {
		videogallerypathImpl videogallerypathImpl = new videogallerypathImpl();

		videogallerypathImpl.setId(id);

		if (albumId == null) {
			videogallerypathImpl.setAlbumId(StringPool.BLANK);
		}
		else {
			videogallerypathImpl.setAlbumId(albumId);
		}

		videogallerypathImpl.setContent_id(content_id);

		if (albumVideoPath == null) {
			videogallerypathImpl.setAlbumVideoPath(StringPool.BLANK);
		}
		else {
			videogallerypathImpl.setAlbumVideoPath(albumVideoPath);
		}

		if (createdDate == Long.MIN_VALUE) {
			videogallerypathImpl.setCreatedDate(null);
		}
		else {
			videogallerypathImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			videogallerypathImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			videogallerypathImpl.setCreatedBy(createdBy);
		}

		if (updatedDate == Long.MIN_VALUE) {
			videogallerypathImpl.setUpdatedDate(null);
		}
		else {
			videogallerypathImpl.setUpdatedDate(new Date(updatedDate));
		}

		if (updatedBy == null) {
			videogallerypathImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			videogallerypathImpl.setUpdatedBy(updatedBy);
		}

		if (flag == null) {
			videogallerypathImpl.setFlag(StringPool.BLANK);
		}
		else {
			videogallerypathImpl.setFlag(flag);
		}

		videogallerypathImpl.resetOriginalValues();

		return videogallerypathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		albumId = objectInput.readUTF();

		content_id = objectInput.readLong();
		albumVideoPath = objectInput.readUTF();
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

		if (albumVideoPath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(albumVideoPath);
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
	public String albumVideoPath;
	public long createdDate;
	public String createdBy;
	public long updatedDate;
	public String updatedBy;
	public String flag;
}