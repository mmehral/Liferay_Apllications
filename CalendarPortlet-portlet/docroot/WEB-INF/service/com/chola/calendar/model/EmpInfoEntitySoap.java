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

package com.chola.calendar.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.calendar.service.http.EmpInfoEntityServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.calendar.service.http.EmpInfoEntityServiceSoap
 * @generated
 */
@ProviderType
public class EmpInfoEntitySoap implements Serializable {
	public static EmpInfoEntitySoap toSoapModel(EmpInfoEntity model) {
		EmpInfoEntitySoap soapModel = new EmpInfoEntitySoap();

		soapModel.setId(model.getId());
		soapModel.setEmpId(model.getEmpId());
		soapModel.setName(model.getName());
		soapModel.setEmailid(model.getEmailid());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setGrade(model.getGrade());
		soapModel.setFunctionName(model.getFunctionName());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setSubdepartment(model.getSubdepartment());
		soapModel.setLocation(model.getLocation());
		soapModel.setGender(model.getGender());
		soapModel.setUnit(model.getUnit());
		soapModel.setUserid(model.getUserid());

		return soapModel;
	}

	public static EmpInfoEntitySoap[] toSoapModels(EmpInfoEntity[] models) {
		EmpInfoEntitySoap[] soapModels = new EmpInfoEntitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmpInfoEntitySoap[][] toSoapModels(EmpInfoEntity[][] models) {
		EmpInfoEntitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmpInfoEntitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmpInfoEntitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmpInfoEntitySoap[] toSoapModels(List<EmpInfoEntity> models) {
		List<EmpInfoEntitySoap> soapModels = new ArrayList<EmpInfoEntitySoap>(models.size());

		for (EmpInfoEntity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmpInfoEntitySoap[soapModels.size()]);
	}

	public EmpInfoEntitySoap() {
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

	public String getEmpId() {
		return _empId;
	}

	public void setEmpId(String empId) {
		_empId = empId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEmailid() {
		return _emailid;
	}

	public void setEmailid(String emailid) {
		_emailid = emailid;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public String getGrade() {
		return _grade;
	}

	public void setGrade(String grade) {
		_grade = grade;
	}

	public String getFunctionName() {
		return _functionName;
	}

	public void setFunctionName(String functionName) {
		_functionName = functionName;
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	public String getSubdepartment() {
		return _subdepartment;
	}

	public void setSubdepartment(String subdepartment) {
		_subdepartment = subdepartment;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getUnit() {
		return _unit;
	}

	public void setUnit(String unit) {
		_unit = unit;
	}

	public String getUserid() {
		return _userid;
	}

	public void setUserid(String userid) {
		_userid = userid;
	}

	private long _id;
	private String _empId;
	private String _name;
	private String _emailid;
	private Date _birthday;
	private String _grade;
	private String _functionName;
	private String _department;
	private String _subdepartment;
	private String _location;
	private String _gender;
	private String _unit;
	private String _userid;
}