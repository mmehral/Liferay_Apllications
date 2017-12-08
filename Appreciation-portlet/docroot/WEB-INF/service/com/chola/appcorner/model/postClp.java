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

package com.chola.appcorner.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.appcorner.service.ClpSerializer;
import com.chola.appcorner.service.postLocalServiceUtil;

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
public class postClp extends BaseModelImpl<post> implements post {
	public postClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return post.class;
	}

	@Override
	public String getModelClassName() {
		return post.class.getName();
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
		attributes.put("appTo", getAppTo());
		attributes.put("appBy", getAppBy());
		attributes.put("appMessage", getAppMessage());
		attributes.put("appDate", getAppDate());

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

		Long appTo = (Long)attributes.get("appTo");

		if (appTo != null) {
			setAppTo(appTo);
		}

		Long appBy = (Long)attributes.get("appBy");

		if (appBy != null) {
			setAppBy(appBy);
		}

		String appMessage = (String)attributes.get("appMessage");

		if (appMessage != null) {
			setAppMessage(appMessage);
		}

		String appDate = (String)attributes.get("appDate");

		if (appDate != null) {
			setAppDate(appDate);
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

		if (_postRemoteModel != null) {
			try {
				Class<?> clazz = _postRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_postRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAppTo() {
		return _appTo;
	}

	@Override
	public void setAppTo(long appTo) {
		_appTo = appTo;

		if (_postRemoteModel != null) {
			try {
				Class<?> clazz = _postRemoteModel.getClass();

				Method method = clazz.getMethod("setAppTo", long.class);

				method.invoke(_postRemoteModel, appTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAppBy() {
		return _appBy;
	}

	@Override
	public void setAppBy(long appBy) {
		_appBy = appBy;

		if (_postRemoteModel != null) {
			try {
				Class<?> clazz = _postRemoteModel.getClass();

				Method method = clazz.getMethod("setAppBy", long.class);

				method.invoke(_postRemoteModel, appBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppMessage() {
		return _appMessage;
	}

	@Override
	public void setAppMessage(String appMessage) {
		_appMessage = appMessage;

		if (_postRemoteModel != null) {
			try {
				Class<?> clazz = _postRemoteModel.getClass();

				Method method = clazz.getMethod("setAppMessage", String.class);

				method.invoke(_postRemoteModel, appMessage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAppDate() {
		return _appDate;
	}

	@Override
	public void setAppDate(String appDate) {
		_appDate = appDate;

		if (_postRemoteModel != null) {
			try {
				Class<?> clazz = _postRemoteModel.getClass();

				Method method = clazz.getMethod("setAppDate", String.class);

				method.invoke(_postRemoteModel, appDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getpostRemoteModel() {
		return _postRemoteModel;
	}

	public void setpostRemoteModel(BaseModel<?> postRemoteModel) {
		_postRemoteModel = postRemoteModel;
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

		Class<?> remoteModelClass = _postRemoteModel.getClass();

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

		Object returnValue = method.invoke(_postRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			postLocalServiceUtil.addpost(this);
		}
		else {
			postLocalServiceUtil.updatepost(this);
		}
	}

	@Override
	public post toEscapedModel() {
		return (post)ProxyUtil.newProxyInstance(post.class.getClassLoader(),
			new Class[] { post.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		postClp clone = new postClp();

		clone.setId(getId());
		clone.setAppTo(getAppTo());
		clone.setAppBy(getAppBy());
		clone.setAppMessage(getAppMessage());
		clone.setAppDate(getAppDate());

		return clone;
	}

	@Override
	public int compareTo(post post) {
		long primaryKey = post.getPrimaryKey();

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

		if (!(obj instanceof postClp)) {
			return false;
		}

		postClp post = (postClp)obj;

		long primaryKey = post.getPrimaryKey();

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
		sb.append(", appTo=");
		sb.append(getAppTo());
		sb.append(", appBy=");
		sb.append(getAppBy());
		sb.append(", appMessage=");
		sb.append(getAppMessage());
		sb.append(", appDate=");
		sb.append(getAppDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.chola.appcorner.model.post");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appTo</column-name><column-value><![CDATA[");
		sb.append(getAppTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appBy</column-name><column-value><![CDATA[");
		sb.append(getAppBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appMessage</column-name><column-value><![CDATA[");
		sb.append(getAppMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appDate</column-name><column-value><![CDATA[");
		sb.append(getAppDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _appTo;
	private long _appBy;
	private String _appMessage;
	private String _appDate;
	private BaseModel<?> _postRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}