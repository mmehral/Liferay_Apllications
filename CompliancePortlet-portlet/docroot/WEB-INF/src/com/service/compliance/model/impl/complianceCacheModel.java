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

package com.service.compliance.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.service.compliance.model.compliance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing compliance in entity cache.
 *
 * @author adms.java1
 * @see compliance
 * @generated
 */
@ProviderType
public class complianceCacheModel implements CacheModel<compliance>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof complianceCacheModel)) {
			return false;
		}

		complianceCacheModel complianceCacheModel = (complianceCacheModel)obj;

		if (compliance_id == complianceCacheModel.compliance_id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, compliance_id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{compliance_id=");
		sb.append(compliance_id);
		sb.append(", compliance_tite=");
		sb.append(compliance_tite);
		sb.append(", compliance_shortdescription=");
		sb.append(compliance_shortdescription);
		sb.append(", compliance_description=");
		sb.append(compliance_description);
		sb.append(", compliance_document_name=");
		sb.append(compliance_document_name);
		sb.append(", compliance_document_extension=");
		sb.append(compliance_document_extension);
		sb.append(", compliance_document_path=");
		sb.append(compliance_document_path);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public compliance toEntityModel() {
		complianceImpl complianceImpl = new complianceImpl();

		complianceImpl.setCompliance_id(compliance_id);

		if (compliance_tite == null) {
			complianceImpl.setCompliance_tite(StringPool.BLANK);
		}
		else {
			complianceImpl.setCompliance_tite(compliance_tite);
		}

		if (compliance_shortdescription == null) {
			complianceImpl.setCompliance_shortdescription(StringPool.BLANK);
		}
		else {
			complianceImpl.setCompliance_shortdescription(compliance_shortdescription);
		}

		if (compliance_description == null) {
			complianceImpl.setCompliance_description(StringPool.BLANK);
		}
		else {
			complianceImpl.setCompliance_description(compliance_description);
		}

		if (compliance_document_name == null) {
			complianceImpl.setCompliance_document_name(StringPool.BLANK);
		}
		else {
			complianceImpl.setCompliance_document_name(compliance_document_name);
		}

		if (compliance_document_extension == null) {
			complianceImpl.setCompliance_document_extension(StringPool.BLANK);
		}
		else {
			complianceImpl.setCompliance_document_extension(compliance_document_extension);
		}

		if (compliance_document_path == null) {
			complianceImpl.setCompliance_document_path(StringPool.BLANK);
		}
		else {
			complianceImpl.setCompliance_document_path(compliance_document_path);
		}

		if (createDate == Long.MIN_VALUE) {
			complianceImpl.setCreateDate(null);
		}
		else {
			complianceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			complianceImpl.setModifiedDate(null);
		}
		else {
			complianceImpl.setModifiedDate(new Date(modifiedDate));
		}

		complianceImpl.resetOriginalValues();

		return complianceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		compliance_id = objectInput.readLong();
		compliance_tite = objectInput.readUTF();
		compliance_shortdescription = objectInput.readUTF();
		compliance_description = objectInput.readUTF();
		compliance_document_name = objectInput.readUTF();
		compliance_document_extension = objectInput.readUTF();
		compliance_document_path = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(compliance_id);

		if (compliance_tite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(compliance_tite);
		}

		if (compliance_shortdescription == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(compliance_shortdescription);
		}

		if (compliance_description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(compliance_description);
		}

		if (compliance_document_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(compliance_document_name);
		}

		if (compliance_document_extension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(compliance_document_extension);
		}

		if (compliance_document_path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(compliance_document_path);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long compliance_id;
	public String compliance_tite;
	public String compliance_shortdescription;
	public String compliance_description;
	public String compliance_document_name;
	public String compliance_document_extension;
	public String compliance_document_path;
	public long createDate;
	public long modifiedDate;
}