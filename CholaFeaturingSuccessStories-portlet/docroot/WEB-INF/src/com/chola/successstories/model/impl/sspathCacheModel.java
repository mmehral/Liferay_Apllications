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

import com.chola.successstories.model.sspath;

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
 * The cache model class for representing sspath in entity cache.
 *
 * @author cloverliferay01
 * @see sspath
 * @generated
 */
@ProviderType
public class sspathCacheModel implements CacheModel<sspath>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof sspathCacheModel)) {
			return false;
		}

		sspathCacheModel sspathCacheModel = (sspathCacheModel)obj;

		if (id == sspathCacheModel.id) {
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
		sb.append(", ssfiledoc=");
		sb.append(ssfiledoc);
		sb.append(", ssfilepath=");
		sb.append(ssfilepath);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", flag=");
		sb.append(flag);
		sb.append(", ssdetails_id=");
		sb.append(ssdetails_id);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", ssfilename=");
		sb.append(ssfilename);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public sspath toEntityModel() {
		sspathImpl sspathImpl = new sspathImpl();

		sspathImpl.setId(id);

		if (ssfiledoc == null) {
			sspathImpl.setSsfiledoc(StringPool.BLANK);
		}
		else {
			sspathImpl.setSsfiledoc(ssfiledoc);
		}

		if (ssfilepath == null) {
			sspathImpl.setSsfilepath(StringPool.BLANK);
		}
		else {
			sspathImpl.setSsfilepath(ssfilepath);
		}

		if (createdDate == Long.MIN_VALUE) {
			sspathImpl.setCreatedDate(null);
		}
		else {
			sspathImpl.setCreatedDate(new Date(createdDate));
		}

		sspathImpl.setCreatedBy(createdBy);

		if (flag == null) {
			sspathImpl.setFlag(StringPool.BLANK);
		}
		else {
			sspathImpl.setFlag(flag);
		}

		sspathImpl.setSsdetails_id(ssdetails_id);
		sspathImpl.setContent_id(content_id);

		if (ssfilename == null) {
			sspathImpl.setSsfilename(StringPool.BLANK);
		}
		else {
			sspathImpl.setSsfilename(ssfilename);
		}

		sspathImpl.resetOriginalValues();

		return sspathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		ssfiledoc = objectInput.readUTF();
		ssfilepath = objectInput.readUTF();
		createdDate = objectInput.readLong();

		createdBy = objectInput.readLong();
		flag = objectInput.readUTF();

		ssdetails_id = objectInput.readLong();

		content_id = objectInput.readLong();
		ssfilename = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (ssfiledoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ssfiledoc);
		}

		if (ssfilepath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ssfilepath);
		}

		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(createdBy);

		if (flag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flag);
		}

		objectOutput.writeLong(ssdetails_id);

		objectOutput.writeLong(content_id);

		if (ssfilename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ssfilename);
		}
	}

	public long id;
	public String ssfiledoc;
	public String ssfilepath;
	public long createdDate;
	public long createdBy;
	public String flag;
	public long ssdetails_id;
	public long content_id;
	public String ssfilename;
}