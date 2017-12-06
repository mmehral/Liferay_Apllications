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

package com.chola.msappointment.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.msappointment.service.http.calendarmsappointmentServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.chola.msappointment.service.http.calendarmsappointmentServiceSoap
 * @generated
 */
@ProviderType
public class calendarmsappointmentSoap implements Serializable {
	public static calendarmsappointmentSoap toSoapModel(
		calendarmsappointment model) {
		calendarmsappointmentSoap soapModel = new calendarmsappointmentSoap();

		soapModel.setId(model.getId());

		return soapModel;
	}

	public static calendarmsappointmentSoap[] toSoapModels(
		calendarmsappointment[] models) {
		calendarmsappointmentSoap[] soapModels = new calendarmsappointmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static calendarmsappointmentSoap[][] toSoapModels(
		calendarmsappointment[][] models) {
		calendarmsappointmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new calendarmsappointmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new calendarmsappointmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static calendarmsappointmentSoap[] toSoapModels(
		List<calendarmsappointment> models) {
		List<calendarmsappointmentSoap> soapModels = new ArrayList<calendarmsappointmentSoap>(models.size());

		for (calendarmsappointment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new calendarmsappointmentSoap[soapModels.size()]);
	}

	public calendarmsappointmentSoap() {
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

	private long _id;
}