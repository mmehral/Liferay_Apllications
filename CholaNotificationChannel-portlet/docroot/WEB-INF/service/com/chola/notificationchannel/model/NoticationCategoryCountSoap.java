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

package com.chola.notificationchannel.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author cloverliferay01
 * @generated
 */
@ProviderType
public class NoticationCategoryCountSoap implements Serializable {
	public static NoticationCategoryCountSoap toSoapModel(
		NoticationCategoryCount model) {
		NoticationCategoryCountSoap soapModel = new NoticationCategoryCountSoap();

		soapModel.setEventId(model.getEventId());
		soapModel.setUsername(model.getUsername());

		return soapModel;
	}

	public static NoticationCategoryCountSoap[] toSoapModels(
		NoticationCategoryCount[] models) {
		NoticationCategoryCountSoap[] soapModels = new NoticationCategoryCountSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NoticationCategoryCountSoap[][] toSoapModels(
		NoticationCategoryCount[][] models) {
		NoticationCategoryCountSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NoticationCategoryCountSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NoticationCategoryCountSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NoticationCategoryCountSoap[] toSoapModels(
		List<NoticationCategoryCount> models) {
		List<NoticationCategoryCountSoap> soapModels = new ArrayList<NoticationCategoryCountSoap>(models.size());

		for (NoticationCategoryCount model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NoticationCategoryCountSoap[soapModels.size()]);
	}

	public NoticationCategoryCountSoap() {
	}

	public long getPrimaryKey() {
		return _eventId;
	}

	public void setPrimaryKey(long pk) {
		setEventId(pk);
	}

	public long getEventId() {
		return _eventId;
	}

	public void setEventId(long eventId) {
		_eventId = eventId;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	private long _eventId;
	private String _username;
}