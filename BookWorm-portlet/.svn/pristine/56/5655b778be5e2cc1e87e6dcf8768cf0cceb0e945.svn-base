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

package com.chola.book.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.book.model.bookdetails;

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
 * The cache model class for representing bookdetails in entity cache.
 *
 * @author CloverLiferay02
 * @see bookdetails
 * @generated
 */
@ProviderType
public class bookdetailsCacheModel implements CacheModel<bookdetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookdetailsCacheModel)) {
			return false;
		}

		bookdetailsCacheModel bookdetailsCacheModel = (bookdetailsCacheModel)obj;

		if (id == bookdetailsCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", booktitle=");
		sb.append(booktitle);
		sb.append(", bookname=");
		sb.append(bookname);
		sb.append(", bookpath=");
		sb.append(bookpath);
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
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public bookdetails toEntityModel() {
		bookdetailsImpl bookdetailsImpl = new bookdetailsImpl();

		bookdetailsImpl.setId(id);

		if (booktitle == null) {
			bookdetailsImpl.setBooktitle(StringPool.BLANK);
		}
		else {
			bookdetailsImpl.setBooktitle(booktitle);
		}

		if (bookname == null) {
			bookdetailsImpl.setBookname(StringPool.BLANK);
		}
		else {
			bookdetailsImpl.setBookname(bookname);
		}

		if (bookpath == null) {
			bookdetailsImpl.setBookpath(StringPool.BLANK);
		}
		else {
			bookdetailsImpl.setBookpath(bookpath);
		}

		if (createddate == Long.MIN_VALUE) {
			bookdetailsImpl.setCreateddate(null);
		}
		else {
			bookdetailsImpl.setCreateddate(new Date(createddate));
		}

		bookdetailsImpl.setCreatedby(createdby);

		if (modifieddate == Long.MIN_VALUE) {
			bookdetailsImpl.setModifieddate(null);
		}
		else {
			bookdetailsImpl.setModifieddate(new Date(modifieddate));
		}

		bookdetailsImpl.setModifiedby(modifiedby);

		if (flag == null) {
			bookdetailsImpl.setFlag(StringPool.BLANK);
		}
		else {
			bookdetailsImpl.setFlag(flag);
		}

		bookdetailsImpl.setContent_id(content_id);

		bookdetailsImpl.resetOriginalValues();

		return bookdetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		booktitle = objectInput.readUTF();
		bookname = objectInput.readUTF();
		bookpath = objectInput.readUTF();
		createddate = objectInput.readLong();

		createdby = objectInput.readLong();
		modifieddate = objectInput.readLong();

		modifiedby = objectInput.readLong();
		flag = objectInput.readUTF();

		content_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (booktitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(booktitle);
		}

		if (bookname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bookname);
		}

		if (bookpath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bookpath);
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

		objectOutput.writeLong(content_id);
	}

	public long id;
	public String booktitle;
	public String bookname;
	public String bookpath;
	public long createddate;
	public long createdby;
	public long modifieddate;
	public long modifiedby;
	public String flag;
	public long content_id;
}