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
 * This class is a wrapper for {@link topics}.
 * </p>
 *
 * @author CloverLiferay02
 * @see topics
 * @generated
 */
@ProviderType
public class topicsWrapper implements topics, ModelWrapper<topics> {
	public topicsWrapper(topics topics) {
		_topics = topics;
	}

	@Override
	public Class<?> getModelClass() {
		return topics.class;
	}

	@Override
	public String getModelClassName() {
		return topics.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("topicName", getTopicName());
		attributes.put("flag", getFlag());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("modifiedBy", getModifiedBy());
		attributes.put("modifiedOn", getModifiedOn());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String topicName = (String)attributes.get("topicName");

		if (topicName != null) {
			setTopicName(topicName);
		}

		Long flag = (Long)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		Date modifiedOn = (Date)attributes.get("modifiedOn");

		if (modifiedOn != null) {
			setModifiedOn(modifiedOn);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _topics.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _topics.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _topics.isNew();
	}

	@Override
	public com.chola.socho.model.topics toEscapedModel() {
		return new topicsWrapper(_topics.toEscapedModel());
	}

	@Override
	public com.chola.socho.model.topics toUnescapedModel() {
		return new topicsWrapper(_topics.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _topics.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.socho.model.topics> toCacheModel() {
		return _topics.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.socho.model.topics topics) {
		return _topics.compareTo(topics);
	}

	@Override
	public int hashCode() {
		return _topics.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _topics.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new topicsWrapper((topics)_topics.clone());
	}

	/**
	* Returns the topic name of this topics.
	*
	* @return the topic name of this topics
	*/
	@Override
	public java.lang.String getTopicName() {
		return _topics.getTopicName();
	}

	@Override
	public java.lang.String toString() {
		return _topics.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _topics.toXmlString();
	}

	/**
	* Returns the created on of this topics.
	*
	* @return the created on of this topics
	*/
	@Override
	public Date getCreatedOn() {
		return _topics.getCreatedOn();
	}

	/**
	* Returns the modified on of this topics.
	*
	* @return the modified on of this topics
	*/
	@Override
	public Date getModifiedOn() {
		return _topics.getModifiedOn();
	}

	/**
	* Returns the created by of this topics.
	*
	* @return the created by of this topics
	*/
	@Override
	public long getCreatedBy() {
		return _topics.getCreatedBy();
	}

	/**
	* Returns the flag of this topics.
	*
	* @return the flag of this topics
	*/
	@Override
	public long getFlag() {
		return _topics.getFlag();
	}

	/**
	* Returns the ID of this topics.
	*
	* @return the ID of this topics
	*/
	@Override
	public long getId() {
		return _topics.getId();
	}

	/**
	* Returns the modified by of this topics.
	*
	* @return the modified by of this topics
	*/
	@Override
	public long getModifiedBy() {
		return _topics.getModifiedBy();
	}

	/**
	* Returns the primary key of this topics.
	*
	* @return the primary key of this topics
	*/
	@Override
	public long getPrimaryKey() {
		return _topics.getPrimaryKey();
	}

	@Override
	public void persist() {
		_topics.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_topics.setCachedModel(cachedModel);
	}

	/**
	* Sets the created by of this topics.
	*
	* @param createdBy the created by of this topics
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_topics.setCreatedBy(createdBy);
	}

	/**
	* Sets the created on of this topics.
	*
	* @param createdOn the created on of this topics
	*/
	@Override
	public void setCreatedOn(Date createdOn) {
		_topics.setCreatedOn(createdOn);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_topics.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_topics.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_topics.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this topics.
	*
	* @param flag the flag of this topics
	*/
	@Override
	public void setFlag(long flag) {
		_topics.setFlag(flag);
	}

	/**
	* Sets the ID of this topics.
	*
	* @param id the ID of this topics
	*/
	@Override
	public void setId(long id) {
		_topics.setId(id);
	}

	/**
	* Sets the modified by of this topics.
	*
	* @param modifiedBy the modified by of this topics
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_topics.setModifiedBy(modifiedBy);
	}

	/**
	* Sets the modified on of this topics.
	*
	* @param modifiedOn the modified on of this topics
	*/
	@Override
	public void setModifiedOn(Date modifiedOn) {
		_topics.setModifiedOn(modifiedOn);
	}

	@Override
	public void setNew(boolean n) {
		_topics.setNew(n);
	}

	/**
	* Sets the primary key of this topics.
	*
	* @param primaryKey the primary key of this topics
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_topics.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_topics.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the topic name of this topics.
	*
	* @param topicName the topic name of this topics
	*/
	@Override
	public void setTopicName(java.lang.String topicName) {
		_topics.setTopicName(topicName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof topicsWrapper)) {
			return false;
		}

		topicsWrapper topicsWrapper = (topicsWrapper)obj;

		if (Objects.equals(_topics, topicsWrapper._topics)) {
			return true;
		}

		return false;
	}

	@Override
	public topics getWrappedModel() {
		return _topics;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _topics.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _topics.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_topics.resetOriginalValues();
	}

	private final topics _topics;
}