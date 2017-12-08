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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.service.service.http.newhireServiceSoap}.
 *
 * @author adms.java1
 * @see com.service.service.http.newhireServiceSoap
 * @generated
 */
@ProviderType
public class newhireSoap implements Serializable {
	public static newhireSoap toSoapModel(newhire model) {
		newhireSoap soapModel = new newhireSoap();

		soapModel.setNewhire_id(model.getNewhire_id());
		soapModel.setNewhire_name(model.getNewhire_name());
		soapModel.setNewhire_designation(model.getNewhire_designation());
		soapModel.setNewhire_profileimage(model.getNewhire_profileimage());
		soapModel.setNewhire_profileimage_path(model.getNewhire_profileimage_path());
		soapModel.setNewhire_detailedimage(model.getNewhire_detailedimage());
		soapModel.setNewhire_detailedimage_path(model.getNewhire_detailedimage_path());
		soapModel.setNewhire_createdate(model.getNewhire_createdate());
		soapModel.setNewhire_modifieddate(model.getNewhire_modifieddate());

		return soapModel;
	}

	public static newhireSoap[] toSoapModels(newhire[] models) {
		newhireSoap[] soapModels = new newhireSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static newhireSoap[][] toSoapModels(newhire[][] models) {
		newhireSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new newhireSoap[models.length][models[0].length];
		}
		else {
			soapModels = new newhireSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static newhireSoap[] toSoapModels(List<newhire> models) {
		List<newhireSoap> soapModels = new ArrayList<newhireSoap>(models.size());

		for (newhire model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new newhireSoap[soapModels.size()]);
	}

	public newhireSoap() {
	}

	public long getPrimaryKey() {
		return _newhire_id;
	}

	public void setPrimaryKey(long pk) {
		setNewhire_id(pk);
	}

	public long getNewhire_id() {
		return _newhire_id;
	}

	public void setNewhire_id(long newhire_id) {
		_newhire_id = newhire_id;
	}

	public String getNewhire_name() {
		return _newhire_name;
	}

	public void setNewhire_name(String newhire_name) {
		_newhire_name = newhire_name;
	}

	public String getNewhire_designation() {
		return _newhire_designation;
	}

	public void setNewhire_designation(String newhire_designation) {
		_newhire_designation = newhire_designation;
	}

	public String getNewhire_profileimage() {
		return _newhire_profileimage;
	}

	public void setNewhire_profileimage(String newhire_profileimage) {
		_newhire_profileimage = newhire_profileimage;
	}

	public String getNewhire_profileimage_path() {
		return _newhire_profileimage_path;
	}

	public void setNewhire_profileimage_path(String newhire_profileimage_path) {
		_newhire_profileimage_path = newhire_profileimage_path;
	}

	public String getNewhire_detailedimage() {
		return _newhire_detailedimage;
	}

	public void setNewhire_detailedimage(String newhire_detailedimage) {
		_newhire_detailedimage = newhire_detailedimage;
	}

	public String getNewhire_detailedimage_path() {
		return _newhire_detailedimage_path;
	}

	public void setNewhire_detailedimage_path(String newhire_detailedimage_path) {
		_newhire_detailedimage_path = newhire_detailedimage_path;
	}

	public Date getNewhire_createdate() {
		return _newhire_createdate;
	}

	public void setNewhire_createdate(Date newhire_createdate) {
		_newhire_createdate = newhire_createdate;
	}

	public Date getNewhire_modifieddate() {
		return _newhire_modifieddate;
	}

	public void setNewhire_modifieddate(Date newhire_modifieddate) {
		_newhire_modifieddate = newhire_modifieddate;
	}

	private long _newhire_id;
	private String _newhire_name;
	private String _newhire_designation;
	private String _newhire_profileimage;
	private String _newhire_profileimage_path;
	private String _newhire_detailedimage;
	private String _newhire_detailedimage_path;
	private Date _newhire_createdate;
	private Date _newhire_modifieddate;
}