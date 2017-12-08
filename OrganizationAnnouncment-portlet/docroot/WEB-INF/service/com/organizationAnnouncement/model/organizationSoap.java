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

package com.organizationAnnouncement.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.organizationAnnouncement.service.http.organizationServiceSoap}.
 *
 * @author adms.java1
 * @see com.organizationAnnouncement.service.http.organizationServiceSoap
 * @generated
 */
@ProviderType
public class organizationSoap implements Serializable {
	public static organizationSoap toSoapModel(organization model) {
		organizationSoap soapModel = new organizationSoap();

		soapModel.setOrganization_id(model.getOrganization_id());
		soapModel.setOrganization_tite(model.getOrganization_tite());
		soapModel.setOrganization_description(model.getOrganization_description());
		soapModel.setOrganization_image_name(model.getOrganization_image_name());
		soapModel.setOrganization_image_path(model.getOrganization_image_path());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static organizationSoap[] toSoapModels(organization[] models) {
		organizationSoap[] soapModels = new organizationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static organizationSoap[][] toSoapModels(organization[][] models) {
		organizationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new organizationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new organizationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static organizationSoap[] toSoapModels(List<organization> models) {
		List<organizationSoap> soapModels = new ArrayList<organizationSoap>(models.size());

		for (organization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new organizationSoap[soapModels.size()]);
	}

	public organizationSoap() {
	}

	public long getPrimaryKey() {
		return _organization_id;
	}

	public void setPrimaryKey(long pk) {
		setOrganization_id(pk);
	}

	public long getOrganization_id() {
		return _organization_id;
	}

	public void setOrganization_id(long organization_id) {
		_organization_id = organization_id;
	}

	public String getOrganization_tite() {
		return _organization_tite;
	}

	public void setOrganization_tite(String organization_tite) {
		_organization_tite = organization_tite;
	}

	public String getOrganization_description() {
		return _organization_description;
	}

	public void setOrganization_description(String organization_description) {
		_organization_description = organization_description;
	}

	public String getOrganization_image_name() {
		return _organization_image_name;
	}

	public void setOrganization_image_name(String organization_image_name) {
		_organization_image_name = organization_image_name;
	}

	public String getOrganization_image_path() {
		return _organization_image_path;
	}

	public void setOrganization_image_path(String organization_image_path) {
		_organization_image_path = organization_image_path;
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

	private long _organization_id;
	private String _organization_tite;
	private String _organization_description;
	private String _organization_image_name;
	private String _organization_image_path;
	private Date _createDate;
	private Date _modifiedDate;
}