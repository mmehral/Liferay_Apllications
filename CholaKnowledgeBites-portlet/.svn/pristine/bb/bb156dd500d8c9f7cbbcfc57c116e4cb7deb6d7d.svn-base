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

package com.chola.knowledgebites.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.knowledgebites.service.http.kbdetailsServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.knowledgebites.service.http.kbdetailsServiceSoap
 * @generated
 */
@ProviderType
public class kbdetailsSoap implements Serializable {
	public static kbdetailsSoap toSoapModel(kbdetails model) {
		kbdetailsSoap soapModel = new kbdetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setKbtitle(model.getKbtitle());
		soapModel.setKbdesc(model.getKbdesc());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static kbdetailsSoap[] toSoapModels(kbdetails[] models) {
		kbdetailsSoap[] soapModels = new kbdetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static kbdetailsSoap[][] toSoapModels(kbdetails[][] models) {
		kbdetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new kbdetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new kbdetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static kbdetailsSoap[] toSoapModels(List<kbdetails> models) {
		List<kbdetailsSoap> soapModels = new ArrayList<kbdetailsSoap>(models.size());

		for (kbdetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new kbdetailsSoap[soapModels.size()]);
	}

	public kbdetailsSoap() {
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

	public String getKbtitle() {
		return _kbtitle;
	}

	public void setKbtitle(String kbtitle) {
		_kbtitle = kbtitle;
	}

	public String getKbdesc() {
		return _kbdesc;
	}

	public void setKbdesc(String kbdesc) {
		_kbdesc = kbdesc;
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
	private String _kbtitle;
	private String _kbdesc;
	private Date _createdDate;
	private long _createdBy;
	private Date _modifiedDate;
	private long _modifiedBy;
	private String _flag;
}