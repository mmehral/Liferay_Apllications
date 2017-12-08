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

package com.chola.knowledgebites.model;

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
 * This class is a wrapper for {@link kbusers}.
 * </p>
 *
 * @author cloverliferay01
 * @see kbusers
 * @generated
 */
@ProviderType
public class kbusersWrapper implements kbusers, ModelWrapper<kbusers> {
	public kbusersWrapper(kbusers kbusers) {
		_kbusers = kbusers;
	}

	@Override
	public Class<?> getModelClass() {
		return kbusers.class;
	}

	@Override
	public String getModelClassName() {
		return kbusers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("kbdetails_id", getKbdetails_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long kbdetails_id = (Long)attributes.get("kbdetails_id");

		if (kbdetails_id != null) {
			setKbdetails_id(kbdetails_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _kbusers.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _kbusers.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _kbusers.isNew();
	}

	@Override
	public com.chola.knowledgebites.model.kbusers toEscapedModel() {
		return new kbusersWrapper(_kbusers.toEscapedModel());
	}

	@Override
	public com.chola.knowledgebites.model.kbusers toUnescapedModel() {
		return new kbusersWrapper(_kbusers.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _kbusers.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.knowledgebites.model.kbusers> toCacheModel() {
		return _kbusers.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.knowledgebites.model.kbusers kbusers) {
		return _kbusers.compareTo(kbusers);
	}

	@Override
	public int hashCode() {
		return _kbusers.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _kbusers.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new kbusersWrapper((kbusers)_kbusers.clone());
	}

	@Override
	public java.lang.String toString() {
		return _kbusers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _kbusers.toXmlString();
	}

	/**
	* Returns the ID of this kbusers.
	*
	* @return the ID of this kbusers
	*/
	@Override
	public long getId() {
		return _kbusers.getId();
	}

	/**
	* Returns the kbdetails_id of this kbusers.
	*
	* @return the kbdetails_id of this kbusers
	*/
	@Override
	public long getKbdetails_id() {
		return _kbusers.getKbdetails_id();
	}

	/**
	* Returns the primary key of this kbusers.
	*
	* @return the primary key of this kbusers
	*/
	@Override
	public long getPrimaryKey() {
		return _kbusers.getPrimaryKey();
	}

	/**
	* Returns the user_id of this kbusers.
	*
	* @return the user_id of this kbusers
	*/
	@Override
	public long getUser_id() {
		return _kbusers.getUser_id();
	}

	@Override
	public void persist() {
		_kbusers.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_kbusers.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_kbusers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_kbusers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_kbusers.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this kbusers.
	*
	* @param id the ID of this kbusers
	*/
	@Override
	public void setId(long id) {
		_kbusers.setId(id);
	}

	/**
	* Sets the kbdetails_id of this kbusers.
	*
	* @param kbdetails_id the kbdetails_id of this kbusers
	*/
	@Override
	public void setKbdetails_id(long kbdetails_id) {
		_kbusers.setKbdetails_id(kbdetails_id);
	}

	@Override
	public void setNew(boolean n) {
		_kbusers.setNew(n);
	}

	/**
	* Sets the primary key of this kbusers.
	*
	* @param primaryKey the primary key of this kbusers
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_kbusers.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_kbusers.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user_id of this kbusers.
	*
	* @param user_id the user_id of this kbusers
	*/
	@Override
	public void setUser_id(long user_id) {
		_kbusers.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof kbusersWrapper)) {
			return false;
		}

		kbusersWrapper kbusersWrapper = (kbusersWrapper)obj;

		if (Objects.equals(_kbusers, kbusersWrapper._kbusers)) {
			return true;
		}

		return false;
	}

	@Override
	public kbusers getWrappedModel() {
		return _kbusers;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _kbusers.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _kbusers.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_kbusers.resetOriginalValues();
	}

	private final kbusers _kbusers;
}