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

package com.chola.socho.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.socho.model.idea;

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
 * The cache model class for representing idea in entity cache.
 *
 * @author CloverLiferay02
 * @see idea
 * @generated
 */
@ProviderType
public class ideaCacheModel implements CacheModel<idea>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ideaCacheModel)) {
			return false;
		}

		ideaCacheModel ideaCacheModel = (ideaCacheModel)obj;

		if (id == ideaCacheModel.id) {
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
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", topic=");
		sb.append(topic);
		sb.append(", sharedIdea=");
		sb.append(sharedIdea);
		sb.append(", sharedFile=");
		sb.append(sharedFile);
		sb.append(", sharedDate=");
		sb.append(sharedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public idea toEntityModel() {
		ideaImpl ideaImpl = new ideaImpl();

		ideaImpl.setId(id);
		ideaImpl.setUserId(userId);

		if (topic == null) {
			ideaImpl.setTopic(StringPool.BLANK);
		}
		else {
			ideaImpl.setTopic(topic);
		}

		if (sharedIdea == null) {
			ideaImpl.setSharedIdea(StringPool.BLANK);
		}
		else {
			ideaImpl.setSharedIdea(sharedIdea);
		}

		if (sharedFile == null) {
			ideaImpl.setSharedFile(StringPool.BLANK);
		}
		else {
			ideaImpl.setSharedFile(sharedFile);
		}

		if (sharedDate == Long.MIN_VALUE) {
			ideaImpl.setSharedDate(null);
		}
		else {
			ideaImpl.setSharedDate(new Date(sharedDate));
		}

		ideaImpl.resetOriginalValues();

		return ideaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		userId = objectInput.readLong();
		topic = objectInput.readUTF();
		sharedIdea = objectInput.readUTF();
		sharedFile = objectInput.readUTF();
		sharedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(userId);

		if (topic == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(topic);
		}

		if (sharedIdea == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sharedIdea);
		}

		if (sharedFile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sharedFile);
		}

		objectOutput.writeLong(sharedDate);
	}

	public long id;
	public long userId;
	public String topic;
	public String sharedIdea;
	public String sharedFile;
	public long sharedDate;
}