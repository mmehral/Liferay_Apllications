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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link customer}.
 * </p>
 *
 * @author CloverLiferay01
 * @see customer
 * @generated
 */
@ProviderType
public class customerWrapper implements customer, ModelWrapper<customer> {
	public customerWrapper(customer customer) {
		_customer = customer;
	}

	@Override
	public Class<?> getModelClass() {
		return customer.class;
	}

	@Override
	public String getModelClassName() {
		return customer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("customerId", getCustomerId());
		attributes.put("name", getName());
		attributes.put("product", getProduct());
		attributes.put("PhoneNo", getPhoneNo());
		attributes.put("price", getPrice());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String product = (String)attributes.get("product");

		if (product != null) {
			setProduct(product);
		}

		Integer PhoneNo = (Integer)attributes.get("PhoneNo");

		if (PhoneNo != null) {
			setPhoneNo(PhoneNo);
		}

		Float price = (Float)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _customer.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _customer.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _customer.isNew();
	}

	@Override
	public com.customer.model.customer toEscapedModel() {
		return new customerWrapper(_customer.toEscapedModel());
	}

	@Override
	public com.customer.model.customer toUnescapedModel() {
		return new customerWrapper(_customer.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _customer.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.customer.model.customer> toCacheModel() {
		return _customer.toCacheModel();
	}

	/**
	* Returns the price of this customer.
	*
	* @return the price of this customer
	*/
	@Override
	public float getPrice() {
		return _customer.getPrice();
	}

	@Override
	public int compareTo(com.customer.model.customer customer) {
		return _customer.compareTo(customer);
	}

	/**
	* Returns the phone no of this customer.
	*
	* @return the phone no of this customer
	*/
	@Override
	public int getPhoneNo() {
		return _customer.getPhoneNo();
	}

	@Override
	public int hashCode() {
		return _customer.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customer.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new customerWrapper((customer)_customer.clone());
	}

	/**
	* Returns the email of this customer.
	*
	* @return the email of this customer
	*/
	@Override
	public java.lang.String getEmail() {
		return _customer.getEmail();
	}

	/**
	* Returns the name of this customer.
	*
	* @return the name of this customer
	*/
	@Override
	public java.lang.String getName() {
		return _customer.getName();
	}

	/**
	* Returns the product of this customer.
	*
	* @return the product of this customer
	*/
	@Override
	public java.lang.String getProduct() {
		return _customer.getProduct();
	}

	@Override
	public java.lang.String toString() {
		return _customer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customer.toXmlString();
	}

	/**
	* Returns the customer ID of this customer.
	*
	* @return the customer ID of this customer
	*/
	@Override
	public long getCustomerId() {
		return _customer.getCustomerId();
	}

	/**
	* Returns the primary key of this customer.
	*
	* @return the primary key of this customer
	*/
	@Override
	public long getPrimaryKey() {
		return _customer.getPrimaryKey();
	}

	@Override
	public void persist() {
		_customer.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customer.setCachedModel(cachedModel);
	}

	/**
	* Sets the customer ID of this customer.
	*
	* @param customerId the customer ID of this customer
	*/
	@Override
	public void setCustomerId(long customerId) {
		_customer.setCustomerId(customerId);
	}

	/**
	* Sets the email of this customer.
	*
	* @param email the email of this customer
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_customer.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_customer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_customer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_customer.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the name of this customer.
	*
	* @param name the name of this customer
	*/
	@Override
	public void setName(java.lang.String name) {
		_customer.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_customer.setNew(n);
	}

	/**
	* Sets the phone no of this customer.
	*
	* @param PhoneNo the phone no of this customer
	*/
	@Override
	public void setPhoneNo(int PhoneNo) {
		_customer.setPhoneNo(PhoneNo);
	}

	/**
	* Sets the price of this customer.
	*
	* @param price the price of this customer
	*/
	@Override
	public void setPrice(float price) {
		_customer.setPrice(price);
	}

	/**
	* Sets the primary key of this customer.
	*
	* @param primaryKey the primary key of this customer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_customer.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_customer.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product of this customer.
	*
	* @param product the product of this customer
	*/
	@Override
	public void setProduct(java.lang.String product) {
		_customer.setProduct(product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof customerWrapper)) {
			return false;
		}

		customerWrapper customerWrapper = (customerWrapper)obj;

		if (Objects.equals(_customer, customerWrapper._customer)) {
			return true;
		}

		return false;
	}

	@Override
	public customer getWrappedModel() {
		return _customer;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _customer.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _customer.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_customer.resetOriginalValues();
	}

	private final customer _customer;
}