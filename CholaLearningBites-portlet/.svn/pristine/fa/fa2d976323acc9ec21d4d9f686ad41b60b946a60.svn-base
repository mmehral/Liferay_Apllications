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

package com.chola.learningbites.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.learningbites.model.lbdetails;

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
 * The cache model class for representing lbdetails in entity cache.
 *
 * @author cloverliferay01
 * @see lbdetails
 * @generated
 */
@ProviderType
public class lbdetailsCacheModel implements CacheModel<lbdetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof lbdetailsCacheModel)) {
			return false;
		}

		lbdetailsCacheModel lbdetailsCacheModel = (lbdetailsCacheModel)obj;

		if (id == lbdetailsCacheModel.id) {
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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", lbtitle=");
		sb.append(lbtitle);
		sb.append(", lbdescription=");
		sb.append(lbdescription);
		sb.append(", lbfilename=");
		sb.append(lbfilename);
		sb.append(", lbfilepath=");
		sb.append(lbfilepath);
		sb.append(", createddate=");
		sb.append(createddate);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", modifieddate=");
		sb.append(modifieddate);
		sb.append(", modifiedby=");
		sb.append(modifiedby);
		sb.append(", flag=");
		sb.append(flag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public lbdetails toEntityModel() {
		lbdetailsImpl lbdetailsImpl = new lbdetailsImpl();

		lbdetailsImpl.setId(id);
		lbdetailsImpl.setContent_id(content_id);

		if (lbtitle == null) {
			lbdetailsImpl.setLbtitle(StringPool.BLANK);
		}
		else {
			lbdetailsImpl.setLbtitle(lbtitle);
		}

		if (lbdescription == null) {
			lbdetailsImpl.setLbdescription(StringPool.BLANK);
		}
		else {
			lbdetailsImpl.setLbdescription(lbdescription);
		}

		if (lbfilename == null) {
			lbdetailsImpl.setLbfilename(StringPool.BLANK);
		}
		else {
			lbdetailsImpl.setLbfilename(lbfilename);
		}

		if (lbfilepath == null) {
			lbdetailsImpl.setLbfilepath(StringPool.BLANK);
		}
		else {
			lbdetailsImpl.setLbfilepath(lbfilepath);
		}

		if (createddate == Long.MIN_VALUE) {
			lbdetailsImpl.setCreateddate(null);
		}
		else {
			lbdetailsImpl.setCreateddate(new Date(createddate));
		}

		lbdetailsImpl.setCreatedby(createdby);

		if (modifieddate == Long.MIN_VALUE) {
			lbdetailsImpl.setModifieddate(null);
		}
		else {
			lbdetailsImpl.setModifieddate(new Date(modifieddate));
		}

		lbdetailsImpl.setModifiedby(modifiedby);

		if (flag == null) {
			lbdetailsImpl.setFlag(StringPool.BLANK);
		}
		else {
			lbdetailsImpl.setFlag(flag);
		}

		lbdetailsImpl.resetOriginalValues();

		return lbdetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		lbtitle = objectInput.readUTF();
		lbdescription = objectInput.readUTF();
		lbfilename = objectInput.readUTF();
		lbfilepath = objectInput.readUTF();
		createddate = objectInput.readLong();

		createdby = objectInput.readLong();
		modifieddate = objectInput.readLong();

		modifiedby = objectInput.readLong();
		flag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

		if (lbtitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lbtitle);
		}

		if (lbdescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lbdescription);
		}

		if (lbfilename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lbfilename);
		}

		if (lbfilepath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lbfilepath);
		}

		objectOutput.writeLong(createddate);

		objectOutput.writeLong(createdby);
		objectOutput.writeLong(modifieddate);

		objectOutput.writeLong(modifiedby);

		if (flag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(flag);
		}
	}

	public long id;
	public long content_id;
	public String lbtitle;
	public String lbdescription;
	public String lbfilename;
	public String lbfilepath;
	public long createddate;
	public long createdby;
	public long modifieddate;
	public long modifiedby;
	public String flag;
}