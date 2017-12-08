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
 * This class is used by SOAP remote services, specifically {@link com.chola.knowledgebites.service.http.kbpathServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.knowledgebites.service.http.kbpathServiceSoap
 * @generated
 */
@ProviderType
public class kbpathSoap implements Serializable {
	public static kbpathSoap toSoapModel(kbpath model) {
		kbpathSoap soapModel = new kbpathSoap();

		soapModel.setId(model.getId());
		soapModel.setKbfiledoc(model.getKbfiledoc());
		soapModel.setKbfilepath(model.getKbfilepath());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setFlag(model.getFlag());
		soapModel.setKbdetails_id(model.getKbdetails_id());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setKbfilename(model.getKbfilename());

		return soapModel;
	}

	public static kbpathSoap[] toSoapModels(kbpath[] models) {
		kbpathSoap[] soapModels = new kbpathSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static kbpathSoap[][] toSoapModels(kbpath[][] models) {
		kbpathSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new kbpathSoap[models.length][models[0].length];
		}
		else {
			soapModels = new kbpathSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static kbpathSoap[] toSoapModels(List<kbpath> models) {
		List<kbpathSoap> soapModels = new ArrayList<kbpathSoap>(models.size());

		for (kbpath model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new kbpathSoap[soapModels.size()]);
	}

	public kbpathSoap() {
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

	public String getKbfiledoc() {
		return _kbfiledoc;
	}

	public void setKbfiledoc(String kbfiledoc) {
		_kbfiledoc = kbfiledoc;
	}

	public String getKbfilepath() {
		return _kbfilepath;
	}

	public void setKbfilepath(String kbfilepath) {
		_kbfilepath = kbfilepath;
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

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	public long getKbdetails_id() {
		return _kbdetails_id;
	}

	public void setKbdetails_id(long kbdetails_id) {
		_kbdetails_id = kbdetails_id;
	}

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public String getKbfilename() {
		return _kbfilename;
	}

	public void setKbfilename(String kbfilename) {
		_kbfilename = kbfilename;
	}

	private long _id;
	private String _kbfiledoc;
	private String _kbfilepath;
	private Date _createdDate;
	private long _createdBy;
	private String _flag;
	private long _kbdetails_id;
	private long _content_id;
	private String _kbfilename;
}