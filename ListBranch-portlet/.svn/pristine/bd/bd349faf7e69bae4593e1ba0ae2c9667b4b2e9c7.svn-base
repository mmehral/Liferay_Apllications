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

package com.chola.listbranch.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.listbranch.model.branchdetails;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing branchdetails in entity cache.
 *
 * @author adms.java1
 * @see branchdetails
 * @generated
 */
@ProviderType
public class branchdetailsCacheModel implements CacheModel<branchdetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof branchdetailsCacheModel)) {
			return false;
		}

		branchdetailsCacheModel branchdetailsCacheModel = (branchdetailsCacheModel)obj;

		if (branch_id == branchdetailsCacheModel.branch_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, branch_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{branch_id=");
		sb.append(branch_id);
		sb.append(", branch_code=");
		sb.append(branch_code);
		sb.append(", branch_address=");
		sb.append(branch_address);
		sb.append(", city_id=");
		sb.append(city_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public branchdetails toEntityModel() {
		branchdetailsImpl branchdetailsImpl = new branchdetailsImpl();

		branchdetailsImpl.setBranch_id(branch_id);

		if (branch_code == null) {
			branchdetailsImpl.setBranch_code(StringPool.BLANK);
		}
		else {
			branchdetailsImpl.setBranch_code(branch_code);
		}

		if (branch_address == null) {
			branchdetailsImpl.setBranch_address(StringPool.BLANK);
		}
		else {
			branchdetailsImpl.setBranch_address(branch_address);
		}

		branchdetailsImpl.setCity_id(city_id);

		branchdetailsImpl.resetOriginalValues();

		return branchdetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		branch_id = objectInput.readLong();
		branch_code = objectInput.readUTF();
		branch_address = objectInput.readUTF();

		city_id = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(branch_id);

		if (branch_code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(branch_code);
		}

		if (branch_address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(branch_address);
		}

		objectOutput.writeLong(city_id);
	}

	public long branch_id;
	public String branch_code;
	public String branch_address;
	public long city_id;
}