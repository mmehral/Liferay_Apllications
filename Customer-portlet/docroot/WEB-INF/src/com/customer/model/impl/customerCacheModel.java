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

package com.customer.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.customer.model.customer;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing customer in entity cache.
 *
 * @author CloverLiferay01
 * @see customer
 * @generated
 */
@ProviderType
public class customerCacheModel implements CacheModel<customer>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof customerCacheModel)) {
			return false;
		}

		customerCacheModel customerCacheModel = (customerCacheModel)obj;

		if (customerId == customerCacheModel.customerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, customerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{customerId=");
		sb.append(customerId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", product=");
		sb.append(product);
		sb.append(", PhoneNo=");
		sb.append(PhoneNo);
		sb.append(", price=");
		sb.append(price);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public customer toEntityModel() {
		customerImpl customerImpl = new customerImpl();

		customerImpl.setCustomerId(customerId);

		if (name == null) {
			customerImpl.setName(StringPool.BLANK);
		}
		else {
			customerImpl.setName(name);
		}

		if (product == null) {
			customerImpl.setProduct(StringPool.BLANK);
		}
		else {
			customerImpl.setProduct(product);
		}

		customerImpl.setPhoneNo(PhoneNo);
		customerImpl.setPrice(price);

		if (email == null) {
			customerImpl.setEmail(StringPool.BLANK);
		}
		else {
			customerImpl.setEmail(email);
		}

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		customerId = objectInput.readLong();
		name = objectInput.readUTF();
		product = objectInput.readUTF();

		PhoneNo = objectInput.readInt();

		price = objectInput.readFloat();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(customerId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (product == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(product);
		}

		objectOutput.writeInt(PhoneNo);

		objectOutput.writeFloat(price);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long customerId;
	public String name;
	public String product;
	public int PhoneNo;
	public float price;
	public String email;
}