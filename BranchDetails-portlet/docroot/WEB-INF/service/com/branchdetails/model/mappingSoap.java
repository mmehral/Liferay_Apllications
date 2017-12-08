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

package com.branchdetails.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.branchdetails.service.http.mappingServiceSoap}.
 *
 * @author adms.java1
 * @see com.branchdetails.service.http.mappingServiceSoap
 * @generated
 */
@ProviderType
public class mappingSoap implements Serializable {
	public static mappingSoap toSoapModel(mapping model) {
		mappingSoap soapModel = new mappingSoap();

		soapModel.setMapping_id(model.getMapping_id());
		soapModel.setProduct_id(model.getProduct_id());
		soapModel.setState_id(model.getState_id());
		soapModel.setCity_id(model.getCity_id());
		soapModel.setBranch_id(model.getBranch_id());

		return soapModel;
	}

	public static mappingSoap[] toSoapModels(mapping[] models) {
		mappingSoap[] soapModels = new mappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static mappingSoap[][] toSoapModels(mapping[][] models) {
		mappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new mappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new mappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static mappingSoap[] toSoapModels(List<mapping> models) {
		List<mappingSoap> soapModels = new ArrayList<mappingSoap>(models.size());

		for (mapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new mappingSoap[soapModels.size()]);
	}

	public mappingSoap() {
	}

	public long getPrimaryKey() {
		return _mapping_id;
	}

	public void setPrimaryKey(long pk) {
		setMapping_id(pk);
	}

	public long getMapping_id() {
		return _mapping_id;
	}

	public void setMapping_id(long mapping_id) {
		_mapping_id = mapping_id;
	}

	public long getProduct_id() {
		return _product_id;
	}

	public void setProduct_id(long product_id) {
		_product_id = product_id;
	}

	public long getState_id() {
		return _state_id;
	}

	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	public long getCity_id() {
		return _city_id;
	}

	public void setCity_id(long city_id) {
		_city_id = city_id;
	}

	public long getBranch_id() {
		return _branch_id;
	}

	public void setBranch_id(long branch_id) {
		_branch_id = branch_id;
	}

	private long _mapping_id;
	private long _product_id;
	private long _state_id;
	private long _city_id;
	private long _branch_id;
}