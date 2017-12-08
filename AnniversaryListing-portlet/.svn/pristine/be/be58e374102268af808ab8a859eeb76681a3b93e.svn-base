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

package com.chola.anniversary.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.anniversary.service.http.anniversarywishServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.anniversary.service.http.anniversarywishServiceSoap
 * @generated
 */
@ProviderType
public class anniversarywishSoap implements Serializable {
	public static anniversarywishSoap toSoapModel(anniversarywish model) {
		anniversarywishSoap soapModel = new anniversarywishSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setWishedBy(model.getWishedBy());
		soapModel.setMessage(model.getMessage());
		soapModel.setCreatedDate(model.getCreatedDate());

		return soapModel;
	}

	public static anniversarywishSoap[] toSoapModels(anniversarywish[] models) {
		anniversarywishSoap[] soapModels = new anniversarywishSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static anniversarywishSoap[][] toSoapModels(
		anniversarywish[][] models) {
		anniversarywishSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new anniversarywishSoap[models.length][models[0].length];
		}
		else {
			soapModels = new anniversarywishSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static anniversarywishSoap[] toSoapModels(
		List<anniversarywish> models) {
		List<anniversarywishSoap> soapModels = new ArrayList<anniversarywishSoap>(models.size());

		for (anniversarywish model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new anniversarywishSoap[soapModels.size()]);
	}

	public anniversarywishSoap() {
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

	public String getUserId() {
		return _userId;
	}

	public void setUserId(String userId) {
		_userId = userId;
	}

	public String getWishedBy() {
		return _wishedBy;
	}

	public void setWishedBy(String wishedBy) {
		_wishedBy = wishedBy;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	private long _id;
	private String _userId;
	private String _wishedBy;
	private String _message;
	private Date _createdDate;
}