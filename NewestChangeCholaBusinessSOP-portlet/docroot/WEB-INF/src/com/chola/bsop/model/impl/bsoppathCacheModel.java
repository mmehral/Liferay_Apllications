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

package com.chola.bsop.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.bsop.model.bsoppath;

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
 * The cache model class for representing bsoppath in entity cache.
 *
 * @author cloverliferay01
 * @see bsoppath
 * @generated
 */
@ProviderType
public class bsoppathCacheModel implements CacheModel<bsoppath>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bsoppathCacheModel)) {
			return false;
		}

		bsoppathCacheModel bsoppathCacheModel = (bsoppathCacheModel)obj;

		if (id == bsoppathCacheModel.id) {
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
		sb.append(", bdoc=");
		sb.append(bdoc);
		sb.append(", bpath=");
		sb.append(bpath);
		sb.append(", createddate=");
		sb.append(createddate);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", flag=");
		sb.append(flag);
		sb.append(", bdetails_id=");
		sb.append(bdetails_id);
		sb.append(", bdetailscontent_id=");
		sb.append(bdetailscontent_id);
		sb.append(", filename=");
		sb.append(filename);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public bsoppath toEntityModel() {
		bsoppathImpl bsoppathImpl = new bsoppathImpl();

		bsoppathImpl.setId(id);

		if (bdoc == null) {
			bsoppathImpl.setBdoc(StringPool.BLANK);
		}
		else {
			bsoppathImpl.setBdoc(bdoc);
		}

		if (bpath == null) {
			bsoppathImpl.setBpath(StringPool.BLANK);
		}
		else {
			bsoppathImpl.setBpath(bpath);
		}

		if (createddate == Long.MIN_VALUE) {
			bsoppathImpl.setCreateddate(null);
		}
		else {
			bsoppathImpl.setCreateddate(new Date(createddate));
		}

		if (createdby == null) {
			bsoppathImpl.setCreatedby(StringPool.BLANK);
		}
		else {
			bsoppathImpl.setCreatedby(createdby);
		}

		if (flag == null) {
			bsoppathImpl.setFlag(StringPool.BLANK);
		}
		else {
			bsoppathImpl.setFlag(flag);
		}

		bsoppathImpl.setBdetails_id(bdetails_id);
		bsoppathImpl.setBdetailscontent_id(bdetailscontent_id);

		if (filename == null) {
			bsoppathImpl.setFilename(StringPool.BLANK);
		}
		else {
			bsoppathImpl.setFilename(filename);
		}

		bsoppathImpl.resetOriginalValues();

		return bsoppathImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		bdoc = objectInput.readUTF();
		bpath = objectInput.readUTF();
		createddate = objectInput.readLong();
		createdby = objectInput.readUTF();
		flag = objectInput.readUTF();

		bdetails_id = objectInput.readLong();

		bdetailscontent_id = objectInput.readLong();
		filename = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (bdoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bdoc);
		}

		if (bpath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bpath);
		}

		objectOutput.writeLong(createddate);

		if (createdby == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdby);
		}

		if (flag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flag);
		}

		objectOutput.writeLong(bdetails_id);

		objectOutput.writeLong(bdetailscontent_id);

		if (filename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(filename);
		}
	}

	public long id;
	public String bdoc;
	public String bpath;
	public long createddate;
	public String createdby;
	public String flag;
	public long bdetails_id;
	public long bdetailscontent_id;
	public String filename;
}