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

import com.chola.socho.model.topics;

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
 * The cache model class for representing topics in entity cache.
 *
 * @author CloverLiferay02
 * @see topics
 * @generated
 */
@ProviderType
public class topicsCacheModel implements CacheModel<topics>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof topicsCacheModel)) {
			return false;
		}

		topicsCacheModel topicsCacheModel = (topicsCacheModel)obj;

		if (id == topicsCacheModel.id) {
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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", topicName=");
		sb.append(topicName);
		sb.append(", flag=");
		sb.append(flag);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", createdOn=");
		sb.append(createdOn);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append(", modifiedOn=");
		sb.append(modifiedOn);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public topics toEntityModel() {
		topicsImpl topicsImpl = new topicsImpl();

		topicsImpl.setId(id);

		if (topicName == null) {
			topicsImpl.setTopicName(StringPool.BLANK);
		}
		else {
			topicsImpl.setTopicName(topicName);
		}

		topicsImpl.setFlag(flag);
		topicsImpl.setCreatedBy(createdBy);

		if (createdOn == Long.MIN_VALUE) {
			topicsImpl.setCreatedOn(null);
		}
		else {
			topicsImpl.setCreatedOn(new Date(createdOn));
		}

		topicsImpl.setModifiedBy(modifiedBy);

		if (modifiedOn == Long.MIN_VALUE) {
			topicsImpl.setModifiedOn(null);
		}
		else {
			topicsImpl.setModifiedOn(new Date(modifiedOn));
		}

		topicsImpl.resetOriginalValues();

		return topicsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		topicName = objectInput.readUTF();

		flag = objectInput.readLong();

		createdBy = objectInput.readLong();
		createdOn = objectInput.readLong();

		modifiedBy = objectInput.readLong();
		modifiedOn = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (topicName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(topicName);
		}

		objectOutput.writeLong(flag);

		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(createdOn);

		objectOutput.writeLong(modifiedBy);
		objectOutput.writeLong(modifiedOn);
	}

	public long id;
	public String topicName;
	public long flag;
	public long createdBy;
	public long createdOn;
	public long modifiedBy;
	public long modifiedOn;
}