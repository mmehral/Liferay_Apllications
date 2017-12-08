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

package com.chola.pressrelease.model;

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
 * This class is a wrapper for {@link pressrelease}.
 * </p>
 *
 * @author CloverLiferay02
 * @see pressrelease
 * @generated
 */
@ProviderType
public class pressreleaseWrapper implements pressrelease,
	ModelWrapper<pressrelease> {
	public pressreleaseWrapper(pressrelease pressrelease) {
		_pressrelease = pressrelease;
	}

	@Override
	public Class<?> getModelClass() {
		return pressrelease.class;
	}

	@Override
	public String getModelClassName() {
		return pressrelease.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("details", getDetails());
		attributes.put("updatedon", getUpdatedon());
		attributes.put("updatedby", getUpdatedby());
		attributes.put("uniquecontentid", getUniquecontentid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String details = (String)attributes.get("details");

		if (details != null) {
			setDetails(details);
		}

		Date updatedon = (Date)attributes.get("updatedon");

		if (updatedon != null) {
			setUpdatedon(updatedon);
		}

		Long updatedby = (Long)attributes.get("updatedby");

		if (updatedby != null) {
			setUpdatedby(updatedby);
		}

		Long uniquecontentid = (Long)attributes.get("uniquecontentid");

		if (uniquecontentid != null) {
			setUniquecontentid(uniquecontentid);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _pressrelease.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _pressrelease.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _pressrelease.isNew();
	}

	@Override
	public com.chola.pressrelease.model.pressrelease toEscapedModel() {
		return new pressreleaseWrapper(_pressrelease.toEscapedModel());
	}

	@Override
	public com.chola.pressrelease.model.pressrelease toUnescapedModel() {
		return new pressreleaseWrapper(_pressrelease.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _pressrelease.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.pressrelease.model.pressrelease> toCacheModel() {
		return _pressrelease.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.pressrelease.model.pressrelease pressrelease) {
		return _pressrelease.compareTo(pressrelease);
	}

	@Override
	public int hashCode() {
		return _pressrelease.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pressrelease.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new pressreleaseWrapper((pressrelease)_pressrelease.clone());
	}

	/**
	* Returns the details of this pressrelease.
	*
	* @return the details of this pressrelease
	*/
	@Override
	public java.lang.String getDetails() {
		return _pressrelease.getDetails();
	}

	@Override
	public java.lang.String toString() {
		return _pressrelease.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pressrelease.toXmlString();
	}

	/**
	* Returns the updatedon of this pressrelease.
	*
	* @return the updatedon of this pressrelease
	*/
	@Override
	public Date getUpdatedon() {
		return _pressrelease.getUpdatedon();
	}

	/**
	* Returns the ID of this pressrelease.
	*
	* @return the ID of this pressrelease
	*/
	@Override
	public long getId() {
		return _pressrelease.getId();
	}

	/**
	* Returns the primary key of this pressrelease.
	*
	* @return the primary key of this pressrelease
	*/
	@Override
	public long getPrimaryKey() {
		return _pressrelease.getPrimaryKey();
	}

	/**
	* Returns the uniquecontentid of this pressrelease.
	*
	* @return the uniquecontentid of this pressrelease
	*/
	@Override
	public long getUniquecontentid() {
		return _pressrelease.getUniquecontentid();
	}

	/**
	* Returns the updatedby of this pressrelease.
	*
	* @return the updatedby of this pressrelease
	*/
	@Override
	public long getUpdatedby() {
		return _pressrelease.getUpdatedby();
	}

	@Override
	public void persist() {
		_pressrelease.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pressrelease.setCachedModel(cachedModel);
	}

	/**
	* Sets the details of this pressrelease.
	*
	* @param details the details of this pressrelease
	*/
	@Override
	public void setDetails(java.lang.String details) {
		_pressrelease.setDetails(details);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_pressrelease.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_pressrelease.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_pressrelease.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this pressrelease.
	*
	* @param id the ID of this pressrelease
	*/
	@Override
	public void setId(long id) {
		_pressrelease.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_pressrelease.setNew(n);
	}

	/**
	* Sets the primary key of this pressrelease.
	*
	* @param primaryKey the primary key of this pressrelease
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pressrelease.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_pressrelease.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the uniquecontentid of this pressrelease.
	*
	* @param uniquecontentid the uniquecontentid of this pressrelease
	*/
	@Override
	public void setUniquecontentid(long uniquecontentid) {
		_pressrelease.setUniquecontentid(uniquecontentid);
	}

	/**
	* Sets the updatedby of this pressrelease.
	*
	* @param updatedby the updatedby of this pressrelease
	*/
	@Override
	public void setUpdatedby(long updatedby) {
		_pressrelease.setUpdatedby(updatedby);
	}

	/**
	* Sets the updatedon of this pressrelease.
	*
	* @param updatedon the updatedon of this pressrelease
	*/
	@Override
	public void setUpdatedon(Date updatedon) {
		_pressrelease.setUpdatedon(updatedon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof pressreleaseWrapper)) {
			return false;
		}

		pressreleaseWrapper pressreleaseWrapper = (pressreleaseWrapper)obj;

		if (Objects.equals(_pressrelease, pressreleaseWrapper._pressrelease)) {
			return true;
		}

		return false;
	}

	@Override
	public pressrelease getWrappedModel() {
		return _pressrelease;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _pressrelease.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _pressrelease.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_pressrelease.resetOriginalValues();
	}

	private final pressrelease _pressrelease;
}