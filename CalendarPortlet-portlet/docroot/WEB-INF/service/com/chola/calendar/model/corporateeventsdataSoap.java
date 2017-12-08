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
 * This class is used by SOAP remote services, specifically {@link com.chola.calendar.service.http.corporateeventsdataServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.calendar.service.http.corporateeventsdataServiceSoap
 * @generated
 */
@ProviderType
public class corporateeventsdataSoap implements Serializable {
	public static corporateeventsdataSoap toSoapModel(corporateeventsdata model) {
		corporateeventsdataSoap soapModel = new corporateeventsdataSoap();

		soapModel.setId(model.getId());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setZone(model.getZone());
		soapModel.setRegion(model.getRegion());
		soapModel.setLocation(model.getLocation());
		soapModel.setPersonincharge(model.getPersonincharge());
		soapModel.setSchedulestartdate(model.getSchedulestartdate());
		soapModel.setScheduleenddate(model.getScheduleenddate());

		return soapModel;
	}

	public static corporateeventsdataSoap[] toSoapModels(
		corporateeventsdata[] models) {
		corporateeventsdataSoap[] soapModels = new corporateeventsdataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static corporateeventsdataSoap[][] toSoapModels(
		corporateeventsdata[][] models) {
		corporateeventsdataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new corporateeventsdataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new corporateeventsdataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static corporateeventsdataSoap[] toSoapModels(
		List<corporateeventsdata> models) {
		List<corporateeventsdataSoap> soapModels = new ArrayList<corporateeventsdataSoap>(models.size());

		for (corporateeventsdata model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new corporateeventsdataSoap[soapModels.size()]);
	}

	public corporateeventsdataSoap() {
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

	public String getZone() {
		return _zone;
	}

	public void setZone(String zone) {
		_zone = zone;
	}

	public String getRegion() {
		return _region;
	}

	public void setRegion(String region) {
		_region = region;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getPersonincharge() {
		return _personincharge;
	}

	public void setPersonincharge(String personincharge) {
		_personincharge = personincharge;
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

	private long _id;
	private String _title;
	private String _description;
	private String _zone;
	private String _region;
	private String _location;
	private String _personincharge;
	private Date _schedulestartdate;
	private Date _scheduleenddate;
}