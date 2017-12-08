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

package com.chola.birthday.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.birthday.service.http.predefinedmessagesServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.birthday.service.http.predefinedmessagesServiceSoap
 * @generated
 */
@ProviderType
public class predefinedmessagesSoap implements Serializable {
	public static predefinedmessagesSoap toSoapModel(predefinedmessages model) {
		predefinedmessagesSoap soapModel = new predefinedmessagesSoap();

		soapModel.setId(model.getId());
		soapModel.setMessage(model.getMessage());

		return soapModel;
	}

	public static predefinedmessagesSoap[] toSoapModels(
		predefinedmessages[] models) {
		predefinedmessagesSoap[] soapModels = new predefinedmessagesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static predefinedmessagesSoap[][] toSoapModels(
		predefinedmessages[][] models) {
		predefinedmessagesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new predefinedmessagesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new predefinedmessagesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static predefinedmessagesSoap[] toSoapModels(
		List<predefinedmessages> models) {
		List<predefinedmessagesSoap> soapModels = new ArrayList<predefinedmessagesSoap>(models.size());

		for (predefinedmessages model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new predefinedmessagesSoap[soapModels.size()]);
	}

	public predefinedmessagesSoap() {
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

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	private long _id;
	private String _message;
}