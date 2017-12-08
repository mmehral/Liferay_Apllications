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
 * This class is used by SOAP remote services, specifically {@link com.service.http.cholatalkiespathServiceSoap}.
 *
 * @author adms.java1
 * @see com.service.http.cholatalkiespathServiceSoap
 * @generated
 */
@ProviderType
public class cholatalkiespathSoap implements Serializable {
	public static cholatalkiespathSoap toSoapModel(cholatalkiespath model) {
		cholatalkiespathSoap soapModel = new cholatalkiespathSoap();

		soapModel.setId(model.getId());
		soapModel.setCholatalkiesdetaild_id(model.getCholatalkiesdetaild_id());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setVideoPath(model.getVideoPath());
		soapModel.setVideoTitle(model.getVideoTitle());
		soapModel.setVideoDesc(model.getVideoDesc());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedDate(model.getUpdatedDate());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static cholatalkiespathSoap[] toSoapModels(cholatalkiespath[] models) {
		cholatalkiespathSoap[] soapModels = new cholatalkiespathSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cholatalkiespathSoap[][] toSoapModels(
		cholatalkiespath[][] models) {
		cholatalkiespathSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cholatalkiespathSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cholatalkiespathSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cholatalkiespathSoap[] toSoapModels(
		List<cholatalkiespath> models) {
		List<cholatalkiespathSoap> soapModels = new ArrayList<cholatalkiespathSoap>(models.size());

		for (cholatalkiespath model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cholatalkiespathSoap[soapModels.size()]);
	}

	public cholatalkiespathSoap() {
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

	public String getCholatalkiesdetaild_id() {
		return _cholatalkiesdetaild_id;
	}

	public void setCholatalkiesdetaild_id(String cholatalkiesdetaild_id) {
		_cholatalkiesdetaild_id = cholatalkiesdetaild_id;
	}

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public String getVideoPath() {
		return _VideoPath;
	}

	public void setVideoPath(String VideoPath) {
		_VideoPath = VideoPath;
	}

	public String getVideoTitle() {
		return _videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		_videoTitle = videoTitle;
	}

	public String getVideoDesc() {
		return _videoDesc;
	}

	public void setVideoDesc(String videoDesc) {
		_videoDesc = videoDesc;
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

	public Date getUpdatedDate() {
		return _updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;
	}

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	private long _id;
	private String _cholatalkiesdetaild_id;
	private long _content_id;
	private String _VideoPath;
	private String _videoTitle;
	private String _videoDesc;
	private Date _createdDate;
	private String _createdBy;
	private Date _updatedDate;
	private String _updatedBy;
	private String _flag;
}