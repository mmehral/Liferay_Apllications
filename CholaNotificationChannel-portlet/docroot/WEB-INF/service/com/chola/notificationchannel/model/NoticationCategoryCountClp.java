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

package com.chola.notificationchannel.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.notificationchannel.service.ClpSerializer;
import com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class NoticationCategoryCountClp extends BaseModelImpl<NoticationCategoryCount>
	implements NoticationCategoryCount {
	public NoticationCategoryCountClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NoticationCategoryCount.class;
	}

	@Override
	public String getModelClassName() {
		return NoticationCategoryCount.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _eventId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEventId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eventId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventId", getEventId());
		attributes.put("username", getUsername());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getEventId() {
		return _eventId;
	}

	@Override
	public void setEventId(long eventId) {
		_eventId = eventId;

		if (_noticationCategoryCountRemoteModel != null) {
			try {
				Class<?> clazz = _noticationCategoryCountRemoteModel.getClass();

				Method method = clazz.getMethod("setEventId", long.class);

				method.invoke(_noticationCategoryCountRemoteModel, eventId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUsername() {
		return _username;
	}

	@Override
	public void setUsername(String username) {
		_username = username;

		if (_noticationCategoryCountRemoteModel != null) {
			try {
				Class<?> clazz = _noticationCategoryCountRemoteModel.getClass();

				Method method = clazz.getMethod("setUsername", String.class);

				method.invoke(_noticationCategoryCountRemoteModel, username);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNoticationCategoryCountRemoteModel() {
		return _noticationCategoryCountRemoteModel;
	}

	public void setNoticationCategoryCountRemoteModel(
		BaseModel<?> noticationCategoryCountRemoteModel) {
		_noticationCategoryCountRemoteModel = noticationCategoryCountRemoteModel;
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

		Class<?> remoteModelClass = _noticationCategoryCountRemoteModel.getClass();

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

		Object returnValue = method.invoke(_noticationCategoryCountRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			NoticationCategoryCountLocalServiceUtil.addNoticationCategoryCount(this);
		}
		else {
			NoticationCategoryCountLocalServiceUtil.updateNoticationCategoryCount(this);
		}
	}

	@Override
	public NoticationCategoryCount toEscapedModel() {
		return (NoticationCategoryCount)ProxyUtil.newProxyInstance(NoticationCategoryCount.class.getClassLoader(),
			new Class[] { NoticationCategoryCount.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NoticationCategoryCountClp clone = new NoticationCategoryCountClp();

		clone.setEventId(getEventId());
		clone.setUsername(getUsername());

		return clone;
	}

	@Override
	public int compareTo(NoticationCategoryCount noticationCategoryCount) {
		long primaryKey = noticationCategoryCount.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NoticationCategoryCountClp)) {
			return false;
		}

		NoticationCategoryCountClp noticationCategoryCount = (NoticationCategoryCountClp)obj;

		long primaryKey = noticationCategoryCount.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{eventId=");
		sb.append(getEventId());
		sb.append(", username=");
		sb.append(getUsername());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.chola.notificationchannel.model.NoticationCategoryCount");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eventId</column-name><column-value><![CDATA[");
		sb.append(getEventId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>username</column-name><column-value><![CDATA[");
		sb.append(getUsername());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _eventId;
	private String _username;
	private BaseModel<?> _noticationCategoryCountRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}