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

import com.model.cholatalkiespath;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing cholatalkiespath in entity cache.
 *
 * @author adms.java1
 * @see cholatalkiespath
 * @generated
 */
@ProviderType
public class cholatalkiespathCacheModel implements CacheModel<cholatalkiespath>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cholatalkiespathCacheModel)) {
			return false;
		}

		cholatalkiespathCacheModel cholatalkiespathCacheModel = (cholatalkiespathCacheModel)obj;

		if (id == cholatalkiespathCacheModel.id) {
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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", cholatalkiesdetaild_id=");
		sb.append(cholatalkiesdetaild_id);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", VideoPath=");
		sb.append(VideoPath);
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
	public cholatalkiespath toEntityModel() {
		cholatalkiespathImpl cholatalkiespathImpl = new cholatalkiespathImpl();

		cholatalkiespathImpl.setId(id);

		if (cholatalkiesdetaild_id == null) {
			cholatalkiespathImpl.setCholatalkiesdetaild_id(StringPool.BLANK);
		}
		else {
			cholatalkiespathImpl.setCholatalkiesdetaild_id(cholatalkiesdetaild_id);
		}

		cholatalkiespathImpl.setContent_id(content_id);

		if (VideoPath == null) {
			cholatalkiespathImpl.setVideoPath(StringPool.BLANK);
		}
		else {
			cholatalkiespathImpl.setVideoPath(VideoPath);
		}

		if (videoTitle == null) {
			cholatalkiespathImpl.setVideoTitle(StringPool.BLANK);
		}
		else {
			cholatalkiespathImpl.setVideoTitle(videoTitle);
		}

		if (videoDesc == null) {
			cholatalkiespathImpl.setVideoDesc(StringPool.BLANK);
		}
		else {
			cholatalkiespathImpl.setVideoDesc(videoDesc);
		}

		if (createdDate == Long.MIN_VALUE) {
			cholatalkiespathImpl.setCreatedDate(null);
		}
		else {
			cholatalkiespathImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			cholatalkiespathImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			cholatalkiespathImpl.setCreatedBy(createdBy);
		}

		if (updatedDate == Long.MIN_VALUE) {
			cholatalkiespathImpl.setUpdatedDate(null);
		}
		else {
			cholatalkiespathImpl.setUpdatedDate(new Date(updatedDate));
		}

		if (updatedBy == null) {
			cholatalkiespathImpl.setUpdatedBy(StringPool.BLANK);
		}
		else {
			cholatalkiespathImpl.setUpdatedBy(updatedBy);
		}

		if (flag == null) {
			cholatalkiespathImpl.setFlag(StringPool.BLANK);
		}
		else {
			cholatalkiespathImpl.setFlag(flag);
		}

		cholatalkiespathImpl.resetOriginalValues();

		return cholatalkiespathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		cholatalkiesdetaild_id = objectInput.readUTF();

		content_id = objectInput.readLong();
		VideoPath = objectInput.readUTF();
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

		if (cholatalkiesdetaild_id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cholatalkiesdetaild_id);
		}

		objectOutput.writeLong(content_id);

		if (VideoPath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(VideoPath);
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
	public String cholatalkiesdetaild_id;
	public long content_id;
	public String VideoPath;
	public String videoTitle;
	public String videoDesc;
	public long createdDate;
	public String createdBy;
	public long updatedDate;
	public String updatedBy;
	public String flag;
}