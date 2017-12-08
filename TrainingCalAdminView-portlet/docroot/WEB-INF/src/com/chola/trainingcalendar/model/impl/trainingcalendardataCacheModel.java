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

package com.chola.trainingcalendar.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.model.trainingcalendardata;

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
 * The cache model class for representing trainingcalendardata in entity cache.
 *
 * @author CloverLiferay01
 * @see trainingcalendardata
 * @generated
 */
@ProviderType
public class trainingcalendardataCacheModel implements CacheModel<trainingcalendardata>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingcalendardataCacheModel)) {
			return false;
		}

		trainingcalendardataCacheModel trainingcalendardataCacheModel = (trainingcalendardataCacheModel)obj;

		if (id == trainingcalendardataCacheModel.id) {
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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", schedulestartdate=");
		sb.append(schedulestartdate);
		sb.append(", scheduleenddate=");
		sb.append(scheduleenddate);
		sb.append(", location=");
		sb.append(location);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public trainingcalendardata toEntityModel() {
		trainingcalendardataImpl trainingcalendardataImpl = new trainingcalendardataImpl();

		trainingcalendardataImpl.setId(id);

		if (title == null) {
			trainingcalendardataImpl.setTitle(StringPool.BLANK);
		}
		else {
			trainingcalendardataImpl.setTitle(title);
		}

		if (description == null) {
			trainingcalendardataImpl.setDescription(StringPool.BLANK);
		}
		else {
			trainingcalendardataImpl.setDescription(description);
		}

		if (schedulestartdate == Long.MIN_VALUE) {
			trainingcalendardataImpl.setSchedulestartdate(null);
		}
		else {
			trainingcalendardataImpl.setSchedulestartdate(new Date(
					schedulestartdate));
		}

		if (scheduleenddate == Long.MIN_VALUE) {
			trainingcalendardataImpl.setScheduleenddate(null);
		}
		else {
			trainingcalendardataImpl.setScheduleenddate(new Date(
					scheduleenddate));
		}

		if (location == null) {
			trainingcalendardataImpl.setLocation(StringPool.BLANK);
		}
		else {
			trainingcalendardataImpl.setLocation(location);
		}

		trainingcalendardataImpl.resetOriginalValues();

		return trainingcalendardataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		schedulestartdate = objectInput.readLong();
		scheduleenddate = objectInput.readLong();
		location = objectInput.readUTF();
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

		objectOutput.writeLong(schedulestartdate);
		objectOutput.writeLong(scheduleenddate);

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}
	}

	public long id;
	public String title;
	public String description;
	public long schedulestartdate;
	public long scheduleenddate;
	public String location;
}