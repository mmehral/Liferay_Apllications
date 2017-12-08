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

package com.chola.livefeed.model;

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
 * This class is a wrapper for {@link LiveFeed}.
 * </p>
 *
 * @author adms.java1
 * @see LiveFeed
 * @generated
 */
@ProviderType
public class LiveFeedWrapper implements LiveFeed, ModelWrapper<LiveFeed> {
	public LiveFeedWrapper(LiveFeed liveFeed) {
		_liveFeed = liveFeed;
	}

	@Override
	public Class<?> getModelClass() {
		return LiveFeed.class;
	}

	@Override
	public String getModelClassName() {
		return LiveFeed.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("createdate", getCreatedate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String createdate = (String)attributes.get("createdate");

		if (createdate != null) {
			setCreatedate(createdate);
		}
	}

	@Override
	public LiveFeed toEscapedModel() {
		return new LiveFeedWrapper(_liveFeed.toEscapedModel());
	}

	@Override
	public LiveFeed toUnescapedModel() {
		return new LiveFeedWrapper(_liveFeed.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _liveFeed.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _liveFeed.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _liveFeed.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _liveFeed.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<LiveFeed> toCacheModel() {
		return _liveFeed.toCacheModel();
	}

	@Override
	public int compareTo(LiveFeed liveFeed) {
		return _liveFeed.compareTo(liveFeed);
	}

	@Override
	public int hashCode() {
		return _liveFeed.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _liveFeed.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LiveFeedWrapper((LiveFeed)_liveFeed.clone());
	}

	/**
	* Returns the content of this live feed.
	*
	* @return the content of this live feed
	*/
	@Override
	public java.lang.String getContent() {
		return _liveFeed.getContent();
	}

	/**
	* Returns the createdate of this live feed.
	*
	* @return the createdate of this live feed
	*/
	@Override
	public java.lang.String getCreatedate() {
		return _liveFeed.getCreatedate();
	}

	/**
	* Returns the title of this live feed.
	*
	* @return the title of this live feed
	*/
	@Override
	public java.lang.String getTitle() {
		return _liveFeed.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _liveFeed.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _liveFeed.toXmlString();
	}

	/**
	* Returns the ID of this live feed.
	*
	* @return the ID of this live feed
	*/
	@Override
	public long getId() {
		return _liveFeed.getId();
	}

	/**
	* Returns the primary key of this live feed.
	*
	* @return the primary key of this live feed
	*/
	@Override
	public long getPrimaryKey() {
		return _liveFeed.getPrimaryKey();
	}

	@Override
	public void persist() {
		_liveFeed.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_liveFeed.setCachedModel(cachedModel);
	}

	/**
	* Sets the content of this live feed.
	*
	* @param content the content of this live feed
	*/
	@Override
	public void setContent(java.lang.String content) {
		_liveFeed.setContent(content);
	}

	/**
	* Sets the createdate of this live feed.
	*
	* @param createdate the createdate of this live feed
	*/
	@Override
	public void setCreatedate(java.lang.String createdate) {
		_liveFeed.setCreatedate(createdate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_liveFeed.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_liveFeed.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_liveFeed.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this live feed.
	*
	* @param id the ID of this live feed
	*/
	@Override
	public void setId(long id) {
		_liveFeed.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_liveFeed.setNew(n);
	}

	/**
	* Sets the primary key of this live feed.
	*
	* @param primaryKey the primary key of this live feed
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_liveFeed.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_liveFeed.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this live feed.
	*
	* @param title the title of this live feed
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_liveFeed.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LiveFeedWrapper)) {
			return false;
		}

		LiveFeedWrapper liveFeedWrapper = (LiveFeedWrapper)obj;

		if (Objects.equals(_liveFeed, liveFeedWrapper._liveFeed)) {
			return true;
		}

		return false;
	}

	@Override
	public LiveFeed getWrappedModel() {
		return _liveFeed;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _liveFeed.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _liveFeed.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_liveFeed.resetOriginalValues();
	}

	private final LiveFeed _liveFeed;
}