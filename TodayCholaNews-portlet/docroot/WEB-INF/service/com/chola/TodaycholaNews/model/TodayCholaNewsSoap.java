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

package com.chola.TodaycholaNews.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.TodaycholaNews.service.http.TodayCholaNewsServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.TodaycholaNews.service.http.TodayCholaNewsServiceSoap
 * @generated
 */
@ProviderType
public class TodayCholaNewsSoap implements Serializable {
	public static TodayCholaNewsSoap toSoapModel(TodayCholaNews model) {
		TodayCholaNewsSoap soapModel = new TodayCholaNewsSoap();

		soapModel.setId(model.getId());
		soapModel.setTitle(model.getTitle());
		soapModel.setContent(model.getContent());
		soapModel.setCreatedate(model.getCreatedate());

		return soapModel;
	}

	public static TodayCholaNewsSoap[] toSoapModels(TodayCholaNews[] models) {
		TodayCholaNewsSoap[] soapModels = new TodayCholaNewsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TodayCholaNewsSoap[][] toSoapModels(TodayCholaNews[][] models) {
		TodayCholaNewsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TodayCholaNewsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TodayCholaNewsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TodayCholaNewsSoap[] toSoapModels(List<TodayCholaNews> models) {
		List<TodayCholaNewsSoap> soapModels = new ArrayList<TodayCholaNewsSoap>(models.size());

		for (TodayCholaNews model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TodayCholaNewsSoap[soapModels.size()]);
	}

	public TodayCholaNewsSoap() {
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

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getCreatedate() {
		return _createdate;
	}

	public void setCreatedate(String createdate) {
		_createdate = createdate;
	}

	private long _id;
	private String _title;
	private String _content;
	private String _createdate;
}