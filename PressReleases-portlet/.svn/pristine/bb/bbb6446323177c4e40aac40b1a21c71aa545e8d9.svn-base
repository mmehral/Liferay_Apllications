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

package com.chola.pressrelease.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.pressrelease.model.pressrelease;

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
 * The cache model class for representing pressrelease in entity cache.
 *
 * @author CloverLiferay02
 * @see pressrelease
 * @generated
 */
@ProviderType
public class pressreleaseCacheModel implements CacheModel<pressrelease>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof pressreleaseCacheModel)) {
			return false;
		}

		pressreleaseCacheModel pressreleaseCacheModel = (pressreleaseCacheModel)obj;

		if (id == pressreleaseCacheModel.id) {
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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", details=");
		sb.append(details);
		sb.append(", updatedon=");
		sb.append(updatedon);
		sb.append(", updatedby=");
		sb.append(updatedby);
		sb.append(", uniquecontentid=");
		sb.append(uniquecontentid);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public pressrelease toEntityModel() {
		pressreleaseImpl pressreleaseImpl = new pressreleaseImpl();

		pressreleaseImpl.setId(id);

		if (details == null) {
			pressreleaseImpl.setDetails(StringPool.BLANK);
		}
		else {
			pressreleaseImpl.setDetails(details);
		}

		if (updatedon == Long.MIN_VALUE) {
			pressreleaseImpl.setUpdatedon(null);
		}
		else {
			pressreleaseImpl.setUpdatedon(new Date(updatedon));
		}

		pressreleaseImpl.setUpdatedby(updatedby);
		pressreleaseImpl.setUniquecontentid(uniquecontentid);

		pressreleaseImpl.resetOriginalValues();

		return pressreleaseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		details = objectInput.readUTF();
		updatedon = objectInput.readLong();

		updatedby = objectInput.readLong();

		uniquecontentid = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (details == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(details);
		}

		objectOutput.writeLong(updatedon);

		objectOutput.writeLong(updatedby);

		objectOutput.writeLong(uniquecontentid);
	}

	public long id;
	public String details;
	public long updatedon;
	public long updatedby;
	public long uniquecontentid;
}