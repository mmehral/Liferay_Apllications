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

package com.chola.popularlinks.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.popularlinks.service.http.externallinksServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.popularlinks.service.http.externallinksServiceSoap
 * @generated
 */
@ProviderType
public class externallinksSoap implements Serializable {
	public static externallinksSoap toSoapModel(externallinks model) {
		externallinksSoap soapModel = new externallinksSoap();

		soapModel.setId(model.getId());
		soapModel.setTag(model.getTag());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static externallinksSoap[] toSoapModels(externallinks[] models) {
		externallinksSoap[] soapModels = new externallinksSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static externallinksSoap[][] toSoapModels(externallinks[][] models) {
		externallinksSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new externallinksSoap[models.length][models[0].length];
		}
		else {
			soapModels = new externallinksSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static externallinksSoap[] toSoapModels(List<externallinks> models) {
		List<externallinksSoap> soapModels = new ArrayList<externallinksSoap>(models.size());

		for (externallinks model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new externallinksSoap[soapModels.size()]);
	}

	public externallinksSoap() {
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

	public String getTag() {
		return _tag;
	}

	public void setTag(String tag) {
		_tag = tag;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	private long _id;
	private String _tag;
	private String _url;
}