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

package com.chola.socho.model;

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
 * This class is a wrapper for {@link idea}.
 * </p>
 *
 * @author CloverLiferay02
 * @see idea
 * @generated
 */
@ProviderType
public class ideaWrapper implements idea, ModelWrapper<idea> {
	public ideaWrapper(idea idea) {
		_idea = idea;
	}

	@Override
	public Class<?> getModelClass() {
		return idea.class;
	}

	@Override
	public String getModelClassName() {
		return idea.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("topic", getTopic());
		attributes.put("sharedIdea", getSharedIdea());
		attributes.put("sharedFile", getSharedFile());
		attributes.put("sharedDate", getSharedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String topic = (String)attributes.get("topic");

		if (topic != null) {
			setTopic(topic);
		}

		String sharedIdea = (String)attributes.get("sharedIdea");

		if (sharedIdea != null) {
			setSharedIdea(sharedIdea);
		}

		String sharedFile = (String)attributes.get("sharedFile");

		if (sharedFile != null) {
			setSharedFile(sharedFile);
		}

		Date sharedDate = (Date)attributes.get("sharedDate");

		if (sharedDate != null) {
			setSharedDate(sharedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _idea.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _idea.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _idea.isNew();
	}

	@Override
	public com.chola.socho.model.idea toEscapedModel() {
		return new ideaWrapper(_idea.toEscapedModel());
	}

	@Override
	public com.chola.socho.model.idea toUnescapedModel() {
		return new ideaWrapper(_idea.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _idea.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.socho.model.idea> toCacheModel() {
		return _idea.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.socho.model.idea idea) {
		return _idea.compareTo(idea);
	}

	@Override
	public int hashCode() {
		return _idea.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idea.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ideaWrapper((idea)_idea.clone());
	}

	/**
	* Returns the shared file of this idea.
	*
	* @return the shared file of this idea
	*/
	@Override
	public java.lang.String getSharedFile() {
		return _idea.getSharedFile();
	}

	/**
	* Returns the shared idea of this idea.
	*
	* @return the shared idea of this idea
	*/
	@Override
	public java.lang.String getSharedIdea() {
		return _idea.getSharedIdea();
	}

	/**
	* Returns the topic of this idea.
	*
	* @return the topic of this idea
	*/
	@Override
	public java.lang.String getTopic() {
		return _idea.getTopic();
	}

	/**
	* Returns the user uuid of this idea.
	*
	* @return the user uuid of this idea
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _idea.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _idea.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _idea.toXmlString();
	}

	/**
	* Returns the shared date of this idea.
	*
	* @return the shared date of this idea
	*/
	@Override
	public Date getSharedDate() {
		return _idea.getSharedDate();
	}

	/**
	* Returns the ID of this idea.
	*
	* @return the ID of this idea
	*/
	@Override
	public long getId() {
		return _idea.getId();
	}

	/**
	* Returns the primary key of this idea.
	*
	* @return the primary key of this idea
	*/
	@Override
	public long getPrimaryKey() {
		return _idea.getPrimaryKey();
	}

	/**
	* Returns the user ID of this idea.
	*
	* @return the user ID of this idea
	*/
	@Override
	public long getUserId() {
		return _idea.getUserId();
	}

	@Override
	public void persist() {
		_idea.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_idea.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_idea.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_idea.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_idea.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this idea.
	*
	* @param id the ID of this idea
	*/
	@Override
	public void setId(long id) {
		_idea.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_idea.setNew(n);
	}

	/**
	* Sets the primary key of this idea.
	*
	* @param primaryKey the primary key of this idea
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_idea.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_idea.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the shared date of this idea.
	*
	* @param sharedDate the shared date of this idea
	*/
	@Override
	public void setSharedDate(Date sharedDate) {
		_idea.setSharedDate(sharedDate);
	}

	/**
	* Sets the shared file of this idea.
	*
	* @param sharedFile the shared file of this idea
	*/
	@Override
	public void setSharedFile(java.lang.String sharedFile) {
		_idea.setSharedFile(sharedFile);
	}

	/**
	* Sets the shared idea of this idea.
	*
	* @param sharedIdea the shared idea of this idea
	*/
	@Override
	public void setSharedIdea(java.lang.String sharedIdea) {
		_idea.setSharedIdea(sharedIdea);
	}

	/**
	* Sets the topic of this idea.
	*
	* @param topic the topic of this idea
	*/
	@Override
	public void setTopic(java.lang.String topic) {
		_idea.setTopic(topic);
	}

	/**
	* Sets the user ID of this idea.
	*
	* @param userId the user ID of this idea
	*/
	@Override
	public void setUserId(long userId) {
		_idea.setUserId(userId);
	}

	/**
	* Sets the user uuid of this idea.
	*
	* @param userUuid the user uuid of this idea
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_idea.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ideaWrapper)) {
			return false;
		}

		ideaWrapper ideaWrapper = (ideaWrapper)obj;

		if (Objects.equals(_idea, ideaWrapper._idea)) {
			return true;
		}

		return false;
	}

	@Override
	public idea getWrappedModel() {
		return _idea;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _idea.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _idea.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_idea.resetOriginalValues();
	}

	private final idea _idea;
}