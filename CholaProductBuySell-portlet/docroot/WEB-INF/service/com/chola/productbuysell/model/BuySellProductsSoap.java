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

package com.chola.productbuysell.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.productbuysell.service.http.BuySellProductsServiceSoap}.
 *
 * @author CloverLiferay03
 * @see com.chola.productbuysell.service.http.BuySellProductsServiceSoap
 * @generated
 */
@ProviderType
public class BuySellProductsSoap implements Serializable {
	public static BuySellProductsSoap toSoapModel(BuySellProducts model) {
		BuySellProductsSoap soapModel = new BuySellProductsSoap();

		soapModel.setId(model.getId());
		soapModel.setSellerName(model.getSellerName());
		soapModel.setContactNumber(model.getContactNumber());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setCategory_id(model.getCategory_id());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setAskingPrice(model.getAskingPrice());
		soapModel.setUserScreenName(model.getUserScreenName());
		soapModel.setLocation(model.getLocation());
		soapModel.setStatus(model.getStatus());
		soapModel.setApprovedstatus(model.getApprovedstatus());
		soapModel.setCreated_date(model.getCreated_date());

		return soapModel;
	}

	public static BuySellProductsSoap[] toSoapModels(BuySellProducts[] models) {
		BuySellProductsSoap[] soapModels = new BuySellProductsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BuySellProductsSoap[][] toSoapModels(
		BuySellProducts[][] models) {
		BuySellProductsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BuySellProductsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BuySellProductsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BuySellProductsSoap[] toSoapModels(
		List<BuySellProducts> models) {
		List<BuySellProductsSoap> soapModels = new ArrayList<BuySellProductsSoap>(models.size());

		for (BuySellProducts model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BuySellProductsSoap[soapModels.size()]);
	}

	public BuySellProductsSoap() {
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

	public String getSellerName() {
		return _sellerName;
	}

	public void setSellerName(String sellerName) {
		_sellerName = sellerName;
	}

	public String getContactNumber() {
		return _contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		_contactNumber = contactNumber;
	}

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public long getCategory_id() {
		return _category_id;
	}

	public void setCategory_id(long category_id) {
		_category_id = category_id;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getAskingPrice() {
		return _askingPrice;
	}

	public void setAskingPrice(String askingPrice) {
		_askingPrice = askingPrice;
	}

	public String getUserScreenName() {
		return _userScreenName;
	}

	public void setUserScreenName(String userScreenName) {
		_userScreenName = userScreenName;
	}

	public long getLocation() {
		return _location;
	}

	public void setLocation(long location) {
		_location = location;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	public long getApprovedstatus() {
		return _approvedstatus;
	}

	public void setApprovedstatus(long approvedstatus) {
		_approvedstatus = approvedstatus;
	}

	public Date getCreated_date() {
		return _created_date;
	}

	public void setCreated_date(Date created_date) {
		_created_date = created_date;
	}

	private long _id;
	private String _sellerName;
	private String _contactNumber;
	private long _content_id;
	private long _category_id;
	private String _title;
	private String _description;
	private String _askingPrice;
	private String _userScreenName;
	private long _location;
	private long _status;
	private long _approvedstatus;
	private Date _created_date;
}