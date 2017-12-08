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

package com.chola.service.conference.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.service.conference.service.http.locationServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.service.conference.service.http.locationServiceSoap
 * @generated
 */
@ProviderType
public class locationSoap implements Serializable {
	public static locationSoap toSoapModel(location model) {
		locationSoap soapModel = new locationSoap();

		soapModel.setLocation_id(model.getLocation_id());
		soapModel.setLocation_name(model.getLocation_name());
		soapModel.setState_id(model.getState_id());

		return soapModel;
	}

	public static locationSoap[] toSoapModels(location[] models) {
		locationSoap[] soapModels = new locationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static locationSoap[][] toSoapModels(location[][] models) {
		locationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new locationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new locationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static locationSoap[] toSoapModels(List<location> models) {
		List<locationSoap> soapModels = new ArrayList<locationSoap>(models.size());

		for (location model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new locationSoap[soapModels.size()]);
	}

	public locationSoap() {
	}

	public long getPrimaryKey() {
		return _location_id;
	}

	public void setPrimaryKey(long pk) {
		setLocation_id(pk);
	}

	public long getLocation_id() {
		return _location_id;
	}

	public void setLocation_id(long location_id) {
		_location_id = location_id;
	}

	public String getLocation_name() {
		return _location_name;
	}

	public void setLocation_name(String location_name) {
		_location_name = location_name;
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	private long _location_id;
	private String _location_name;
	private long _state_id;
}