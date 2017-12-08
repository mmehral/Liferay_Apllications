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

package com.chola.feedforward.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.feedforward.model.feedforwardgallery;

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
 * The cache model class for representing feedforwardgallery in entity cache.
 *
 * @author CloverLiferay02
 * @see feedforwardgallery
 * @generated
 */
@ProviderType
public class feedforwardgalleryCacheModel implements CacheModel<feedforwardgallery>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof feedforwardgalleryCacheModel)) {
			return false;
		}

		feedforwardgalleryCacheModel feedforwardgalleryCacheModel = (feedforwardgalleryCacheModel)obj;

		if (id == feedforwardgalleryCacheModel.id) {
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
	public feedforwardgallery toEntityModel() {
		feedforwardgalleryImpl feedforwardgalleryImpl = new feedforwardgalleryImpl();

		feedforwardgalleryImpl.setId(id);

		if (albumName == null) {
			feedforwardgalleryImpl.setAlbumName(StringPool.BLANK);
		}
		else {
			feedforwardgalleryImpl.setAlbumName(albumName);
		}

		if (albumDesc == null) {
			feedforwardgalleryImpl.setAlbumDesc(StringPool.BLANK);
		}
		else {
			feedforwardgalleryImpl.setAlbumDesc(albumDesc);
		}

		if (albumId == null) {
			feedforwardgalleryImpl.setAlbumId(StringPool.BLANK);
		}
		else {
			feedforwardgalleryImpl.setAlbumId(albumId);
		}

		if (createdDate == Long.MIN_VALUE) {
			feedforwardgalleryImpl.setCreatedDate(null);
		}
		else {
			feedforwardgalleryImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			feedforwardgalleryImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			feedforwardgalleryImpl.setCreatedBy(createdBy);
		}

		if (updatedDate == Long.MIN_VALUE) {
			feedforwardgalleryImpl.setUpdatedDate(null);
		}
		else {
			feedforwardgalleryImpl.setUpdatedDate(new Date(updatedDate));
		}

		if (updatedBy == null) {
			feedforwardgalleryImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			feedforwardgalleryImpl.setUpdatedBy(updatedBy);
		}

		if (flag == null) {
			feedforwardgalleryImpl.setFlag(StringPool.BLANK);
		}
		else {
			feedforwardgalleryImpl.setFlag(flag);
		}

		feedforwardgalleryImpl.setContent_id(content_id);

		feedforwardgalleryImpl.resetOriginalValues();

		return feedforwardgalleryImpl;
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