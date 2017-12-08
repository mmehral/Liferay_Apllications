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

package com.chola.businessmis.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.businessmis.service.http.businessmisdetailsServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.chola.businessmis.service.http.businessmisdetailsServiceSoap
 * @generated
 */
@ProviderType
public class businessmisdetailsSoap implements Serializable {
	public static businessmisdetailsSoap toSoapModel(businessmisdetails model) {
		businessmisdetailsSoap soapModel = new businessmisdetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setBusinesstitle(model.getBusinesstitle());
		soapModel.setBusinessDesc(model.getBusinessDesc());
		soapModel.setBusinessLink(model.getBusinessLink());
		soapModel.setFilepath(model.getFilepath());
		soapModel.setFilename(model.getFilename());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static businessmisdetailsSoap[] toSoapModels(
		businessmisdetails[] models) {
		businessmisdetailsSoap[] soapModels = new businessmisdetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static businessmisdetailsSoap[][] toSoapModels(
		businessmisdetails[][] models) {
		businessmisdetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new businessmisdetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new businessmisdetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static businessmisdetailsSoap[] toSoapModels(
		List<businessmisdetails> models) {
		List<businessmisdetailsSoap> soapModels = new ArrayList<businessmisdetailsSoap>(models.size());

		for (businessmisdetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new businessmisdetailsSoap[soapModels.size()]);
	}

	public businessmisdetailsSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public String getBusinesstitle() {
		return _businesstitle;
	}

	public void setBusinesstitle(String businesstitle) {
		_businesstitle = businesstitle;
	}

	public String getBusinessDesc() {
		return _businessDesc;
	}

	public void setBusinessDesc(String businessDesc) {
		_businessDesc = businessDesc;
	}

	public String getBusinessLink() {
		return _businessLink;
	}

	public void setBusinessLink(String businessLink) {
		_businessLink = businessLink;
	}

	public String getFilepath() {
		return _filepath;
	}

	public void setFilepath(String filepath) {
		_filepath = filepath;
	}

	public String getFilename() {
		return _filename;
	}

	public void setFilename(String filename) {
		_filename = filename;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	private long _id;
	private long _content_id;
	private String _businesstitle;
	private String _businessDesc;
	private String _businessLink;
	private String _filepath;
	private String _filename;
	private Date _createdDate;
	private String _createdBy;
	private Date _modifiedDate;
	private long _modifiedBy;
	private String _flag;
}