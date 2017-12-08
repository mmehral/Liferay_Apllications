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

package com.chola.videogallery.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.videogallery.service.http.videogallerypathServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.videogallery.service.http.videogallerypathServiceSoap
 * @generated
 */
@ProviderType
public class videogallerypathSoap implements Serializable {
	public static videogallerypathSoap toSoapModel(videogallerypath model) {
		videogallerypathSoap soapModel = new videogallerypathSoap();

		soapModel.setId(model.getId());
		soapModel.setAlbumId(model.getAlbumId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setAlbumVideoPath(model.getAlbumVideoPath());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedDate(model.getUpdatedDate());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static videogallerypathSoap[] toSoapModels(videogallerypath[] models) {
		videogallerypathSoap[] soapModels = new videogallerypathSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static videogallerypathSoap[][] toSoapModels(
		videogallerypath[][] models) {
		videogallerypathSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new videogallerypathSoap[models.length][models[0].length];
		}
		else {
			soapModels = new videogallerypathSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static videogallerypathSoap[] toSoapModels(
		List<videogallerypath> models) {
		List<videogallerypathSoap> soapModels = new ArrayList<videogallerypathSoap>(models.size());

		for (videogallerypath model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new videogallerypathSoap[soapModels.size()]);
	}

	public videogallerypathSoap() {
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

	public String getAlbumId() {
		return _albumId;
	}

	public void setAlbumId(String albumId) {
		_albumId = albumId;
	}

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public String getAlbumVideoPath() {
		return _albumVideoPath;
	}

	public void setAlbumVideoPath(String albumVideoPath) {
		_albumVideoPath = albumVideoPath;
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
	private String _albumId;
	private long _content_id;
	private String _albumVideoPath;
	private Date _createdDate;
	private String _createdBy;
	private Date _updatedDate;
	private String _updatedBy;
	private String _flag;
}