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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link BuySellProducts}.
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySellProducts
 * @generated
 */
@ProviderType
public class BuySellProductsWrapper implements BuySellProducts,
	ModelWrapper<BuySellProducts> {
	public BuySellProductsWrapper(BuySellProducts buySellProducts) {
		_buySellProducts = buySellProducts;
	}

	@Override
	public Class<?> getModelClass() {
		return BuySellProducts.class;
	}

	@Override
	public String getModelClassName() {
		return BuySellProducts.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("sellerName", getSellerName());
		attributes.put("contactNumber", getContactNumber());
		attributes.put("content_id", getContent_id());
		attributes.put("category_id", getCategory_id());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("askingPrice", getAskingPrice());
		attributes.put("userScreenName", getUserScreenName());
		attributes.put("location", getLocation());
		attributes.put("status", getStatus());
		attributes.put("approvedstatus", getApprovedstatus());
		attributes.put("created_date", getCreated_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String sellerName = (String)attributes.get("sellerName");

		if (sellerName != null) {
			setSellerName(sellerName);
		}

		String contactNumber = (String)attributes.get("contactNumber");

		if (contactNumber != null) {
			setContactNumber(contactNumber);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		Long category_id = (Long)attributes.get("category_id");

		if (category_id != null) {
			setCategory_id(category_id);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String askingPrice = (String)attributes.get("askingPrice");

		if (askingPrice != null) {
			setAskingPrice(askingPrice);
		}

		String userScreenName = (String)attributes.get("userScreenName");

		if (userScreenName != null) {
			setUserScreenName(userScreenName);
		}

		Long location = (Long)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long approvedstatus = (Long)attributes.get("approvedstatus");

		if (approvedstatus != null) {
			setApprovedstatus(approvedstatus);
		}

		Date created_date = (Date)attributes.get("created_date");

		if (created_date != null) {
			setCreated_date(created_date);
		}
	}

	@Override
	public BuySellProducts toEscapedModel() {
		return new BuySellProductsWrapper(_buySellProducts.toEscapedModel());
	}

	@Override
	public BuySellProducts toUnescapedModel() {
		return new BuySellProductsWrapper(_buySellProducts.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _buySellProducts.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _buySellProducts.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _buySellProducts.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _buySellProducts.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<BuySellProducts> toCacheModel() {
		return _buySellProducts.toCacheModel();
	}

	@Override
	public int compareTo(BuySellProducts buySellProducts) {
		return _buySellProducts.compareTo(buySellProducts);
	}

	@Override
	public int hashCode() {
		return _buySellProducts.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _buySellProducts.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BuySellProductsWrapper((BuySellProducts)_buySellProducts.clone());
	}

	/**
	* Returns the asking price of this buy sell products.
	*
	* @return the asking price of this buy sell products
	*/
	@Override
	public java.lang.String getAskingPrice() {
		return _buySellProducts.getAskingPrice();
	}

	/**
	* Returns the contact number of this buy sell products.
	*
	* @return the contact number of this buy sell products
	*/
	@Override
	public java.lang.String getContactNumber() {
		return _buySellProducts.getContactNumber();
	}

	/**
	* Returns the description of this buy sell products.
	*
	* @return the description of this buy sell products
	*/
	@Override
	public java.lang.String getDescription() {
		return _buySellProducts.getDescription();
	}

	/**
	* Returns the seller name of this buy sell products.
	*
	* @return the seller name of this buy sell products
	*/
	@Override
	public java.lang.String getSellerName() {
		return _buySellProducts.getSellerName();
	}

	/**
	* Returns the title of this buy sell products.
	*
	* @return the title of this buy sell products
	*/
	@Override
	public java.lang.String getTitle() {
		return _buySellProducts.getTitle();
	}

	/**
	* Returns the user screen name of this buy sell products.
	*
	* @return the user screen name of this buy sell products
	*/
	@Override
	public java.lang.String getUserScreenName() {
		return _buySellProducts.getUserScreenName();
	}

	@Override
	public java.lang.String toString() {
		return _buySellProducts.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _buySellProducts.toXmlString();
	}

	/**
	* Returns the created_date of this buy sell products.
	*
	* @return the created_date of this buy sell products
	*/
	@Override
	public Date getCreated_date() {
		return _buySellProducts.getCreated_date();
	}

	/**
	* Returns the approvedstatus of this buy sell products.
	*
	* @return the approvedstatus of this buy sell products
	*/
	@Override
	public long getApprovedstatus() {
		return _buySellProducts.getApprovedstatus();
	}

	/**
	* Returns the category_id of this buy sell products.
	*
	* @return the category_id of this buy sell products
	*/
	@Override
	public long getCategory_id() {
		return _buySellProducts.getCategory_id();
	}

	/**
	* Returns the content_id of this buy sell products.
	*
	* @return the content_id of this buy sell products
	*/
	@Override
	public long getContent_id() {
		return _buySellProducts.getContent_id();
	}

	/**
	* Returns the ID of this buy sell products.
	*
	* @return the ID of this buy sell products
	*/
	@Override
	public long getId() {
		return _buySellProducts.getId();
	}

	/**
	* Returns the location of this buy sell products.
	*
	* @return the location of this buy sell products
	*/
	@Override
	public long getLocation() {
		return _buySellProducts.getLocation();
	}

	/**
	* Returns the primary key of this buy sell products.
	*
	* @return the primary key of this buy sell products
	*/
	@Override
	public long getPrimaryKey() {
		return _buySellProducts.getPrimaryKey();
	}

	/**
	* Returns the status of this buy sell products.
	*
	* @return the status of this buy sell products
	*/
	@Override
	public long getStatus() {
		return _buySellProducts.getStatus();
	}

	@Override
	public void persist() {
		_buySellProducts.persist();
	}

	/**
	* Sets the approvedstatus of this buy sell products.
	*
	* @param approvedstatus the approvedstatus of this buy sell products
	*/
	@Override
	public void setApprovedstatus(long approvedstatus) {
		_buySellProducts.setApprovedstatus(approvedstatus);
	}

	/**
	* Sets the asking price of this buy sell products.
	*
	* @param askingPrice the asking price of this buy sell products
	*/
	@Override
	public void setAskingPrice(java.lang.String askingPrice) {
		_buySellProducts.setAskingPrice(askingPrice);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_buySellProducts.setCachedModel(cachedModel);
	}

	/**
	* Sets the category_id of this buy sell products.
	*
	* @param category_id the category_id of this buy sell products
	*/
	@Override
	public void setCategory_id(long category_id) {
		_buySellProducts.setCategory_id(category_id);
	}

	/**
	* Sets the contact number of this buy sell products.
	*
	* @param contactNumber the contact number of this buy sell products
	*/
	@Override
	public void setContactNumber(java.lang.String contactNumber) {
		_buySellProducts.setContactNumber(contactNumber);
	}

	/**
	* Sets the content_id of this buy sell products.
	*
	* @param content_id the content_id of this buy sell products
	*/
	@Override
	public void setContent_id(long content_id) {
		_buySellProducts.setContent_id(content_id);
	}

	/**
	* Sets the created_date of this buy sell products.
	*
	* @param created_date the created_date of this buy sell products
	*/
	@Override
	public void setCreated_date(Date created_date) {
		_buySellProducts.setCreated_date(created_date);
	}

	/**
	* Sets the description of this buy sell products.
	*
	* @param description the description of this buy sell products
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_buySellProducts.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_buySellProducts.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_buySellProducts.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_buySellProducts.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this buy sell products.
	*
	* @param id the ID of this buy sell products
	*/
	@Override
	public void setId(long id) {
		_buySellProducts.setId(id);
	}

	/**
	* Sets the location of this buy sell products.
	*
	* @param location the location of this buy sell products
	*/
	@Override
	public void setLocation(long location) {
		_buySellProducts.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_buySellProducts.setNew(n);
	}

	/**
	* Sets the primary key of this buy sell products.
	*
	* @param primaryKey the primary key of this buy sell products
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_buySellProducts.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_buySellProducts.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the seller name of this buy sell products.
	*
	* @param sellerName the seller name of this buy sell products
	*/
	@Override
	public void setSellerName(java.lang.String sellerName) {
		_buySellProducts.setSellerName(sellerName);
	}

	/**
	* Sets the status of this buy sell products.
	*
	* @param status the status of this buy sell products
	*/
	@Override
	public void setStatus(long status) {
		_buySellProducts.setStatus(status);
	}

	/**
	* Sets the title of this buy sell products.
	*
	* @param title the title of this buy sell products
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_buySellProducts.setTitle(title);
	}

	/**
	* Sets the user screen name of this buy sell products.
	*
	* @param userScreenName the user screen name of this buy sell products
	*/
	@Override
	public void setUserScreenName(java.lang.String userScreenName) {
		_buySellProducts.setUserScreenName(userScreenName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BuySellProductsWrapper)) {
			return false;
		}

		BuySellProductsWrapper buySellProductsWrapper = (BuySellProductsWrapper)obj;

		if (Objects.equals(_buySellProducts,
					buySellProductsWrapper._buySellProducts)) {
			return true;
		}

		return false;
	}

	@Override
	public BuySellProducts getWrappedModel() {
		return _buySellProducts;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _buySellProducts.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _buySellProducts.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_buySellProducts.resetOriginalValues();
	}

	private final BuySellProducts _buySellProducts;
}