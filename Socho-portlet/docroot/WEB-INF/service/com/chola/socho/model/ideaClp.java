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

package com.chola.socho.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.socho.service.ClpSerializer;
import com.chola.socho.service.ideaLocalServiceUtil;

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

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class ideaClp extends BaseModelImpl<idea> implements idea {
	public ideaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return idea.class;
	}

	@Override
	public String getModelClassName() {
		return idea.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("topic", getTopic());
		attributes.put("sharedIdea", getSharedIdea());
		attributes.put("sharedFile", getSharedFile());
		attributes.put("sharedDate", getSharedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String topic = (String)attributes.get("topic");

		if (topic != null) {
			setTopic(topic);
		}

		String sharedIdea = (String)attributes.get("sharedIdea");

		if (sharedIdea != null) {
			setSharedIdea(sharedIdea);
		}

		String sharedFile = (String)attributes.get("sharedFile");

		if (sharedFile != null) {
			setSharedFile(sharedFile);
		}

		Date sharedDate = (Date)attributes.get("sharedDate");

		if (sharedDate != null) {
			setSharedDate(sharedDate);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_ideaRemoteModel != null) {
			try {
				Class<?> clazz = _ideaRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_ideaRemoteModel, id);
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

		if (_ideaRemoteModel != null) {
			try {
				Class<?> clazz = _ideaRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_ideaRemoteModel, userId);
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

	@Override
	public String getTopic() {
		return _topic;
	}

	@Override
	public void setTopic(String topic) {
		_topic = topic;

		if (_ideaRemoteModel != null) {
			try {
				Class<?> clazz = _ideaRemoteModel.getClass();

				Method method = clazz.getMethod("setTopic", String.class);

				method.invoke(_ideaRemoteModel, topic);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSharedIdea() {
		return _sharedIdea;
	}

	@Override
	public void setSharedIdea(String sharedIdea) {
		_sharedIdea = sharedIdea;

		if (_ideaRemoteModel != null) {
			try {
				Class<?> clazz = _ideaRemoteModel.getClass();

				Method method = clazz.getMethod("setSharedIdea", String.class);

				method.invoke(_ideaRemoteModel, sharedIdea);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSharedFile() {
		return _sharedFile;
	}

	@Override
	public void setSharedFile(String sharedFile) {
		_sharedFile = sharedFile;

		if (_ideaRemoteModel != null) {
			try {
				Class<?> clazz = _ideaRemoteModel.getClass();

				Method method = clazz.getMethod("setSharedFile", String.class);

				method.invoke(_ideaRemoteModel, sharedFile);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSharedDate() {
		return _sharedDate;
	}

	@Override
	public void setSharedDate(Date sharedDate) {
		_sharedDate = sharedDate;

		if (_ideaRemoteModel != null) {
			try {
				Class<?> clazz = _ideaRemoteModel.getClass();

				Method method = clazz.getMethod("setSharedDate", Date.class);

				method.invoke(_ideaRemoteModel, sharedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getideaRemoteModel() {
		return _ideaRemoteModel;
	}

	public void setideaRemoteModel(BaseModel<?> ideaRemoteModel) {
		_ideaRemoteModel = ideaRemoteModel;
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

		Class<?> remoteModelClass = _ideaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_ideaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			ideaLocalServiceUtil.addidea(this);
		}
		else {
			ideaLocalServiceUtil.updateidea(this);
		}
	}

	@Override
	public idea toEscapedModel() {
		return (idea)ProxyUtil.newProxyInstance(idea.class.getClassLoader(),
			new Class[] { idea.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ideaClp clone = new ideaClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setTopic(getTopic());
		clone.setSharedIdea(getSharedIdea());
		clone.setSharedFile(getSharedFile());
		clone.setSharedDate(getSharedDate());

		return clone;
	}

	@Override
	public int compareTo(idea idea) {
		int value = 0;

		value = DateUtil.compareTo(getSharedDate(), idea.getSharedDate());

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

		if (!(obj instanceof ideaClp)) {
			return false;
		}

		ideaClp idea = (ideaClp)obj;

		long primaryKey = idea.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", topic=");
		sb.append(getTopic());
		sb.append(", sharedIdea=");
		sb.append(getSharedIdea());
		sb.append(", sharedFile=");
		sb.append(getSharedFile());
		sb.append(", sharedDate=");
		sb.append(getSharedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.chola.socho.model.idea");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>topic</column-name><column-value><![CDATA[");
		sb.append(getTopic());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sharedIdea</column-name><column-value><![CDATA[");
		sb.append(getSharedIdea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sharedFile</column-name><column-value><![CDATA[");
		sb.append(getSharedFile());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sharedDate</column-name><column-value><![CDATA[");
		sb.append(getSharedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _topic;
	private String _sharedIdea;
	private String _sharedFile;
	private Date _sharedDate;
	private BaseModel<?> _ideaRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}