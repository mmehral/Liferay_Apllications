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

import com.chola.trainingcalendar.model.trainingintendedtable;

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
 * The cache model class for representing trainingintendedtable in entity cache.
 *
 * @author CloverLiferay01
 * @see trainingintendedtable
 * @generated
 */
@ProviderType
public class trainingintendedtableCacheModel implements CacheModel<trainingintendedtable>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingintendedtableCacheModel)) {
			return false;
		}

		trainingintendedtableCacheModel trainingintendedtableCacheModel = (trainingintendedtableCacheModel)obj;

		if (id == trainingintendedtableCacheModel.id) {
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
		sb.append(", trainingid=");
		sb.append(trainingid);
		sb.append(", userid=");
		sb.append(userid);
		sb.append(", screenname=");
		sb.append(screenname);
		sb.append(", createddate=");
		sb.append(createddate);
		sb.append(", flag=");
		sb.append(flag);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public trainingintendedtable toEntityModel() {
		trainingintendedtableImpl trainingintendedtableImpl = new trainingintendedtableImpl();

		trainingintendedtableImpl.setId(id);
		trainingintendedtableImpl.setTrainingid(trainingid);

		if (userid == null) {
			trainingintendedtableImpl.setUserid(StringPool.BLANK);
		}
		else {
			trainingintendedtableImpl.setUserid(userid);
		}

		if (screenname == null) {
			trainingintendedtableImpl.setScreenname(StringPool.BLANK);
		}
		else {
			trainingintendedtableImpl.setScreenname(screenname);
		}

		if (createddate == Long.MIN_VALUE) {
			trainingintendedtableImpl.setCreateddate(null);
		}
		else {
			trainingintendedtableImpl.setCreateddate(new Date(createddate));
		}

		trainingintendedtableImpl.setFlag(flag);

		trainingintendedtableImpl.resetOriginalValues();

		return trainingintendedtableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		trainingid = objectInput.readLong();
		userid = objectInput.readUTF();
		screenname = objectInput.readUTF();
		createddate = objectInput.readLong();

		flag = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(trainingid);

		if (userid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userid);
		}

		if (screenname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(screenname);
		}

		objectOutput.writeLong(createddate);

		objectOutput.writeInt(flag);
	}

	public long id;
	public long trainingid;
	public String userid;
	public String screenname;
	public long createddate;
	public int flag;
}