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

package com.chola.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.model.businesssopDetails;

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
 * The cache model class for representing businesssopDetails in entity cache.
 *
 * @author adms.java1
 * @see businesssopDetails
 * @generated
 */
@ProviderType
public class businesssopDetailsCacheModel implements CacheModel<businesssopDetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businesssopDetailsCacheModel)) {
			return false;
		}

		businesssopDetailsCacheModel businesssopDetailsCacheModel = (businesssopDetailsCacheModel)obj;

		if (id == businesssopDetailsCacheModel.id) {
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
		sb.append(", businesstitle=");
		sb.append(businesstitle);
		sb.append(", businessDesc=");
		sb.append(businessDesc);
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
	public businesssopDetails toEntityModel() {
		businesssopDetailsImpl businesssopDetailsImpl = new businesssopDetailsImpl();

		businesssopDetailsImpl.setId(id);

		if (businesstitle == null) {
			businesssopDetailsImpl.setBusinesstitle(StringPool.BLANK);
		}
		else {
			businesssopDetailsImpl.setBusinesstitle(businesstitle);
		}

		if (businessDesc == null) {
			businesssopDetailsImpl.setBusinessDesc(StringPool.BLANK);
		}
		else {
			businesssopDetailsImpl.setBusinessDesc(businessDesc);
		}

		if (createdDate == Long.MIN_VALUE) {
			businesssopDetailsImpl.setCreatedDate(null);
		}
		else {
			businesssopDetailsImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			businesssopDetailsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			businesssopDetailsImpl.setCreatedBy(createdBy);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			businesssopDetailsImpl.setModifiedDate(null);
		}
		else {
			businesssopDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		businesssopDetailsImpl.setModifiedBy(modifiedBy);

		if (flag == null) {
			businesssopDetailsImpl.setFlag(StringPool.BLANK);
		}
		else {
			businesssopDetailsImpl.setFlag(flag);
		}

		businesssopDetailsImpl.resetOriginalValues();

		return businesssopDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		businesstitle = objectInput.readUTF();
		businessDesc = objectInput.readUTF();
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
	public String businesstitle;
	public String businessDesc;
	public long createdDate;
	public String createdBy;
	public long modifiedDate;
	public long modifiedBy;
	public String flag;
}