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

import com.chola.calendar.model.eventcalendar;

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
 * The cache model class for representing eventcalendar in entity cache.
 *
 * @author adms.java1
 * @see eventcalendar
 * @generated
 */
@ProviderType
public class eventcalendarCacheModel implements CacheModel<eventcalendar>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof eventcalendarCacheModel)) {
			return false;
		}

		eventcalendarCacheModel eventcalendarCacheModel = (eventcalendarCacheModel)obj;

		if (id == eventcalendarCacheModel.id) {
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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", startdate=");
		sb.append(startdate);
		sb.append(", enddate=");
		sb.append(enddate);
		sb.append(", color=");
		sb.append(color);
		sb.append(", url=");
		sb.append(url);
		sb.append(", userid=");
		sb.append(userid);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public eventcalendar toEntityModel() {
		eventcalendarImpl eventcalendarImpl = new eventcalendarImpl();

		eventcalendarImpl.setId(id);

		if (name == null) {
			eventcalendarImpl.setName(StringPool.BLANK);
		}
		else {
			eventcalendarImpl.setName(name);
		}

		if (startdate == Long.MIN_VALUE) {
			eventcalendarImpl.setStartdate(null);
		}
		else {
			eventcalendarImpl.setStartdate(new Date(startdate));
		}

		if (enddate == Long.MIN_VALUE) {
			eventcalendarImpl.setEnddate(null);
		}
		else {
			eventcalendarImpl.setEnddate(new Date(enddate));
		}

		if (color == null) {
			eventcalendarImpl.setColor(StringPool.BLANK);
		}
		else {
			eventcalendarImpl.setColor(color);
		}

		if (url == null) {
			eventcalendarImpl.setUrl(StringPool.BLANK);
		}
		else {
			eventcalendarImpl.setUrl(url);
		}

		if (userid == null) {
			eventcalendarImpl.setUserid(StringPool.BLANK);
		}
		else {
			eventcalendarImpl.setUserid(userid);
		}

		eventcalendarImpl.resetOriginalValues();

		return eventcalendarImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		name = objectInput.readUTF();
		startdate = objectInput.readLong();
		enddate = objectInput.readLong();
		color = objectInput.readUTF();
		url = objectInput.readUTF();
		userid = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(startdate);
		objectOutput.writeLong(enddate);

		if (color == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(color);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (userid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userid);
		}
	}

	public long id;
	public String name;
	public long startdate;
	public long enddate;
	public String color;
	public String url;
	public String userid;
}