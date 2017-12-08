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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.swagatam.service.http.swagatamdataServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.swagatam.service.http.swagatamdataServiceSoap
 * @generated
 */
@ProviderType
public class swagatamdataSoap implements Serializable {
	public static swagatamdataSoap toSoapModel(swagatamdata model) {
		swagatamdataSoap soapModel = new swagatamdataSoap();

		soapModel.setId(model.getId());
		soapModel.setEmpId(model.getEmpId());
		soapModel.setWatched(model.getWatched());
		soapModel.setAcknowledged(model.getAcknowledged());

		return soapModel;
	}

	public static swagatamdataSoap[] toSoapModels(swagatamdata[] models) {
		swagatamdataSoap[] soapModels = new swagatamdataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static swagatamdataSoap[][] toSoapModels(swagatamdata[][] models) {
		swagatamdataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new swagatamdataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new swagatamdataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static swagatamdataSoap[] toSoapModels(List<swagatamdata> models) {
		List<swagatamdataSoap> soapModels = new ArrayList<swagatamdataSoap>(models.size());

		for (swagatamdata model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new swagatamdataSoap[soapModels.size()]);
	}

	public swagatamdataSoap() {
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

	public String getEmpId() {
		return _empId;
	}

	public void setEmpId(String empId) {
		_empId = empId;
	}

	public String getWatched() {
		return _watched;
	}

	public void setWatched(String watched) {
		_watched = watched;
	}

	public String getAcknowledged() {
		return _acknowledged;
	}

	public void setAcknowledged(String acknowledged) {
		_acknowledged = acknowledged;
	}

	private long _id;
	private String _empId;
	private String _watched;
	private String _acknowledged;
}