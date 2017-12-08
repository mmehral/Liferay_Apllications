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

package com.chola.businessmis.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.model.businessmisdetails;

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
 * The cache model class for representing businessmisdetails in entity cache.
 *
 * @author CloverLiferay01
 * @see businessmisdetails
 * @generated
 */
@ProviderType
public class businessmisdetailsCacheModel implements CacheModel<businessmisdetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businessmisdetailsCacheModel)) {
			return false;
		}

		businessmisdetailsCacheModel businessmisdetailsCacheModel = (businessmisdetailsCacheModel)obj;

		if (id == businessmisdetailsCacheModel.id) {
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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", businesstitle=");
		sb.append(businesstitle);
		sb.append(", businessDesc=");
		sb.append(businessDesc);
		sb.append(", businessLink=");
		sb.append(businessLink);
		sb.append(", filepath=");
		sb.append(filepath);
		sb.append(", filename=");
		sb.append(filename);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append(", flag=");
		sb.append(flag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public businessmisdetails toEntityModel() {
		businessmisdetailsImpl businessmisdetailsImpl = new businessmisdetailsImpl();

		businessmisdetailsImpl.setId(id);
		businessmisdetailsImpl.setContent_id(content_id);

		if (businesstitle == null) {
			businessmisdetailsImpl.setBusinesstitle(StringPool.BLANK);
		}
		else {
			businessmisdetailsImpl.setBusinesstitle(businesstitle);
		}

		if (businessDesc == null) {
			businessmisdetailsImpl.setBusinessDesc(StringPool.BLANK);
		}
		else {
			businessmisdetailsImpl.setBusinessDesc(businessDesc);
		}

		if (businessLink == null) {
			businessmisdetailsImpl.setBusinessLink(StringPool.BLANK);
		}
		else {
			businessmisdetailsImpl.setBusinessLink(businessLink);
		}

		if (filepath == null) {
			businessmisdetailsImpl.setFilepath(StringPool.BLANK);
		}
		else {
			businessmisdetailsImpl.setFilepath(filepath);
		}

		if (filename == null) {
			businessmisdetailsImpl.setFilename(StringPool.BLANK);
		}
		else {
			businessmisdetailsImpl.setFilename(filename);
		}

		if (createdDate == Long.MIN_VALUE) {
			businessmisdetailsImpl.setCreatedDate(null);
		}
		else {
			businessmisdetailsImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			businessmisdetailsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			businessmisdetailsImpl.setCreatedBy(createdBy);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			businessmisdetailsImpl.setModifiedDate(null);
		}
		else {
			businessmisdetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		businessmisdetailsImpl.setModifiedBy(modifiedBy);

		if (flag == null) {
			businessmisdetailsImpl.setFlag(StringPool.BLANK);
		}
		else {
			businessmisdetailsImpl.setFlag(flag);
		}

		businessmisdetailsImpl.resetOriginalValues();

		return businessmisdetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		businesstitle = objectInput.readUTF();
		businessDesc = objectInput.readUTF();
		businessLink = objectInput.readUTF();
		filepath = objectInput.readUTF();
		filename = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		modifiedDate = objectInput.readLong();

		modifiedBy = objectInput.readLong();
		flag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

		if (businesstitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businesstitle);
		}

		if (businessDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessDesc);
		}

		if (businessLink == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessLink);
		}

		if (filepath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(filepath);
		}

		if (filename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(filename);
		}

		objectOutput.writeLong(createdDate);

		if (createdBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdBy);
		}

		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(modifiedBy);

		if (flag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flag);
		}
	}

	public long id;
	public long content_id;
	public String businesstitle;
	public String businessDesc;
	public String businessLink;
	public String filepath;
	public String filename;
	public long createdDate;
	public String createdBy;
	public long modifiedDate;
	public long modifiedBy;
	public String flag;
}