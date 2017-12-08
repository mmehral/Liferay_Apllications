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

package com.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.service.http.cholatalkiesServiceSoap}.
 *
 * @author adms.java1
 * @see com.service.http.cholatalkiesServiceSoap
 * @generated
 */
@ProviderType
public class cholatalkiesSoap implements Serializable {
	public static cholatalkiesSoap toSoapModel(cholatalkies model) {
		cholatalkiesSoap soapModel = new cholatalkiesSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setVideoName(model.getVideoName());
		soapModel.setVideoDesc(model.getVideoDesc());
		soapModel.setVideoId(model.getVideoId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static cholatalkiesSoap[] toSoapModels(cholatalkies[] models) {
		cholatalkiesSoap[] soapModels = new cholatalkiesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cholatalkiesSoap[][] toSoapModels(cholatalkies[][] models) {
		cholatalkiesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cholatalkiesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cholatalkiesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cholatalkiesSoap[] toSoapModels(List<cholatalkies> models) {
		List<cholatalkiesSoap> soapModels = new ArrayList<cholatalkiesSoap>(models.size());

		for (cholatalkies model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cholatalkiesSoap[soapModels.size()]);
	}

	public cholatalkiesSoap() {
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

	public String getVideoName() {
		return _videoName;
	}

	public void setVideoName(String videoName) {
		_videoName = videoName;
	}

	public String getVideoDesc() {
		return _videoDesc;
	}

	public void setVideoDesc(String videoDesc) {
		_videoDesc = videoDesc;
	}

	public String getVideoId() {
		return _videoId;
	}

	public void setVideoId(String videoId) {
		_videoId = videoId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	private long _id;
	private long _content_id;
	private String _videoName;
	private String _videoDesc;
	private String _videoId;
	private Date _createdDate;
	private String _createdBy;
	private String _flag;
}