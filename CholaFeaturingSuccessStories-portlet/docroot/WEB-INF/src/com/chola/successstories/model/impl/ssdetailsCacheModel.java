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

package com.chola.successstories.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.model.ssdetails;

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
 * The cache model class for representing ssdetails in entity cache.
 *
 * @author cloverliferay01
 * @see ssdetails
 * @generated
 */
@ProviderType
public class ssdetailsCacheModel implements CacheModel<ssdetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ssdetailsCacheModel)) {
			return false;
		}

		ssdetailsCacheModel ssdetailsCacheModel = (ssdetailsCacheModel)obj;

		if (id == ssdetailsCacheModel.id) {
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
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", sstitle=");
		sb.append(sstitle);
		sb.append(", ssdesc=");
		sb.append(ssdesc);
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
	public ssdetails toEntityModel() {
		ssdetailsImpl ssdetailsImpl = new ssdetailsImpl();

		ssdetailsImpl.setId(id);
		ssdetailsImpl.setContent_id(content_id);

		if (sstitle == null) {
			ssdetailsImpl.setSstitle(StringPool.BLANK);
		}
		else {
			ssdetailsImpl.setSstitle(sstitle);
		}

		if (ssdesc == null) {
			ssdetailsImpl.setSsdesc(StringPool.BLANK);
		}
		else {
			ssdetailsImpl.setSsdesc(ssdesc);
		}

		if (createdDate == Long.MIN_VALUE) {
			ssdetailsImpl.setCreatedDate(null);
		}
		else {
			ssdetailsImpl.setCreatedDate(new Date(createdDate));
		}

		ssdetailsImpl.setCreatedBy(createdBy);

		if (modifiedDate == Long.MIN_VALUE) {
			ssdetailsImpl.setModifiedDate(null);
		}
		else {
			ssdetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		ssdetailsImpl.setModifiedBy(modifiedBy);

		if (flag == null) {
			ssdetailsImpl.setFlag(StringPool.BLANK);
		}
		else {
			ssdetailsImpl.setFlag(flag);
		}

		ssdetailsImpl.resetOriginalValues();

		return ssdetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		sstitle = objectInput.readUTF();
		ssdesc = objectInput.readUTF();
		createdDate = objectInput.readLong();

		createdBy = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		modifiedBy = objectInput.readLong();
		flag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

		if (sstitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sstitle);
		}

		if (ssdesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ssdesc);
		}

		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(createdBy);
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
	public String sstitle;
	public String ssdesc;
	public long createdDate;
	public long createdBy;
	public long modifiedDate;
	public long modifiedBy;
	public String flag;
}