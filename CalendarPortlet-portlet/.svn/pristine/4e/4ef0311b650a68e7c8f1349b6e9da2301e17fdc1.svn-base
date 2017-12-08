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
 * This class is used by SOAP remote services, specifically {@link com.chola.calendar.service.http.dataServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.calendar.service.http.dataServiceSoap
 * @generated
 */
@ProviderType
public class dataSoap implements Serializable {
	public static dataSoap toSoapModel(data model) {
		dataSoap soapModel = new dataSoap();

		soapModel.setEventid(model.getEventid());
		soapModel.setEventdetails(model.getEventdetails());
		soapModel.setEventfrom(model.getEventfrom());
		soapModel.setEventto(model.getEventto());
		soapModel.setLocation(model.getLocation());
		soapModel.setDept(model.getDept());
		soapModel.setSubdept(model.getSubdept());
		soapModel.setGrade(model.getGrade());
		soapModel.setAge(model.getAge());
		soapModel.setCompanyname(model.getCompanyname());
		soapModel.setUserid(model.getUserid());
		soapModel.setGender(model.getGender());

		return soapModel;
	}

	public static dataSoap[] toSoapModels(data[] models) {
		dataSoap[] soapModels = new dataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static dataSoap[][] toSoapModels(data[][] models) {
		dataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new dataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new dataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static dataSoap[] toSoapModels(List<data> models) {
		List<dataSoap> soapModels = new ArrayList<dataSoap>(models.size());

		for (data model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new dataSoap[soapModels.size()]);
	}

	public dataSoap() {
	}

	public long getPrimaryKey() {
		return _eventid;
	}

	public void setPrimaryKey(long pk) {
		setEventid(pk);
	}

	public long getEventid() {
		return _eventid;
	}

	public void setEventid(long eventid) {
		_eventid = eventid;
	}

	public String getEventdetails() {
		return _eventdetails;
	}

	public void setEventdetails(String eventdetails) {
		_eventdetails = eventdetails;
	}

	public String getEventfrom() {
		return _eventfrom;
	}

	public void setEventfrom(String eventfrom) {
		_eventfrom = eventfrom;
	}

	public String getEventto() {
		return _eventto;
	}

	public void setEventto(String eventto) {
		_eventto = eventto;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getDept() {
		return _dept;
	}

	public void setDept(String dept) {
		_dept = dept;
	}

	public String getSubdept() {
		return _subdept;
	}

	public void setSubdept(String subdept) {
		_subdept = subdept;
	}

	public String getGrade() {
		return _grade;
	}

	public void setGrade(String grade) {
		_grade = grade;
	}

	public String getAge() {
		return _age;
	}

	public void setAge(String age) {
		_age = age;
	}

	public String getCompanyname() {
		return _companyname;
	}

	public void setCompanyname(String companyname) {
		_companyname = companyname;
	}

	public String getUserid() {
		return _userid;
	}

	public void setUserid(String userid) {
		_userid = userid;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	private long _eventid;
	private String _eventdetails;
	private String _eventfrom;
	private String _eventto;
	private String _location;
	private String _dept;
	private String _subdept;
	private String _grade;
	private String _age;
	private String _companyname;
	private String _userid;
	private String _gender;
}