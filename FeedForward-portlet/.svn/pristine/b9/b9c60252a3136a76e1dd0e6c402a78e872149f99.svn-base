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

import com.chola.feedforward.model.feedforwardgallerypath;

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
 * The cache model class for representing feedforwardgallerypath in entity cache.
 *
 * @author CloverLiferay02
 * @see feedforwardgallerypath
 * @generated
 */
@ProviderType
public class feedforwardgallerypathCacheModel implements CacheModel<feedforwardgallerypath>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof feedforwardgallerypathCacheModel)) {
			return false;
		}

		feedforwardgallerypathCacheModel feedforwardgallerypathCacheModel = (feedforwardgallerypathCacheModel)obj;

		if (id == feedforwardgallerypathCacheModel.id) {
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
	public feedforwardgallerypath toEntityModel() {
		feedforwardgallerypathImpl feedforwardgallerypathImpl = new feedforwardgallerypathImpl();

		feedforwardgallerypathImpl.setId(id);

		if (albumId == null) {
			feedforwardgallerypathImpl.setAlbumId(StringPool.BLANK);
		}
		else {
			feedforwardgallerypathImpl.setAlbumId(albumId);
		}

		if (albumImagePath == null) {
			feedforwardgallerypathImpl.setAlbumImagePath(StringPool.BLANK);
		}
		else {
			feedforwardgallerypathImpl.setAlbumImagePath(albumImagePath);
		}

		if (imageTitle == null) {
			feedforwardgallerypathImpl.setImageTitle(StringPool.BLANK);
		}
		else {
			feedforwardgallerypathImpl.setImageTitle(imageTitle);
		}

		if (createdDate == Long.MIN_VALUE) {
			feedforwardgallerypathImpl.setCreatedDate(null);
		}
		else {
			feedforwardgallerypathImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			feedforwardgallerypathImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			feedforwardgallerypathImpl.setCreatedBy(createdBy);
		}

		if (updatedDate == Long.MIN_VALUE) {
			feedforwardgallerypathImpl.setUpdatedDate(null);
		}
		else {
			feedforwardgallerypathImpl.setUpdatedDate(new Date(updatedDate));
		}

		if (updatedBy == null) {
			feedforwardgallerypathImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			feedforwardgallerypathImpl.setUpdatedBy(updatedBy);
		}

		if (flag == null) {
			feedforwardgallerypathImpl.setFlag(StringPool.BLANK);
		}
		else {
			feedforwardgallerypathImpl.setFlag(flag);
		}

		feedforwardgallerypathImpl.setContent_id(content_id);

		feedforwardgallerypathImpl.resetOriginalValues();

		return feedforwardgallerypathImpl;
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