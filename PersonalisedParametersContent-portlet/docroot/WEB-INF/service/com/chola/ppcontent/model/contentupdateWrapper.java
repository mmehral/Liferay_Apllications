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

package com.chola.ppcontent.model;

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
 * This class is a wrapper for {@link contentupdate}.
 * </p>
 *
 * @author cloverliferay01
 * @see contentupdate
 * @generated
 */
@ProviderType
public class contentupdateWrapper implements contentupdate,
	ModelWrapper<contentupdate> {
	public contentupdateWrapper(contentupdate contentupdate) {
		_contentupdate = contentupdate;
	}

	@Override
	public Class<?> getModelClass() {
		return contentupdate.class;
	}

	@Override
	public String getModelClassName() {
		return contentupdate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _contentupdate.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _contentupdate.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _contentupdate.isNew();
	}

	@Override
	public com.chola.ppcontent.model.contentupdate toEscapedModel() {
		return new contentupdateWrapper(_contentupdate.toEscapedModel());
	}

	@Override
	public com.chola.ppcontent.model.contentupdate toUnescapedModel() {
		return new contentupdateWrapper(_contentupdate.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _contentupdate.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.ppcontent.model.contentupdate> toCacheModel() {
		return _contentupdate.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.ppcontent.model.contentupdate contentupdate) {
		return _contentupdate.compareTo(contentupdate);
	}

	@Override
	public int hashCode() {
		return _contentupdate.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contentupdate.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new contentupdateWrapper((contentupdate)_contentupdate.clone());
	}

	@Override
	public java.lang.String toString() {
		return _contentupdate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contentupdate.toXmlString();
	}

	/**
	* Returns the content_id of this contentupdate.
	*
	* @return the content_id of this contentupdate
	*/
	@Override
	public long getContent_id() {
		return _contentupdate.getContent_id();
	}

	/**
	* Returns the ID of this contentupdate.
	*
	* @return the ID of this contentupdate
	*/
	@Override
	public long getId() {
		return _contentupdate.getId();
	}

	/**
	* Returns the primary key of this contentupdate.
	*
	* @return the primary key of this contentupdate
	*/
	@Override
	public long getPrimaryKey() {
		return _contentupdate.getPrimaryKey();
	}

	@Override
	public void persist() {
		_contentupdate.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contentupdate.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this contentupdate.
	*
	* @param content_id the content_id of this contentupdate
	*/
	@Override
	public void setContent_id(long content_id) {
		_contentupdate.setContent_id(content_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_contentupdate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_contentupdate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_contentupdate.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this contentupdate.
	*
	* @param id the ID of this contentupdate
	*/
	@Override
	public void setId(long id) {
		_contentupdate.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_contentupdate.setNew(n);
	}

	/**
	* Sets the primary key of this contentupdate.
	*
	* @param primaryKey the primary key of this contentupdate
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contentupdate.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_contentupdate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof contentupdateWrapper)) {
			return false;
		}

		contentupdateWrapper contentupdateWrapper = (contentupdateWrapper)obj;

		if (Objects.equals(_contentupdate, contentupdateWrapper._contentupdate)) {
			return true;
		}

		return false;
	}

	@Override
	public contentupdate getWrappedModel() {
		return _contentupdate;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _contentupdate.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _contentupdate.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_contentupdate.resetOriginalValues();
	}

	private final contentupdate _contentupdate;
}