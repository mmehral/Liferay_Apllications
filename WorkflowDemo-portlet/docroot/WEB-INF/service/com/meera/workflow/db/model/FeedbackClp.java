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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.meera.workflow.db.service.ClpSerializer;
import com.meera.workflow.db.service.FeedbackLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class FeedbackClp extends BaseModelImpl<Feedback> implements Feedback {
	public FeedbackClp() {
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
	public long getPrimaryKey() {
		return _feedbackId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFeedbackId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _feedbackId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_feedbackRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFeedbackId() {
		return _feedbackId;
	}

	@Override
	public void setFeedbackId(long feedbackId) {
		_feedbackId = feedbackId;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setFeedbackId", long.class);

				method.invoke(_feedbackRemoteModel, feedbackId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getFeedbackDate() {
		return _feedbackDate;
	}

	@Override
	public void setFeedbackDate(Date feedbackDate) {
		_feedbackDate = feedbackDate;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setFeedbackDate", Date.class);

				method.invoke(_feedbackRemoteModel, feedbackDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFeedbackText() {
		return _feedbackText;
	}

	@Override
	public void setFeedbackText(String feedbackText) {
		_feedbackText = feedbackText;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setFeedbackText", String.class);

				method.invoke(_feedbackRemoteModel, feedbackText);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFeedbackSubject() {
		return _feedbackSubject;
	}

	@Override
	public void setFeedbackSubject(String feedbackSubject) {
		_feedbackSubject = feedbackSubject;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setFeedbackSubject",
						String.class);

				method.invoke(_feedbackRemoteModel, feedbackSubject);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFeedBackStatus() {
		return _feedBackStatus;
	}

	@Override
	public void setFeedBackStatus(int feedBackStatus) {
		_feedBackStatus = feedBackStatus;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setFeedBackStatus", int.class);

				method.invoke(_feedbackRemoteModel, feedBackStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusByUserId", long.class);

				method.invoke(_feedbackRemoteModel, statusByUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusByUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getStatusByUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDate", Date.class);

				method.invoke(_feedbackRemoteModel, statusDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_feedbackRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_feedbackRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_feedbackRemoteModel != null) {
			try {
				Class<?> clazz = _feedbackRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_feedbackRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public BaseModel<?> getFeedbackRemoteModel() {
		return _feedbackRemoteModel;
	}

	public void setFeedbackRemoteModel(BaseModel<?> feedbackRemoteModel) {
		_feedbackRemoteModel = feedbackRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _feedbackRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_feedbackRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			FeedbackLocalServiceUtil.addFeedback(this);
		}
		else {
			FeedbackLocalServiceUtil.updateFeedback(this);
		}
	}

	@Override
	public Feedback toEscapedModel() {
		return (Feedback)ProxyUtil.newProxyInstance(Feedback.class.getClassLoader(),
			new Class[] { Feedback.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FeedbackClp clone = new FeedbackClp();

		clone.setUuid(getUuid());
		clone.setFeedbackId(getFeedbackId());
		clone.setFeedbackDate(getFeedbackDate());
		clone.setFeedbackText(getFeedbackText());
		clone.setFeedbackSubject(getFeedbackSubject());
		clone.setFeedBackStatus(getFeedBackStatus());
		clone.setStatusByUserId(getStatusByUserId());
		clone.setStatusDate(getStatusDate());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());

		return clone;
	}

	@Override
	public int compareTo(Feedback feedback) {
		int value = 0;

		if (getFeedbackId() < feedback.getFeedbackId()) {
			value = -1;
		}
		else if (getFeedbackId() > feedback.getFeedbackId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = DateUtil.compareTo(getFeedbackDate(), feedback.getFeedbackDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FeedbackClp)) {
			return false;
		}

		FeedbackClp feedback = (FeedbackClp)obj;

		long primaryKey = feedback.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", feedbackId=");
		sb.append(getFeedbackId());
		sb.append(", feedbackDate=");
		sb.append(getFeedbackDate());
		sb.append(", feedbackText=");
		sb.append(getFeedbackText());
		sb.append(", feedbackSubject=");
		sb.append(getFeedbackSubject());
		sb.append(", feedBackStatus=");
		sb.append(getFeedBackStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.meera.workflow.db.model.Feedback");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feedbackId</column-name><column-value><![CDATA[");
		sb.append(getFeedbackId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feedbackDate</column-name><column-value><![CDATA[");
		sb.append(getFeedbackDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feedbackText</column-name><column-value><![CDATA[");
		sb.append(getFeedbackText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feedbackSubject</column-name><column-value><![CDATA[");
		sb.append(getFeedbackSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feedBackStatus</column-name><column-value><![CDATA[");
		sb.append(getFeedBackStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _feedbackRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}