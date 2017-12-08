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
 * This class is used by SOAP remote services, specifically {@link com.chola.business.service.http.businesssoppathServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.business.service.http.businesssoppathServiceSoap
 * @generated
 */
@ProviderType
public class businesssoppathSoap implements Serializable {
	public static businesssoppathSoap toSoapModel(businesssoppath model) {
		businesssoppathSoap soapModel = new businesssoppathSoap();

		soapModel.setId(model.getId());
		soapModel.setBusinessdoc(model.getBusinessdoc());
		soapModel.setBusinessPath(model.getBusinessPath());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setFlag(model.getFlag());
		soapModel.setBusinessdetails_id(model.getBusinessdetails_id());

		return soapModel;
	}

	public static businesssoppathSoap[] toSoapModels(businesssoppath[] models) {
		businesssoppathSoap[] soapModels = new businesssoppathSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static businesssoppathSoap[][] toSoapModels(
		businesssoppath[][] models) {
		businesssoppathSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new businesssoppathSoap[models.length][models[0].length];
		}
		else {
			soapModels = new businesssoppathSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static businesssoppathSoap[] toSoapModels(
		List<businesssoppath> models) {
		List<businesssoppathSoap> soapModels = new ArrayList<businesssoppathSoap>(models.size());

		for (businesssoppath model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new businesssoppathSoap[soapModels.size()]);
	}

	public businesssoppathSoap() {
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

	public String getBusinessdoc() {
		return _businessdoc;
	}

	public void setBusinessdoc(String businessdoc) {
		_businessdoc = businessdoc;
	}

	public String getBusinessPath() {
		return _businessPath;
	}

	public void setBusinessPath(String businessPath) {
		_businessPath = businessPath;
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

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	public long getBusinessdetails_id() {
		return _businessdetails_id;
	}

	public void setBusinessdetails_id(long businessdetails_id) {
		_businessdetails_id = businessdetails_id;
	}

	private long _id;
	private String _businessdoc;
	private String _businessPath;
	private Date _createdDate;
	private String _createdBy;
	private String _flag;
	private long _businessdetails_id;
}