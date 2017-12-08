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

package com.chola.shutterspeed.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.shutterspeed.service.http.shutterspeedgalleryusersServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.shutterspeed.service.http.shutterspeedgalleryusersServiceSoap
 * @generated
 */
@ProviderType
public class shutterspeedgalleryusersSoap implements Serializable {
	public static shutterspeedgalleryusersSoap toSoapModel(
		shutterspeedgalleryusers model) {
		shutterspeedgalleryusersSoap soapModel = new shutterspeedgalleryusersSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setAlbum_id(model.getAlbum_id());

		return soapModel;
	}

	public static shutterspeedgalleryusersSoap[] toSoapModels(
		shutterspeedgalleryusers[] models) {
		shutterspeedgalleryusersSoap[] soapModels = new shutterspeedgalleryusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static shutterspeedgalleryusersSoap[][] toSoapModels(
		shutterspeedgalleryusers[][] models) {
		shutterspeedgalleryusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new shutterspeedgalleryusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new shutterspeedgalleryusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static shutterspeedgalleryusersSoap[] toSoapModels(
		List<shutterspeedgalleryusers> models) {
		List<shutterspeedgalleryusersSoap> soapModels = new ArrayList<shutterspeedgalleryusersSoap>(models.size());

		for (shutterspeedgalleryusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new shutterspeedgalleryusersSoap[soapModels.size()]);
	}

	public shutterspeedgalleryusersSoap() {
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

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public long getAlbum_id() {
		return _album_id;
	}

	public void setAlbum_id(long album_id) {
		_album_id = album_id;
	}

	private long _id;
	private long _user_id;
	private long _album_id;
}