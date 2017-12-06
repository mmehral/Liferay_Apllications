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

package com.chola.msappointment.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.msappointment.model.calendarmsappointment;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing calendarmsappointment in entity cache.
 *
 * @author CloverLiferay01
 * @see calendarmsappointment
 * @generated
 */
@ProviderType
public class calendarmsappointmentCacheModel implements CacheModel<calendarmsappointment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof calendarmsappointmentCacheModel)) {
			return false;
		}

		calendarmsappointmentCacheModel calendarmsappointmentCacheModel = (calendarmsappointmentCacheModel)obj;

		if (id == calendarmsappointmentCacheModel.id) {
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
		StringBundler sb = new StringBundler(3);

		sb.append("{id=");
		sb.append(id);

		return sb.toString();
	}

	@Override
	public calendarmsappointment toEntityModel() {
		calendarmsappointmentImpl calendarmsappointmentImpl = new calendarmsappointmentImpl();

		calendarmsappointmentImpl.setId(id);

		calendarmsappointmentImpl.resetOriginalValues();

		return calendarmsappointmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
	}

	public long id;
}