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

package com.chola.trainingcalendar.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.trainingcalendar.service.http.trainingintendedtableServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.http.trainingintendedtableServiceSoap
 * @generated
 */
@ProviderType
public class trainingintendedtableSoap implements Serializable {
	public static trainingintendedtableSoap toSoapModel(
		trainingintendedtable model) {
		trainingintendedtableSoap soapModel = new trainingintendedtableSoap();

		soapModel.setId(model.getId());
		soapModel.setTrainingid(model.getTrainingid());
		soapModel.setUserid(model.getUserid());
		soapModel.setScreenname(model.getScreenname());
		soapModel.setCreateddate(model.getCreateddate());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static trainingintendedtableSoap[] toSoapModels(
		trainingintendedtable[] models) {
		trainingintendedtableSoap[] soapModels = new trainingintendedtableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static trainingintendedtableSoap[][] toSoapModels(
		trainingintendedtable[][] models) {
		trainingintendedtableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new trainingintendedtableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new trainingintendedtableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static trainingintendedtableSoap[] toSoapModels(
		List<trainingintendedtable> models) {
		List<trainingintendedtableSoap> soapModels = new ArrayList<trainingintendedtableSoap>(models.size());

		for (trainingintendedtable model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new trainingintendedtableSoap[soapModels.size()]);
	}

	public trainingintendedtableSoap() {
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

	public long getTrainingid() {
		return _trainingid;
	}

	public void setTrainingid(long trainingid) {
		_trainingid = trainingid;
	}

	public String getUserid() {
		return _userid;
	}

	public void setUserid(String userid) {
		_userid = userid;
	}

	public String getScreenname() {
		return _screenname;
	}

	public void setScreenname(String screenname) {
		_screenname = screenname;
	}

	public Date getCreateddate() {
		return _createddate;
	}

	public void setCreateddate(Date createddate) {
		_createddate = createddate;
	}

	public int getFlag() {
		return _flag;
	}

	public void setFlag(int flag) {
		_flag = flag;
	}

	private long _id;
	private long _trainingid;
	private String _userid;
	private String _screenname;
	private Date _createddate;
	private int _flag;
}