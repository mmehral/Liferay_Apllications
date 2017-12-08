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

package com.chola.InternalJobRef.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.InternalJobRef.service.http.InternalReferenceServiceSoap}.
 *
 * @author CloverLiferay03
 * @see com.chola.InternalJobRef.service.http.InternalReferenceServiceSoap
 * @generated
 */
@ProviderType
public class InternalReferenceSoap implements Serializable {
	public static InternalReferenceSoap toSoapModel(InternalReference model) {
		InternalReferenceSoap soapModel = new InternalReferenceSoap();

		soapModel.setRefId(model.getRefId());
		soapModel.setTitle(model.getTitle());
		soapModel.setFrom(model.getFrom());
		soapModel.setTo(model.getTo());
		soapModel.setBody(model.getBody());
		soapModel.setFlag(model.getFlag());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static InternalReferenceSoap[] toSoapModels(
		InternalReference[] models) {
		InternalReferenceSoap[] soapModels = new InternalReferenceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InternalReferenceSoap[][] toSoapModels(
		InternalReference[][] models) {
		InternalReferenceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InternalReferenceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InternalReferenceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InternalReferenceSoap[] toSoapModels(
		List<InternalReference> models) {
		List<InternalReferenceSoap> soapModels = new ArrayList<InternalReferenceSoap>(models.size());

		for (InternalReference model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InternalReferenceSoap[soapModels.size()]);
	}

	public InternalReferenceSoap() {
	}

	public long getPrimaryKey() {
		return _refId;
	}

	public void setPrimaryKey(long pk) {
		setRefId(pk);
	}

	public long getRefId() {
		return _refId;
	}

	public void setRefId(long refId) {
		_refId = refId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getFrom() {
		return _from;
	}

	public void setFrom(String from) {
		_from = from;
	}

	public String getTo() {
		return _to;
	}

	public void setTo(String to) {
		_to = to;
	}

	public String getBody() {
		return _body;
	}

	public void setBody(String body) {
		_body = body;
	}

	public long getFlag() {
		return _flag;
	}

	public void setFlag(long flag) {
		_flag = flag;
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

	private long _refId;
	private String _title;
	private String _from;
	private String _to;
	private String _body;
	private long _flag;
	private Date _createDate;
	private Date _modifiedDate;
}