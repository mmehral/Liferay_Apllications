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

package com.chola.TodaycholaNews.model;

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
 * This class is a wrapper for {@link TodayCholaNews}.
 * </p>
 *
 * @author adms.java1
 * @see TodayCholaNews
 * @generated
 */
@ProviderType
public class TodayCholaNewsWrapper implements TodayCholaNews,
	ModelWrapper<TodayCholaNews> {
	public TodayCholaNewsWrapper(TodayCholaNews todayCholaNews) {
		_todayCholaNews = todayCholaNews;
	}

	@Override
	public Class<?> getModelClass() {
		return TodayCholaNews.class;
	}

	@Override
	public String getModelClassName() {
		return TodayCholaNews.class.getName();
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
	public TodayCholaNews toEscapedModel() {
		return new TodayCholaNewsWrapper(_todayCholaNews.toEscapedModel());
	}

	@Override
	public TodayCholaNews toUnescapedModel() {
		return new TodayCholaNewsWrapper(_todayCholaNews.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _todayCholaNews.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _todayCholaNews.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _todayCholaNews.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _todayCholaNews.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<TodayCholaNews> toCacheModel() {
		return _todayCholaNews.toCacheModel();
	}

	@Override
	public int compareTo(TodayCholaNews todayCholaNews) {
		return _todayCholaNews.compareTo(todayCholaNews);
	}

	@Override
	public int hashCode() {
		return _todayCholaNews.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _todayCholaNews.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TodayCholaNewsWrapper((TodayCholaNews)_todayCholaNews.clone());
	}

	/**
	* Returns the content of this today chola news.
	*
	* @return the content of this today chola news
	*/
	@Override
	public java.lang.String getContent() {
		return _todayCholaNews.getContent();
	}

	/**
	* Returns the createdate of this today chola news.
	*
	* @return the createdate of this today chola news
	*/
	@Override
	public java.lang.String getCreatedate() {
		return _todayCholaNews.getCreatedate();
	}

	/**
	* Returns the title of this today chola news.
	*
	* @return the title of this today chola news
	*/
	@Override
	public java.lang.String getTitle() {
		return _todayCholaNews.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _todayCholaNews.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _todayCholaNews.toXmlString();
	}

	/**
	* Returns the ID of this today chola news.
	*
	* @return the ID of this today chola news
	*/
	@Override
	public long getId() {
		return _todayCholaNews.getId();
	}

	/**
	* Returns the primary key of this today chola news.
	*
	* @return the primary key of this today chola news
	*/
	@Override
	public long getPrimaryKey() {
		return _todayCholaNews.getPrimaryKey();
	}

	@Override
	public void persist() {
		_todayCholaNews.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_todayCholaNews.setCachedModel(cachedModel);
	}

	/**
	* Sets the content of this today chola news.
	*
	* @param content the content of this today chola news
	*/
	@Override
	public void setContent(java.lang.String content) {
		_todayCholaNews.setContent(content);
	}

	/**
	* Sets the createdate of this today chola news.
	*
	* @param createdate the createdate of this today chola news
	*/
	@Override
	public void setCreatedate(java.lang.String createdate) {
		_todayCholaNews.setCreatedate(createdate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_todayCholaNews.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_todayCholaNews.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_todayCholaNews.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this today chola news.
	*
	* @param id the ID of this today chola news
	*/
	@Override
	public void setId(long id) {
		_todayCholaNews.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_todayCholaNews.setNew(n);
	}

	/**
	* Sets the primary key of this today chola news.
	*
	* @param primaryKey the primary key of this today chola news
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_todayCholaNews.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_todayCholaNews.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this today chola news.
	*
	* @param title the title of this today chola news
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_todayCholaNews.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TodayCholaNewsWrapper)) {
			return false;
		}

		TodayCholaNewsWrapper todayCholaNewsWrapper = (TodayCholaNewsWrapper)obj;

		if (Objects.equals(_todayCholaNews,
					todayCholaNewsWrapper._todayCholaNews)) {
			return true;
		}

		return false;
	}

	@Override
	public TodayCholaNews getWrappedModel() {
		return _todayCholaNews;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _todayCholaNews.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _todayCholaNews.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_todayCholaNews.resetOriginalValues();
	}

	private final TodayCholaNews _todayCholaNews;
}