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

import com.chola.calendar.model.data;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing data in entity cache.
 *
 * @author adms.java1
 * @see data
 * @generated
 */
@ProviderType
public class dataCacheModel implements CacheModel<data>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof dataCacheModel)) {
			return false;
		}

		dataCacheModel dataCacheModel = (dataCacheModel)obj;

		if (eventid == dataCacheModel.eventid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, eventid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{eventid=");
		sb.append(eventid);
		sb.append(", eventdetails=");
		sb.append(eventdetails);
		sb.append(", eventfrom=");
		sb.append(eventfrom);
		sb.append(", eventto=");
		sb.append(eventto);
		sb.append(", location=");
		sb.append(location);
		sb.append(", dept=");
		sb.append(dept);
		sb.append(", subdept=");
		sb.append(subdept);
		sb.append(", grade=");
		sb.append(grade);
		sb.append(", age=");
		sb.append(age);
		sb.append(", companyname=");
		sb.append(companyname);
		sb.append(", userid=");
		sb.append(userid);
		sb.append(", gender=");
		sb.append(gender);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public data toEntityModel() {
		dataImpl dataImpl = new dataImpl();

		dataImpl.setEventid(eventid);

		if (eventdetails == null) {
			dataImpl.setEventdetails(StringPool.BLANK);
		}
		else {
			dataImpl.setEventdetails(eventdetails);
		}

		if (eventfrom == null) {
			dataImpl.setEventfrom(StringPool.BLANK);
		}
		else {
			dataImpl.setEventfrom(eventfrom);
		}

		if (eventto == null) {
			dataImpl.setEventto(StringPool.BLANK);
		}
		else {
			dataImpl.setEventto(eventto);
		}

		if (location == null) {
			dataImpl.setLocation(StringPool.BLANK);
		}
		else {
			dataImpl.setLocation(location);
		}

		if (dept == null) {
			dataImpl.setDept(StringPool.BLANK);
		}
		else {
			dataImpl.setDept(dept);
		}

		if (subdept == null) {
			dataImpl.setSubdept(StringPool.BLANK);
		}
		else {
			dataImpl.setSubdept(subdept);
		}

		if (grade == null) {
			dataImpl.setGrade(StringPool.BLANK);
		}
		else {
			dataImpl.setGrade(grade);
		}

		if (age == null) {
			dataImpl.setAge(StringPool.BLANK);
		}
		else {
			dataImpl.setAge(age);
		}

		if (companyname == null) {
			dataImpl.setCompanyname(StringPool.BLANK);
		}
		else {
			dataImpl.setCompanyname(companyname);
		}

		if (userid == null) {
			dataImpl.setUserid(StringPool.BLANK);
		}
		else {
			dataImpl.setUserid(userid);
		}

		if (gender == null) {
			dataImpl.setGender(StringPool.BLANK);
		}
		else {
			dataImpl.setGender(gender);
		}

		dataImpl.resetOriginalValues();

		return dataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eventid = objectInput.readLong();
		eventdetails = objectInput.readUTF();
		eventfrom = objectInput.readUTF();
		eventto = objectInput.readUTF();
		location = objectInput.readUTF();
		dept = objectInput.readUTF();
		subdept = objectInput.readUTF();
		grade = objectInput.readUTF();
		age = objectInput.readUTF();
		companyname = objectInput.readUTF();
		userid = objectInput.readUTF();
		gender = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(eventid);

		if (eventdetails == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventdetails);
		}

		if (eventfrom == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventfrom);
		}

		if (eventto == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(eventto);
		}

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (dept == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dept);
		}

		if (subdept == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subdept);
		}

		if (grade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grade);
		}

		if (age == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(age);
		}

		if (companyname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(companyname);
		}

		if (userid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userid);
		}

		if (gender == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(gender);
		}
	}

	public long eventid;
	public String eventdetails;
	public String eventfrom;
	public String eventto;
	public String location;
	public String dept;
	public String subdept;
	public String grade;
	public String age;
	public String companyname;
	public String userid;
	public String gender;
}