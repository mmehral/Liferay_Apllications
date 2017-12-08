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

package com.chola.swagatam.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.swagatam.service.http.swagatampathServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.swagatam.service.http.swagatampathServiceSoap
 * @generated
 */
@ProviderType
public class swagatampathSoap implements Serializable {
	public static swagatampathSoap toSoapModel(swagatampath model) {
		swagatampathSoap soapModel = new swagatampathSoap();

		soapModel.setId(model.getId());
		soapModel.setInductionid(model.getInductionid());
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

	public static swagatampathSoap[] toSoapModels(swagatampath[] models) {
		swagatampathSoap[] soapModels = new swagatampathSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static swagatampathSoap[][] toSoapModels(swagatampath[][] models) {
		swagatampathSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new swagatampathSoap[models.length][models[0].length];
		}
		else {
			soapModels = new swagatampathSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static swagatampathSoap[] toSoapModels(List<swagatampath> models) {
		List<swagatampathSoap> soapModels = new ArrayList<swagatampathSoap>(models.size());

		for (swagatampath model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new swagatampathSoap[soapModels.size()]);
	}

	public swagatampathSoap() {
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

	public String getInductionid() {
		return _inductionid;
	}

	public void setInductionid(String inductionid) {
		_inductionid = inductionid;
	}

	public String getVideoPath() {
		return _videoPath;
	}

	public void setVideoPath(String videoPath) {
		_videoPath = videoPath;
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
	private String _inductionid;
	private String _videoPath;
	private String _videoTitle;
	private String _videoDesc;
	private Date _createdDate;
	private String _createdBy;
	private Date _updatedDate;
	private String _updatedBy;
	private String _flag;
}