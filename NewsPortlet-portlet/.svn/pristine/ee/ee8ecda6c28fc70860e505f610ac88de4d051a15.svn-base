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

package com.chola.news.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.news.model.Around_World;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Around_World in entity cache.
 *
 * @author adms.java1
 * @see Around_World
 * @generated
 */
@ProviderType
public class Around_WorldCacheModel implements CacheModel<Around_World>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Around_WorldCacheModel)) {
			return false;
		}

		Around_WorldCacheModel around_WorldCacheModel = (Around_WorldCacheModel)obj;

		if (id == around_WorldCacheModel.id) {
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
		sb.append(", news=");
		sb.append(news);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Around_World toEntityModel() {
		Around_WorldImpl around_WorldImpl = new Around_WorldImpl();

		around_WorldImpl.setId(id);

		if (news == null) {
			around_WorldImpl.setNews(StringPool.BLANK);
		}
		else {
			around_WorldImpl.setNews(news);
		}

		around_WorldImpl.resetOriginalValues();

		return around_WorldImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		news = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (news == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(news);
		}
	}

	public long id;
	public String news;
}