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

package com.service.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.service.service.http.employeeServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.service.service.http.employeeServiceSoap
 * @generated
 */
@ProviderType
public class employeeSoap implements Serializable {
	public static employeeSoap toSoapModel(employee model) {
		employeeSoap soapModel = new employeeSoap();

		soapModel.setEmpId(model.getEmpId());
		soapModel.setName(model.getName());
		soapModel.setEmail(model.getEmail());
		soapModel.setDept(model.getDept());
		soapModel.setMobileNo(model.getMobileNo());

		return soapModel;
	}

	public static employeeSoap[] toSoapModels(employee[] models) {
		employeeSoap[] soapModels = new employeeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static employeeSoap[][] toSoapModels(employee[][] models) {
		employeeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new employeeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new employeeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static employeeSoap[] toSoapModels(List<employee> models) {
		List<employeeSoap> soapModels = new ArrayList<employeeSoap>(models.size());

		for (employee model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new employeeSoap[soapModels.size()]);
	}

	public employeeSoap() {
	}

	public long getPrimaryKey() {
		return _empId;
	}

	public void setPrimaryKey(long pk) {
		setEmpId(pk);
	}

	public long getEmpId() {
		return _empId;
	}

	public void setEmpId(long empId) {
		_empId = empId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getDept() {
		return _dept;
	}

	public void setDept(String dept) {
		_dept = dept;
	}

	public int getMobileNo() {
		return _mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		_mobileNo = mobileNo;
	}

	private long _empId;
	private String _name;
	private String _email;
	private String _dept;
	private int _mobileNo;
}