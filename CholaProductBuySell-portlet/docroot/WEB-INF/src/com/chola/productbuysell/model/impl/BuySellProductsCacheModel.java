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

import com.chola.productbuysell.model.BuySellProducts;

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
 * The cache model class for representing BuySellProducts in entity cache.
 *
 * @author CloverLiferay03
 * @see BuySellProducts
 * @generated
 */
@ProviderType
public class BuySellProductsCacheModel implements CacheModel<BuySellProducts>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BuySellProductsCacheModel)) {
			return false;
		}

		BuySellProductsCacheModel buySellProductsCacheModel = (BuySellProductsCacheModel)obj;

		if (id == buySellProductsCacheModel.id) {
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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", sellerName=");
		sb.append(sellerName);
		sb.append(", contactNumber=");
		sb.append(contactNumber);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", category_id=");
		sb.append(category_id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", askingPrice=");
		sb.append(askingPrice);
		sb.append(", userScreenName=");
		sb.append(userScreenName);
		sb.append(", location=");
		sb.append(location);
		sb.append(", status=");
		sb.append(status);
		sb.append(", approvedstatus=");
		sb.append(approvedstatus);
		sb.append(", created_date=");
		sb.append(created_date);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BuySellProducts toEntityModel() {
		BuySellProductsImpl buySellProductsImpl = new BuySellProductsImpl();

		buySellProductsImpl.setId(id);

		if (sellerName == null) {
			buySellProductsImpl.setSellerName(StringPool.BLANK);
		}
		else {
			buySellProductsImpl.setSellerName(sellerName);
		}

		if (contactNumber == null) {
			buySellProductsImpl.setContactNumber(StringPool.BLANK);
		}
		else {
			buySellProductsImpl.setContactNumber(contactNumber);
		}

		buySellProductsImpl.setContent_id(content_id);
		buySellProductsImpl.setCategory_id(category_id);

		if (title == null) {
			buySellProductsImpl.setTitle(StringPool.BLANK);
		}
		else {
			buySellProductsImpl.setTitle(title);
		}

		if (description == null) {
			buySellProductsImpl.setDescription(StringPool.BLANK);
		}
		else {
			buySellProductsImpl.setDescription(description);
		}

		if (askingPrice == null) {
			buySellProductsImpl.setAskingPrice(StringPool.BLANK);
		}
		else {
			buySellProductsImpl.setAskingPrice(askingPrice);
		}

		if (userScreenName == null) {
			buySellProductsImpl.setUserScreenName(StringPool.BLANK);
		}
		else {
			buySellProductsImpl.setUserScreenName(userScreenName);
		}

		buySellProductsImpl.setLocation(location);
		buySellProductsImpl.setStatus(status);
		buySellProductsImpl.setApprovedstatus(approvedstatus);

		if (created_date == Long.MIN_VALUE) {
			buySellProductsImpl.setCreated_date(null);
		}
		else {
			buySellProductsImpl.setCreated_date(new Date(created_date));
		}

		buySellProductsImpl.resetOriginalValues();

		return buySellProductsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		sellerName = objectInput.readUTF();
		contactNumber = objectInput.readUTF();

		content_id = objectInput.readLong();

		category_id = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		askingPrice = objectInput.readUTF();
		userScreenName = objectInput.readUTF();

		location = objectInput.readLong();

		status = objectInput.readLong();

		approvedstatus = objectInput.readLong();
		created_date = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (sellerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sellerName);
		}

		if (contactNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactNumber);
		}

		objectOutput.writeLong(content_id);

		objectOutput.writeLong(category_id);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (askingPrice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(askingPrice);
		}

		if (userScreenName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userScreenName);
		}

		objectOutput.writeLong(location);

		objectOutput.writeLong(status);

		objectOutput.writeLong(approvedstatus);
		objectOutput.writeLong(created_date);
	}

	public long id;
	public String sellerName;
	public String contactNumber;
	public long content_id;
	public long category_id;
	public String title;
	public String description;
	public String askingPrice;
	public String userScreenName;
	public long location;
	public long status;
	public long approvedstatus;
	public long created_date;
}