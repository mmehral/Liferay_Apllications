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

package com.chola.topsearch.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author adms.java1
 * @generated
 */
@ProviderType
public class TopSearchSoap implements Serializable {
	public static TopSearchSoap toSoapModel(TopSearch model) {
		TopSearchSoap soapModel = new TopSearchSoap();

		soapModel.setSrchId(model.getSrchId());
		soapModel.setName(model.getName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static TopSearchSoap[] toSoapModels(TopSearch[] models) {
		TopSearchSoap[] soapModels = new TopSearchSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TopSearchSoap[][] toSoapModels(TopSearch[][] models) {
		TopSearchSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TopSearchSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TopSearchSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TopSearchSoap[] toSoapModels(List<TopSearch> models) {
		List<TopSearchSoap> soapModels = new ArrayList<TopSearchSoap>(models.size());

		for (TopSearch model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TopSearchSoap[soapModels.size()]);
	}

	public TopSearchSoap() {
	}

	public long getPrimaryKey() {
		return _srchId;
	}

	public void setPrimaryKey(long pk) {
		setSrchId(pk);
	}

	public long getSrchId() {
		return _srchId;
	}

	public void setSrchId(long srchId) {
		_srchId = srchId;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private long _srchId;
	private String _Name;
	private Date _createDate;
	private Date _modifiedDate;
}