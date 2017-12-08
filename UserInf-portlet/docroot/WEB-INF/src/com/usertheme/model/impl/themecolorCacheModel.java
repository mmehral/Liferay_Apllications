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

package com.usertheme.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.usertheme.model.themecolor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing themecolor in entity cache.
 *
 * @author CloverLiferay02
 * @see themecolor
 * @generated
 */
@ProviderType
public class themecolorCacheModel implements CacheModel<themecolor>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof themecolorCacheModel)) {
			return false;
		}

		themecolorCacheModel themecolorCacheModel = (themecolorCacheModel)obj;

		if (id == themecolorCacheModel.id) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append(", color=");
		sb.append(color);
		sb.append(", updatedDate=");
		sb.append(updatedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public themecolor toEntityModel() {
		themecolorImpl themecolorImpl = new themecolorImpl();

		themecolorImpl.setId(id);

		if (user_id == null) {
			themecolorImpl.setUser_id(StringPool.BLANK);
		}
		else {
			themecolorImpl.setUser_id(user_id);
		}

		if (color == null) {
			themecolorImpl.setColor(StringPool.BLANK);
		}
		else {
			themecolorImpl.setColor(color);
		}

		if (updatedDate == Long.MIN_VALUE) {
			themecolorImpl.setUpdatedDate(null);
		}
		else {
			themecolorImpl.setUpdatedDate(new Date(updatedDate));
		}

		themecolorImpl.resetOriginalValues();

		return themecolorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		user_id = objectInput.readUTF();
		color = objectInput.readUTF();
		updatedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (user_id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(user_id);
		}

		if (color == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(color);
		}

		objectOutput.writeLong(updatedDate);
	}

	public long id;
	public String user_id;
	public String color;
	public long updatedDate;
}