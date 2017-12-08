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
 * This class is used by SOAP remote services, specifically {@link com.chola.conferenceroombooking.service.http.facilitymasterServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.conferenceroombooking.service.http.facilitymasterServiceSoap
 * @generated
 */
@ProviderType
public class facilitymasterSoap implements Serializable {
	public static facilitymasterSoap toSoapModel(facilitymaster model) {
		facilitymasterSoap soapModel = new facilitymasterSoap();

		soapModel.setFacility_id(model.getFacility_id());
		soapModel.setFacility_name(model.getFacility_name());
		soapModel.setFacility_description(model.getFacility_description());

		return soapModel;
	}

	public static facilitymasterSoap[] toSoapModels(facilitymaster[] models) {
		facilitymasterSoap[] soapModels = new facilitymasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static facilitymasterSoap[][] toSoapModels(facilitymaster[][] models) {
		facilitymasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new facilitymasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new facilitymasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static facilitymasterSoap[] toSoapModels(List<facilitymaster> models) {
		List<facilitymasterSoap> soapModels = new ArrayList<facilitymasterSoap>(models.size());

		for (facilitymaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new facilitymasterSoap[soapModels.size()]);
	}

	public facilitymasterSoap() {
	}

	public long getPrimaryKey() {
		return _facility_id;
	}

	public void setPrimaryKey(long pk) {
		setFacility_id(pk);
	}

	public long getFacility_id() {
		return _facility_id;
	}

	public void setFacility_id(long facility_id) {
		_facility_id = facility_id;
	}

	public String getFacility_name() {
		return _facility_name;
	}

	public void setFacility_name(String facility_name) {
		_facility_name = facility_name;
	}

	public String getFacility_description() {
		return _facility_description;
	}

	public void setFacility_description(String facility_description) {
		_facility_description = facility_description;
	}

	private long _facility_id;
	private String _facility_name;
	private String _facility_description;
}