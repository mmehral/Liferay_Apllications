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

package com.meera.workflow.db.model;

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
 * This class is a wrapper for {@link Feedback}.
 * </p>
 *
 * @author CloverLiferay01
 * @see Feedback
 * @generated
 */
@ProviderType
public class FeedbackWrapper implements Feedback, ModelWrapper<Feedback> {
	public FeedbackWrapper(Feedback feedback) {
		_feedback = feedback;
	}

	@Override
	public Class<?> getModelClass() {
		return Feedback.class;
	}

	@Override
	public String getModelClassName() {
		return Feedback.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("feedbackId", getFeedbackId());
		attributes.put("feedbackDate", getFeedbackDate());
		attributes.put("feedbackText", getFeedbackText());
		attributes.put("feedbackSubject", getFeedbackSubject());
		attributes.put("feedBackStatus", getFeedBackStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusDate", getStatusDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long feedbackId = (Long)attributes.get("feedbackId");

		if (feedbackId != null) {
			setFeedbackId(feedbackId);
		}

		Date feedbackDate = (Date)attributes.get("feedbackDate");

		if (feedbackDate != null) {
			setFeedbackDate(feedbackDate);
		}

		String feedbackText = (String)attributes.get("feedbackText");

		if (feedbackText != null) {
			setFeedbackText(feedbackText);
		}

		String feedbackSubject = (String)attributes.get("feedbackSubject");

		if (feedbackSubject != null) {
			setFeedbackSubject(feedbackSubject);
		}

		Integer feedBackStatus = (Integer)attributes.get("feedBackStatus");

		if (feedBackStatus != null) {
			setFeedBackStatus(feedBackStatus);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public Feedback toEscapedModel() {
		return new FeedbackWrapper(_feedback.toEscapedModel());
	}

	@Override
	public Feedback toUnescapedModel() {
		return new FeedbackWrapper(_feedback.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _feedback.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _feedback.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _feedback.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _feedback.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Feedback> toCacheModel() {
		return _feedback.toCacheModel();
	}

	@Override
	public int compareTo(Feedback feedback) {
		return _feedback.compareTo(feedback);
	}

	/**
	* Returns the feed back status of this feedback.
	*
	* @return the feed back status of this feedback
	*/
	@Override
	public int getFeedBackStatus() {
		return _feedback.getFeedBackStatus();
	}

	@Override
	public int hashCode() {
		return _feedback.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _feedback.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FeedbackWrapper((Feedback)_feedback.clone());
	}

	/**
	* Returns the feedback subject of this feedback.
	*
	* @return the feedback subject of this feedback
	*/
	@Override
	public java.lang.String getFeedbackSubject() {
		return _feedback.getFeedbackSubject();
	}

	/**
	* Returns the feedback text of this feedback.
	*
	* @return the feedback text of this feedback
	*/
	@Override
	public java.lang.String getFeedbackText() {
		return _feedback.getFeedbackText();
	}

	/**
	* Returns the status by user uuid of this feedback.
	*
	* @return the status by user uuid of this feedback
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _feedback.getStatusByUserUuid();
	}

	/**
	* Returns the user uuid of this feedback.
	*
	* @return the user uuid of this feedback
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _feedback.getUserUuid();
	}

	/**
	* Returns the uuid of this feedback.
	*
	* @return the uuid of this feedback
	*/
	@Override
	public java.lang.String getUuid() {
		return _feedback.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _feedback.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _feedback.toXmlString();
	}

	/**
	* Returns the feedback date of this feedback.
	*
	* @return the feedback date of this feedback
	*/
	@Override
	public Date getFeedbackDate() {
		return _feedback.getFeedbackDate();
	}

	/**
	* Returns the status date of this feedback.
	*
	* @return the status date of this feedback
	*/
	@Override
	public Date getStatusDate() {
		return _feedback.getStatusDate();
	}

	/**
	* Returns the company ID of this feedback.
	*
	* @return the company ID of this feedback
	*/
	@Override
	public long getCompanyId() {
		return _feedback.getCompanyId();
	}

	/**
	* Returns the feedback ID of this feedback.
	*
	* @return the feedback ID of this feedback
	*/
	@Override
	public long getFeedbackId() {
		return _feedback.getFeedbackId();
	}

	/**
	* Returns the group ID of this feedback.
	*
	* @return the group ID of this feedback
	*/
	@Override
	public long getGroupId() {
		return _feedback.getGroupId();
	}

	/**
	* Returns the primary key of this feedback.
	*
	* @return the primary key of this feedback
	*/
	@Override
	public long getPrimaryKey() {
		return _feedback.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this feedback.
	*
	* @return the status by user ID of this feedback
	*/
	@Override
	public long getStatusByUserId() {
		return _feedback.getStatusByUserId();
	}

	/**
	* Returns the user ID of this feedback.
	*
	* @return the user ID of this feedback
	*/
	@Override
	public long getUserId() {
		return _feedback.getUserId();
	}

	@Override
	public void persist() {
		_feedback.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_feedback.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this feedback.
	*
	* @param companyId the company ID of this feedback
	*/
	@Override
	public void setCompanyId(long companyId) {
		_feedback.setCompanyId(companyId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_feedback.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_feedback.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_feedback.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the feed back status of this feedback.
	*
	* @param feedBackStatus the feed back status of this feedback
	*/
	@Override
	public void setFeedBackStatus(int feedBackStatus) {
		_feedback.setFeedBackStatus(feedBackStatus);
	}

	/**
	* Sets the feedback date of this feedback.
	*
	* @param feedbackDate the feedback date of this feedback
	*/
	@Override
	public void setFeedbackDate(Date feedbackDate) {
		_feedback.setFeedbackDate(feedbackDate);
	}

	/**
	* Sets the feedback ID of this feedback.
	*
	* @param feedbackId the feedback ID of this feedback
	*/
	@Override
	public void setFeedbackId(long feedbackId) {
		_feedback.setFeedbackId(feedbackId);
	}

	/**
	* Sets the feedback subject of this feedback.
	*
	* @param feedbackSubject the feedback subject of this feedback
	*/
	@Override
	public void setFeedbackSubject(java.lang.String feedbackSubject) {
		_feedback.setFeedbackSubject(feedbackSubject);
	}

	/**
	* Sets the feedback text of this feedback.
	*
	* @param feedbackText the feedback text of this feedback
	*/
	@Override
	public void setFeedbackText(java.lang.String feedbackText) {
		_feedback.setFeedbackText(feedbackText);
	}

	/**
	* Sets the group ID of this feedback.
	*
	* @param groupId the group ID of this feedback
	*/
	@Override
	public void setGroupId(long groupId) {
		_feedback.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_feedback.setNew(n);
	}

	/**
	* Sets the primary key of this feedback.
	*
	* @param primaryKey the primary key of this feedback
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_feedback.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_feedback.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status by user ID of this feedback.
	*
	* @param statusByUserId the status by user ID of this feedback
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_feedback.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user uuid of this feedback.
	*
	* @param statusByUserUuid the status by user uuid of this feedback
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_feedback.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this feedback.
	*
	* @param statusDate the status date of this feedback
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_feedback.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this feedback.
	*
	* @param userId the user ID of this feedback
	*/
	@Override
	public void setUserId(long userId) {
		_feedback.setUserId(userId);
	}

	/**
	* Sets the user uuid of this feedback.
	*
	* @param userUuid the user uuid of this feedback
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_feedback.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this feedback.
	*
	* @param uuid the uuid of this feedback
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_feedback.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FeedbackWrapper)) {
			return false;
		}

		FeedbackWrapper feedbackWrapper = (FeedbackWrapper)obj;

		if (Objects.equals(_feedback, feedbackWrapper._feedback)) {
			return true;
		}

		return false;
	}

	@Override
	public Feedback getWrappedModel() {
		return _feedback;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _feedback.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _feedback.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_feedback.resetOriginalValues();
	}

	private final Feedback _feedback;
}