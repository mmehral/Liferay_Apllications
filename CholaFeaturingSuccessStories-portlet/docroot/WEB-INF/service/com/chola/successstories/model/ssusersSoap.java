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

package com.chola.successstories.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.successstories.service.http.ssusersServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.successstories.service.http.ssusersServiceSoap
 * @generated
 */
@ProviderType
public class ssusersSoap implements Serializable {
	public static ssusersSoap toSoapModel(ssusers model) {
		ssusersSoap soapModel = new ssusersSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setSsdetails_id(model.getSsdetails_id());

		return soapModel;
	}

	public static ssusersSoap[] toSoapModels(ssusers[] models) {
		ssusersSoap[] soapModels = new ssusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ssusersSoap[][] toSoapModels(ssusers[][] models) {
		ssusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ssusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ssusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ssusersSoap[] toSoapModels(List<ssusers> models) {
		List<ssusersSoap> soapModels = new ArrayList<ssusersSoap>(models.size());

		for (ssusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ssusersSoap[soapModels.size()]);
	}

	public ssusersSoap() {
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

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public long getSsdetails_id() {
		return _ssdetails_id;
	}

	public void setSsdetails_id(long ssdetails_id) {
		_ssdetails_id = ssdetails_id;
	}

	private long _id;
	private long _user_id;
	private long _ssdetails_id;
}