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

package com.chola.swagatam.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.swagatam.service.http.swagatamServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.swagatam.service.http.swagatamServiceSoap
 * @generated
 */
@ProviderType
public class swagatamSoap implements Serializable {
	public static swagatamSoap toSoapModel(swagatam model) {
		swagatamSoap soapModel = new swagatamSoap();

		soapModel.setId(model.getId());
		soapModel.setInductionid(model.getInductionid());
		soapModel.setTitle(model.getTitle());
		soapModel.setDesc(model.getDesc());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static swagatamSoap[] toSoapModels(swagatam[] models) {
		swagatamSoap[] soapModels = new swagatamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static swagatamSoap[][] toSoapModels(swagatam[][] models) {
		swagatamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new swagatamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new swagatamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static swagatamSoap[] toSoapModels(List<swagatam> models) {
		List<swagatamSoap> soapModels = new ArrayList<swagatamSoap>(models.size());

		for (swagatam model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new swagatamSoap[soapModels.size()]);
	}

	public swagatamSoap() {
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

	public String getInductionid() {
		return _inductionid;
	}

	public void setInductionid(String inductionid) {
		_inductionid = inductionid;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDesc() {
		return _desc;
	}

	public void setDesc(String desc) {
		_desc = desc;
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

	private long _id;
	private String _inductionid;
	private String _title;
	private String _desc;
	private Date _createdDate;
	private String _createdBy;
	private String _flag;
}