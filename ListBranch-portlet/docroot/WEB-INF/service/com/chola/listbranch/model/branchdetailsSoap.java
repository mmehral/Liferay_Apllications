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

package com.chola.listbranch.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.listbranch.service.http.branchdetailsServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.listbranch.service.http.branchdetailsServiceSoap
 * @generated
 */
@ProviderType
public class branchdetailsSoap implements Serializable {
	public static branchdetailsSoap toSoapModel(branchdetails model) {
		branchdetailsSoap soapModel = new branchdetailsSoap();

		soapModel.setBranch_id(model.getBranch_id());
		soapModel.setBranch_code(model.getBranch_code());
		soapModel.setBranch_address(model.getBranch_address());
		soapModel.setCity_id(model.getCity_id());

		return soapModel;
	}

	public static branchdetailsSoap[] toSoapModels(branchdetails[] models) {
		branchdetailsSoap[] soapModels = new branchdetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static branchdetailsSoap[][] toSoapModels(branchdetails[][] models) {
		branchdetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new branchdetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new branchdetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static branchdetailsSoap[] toSoapModels(List<branchdetails> models) {
		List<branchdetailsSoap> soapModels = new ArrayList<branchdetailsSoap>(models.size());

		for (branchdetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new branchdetailsSoap[soapModels.size()]);
	}

	public branchdetailsSoap() {
	}

	public long getPrimaryKey() {
		return _branch_id;
	}

	public void setPrimaryKey(long pk) {
		setBranch_id(pk);
	}

	public long getBranch_id() {
		return _branch_id;
	}

	public void setBranch_id(long branch_id) {
		_branch_id = branch_id;
	}

	public String getBranch_code() {
		return _branch_code;
	}

	public void setBranch_code(String branch_code) {
		_branch_code = branch_code;
	}

	public String getBranch_address() {
		return _branch_address;
	}

	public void setBranch_address(String branch_address) {
		_branch_address = branch_address;
	}

	public long getCity_id() {
		return _city_id;
	}

	public void setCity_id(long city_id) {
		_city_id = city_id;
	}

	private long _branch_id;
	private String _branch_code;
	private String _branch_address;
	private long _city_id;
}