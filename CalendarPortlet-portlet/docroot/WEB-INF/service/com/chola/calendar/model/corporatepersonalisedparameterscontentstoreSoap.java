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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.calendar.service.http.corporatepersonalisedparameterscontentstoreServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.calendar.service.http.corporatepersonalisedparameterscontentstoreServiceSoap
 * @generated
 */
@ProviderType
public class corporatepersonalisedparameterscontentstoreSoap
	implements Serializable {
	public static corporatepersonalisedparameterscontentstoreSoap toSoapModel(
		corporatepersonalisedparameterscontentstore model) {
		corporatepersonalisedparameterscontentstoreSoap soapModel = new corporatepersonalisedparameterscontentstoreSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setBusiness(model.getBusiness());
		soapModel.setUnit(model.getUnit());
		soapModel.setFunction(model.getFunction());
		soapModel.setDepartment(model.getDepartment());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setProduct(model.getProduct());
		soapModel.setZone(model.getZone());
		soapModel.setBranch(model.getBranch());
		soapModel.setGrade(model.getGrade());
		soapModel.setRegion(model.getRegion());
		soapModel.setLocation(model.getLocation());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setGender(model.getGender());
		soapModel.setAge_type(model.getAge_type());
		soapModel.setAge_value(model.getAge_value());
		soapModel.setNotification_type(model.getNotification_type());

		return soapModel;
	}

	public static corporatepersonalisedparameterscontentstoreSoap[] toSoapModels(
		corporatepersonalisedparameterscontentstore[] models) {
		corporatepersonalisedparameterscontentstoreSoap[] soapModels = new corporatepersonalisedparameterscontentstoreSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static corporatepersonalisedparameterscontentstoreSoap[][] toSoapModels(
		corporatepersonalisedparameterscontentstore[][] models) {
		corporatepersonalisedparameterscontentstoreSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new corporatepersonalisedparameterscontentstoreSoap[models.length][models[0].length];
		}
		else {
			soapModels = new corporatepersonalisedparameterscontentstoreSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static corporatepersonalisedparameterscontentstoreSoap[] toSoapModels(
		List<corporatepersonalisedparameterscontentstore> models) {
		List<corporatepersonalisedparameterscontentstoreSoap> soapModels = new ArrayList<corporatepersonalisedparameterscontentstoreSoap>(models.size());

		for (corporatepersonalisedparameterscontentstore model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new corporatepersonalisedparameterscontentstoreSoap[soapModels.size()]);
	}

	public corporatepersonalisedparameterscontentstoreSoap() {
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

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public String getBusiness() {
		return _business;
	}

	public void setBusiness(String business) {
		_business = business;
	}

	public String getUnit() {
		return _unit;
	}

	public void setUnit(String unit) {
		_unit = unit;
	}

	public String getFunction() {
		return _function;
	}

	public void setFunction(String function) {
		_function = function;
	}

	public String getDepartment() {
		return _department;
	}

	public void setDepartment(String department) {
		_department = department;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	public String getProduct() {
		return _product;
	}

	public void setProduct(String product) {
		_product = product;
	}

	public String getZone() {
		return _zone;
	}

	public void setZone(String zone) {
		_zone = zone;
	}

	public String getBranch() {
		return _branch;
	}

	public void setBranch(String branch) {
		_branch = branch;
	}

	public String getGrade() {
		return _grade;
	}

	public void setGrade(String grade) {
		_grade = grade;
	}

	public String getRegion() {
		return _region;
	}

	public void setRegion(String region) {
		_region = region;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getUser_id() {
		return _user_id;
	}

	public void setUser_id(String user_id) {
		_user_id = user_id;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getAge_type() {
		return _age_type;
	}

	public void setAge_type(String age_type) {
		_age_type = age_type;
	}

	public String getAge_value() {
		return _age_value;
	}

	public void setAge_value(String age_value) {
		_age_value = age_value;
	}

	public long getNotification_type() {
		return _notification_type;
	}

	public void setNotification_type(long notification_type) {
		_notification_type = notification_type;
	}

	private long _id;
	private long _content_id;
	private String _business;
	private String _unit;
	private String _function;
	private String _department;
	private String _designation;
	private String _product;
	private String _zone;
	private String _branch;
	private String _grade;
	private String _region;
	private String _location;
	private String _user_id;
	private String _gender;
	private String _age_type;
	private String _age_value;
	private long _notification_type;
}