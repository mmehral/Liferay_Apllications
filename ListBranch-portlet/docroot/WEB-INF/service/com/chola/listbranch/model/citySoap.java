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

package com.chola.listbranch.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.listbranch.service.http.cityServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.listbranch.service.http.cityServiceSoap
 * @generated
 */
@ProviderType
public class citySoap implements Serializable {
	public static citySoap toSoapModel(city model) {
		citySoap soapModel = new citySoap();

		soapModel.setCity_id(model.getCity_id());
		soapModel.setCity_name(model.getCity_name());
		soapModel.setState_id(model.getState_id());

		return soapModel;
	}

	public static citySoap[] toSoapModels(city[] models) {
		citySoap[] soapModels = new citySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static citySoap[][] toSoapModels(city[][] models) {
		citySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new citySoap[models.length][models[0].length];
		}
		else {
			soapModels = new citySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static citySoap[] toSoapModels(List<city> models) {
		List<citySoap> soapModels = new ArrayList<citySoap>(models.size());

		for (city model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new citySoap[soapModels.size()]);
	}

	public citySoap() {
	}

	public long getPrimaryKey() {
		return _city_id;
	}

	public void setPrimaryKey(long pk) {
		setCity_id(pk);
	}

	public long getCity_id() {
		return _city_id;
	}

	public void setCity_id(long city_id) {
		_city_id = city_id;
	}

	public String getCity_name() {
		return _city_name;
	}

	public void setCity_name(String city_name) {
		_city_name = city_name;
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	private long _city_id;
	private String _city_name;
	private long _state_id;
}