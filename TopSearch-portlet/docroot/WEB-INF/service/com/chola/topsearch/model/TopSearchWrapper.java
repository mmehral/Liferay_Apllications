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

package com.chola.topsearch.model;

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
 * This class is a wrapper for {@link TopSearch}.
 * </p>
 *
 * @author adms.java1
 * @see TopSearch
 * @generated
 */
@ProviderType
public class TopSearchWrapper implements TopSearch, ModelWrapper<TopSearch> {
	public TopSearchWrapper(TopSearch topSearch) {
		_topSearch = topSearch;
	}

	@Override
	public Class<?> getModelClass() {
		return TopSearch.class;
	}

	@Override
	public String getModelClassName() {
		return TopSearch.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("srchId", getSrchId());
		attributes.put("Name", getName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long srchId = (Long)attributes.get("srchId");

		if (srchId != null) {
			setSrchId(srchId);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public TopSearch toEscapedModel() {
		return new TopSearchWrapper(_topSearch.toEscapedModel());
	}

	@Override
	public TopSearch toUnescapedModel() {
		return new TopSearchWrapper(_topSearch.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _topSearch.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _topSearch.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _topSearch.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _topSearch.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<TopSearch> toCacheModel() {
		return _topSearch.toCacheModel();
	}

	@Override
	public int compareTo(TopSearch topSearch) {
		return _topSearch.compareTo(topSearch);
	}

	@Override
	public int hashCode() {
		return _topSearch.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _topSearch.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TopSearchWrapper((TopSearch)_topSearch.clone());
	}

	/**
	* Returns the name of this top search.
	*
	* @return the name of this top search
	*/
	@Override
	public java.lang.String getName() {
		return _topSearch.getName();
	}

	@Override
	public java.lang.String toString() {
		return _topSearch.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _topSearch.toXmlString();
	}

	/**
	* Returns the create date of this top search.
	*
	* @return the create date of this top search
	*/
	@Override
	public Date getCreateDate() {
		return _topSearch.getCreateDate();
	}

	/**
	* Returns the modified date of this top search.
	*
	* @return the modified date of this top search
	*/
	@Override
	public Date getModifiedDate() {
		return _topSearch.getModifiedDate();
	}

	/**
	* Returns the primary key of this top search.
	*
	* @return the primary key of this top search
	*/
	@Override
	public long getPrimaryKey() {
		return _topSearch.getPrimaryKey();
	}

	/**
	* Returns the srch ID of this top search.
	*
	* @return the srch ID of this top search
	*/
	@Override
	public long getSrchId() {
		return _topSearch.getSrchId();
	}

	@Override
	public void persist() {
		_topSearch.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_topSearch.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this top search.
	*
	* @param createDate the create date of this top search
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_topSearch.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_topSearch.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_topSearch.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_topSearch.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this top search.
	*
	* @param modifiedDate the modified date of this top search
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_topSearch.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this top search.
	*
	* @param Name the name of this top search
	*/
	@Override
	public void setName(java.lang.String Name) {
		_topSearch.setName(Name);
	}

	@Override
	public void setNew(boolean n) {
		_topSearch.setNew(n);
	}

	/**
	* Sets the primary key of this top search.
	*
	* @param primaryKey the primary key of this top search
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_topSearch.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_topSearch.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the srch ID of this top search.
	*
	* @param srchId the srch ID of this top search
	*/
	@Override
	public void setSrchId(long srchId) {
		_topSearch.setSrchId(srchId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TopSearchWrapper)) {
			return false;
		}

		TopSearchWrapper topSearchWrapper = (TopSearchWrapper)obj;

		if (Objects.equals(_topSearch, topSearchWrapper._topSearch)) {
			return true;
		}

		return false;
	}

	@Override
	public TopSearch getWrappedModel() {
		return _topSearch;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _topSearch.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _topSearch.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_topSearch.resetOriginalValues();
	}

	private final TopSearch _topSearch;
}