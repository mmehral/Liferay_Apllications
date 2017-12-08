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

package com.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.service.http.productServiceSoap}.
 *
 * @author adms.java1
 * @see com.service.http.productServiceSoap
 * @generated
 */
@ProviderType
public class productSoap implements Serializable {
	public static productSoap toSoapModel(product model) {
		productSoap soapModel = new productSoap();

		soapModel.setProduct_id(model.getProduct_id());
		soapModel.setProduct_name(model.getProduct_name());

		return soapModel;
	}

	public static productSoap[] toSoapModels(product[] models) {
		productSoap[] soapModels = new productSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static productSoap[][] toSoapModels(product[][] models) {
		productSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new productSoap[models.length][models[0].length];
		}
		else {
			soapModels = new productSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static productSoap[] toSoapModels(List<product> models) {
		List<productSoap> soapModels = new ArrayList<productSoap>(models.size());

		for (product model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new productSoap[soapModels.size()]);
	}

	public productSoap() {
	}

	public long getPrimaryKey() {
		return _product_id;
	}

	public void setPrimaryKey(long pk) {
		setProduct_id(pk);
	}

	public long getProduct_id() {
		return _product_id;
	}

	public void setProduct_id(long product_id) {
		_product_id = product_id;
	}

	public String getProduct_name() {
		return _product_name;
	}

	public void setProduct_name(String product_name) {
		_product_name = product_name;
	}

	private long _product_id;
	private String _product_name;
}