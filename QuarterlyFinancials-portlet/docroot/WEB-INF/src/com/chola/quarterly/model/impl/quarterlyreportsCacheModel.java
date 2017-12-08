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

package com.chola.quarterly.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.quarterly.model.quarterlyreports;

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
 * The cache model class for representing quarterlyreports in entity cache.
 *
 * @author CloverLiferay02
 * @see quarterlyreports
 * @generated
 */
@ProviderType
public class quarterlyreportsCacheModel implements CacheModel<quarterlyreports>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof quarterlyreportsCacheModel)) {
			return false;
		}

		quarterlyreportsCacheModel quarterlyreportsCacheModel = (quarterlyreportsCacheModel)obj;

		if (id == quarterlyreportsCacheModel.id) {
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
	public quarterlyreports toEntityModel() {
		quarterlyreportsImpl quarterlyreportsImpl = new quarterlyreportsImpl();

		quarterlyreportsImpl.setId(id);

		if (details == null) {
			quarterlyreportsImpl.setDetails(StringPool.BLANK);
		}
		else {
			quarterlyreportsImpl.setDetails(details);
		}

		if (updatedon == Long.MIN_VALUE) {
			quarterlyreportsImpl.setUpdatedon(null);
		}
		else {
			quarterlyreportsImpl.setUpdatedon(new Date(updatedon));
		}

		quarterlyreportsImpl.setUpdatedby(updatedby);
		quarterlyreportsImpl.setUniquecontentid(uniquecontentid);

		quarterlyreportsImpl.resetOriginalValues();

		return quarterlyreportsImpl;
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