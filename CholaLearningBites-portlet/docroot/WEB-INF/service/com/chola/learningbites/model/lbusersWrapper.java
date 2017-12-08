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

package com.chola.learningbites.model;

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
 * This class is a wrapper for {@link lbusers}.
 * </p>
 *
 * @author cloverliferay01
 * @see lbusers
 * @generated
 */
@ProviderType
public class lbusersWrapper implements lbusers, ModelWrapper<lbusers> {
	public lbusersWrapper(lbusers lbusers) {
		_lbusers = lbusers;
	}

	@Override
	public Class<?> getModelClass() {
		return lbusers.class;
	}

	@Override
	public String getModelClassName() {
		return lbusers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("lb_id", getLb_id());

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

		Long lb_id = (Long)attributes.get("lb_id");

		if (lb_id != null) {
			setLb_id(lb_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _lbusers.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _lbusers.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _lbusers.isNew();
	}

	@Override
	public com.chola.learningbites.model.lbusers toEscapedModel() {
		return new lbusersWrapper(_lbusers.toEscapedModel());
	}

	@Override
	public com.chola.learningbites.model.lbusers toUnescapedModel() {
		return new lbusersWrapper(_lbusers.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _lbusers.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.learningbites.model.lbusers> toCacheModel() {
		return _lbusers.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.learningbites.model.lbusers lbusers) {
		return _lbusers.compareTo(lbusers);
	}

	@Override
	public int hashCode() {
		return _lbusers.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _lbusers.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new lbusersWrapper((lbusers)_lbusers.clone());
	}

	@Override
	public java.lang.String toString() {
		return _lbusers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _lbusers.toXmlString();
	}

	/**
	* Returns the ID of this lbusers.
	*
	* @return the ID of this lbusers
	*/
	@Override
	public long getId() {
		return _lbusers.getId();
	}

	/**
	* Returns the lb_id of this lbusers.
	*
	* @return the lb_id of this lbusers
	*/
	@Override
	public long getLb_id() {
		return _lbusers.getLb_id();
	}

	/**
	* Returns the primary key of this lbusers.
	*
	* @return the primary key of this lbusers
	*/
	@Override
	public long getPrimaryKey() {
		return _lbusers.getPrimaryKey();
	}

	/**
	* Returns the user_id of this lbusers.
	*
	* @return the user_id of this lbusers
	*/
	@Override
	public long getUser_id() {
		return _lbusers.getUser_id();
	}

	@Override
	public void persist() {
		_lbusers.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_lbusers.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_lbusers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_lbusers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_lbusers.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this lbusers.
	*
	* @param id the ID of this lbusers
	*/
	@Override
	public void setId(long id) {
		_lbusers.setId(id);
	}

	/**
	* Sets the lb_id of this lbusers.
	*
	* @param lb_id the lb_id of this lbusers
	*/
	@Override
	public void setLb_id(long lb_id) {
		_lbusers.setLb_id(lb_id);
	}

	@Override
	public void setNew(boolean n) {
		_lbusers.setNew(n);
	}

	/**
	* Sets the primary key of this lbusers.
	*
	* @param primaryKey the primary key of this lbusers
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_lbusers.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_lbusers.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user_id of this lbusers.
	*
	* @param user_id the user_id of this lbusers
	*/
	@Override
	public void setUser_id(long user_id) {
		_lbusers.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof lbusersWrapper)) {
			return false;
		}

		lbusersWrapper lbusersWrapper = (lbusersWrapper)obj;

		if (Objects.equals(_lbusers, lbusersWrapper._lbusers)) {
			return true;
		}

		return false;
	}

	@Override
	public lbusers getWrappedModel() {
		return _lbusers;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _lbusers.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _lbusers.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_lbusers.resetOriginalValues();
	}

	private final lbusers _lbusers;
}