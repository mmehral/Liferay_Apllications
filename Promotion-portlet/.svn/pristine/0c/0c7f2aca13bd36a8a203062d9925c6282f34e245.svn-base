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

package com.chola.promotion.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.promotion.service.http.usersServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.promotion.service.http.usersServiceSoap
 * @generated
 */
@ProviderType
public class usersSoap implements Serializable {
	public static usersSoap toSoapModel(users model) {
		usersSoap soapModel = new usersSoap();

		soapModel.setId(model.getId());
		soapModel.setEmpId(model.getEmpId());
		soapModel.setEmpName(model.getEmpName());
		soapModel.setEmpImagePath(model.getEmpImagePath());
		soapModel.setWriteUp(model.getWriteUp());
		soapModel.setAwardedDate(model.getAwardedDate());

		return soapModel;
	}

	public static usersSoap[] toSoapModels(users[] models) {
		usersSoap[] soapModels = new usersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static usersSoap[][] toSoapModels(users[][] models) {
		usersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new usersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new usersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static usersSoap[] toSoapModels(List<users> models) {
		List<usersSoap> soapModels = new ArrayList<usersSoap>(models.size());

		for (users model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new usersSoap[soapModels.size()]);
	}

	public usersSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getEmpId() {
		return _empId;
	}

	public void setEmpId(String empId) {
		_empId = empId;
	}

	public String getEmpName() {
		return _empName;
	}

	public void setEmpName(String empName) {
		_empName = empName;
	}

	public String getEmpImagePath() {
		return _empImagePath;
	}

	public void setEmpImagePath(String empImagePath) {
		_empImagePath = empImagePath;
	}

	public String getWriteUp() {
		return _writeUp;
	}

	public void setWriteUp(String writeUp) {
		_writeUp = writeUp;
	}

	public Date getAwardedDate() {
		return _awardedDate;
	}

	public void setAwardedDate(Date awardedDate) {
		_awardedDate = awardedDate;
	}

	private long _Id;
	private String _empId;
	private String _empName;
	private String _empImagePath;
	private String _writeUp;
	private Date _awardedDate;
}