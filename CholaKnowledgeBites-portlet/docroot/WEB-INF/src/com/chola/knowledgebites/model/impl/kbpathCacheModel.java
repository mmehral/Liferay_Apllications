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

import com.chola.knowledgebites.model.kbpath;

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
 * The cache model class for representing kbpath in entity cache.
 *
 * @author cloverliferay01
 * @see kbpath
 * @generated
 */
@ProviderType
public class kbpathCacheModel implements CacheModel<kbpath>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof kbpathCacheModel)) {
			return false;
		}

		kbpathCacheModel kbpathCacheModel = (kbpathCacheModel)obj;

		if (id == kbpathCacheModel.id) {
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
		sb.append(", kbfiledoc=");
		sb.append(kbfiledoc);
		sb.append(", kbfilepath=");
		sb.append(kbfilepath);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", flag=");
		sb.append(flag);
		sb.append(", kbdetails_id=");
		sb.append(kbdetails_id);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", kbfilename=");
		sb.append(kbfilename);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public kbpath toEntityModel() {
		kbpathImpl kbpathImpl = new kbpathImpl();

		kbpathImpl.setId(id);

		if (kbfiledoc == null) {
			kbpathImpl.setKbfiledoc(StringPool.BLANK);
		}
		else {
			kbpathImpl.setKbfiledoc(kbfiledoc);
		}

		if (kbfilepath == null) {
			kbpathImpl.setKbfilepath(StringPool.BLANK);
		}
		else {
			kbpathImpl.setKbfilepath(kbfilepath);
		}

		if (createdDate == Long.MIN_VALUE) {
			kbpathImpl.setCreatedDate(null);
		}
		else {
			kbpathImpl.setCreatedDate(new Date(createdDate));
		}

		kbpathImpl.setCreatedBy(createdBy);

		if (flag == null) {
			kbpathImpl.setFlag(StringPool.BLANK);
		}
		else {
			kbpathImpl.setFlag(flag);
		}

		kbpathImpl.setKbdetails_id(kbdetails_id);
		kbpathImpl.setContent_id(content_id);

		if (kbfilename == null) {
			kbpathImpl.setKbfilename(StringPool.BLANK);
		}
		else {
			kbpathImpl.setKbfilename(kbfilename);
		}

		kbpathImpl.resetOriginalValues();

		return kbpathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		kbfiledoc = objectInput.readUTF();
		kbfilepath = objectInput.readUTF();
		createdDate = objectInput.readLong();

		createdBy = objectInput.readLong();
		flag = objectInput.readUTF();

		kbdetails_id = objectInput.readLong();

		content_id = objectInput.readLong();
		kbfilename = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (kbfiledoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kbfiledoc);
		}

		if (kbfilepath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kbfilepath);
		}

		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(createdBy);

		if (flag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flag);
		}

		objectOutput.writeLong(kbdetails_id);

		objectOutput.writeLong(content_id);

		if (kbfilename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kbfilename);
		}
	}

	public long id;
	public String kbfiledoc;
	public String kbfilepath;
	public long createdDate;
	public long createdBy;
	public String flag;
	public long kbdetails_id;
	public long content_id;
	public String kbfilename;
}