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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author CloverLiferay01
 * @generated
 */
@ProviderType
public class trainingcalendarSoap implements Serializable {
	public static trainingcalendarSoap toSoapModel(trainingcalendar model) {
		trainingcalendarSoap soapModel = new trainingcalendarSoap();

		soapModel.setTrainingid(model.getTrainingid());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static trainingcalendarSoap[] toSoapModels(trainingcalendar[] models) {
		trainingcalendarSoap[] soapModels = new trainingcalendarSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static trainingcalendarSoap[][] toSoapModels(
		trainingcalendar[][] models) {
		trainingcalendarSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new trainingcalendarSoap[models.length][models[0].length];
		}
		else {
			soapModels = new trainingcalendarSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static trainingcalendarSoap[] toSoapModels(
		List<trainingcalendar> models) {
		List<trainingcalendarSoap> soapModels = new ArrayList<trainingcalendarSoap>(models.size());

		for (trainingcalendar model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new trainingcalendarSoap[soapModels.size()]);
	}

	public trainingcalendarSoap() {
	}

	public long getPrimaryKey() {
		return _trainingid;
	}

	public void setPrimaryKey(long pk) {
		setTrainingid(pk);
	}

	public long getTrainingid() {
		return _trainingid;
	}

	public void setTrainingid(long trainingid) {
		_trainingid = trainingid;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private long _trainingid;
	private String _name;
}