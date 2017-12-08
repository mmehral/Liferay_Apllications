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

import com.chola.calendar.model.corporatepersonalisedparameterscontentstore;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing corporatepersonalisedparameterscontentstore in entity cache.
 *
 * @author adms.java1
 * @see corporatepersonalisedparameterscontentstore
 * @generated
 */
@ProviderType
public class corporatepersonalisedparameterscontentstoreCacheModel
	implements CacheModel<corporatepersonalisedparameterscontentstore>,
		Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof corporatepersonalisedparameterscontentstoreCacheModel)) {
			return false;
		}

		corporatepersonalisedparameterscontentstoreCacheModel corporatepersonalisedparameterscontentstoreCacheModel =
			(corporatepersonalisedparameterscontentstoreCacheModel)obj;

		if (id == corporatepersonalisedparameterscontentstoreCacheModel.id) {
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
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", business=");
		sb.append(business);
		sb.append(", unit=");
		sb.append(unit);
		sb.append(", function=");
		sb.append(function);
		sb.append(", department=");
		sb.append(department);
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", product=");
		sb.append(product);
		sb.append(", zone=");
		sb.append(zone);
		sb.append(", branch=");
		sb.append(branch);
		sb.append(", grade=");
		sb.append(grade);
		sb.append(", region=");
		sb.append(region);
		sb.append(", location=");
		sb.append(location);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", age_type=");
		sb.append(age_type);
		sb.append(", age_value=");
		sb.append(age_value);
		sb.append(", notification_type=");
		sb.append(notification_type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public corporatepersonalisedparameterscontentstore toEntityModel() {
		corporatepersonalisedparameterscontentstoreImpl corporatepersonalisedparameterscontentstoreImpl =
			new corporatepersonalisedparameterscontentstoreImpl();

		corporatepersonalisedparameterscontentstoreImpl.setId(id);
		corporatepersonalisedparameterscontentstoreImpl.setContent_id(content_id);

		if (business == null) {
			corporatepersonalisedparameterscontentstoreImpl.setBusiness(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setBusiness(business);
		}

		if (unit == null) {
			corporatepersonalisedparameterscontentstoreImpl.setUnit(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setUnit(unit);
		}

		if (function == null) {
			corporatepersonalisedparameterscontentstoreImpl.setFunction(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setFunction(function);
		}

		if (department == null) {
			corporatepersonalisedparameterscontentstoreImpl.setDepartment(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setDepartment(department);
		}

		if (designation == null) {
			corporatepersonalisedparameterscontentstoreImpl.setDesignation(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setDesignation(designation);
		}

		if (product == null) {
			corporatepersonalisedparameterscontentstoreImpl.setProduct(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setProduct(product);
		}

		if (zone == null) {
			corporatepersonalisedparameterscontentstoreImpl.setZone(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setZone(zone);
		}

		if (branch == null) {
			corporatepersonalisedparameterscontentstoreImpl.setBranch(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setBranch(branch);
		}

		if (grade == null) {
			corporatepersonalisedparameterscontentstoreImpl.setGrade(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setGrade(grade);
		}

		if (region == null) {
			corporatepersonalisedparameterscontentstoreImpl.setRegion(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setRegion(region);
		}

		if (location == null) {
			corporatepersonalisedparameterscontentstoreImpl.setLocation(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setLocation(location);
		}

		if (user_id == null) {
			corporatepersonalisedparameterscontentstoreImpl.setUser_id(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setUser_id(user_id);
		}

		if (gender == null) {
			corporatepersonalisedparameterscontentstoreImpl.setGender(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setGender(gender);
		}

		if (age_type == null) {
			corporatepersonalisedparameterscontentstoreImpl.setAge_type(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setAge_type(age_type);
		}

		if (age_value == null) {
			corporatepersonalisedparameterscontentstoreImpl.setAge_value(StringPool.BLANK);
		}
		else {
			corporatepersonalisedparameterscontentstoreImpl.setAge_value(age_value);
		}

		corporatepersonalisedparameterscontentstoreImpl.setNotification_type(notification_type);

		corporatepersonalisedparameterscontentstoreImpl.resetOriginalValues();

		return corporatepersonalisedparameterscontentstoreImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		business = objectInput.readUTF();
		unit = objectInput.readUTF();
		function = objectInput.readUTF();
		department = objectInput.readUTF();
		designation = objectInput.readUTF();
		product = objectInput.readUTF();
		zone = objectInput.readUTF();
		branch = objectInput.readUTF();
		grade = objectInput.readUTF();
		region = objectInput.readUTF();
		location = objectInput.readUTF();
		user_id = objectInput.readUTF();
		gender = objectInput.readUTF();
		age_type = objectInput.readUTF();
		age_value = objectInput.readUTF();

		notification_type = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

		if (business == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(business);
		}

		if (unit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(unit);
		}

		if (function == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(function);
		}

		if (department == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(department);
		}

		if (designation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designation);
		}

		if (product == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(product);
		}

		if (zone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zone);
		}

		if (branch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(branch);
		}

		if (grade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grade);
		}

		if (region == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(region);
		}

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (user_id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(user_id);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (age_type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(age_type);
		}

		if (age_value == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(age_value);
		}

		objectOutput.writeLong(notification_type);
	}

	public long id;
	public long content_id;
	public String business;
	public String unit;
	public String function;
	public String department;
	public String designation;
	public String product;
	public String zone;
	public String branch;
	public String grade;
	public String region;
	public String location;
	public String user_id;
	public String gender;
	public String age_type;
	public String age_value;
	public long notification_type;
}