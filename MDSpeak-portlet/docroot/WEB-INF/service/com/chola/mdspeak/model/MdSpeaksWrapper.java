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

package com.chola.mdspeak.model;

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
 * This class is a wrapper for {@link MdSpeaks}.
 * </p>
 *
 * @author adms.java1
 * @see MdSpeaks
 * @generated
 */
@ProviderType
public class MdSpeaksWrapper implements MdSpeaks, ModelWrapper<MdSpeaks> {
	public MdSpeaksWrapper(MdSpeaks mdSpeaks) {
		_mdSpeaks = mdSpeaks;
	}

	@Override
	public Class<?> getModelClass() {
		return MdSpeaks.class;
	}

	@Override
	public String getModelClassName() {
		return MdSpeaks.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("username", getUsername());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}
	}

	@Override
	public MdSpeaks toEscapedModel() {
		return new MdSpeaksWrapper(_mdSpeaks.toEscapedModel());
	}

	@Override
	public MdSpeaks toUnescapedModel() {
		return new MdSpeaksWrapper(_mdSpeaks.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _mdSpeaks.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _mdSpeaks.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _mdSpeaks.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _mdSpeaks.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<MdSpeaks> toCacheModel() {
		return _mdSpeaks.toCacheModel();
	}

	@Override
	public int compareTo(MdSpeaks mdSpeaks) {
		return _mdSpeaks.compareTo(mdSpeaks);
	}

	@Override
	public int hashCode() {
		return _mdSpeaks.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mdSpeaks.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new MdSpeaksWrapper((MdSpeaks)_mdSpeaks.clone());
	}

	/**
	* Returns the username of this md speaks.
	*
	* @return the username of this md speaks
	*/
	@Override
	public java.lang.String getUsername() {
		return _mdSpeaks.getUsername();
	}

	@Override
	public java.lang.String toString() {
		return _mdSpeaks.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _mdSpeaks.toXmlString();
	}

	/**
	* Returns the ID of this md speaks.
	*
	* @return the ID of this md speaks
	*/
	@Override
	public long getId() {
		return _mdSpeaks.getId();
	}

	/**
	* Returns the primary key of this md speaks.
	*
	* @return the primary key of this md speaks
	*/
	@Override
	public long getPrimaryKey() {
		return _mdSpeaks.getPrimaryKey();
	}

	@Override
	public void persist() {
		_mdSpeaks.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mdSpeaks.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_mdSpeaks.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_mdSpeaks.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_mdSpeaks.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this md speaks.
	*
	* @param Id the ID of this md speaks
	*/
	@Override
	public void setId(long Id) {
		_mdSpeaks.setId(Id);
	}

	@Override
	public void setNew(boolean n) {
		_mdSpeaks.setNew(n);
	}

	/**
	* Sets the primary key of this md speaks.
	*
	* @param primaryKey the primary key of this md speaks
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mdSpeaks.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_mdSpeaks.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the username of this md speaks.
	*
	* @param username the username of this md speaks
	*/
	@Override
	public void setUsername(java.lang.String username) {
		_mdSpeaks.setUsername(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MdSpeaksWrapper)) {
			return false;
		}

		MdSpeaksWrapper mdSpeaksWrapper = (MdSpeaksWrapper)obj;

		if (Objects.equals(_mdSpeaks, mdSpeaksWrapper._mdSpeaks)) {
			return true;
		}

		return false;
	}

	@Override
	public MdSpeaks getWrappedModel() {
		return _mdSpeaks;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _mdSpeaks.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _mdSpeaks.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_mdSpeaks.resetOriginalValues();
	}

	private final MdSpeaks _mdSpeaks;
}