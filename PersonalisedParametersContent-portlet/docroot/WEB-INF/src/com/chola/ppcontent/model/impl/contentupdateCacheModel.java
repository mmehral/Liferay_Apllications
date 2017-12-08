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

package com.chola.ppcontent.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.ppcontent.model.contentupdate;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing contentupdate in entity cache.
 *
 * @author cloverliferay01
 * @see contentupdate
 * @generated
 */
@ProviderType
public class contentupdateCacheModel implements CacheModel<contentupdate>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof contentupdateCacheModel)) {
			return false;
		}

		contentupdateCacheModel contentupdateCacheModel = (contentupdateCacheModel)obj;

		if (id == contentupdateCacheModel.id) {
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
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public contentupdate toEntityModel() {
		contentupdateImpl contentupdateImpl = new contentupdateImpl();

		contentupdateImpl.setId(id);
		contentupdateImpl.setContent_id(content_id);

		contentupdateImpl.resetOriginalValues();

		return contentupdateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);
	}

	public long id;
	public long content_id;
}