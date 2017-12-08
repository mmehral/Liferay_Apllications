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

package com.chola.businessmis.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.businessmis.service.http.businessmisusersServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.chola.businessmis.service.http.businessmisusersServiceSoap
 * @generated
 */
@ProviderType
public class businessmisusersSoap implements Serializable {
	public static businessmisusersSoap toSoapModel(businessmisusers model) {
		businessmisusersSoap soapModel = new businessmisusersSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setBusinessdetails_id(model.getBusinessdetails_id());

		return soapModel;
	}

	public static businessmisusersSoap[] toSoapModels(businessmisusers[] models) {
		businessmisusersSoap[] soapModels = new businessmisusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static businessmisusersSoap[][] toSoapModels(
		businessmisusers[][] models) {
		businessmisusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new businessmisusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new businessmisusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static businessmisusersSoap[] toSoapModels(
		List<businessmisusers> models) {
		List<businessmisusersSoap> soapModels = new ArrayList<businessmisusersSoap>(models.size());

		for (businessmisusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new businessmisusersSoap[soapModels.size()]);
	}

	public businessmisusersSoap() {
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

	public long getBusinessdetails_id() {
		return _businessdetails_id;
	}

	public void setBusinessdetails_id(long businessdetails_id) {
		_businessdetails_id = businessdetails_id;
	}

	private long _id;
	private long _user_id;
	private long _businessdetails_id;
}