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

package com.pratice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.pratice.model.emp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing emp in entity cache.
 *
 * @author CloverLiferay02
 * @see emp
 * @generated
 */
@ProviderType
public class empCacheModel implements CacheModel<emp>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof empCacheModel)) {
			return false;
		}

		empCacheModel empCacheModel = (empCacheModel)obj;

		if (empId == empCacheModel.empId) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{empId=");
		sb.append(empId);
		sb.append(", empName=");
		sb.append(empName);
		sb.append(", dept=");
		sb.append(dept);
		sb.append(", salary=");
		sb.append(salary);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public emp toEntityModel() {
		empImpl empImpl = new empImpl();

		empImpl.setEmpId(empId);

		if (empName == null) {
			empImpl.setEmpName(StringPool.BLANK);
		}
		else {
			empImpl.setEmpName(empName);
		}

		if (dept == null) {
			empImpl.setDept(StringPool.BLANK);
		}
		else {
			empImpl.setDept(dept);
		}

		if (salary == null) {
			empImpl.setSalary(StringPool.BLANK);
		}
		else {
			empImpl.setSalary(salary);
		}

		empImpl.resetOriginalValues();

		return empImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		empId = objectInput.readLong();
		empName = objectInput.readUTF();
		dept = objectInput.readUTF();
		salary = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(empId);

		if (empName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empName);
		}

		if (dept == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dept);
		}

		if (salary == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(salary);
		}
	}

	public long empId;
	public String empName;
	public String dept;
	public String salary;
}