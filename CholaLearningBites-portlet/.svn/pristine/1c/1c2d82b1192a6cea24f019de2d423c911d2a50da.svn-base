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

package com.chola.learningbites.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.learningbites.service.http.lbdetailsServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.learningbites.service.http.lbdetailsServiceSoap
 * @generated
 */
@ProviderType
public class lbdetailsSoap implements Serializable {
	public static lbdetailsSoap toSoapModel(lbdetails model) {
		lbdetailsSoap soapModel = new lbdetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setLbtitle(model.getLbtitle());
		soapModel.setLbdescription(model.getLbdescription());
		soapModel.setLbfilename(model.getLbfilename());
		soapModel.setLbfilepath(model.getLbfilepath());
		soapModel.setCreateddate(model.getCreateddate());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setModifieddate(model.getModifieddate());
		soapModel.setModifiedby(model.getModifiedby());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static lbdetailsSoap[] toSoapModels(lbdetails[] models) {
		lbdetailsSoap[] soapModels = new lbdetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static lbdetailsSoap[][] toSoapModels(lbdetails[][] models) {
		lbdetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new lbdetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new lbdetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static lbdetailsSoap[] toSoapModels(List<lbdetails> models) {
		List<lbdetailsSoap> soapModels = new ArrayList<lbdetailsSoap>(models.size());

		for (lbdetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new lbdetailsSoap[soapModels.size()]);
	}

	public lbdetailsSoap() {
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

	public String getLbtitle() {
		return _lbtitle;
	}

	public void setLbtitle(String lbtitle) {
		_lbtitle = lbtitle;
	}

	public String getLbdescription() {
		return _lbdescription;
	}

	public void setLbdescription(String lbdescription) {
		_lbdescription = lbdescription;
	}

	public String getLbfilename() {
		return _lbfilename;
	}

	public void setLbfilename(String lbfilename) {
		_lbfilename = lbfilename;
	}

	public String getLbfilepath() {
		return _lbfilepath;
	}

	public void setLbfilepath(String lbfilepath) {
		_lbfilepath = lbfilepath;
	}

	public Date getCreateddate() {
		return _createddate;
	}

	public void setCreateddate(Date createddate) {
		_createddate = createddate;
	}

	public long getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	public Date getModifieddate() {
		return _modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		_modifieddate = modifieddate;
	}

	public long getModifiedby() {
		return _modifiedby;
	}

	public void setModifiedby(long modifiedby) {
		_modifiedby = modifiedby;
	}

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	private long _id;
	private long _content_id;
	private String _lbtitle;
	private String _lbdescription;
	private String _lbfilename;
	private String _lbfilepath;
	private Date _createddate;
	private long _createdby;
	private Date _modifieddate;
	private long _modifiedby;
	private String _flag;
}