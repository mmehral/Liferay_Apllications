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

package com.contest.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.contest.service.http.ContestUserDetailsServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.contest.service.http.ContestUserDetailsServiceSoap
 * @generated
 */
@ProviderType
public class ContestUserDetailsSoap implements Serializable {
	public static ContestUserDetailsSoap toSoapModel(ContestUserDetails model) {
		ContestUserDetailsSoap soapModel = new ContestUserDetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setContestreference_id(model.getContestreference_id());

		return soapModel;
	}

	public static ContestUserDetailsSoap[] toSoapModels(
		ContestUserDetails[] models) {
		ContestUserDetailsSoap[] soapModels = new ContestUserDetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ContestUserDetailsSoap[][] toSoapModels(
		ContestUserDetails[][] models) {
		ContestUserDetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ContestUserDetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ContestUserDetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ContestUserDetailsSoap[] toSoapModels(
		List<ContestUserDetails> models) {
		List<ContestUserDetailsSoap> soapModels = new ArrayList<ContestUserDetailsSoap>(models.size());

		for (ContestUserDetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ContestUserDetailsSoap[soapModels.size()]);
	}

	public ContestUserDetailsSoap() {
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

	public long getContestreference_id() {
		return _contestreference_id;
	}

	public void setContestreference_id(long contestreference_id) {
		_contestreference_id = contestreference_id;
	}

	private long _id;
	private String _user_id;
	private long _contestreference_id;
}