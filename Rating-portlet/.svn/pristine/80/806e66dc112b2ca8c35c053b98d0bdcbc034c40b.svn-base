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

package com.chola.rating.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.rating.model.Rating;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Rating in entity cache.
 *
 * @author CloverLiferay03
 * @see Rating
 * @generated
 */
@ProviderType
public class RatingCacheModel implements CacheModel<Rating>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RatingCacheModel)) {
			return false;
		}

		RatingCacheModel ratingCacheModel = (RatingCacheModel)obj;

		if (ratingId == ratingCacheModel.ratingId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ratingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{ratingId=");
		sb.append(ratingId);
		sb.append(", content=");
		sb.append(content);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Rating toEntityModel() {
		RatingImpl ratingImpl = new RatingImpl();

		ratingImpl.setRatingId(ratingId);

		if (content == null) {
			ratingImpl.setContent(StringPool.BLANK);
		}
		else {
			ratingImpl.setContent(content);
		}

		ratingImpl.resetOriginalValues();

		return ratingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ratingId = objectInput.readLong();
		content = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ratingId);

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}
	}

	public long ratingId;
	public String content;
}