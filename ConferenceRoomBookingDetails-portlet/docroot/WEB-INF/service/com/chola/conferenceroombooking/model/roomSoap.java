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
 * This class is used by SOAP remote services, specifically {@link com.chola.conferenceroombooking.service.http.roomServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.conferenceroombooking.service.http.roomServiceSoap
 * @generated
 */
@ProviderType
public class roomSoap implements Serializable {
	public static roomSoap toSoapModel(room model) {
		roomSoap soapModel = new roomSoap();

		soapModel.setRoom_id(model.getRoom_id());
		soapModel.setState_id(model.getState_id());
		soapModel.setLocation_id(model.getLocation_id());
		soapModel.setFloor_id(model.getFloor_id());
		soapModel.setRoom_name(model.getRoom_name());
		soapModel.setRoom_capacity(model.getRoom_capacity());
		soapModel.setRoom_extension(model.getRoom_extension());
		soapModel.setRoom_values(model.getRoom_values());

		return soapModel;
	}

	public static roomSoap[] toSoapModels(room[] models) {
		roomSoap[] soapModels = new roomSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static roomSoap[][] toSoapModels(room[][] models) {
		roomSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new roomSoap[models.length][models[0].length];
		}
		else {
			soapModels = new roomSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static roomSoap[] toSoapModels(List<room> models) {
		List<roomSoap> soapModels = new ArrayList<roomSoap>(models.size());

		for (room model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new roomSoap[soapModels.size()]);
	}

	public roomSoap() {
	}

	public long getPrimaryKey() {
		return _room_id;
	}

	public void setPrimaryKey(long pk) {
		setRoom_id(pk);
	}

	public long getRoom_id() {
		return _room_id;
	}

	public void setRoom_id(long room_id) {
		_room_id = room_id;
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

	public long getFloor_id() {
		return _floor_id;
	}

	public void setFloor_id(long floor_id) {
		_floor_id = floor_id;
	}

	public String getRoom_name() {
		return _room_name;
	}

	public void setRoom_name(String room_name) {
		_room_name = room_name;
	}

	public long getRoom_capacity() {
		return _room_capacity;
	}

	public void setRoom_capacity(long room_capacity) {
		_room_capacity = room_capacity;
	}

	public long getRoom_extension() {
		return _room_extension;
	}

	public void setRoom_extension(long room_extension) {
		_room_extension = room_extension;
	}

	public String getRoom_values() {
		return _room_values;
	}

	public void setRoom_values(String room_values) {
		_room_values = room_values;
	}

	private long _room_id;
	private long _state_id;
	private long _location_id;
	private long _floor_id;
	private String _room_name;
	private long _room_capacity;
	private long _room_extension;
	private String _room_values;
}