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

package com.service.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.service.model.employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing employee in entity cache.
 *
 * @author CloverLiferay02
 * @see employee
 * @generated
 */
@ProviderType
public class employeeCacheModel implements CacheModel<employee>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof employeeCacheModel)) {
			return false;
		}

		employeeCacheModel employeeCacheModel = (employeeCacheModel)obj;

		if (empId == employeeCacheModel.empId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, empId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{empId=");
		sb.append(empId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", dept=");
		sb.append(dept);
		sb.append(", mobileNo=");
		sb.append(mobileNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public employee toEntityModel() {
		employeeImpl employeeImpl = new employeeImpl();

		employeeImpl.setEmpId(empId);

		if (name == null) {
			employeeImpl.setName(StringPool.BLANK);
		}
		else {
			employeeImpl.setName(name);
		}

		if (email == null) {
			employeeImpl.setEmail(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmail(email);
		}

		if (dept == null) {
			employeeImpl.setDept(StringPool.BLANK);
		}
		else {
			employeeImpl.setDept(dept);
		}

		employeeImpl.setMobileNo(mobileNo);

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		empId = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		dept = objectInput.readUTF();

		mobileNo = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(empId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (dept == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dept);
		}

		objectOutput.writeInt(mobileNo);
	}

	public long empId;
	public String name;
	public String email;
	public String dept;
	public int mobileNo;
}