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

package com.chola.app.model;

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
 * This class is a wrapper for {@link post}.
 * </p>
 *
 * @author CloverLiferay02
 * @see post
 * @generated
 */
@ProviderType
public class postWrapper implements post, ModelWrapper<post> {
	public postWrapper(post post) {
		_post = post;
	}

	@Override
	public Class<?> getModelClass() {
		return post.class;
	}

	@Override
	public String getModelClassName() {
		return post.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("appTo", getAppTo());
		attributes.put("appBy", getAppBy());
		attributes.put("appMessage", getAppMessage());
		attributes.put("appDate", getAppDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String appTo = (String)attributes.get("appTo");

		if (appTo != null) {
			setAppTo(appTo);
		}

		String appBy = (String)attributes.get("appBy");

		if (appBy != null) {
			setAppBy(appBy);
		}

		String appMessage = (String)attributes.get("appMessage");

		if (appMessage != null) {
			setAppMessage(appMessage);
		}

		Date appDate = (Date)attributes.get("appDate");

		if (appDate != null) {
			setAppDate(appDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _post.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _post.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _post.isNew();
	}

	@Override
	public com.chola.app.model.post toEscapedModel() {
		return new postWrapper(_post.toEscapedModel());
	}

	@Override
	public com.chola.app.model.post toUnescapedModel() {
		return new postWrapper(_post.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _post.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.app.model.post> toCacheModel() {
		return _post.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.app.model.post post) {
		return _post.compareTo(post);
	}

	@Override
	public int hashCode() {
		return _post.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _post.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new postWrapper((post)_post.clone());
	}

	/**
	* Returns the app by of this post.
	*
	* @return the app by of this post
	*/
	@Override
	public java.lang.String getAppBy() {
		return _post.getAppBy();
	}

	/**
	* Returns the app message of this post.
	*
	* @return the app message of this post
	*/
	@Override
	public java.lang.String getAppMessage() {
		return _post.getAppMessage();
	}

	/**
	* Returns the app to of this post.
	*
	* @return the app to of this post
	*/
	@Override
	public java.lang.String getAppTo() {
		return _post.getAppTo();
	}

	@Override
	public java.lang.String toString() {
		return _post.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _post.toXmlString();
	}

	/**
	* Returns the app date of this post.
	*
	* @return the app date of this post
	*/
	@Override
	public Date getAppDate() {
		return _post.getAppDate();
	}

	/**
	* Returns the ID of this post.
	*
	* @return the ID of this post
	*/
	@Override
	public long getId() {
		return _post.getId();
	}

	/**
	* Returns the primary key of this post.
	*
	* @return the primary key of this post
	*/
	@Override
	public long getPrimaryKey() {
		return _post.getPrimaryKey();
	}

	@Override
	public void persist() {
		_post.persist();
	}

	/**
	* Sets the app by of this post.
	*
	* @param appBy the app by of this post
	*/
	@Override
	public void setAppBy(java.lang.String appBy) {
		_post.setAppBy(appBy);
	}

	/**
	* Sets the app date of this post.
	*
	* @param appDate the app date of this post
	*/
	@Override
	public void setAppDate(Date appDate) {
		_post.setAppDate(appDate);
	}

	/**
	* Sets the app message of this post.
	*
	* @param appMessage the app message of this post
	*/
	@Override
	public void setAppMessage(java.lang.String appMessage) {
		_post.setAppMessage(appMessage);
	}

	/**
	* Sets the app to of this post.
	*
	* @param appTo the app to of this post
	*/
	@Override
	public void setAppTo(java.lang.String appTo) {
		_post.setAppTo(appTo);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_post.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_post.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_post.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_post.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this post.
	*
	* @param id the ID of this post
	*/
	@Override
	public void setId(long id) {
		_post.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_post.setNew(n);
	}

	/**
	* Sets the primary key of this post.
	*
	* @param primaryKey the primary key of this post
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_post.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_post.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof postWrapper)) {
			return false;
		}

		postWrapper postWrapper = (postWrapper)obj;

		if (Objects.equals(_post, postWrapper._post)) {
			return true;
		}

		return false;
	}

	@Override
	public post getWrappedModel() {
		return _post;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _post.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _post.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_post.resetOriginalValues();
	}

	private final post _post;
}