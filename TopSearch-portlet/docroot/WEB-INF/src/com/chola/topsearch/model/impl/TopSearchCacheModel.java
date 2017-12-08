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

package com.chola.topsearch.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.topsearch.model.TopSearch;

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
 * The cache model class for representing TopSearch in entity cache.
 *
 * @author adms.java1
 * @see TopSearch
 * @generated
 */
@ProviderType
public class TopSearchCacheModel implements CacheModel<TopSearch>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TopSearchCacheModel)) {
			return false;
		}

		TopSearchCacheModel topSearchCacheModel = (TopSearchCacheModel)obj;

		if (srchId == topSearchCacheModel.srchId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, srchId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{srchId=");
		sb.append(srchId);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TopSearch toEntityModel() {
		TopSearchImpl topSearchImpl = new TopSearchImpl();

		topSearchImpl.setSrchId(srchId);

		if (Name == null) {
			topSearchImpl.setName(StringPool.BLANK);
		}
		else {
			topSearchImpl.setName(Name);
		}

		if (createDate == Long.MIN_VALUE) {
			topSearchImpl.setCreateDate(null);
		}
		else {
			topSearchImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			topSearchImpl.setModifiedDate(null);
		}
		else {
			topSearchImpl.setModifiedDate(new Date(modifiedDate));
		}

		topSearchImpl.resetOriginalValues();

		return topSearchImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		srchId = objectInput.readLong();
		Name = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(srchId);

		if (Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Name);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long srchId;
	public String Name;
	public long createDate;
	public long modifiedDate;
}