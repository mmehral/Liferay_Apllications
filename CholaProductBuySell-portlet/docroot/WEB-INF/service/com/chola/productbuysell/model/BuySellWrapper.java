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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link BuySell}.
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySell
 * @generated
 */
@ProviderType
public class BuySellWrapper implements BuySell, ModelWrapper<BuySell> {
	public BuySellWrapper(BuySell buySell) {
		_buySell = buySell;
	}

	@Override
	public Class<?> getModelClass() {
		return BuySell.class;
	}

	@Override
	public String getModelClassName() {
		return BuySell.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public BuySell toEscapedModel() {
		return new BuySellWrapper(_buySell.toEscapedModel());
	}

	@Override
	public BuySell toUnescapedModel() {
		return new BuySellWrapper(_buySell.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _buySell.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _buySell.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _buySell.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _buySell.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<BuySell> toCacheModel() {
		return _buySell.toCacheModel();
	}

	@Override
	public int compareTo(BuySell buySell) {
		return _buySell.compareTo(buySell);
	}

	@Override
	public int hashCode() {
		return _buySell.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _buySell.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BuySellWrapper((BuySell)_buySell.clone());
	}

	/**
	* Returns the name of this buy sell.
	*
	* @return the name of this buy sell
	*/
	@Override
	public java.lang.String getName() {
		return _buySell.getName();
	}

	@Override
	public java.lang.String toString() {
		return _buySell.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _buySell.toXmlString();
	}

	/**
	* Returns the ID of this buy sell.
	*
	* @return the ID of this buy sell
	*/
	@Override
	public long getId() {
		return _buySell.getId();
	}

	/**
	* Returns the primary key of this buy sell.
	*
	* @return the primary key of this buy sell
	*/
	@Override
	public long getPrimaryKey() {
		return _buySell.getPrimaryKey();
	}

	@Override
	public void persist() {
		_buySell.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_buySell.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_buySell.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_buySell.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_buySell.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this buy sell.
	*
	* @param id the ID of this buy sell
	*/
	@Override
	public void setId(long id) {
		_buySell.setId(id);
	}

	/**
	* Sets the name of this buy sell.
	*
	* @param name the name of this buy sell
	*/
	@Override
	public void setName(java.lang.String name) {
		_buySell.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_buySell.setNew(n);
	}

	/**
	* Sets the primary key of this buy sell.
	*
	* @param primaryKey the primary key of this buy sell
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_buySell.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_buySell.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BuySellWrapper)) {
			return false;
		}

		BuySellWrapper buySellWrapper = (BuySellWrapper)obj;

		if (Objects.equals(_buySell, buySellWrapper._buySell)) {
			return true;
		}

		return false;
	}

	@Override
	public BuySell getWrappedModel() {
		return _buySell;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _buySell.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _buySell.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_buySell.resetOriginalValues();
	}

	private final BuySell _buySell;
}