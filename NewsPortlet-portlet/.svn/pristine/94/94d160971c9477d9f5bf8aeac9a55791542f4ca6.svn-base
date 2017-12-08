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

package com.chola.news.model;

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
 * This class is a wrapper for {@link Around_World}.
 * </p>
 *
 * @author adms.java1
 * @see Around_World
 * @generated
 */
@ProviderType
public class Around_WorldWrapper implements Around_World,
	ModelWrapper<Around_World> {
	public Around_WorldWrapper(Around_World around_World) {
		_around_World = around_World;
	}

	@Override
	public Class<?> getModelClass() {
		return Around_World.class;
	}

	@Override
	public String getModelClassName() {
		return Around_World.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("news", getNews());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String news = (String)attributes.get("news");

		if (news != null) {
			setNews(news);
		}
	}

	@Override
	public Around_World toEscapedModel() {
		return new Around_WorldWrapper(_around_World.toEscapedModel());
	}

	@Override
	public Around_World toUnescapedModel() {
		return new Around_WorldWrapper(_around_World.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _around_World.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _around_World.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _around_World.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _around_World.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Around_World> toCacheModel() {
		return _around_World.toCacheModel();
	}

	@Override
	public int compareTo(Around_World around_World) {
		return _around_World.compareTo(around_World);
	}

	@Override
	public int hashCode() {
		return _around_World.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _around_World.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new Around_WorldWrapper((Around_World)_around_World.clone());
	}

	/**
	* Returns the news of this around_ world.
	*
	* @return the news of this around_ world
	*/
	@Override
	public java.lang.String getNews() {
		return _around_World.getNews();
	}

	@Override
	public java.lang.String toString() {
		return _around_World.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _around_World.toXmlString();
	}

	/**
	* Returns the ID of this around_ world.
	*
	* @return the ID of this around_ world
	*/
	@Override
	public long getId() {
		return _around_World.getId();
	}

	/**
	* Returns the primary key of this around_ world.
	*
	* @return the primary key of this around_ world
	*/
	@Override
	public long getPrimaryKey() {
		return _around_World.getPrimaryKey();
	}

	@Override
	public void persist() {
		_around_World.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_around_World.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_around_World.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_around_World.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_around_World.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this around_ world.
	*
	* @param id the ID of this around_ world
	*/
	@Override
	public void setId(long id) {
		_around_World.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_around_World.setNew(n);
	}

	/**
	* Sets the news of this around_ world.
	*
	* @param news the news of this around_ world
	*/
	@Override
	public void setNews(java.lang.String news) {
		_around_World.setNews(news);
	}

	/**
	* Sets the primary key of this around_ world.
	*
	* @param primaryKey the primary key of this around_ world
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_around_World.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_around_World.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Around_WorldWrapper)) {
			return false;
		}

		Around_WorldWrapper around_WorldWrapper = (Around_WorldWrapper)obj;

		if (Objects.equals(_around_World, around_WorldWrapper._around_World)) {
			return true;
		}

		return false;
	}

	@Override
	public Around_World getWrappedModel() {
		return _around_World;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _around_World.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _around_World.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_around_World.resetOriginalValues();
	}

	private final Around_World _around_World;
}