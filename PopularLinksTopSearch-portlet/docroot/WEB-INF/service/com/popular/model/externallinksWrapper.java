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

package com.popular.model;

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
 * This class is a wrapper for {@link externallinks}.
 * </p>
 *
 * @author CloverLiferay02
 * @see externallinks
 * @generated
 */
@ProviderType
public class externallinksWrapper implements externallinks,
	ModelWrapper<externallinks> {
	public externallinksWrapper(externallinks externallinks) {
		_externallinks = externallinks;
	}

	@Override
	public Class<?> getModelClass() {
		return externallinks.class;
	}

	@Override
	public String getModelClassName() {
		return externallinks.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tag", getTag());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tag = (String)attributes.get("tag");

		if (tag != null) {
			setTag(tag);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _externallinks.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _externallinks.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _externallinks.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _externallinks.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.popular.model.externallinks> toCacheModel() {
		return _externallinks.toCacheModel();
	}

	@Override
	public com.popular.model.externallinks toEscapedModel() {
		return new externallinksWrapper(_externallinks.toEscapedModel());
	}

	@Override
	public com.popular.model.externallinks toUnescapedModel() {
		return new externallinksWrapper(_externallinks.toUnescapedModel());
	}

	@Override
	public int compareTo(com.popular.model.externallinks externallinks) {
		return _externallinks.compareTo(externallinks);
	}

	@Override
	public int hashCode() {
		return _externallinks.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _externallinks.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new externallinksWrapper((externallinks)_externallinks.clone());
	}

	/**
	* Returns the tag of this externallinks.
	*
	* @return the tag of this externallinks
	*/
	@Override
	public java.lang.String getTag() {
		return _externallinks.getTag();
	}

	/**
	* Returns the url of this externallinks.
	*
	* @return the url of this externallinks
	*/
	@Override
	public java.lang.String getUrl() {
		return _externallinks.getUrl();
	}

	@Override
	public java.lang.String toString() {
		return _externallinks.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _externallinks.toXmlString();
	}

	/**
	* Returns the ID of this externallinks.
	*
	* @return the ID of this externallinks
	*/
	@Override
	public long getId() {
		return _externallinks.getId();
	}

	/**
	* Returns the primary key of this externallinks.
	*
	* @return the primary key of this externallinks
	*/
	@Override
	public long getPrimaryKey() {
		return _externallinks.getPrimaryKey();
	}

	@Override
	public void persist() {
		_externallinks.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_externallinks.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_externallinks.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_externallinks.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_externallinks.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this externallinks.
	*
	* @param id the ID of this externallinks
	*/
	@Override
	public void setId(long id) {
		_externallinks.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_externallinks.setNew(n);
	}

	/**
	* Sets the primary key of this externallinks.
	*
	* @param primaryKey the primary key of this externallinks
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_externallinks.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_externallinks.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tag of this externallinks.
	*
	* @param tag the tag of this externallinks
	*/
	@Override
	public void setTag(java.lang.String tag) {
		_externallinks.setTag(tag);
	}

	/**
	* Sets the url of this externallinks.
	*
	* @param url the url of this externallinks
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_externallinks.setUrl(url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof externallinksWrapper)) {
			return false;
		}

		externallinksWrapper externallinksWrapper = (externallinksWrapper)obj;

		if (Objects.equals(_externallinks, externallinksWrapper._externallinks)) {
			return true;
		}

		return false;
	}

	@Override
	public externallinks getWrappedModel() {
		return _externallinks;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _externallinks.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _externallinks.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_externallinks.resetOriginalValues();
	}

	private final externallinks _externallinks;
}