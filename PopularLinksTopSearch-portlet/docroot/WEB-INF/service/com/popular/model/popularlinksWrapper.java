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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link popularlinks}.
 * </p>
 *
 * @author CloverLiferay02
 * @see popularlinks
 * @generated
 */
@ProviderType
public class popularlinksWrapper implements popularlinks,
	ModelWrapper<popularlinks> {
	public popularlinksWrapper(popularlinks popularlinks) {
		_popularlinks = popularlinks;
	}

	@Override
	public Class<?> getModelClass() {
		return popularlinks.class;
	}

	@Override
	public String getModelClassName() {
		return popularlinks.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userid", getUserid());
		attributes.put("url", getUrl());
		attributes.put("tag", getTag());
		attributes.put("count", getCount());
		attributes.put("flag", getFlag());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String tag = (String)attributes.get("tag");

		if (tag != null) {
			setTag(tag);
		}

		Long count = (Long)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		Integer flag = (Integer)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _popularlinks.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _popularlinks.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _popularlinks.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _popularlinks.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.popular.model.popularlinks> toCacheModel() {
		return _popularlinks.toCacheModel();
	}

	@Override
	public com.popular.model.popularlinks toEscapedModel() {
		return new popularlinksWrapper(_popularlinks.toEscapedModel());
	}

	@Override
	public com.popular.model.popularlinks toUnescapedModel() {
		return new popularlinksWrapper(_popularlinks.toUnescapedModel());
	}

	@Override
	public int compareTo(com.popular.model.popularlinks popularlinks) {
		return _popularlinks.compareTo(popularlinks);
	}

	/**
	* Returns the flag of this popularlinks.
	*
	* @return the flag of this popularlinks
	*/
	@Override
	public int getFlag() {
		return _popularlinks.getFlag();
	}

	@Override
	public int hashCode() {
		return _popularlinks.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _popularlinks.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new popularlinksWrapper((popularlinks)_popularlinks.clone());
	}

	/**
	* Returns the tag of this popularlinks.
	*
	* @return the tag of this popularlinks
	*/
	@Override
	public java.lang.String getTag() {
		return _popularlinks.getTag();
	}

	/**
	* Returns the url of this popularlinks.
	*
	* @return the url of this popularlinks
	*/
	@Override
	public java.lang.String getUrl() {
		return _popularlinks.getUrl();
	}

	@Override
	public java.lang.String toString() {
		return _popularlinks.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _popularlinks.toXmlString();
	}

	/**
	* Returns the create date of this popularlinks.
	*
	* @return the create date of this popularlinks
	*/
	@Override
	public Date getCreateDate() {
		return _popularlinks.getCreateDate();
	}

	/**
	* Returns the count of this popularlinks.
	*
	* @return the count of this popularlinks
	*/
	@Override
	public long getCount() {
		return _popularlinks.getCount();
	}

	/**
	* Returns the ID of this popularlinks.
	*
	* @return the ID of this popularlinks
	*/
	@Override
	public long getId() {
		return _popularlinks.getId();
	}

	/**
	* Returns the primary key of this popularlinks.
	*
	* @return the primary key of this popularlinks
	*/
	@Override
	public long getPrimaryKey() {
		return _popularlinks.getPrimaryKey();
	}

	/**
	* Returns the userid of this popularlinks.
	*
	* @return the userid of this popularlinks
	*/
	@Override
	public long getUserid() {
		return _popularlinks.getUserid();
	}

	@Override
	public void persist() {
		_popularlinks.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_popularlinks.setCachedModel(cachedModel);
	}

	/**
	* Sets the count of this popularlinks.
	*
	* @param count the count of this popularlinks
	*/
	@Override
	public void setCount(long count) {
		_popularlinks.setCount(count);
	}

	/**
	* Sets the create date of this popularlinks.
	*
	* @param createDate the create date of this popularlinks
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_popularlinks.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_popularlinks.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_popularlinks.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_popularlinks.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this popularlinks.
	*
	* @param flag the flag of this popularlinks
	*/
	@Override
	public void setFlag(int flag) {
		_popularlinks.setFlag(flag);
	}

	/**
	* Sets the ID of this popularlinks.
	*
	* @param id the ID of this popularlinks
	*/
	@Override
	public void setId(long id) {
		_popularlinks.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_popularlinks.setNew(n);
	}

	/**
	* Sets the primary key of this popularlinks.
	*
	* @param primaryKey the primary key of this popularlinks
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_popularlinks.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_popularlinks.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tag of this popularlinks.
	*
	* @param tag the tag of this popularlinks
	*/
	@Override
	public void setTag(java.lang.String tag) {
		_popularlinks.setTag(tag);
	}

	/**
	* Sets the url of this popularlinks.
	*
	* @param url the url of this popularlinks
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_popularlinks.setUrl(url);
	}

	/**
	* Sets the userid of this popularlinks.
	*
	* @param userid the userid of this popularlinks
	*/
	@Override
	public void setUserid(long userid) {
		_popularlinks.setUserid(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof popularlinksWrapper)) {
			return false;
		}

		popularlinksWrapper popularlinksWrapper = (popularlinksWrapper)obj;

		if (Objects.equals(_popularlinks, popularlinksWrapper._popularlinks)) {
			return true;
		}

		return false;
	}

	@Override
	public popularlinks getWrappedModel() {
		return _popularlinks;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _popularlinks.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _popularlinks.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_popularlinks.resetOriginalValues();
	}

	private final popularlinks _popularlinks;
}