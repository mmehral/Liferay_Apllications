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

package com.chola.InternalJobRef.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.InternalJobRef.model.InternalReference;

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
 * The cache model class for representing InternalReference in entity cache.
 *
 * @author CloverLiferay03
 * @see InternalReference
 * @generated
 */
@ProviderType
public class InternalReferenceCacheModel implements CacheModel<InternalReference>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InternalReferenceCacheModel)) {
			return false;
		}

		InternalReferenceCacheModel internalReferenceCacheModel = (InternalReferenceCacheModel)obj;

		if (refId == internalReferenceCacheModel.refId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, refId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{refId=");
		sb.append(refId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", from=");
		sb.append(from);
		sb.append(", to=");
		sb.append(to);
		sb.append(", body=");
		sb.append(body);
		sb.append(", flag=");
		sb.append(flag);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public InternalReference toEntityModel() {
		InternalReferenceImpl internalReferenceImpl = new InternalReferenceImpl();

		internalReferenceImpl.setRefId(refId);

		if (title == null) {
			internalReferenceImpl.setTitle(StringPool.BLANK);
		}
		else {
			internalReferenceImpl.setTitle(title);
		}

		if (from == null) {
			internalReferenceImpl.setFrom(StringPool.BLANK);
		}
		else {
			internalReferenceImpl.setFrom(from);
		}

		if (to == null) {
			internalReferenceImpl.setTo(StringPool.BLANK);
		}
		else {
			internalReferenceImpl.setTo(to);
		}

		if (body == null) {
			internalReferenceImpl.setBody(StringPool.BLANK);
		}
		else {
			internalReferenceImpl.setBody(body);
		}

		internalReferenceImpl.setFlag(flag);

		if (createDate == Long.MIN_VALUE) {
			internalReferenceImpl.setCreateDate(null);
		}
		else {
			internalReferenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			internalReferenceImpl.setModifiedDate(null);
		}
		else {
			internalReferenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		internalReferenceImpl.resetOriginalValues();

		return internalReferenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		refId = objectInput.readLong();
		title = objectInput.readUTF();
		from = objectInput.readUTF();
		to = objectInput.readUTF();
		body = objectInput.readUTF();

		flag = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(refId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (from == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(from);
		}

		if (to == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(to);
		}

		if (body == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(body);
		}

		objectOutput.writeLong(flag);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long refId;
	public String title;
	public String from;
	public String to;
	public String body;
	public long flag;
	public long createDate;
	public long modifiedDate;
}