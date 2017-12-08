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

import com.chola.videogallery.model.videogallery;

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
 * The cache model class for representing videogallery in entity cache.
 *
 * @author CloverLiferay02
 * @see videogallery
 * @generated
 */
@ProviderType
public class videogalleryCacheModel implements CacheModel<videogallery>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof videogalleryCacheModel)) {
			return false;
		}

		videogalleryCacheModel videogalleryCacheModel = (videogalleryCacheModel)obj;

		if (id == videogalleryCacheModel.id) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", content_id=");
		sb.append(content_id);
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
		sb.append(", flag=");
		sb.append(flag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public videogallery toEntityModel() {
		videogalleryImpl videogalleryImpl = new videogalleryImpl();

		videogalleryImpl.setId(id);
		videogalleryImpl.setContent_id(content_id);

		if (albumName == null) {
			videogalleryImpl.setAlbumName(StringPool.BLANK);
		}
		else {
			videogalleryImpl.setAlbumName(albumName);
		}

		if (albumDesc == null) {
			videogalleryImpl.setAlbumDesc(StringPool.BLANK);
		}
		else {
			videogalleryImpl.setAlbumDesc(albumDesc);
		}

		if (albumId == null) {
			videogalleryImpl.setAlbumId(StringPool.BLANK);
		}
		else {
			videogalleryImpl.setAlbumId(albumId);
		}

		if (createdDate == Long.MIN_VALUE) {
			videogalleryImpl.setCreatedDate(null);
		}
		else {
			videogalleryImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			videogalleryImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			videogalleryImpl.setCreatedBy(createdBy);
		}

		if (flag == null) {
			videogalleryImpl.setFlag(StringPool.BLANK);
		}
		else {
			videogalleryImpl.setFlag(flag);
		}

		videogalleryImpl.resetOriginalValues();

		return videogalleryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		albumName = objectInput.readUTF();
		albumDesc = objectInput.readUTF();
		albumId = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		flag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

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

		if (flag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flag);
		}
	}

	public long id;
	public long content_id;
	public String albumName;
	public String albumDesc;
	public String albumId;
	public long createdDate;
	public String createdBy;
	public String flag;
}