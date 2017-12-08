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

package com.chola.feedforward.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.feedforward.service.http.feedforwardgalleryusersServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.feedforward.service.http.feedforwardgalleryusersServiceSoap
 * @generated
 */
@ProviderType
public class feedforwardgalleryusersSoap implements Serializable {
	public static feedforwardgalleryusersSoap toSoapModel(
		feedforwardgalleryusers model) {
		feedforwardgalleryusersSoap soapModel = new feedforwardgalleryusersSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setAlbum_id(model.getAlbum_id());

		return soapModel;
	}

	public static feedforwardgalleryusersSoap[] toSoapModels(
		feedforwardgalleryusers[] models) {
		feedforwardgalleryusersSoap[] soapModels = new feedforwardgalleryusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static feedforwardgalleryusersSoap[][] toSoapModels(
		feedforwardgalleryusers[][] models) {
		feedforwardgalleryusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new feedforwardgalleryusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new feedforwardgalleryusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static feedforwardgalleryusersSoap[] toSoapModels(
		List<feedforwardgalleryusers> models) {
		List<feedforwardgalleryusersSoap> soapModels = new ArrayList<feedforwardgalleryusersSoap>(models.size());

		for (feedforwardgalleryusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new feedforwardgalleryusersSoap[soapModels.size()]);
	}

	public feedforwardgalleryusersSoap() {
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