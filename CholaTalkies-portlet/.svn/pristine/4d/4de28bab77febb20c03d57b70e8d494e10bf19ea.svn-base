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

package com.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.model.cholatalkies;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing cholatalkies in entity cache.
 *
 * @author adms.java1
 * @see cholatalkies
 * @generated
 */
@ProviderType
public class cholatalkiesCacheModel implements CacheModel<cholatalkies>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cholatalkiesCacheModel)) {
			return false;
		}

		cholatalkiesCacheModel cholatalkiesCacheModel = (cholatalkiesCacheModel)obj;

		if (id == cholatalkiesCacheModel.id) {
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
		sb.append(", videoName=");
		sb.append(videoName);
		sb.append(", videoDesc=");
		sb.append(videoDesc);
		sb.append(", videoId=");
		sb.append(videoId);
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
	public cholatalkies toEntityModel() {
		cholatalkiesImpl cholatalkiesImpl = new cholatalkiesImpl();

		cholatalkiesImpl.setId(id);
		cholatalkiesImpl.setContent_id(content_id);

		if (videoName == null) {
			cholatalkiesImpl.setVideoName(StringPool.BLANK);
		}
		else {
			cholatalkiesImpl.setVideoName(videoName);
		}

		if (videoDesc == null) {
			cholatalkiesImpl.setVideoDesc(StringPool.BLANK);
		}
		else {
			cholatalkiesImpl.setVideoDesc(videoDesc);
		}

		if (videoId == null) {
			cholatalkiesImpl.setVideoId(StringPool.BLANK);
		}
		else {
			cholatalkiesImpl.setVideoId(videoId);
		}

		if (createdDate == Long.MIN_VALUE) {
			cholatalkiesImpl.setCreatedDate(null);
		}
		else {
			cholatalkiesImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			cholatalkiesImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			cholatalkiesImpl.setCreatedBy(createdBy);
		}

		if (flag == null) {
			cholatalkiesImpl.setFlag(StringPool.BLANK);
		}
		else {
			cholatalkiesImpl.setFlag(flag);
		}

		cholatalkiesImpl.resetOriginalValues();

		return cholatalkiesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		videoName = objectInput.readUTF();
		videoDesc = objectInput.readUTF();
		videoId = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		flag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

		if (videoName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(videoName);
		}

		if (videoDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(videoDesc);
		}

		if (videoId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(videoId);
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
	public String videoName;
	public String videoDesc;
	public String videoId;
	public long createdDate;
	public String createdBy;
	public String flag;
}