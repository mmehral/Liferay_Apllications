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

package com.chola.businessmis.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.model.businessmisusers;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing businessmisusers in entity cache.
 *
 * @author CloverLiferay01
 * @see businessmisusers
 * @generated
 */
@ProviderType
public class businessmisusersCacheModel implements CacheModel<businessmisusers>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businessmisusersCacheModel)) {
			return false;
		}

		businessmisusersCacheModel businessmisusersCacheModel = (businessmisusersCacheModel)obj;

		if (id == businessmisusersCacheModel.id) {
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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append(", businessdetails_id=");
		sb.append(businessdetails_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public businessmisusers toEntityModel() {
		businessmisusersImpl businessmisusersImpl = new businessmisusersImpl();

		businessmisusersImpl.setId(id);
		businessmisusersImpl.setUser_id(user_id);
		businessmisusersImpl.setBusinessdetails_id(businessdetails_id);

		businessmisusersImpl.resetOriginalValues();

		return businessmisusersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		user_id = objectInput.readLong();

		businessdetails_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(user_id);

		objectOutput.writeLong(businessdetails_id);
	}

	public long id;
	public long user_id;
	public long businessdetails_id;
}