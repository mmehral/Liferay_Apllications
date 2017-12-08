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

package com.chola.notificationchannel.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.notificationchannel.model.NoticationCategoryCount;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing NoticationCategoryCount in entity cache.
 *
 * @author cloverliferay01
 * @see NoticationCategoryCount
 * @generated
 */
@ProviderType
public class NoticationCategoryCountCacheModel implements CacheModel<NoticationCategoryCount>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NoticationCategoryCountCacheModel)) {
			return false;
		}

		NoticationCategoryCountCacheModel noticationCategoryCountCacheModel = (NoticationCategoryCountCacheModel)obj;

		if (eventId == noticationCategoryCountCacheModel.eventId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, eventId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{eventId=");
		sb.append(eventId);
		sb.append(", username=");
		sb.append(username);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NoticationCategoryCount toEntityModel() {
		NoticationCategoryCountImpl noticationCategoryCountImpl = new NoticationCategoryCountImpl();

		noticationCategoryCountImpl.setEventId(eventId);

		if (username == null) {
			noticationCategoryCountImpl.setUsername(StringPool.BLANK);
		}
		else {
			noticationCategoryCountImpl.setUsername(username);
		}

		noticationCategoryCountImpl.resetOriginalValues();

		return noticationCategoryCountImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eventId = objectInput.readLong();
		username = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(eventId);

		if (username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(username);
		}
	}

	public long eventId;
	public String username;
}