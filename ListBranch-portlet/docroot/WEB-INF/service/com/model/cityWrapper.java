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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link city}.
 * </p>
 *
 * @author adms.java1
 * @see city
 * @generated
 */
@ProviderType
public class cityWrapper implements city, ModelWrapper<city> {
	public cityWrapper(city city) {
		_city = city;
	}

	@Override
	public Class<?> getModelClass() {
		return city.class;
	}

	@Override
	public String getModelClassName() {
		return city.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("city_id", getCity_id());
		attributes.put("city_name", getCity_name());
		attributes.put("state_id", getState_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long city_id = (Long)attributes.get("city_id");

		if (city_id != null) {
			setCity_id(city_id);
		}

		String city_name = (String)attributes.get("city_name");

		if (city_name != null) {
			setCity_name(city_name);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _city.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _city.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _city.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _city.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.model.city> toCacheModel() {
		return _city.toCacheModel();
	}

	@Override
	public com.model.city toEscapedModel() {
		return new cityWrapper(_city.toEscapedModel());
	}

	@Override
	public com.model.city toUnescapedModel() {
		return new cityWrapper(_city.toUnescapedModel());
	}

	@Override
	public int compareTo(com.model.city city) {
		return _city.compareTo(city);
	}

	@Override
	public int hashCode() {
		return _city.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _city.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new cityWrapper((city)_city.clone());
	}

	/**
	* Returns the city_name of this city.
	*
	* @return the city_name of this city
	*/
	@Override
	public java.lang.String getCity_name() {
		return _city.getCity_name();
	}

	@Override
	public java.lang.String toString() {
		return _city.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _city.toXmlString();
	}

	/**
	* Returns the city_id of this city.
	*
	* @return the city_id of this city
	*/
	@Override
	public long getCity_id() {
		return _city.getCity_id();
	}

	/**
	* Returns the primary key of this city.
	*
	* @return the primary key of this city
	*/
	@Override
	public long getPrimaryKey() {
		return _city.getPrimaryKey();
	}

	/**
	* Returns the state_id of this city.
	*
	* @return the state_id of this city
	*/
	@Override
	public long getState_id() {
		return _city.getState_id();
	}

	@Override
	public void persist() {
		_city.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_city.setCachedModel(cachedModel);
	}

	/**
	* Sets the city_id of this city.
	*
	* @param city_id the city_id of this city
	*/
	@Override
	public void setCity_id(long city_id) {
		_city.setCity_id(city_id);
	}

	/**
	* Sets the city_name of this city.
	*
	* @param city_name the city_name of this city
	*/
	@Override
	public void setCity_name(java.lang.String city_name) {
		_city.setCity_name(city_name);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_city.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_city.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_city.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_city.setNew(n);
	}

	/**
	* Sets the primary key of this city.
	*
	* @param primaryKey the primary key of this city
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_city.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_city.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the state_id of this city.
	*
	* @param state_id the state_id of this city
	*/
	@Override
	public void setState_id(long state_id) {
		_city.setState_id(state_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cityWrapper)) {
			return false;
		}

		cityWrapper cityWrapper = (cityWrapper)obj;

		if (Objects.equals(_city, cityWrapper._city)) {
			return true;
		}

		return false;
	}

	@Override
	public city getWrappedModel() {
		return _city;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _city.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _city.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_city.resetOriginalValues();
	}

	private final city _city;
}