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

package com.chola.halloffame.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.halloffame.model.users;

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
 * The cache model class for representing users in entity cache.
 *
 * @author CloverLiferay02
 * @see users
 * @generated
 */
@ProviderType
public class usersCacheModel implements CacheModel<users>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof usersCacheModel)) {
			return false;
		}

		usersCacheModel usersCacheModel = (usersCacheModel)obj;

		if (Id == usersCacheModel.Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", empId=");
		sb.append(empId);
		sb.append(", empName=");
		sb.append(empName);
		sb.append(", writeUp=");
		sb.append(writeUp);
		sb.append(", awardedDate=");
		sb.append(awardedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public users toEntityModel() {
		usersImpl usersImpl = new usersImpl();

		usersImpl.setId(Id);

		if (empId == null) {
			usersImpl.setEmpId(StringPool.BLANK);
		}
		else {
			usersImpl.setEmpId(empId);
		}

		if (empName == null) {
			usersImpl.setEmpName(StringPool.BLANK);
		}
		else {
			usersImpl.setEmpName(empName);
		}

		if (writeUp == null) {
			usersImpl.setWriteUp(StringPool.BLANK);
		}
		else {
			usersImpl.setWriteUp(writeUp);
		}

		if (awardedDate == Long.MIN_VALUE) {
			usersImpl.setAwardedDate(null);
		}
		else {
			usersImpl.setAwardedDate(new Date(awardedDate));
		}

		usersImpl.resetOriginalValues();

		return usersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		empId = objectInput.readUTF();
		empName = objectInput.readUTF();
		writeUp = objectInput.readUTF();
		awardedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (empId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empId);
		}

		if (empName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empName);
		}

		if (writeUp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(writeUp);
		}

		objectOutput.writeLong(awardedDate);
	}

	public long Id;
	public String empId;
	public String empName;
	public String writeUp;
	public long awardedDate;
}