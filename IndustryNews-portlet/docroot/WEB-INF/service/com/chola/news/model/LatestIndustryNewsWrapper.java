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
 * This class is a wrapper for {@link LatestIndustryNews}.
 * </p>
 *
 * @author CloverLiferay03
 * @see LatestIndustryNews
 * @generated
 */
@ProviderType
public class LatestIndustryNewsWrapper implements LatestIndustryNews,
	ModelWrapper<LatestIndustryNews> {
	public LatestIndustryNewsWrapper(LatestIndustryNews latestIndustryNews) {
		_latestIndustryNews = latestIndustryNews;
	}

	@Override
	public Class<?> getModelClass() {
		return LatestIndustryNews.class;
	}

	@Override
	public String getModelClassName() {
		return LatestIndustryNews.class.getName();
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
	public LatestIndustryNews toEscapedModel() {
		return new LatestIndustryNewsWrapper(_latestIndustryNews.toEscapedModel());
	}

	@Override
	public LatestIndustryNews toUnescapedModel() {
		return new LatestIndustryNewsWrapper(_latestIndustryNews.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _latestIndustryNews.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _latestIndustryNews.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _latestIndustryNews.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _latestIndustryNews.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<LatestIndustryNews> toCacheModel() {
		return _latestIndustryNews.toCacheModel();
	}

	@Override
	public int compareTo(LatestIndustryNews latestIndustryNews) {
		return _latestIndustryNews.compareTo(latestIndustryNews);
	}

	@Override
	public int hashCode() {
		return _latestIndustryNews.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _latestIndustryNews.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LatestIndustryNewsWrapper((LatestIndustryNews)_latestIndustryNews.clone());
	}

	/**
	* Returns the content of this latest industry news.
	*
	* @return the content of this latest industry news
	*/
	@Override
	public java.lang.String getContent() {
		return _latestIndustryNews.getContent();
	}

	/**
	* Returns the createdate of this latest industry news.
	*
	* @return the createdate of this latest industry news
	*/
	@Override
	public java.lang.String getCreatedate() {
		return _latestIndustryNews.getCreatedate();
	}

	/**
	* Returns the title of this latest industry news.
	*
	* @return the title of this latest industry news
	*/
	@Override
	public java.lang.String getTitle() {
		return _latestIndustryNews.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _latestIndustryNews.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _latestIndustryNews.toXmlString();
	}

	/**
	* Returns the ID of this latest industry news.
	*
	* @return the ID of this latest industry news
	*/
	@Override
	public long getId() {
		return _latestIndustryNews.getId();
	}

	/**
	* Returns the primary key of this latest industry news.
	*
	* @return the primary key of this latest industry news
	*/
	@Override
	public long getPrimaryKey() {
		return _latestIndustryNews.getPrimaryKey();
	}

	@Override
	public void persist() {
		_latestIndustryNews.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_latestIndustryNews.setCachedModel(cachedModel);
	}

	/**
	* Sets the content of this latest industry news.
	*
	* @param content the content of this latest industry news
	*/
	@Override
	public void setContent(java.lang.String content) {
		_latestIndustryNews.setContent(content);
	}

	/**
	* Sets the createdate of this latest industry news.
	*
	* @param createdate the createdate of this latest industry news
	*/
	@Override
	public void setCreatedate(java.lang.String createdate) {
		_latestIndustryNews.setCreatedate(createdate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_latestIndustryNews.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_latestIndustryNews.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_latestIndustryNews.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this latest industry news.
	*
	* @param id the ID of this latest industry news
	*/
	@Override
	public void setId(long id) {
		_latestIndustryNews.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_latestIndustryNews.setNew(n);
	}

	/**
	* Sets the primary key of this latest industry news.
	*
	* @param primaryKey the primary key of this latest industry news
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_latestIndustryNews.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_latestIndustryNews.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this latest industry news.
	*
	* @param title the title of this latest industry news
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_latestIndustryNews.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LatestIndustryNewsWrapper)) {
			return false;
		}

		LatestIndustryNewsWrapper latestIndustryNewsWrapper = (LatestIndustryNewsWrapper)obj;

		if (Objects.equals(_latestIndustryNews,
					latestIndustryNewsWrapper._latestIndustryNews)) {
			return true;
		}

		return false;
	}

	@Override
	public LatestIndustryNews getWrappedModel() {
		return _latestIndustryNews;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _latestIndustryNews.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _latestIndustryNews.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_latestIndustryNews.resetOriginalValues();
	}

	private final LatestIndustryNews _latestIndustryNews;
}