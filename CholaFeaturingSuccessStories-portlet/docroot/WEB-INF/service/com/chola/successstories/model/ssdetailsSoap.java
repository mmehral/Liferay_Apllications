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

package com.chola.successstories.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.successstories.service.http.ssdetailsServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.successstories.service.http.ssdetailsServiceSoap
 * @generated
 */
@ProviderType
public class ssdetailsSoap implements Serializable {
	public static ssdetailsSoap toSoapModel(ssdetails model) {
		ssdetailsSoap soapModel = new ssdetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setSstitle(model.getSstitle());
		soapModel.setSsdesc(model.getSsdesc());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static ssdetailsSoap[] toSoapModels(ssdetails[] models) {
		ssdetailsSoap[] soapModels = new ssdetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ssdetailsSoap[][] toSoapModels(ssdetails[][] models) {
		ssdetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ssdetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ssdetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ssdetailsSoap[] toSoapModels(List<ssdetails> models) {
		List<ssdetailsSoap> soapModels = new ArrayList<ssdetailsSoap>(models.size());

		for (ssdetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ssdetailsSoap[soapModels.size()]);
	}

	public ssdetailsSoap() {
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

	public String getSstitle() {
		return _sstitle;
	}

	public void setSstitle(String sstitle) {
		_sstitle = sstitle;
	}

	public String getSsdesc() {
		return _ssdesc;
	}

	public void setSsdesc(String ssdesc) {
		_ssdesc = ssdesc;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
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
	private String _sstitle;
	private String _ssdesc;
	private Date _createdDate;
	private long _createdBy;
	private Date _modifiedDate;
	private long _modifiedBy;
	private String _flag;
}