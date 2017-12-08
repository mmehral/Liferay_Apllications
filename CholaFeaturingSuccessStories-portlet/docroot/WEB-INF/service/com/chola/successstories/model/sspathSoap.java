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
 * This class is used by SOAP remote services, specifically {@link com.chola.successstories.service.http.sspathServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.successstories.service.http.sspathServiceSoap
 * @generated
 */
@ProviderType
public class sspathSoap implements Serializable {
	public static sspathSoap toSoapModel(sspath model) {
		sspathSoap soapModel = new sspathSoap();

		soapModel.setId(model.getId());
		soapModel.setSsfiledoc(model.getSsfiledoc());
		soapModel.setSsfilepath(model.getSsfilepath());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setFlag(model.getFlag());
		soapModel.setSsdetails_id(model.getSsdetails_id());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setSsfilename(model.getSsfilename());

		return soapModel;
	}

	public static sspathSoap[] toSoapModels(sspath[] models) {
		sspathSoap[] soapModels = new sspathSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static sspathSoap[][] toSoapModels(sspath[][] models) {
		sspathSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new sspathSoap[models.length][models[0].length];
		}
		else {
			soapModels = new sspathSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static sspathSoap[] toSoapModels(List<sspath> models) {
		List<sspathSoap> soapModels = new ArrayList<sspathSoap>(models.size());

		for (sspath model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new sspathSoap[soapModels.size()]);
	}

	public sspathSoap() {
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

	public String getSsfiledoc() {
		return _ssfiledoc;
	}

	public void setSsfiledoc(String ssfiledoc) {
		_ssfiledoc = ssfiledoc;
	}

	public String getSsfilepath() {
		return _ssfilepath;
	}

	public void setSsfilepath(String ssfilepath) {
		_ssfilepath = ssfilepath;
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

	public long getSsdetails_id() {
		return _ssdetails_id;
	}

	public void setSsdetails_id(long ssdetails_id) {
		_ssdetails_id = ssdetails_id;
	}

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public String getSsfilename() {
		return _ssfilename;
	}

	public void setSsfilename(String ssfilename) {
		_ssfilename = ssfilename;
	}

	private long _id;
	private String _ssfiledoc;
	private String _ssfilepath;
	private Date _createdDate;
	private long _createdBy;
	private String _flag;
	private long _ssdetails_id;
	private long _content_id;
	private String _ssfilename;
}