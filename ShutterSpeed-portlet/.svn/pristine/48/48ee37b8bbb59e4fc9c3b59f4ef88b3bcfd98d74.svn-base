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

package com.chola.shutterspeed.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.shutterspeed.model.shutterspeedgallery;

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
 * The cache model class for representing shutterspeedgallery in entity cache.
 *
 * @author CloverLiferay02
 * @see shutterspeedgallery
 * @generated
 */
@ProviderType
public class shutterspeedgalleryCacheModel implements CacheModel<shutterspeedgallery>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof shutterspeedgalleryCacheModel)) {
			return false;
		}

		shutterspeedgalleryCacheModel shutterspeedgalleryCacheModel = (shutterspeedgalleryCacheModel)obj;

		if (id == shutterspeedgalleryCacheModel.id) {
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
		sb.append(", albumName=");
		sb.append(albumName);
		sb.append(", albumDesc=");
		sb.append(albumDesc);
		sb.append(", albumId=");
		sb.append(albumId);
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
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public shutterspeedgallery toEntityModel() {
		shutterspeedgalleryImpl shutterspeedgalleryImpl = new shutterspeedgalleryImpl();

		shutterspeedgalleryImpl.setId(id);

		if (albumName == null) {
			shutterspeedgalleryImpl.setAlbumName(StringPool.BLANK);
		}
		else {
			shutterspeedgalleryImpl.setAlbumName(albumName);
		}

		if (albumDesc == null) {
			shutterspeedgalleryImpl.setAlbumDesc(StringPool.BLANK);
		}
		else {
			shutterspeedgalleryImpl.setAlbumDesc(albumDesc);
		}

		if (albumId == null) {
			shutterspeedgalleryImpl.setAlbumId(StringPool.BLANK);
		}
		else {
			shutterspeedgalleryImpl.setAlbumId(albumId);
		}

		if (createdDate == Long.MIN_VALUE) {
			shutterspeedgalleryImpl.setCreatedDate(null);
		}
		else {
			shutterspeedgalleryImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			shutterspeedgalleryImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			shutterspeedgalleryImpl.setCreatedBy(createdBy);
		}

		if (updatedDate == Long.MIN_VALUE) {
			shutterspeedgalleryImpl.setUpdatedDate(null);
		}
		else {
			shutterspeedgalleryImpl.setUpdatedDate(new Date(updatedDate));
		}

		if (updatedBy == null) {
			shutterspeedgalleryImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			shutterspeedgalleryImpl.setUpdatedBy(updatedBy);
		}

		if (flag == null) {
			shutterspeedgalleryImpl.setFlag(StringPool.BLANK);
		}
		else {
			shutterspeedgalleryImpl.setFlag(flag);
		}

		shutterspeedgalleryImpl.setContent_id(content_id);

		shutterspeedgalleryImpl.resetOriginalValues();

		return shutterspeedgalleryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		albumName = objectInput.readUTF();
		albumDesc = objectInput.readUTF();
		albumId = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		updatedDate = objectInput.readLong();
		updatedBy = objectInput.readUTF();
		flag = objectInput.readUTF();

		content_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (albumName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(albumName);
		}

		if (albumDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(albumDesc);
		}

		if (albumId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(albumId);
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

		objectOutput.writeLong(content_id);
	}

	public long id;
	public String albumName;
	public String albumDesc;
	public String albumId;
	public long createdDate;
	public String createdBy;
	public long updatedDate;
	public String updatedBy;
	public String flag;
	public long content_id;
}