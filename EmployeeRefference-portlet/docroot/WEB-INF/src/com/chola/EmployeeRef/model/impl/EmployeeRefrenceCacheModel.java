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

package com.chola.EmployeeRef.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.EmployeeRef.model.EmployeeRefrence;

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
 * The cache model class for representing EmployeeRefrence in entity cache.
 *
 * @author CloverLiferay03
 * @see EmployeeRefrence
 * @generated
 */
@ProviderType
public class EmployeeRefrenceCacheModel implements CacheModel<EmployeeRefrence>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeRefrenceCacheModel)) {
			return false;
		}

		EmployeeRefrenceCacheModel employeeRefrenceCacheModel = (EmployeeRefrenceCacheModel)obj;

		if (refId == employeeRefrenceCacheModel.refId) {
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
	public EmployeeRefrence toEntityModel() {
		EmployeeRefrenceImpl employeeRefrenceImpl = new EmployeeRefrenceImpl();

		employeeRefrenceImpl.setRefId(refId);

		if (title == null) {
			employeeRefrenceImpl.setTitle(StringPool.BLANK);
		}
		else {
			employeeRefrenceImpl.setTitle(title);
		}

		if (from == null) {
			employeeRefrenceImpl.setFrom(StringPool.BLANK);
		}
		else {
			employeeRefrenceImpl.setFrom(from);
		}

		if (to == null) {
			employeeRefrenceImpl.setTo(StringPool.BLANK);
		}
		else {
			employeeRefrenceImpl.setTo(to);
		}

		if (body == null) {
			employeeRefrenceImpl.setBody(StringPool.BLANK);
		}
		else {
			employeeRefrenceImpl.setBody(body);
		}

		employeeRefrenceImpl.setFlag(flag);

		if (createDate == Long.MIN_VALUE) {
			employeeRefrenceImpl.setCreateDate(null);
		}
		else {
			employeeRefrenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			employeeRefrenceImpl.setModifiedDate(null);
		}
		else {
			employeeRefrenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		employeeRefrenceImpl.resetOriginalValues();

		return employeeRefrenceImpl;
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