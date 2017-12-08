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
 * This class is used by SOAP remote services, specifically {@link com.chola.listbranch.service.http.stateServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.listbranch.service.http.stateServiceSoap
 * @generated
 */
@ProviderType
public class stateSoap implements Serializable {
	public static stateSoap toSoapModel(state model) {
		stateSoap soapModel = new stateSoap();

		soapModel.setState_id(model.getState_id());
		soapModel.setState_name(model.getState_name());

		return soapModel;
	}

	public static stateSoap[] toSoapModels(state[] models) {
		stateSoap[] soapModels = new stateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static stateSoap[][] toSoapModels(state[][] models) {
		stateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new stateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new stateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static stateSoap[] toSoapModels(List<state> models) {
		List<stateSoap> soapModels = new ArrayList<stateSoap>(models.size());

		for (state model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new stateSoap[soapModels.size()]);
	}

	public stateSoap() {
	}

	public long getPrimaryKey() {
		return _state_id;
	}

	public void setPrimaryKey(long pk) {
		setState_id(pk);
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public String getState_name() {
		return _state_name;
	}

	public void setState_name(String state_name) {
		_state_name = state_name;
	}

	private long _state_id;
	private String _state_name;
}