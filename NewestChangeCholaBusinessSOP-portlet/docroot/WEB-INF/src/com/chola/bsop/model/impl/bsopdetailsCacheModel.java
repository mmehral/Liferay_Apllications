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

import com.chola.bsop.model.bsopdetails;

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
 * The cache model class for representing bsopdetails in entity cache.
 *
 * @author cloverliferay01
 * @see bsopdetails
 * @generated
 */
@ProviderType
public class bsopdetailsCacheModel implements CacheModel<bsopdetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bsopdetailsCacheModel)) {
			return false;
		}

		bsopdetailsCacheModel bsopdetailsCacheModel = (bsopdetailsCacheModel)obj;

		if (id == bsopdetailsCacheModel.id) {
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
		sb.append(", btitle=");
		sb.append(btitle);
		sb.append(", bdesc=");
		sb.append(bdesc);
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
	public bsopdetails toEntityModel() {
		bsopdetailsImpl bsopdetailsImpl = new bsopdetailsImpl();

		bsopdetailsImpl.setId(id);
		bsopdetailsImpl.setContent_id(content_id);

		if (btitle == null) {
			bsopdetailsImpl.setBtitle(StringPool.BLANK);
		}
		else {
			bsopdetailsImpl.setBtitle(btitle);
		}

		if (bdesc == null) {
			bsopdetailsImpl.setBdesc(StringPool.BLANK);
		}
		else {
			bsopdetailsImpl.setBdesc(bdesc);
		}

		if (createddate == Long.MIN_VALUE) {
			bsopdetailsImpl.setCreateddate(null);
		}
		else {
			bsopdetailsImpl.setCreateddate(new Date(createddate));
		}

		if (createdby == null) {
			bsopdetailsImpl.setCreatedby(StringPool.BLANK);
		}
		else {
			bsopdetailsImpl.setCreatedby(createdby);
		}

		if (modifieddate == Long.MIN_VALUE) {
			bsopdetailsImpl.setModifieddate(null);
		}
		else {
			bsopdetailsImpl.setModifieddate(new Date(modifieddate));
		}

		bsopdetailsImpl.setModifiedby(modifiedby);

		if (flag == null) {
			bsopdetailsImpl.setFlag(StringPool.BLANK);
		}
		else {
			bsopdetailsImpl.setFlag(flag);
		}

		bsopdetailsImpl.resetOriginalValues();

		return bsopdetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		btitle = objectInput.readUTF();
		bdesc = objectInput.readUTF();
		createddate = objectInput.readLong();
		createdby = objectInput.readUTF();
		modifieddate = objectInput.readLong();

		modifiedby = objectInput.readLong();
		flag = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

		if (btitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(btitle);
		}

		if (bdesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bdesc);
		}

		objectOutput.writeLong(createddate);

		if (createdby == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdby);
		}

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
	public String btitle;
	public String bdesc;
	public long createddate;
	public String createdby;
	public long modifieddate;
	public long modifiedby;
	public String flag;
}