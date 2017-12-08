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

package com.customer.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.customer.service.http.customerServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.customer.service.http.customerServiceSoap
 * @generated
 */
@ProviderType
public class customerSoap implements Serializable {
	public static customerSoap toSoapModel(customer model) {
		customerSoap soapModel = new customerSoap();

		soapModel.setCustomerId(model.getCustomerId());
		soapModel.setName(model.getName());
		soapModel.setProduct(model.getProduct());
		soapModel.setPhoneNo(model.getPhoneNo());
		soapModel.setPrice(model.getPrice());
		soapModel.setEmail(model.getEmail());

		return soapModel;
	}

	public static customerSoap[] toSoapModels(customer[] models) {
		customerSoap[] soapModels = new customerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static customerSoap[][] toSoapModels(customer[][] models) {
		customerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new customerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new customerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static customerSoap[] toSoapModels(List<customer> models) {
		List<customerSoap> soapModels = new ArrayList<customerSoap>(models.size());

		for (customer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new customerSoap[soapModels.size()]);
	}

	public customerSoap() {
	}

	public long getPrimaryKey() {
		return _customerId;
	}

	public void setPrimaryKey(long pk) {
		setCustomerId(pk);
	}

	public long getCustomerId() {
		return _customerId;
	}

	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getProduct() {
		return _product;
	}

	public void setProduct(String product) {
		_product = product;
	}

	public int getPhoneNo() {
		return _PhoneNo;
	}

	public void setPhoneNo(int PhoneNo) {
		_PhoneNo = PhoneNo;
	}

	public float getPrice() {
		return _price;
	}

	public void setPrice(float price) {
		_price = price;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	private long _customerId;
	private String _name;
	private String _product;
	private int _PhoneNo;
	private float _price;
	private String _email;
}