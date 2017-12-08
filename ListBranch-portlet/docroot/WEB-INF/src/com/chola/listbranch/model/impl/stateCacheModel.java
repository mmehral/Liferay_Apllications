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

package com.chola.listbranch.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.listbranch.model.state;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing state in entity cache.
 *
 * @author adms.java1
 * @see state
 * @generated
 */
@ProviderType
public class stateCacheModel implements CacheModel<state>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof stateCacheModel)) {
			return false;
		}

		stateCacheModel stateCacheModel = (stateCacheModel)obj;

		if (state_id == stateCacheModel.state_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, state_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{state_id=");
		sb.append(state_id);
		sb.append(", state_name=");
		sb.append(state_name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public state toEntityModel() {
		stateImpl stateImpl = new stateImpl();

		stateImpl.setState_id(state_id);

		if (state_name == null) {
			stateImpl.setState_name(StringPool.BLANK);
		}
		else {
			stateImpl.setState_name(state_name);
		}

		stateImpl.resetOriginalValues();

		return stateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		state_id = objectInput.readLong();
		state_name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(state_id);

		if (state_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state_name);
		}
	}

	public long state_id;
	public String state_name;
}