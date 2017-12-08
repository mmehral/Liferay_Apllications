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

package com.chola.bsop.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.bsop.service.http.bsoppathServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.bsop.service.http.bsoppathServiceSoap
 * @generated
 */
@ProviderType
public class bsoppathSoap implements Serializable {
	public static bsoppathSoap toSoapModel(bsoppath model) {
		bsoppathSoap soapModel = new bsoppathSoap();

		soapModel.setId(model.getId());
		soapModel.setBdoc(model.getBdoc());
		soapModel.setBpath(model.getBpath());
		soapModel.setCreateddate(model.getCreateddate());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setFlag(model.getFlag());
		soapModel.setBdetails_id(model.getBdetails_id());
		soapModel.setBdetailscontent_id(model.getBdetailscontent_id());
		soapModel.setFilename(model.getFilename());

		return soapModel;
	}

	public static bsoppathSoap[] toSoapModels(bsoppath[] models) {
		bsoppathSoap[] soapModels = new bsoppathSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bsoppathSoap[][] toSoapModels(bsoppath[][] models) {
		bsoppathSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bsoppathSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bsoppathSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bsoppathSoap[] toSoapModels(List<bsoppath> models) {
		List<bsoppathSoap> soapModels = new ArrayList<bsoppathSoap>(models.size());

		for (bsoppath model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bsoppathSoap[soapModels.size()]);
	}

	public bsoppathSoap() {
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

	public String getBdoc() {
		return _bdoc;
	}

	public void setBdoc(String bdoc) {
		_bdoc = bdoc;
	}

	public String getBpath() {
		return _bpath;
	}

	public void setBpath(String bpath) {
		_bpath = bpath;
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

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	public long getBdetails_id() {
		return _bdetails_id;
	}

	public void setBdetails_id(long bdetails_id) {
		_bdetails_id = bdetails_id;
	}

	public long getBdetailscontent_id() {
		return _bdetailscontent_id;
	}

	public void setBdetailscontent_id(long bdetailscontent_id) {
		_bdetailscontent_id = bdetailscontent_id;
	}

	public String getFilename() {
		return _filename;
	}

	public void setFilename(String filename) {
		_filename = filename;
	}

	private long _id;
	private String _bdoc;
	private String _bpath;
	private Date _createddate;
	private String _createdby;
	private String _flag;
	private long _bdetails_id;
	private long _bdetailscontent_id;
	private String _filename;
}