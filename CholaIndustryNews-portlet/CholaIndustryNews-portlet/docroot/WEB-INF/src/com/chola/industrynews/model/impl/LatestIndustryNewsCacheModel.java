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

package com.chola.industrynews.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.industrynews.model.LatestIndustryNews;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LatestIndustryNews in entity cache.
 *
 * @author CloverLiferay01
 * @see LatestIndustryNews
 * @generated
 */
@ProviderType
public class LatestIndustryNewsCacheModel implements CacheModel<LatestIndustryNews>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LatestIndustryNewsCacheModel)) {
			return false;
		}

		LatestIndustryNewsCacheModel latestIndustryNewsCacheModel = (LatestIndustryNewsCacheModel)obj;

		if (id == latestIndustryNewsCacheModel.id) {
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
		sb.append(", title=");
		sb.append(title);
		sb.append(", content=");
		sb.append(content);
		sb.append(", createdate=");
		sb.append(createdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LatestIndustryNews toEntityModel() {
		LatestIndustryNewsImpl latestIndustryNewsImpl = new LatestIndustryNewsImpl();

		latestIndustryNewsImpl.setId(id);

		if (title == null) {
			latestIndustryNewsImpl.setTitle(StringPool.BLANK);
		}
		else {
			latestIndustryNewsImpl.setTitle(title);
		}

		if (content == null) {
			latestIndustryNewsImpl.setContent(StringPool.BLANK);
		}
		else {
			latestIndustryNewsImpl.setContent(content);
		}

		if (createdate == null) {
			latestIndustryNewsImpl.setCreatedate(StringPool.BLANK);
		}
		else {
			latestIndustryNewsImpl.setCreatedate(createdate);
		}

		latestIndustryNewsImpl.resetOriginalValues();

		return latestIndustryNewsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		title = objectInput.readUTF();
		content = objectInput.readUTF();
		createdate = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		if (createdate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdate);
		}
	}

	public long id;
	public String title;
	public String content;
	public String createdate;
}