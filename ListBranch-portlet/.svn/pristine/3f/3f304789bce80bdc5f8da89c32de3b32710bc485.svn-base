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
 * This class is a wrapper for {@link state}.
 * </p>
 *
 * @author adms.java1
 * @see state
 * @generated
 */
@ProviderType
public class stateWrapper implements state, ModelWrapper<state> {
	public stateWrapper(state state) {
		_state = state;
	}

	@Override
	public Class<?> getModelClass() {
		return state.class;
	}

	@Override
	public String getModelClassName() {
		return state.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_id", getState_id());
		attributes.put("state_name", getState_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		String state_name = (String)attributes.get("state_name");

		if (state_name != null) {
			setState_name(state_name);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _state.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _state.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _state.isNew();
	}

	@Override
	public com.chola.listbranch.model.state toEscapedModel() {
		return new stateWrapper(_state.toEscapedModel());
	}

	@Override
	public com.chola.listbranch.model.state toUnescapedModel() {
		return new stateWrapper(_state.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _state.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.listbranch.model.state> toCacheModel() {
		return _state.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.listbranch.model.state state) {
		return _state.compareTo(state);
	}

	@Override
	public int hashCode() {
		return _state.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _state.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new stateWrapper((state)_state.clone());
	}

	/**
	* Returns the state_name of this state.
	*
	* @return the state_name of this state
	*/
	@Override
	public java.lang.String getState_name() {
		return _state.getState_name();
	}

	@Override
	public java.lang.String toString() {
		return _state.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _state.toXmlString();
	}

	/**
	* Returns the primary key of this state.
	*
	* @return the primary key of this state
	*/
	@Override
	public long getPrimaryKey() {
		return _state.getPrimaryKey();
	}

	/**
	* Returns the state_id of this state.
	*
	* @return the state_id of this state
	*/
	@Override
	public long getState_id() {
		return _state.getState_id();
	}

	@Override
	public void persist() {
		_state.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_state.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_state.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_state.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_state.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_state.setNew(n);
	}

	/**
	* Sets the primary key of this state.
	*
	* @param primaryKey the primary key of this state
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_state.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_state.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the state_id of this state.
	*
	* @param state_id the state_id of this state
	*/
	@Override
	public void setState_id(long state_id) {
		_state.setState_id(state_id);
	}

	/**
	* Sets the state_name of this state.
	*
	* @param state_name the state_name of this state
	*/
	@Override
	public void setState_name(java.lang.String state_name) {
		_state.setState_name(state_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof stateWrapper)) {
			return false;
		}

		stateWrapper stateWrapper = (stateWrapper)obj;

		if (Objects.equals(_state, stateWrapper._state)) {
			return true;
		}

		return false;
	}

	@Override
	public state getWrappedModel() {
		return _state;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _state.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _state.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_state.resetOriginalValues();
	}

	private final state _state;
}