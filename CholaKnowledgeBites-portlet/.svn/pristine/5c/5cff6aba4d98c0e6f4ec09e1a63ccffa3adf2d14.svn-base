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

package com.chola.knowledgebites.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.knowledgebites.service.http.kbusersServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.knowledgebites.service.http.kbusersServiceSoap
 * @generated
 */
@ProviderType
public class kbusersSoap implements Serializable {
	public static kbusersSoap toSoapModel(kbusers model) {
		kbusersSoap soapModel = new kbusersSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setKbdetails_id(model.getKbdetails_id());

		return soapModel;
	}

	public static kbusersSoap[] toSoapModels(kbusers[] models) {
		kbusersSoap[] soapModels = new kbusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static kbusersSoap[][] toSoapModels(kbusers[][] models) {
		kbusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new kbusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new kbusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static kbusersSoap[] toSoapModels(List<kbusers> models) {
		List<kbusersSoap> soapModels = new ArrayList<kbusersSoap>(models.size());

		for (kbusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new kbusersSoap[soapModels.size()]);
	}

	public kbusersSoap() {
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

	public long getKbdetails_id() {
		return _kbdetails_id;
	}

	public void setKbdetails_id(long kbdetails_id) {
		_kbdetails_id = kbdetails_id;
	}

	private long _id;
	private long _user_id;
	private long _kbdetails_id;
}