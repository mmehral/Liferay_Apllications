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

package com.chola.milestone.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.milestone.service.http.milestoneServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.milestone.service.http.milestoneServiceSoap
 * @generated
 */
@ProviderType
public class milestoneSoap implements Serializable {
	public static milestoneSoap toSoapModel(milestone model) {
		milestoneSoap soapModel = new milestoneSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setWishedBy(model.getWishedBy());
		soapModel.setMessage(model.getMessage());
		soapModel.setCreatedDate(model.getCreatedDate());

		return soapModel;
	}

	public static milestoneSoap[] toSoapModels(milestone[] models) {
		milestoneSoap[] soapModels = new milestoneSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static milestoneSoap[][] toSoapModels(milestone[][] models) {
		milestoneSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new milestoneSoap[models.length][models[0].length];
		}
		else {
			soapModels = new milestoneSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static milestoneSoap[] toSoapModels(List<milestone> models) {
		List<milestoneSoap> soapModels = new ArrayList<milestoneSoap>(models.size());

		for (milestone model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new milestoneSoap[soapModels.size()]);
	}

	public milestoneSoap() {
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