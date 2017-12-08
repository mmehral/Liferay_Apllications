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

package com.chola.business.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.business.service.http.businessSOPppusersServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.business.service.http.businessSOPppusersServiceSoap
 * @generated
 */
@ProviderType
public class businessSOPppusersSoap implements Serializable {
	public static businessSOPppusersSoap toSoapModel(businessSOPppusers model) {
		businessSOPppusersSoap soapModel = new businessSOPppusersSoap();

		soapModel.setId(model.getId());
		soapModel.setBusinesssop_uniqueid(model.getBusinesssop_uniqueid());
		soapModel.setUser_id(model.getUser_id());

		return soapModel;
	}

	public static businessSOPppusersSoap[] toSoapModels(
		businessSOPppusers[] models) {
		businessSOPppusersSoap[] soapModels = new businessSOPppusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static businessSOPppusersSoap[][] toSoapModels(
		businessSOPppusers[][] models) {
		businessSOPppusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new businessSOPppusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new businessSOPppusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static businessSOPppusersSoap[] toSoapModels(
		List<businessSOPppusers> models) {
		List<businessSOPppusersSoap> soapModels = new ArrayList<businessSOPppusersSoap>(models.size());

		for (businessSOPppusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new businessSOPppusersSoap[soapModels.size()]);
	}

	public businessSOPppusersSoap() {
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

	public String getBusinesssop_uniqueid() {
		return _businesssop_uniqueid;
	}

	public void setBusinesssop_uniqueid(String businesssop_uniqueid) {
		_businesssop_uniqueid = businesssop_uniqueid;
	}

	public String getUser_id() {
		return _user_id;
	}

	public void setUser_id(String user_id) {
		_user_id = user_id;
	}

	private long _id;
	private String _businesssop_uniqueid;
	private String _user_id;
}