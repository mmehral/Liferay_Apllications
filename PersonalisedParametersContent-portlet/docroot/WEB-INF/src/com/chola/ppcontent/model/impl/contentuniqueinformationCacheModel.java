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

import com.chola.ppcontent.model.contentuniqueinformation;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing contentuniqueinformation in entity cache.
 *
 * @author cloverliferay01
 * @see contentuniqueinformation
 * @generated
 */
@ProviderType
public class contentuniqueinformationCacheModel implements CacheModel<contentuniqueinformation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof contentuniqueinformationCacheModel)) {
			return false;
		}

		contentuniqueinformationCacheModel contentuniqueinformationCacheModel = (contentuniqueinformationCacheModel)obj;

		if (id == contentuniqueinformationCacheModel.id) {
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
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", status=");
		sb.append(status);
		sb.append(", udflag=");
		sb.append(udflag);
		sb.append(", content_type=");
		sb.append(content_type);
		sb.append(", notification_text=");
		sb.append(notification_text);
		sb.append(", pageurl=");
		sb.append(pageurl);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public contentuniqueinformation toEntityModel() {
		contentuniqueinformationImpl contentuniqueinformationImpl = new contentuniqueinformationImpl();

		contentuniqueinformationImpl.setId(id);
		contentuniqueinformationImpl.setContent_id(content_id);
		contentuniqueinformationImpl.setStatus(status);
		contentuniqueinformationImpl.setUdflag(udflag);

		if (content_type == null) {
			contentuniqueinformationImpl.setContent_type(StringPool.BLANK);
		}
		else {
			contentuniqueinformationImpl.setContent_type(content_type);
		}

		if (notification_text == null) {
			contentuniqueinformationImpl.setNotification_text(StringPool.BLANK);
		}
		else {
			contentuniqueinformationImpl.setNotification_text(notification_text);
		}

		if (pageurl == null) {
			contentuniqueinformationImpl.setPageurl(StringPool.BLANK);
		}
		else {
			contentuniqueinformationImpl.setPageurl(pageurl);
		}

		contentuniqueinformationImpl.resetOriginalValues();

		return contentuniqueinformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();

		status = objectInput.readLong();

		udflag = objectInput.readLong();
		content_type = objectInput.readUTF();
		notification_text = objectInput.readUTF();
		pageurl = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

		objectOutput.writeLong(status);

		objectOutput.writeLong(udflag);

		if (content_type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content_type);
		}

		if (notification_text == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notification_text);
		}

		if (pageurl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(pageurl);
		}
	}

	public long id;
	public long content_id;
	public long status;
	public long udflag;
	public String content_type;
	public String notification_text;
	public String pageurl;
}