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

package com.contest.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.contest.model.ContestUserDetails;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ContestUserDetails in entity cache.
 *
 * @author CloverLiferay01
 * @see ContestUserDetails
 * @generated
 */
@ProviderType
public class ContestUserDetailsCacheModel implements CacheModel<ContestUserDetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContestUserDetailsCacheModel)) {
			return false;
		}

		ContestUserDetailsCacheModel contestUserDetailsCacheModel = (ContestUserDetailsCacheModel)obj;

		if (id == contestUserDetailsCacheModel.id) {
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
		sb.append(", contestreference_id=");
		sb.append(contestreference_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ContestUserDetails toEntityModel() {
		ContestUserDetailsImpl contestUserDetailsImpl = new ContestUserDetailsImpl();

		contestUserDetailsImpl.setId(id);

		if (user_id == null) {
			contestUserDetailsImpl.setUser_id(StringPool.BLANK);
		}
		else {
			contestUserDetailsImpl.setUser_id(user_id);
		}

		contestUserDetailsImpl.setContestreference_id(contestreference_id);

		contestUserDetailsImpl.resetOriginalValues();

		return contestUserDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		user_id = objectInput.readUTF();

		contestreference_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (user_id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(user_id);
		}

		objectOutput.writeLong(contestreference_id);
	}

	public long id;
	public String user_id;
	public long contestreference_id;
}