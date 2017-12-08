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

package com.chola.appcorner.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.appcorner.service.http.postServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.appcorner.service.http.postServiceSoap
 * @generated
 */
@ProviderType
public class postSoap implements Serializable {
	public static postSoap toSoapModel(post model) {
		postSoap soapModel = new postSoap();

		soapModel.setId(model.getId());
		soapModel.setAppTo(model.getAppTo());
		soapModel.setAppBy(model.getAppBy());
		soapModel.setAppMessage(model.getAppMessage());
		soapModel.setAppDate(model.getAppDate());

		return soapModel;
	}

	public static postSoap[] toSoapModels(post[] models) {
		postSoap[] soapModels = new postSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static postSoap[][] toSoapModels(post[][] models) {
		postSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new postSoap[models.length][models[0].length];
		}
		else {
			soapModels = new postSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static postSoap[] toSoapModels(List<post> models) {
		List<postSoap> soapModels = new ArrayList<postSoap>(models.size());

		for (post model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new postSoap[soapModels.size()]);
	}

	public postSoap() {
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

	public long getAppTo() {
		return _appTo;
	}

	public void setAppTo(long appTo) {
		_appTo = appTo;
	}

	public long getAppBy() {
		return _appBy;
	}

	public void setAppBy(long appBy) {
		_appBy = appBy;
	}

	public String getAppMessage() {
		return _appMessage;
	}

	public void setAppMessage(String appMessage) {
		_appMessage = appMessage;
	}

	public String getAppDate() {
		return _appDate;
	}

	public void setAppDate(String appDate) {
		_appDate = appDate;
	}

	private long _id;
	private long _appTo;
	private long _appBy;
	private String _appMessage;
	private String _appDate;
}