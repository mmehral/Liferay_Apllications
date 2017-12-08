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

package com.chola.contest.model;

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
 * This class is a wrapper for {@link cholacontest}.
 * </p>
 *
 * @author cloverliferay01
 * @see cholacontest
 * @generated
 */
@ProviderType
public class cholacontestWrapper implements cholacontest,
	ModelWrapper<cholacontest> {
	public cholacontestWrapper(cholacontest cholacontest) {
		_cholacontest = cholacontest;
	}

	@Override
	public Class<?> getModelClass() {
		return cholacontest.class;
	}

	@Override
	public String getModelClassName() {
		return cholacontest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("content", getContent());
		attributes.put("startdate", getStartdate());
		attributes.put("enddate", getEnddate());
		attributes.put("feedback", getFeedback());
		attributes.put("createDate", getCreateDate());
		attributes.put("contest_code", getContest_code());
		attributes.put("contest_val", getContest_val());
		attributes.put("contest_desc", getContest_desc());
		attributes.put("contest_doc", getContest_doc());
		attributes.put("contest_path", getContest_path());
		attributes.put("contest_title", getContest_title());
		attributes.put("user_id", getUser_id());

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

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Date startdate = (Date)attributes.get("startdate");

		if (startdate != null) {
			setStartdate(startdate);
		}

		Date enddate = (Date)attributes.get("enddate");

		if (enddate != null) {
			setEnddate(enddate);
		}

		String feedback = (String)attributes.get("feedback");

		if (feedback != null) {
			setFeedback(feedback);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Integer contest_code = (Integer)attributes.get("contest_code");

		if (contest_code != null) {
			setContest_code(contest_code);
		}

		Integer contest_val = (Integer)attributes.get("contest_val");

		if (contest_val != null) {
			setContest_val(contest_val);
		}

		String contest_desc = (String)attributes.get("contest_desc");

		if (contest_desc != null) {
			setContest_desc(contest_desc);
		}

		String contest_doc = (String)attributes.get("contest_doc");

		if (contest_doc != null) {
			setContest_doc(contest_doc);
		}

		String contest_path = (String)attributes.get("contest_path");

		if (contest_path != null) {
			setContest_path(contest_path);
		}

		String contest_title = (String)attributes.get("contest_title");

		if (contest_title != null) {
			setContest_title(contest_title);
		}

		String user_id = (String)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _cholacontest.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cholacontest.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cholacontest.isNew();
	}

	@Override
	public com.chola.contest.model.cholacontest toEscapedModel() {
		return new cholacontestWrapper(_cholacontest.toEscapedModel());
	}

	@Override
	public com.chola.contest.model.cholacontest toUnescapedModel() {
		return new cholacontestWrapper(_cholacontest.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cholacontest.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.contest.model.cholacontest> toCacheModel() {
		return _cholacontest.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.contest.model.cholacontest cholacontest) {
		return _cholacontest.compareTo(cholacontest);
	}

	/**
	* Returns the contest_code of this cholacontest.
	*
	* @return the contest_code of this cholacontest
	*/
	@Override
	public int getContest_code() {
		return _cholacontest.getContest_code();
	}

	/**
	* Returns the contest_val of this cholacontest.
	*
	* @return the contest_val of this cholacontest
	*/
	@Override
	public int getContest_val() {
		return _cholacontest.getContest_val();
	}

	@Override
	public int hashCode() {
		return _cholacontest.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cholacontest.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new cholacontestWrapper((cholacontest)_cholacontest.clone());
	}

	/**
	* Returns the content of this cholacontest.
	*
	* @return the content of this cholacontest
	*/
	@Override
	public java.lang.String getContent() {
		return _cholacontest.getContent();
	}

	/**
	* Returns the contest_desc of this cholacontest.
	*
	* @return the contest_desc of this cholacontest
	*/
	@Override
	public java.lang.String getContest_desc() {
		return _cholacontest.getContest_desc();
	}

	/**
	* Returns the contest_doc of this cholacontest.
	*
	* @return the contest_doc of this cholacontest
	*/
	@Override
	public java.lang.String getContest_doc() {
		return _cholacontest.getContest_doc();
	}

	/**
	* Returns the contest_path of this cholacontest.
	*
	* @return the contest_path of this cholacontest
	*/
	@Override
	public java.lang.String getContest_path() {
		return _cholacontest.getContest_path();
	}

	/**
	* Returns the contest_title of this cholacontest.
	*
	* @return the contest_title of this cholacontest
	*/
	@Override
	public java.lang.String getContest_title() {
		return _cholacontest.getContest_title();
	}

	/**
	* Returns the feedback of this cholacontest.
	*
	* @return the feedback of this cholacontest
	*/
	@Override
	public java.lang.String getFeedback() {
		return _cholacontest.getFeedback();
	}

	/**
	* Returns the user_id of this cholacontest.
	*
	* @return the user_id of this cholacontest
	*/
	@Override
	public java.lang.String getUser_id() {
		return _cholacontest.getUser_id();
	}

	@Override
	public java.lang.String toString() {
		return _cholacontest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cholacontest.toXmlString();
	}

	/**
	* Returns the create date of this cholacontest.
	*
	* @return the create date of this cholacontest
	*/
	@Override
	public Date getCreateDate() {
		return _cholacontest.getCreateDate();
	}

	/**
	* Returns the enddate of this cholacontest.
	*
	* @return the enddate of this cholacontest
	*/
	@Override
	public Date getEnddate() {
		return _cholacontest.getEnddate();
	}

	/**
	* Returns the startdate of this cholacontest.
	*
	* @return the startdate of this cholacontest
	*/
	@Override
	public Date getStartdate() {
		return _cholacontest.getStartdate();
	}

	/**
	* Returns the content_id of this cholacontest.
	*
	* @return the content_id of this cholacontest
	*/
	@Override
	public long getContent_id() {
		return _cholacontest.getContent_id();
	}

	/**
	* Returns the ID of this cholacontest.
	*
	* @return the ID of this cholacontest
	*/
	@Override
	public long getId() {
		return _cholacontest.getId();
	}

	/**
	* Returns the primary key of this cholacontest.
	*
	* @return the primary key of this cholacontest
	*/
	@Override
	public long getPrimaryKey() {
		return _cholacontest.getPrimaryKey();
	}

	@Override
	public void persist() {
		_cholacontest.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cholacontest.setCachedModel(cachedModel);
	}

	/**
	* Sets the content of this cholacontest.
	*
	* @param content the content of this cholacontest
	*/
	@Override
	public void setContent(java.lang.String content) {
		_cholacontest.setContent(content);
	}

	/**
	* Sets the content_id of this cholacontest.
	*
	* @param content_id the content_id of this cholacontest
	*/
	@Override
	public void setContent_id(long content_id) {
		_cholacontest.setContent_id(content_id);
	}

	/**
	* Sets the contest_code of this cholacontest.
	*
	* @param contest_code the contest_code of this cholacontest
	*/
	@Override
	public void setContest_code(int contest_code) {
		_cholacontest.setContest_code(contest_code);
	}

	/**
	* Sets the contest_desc of this cholacontest.
	*
	* @param contest_desc the contest_desc of this cholacontest
	*/
	@Override
	public void setContest_desc(java.lang.String contest_desc) {
		_cholacontest.setContest_desc(contest_desc);
	}

	/**
	* Sets the contest_doc of this cholacontest.
	*
	* @param contest_doc the contest_doc of this cholacontest
	*/
	@Override
	public void setContest_doc(java.lang.String contest_doc) {
		_cholacontest.setContest_doc(contest_doc);
	}

	/**
	* Sets the contest_path of this cholacontest.
	*
	* @param contest_path the contest_path of this cholacontest
	*/
	@Override
	public void setContest_path(java.lang.String contest_path) {
		_cholacontest.setContest_path(contest_path);
	}

	/**
	* Sets the contest_title of this cholacontest.
	*
	* @param contest_title the contest_title of this cholacontest
	*/
	@Override
	public void setContest_title(java.lang.String contest_title) {
		_cholacontest.setContest_title(contest_title);
	}

	/**
	* Sets the contest_val of this cholacontest.
	*
	* @param contest_val the contest_val of this cholacontest
	*/
	@Override
	public void setContest_val(int contest_val) {
		_cholacontest.setContest_val(contest_val);
	}

	/**
	* Sets the create date of this cholacontest.
	*
	* @param createDate the create date of this cholacontest
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cholacontest.setCreateDate(createDate);
	}

	/**
	* Sets the enddate of this cholacontest.
	*
	* @param enddate the enddate of this cholacontest
	*/
	@Override
	public void setEnddate(Date enddate) {
		_cholacontest.setEnddate(enddate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cholacontest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cholacontest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cholacontest.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the feedback of this cholacontest.
	*
	* @param feedback the feedback of this cholacontest
	*/
	@Override
	public void setFeedback(java.lang.String feedback) {
		_cholacontest.setFeedback(feedback);
	}

	/**
	* Sets the ID of this cholacontest.
	*
	* @param id the ID of this cholacontest
	*/
	@Override
	public void setId(long id) {
		_cholacontest.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_cholacontest.setNew(n);
	}

	/**
	* Sets the primary key of this cholacontest.
	*
	* @param primaryKey the primary key of this cholacontest
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cholacontest.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cholacontest.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the startdate of this cholacontest.
	*
	* @param startdate the startdate of this cholacontest
	*/
	@Override
	public void setStartdate(Date startdate) {
		_cholacontest.setStartdate(startdate);
	}

	/**
	* Sets the user_id of this cholacontest.
	*
	* @param user_id the user_id of this cholacontest
	*/
	@Override
	public void setUser_id(java.lang.String user_id) {
		_cholacontest.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cholacontestWrapper)) {
			return false;
		}

		cholacontestWrapper cholacontestWrapper = (cholacontestWrapper)obj;

		if (Objects.equals(_cholacontest, cholacontestWrapper._cholacontest)) {
			return true;
		}

		return false;
	}

	@Override
	public cholacontest getWrappedModel() {
		return _cholacontest;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cholacontest.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cholacontest.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cholacontest.resetOriginalValues();
	}

	private final cholacontest _cholacontest;
}