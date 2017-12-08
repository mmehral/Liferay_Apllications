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

package com.chola.mdspeak.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.mdspeak.model.MdSpeaks;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MdSpeaks in entity cache.
 *
 * @author adms.java1
 * @see MdSpeaks
 * @generated
 */
@ProviderType
public class MdSpeaksCacheModel implements CacheModel<MdSpeaks>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MdSpeaksCacheModel)) {
			return false;
		}

		MdSpeaksCacheModel mdSpeaksCacheModel = (MdSpeaksCacheModel)obj;

		if (Id == mdSpeaksCacheModel.Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", username=");
		sb.append(username);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MdSpeaks toEntityModel() {
		MdSpeaksImpl mdSpeaksImpl = new MdSpeaksImpl();

		mdSpeaksImpl.setId(Id);

		if (username == null) {
			mdSpeaksImpl.setUsername(StringPool.BLANK);
		}
		else {
			mdSpeaksImpl.setUsername(username);
		}

		mdSpeaksImpl.resetOriginalValues();

		return mdSpeaksImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		username = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(username);
		}
	}

	public long Id;
	public String username;
}