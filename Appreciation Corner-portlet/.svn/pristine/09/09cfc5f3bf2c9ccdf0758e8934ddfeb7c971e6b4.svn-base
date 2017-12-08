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

package com.chola.app.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.app.model.replied;

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
 * The cache model class for representing replied in entity cache.
 *
 * @author CloverLiferay02
 * @see replied
 * @generated
 */
@ProviderType
public class repliedCacheModel implements CacheModel<replied>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof repliedCacheModel)) {
			return false;
		}

		repliedCacheModel repliedCacheModel = (repliedCacheModel)obj;

		if (id == repliedCacheModel.id) {
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
		sb.append(", repliedOnPost=");
		sb.append(repliedOnPost);
		sb.append(", repliedTo=");
		sb.append(repliedTo);
		sb.append(", repliedBy=");
		sb.append(repliedBy);
		sb.append(", repliedMessage=");
		sb.append(repliedMessage);
		sb.append(", repliedDate=");
		sb.append(repliedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public replied toEntityModel() {
		repliedImpl repliedImpl = new repliedImpl();

		repliedImpl.setId(id);
		repliedImpl.setRepliedOnPost(repliedOnPost);

		if (repliedTo == null) {
			repliedImpl.setRepliedTo(StringPool.BLANK);
		}
		else {
			repliedImpl.setRepliedTo(repliedTo);
		}

		if (repliedBy == null) {
			repliedImpl.setRepliedBy(StringPool.BLANK);
		}
		else {
			repliedImpl.setRepliedBy(repliedBy);
		}

		if (repliedMessage == null) {
			repliedImpl.setRepliedMessage(StringPool.BLANK);
		}
		else {
			repliedImpl.setRepliedMessage(repliedMessage);
		}

		if (repliedDate == Long.MIN_VALUE) {
			repliedImpl.setRepliedDate(null);
		}
		else {
			repliedImpl.setRepliedDate(new Date(repliedDate));
		}

		repliedImpl.resetOriginalValues();

		return repliedImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		repliedOnPost = objectInput.readLong();
		repliedTo = objectInput.readUTF();
		repliedBy = objectInput.readUTF();
		repliedMessage = objectInput.readUTF();
		repliedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(repliedOnPost);

		if (repliedTo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(repliedTo);
		}

		if (repliedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(repliedBy);
		}

		if (repliedMessage == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(repliedMessage);
		}

		objectOutput.writeLong(repliedDate);
	}

	public long id;
	public long repliedOnPost;
	public String repliedTo;
	public String repliedBy;
	public String repliedMessage;
	public long repliedDate;
}