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

package com.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.model.cholatalkiesusers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing cholatalkiesusers in entity cache.
 *
 * @author adms.java1
 * @see cholatalkiesusers
 * @generated
 */
@ProviderType
public class cholatalkiesusersCacheModel implements CacheModel<cholatalkiesusers>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cholatalkiesusersCacheModel)) {
			return false;
		}

		cholatalkiesusersCacheModel cholatalkiesusersCacheModel = (cholatalkiesusersCacheModel)obj;

		if (id == cholatalkiesusersCacheModel.id) {
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
		sb.append(", cholatalkiesdetails_id=");
		sb.append(cholatalkiesdetails_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public cholatalkiesusers toEntityModel() {
		cholatalkiesusersImpl cholatalkiesusersImpl = new cholatalkiesusersImpl();

		cholatalkiesusersImpl.setId(id);
		cholatalkiesusersImpl.setUser_id(user_id);
		cholatalkiesusersImpl.setCholatalkiesdetails_id(cholatalkiesdetails_id);

		cholatalkiesusersImpl.resetOriginalValues();

		return cholatalkiesusersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		user_id = objectInput.readLong();

		cholatalkiesdetails_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(user_id);

		objectOutput.writeLong(cholatalkiesdetails_id);
	}

	public long id;
	public long user_id;
	public long cholatalkiesdetails_id;
}