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

package com.branchdetails.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.branchdetails.model.product;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing product in entity cache.
 *
 * @author adms.java1
 * @see product
 * @generated
 */
@ProviderType
public class productCacheModel implements CacheModel<product>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof productCacheModel)) {
			return false;
		}

		productCacheModel productCacheModel = (productCacheModel)obj;

		if (product_id == productCacheModel.product_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, product_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{product_id=");
		sb.append(product_id);
		sb.append(", product_name=");
		sb.append(product_name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public product toEntityModel() {
		productImpl productImpl = new productImpl();

		productImpl.setProduct_id(product_id);

		if (product_name == null) {
			productImpl.setProduct_name(StringPool.BLANK);
		}
		else {
			productImpl.setProduct_name(product_name);
		}

		productImpl.resetOriginalValues();

		return productImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		product_id = objectInput.readLong();
		product_name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(product_id);

		if (product_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(product_name);
		}
	}

	public long product_id;
	public String product_name;
}