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

package com.chola.conferenceroombooking.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.conferenceroombooking.service.http.floorwingServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.conferenceroombooking.service.http.floorwingServiceSoap
 * @generated
 */
@ProviderType
public class floorwingSoap implements Serializable {
	public static floorwingSoap toSoapModel(floorwing model) {
		floorwingSoap soapModel = new floorwingSoap();

		soapModel.setFloorwing_id(model.getFloorwing_id());
		soapModel.setState_id(model.getState_id());
		soapModel.setLocation_id(model.getLocation_id());
		soapModel.setFloor_name(model.getFloor_name());

		return soapModel;
	}

	public static floorwingSoap[] toSoapModels(floorwing[] models) {
		floorwingSoap[] soapModels = new floorwingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static floorwingSoap[][] toSoapModels(floorwing[][] models) {
		floorwingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new floorwingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new floorwingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static floorwingSoap[] toSoapModels(List<floorwing> models) {
		List<floorwingSoap> soapModels = new ArrayList<floorwingSoap>(models.size());

		for (floorwing model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new floorwingSoap[soapModels.size()]);
	}

	public floorwingSoap() {
	}

	public long getPrimaryKey() {
		return _floorwing_id;
	}

	public void setPrimaryKey(long pk) {
		setFloorwing_id(pk);
	}

	public long getFloorwing_id() {
		return _floorwing_id;
	}

	public void setFloorwing_id(long floorwing_id) {
		_floorwing_id = floorwing_id;
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public long getLocation_id() {
		return _location_id;
	}

	public void setLocation_id(long location_id) {
		_location_id = location_id;
	}

	public String getFloor_name() {
		return _floor_name;
	}

	public void setFloor_name(String floor_name) {
		_floor_name = floor_name;
	}

	private long _floorwing_id;
	private long _state_id;
	private long _location_id;
	private String _floor_name;
}