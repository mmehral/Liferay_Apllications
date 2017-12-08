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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link product}.
 * </p>
 *
 * @author adms.java1
 * @see product
 * @generated
 */
@ProviderType
public class productWrapper implements product, ModelWrapper<product> {
	public productWrapper(product product) {
		_product = product;
	}

	@Override
	public Class<?> getModelClass() {
		return product.class;
	}

	@Override
	public String getModelClassName() {
		return product.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("product_id", getProduct_id());
		attributes.put("product_name", getProduct_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long product_id = (Long)attributes.get("product_id");

		if (product_id != null) {
			setProduct_id(product_id);
		}

		String product_name = (String)attributes.get("product_name");

		if (product_name != null) {
			setProduct_name(product_name);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _product.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _product.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _product.isNew();
	}

	@Override
	public com.chola.listbranch.model.product toEscapedModel() {
		return new productWrapper(_product.toEscapedModel());
	}

	@Override
	public com.chola.listbranch.model.product toUnescapedModel() {
		return new productWrapper(_product.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _product.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.listbranch.model.product> toCacheModel() {
		return _product.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.listbranch.model.product product) {
		return _product.compareTo(product);
	}

	@Override
	public int hashCode() {
		return _product.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _product.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new productWrapper((product)_product.clone());
	}

	/**
	* Returns the product_name of this product.
	*
	* @return the product_name of this product
	*/
	@Override
	public java.lang.String getProduct_name() {
		return _product.getProduct_name();
	}

	@Override
	public java.lang.String toString() {
		return _product.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _product.toXmlString();
	}

	/**
	* Returns the primary key of this product.
	*
	* @return the primary key of this product
	*/
	@Override
	public long getPrimaryKey() {
		return _product.getPrimaryKey();
	}

	/**
	* Returns the product_id of this product.
	*
	* @return the product_id of this product
	*/
	@Override
	public long getProduct_id() {
		return _product.getProduct_id();
	}

	@Override
	public void persist() {
		_product.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_product.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_product.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_product.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_product.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_product.setNew(n);
	}

	/**
	* Sets the primary key of this product.
	*
	* @param primaryKey the primary key of this product
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_product.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_product.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product_id of this product.
	*
	* @param product_id the product_id of this product
	*/
	@Override
	public void setProduct_id(long product_id) {
		_product.setProduct_id(product_id);
	}

	/**
	* Sets the product_name of this product.
	*
	* @param product_name the product_name of this product
	*/
	@Override
	public void setProduct_name(java.lang.String product_name) {
		_product.setProduct_name(product_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof productWrapper)) {
			return false;
		}

		productWrapper productWrapper = (productWrapper)obj;

		if (Objects.equals(_product, productWrapper._product)) {
			return true;
		}

		return false;
	}

	@Override
	public product getWrappedModel() {
		return _product;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _product.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _product.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_product.resetOriginalValues();
	}

	private final product _product;
}