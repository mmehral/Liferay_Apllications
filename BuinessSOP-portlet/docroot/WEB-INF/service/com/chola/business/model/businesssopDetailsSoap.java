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

package com.chola.business.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.business.service.http.businesssopDetailsServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.business.service.http.businesssopDetailsServiceSoap
 * @generated
 */
@ProviderType
public class businesssopDetailsSoap implements Serializable {
	public static businesssopDetailsSoap toSoapModel(businesssopDetails model) {
		businesssopDetailsSoap soapModel = new businesssopDetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setBusinesstitle(model.getBusinesstitle());
		soapModel.setBusinessDesc(model.getBusinessDesc());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static businesssopDetailsSoap[] toSoapModels(
		businesssopDetails[] models) {
		businesssopDetailsSoap[] soapModels = new businesssopDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static businesssopDetailsSoap[][] toSoapModels(
		businesssopDetails[][] models) {
		businesssopDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new businesssopDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new businesssopDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static businesssopDetailsSoap[] toSoapModels(
		List<businesssopDetails> models) {
		List<businesssopDetailsSoap> soapModels = new ArrayList<businesssopDetailsSoap>(models.size());

		for (businesssopDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new businesssopDetailsSoap[soapModels.size()]);
	}

	public businesssopDetailsSoap() {
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
	private String _businesstitle;
	private String _businessDesc;
	private Date _createdDate;
	private String _createdBy;
	private Date _modifiedDate;
	private long _modifiedBy;
	private String _flag;
}