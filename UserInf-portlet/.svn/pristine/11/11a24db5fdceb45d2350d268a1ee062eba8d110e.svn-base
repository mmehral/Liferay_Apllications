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

package com.usertheme.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.usertheme.service.http.themecolorServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.usertheme.service.http.themecolorServiceSoap
 * @generated
 */
@ProviderType
public class themecolorSoap implements Serializable {
	public static themecolorSoap toSoapModel(themecolor model) {
		themecolorSoap soapModel = new themecolorSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setColor(model.getColor());
		soapModel.setUpdatedDate(model.getUpdatedDate());

		return soapModel;
	}

	public static themecolorSoap[] toSoapModels(themecolor[] models) {
		themecolorSoap[] soapModels = new themecolorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static themecolorSoap[][] toSoapModels(themecolor[][] models) {
		themecolorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new themecolorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new themecolorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static themecolorSoap[] toSoapModels(List<themecolor> models) {
		List<themecolorSoap> soapModels = new ArrayList<themecolorSoap>(models.size());

		for (themecolor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new themecolorSoap[soapModels.size()]);
	}

	public themecolorSoap() {
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

	public String getUser_id() {
		return _user_id;
	}

	public void setUser_id(String user_id) {
		_user_id = user_id;
	}

	public String getColor() {
		return _color;
	}

	public void setColor(String color) {
		_color = color;
	}

	public Date getUpdatedDate() {
		return _updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;
	}

	private long _id;
	private String _user_id;
	private String _color;
	private Date _updatedDate;
}