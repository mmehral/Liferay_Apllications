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

import com.chola.trainingcalendar.model.trainingcalendar;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing trainingcalendar in entity cache.
 *
 * @author CloverLiferay01
 * @see trainingcalendar
 * @generated
 */
@ProviderType
public class trainingcalendarCacheModel implements CacheModel<trainingcalendar>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingcalendarCacheModel)) {
			return false;
		}

		trainingcalendarCacheModel trainingcalendarCacheModel = (trainingcalendarCacheModel)obj;

		if (trainingid == trainingcalendarCacheModel.trainingid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, trainingid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{trainingid=");
		sb.append(trainingid);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public trainingcalendar toEntityModel() {
		trainingcalendarImpl trainingcalendarImpl = new trainingcalendarImpl();

		trainingcalendarImpl.setTrainingid(trainingid);

		if (name == null) {
			trainingcalendarImpl.setName(StringPool.BLANK);
		}
		else {
			trainingcalendarImpl.setName(name);
		}

		trainingcalendarImpl.resetOriginalValues();

		return trainingcalendarImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		trainingid = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(trainingid);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public long trainingid;
	public String name;
}