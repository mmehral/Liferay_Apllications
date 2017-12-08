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

package com.chola.calendar.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.calendar.service.http.eventcalendarServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.calendar.service.http.eventcalendarServiceSoap
 * @generated
 */
@ProviderType
public class eventcalendarSoap implements Serializable {
	public static eventcalendarSoap toSoapModel(eventcalendar model) {
		eventcalendarSoap soapModel = new eventcalendarSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setStartdate(model.getStartdate());
		soapModel.setEnddate(model.getEnddate());
		soapModel.setColor(model.getColor());
		soapModel.setUrl(model.getUrl());
		soapModel.setUserid(model.getUserid());

		return soapModel;
	}

	public static eventcalendarSoap[] toSoapModels(eventcalendar[] models) {
		eventcalendarSoap[] soapModels = new eventcalendarSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static eventcalendarSoap[][] toSoapModels(eventcalendar[][] models) {
		eventcalendarSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new eventcalendarSoap[models.length][models[0].length];
		}
		else {
			soapModels = new eventcalendarSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static eventcalendarSoap[] toSoapModels(List<eventcalendar> models) {
		List<eventcalendarSoap> soapModels = new ArrayList<eventcalendarSoap>(models.size());

		for (eventcalendar model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new eventcalendarSoap[soapModels.size()]);
	}

	public eventcalendarSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getStartdate() {
		return _startdate;
	}

	public void setStartdate(Date startdate) {
		_startdate = startdate;
	}

	public Date getEnddate() {
		return _enddate;
	}

	public void setEnddate(Date enddate) {
		_enddate = enddate;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getUserid() {
		return _userid;
	}

	public void setUserid(String userid) {
		_userid = userid;
	}

	private long _id;
	private String _name;
	private Date _startdate;
	private Date _enddate;
	private String _color;
	private String _url;
	private String _userid;
}