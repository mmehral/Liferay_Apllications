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

package com.chola.feedforward.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.feedforward.service.ClpSerializer;
import com.chola.feedforward.service.feedforwardgalleryusersLocalServiceUtil;

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
public class feedforwardgalleryusersClp extends BaseModelImpl<feedforwardgalleryusers>
	implements feedforwardgalleryusers {
	public feedforwardgalleryusersClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return feedforwardgalleryusers.class;
	}

	@Override
	public String getModelClassName() {
		return feedforwardgalleryusers.class.getName();
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
		attributes.put("user_id", getUser_id());
		attributes.put("album_id", getAlbum_id());

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

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long album_id = (Long)attributes.get("album_id");

		if (album_id != null) {
			setAlbum_id(album_id);
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

		if (_feedforwardgalleryusersRemoteModel != null) {
			try {
				Class<?> clazz = _feedforwardgalleryusersRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_feedforwardgalleryusersRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUser_id() {
		return _user_id;
	}

	@Override
	public void setUser_id(long user_id) {
		_user_id = user_id;

		if (_feedforwardgalleryusersRemoteModel != null) {
			try {
				Class<?> clazz = _feedforwardgalleryusersRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", long.class);

				method.invoke(_feedforwardgalleryusersRemoteModel, user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAlbum_id() {
		return _album_id;
	}

	@Override
	public void setAlbum_id(long album_id) {
		_album_id = album_id;

		if (_feedforwardgalleryusersRemoteModel != null) {
			try {
				Class<?> clazz = _feedforwardgalleryusersRemoteModel.getClass();

				Method method = clazz.getMethod("setAlbum_id", long.class);

				method.invoke(_feedforwardgalleryusersRemoteModel, album_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getfeedforwardgalleryusersRemoteModel() {
		return _feedforwardgalleryusersRemoteModel;
	}

	public void setfeedforwardgalleryusersRemoteModel(
		BaseModel<?> feedforwardgalleryusersRemoteModel) {
		_feedforwardgalleryusersRemoteModel = feedforwardgalleryusersRemoteModel;
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

		Class<?> remoteModelClass = _feedforwardgalleryusersRemoteModel.getClass();

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

		Object returnValue = method.invoke(_feedforwardgalleryusersRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			feedforwardgalleryusersLocalServiceUtil.addfeedforwardgalleryusers(this);
		}
		else {
			feedforwardgalleryusersLocalServiceUtil.updatefeedforwardgalleryusers(this);
		}
	}

	@Override
	public feedforwardgalleryusers toEscapedModel() {
		return (feedforwardgalleryusers)ProxyUtil.newProxyInstance(feedforwardgalleryusers.class.getClassLoader(),
			new Class[] { feedforwardgalleryusers.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		feedforwardgalleryusersClp clone = new feedforwardgalleryusersClp();

		clone.setId(getId());
		clone.setUser_id(getUser_id());
		clone.setAlbum_id(getAlbum_id());

		return clone;
	}

	@Override
	public int compareTo(feedforwardgalleryusers feedforwardgalleryusers) {
		long primaryKey = feedforwardgalleryusers.getPrimaryKey();

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

		if (!(obj instanceof feedforwardgalleryusersClp)) {
			return false;
		}

		feedforwardgalleryusersClp feedforwardgalleryusers = (feedforwardgalleryusersClp)obj;

		long primaryKey = feedforwardgalleryusers.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", album_id=");
		sb.append(getAlbum_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.chola.feedforward.model.feedforwardgalleryusers");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>album_id</column-name><column-value><![CDATA[");
		sb.append(getAlbum_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _user_id;
	private long _album_id;
	private BaseModel<?> _feedforwardgalleryusersRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}