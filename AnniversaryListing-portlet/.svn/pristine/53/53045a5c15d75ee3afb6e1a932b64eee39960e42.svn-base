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

package com.chola.anniversary.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.anniversary.model.anniversarywish;

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
 * The cache model class for representing anniversarywish in entity cache.
 *
 * @author CloverLiferay02
 * @see anniversarywish
 * @generated
 */
@ProviderType
public class anniversarywishCacheModel implements CacheModel<anniversarywish>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof anniversarywishCacheModel)) {
			return false;
		}

		anniversarywishCacheModel anniversarywishCacheModel = (anniversarywishCacheModel)obj;

		if (id == anniversarywishCacheModel.id) {
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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", wishedBy=");
		sb.append(wishedBy);
		sb.append(", message=");
		sb.append(message);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public anniversarywish toEntityModel() {
		anniversarywishImpl anniversarywishImpl = new anniversarywishImpl();

		anniversarywishImpl.setId(id);

		if (userId == null) {
			anniversarywishImpl.setUserId(StringPool.BLANK);
		}
		else {
			anniversarywishImpl.setUserId(userId);
		}

		if (wishedBy == null) {
			anniversarywishImpl.setWishedBy(StringPool.BLANK);
		}
		else {
			anniversarywishImpl.setWishedBy(wishedBy);
		}

		if (message == null) {
			anniversarywishImpl.setMessage(StringPool.BLANK);
		}
		else {
			anniversarywishImpl.setMessage(message);
		}

		if (createdDate == Long.MIN_VALUE) {
			anniversarywishImpl.setCreatedDate(null);
		}
		else {
			anniversarywishImpl.setCreatedDate(new Date(createdDate));
		}

		anniversarywishImpl.resetOriginalValues();

		return anniversarywishImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readUTF();
		wishedBy = objectInput.readUTF();
		message = objectInput.readUTF();
		createdDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (userId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userId);
		}

		if (wishedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wishedBy);
		}

		if (message == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(message);
		}

		objectOutput.writeLong(createdDate);
	}

	public long id;
	public String userId;
	public String wishedBy;
	public String message;
	public long createdDate;
}