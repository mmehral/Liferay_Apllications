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

package com.contest.model;

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
 * This class is a wrapper for {@link CholaContest}.
 * </p>
 *
 * @author CloverLiferay01
 * @see CholaContest
 * @generated
 */
@ProviderType
public class CholaContestWrapper implements CholaContest,
	ModelWrapper<CholaContest> {
	public CholaContestWrapper(CholaContest cholaContest) {
		_cholaContest = cholaContest;
	}

	@Override
	public Class<?> getModelClass() {
		return CholaContest.class;
	}

	@Override
	public String getModelClassName() {
		return CholaContest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
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
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
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
	public CholaContest toEscapedModel() {
		return new CholaContestWrapper(_cholaContest.toEscapedModel());
	}

	@Override
	public CholaContest toUnescapedModel() {
		return new CholaContestWrapper(_cholaContest.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _cholaContest.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cholaContest.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cholaContest.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cholaContest.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CholaContest> toCacheModel() {
		return _cholaContest.toCacheModel();
	}

	@Override
	public int compareTo(CholaContest cholaContest) {
		return _cholaContest.compareTo(cholaContest);
	}

	/**
	* Returns the contest_code of this chola contest.
	*
	* @return the contest_code of this chola contest
	*/
	@Override
	public int getContest_code() {
		return _cholaContest.getContest_code();
	}

	/**
	* Returns the contest_val of this chola contest.
	*
	* @return the contest_val of this chola contest
	*/
	@Override
	public int getContest_val() {
		return _cholaContest.getContest_val();
	}

	@Override
	public int hashCode() {
		return _cholaContest.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cholaContest.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CholaContestWrapper((CholaContest)_cholaContest.clone());
	}

	/**
	* Returns the content of this chola contest.
	*
	* @return the content of this chola contest
	*/
	@Override
	public java.lang.String getContent() {
		return _cholaContest.getContent();
	}

	/**
	* Returns the contest_desc of this chola contest.
	*
	* @return the contest_desc of this chola contest
	*/
	@Override
	public java.lang.String getContest_desc() {
		return _cholaContest.getContest_desc();
	}

	/**
	* Returns the contest_doc of this chola contest.
	*
	* @return the contest_doc of this chola contest
	*/
	@Override
	public java.lang.String getContest_doc() {
		return _cholaContest.getContest_doc();
	}

	/**
	* Returns the contest_path of this chola contest.
	*
	* @return the contest_path of this chola contest
	*/
	@Override
	public java.lang.String getContest_path() {
		return _cholaContest.getContest_path();
	}

	/**
	* Returns the contest_title of this chola contest.
	*
	* @return the contest_title of this chola contest
	*/
	@Override
	public java.lang.String getContest_title() {
		return _cholaContest.getContest_title();
	}

	/**
	* Returns the feedback of this chola contest.
	*
	* @return the feedback of this chola contest
	*/
	@Override
	public java.lang.String getFeedback() {
		return _cholaContest.getFeedback();
	}

	/**
	* Returns the user_id of this chola contest.
	*
	* @return the user_id of this chola contest
	*/
	@Override
	public java.lang.String getUser_id() {
		return _cholaContest.getUser_id();
	}

	@Override
	public java.lang.String toString() {
		return _cholaContest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cholaContest.toXmlString();
	}

	/**
	* Returns the create date of this chola contest.
	*
	* @return the create date of this chola contest
	*/
	@Override
	public Date getCreateDate() {
		return _cholaContest.getCreateDate();
	}

	/**
	* Returns the enddate of this chola contest.
	*
	* @return the enddate of this chola contest
	*/
	@Override
	public Date getEnddate() {
		return _cholaContest.getEnddate();
	}

	/**
	* Returns the startdate of this chola contest.
	*
	* @return the startdate of this chola contest
	*/
	@Override
	public Date getStartdate() {
		return _cholaContest.getStartdate();
	}

	/**
	* Returns the content_id of this chola contest.
	*
	* @return the content_id of this chola contest
	*/
	@Override
	public long getContent_id() {
		return _cholaContest.getContent_id();
	}

	/**
	* Returns the ID of this chola contest.
	*
	* @return the ID of this chola contest
	*/
	@Override
	public long getId() {
		return _cholaContest.getId();
	}

	/**
	* Returns the primary key of this chola contest.
	*
	* @return the primary key of this chola contest
	*/
	@Override
	public long getPrimaryKey() {
		return _cholaContest.getPrimaryKey();
	}

	@Override
	public void persist() {
		_cholaContest.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cholaContest.setCachedModel(cachedModel);
	}

	/**
	* Sets the content of this chola contest.
	*
	* @param content the content of this chola contest
	*/
	@Override
	public void setContent(java.lang.String content) {
		_cholaContest.setContent(content);
	}

	/**
	* Sets the content_id of this chola contest.
	*
	* @param content_id the content_id of this chola contest
	*/
	@Override
	public void setContent_id(long content_id) {
		_cholaContest.setContent_id(content_id);
	}

	/**
	* Sets the contest_code of this chola contest.
	*
	* @param contest_code the contest_code of this chola contest
	*/
	@Override
	public void setContest_code(int contest_code) {
		_cholaContest.setContest_code(contest_code);
	}

	/**
	* Sets the contest_desc of this chola contest.
	*
	* @param contest_desc the contest_desc of this chola contest
	*/
	@Override
	public void setContest_desc(java.lang.String contest_desc) {
		_cholaContest.setContest_desc(contest_desc);
	}

	/**
	* Sets the contest_doc of this chola contest.
	*
	* @param contest_doc the contest_doc of this chola contest
	*/
	@Override
	public void setContest_doc(java.lang.String contest_doc) {
		_cholaContest.setContest_doc(contest_doc);
	}

	/**
	* Sets the contest_path of this chola contest.
	*
	* @param contest_path the contest_path of this chola contest
	*/
	@Override
	public void setContest_path(java.lang.String contest_path) {
		_cholaContest.setContest_path(contest_path);
	}

	/**
	* Sets the contest_title of this chola contest.
	*
	* @param contest_title the contest_title of this chola contest
	*/
	@Override
	public void setContest_title(java.lang.String contest_title) {
		_cholaContest.setContest_title(contest_title);
	}

	/**
	* Sets the contest_val of this chola contest.
	*
	* @param contest_val the contest_val of this chola contest
	*/
	@Override
	public void setContest_val(int contest_val) {
		_cholaContest.setContest_val(contest_val);
	}

	/**
	* Sets the create date of this chola contest.
	*
	* @param createDate the create date of this chola contest
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_cholaContest.setCreateDate(createDate);
	}

	/**
	* Sets the enddate of this chola contest.
	*
	* @param enddate the enddate of this chola contest
	*/
	@Override
	public void setEnddate(Date enddate) {
		_cholaContest.setEnddate(enddate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cholaContest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cholaContest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cholaContest.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the feedback of this chola contest.
	*
	* @param feedback the feedback of this chola contest
	*/
	@Override
	public void setFeedback(java.lang.String feedback) {
		_cholaContest.setFeedback(feedback);
	}

	/**
	* Sets the ID of this chola contest.
	*
	* @param Id the ID of this chola contest
	*/
	@Override
	public void setId(long Id) {
		_cholaContest.setId(Id);
	}

	@Override
	public void setNew(boolean n) {
		_cholaContest.setNew(n);
	}

	/**
	* Sets the primary key of this chola contest.
	*
	* @param primaryKey the primary key of this chola contest
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cholaContest.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cholaContest.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the startdate of this chola contest.
	*
	* @param startdate the startdate of this chola contest
	*/
	@Override
	public void setStartdate(Date startdate) {
		_cholaContest.setStartdate(startdate);
	}

	/**
	* Sets the user_id of this chola contest.
	*
	* @param user_id the user_id of this chola contest
	*/
	@Override
	public void setUser_id(java.lang.String user_id) {
		_cholaContest.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CholaContestWrapper)) {
			return false;
		}

		CholaContestWrapper cholaContestWrapper = (CholaContestWrapper)obj;

		if (Objects.equals(_cholaContest, cholaContestWrapper._cholaContest)) {
			return true;
		}

		return false;
	}

	@Override
	public CholaContest getWrappedModel() {
		return _cholaContest;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cholaContest.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cholaContest.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cholaContest.resetOriginalValues();
	}

	private final CholaContest _cholaContest;
}