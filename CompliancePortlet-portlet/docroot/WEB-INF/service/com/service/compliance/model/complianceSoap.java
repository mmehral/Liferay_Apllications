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

package com.service.compliance.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.service.compliance.service.http.complianceServiceSoap}.
 *
 * @author adms.java1
 * @see com.service.compliance.service.http.complianceServiceSoap
 * @generated
 */
@ProviderType
public class complianceSoap implements Serializable {
	public static complianceSoap toSoapModel(compliance model) {
		complianceSoap soapModel = new complianceSoap();

		soapModel.setCompliance_id(model.getCompliance_id());
		soapModel.setCompliance_tite(model.getCompliance_tite());
		soapModel.setCompliance_shortdescription(model.getCompliance_shortdescription());
		soapModel.setCompliance_description(model.getCompliance_description());
		soapModel.setCompliance_document_name(model.getCompliance_document_name());
		soapModel.setCompliance_document_extension(model.getCompliance_document_extension());
		soapModel.setCompliance_document_path(model.getCompliance_document_path());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static complianceSoap[] toSoapModels(compliance[] models) {
		complianceSoap[] soapModels = new complianceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static complianceSoap[][] toSoapModels(compliance[][] models) {
		complianceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new complianceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new complianceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static complianceSoap[] toSoapModels(List<compliance> models) {
		List<complianceSoap> soapModels = new ArrayList<complianceSoap>(models.size());

		for (compliance model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new complianceSoap[soapModels.size()]);
	}

	public complianceSoap() {
	}

	public long getPrimaryKey() {
		return _compliance_id;
	}

	public void setPrimaryKey(long pk) {
		setCompliance_id(pk);
	}

	public long getCompliance_id() {
		return _compliance_id;
	}

	public void setCompliance_id(long compliance_id) {
		_compliance_id = compliance_id;
	}

	public String getCompliance_tite() {
		return _compliance_tite;
	}

	public void setCompliance_tite(String compliance_tite) {
		_compliance_tite = compliance_tite;
	}

	public String getCompliance_shortdescription() {
		return _compliance_shortdescription;
	}

	public void setCompliance_shortdescription(
		String compliance_shortdescription) {
		_compliance_shortdescription = compliance_shortdescription;
	}

	public String getCompliance_description() {
		return _compliance_description;
	}

	public void setCompliance_description(String compliance_description) {
		_compliance_description = compliance_description;
	}

	public String getCompliance_document_name() {
		return _compliance_document_name;
	}

	public void setCompliance_document_name(String compliance_document_name) {
		_compliance_document_name = compliance_document_name;
	}

	public String getCompliance_document_extension() {
		return _compliance_document_extension;
	}

	public void setCompliance_document_extension(
		String compliance_document_extension) {
		_compliance_document_extension = compliance_document_extension;
	}

	public String getCompliance_document_path() {
		return _compliance_document_path;
	}

	public void setCompliance_document_path(String compliance_document_path) {
		_compliance_document_path = compliance_document_path;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _compliance_id;
	private String _compliance_tite;
	private String _compliance_shortdescription;
	private String _compliance_description;
	private String _compliance_document_name;
	private String _compliance_document_extension;
	private String _compliance_document_path;
	private Date _createDate;
	private Date _modifiedDate;
}