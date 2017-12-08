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

import com.chola.calendar.model.corporateeventsdata;

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
 * The cache model class for representing corporateeventsdata in entity cache.
 *
 * @author adms.java1
 * @see corporateeventsdata
 * @generated
 */
@ProviderType
public class corporateeventsdataCacheModel implements CacheModel<corporateeventsdata>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof corporateeventsdataCacheModel)) {
			return false;
		}

		corporateeventsdataCacheModel corporateeventsdataCacheModel = (corporateeventsdataCacheModel)obj;

		if (id == corporateeventsdataCacheModel.id) {
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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", zone=");
		sb.append(zone);
		sb.append(", region=");
		sb.append(region);
		sb.append(", location=");
		sb.append(location);
		sb.append(", personincharge=");
		sb.append(personincharge);
		sb.append(", schedulestartdate=");
		sb.append(schedulestartdate);
		sb.append(", scheduleenddate=");
		sb.append(scheduleenddate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public corporateeventsdata toEntityModel() {
		corporateeventsdataImpl corporateeventsdataImpl = new corporateeventsdataImpl();

		corporateeventsdataImpl.setId(id);

		if (title == null) {
			corporateeventsdataImpl.setTitle(StringPool.BLANK);
		}
		else {
			corporateeventsdataImpl.setTitle(title);
		}

		if (description == null) {
			corporateeventsdataImpl.setDescription(StringPool.BLANK);
		}
		else {
			corporateeventsdataImpl.setDescription(description);
		}

		if (zone == null) {
			corporateeventsdataImpl.setZone(StringPool.BLANK);
		}
		else {
			corporateeventsdataImpl.setZone(zone);
		}

		if (region == null) {
			corporateeventsdataImpl.setRegion(StringPool.BLANK);
		}
		else {
			corporateeventsdataImpl.setRegion(region);
		}

		if (location == null) {
			corporateeventsdataImpl.setLocation(StringPool.BLANK);
		}
		else {
			corporateeventsdataImpl.setLocation(location);
		}

		if (personincharge == null) {
			corporateeventsdataImpl.setPersonincharge(StringPool.BLANK);
		}
		else {
			corporateeventsdataImpl.setPersonincharge(personincharge);
		}

		if (schedulestartdate == Long.MIN_VALUE) {
			corporateeventsdataImpl.setSchedulestartdate(null);
		}
		else {
			corporateeventsdataImpl.setSchedulestartdate(new Date(
					schedulestartdate));
		}

		if (scheduleenddate == Long.MIN_VALUE) {
			corporateeventsdataImpl.setScheduleenddate(null);
		}
		else {
			corporateeventsdataImpl.setScheduleenddate(new Date(scheduleenddate));
		}

		corporateeventsdataImpl.resetOriginalValues();

		return corporateeventsdataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		zone = objectInput.readUTF();
		region = objectInput.readUTF();
		location = objectInput.readUTF();
		personincharge = objectInput.readUTF();
		schedulestartdate = objectInput.readLong();
		scheduleenddate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (zone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(zone);
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

		if (personincharge == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(personincharge);
		}

		objectOutput.writeLong(schedulestartdate);
		objectOutput.writeLong(scheduleenddate);
	}

	public long id;
	public String title;
	public String description;
	public String zone;
	public String region;
	public String location;
	public String personincharge;
	public long schedulestartdate;
	public long scheduleenddate;
}