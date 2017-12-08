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

package com.chola.socho.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.socho.service.http.ideaServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.socho.service.http.ideaServiceSoap
 * @generated
 */
@ProviderType
public class ideaSoap implements Serializable {
	public static ideaSoap toSoapModel(idea model) {
		ideaSoap soapModel = new ideaSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setTopic(model.getTopic());
		soapModel.setSharedIdea(model.getSharedIdea());
		soapModel.setSharedFile(model.getSharedFile());
		soapModel.setSharedDate(model.getSharedDate());

		return soapModel;
	}

	public static ideaSoap[] toSoapModels(idea[] models) {
		ideaSoap[] soapModels = new ideaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ideaSoap[][] toSoapModels(idea[][] models) {
		ideaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ideaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ideaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ideaSoap[] toSoapModels(List<idea> models) {
		List<ideaSoap> soapModels = new ArrayList<ideaSoap>(models.size());

		for (idea model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ideaSoap[soapModels.size()]);
	}

	public ideaSoap() {
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getTopic() {
		return _topic;
	}

	public void setTopic(String topic) {
		_topic = topic;
	}

	public String getSharedIdea() {
		return _sharedIdea;
	}

	public void setSharedIdea(String sharedIdea) {
		_sharedIdea = sharedIdea;
	}

	public String getSharedFile() {
		return _sharedFile;
	}

	public void setSharedFile(String sharedFile) {
		_sharedFile = sharedFile;
	}

	public Date getSharedDate() {
		return _sharedDate;
	}

	public void setSharedDate(Date sharedDate) {
		_sharedDate = sharedDate;
	}

	private long _id;
	private long _userId;
	private String _topic;
	private String _sharedIdea;
	private String _sharedFile;
	private Date _sharedDate;
}