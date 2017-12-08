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

package com.chola.knowledgebites.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.knowledgebites.model.kbdetails;

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
 * The cache model class for representing kbdetails in entity cache.
 *
 * @author cloverliferay01
 * @see kbdetails
 * @generated
 */
@ProviderType
public class kbdetailsCacheModel implements CacheModel<kbdetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof kbdetailsCacheModel)) {
			return false;
		}

		kbdetailsCacheModel kbdetailsCacheModel = (kbdetailsCacheModel)obj;

		if (id == kbdetailsCacheModel.id) {
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
		sb.append(", kbtitle=");
		sb.append(kbtitle);
		sb.append(", kbdesc=");
		sb.append(kbdesc);
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
	public kbdetails toEntityModel() {
		kbdetailsImpl kbdetailsImpl = new kbdetailsImpl();

		kbdetailsImpl.setId(id);
		kbdetailsImpl.setContent_id(content_id);

		if (kbtitle == null) {
			kbdetailsImpl.setKbtitle(StringPool.BLANK);
		}
		else {
			kbdetailsImpl.setKbtitle(kbtitle);
		}

		if (kbdesc == null) {
			kbdetailsImpl.setKbdesc(StringPool.BLANK);
		}
		else {
			kbdetailsImpl.setKbdesc(kbdesc);
		}

		if (createdDate == Long.MIN_VALUE) {
			kbdetailsImpl.setCreatedDate(null);
		}
		else {
			kbdetailsImpl.setCreatedDate(new Date(createdDate));
		}

		kbdetailsImpl.setCreatedBy(createdBy);

		if (modifiedDate == Long.MIN_VALUE) {
			kbdetailsImpl.setModifiedDate(null);
		}
		else {
			kbdetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		kbdetailsImpl.setModifiedBy(modifiedBy);

		if (flag == null) {
			kbdetailsImpl.setFlag(StringPool.BLANK);
		}
		else {
			kbdetailsImpl.setFlag(flag);
		}

		kbdetailsImpl.resetOriginalValues();

		return kbdetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		kbtitle = objectInput.readUTF();
		kbdesc = objectInput.readUTF();
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

		if (kbtitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kbtitle);
		}

		if (kbdesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kbdesc);
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
	public String kbtitle;
	public String kbdesc;
	public long createdDate;
	public long createdBy;
	public long modifiedDate;
	public long modifiedBy;
	public String flag;
}