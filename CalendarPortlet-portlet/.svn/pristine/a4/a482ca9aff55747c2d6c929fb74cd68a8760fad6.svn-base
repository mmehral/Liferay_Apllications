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

package com.chola.calendar.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.model.EmpInfoEntity;

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
 * The cache model class for representing EmpInfoEntity in entity cache.
 *
 * @author adms.java1
 * @see EmpInfoEntity
 * @generated
 */
@ProviderType
public class EmpInfoEntityCacheModel implements CacheModel<EmpInfoEntity>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmpInfoEntityCacheModel)) {
			return false;
		}

		EmpInfoEntityCacheModel empInfoEntityCacheModel = (EmpInfoEntityCacheModel)obj;

		if (id == empInfoEntityCacheModel.id) {
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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", empId=");
		sb.append(empId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", emailid=");
		sb.append(emailid);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", grade=");
		sb.append(grade);
		sb.append(", functionName=");
		sb.append(functionName);
		sb.append(", department=");
		sb.append(department);
		sb.append(", subdepartment=");
		sb.append(subdepartment);
		sb.append(", location=");
		sb.append(location);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", unit=");
		sb.append(unit);
		sb.append(", userid=");
		sb.append(userid);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmpInfoEntity toEntityModel() {
		EmpInfoEntityImpl empInfoEntityImpl = new EmpInfoEntityImpl();

		empInfoEntityImpl.setId(id);

		if (empId == null) {
			empInfoEntityImpl.setEmpId(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setEmpId(empId);
		}

		if (name == null) {
			empInfoEntityImpl.setName(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setName(name);
		}

		if (emailid == null) {
			empInfoEntityImpl.setEmailid(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setEmailid(emailid);
		}

		if (birthday == Long.MIN_VALUE) {
			empInfoEntityImpl.setBirthday(null);
		}
		else {
			empInfoEntityImpl.setBirthday(new Date(birthday));
		}

		if (grade == null) {
			empInfoEntityImpl.setGrade(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setGrade(grade);
		}

		if (functionName == null) {
			empInfoEntityImpl.setFunctionName(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setFunctionName(functionName);
		}

		if (department == null) {
			empInfoEntityImpl.setDepartment(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setDepartment(department);
		}

		if (subdepartment == null) {
			empInfoEntityImpl.setSubdepartment(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setSubdepartment(subdepartment);
		}

		if (location == null) {
			empInfoEntityImpl.setLocation(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setLocation(location);
		}

		if (gender == null) {
			empInfoEntityImpl.setGender(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setGender(gender);
		}

		if (unit == null) {
			empInfoEntityImpl.setUnit(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setUnit(unit);
		}

		if (userid == null) {
			empInfoEntityImpl.setUserid(StringPool.BLANK);
		}
		else {
			empInfoEntityImpl.setUserid(userid);
		}

		empInfoEntityImpl.resetOriginalValues();

		return empInfoEntityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		empId = objectInput.readUTF();
		name = objectInput.readUTF();
		emailid = objectInput.readUTF();
		birthday = objectInput.readLong();
		grade = objectInput.readUTF();
		functionName = objectInput.readUTF();
		department = objectInput.readUTF();
		subdepartment = objectInput.readUTF();
		location = objectInput.readUTF();
		gender = objectInput.readUTF();
		unit = objectInput.readUTF();
		userid = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (empId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empId);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (emailid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailid);
		}

		objectOutput.writeLong(birthday);

		if (grade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grade);
		}

		if (functionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(functionName);
		}

		if (department == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(department);
		}

		if (subdepartment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subdepartment);
		}

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (unit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unit);
		}

		if (userid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userid);
		}
	}

	public long id;
	public String empId;
	public String name;
	public String emailid;
	public long birthday;
	public String grade;
	public String functionName;
	public String department;
	public String subdepartment;
	public String location;
	public String gender;
	public String unit;
	public String userid;
}