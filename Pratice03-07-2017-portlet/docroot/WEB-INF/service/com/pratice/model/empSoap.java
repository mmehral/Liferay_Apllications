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

package com.pratice.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.pratice.service.http.empServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.pratice.service.http.empServiceSoap
 * @generated
 */
@ProviderType
public class empSoap implements Serializable {
	public static empSoap toSoapModel(emp model) {
		empSoap soapModel = new empSoap();

		soapModel.setEmpId(model.getEmpId());
		soapModel.setEmpName(model.getEmpName());
		soapModel.setDept(model.getDept());
		soapModel.setSalary(model.getSalary());

		return soapModel;
	}

	public static empSoap[] toSoapModels(emp[] models) {
		empSoap[] soapModels = new empSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static empSoap[][] toSoapModels(emp[][] models) {
		empSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new empSoap[models.length][models[0].length];
		}
		else {
			soapModels = new empSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static empSoap[] toSoapModels(List<emp> models) {
		List<empSoap> soapModels = new ArrayList<empSoap>(models.size());

		for (emp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new empSoap[soapModels.size()]);
	}

	public empSoap() {
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

	public String getEmpName() {
		return _empName;
	}

	public void setEmpName(String empName) {
		_empName = empName;
	}

	public String getDept() {
		return _dept;
	}

	public void setDept(String dept) {
		_dept = dept;
	}

	public String getSalary() {
		return _salary;
	}

	public void setSalary(String salary) {
		_salary = salary;
	}

	private long _empId;
	private String _empName;
	private String _dept;
	private String _salary;
}