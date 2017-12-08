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

package com.chola.personalisedparameters.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.personalisedparameters.service.http.bsopdetailsServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.personalisedparameters.service.http.bsopdetailsServiceSoap
 * @generated
 */
@ProviderType
public class bsopdetailsSoap implements Serializable {
	public static bsopdetailsSoap toSoapModel(bsopdetails model) {
		bsopdetailsSoap soapModel = new bsopdetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setBtitle(model.getBtitle());
		soapModel.setBdesc(model.getBdesc());
		soapModel.setCreateddate(model.getCreateddate());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setModifieddate(model.getModifieddate());
		soapModel.setModifiedby(model.getModifiedby());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static bsopdetailsSoap[] toSoapModels(bsopdetails[] models) {
		bsopdetailsSoap[] soapModels = new bsopdetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bsopdetailsSoap[][] toSoapModels(bsopdetails[][] models) {
		bsopdetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bsopdetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bsopdetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bsopdetailsSoap[] toSoapModels(List<bsopdetails> models) {
		List<bsopdetailsSoap> soapModels = new ArrayList<bsopdetailsSoap>(models.size());

		for (bsopdetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bsopdetailsSoap[soapModels.size()]);
	}

	public bsopdetailsSoap() {
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

	public String getBtitle() {
		return _btitle;
	}

	public void setBtitle(String btitle) {
		_btitle = btitle;
	}

	public String getBdesc() {
		return _bdesc;
	}

	public void setBdesc(String bdesc) {
		_bdesc = bdesc;
	}

	public Date getCreateddate() {
		return _createddate;
	}

	public void setCreateddate(Date createddate) {
		_createddate = createddate;
	}

	public String getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(String createdby) {
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
	private String _btitle;
	private String _bdesc;
	private Date _createddate;
	private String _createdby;
	private Date _modifieddate;
	private long _modifiedby;
	private String _flag;
}