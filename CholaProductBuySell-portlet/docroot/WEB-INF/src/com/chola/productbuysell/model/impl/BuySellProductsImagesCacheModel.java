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

package com.chola.productbuysell.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.productbuysell.model.BuySellProductsImages;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing BuySellProductsImages in entity cache.
 *
 * @author CloverLiferay03
 * @see BuySellProductsImages
 * @generated
 */
@ProviderType
public class BuySellProductsImagesCacheModel implements CacheModel<BuySellProductsImages>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BuySellProductsImagesCacheModel)) {
			return false;
		}

		BuySellProductsImagesCacheModel buySellProductsImagesCacheModel = (BuySellProductsImagesCacheModel)obj;

		if (id == buySellProductsImagesCacheModel.id) {
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
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", image_name=");
		sb.append(image_name);
		sb.append(", image_path=");
		sb.append(image_path);
		sb.append(", product_id=");
		sb.append(product_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BuySellProductsImages toEntityModel() {
		BuySellProductsImagesImpl buySellProductsImagesImpl = new BuySellProductsImagesImpl();

		buySellProductsImagesImpl.setId(id);
		buySellProductsImagesImpl.setContent_id(content_id);

		if (image_name == null) {
			buySellProductsImagesImpl.setImage_name(StringPool.BLANK);
		}
		else {
			buySellProductsImagesImpl.setImage_name(image_name);
		}

		if (image_path == null) {
			buySellProductsImagesImpl.setImage_path(StringPool.BLANK);
		}
		else {
			buySellProductsImagesImpl.setImage_path(image_path);
		}

		buySellProductsImagesImpl.setProduct_id(product_id);

		buySellProductsImagesImpl.resetOriginalValues();

		return buySellProductsImagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		content_id = objectInput.readLong();
		image_name = objectInput.readUTF();
		image_path = objectInput.readUTF();

		product_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(content_id);

		if (image_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image_name);
		}

		if (image_path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image_path);
		}

		objectOutput.writeLong(product_id);
	}

	public long id;
	public long content_id;
	public String image_name;
	public String image_path;
	public long product_id;
}