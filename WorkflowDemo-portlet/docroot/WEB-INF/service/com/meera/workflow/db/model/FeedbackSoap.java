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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.meera.workflow.db.service.http.FeedbackServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.meera.workflow.db.service.http.FeedbackServiceSoap
 * @generated
 */
@ProviderType
public class FeedbackSoap implements Serializable {
	public static FeedbackSoap toSoapModel(Feedback model) {
		FeedbackSoap soapModel = new FeedbackSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFeedbackId(model.getFeedbackId());
		soapModel.setFeedbackDate(model.getFeedbackDate());
		soapModel.setFeedbackText(model.getFeedbackText());
		soapModel.setFeedbackSubject(model.getFeedbackSubject());
		soapModel.setFeedBackStatus(model.getFeedBackStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static FeedbackSoap[] toSoapModels(Feedback[] models) {
		FeedbackSoap[] soapModels = new FeedbackSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FeedbackSoap[][] toSoapModels(Feedback[][] models) {
		FeedbackSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FeedbackSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FeedbackSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FeedbackSoap[] toSoapModels(List<Feedback> models) {
		List<FeedbackSoap> soapModels = new ArrayList<FeedbackSoap>(models.size());

		for (Feedback model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FeedbackSoap[soapModels.size()]);
	}

	public FeedbackSoap() {
	}

	public long getPrimaryKey() {
		return _feedbackId;
	}

	public void setPrimaryKey(long pk) {
		setFeedbackId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFeedbackId() {
		return _feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		_feedbackId = feedbackId;
	}

	public Date getFeedbackDate() {
		return _feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		_feedbackDate = feedbackDate;
	}

	public String getFeedbackText() {
		return _feedbackText;
	}

	public void setFeedbackText(String feedbackText) {
		_feedbackText = feedbackText;
	}

	public String getFeedbackSubject() {
		return _feedbackSubject;
	}

	public void setFeedbackSubject(String feedbackSubject) {
		_feedbackSubject = feedbackSubject;
	}

	public int getFeedBackStatus() {
		return _feedBackStatus;
	}

	public void setFeedBackStatus(int feedBackStatus) {
		_feedBackStatus = feedBackStatus;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private String _uuid;
	private long _feedbackId;
	private Date _feedbackDate;
	private String _feedbackText;
	private String _feedbackSubject;
	private int _feedBackStatus;
	private long _statusByUserId;
	private Date _statusDate;
	private long _companyId;
	private long _groupId;
	private long _userId;
}