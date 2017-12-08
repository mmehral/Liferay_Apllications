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

package com.popular.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.popular.model.externallinks;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing externallinks in entity cache.
 *
 * @author CloverLiferay02
 * @see externallinks
 * @generated
 */
@ProviderType
public class externallinksCacheModel implements CacheModel<externallinks>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof externallinksCacheModel)) {
			return false;
		}

		externallinksCacheModel externallinksCacheModel = (externallinksCacheModel)obj;

		if (id == externallinksCacheModel.id) {
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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tag=");
		sb.append(tag);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public externallinks toEntityModel() {
		externallinksImpl externallinksImpl = new externallinksImpl();

		externallinksImpl.setId(id);

		if (tag == null) {
			externallinksImpl.setTag(StringPool.BLANK);
		}
		else {
			externallinksImpl.setTag(tag);
		}

		if (url == null) {
			externallinksImpl.setUrl(StringPool.BLANK);
		}
		else {
			externallinksImpl.setUrl(url);
		}

		externallinksImpl.resetOriginalValues();

		return externallinksImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tag = objectInput.readUTF();
		url = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (tag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tag);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}
	}

	public long id;
	public String tag;
	public String url;
}