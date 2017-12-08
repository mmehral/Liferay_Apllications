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
 * This class is used by SOAP remote services, specifically {@link com.chola.videogallery.service.http.videogalleryServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.videogallery.service.http.videogalleryServiceSoap
 * @generated
 */
@ProviderType
public class videogallerySoap implements Serializable {
	public static videogallerySoap toSoapModel(videogallery model) {
		videogallerySoap soapModel = new videogallerySoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setAlbumName(model.getAlbumName());
		soapModel.setAlbumDesc(model.getAlbumDesc());
		soapModel.setAlbumId(model.getAlbumId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setFlag(model.getFlag());

		return soapModel;
	}

	public static videogallerySoap[] toSoapModels(videogallery[] models) {
		videogallerySoap[] soapModels = new videogallerySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static videogallerySoap[][] toSoapModels(videogallery[][] models) {
		videogallerySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new videogallerySoap[models.length][models[0].length];
		}
		else {
			soapModels = new videogallerySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static videogallerySoap[] toSoapModels(List<videogallery> models) {
		List<videogallerySoap> soapModels = new ArrayList<videogallerySoap>(models.size());

		for (videogallery model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new videogallerySoap[soapModels.size()]);
	}

	public videogallerySoap() {
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

	public String getAlbumName() {
		return _albumName;
	}

	public void setAlbumName(String albumName) {
		_albumName = albumName;
	}

	public String getAlbumDesc() {
		return _albumDesc;
	}

	public void setAlbumDesc(String albumDesc) {
		_albumDesc = albumDesc;
	}

	public String getAlbumId() {
		return _albumId;
	}

	public void setAlbumId(String albumId) {
		_albumId = albumId;
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
	private String _albumName;
	private String _albumDesc;
	private String _albumId;
	private Date _createdDate;
	private String _createdBy;
	private String _flag;
}