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

package com.popular.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.popular.model.popularlinks;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing popularlinks in entity cache.
 *
 * @author CloverLiferay02
 * @see popularlinks
 * @generated
 */
@ProviderType
public class popularlinksCacheModel implements CacheModel<popularlinks>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof popularlinksCacheModel)) {
			return false;
		}

		popularlinksCacheModel popularlinksCacheModel = (popularlinksCacheModel)obj;

		if (id == popularlinksCacheModel.id) {
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
		sb.append(", userid=");
		sb.append(userid);
		sb.append(", url=");
		sb.append(url);
		sb.append(", tag=");
		sb.append(tag);
		sb.append(", count=");
		sb.append(count);
		sb.append(", flag=");
		sb.append(flag);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public popularlinks toEntityModel() {
		popularlinksImpl popularlinksImpl = new popularlinksImpl();

		popularlinksImpl.setId(id);
		popularlinksImpl.setUserid(userid);

		if (url == null) {
			popularlinksImpl.setUrl(StringPool.BLANK);
		}
		else {
			popularlinksImpl.setUrl(url);
		}

		if (tag == null) {
			popularlinksImpl.setTag(StringPool.BLANK);
		}
		else {
			popularlinksImpl.setTag(tag);
		}

		popularlinksImpl.setCount(count);
		popularlinksImpl.setFlag(flag);

		if (createDate == Long.MIN_VALUE) {
			popularlinksImpl.setCreateDate(null);
		}
		else {
			popularlinksImpl.setCreateDate(new Date(createDate));
		}

		popularlinksImpl.resetOriginalValues();

		return popularlinksImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		userid = objectInput.readLong();
		url = objectInput.readUTF();
		tag = objectInput.readUTF();

		count = objectInput.readLong();

		flag = objectInput.readInt();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(userid);

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (tag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tag);
		}

		objectOutput.writeLong(count);

		objectOutput.writeInt(flag);
		objectOutput.writeLong(createDate);
	}

	public long id;
	public long userid;
	public String url;
	public String tag;
	public long count;
	public int flag;
	public long createDate;
}