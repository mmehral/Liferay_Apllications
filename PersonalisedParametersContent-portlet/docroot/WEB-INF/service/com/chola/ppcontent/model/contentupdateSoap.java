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

package com.chola.ppcontent.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.ppcontent.service.http.contentupdateServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.ppcontent.service.http.contentupdateServiceSoap
 * @generated
 */
@ProviderType
public class contentupdateSoap implements Serializable {
	public static contentupdateSoap toSoapModel(contentupdate model) {
		contentupdateSoap soapModel = new contentupdateSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());

		return soapModel;
	}

	public static contentupdateSoap[] toSoapModels(contentupdate[] models) {
		contentupdateSoap[] soapModels = new contentupdateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static contentupdateSoap[][] toSoapModels(contentupdate[][] models) {
		contentupdateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new contentupdateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new contentupdateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static contentupdateSoap[] toSoapModels(List<contentupdate> models) {
		List<contentupdateSoap> soapModels = new ArrayList<contentupdateSoap>(models.size());

		for (contentupdate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new contentupdateSoap[soapModels.size()]);
	}

	public contentupdateSoap() {
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

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	private long _id;
	private long _content_id;
}