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
 * This class is used by SOAP remote services, specifically {@link com.chola.trainingcalendar.service.http.trainingcalendardataServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.http.trainingcalendardataServiceSoap
 * @generated
 */
@ProviderType
public class trainingcalendardataSoap implements Serializable {
	public static trainingcalendardataSoap toSoapModel(
		trainingcalendardata model) {
		trainingcalendardataSoap soapModel = new trainingcalendardataSoap();

		soapModel.setId(model.getId());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setSchedulestartdate(model.getSchedulestartdate());
		soapModel.setScheduleenddate(model.getScheduleenddate());
		soapModel.setLocation(model.getLocation());

		return soapModel;
	}

	public static trainingcalendardataSoap[] toSoapModels(
		trainingcalendardata[] models) {
		trainingcalendardataSoap[] soapModels = new trainingcalendardataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static trainingcalendardataSoap[][] toSoapModels(
		trainingcalendardata[][] models) {
		trainingcalendardataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new trainingcalendardataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new trainingcalendardataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static trainingcalendardataSoap[] toSoapModels(
		List<trainingcalendardata> models) {
		List<trainingcalendardataSoap> soapModels = new ArrayList<trainingcalendardataSoap>(models.size());

		for (trainingcalendardata model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new trainingcalendardataSoap[soapModels.size()]);
	}

	public trainingcalendardataSoap() {
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

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getSchedulestartdate() {
		return _schedulestartdate;
	}

	public void setSchedulestartdate(Date schedulestartdate) {
		_schedulestartdate = schedulestartdate;
	}

	public Date getScheduleenddate() {
		return _scheduleenddate;
	}

	public void setScheduleenddate(Date scheduleenddate) {
		_scheduleenddate = scheduleenddate;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	private long _id;
	private String _title;
	private String _description;
	private Date _schedulestartdate;
	private Date _scheduleenddate;
	private String _location;
}