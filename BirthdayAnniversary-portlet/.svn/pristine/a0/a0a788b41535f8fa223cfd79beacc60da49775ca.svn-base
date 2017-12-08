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

package com.chola.birthday.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.birthday.model.predefinedmessages;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing predefinedmessages in entity cache.
 *
 * @author CloverLiferay02
 * @see predefinedmessages
 * @generated
 */
@ProviderType
public class predefinedmessagesCacheModel implements CacheModel<predefinedmessages>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof predefinedmessagesCacheModel)) {
			return false;
		}

		predefinedmessagesCacheModel predefinedmessagesCacheModel = (predefinedmessagesCacheModel)obj;

		if (id == predefinedmessagesCacheModel.id) {
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
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(id);
		sb.append(", message=");
		sb.append(message);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public predefinedmessages toEntityModel() {
		predefinedmessagesImpl predefinedmessagesImpl = new predefinedmessagesImpl();

		predefinedmessagesImpl.setId(id);

		if (message == null) {
			predefinedmessagesImpl.setMessage(StringPool.BLANK);
		}
		else {
			predefinedmessagesImpl.setMessage(message);
		}

		predefinedmessagesImpl.resetOriginalValues();

		return predefinedmessagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		message = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (message == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(message);
		}
	}

	public long id;
	public String message;
}