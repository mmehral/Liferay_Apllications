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

package com.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.service.http.cholatalkiesusersServiceSoap}.
 *
 * @author adms.java1
 * @see com.service.http.cholatalkiesusersServiceSoap
 * @generated
 */
@ProviderType
public class cholatalkiesusersSoap implements Serializable {
	public static cholatalkiesusersSoap toSoapModel(cholatalkiesusers model) {
		cholatalkiesusersSoap soapModel = new cholatalkiesusersSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setCholatalkiesdetails_id(model.getCholatalkiesdetails_id());

		return soapModel;
	}

	public static cholatalkiesusersSoap[] toSoapModels(
		cholatalkiesusers[] models) {
		cholatalkiesusersSoap[] soapModels = new cholatalkiesusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cholatalkiesusersSoap[][] toSoapModels(
		cholatalkiesusers[][] models) {
		cholatalkiesusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cholatalkiesusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cholatalkiesusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cholatalkiesusersSoap[] toSoapModels(
		List<cholatalkiesusers> models) {
		List<cholatalkiesusersSoap> soapModels = new ArrayList<cholatalkiesusersSoap>(models.size());

		for (cholatalkiesusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cholatalkiesusersSoap[soapModels.size()]);
	}

	public cholatalkiesusersSoap() {
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

	public long getCholatalkiesdetails_id() {
		return _cholatalkiesdetails_id;
	}

	public void setCholatalkiesdetails_id(long cholatalkiesdetails_id) {
		_cholatalkiesdetails_id = cholatalkiesdetails_id;
	}

	private long _id;
	private long _user_id;
	private long _cholatalkiesdetails_id;
}