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

package com.chola.livefeed.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.livefeed.service.http.LiveFeedServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.livefeed.service.http.LiveFeedServiceSoap
 * @generated
 */
@ProviderType
public class LiveFeedSoap implements Serializable {
	public static LiveFeedSoap toSoapModel(LiveFeed model) {
		LiveFeedSoap soapModel = new LiveFeedSoap();

		soapModel.setId(model.getId());
		soapModel.setTitle(model.getTitle());
		soapModel.setContent(model.getContent());
		soapModel.setCreatedate(model.getCreatedate());

		return soapModel;
	}

	public static LiveFeedSoap[] toSoapModels(LiveFeed[] models) {
		LiveFeedSoap[] soapModels = new LiveFeedSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LiveFeedSoap[][] toSoapModels(LiveFeed[][] models) {
		LiveFeedSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LiveFeedSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LiveFeedSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LiveFeedSoap[] toSoapModels(List<LiveFeed> models) {
		List<LiveFeedSoap> soapModels = new ArrayList<LiveFeedSoap>(models.size());

		for (LiveFeed model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LiveFeedSoap[soapModels.size()]);
	}

	public LiveFeedSoap() {
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