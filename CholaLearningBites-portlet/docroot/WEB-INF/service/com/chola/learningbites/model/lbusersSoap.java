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

package com.chola.learningbites.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.learningbites.service.http.lbusersServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.learningbites.service.http.lbusersServiceSoap
 * @generated
 */
@ProviderType
public class lbusersSoap implements Serializable {
	public static lbusersSoap toSoapModel(lbusers model) {
		lbusersSoap soapModel = new lbusersSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setLb_id(model.getLb_id());

		return soapModel;
	}

	public static lbusersSoap[] toSoapModels(lbusers[] models) {
		lbusersSoap[] soapModels = new lbusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static lbusersSoap[][] toSoapModels(lbusers[][] models) {
		lbusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new lbusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new lbusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static lbusersSoap[] toSoapModels(List<lbusers> models) {
		List<lbusersSoap> soapModels = new ArrayList<lbusersSoap>(models.size());

		for (lbusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new lbusersSoap[soapModels.size()]);
	}

	public lbusersSoap() {
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

	public long getLb_id() {
		return _lb_id;
	}

	public void setLb_id(long lb_id) {
		_lb_id = lb_id;
	}

	private long _id;
	private long _user_id;
	private long _lb_id;
}