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

package com.chola.birthday.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.birthday.service.ClpSerializer;
import com.chola.birthday.service.birthdaywishLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class birthdaywishClp extends BaseModelImpl<birthdaywish>
	implements birthdaywish {
	public birthdaywishClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return birthdaywish.class;
	}

	@Override
	public String getModelClassName() {
		return birthdaywish.class.getName();
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
		attributes.put("wishedBy", getWishedBy());
		attributes.put("message", getMessage());
		attributes.put("createdDate", getCreatedDate());

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

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String wishedBy = (String)attributes.get("wishedBy");

		if (wishedBy != null) {
			setWishedBy(wishedBy);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
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

		if (_birthdaywishRemoteModel != null) {
			try {
				Class<?> clazz = _birthdaywishRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_birthdaywishRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(String userId) {
		_userId = userId;

		if (_birthdaywishRemoteModel != null) {
			try {
				Class<?> clazz = _birthdaywishRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", String.class);

				method.invoke(_birthdaywishRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWishedBy() {
		return _wishedBy;
	}

	@Override
	public void setWishedBy(String wishedBy) {
		_wishedBy = wishedBy;

		if (_birthdaywishRemoteModel != null) {
			try {
				Class<?> clazz = _birthdaywishRemoteModel.getClass();

				Method method = clazz.getMethod("setWishedBy", String.class);

				method.invoke(_birthdaywishRemoteModel, wishedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMessage() {
		return _message;
	}

	@Override
	public void setMessage(String message) {
		_message = message;

		if (_birthdaywishRemoteModel != null) {
			try {
				Class<?> clazz = _birthdaywishRemoteModel.getClass();

				Method method = clazz.getMethod("setMessage", String.class);

				method.invoke(_birthdaywishRemoteModel, message);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_birthdaywishRemoteModel != null) {
			try {
				Class<?> clazz = _birthdaywishRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_birthdaywishRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbirthdaywishRemoteModel() {
		return _birthdaywishRemoteModel;
	}

	public void setbirthdaywishRemoteModel(BaseModel<?> birthdaywishRemoteModel) {
		_birthdaywishRemoteModel = birthdaywishRemoteModel;
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

		Class<?> remoteModelClass = _birthdaywishRemoteModel.getClass();

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

		Object returnValue = method.invoke(_birthdaywishRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			birthdaywishLocalServiceUtil.addbirthdaywish(this);
		}
		else {
			birthdaywishLocalServiceUtil.updatebirthdaywish(this);
		}
	}

	@Override
	public birthdaywish toEscapedModel() {
		return (birthdaywish)ProxyUtil.newProxyInstance(birthdaywish.class.getClassLoader(),
			new Class[] { birthdaywish.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		birthdaywishClp clone = new birthdaywishClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setWishedBy(getWishedBy());
		clone.setMessage(getMessage());
		clone.setCreatedDate(getCreatedDate());

		return clone;
	}

	@Override
	public int compareTo(birthdaywish birthdaywish) {
		long primaryKey = birthdaywish.getPrimaryKey();

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

		if (!(obj instanceof birthdaywishClp)) {
			return false;
		}

		birthdaywishClp birthdaywish = (birthdaywishClp)obj;

		long primaryKey = birthdaywish.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", wishedBy=");
		sb.append(getWishedBy());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.chola.birthday.model.birthdaywish");
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
			"<column><column-name>wishedBy</column-name><column-value><![CDATA[");
		sb.append(getWishedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _userId;
	private String _wishedBy;
	private String _message;
	private Date _createdDate;
	private BaseModel<?> _birthdaywishRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}