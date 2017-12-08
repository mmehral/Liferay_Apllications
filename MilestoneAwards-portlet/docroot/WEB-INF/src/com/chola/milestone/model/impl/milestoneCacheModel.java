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

package com.chola.milestone.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.milestone.model.milestone;

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
 * The cache model class for representing milestone in entity cache.
 *
 * @author CloverLiferay02
 * @see milestone
 * @generated
 */
@ProviderType
public class milestoneCacheModel implements CacheModel<milestone>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof milestoneCacheModel)) {
			return false;
		}

		milestoneCacheModel milestoneCacheModel = (milestoneCacheModel)obj;

		if (id == milestoneCacheModel.id) {
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
	public milestone toEntityModel() {
		milestoneImpl milestoneImpl = new milestoneImpl();

		milestoneImpl.setId(id);

		if (userId == null) {
			milestoneImpl.setUserId(StringPool.BLANK);
		}
		else {
			milestoneImpl.setUserId(userId);
		}

		if (wishedBy == null) {
			milestoneImpl.setWishedBy(StringPool.BLANK);
		}
		else {
			milestoneImpl.setWishedBy(wishedBy);
		}

		if (message == null) {
			milestoneImpl.setMessage(StringPool.BLANK);
		}
		else {
			milestoneImpl.setMessage(message);
		}

		if (createdDate == Long.MIN_VALUE) {
			milestoneImpl.setCreatedDate(null);
		}
		else {
			milestoneImpl.setCreatedDate(new Date(createdDate));
		}

		milestoneImpl.resetOriginalValues();

		return milestoneImpl;
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