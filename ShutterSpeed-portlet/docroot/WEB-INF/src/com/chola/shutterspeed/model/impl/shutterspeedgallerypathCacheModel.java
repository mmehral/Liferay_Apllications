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

import com.chola.shutterspeed.model.shutterspeedgallerypath;

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
 * The cache model class for representing shutterspeedgallerypath in entity cache.
 *
 * @author CloverLiferay02
 * @see shutterspeedgallerypath
 * @generated
 */
@ProviderType
public class shutterspeedgallerypathCacheModel implements CacheModel<shutterspeedgallerypath>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof shutterspeedgallerypathCacheModel)) {
			return false;
		}

		shutterspeedgallerypathCacheModel shutterspeedgallerypathCacheModel = (shutterspeedgallerypathCacheModel)obj;

		if (id == shutterspeedgallerypathCacheModel.id) {
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
		sb.append(", albumId=");
		sb.append(albumId);
		sb.append(", albumImagePath=");
		sb.append(albumImagePath);
		sb.append(", imageTitle=");
		sb.append(imageTitle);
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
	public shutterspeedgallerypath toEntityModel() {
		shutterspeedgallerypathImpl shutterspeedgallerypathImpl = new shutterspeedgallerypathImpl();

		shutterspeedgallerypathImpl.setId(id);

		if (albumId == null) {
			shutterspeedgallerypathImpl.setAlbumId(StringPool.BLANK);
		}
		else {
			shutterspeedgallerypathImpl.setAlbumId(albumId);
		}

		if (albumImagePath == null) {
			shutterspeedgallerypathImpl.setAlbumImagePath(StringPool.BLANK);
		}
		else {
			shutterspeedgallerypathImpl.setAlbumImagePath(albumImagePath);
		}

		if (imageTitle == null) {
			shutterspeedgallerypathImpl.setImageTitle(StringPool.BLANK);
		}
		else {
			shutterspeedgallerypathImpl.setImageTitle(imageTitle);
		}

		if (createdDate == Long.MIN_VALUE) {
			shutterspeedgallerypathImpl.setCreatedDate(null);
		}
		else {
			shutterspeedgallerypathImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			shutterspeedgallerypathImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			shutterspeedgallerypathImpl.setCreatedBy(createdBy);
		}

		if (updatedDate == Long.MIN_VALUE) {
			shutterspeedgallerypathImpl.setUpdatedDate(null);
		}
		else {
			shutterspeedgallerypathImpl.setUpdatedDate(new Date(updatedDate));
		}

		if (updatedBy == null) {
			shutterspeedgallerypathImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			shutterspeedgallerypathImpl.setUpdatedBy(updatedBy);
		}

		if (flag == null) {
			shutterspeedgallerypathImpl.setFlag(StringPool.BLANK);
		}
		else {
			shutterspeedgallerypathImpl.setFlag(flag);
		}

		shutterspeedgallerypathImpl.setContent_id(content_id);

		shutterspeedgallerypathImpl.resetOriginalValues();

		return shutterspeedgallerypathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		albumId = objectInput.readUTF();
		albumImagePath = objectInput.readUTF();
		imageTitle = objectInput.readUTF();
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

		if (albumId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(albumId);
		}

		if (albumImagePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(albumImagePath);
		}

		if (imageTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imageTitle);
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
	public String albumId;
	public String albumImagePath;
	public String imageTitle;
	public long createdDate;
	public String createdBy;
	public long updatedDate;
	public String updatedBy;
	public String flag;
	public long content_id;
}