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

package com.chola.news.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author adms.java1
 * @generated
 */
@ProviderType
public class Around_WorldSoap implements Serializable {
	public static Around_WorldSoap toSoapModel(Around_World model) {
		Around_WorldSoap soapModel = new Around_WorldSoap();

		soapModel.setId(model.getId());
		soapModel.setNews(model.getNews());

		return soapModel;
	}

	public static Around_WorldSoap[] toSoapModels(Around_World[] models) {
		Around_WorldSoap[] soapModels = new Around_WorldSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Around_WorldSoap[][] toSoapModels(Around_World[][] models) {
		Around_WorldSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Around_WorldSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Around_WorldSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Around_WorldSoap[] toSoapModels(List<Around_World> models) {
		List<Around_WorldSoap> soapModels = new ArrayList<Around_WorldSoap>(models.size());

		for (Around_World model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Around_WorldSoap[soapModels.size()]);
	}

	public Around_WorldSoap() {
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

	public String getNews() {
		return _news;
	}

	public void setNews(String news) {
		_news = news;
	}

	private long _id;
	private String _news;
}