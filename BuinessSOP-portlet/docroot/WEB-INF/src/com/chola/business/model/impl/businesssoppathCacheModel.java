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

import com.chola.business.model.businesssoppath;

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
 * The cache model class for representing businesssoppath in entity cache.
 *
 * @author adms.java1
 * @see businesssoppath
 * @generated
 */
@ProviderType
public class businesssoppathCacheModel implements CacheModel<businesssoppath>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businesssoppathCacheModel)) {
			return false;
		}

		businesssoppathCacheModel businesssoppathCacheModel = (businesssoppathCacheModel)obj;

		if (id == businesssoppathCacheModel.id) {
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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", businessdoc=");
		sb.append(businessdoc);
		sb.append(", businessPath=");
		sb.append(businessPath);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", flag=");
		sb.append(flag);
		sb.append(", businessdetails_id=");
		sb.append(businessdetails_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public businesssoppath toEntityModel() {
		businesssoppathImpl businesssoppathImpl = new businesssoppathImpl();

		businesssoppathImpl.setId(id);

		if (businessdoc == null) {
			businesssoppathImpl.setBusinessdoc(StringPool.BLANK);
		}
		else {
			businesssoppathImpl.setBusinessdoc(businessdoc);
		}

		if (businessPath == null) {
			businesssoppathImpl.setBusinessPath(StringPool.BLANK);
		}
		else {
			businesssoppathImpl.setBusinessPath(businessPath);
		}

		if (createdDate == Long.MIN_VALUE) {
			businesssoppathImpl.setCreatedDate(null);
		}
		else {
			businesssoppathImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdBy == null) {
			businesssoppathImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			businesssoppathImpl.setCreatedBy(createdBy);
		}

		if (flag == null) {
			businesssoppathImpl.setFlag(StringPool.BLANK);
		}
		else {
			businesssoppathImpl.setFlag(flag);
		}

		businesssoppathImpl.setBusinessdetails_id(businessdetails_id);

		businesssoppathImpl.resetOriginalValues();

		return businesssoppathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		businessdoc = objectInput.readUTF();
		businessPath = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		flag = objectInput.readUTF();

		businessdetails_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (businessdoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessdoc);
		}

		if (businessPath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(businessPath);
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

		objectOutput.writeLong(businessdetails_id);
	}

	public long id;
	public String businessdoc;
	public String businessPath;
	public long createdDate;
	public String createdBy;
	public String flag;
	public long businessdetails_id;
}