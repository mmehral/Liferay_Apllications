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

package com.chola.annual.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.annual.service.http.annualreportsServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.annual.service.http.annualreportsServiceSoap
 * @generated
 */
@ProviderType
public class annualreportsSoap implements Serializable {
	public static annualreportsSoap toSoapModel(annualreports model) {
		annualreportsSoap soapModel = new annualreportsSoap();

		soapModel.setId(model.getId());
		soapModel.setDetails(model.getDetails());
		soapModel.setUpdatedon(model.getUpdatedon());
		soapModel.setUpdatedby(model.getUpdatedby());
		soapModel.setUniquecontentid(model.getUniquecontentid());

		return soapModel;
	}

	public static annualreportsSoap[] toSoapModels(annualreports[] models) {
		annualreportsSoap[] soapModels = new annualreportsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static annualreportsSoap[][] toSoapModels(annualreports[][] models) {
		annualreportsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new annualreportsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new annualreportsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static annualreportsSoap[] toSoapModels(List<annualreports> models) {
		List<annualreportsSoap> soapModels = new ArrayList<annualreportsSoap>(models.size());

		for (annualreports model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new annualreportsSoap[soapModels.size()]);
	}

	public annualreportsSoap() {
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

	public String getDetails() {
		return _details;
	}

	public void setDetails(String details) {
		_details = details;
	}

	public Date getUpdatedon() {
		return _updatedon;
	}

	public void setUpdatedon(Date updatedon) {
		_updatedon = updatedon;
	}

	public long getUpdatedby() {
		return _updatedby;
	}

	public void setUpdatedby(long updatedby) {
		_updatedby = updatedby;
	}

	public long getUniquecontentid() {
		return _uniquecontentid;
	}

	public void setUniquecontentid(long uniquecontentid) {
		_uniquecontentid = uniquecontentid;
	}

	private long _id;
	private String _details;
	private Date _updatedon;
	private long _updatedby;
	private long _uniquecontentid;
}