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

package com.chola.mdspeak.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.mdspeak.service.ClpSerializer;
import com.chola.mdspeak.service.MdSpeaksLocalServiceUtil;

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
public class MdSpeaksClp extends BaseModelImpl<MdSpeaks> implements MdSpeaks {
	public MdSpeaksClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MdSpeaks.class;
	}

	@Override
	public String getModelClassName() {
		return MdSpeaks.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("username", getUsername());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_mdSpeaksRemoteModel != null) {
			try {
				Class<?> clazz = _mdSpeaksRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_mdSpeaksRemoteModel, Id);
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

		if (_mdSpeaksRemoteModel != null) {
			try {
				Class<?> clazz = _mdSpeaksRemoteModel.getClass();

				Method method = clazz.getMethod("setUsername", String.class);

				method.invoke(_mdSpeaksRemoteModel, username);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMdSpeaksRemoteModel() {
		return _mdSpeaksRemoteModel;
	}

	public void setMdSpeaksRemoteModel(BaseModel<?> mdSpeaksRemoteModel) {
		_mdSpeaksRemoteModel = mdSpeaksRemoteModel;
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

		Class<?> remoteModelClass = _mdSpeaksRemoteModel.getClass();

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

		Object returnValue = method.invoke(_mdSpeaksRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			MdSpeaksLocalServiceUtil.addMdSpeaks(this);
		}
		else {
			MdSpeaksLocalServiceUtil.updateMdSpeaks(this);
		}
	}

	@Override
	public MdSpeaks toEscapedModel() {
		return (MdSpeaks)ProxyUtil.newProxyInstance(MdSpeaks.class.getClassLoader(),
			new Class[] { MdSpeaks.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MdSpeaksClp clone = new MdSpeaksClp();

		clone.setId(getId());
		clone.setUsername(getUsername());

		return clone;
	}

	@Override
	public int compareTo(MdSpeaks mdSpeaks) {
		long primaryKey = mdSpeaks.getPrimaryKey();

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

		if (!(obj instanceof MdSpeaksClp)) {
			return false;
		}

		MdSpeaksClp mdSpeaks = (MdSpeaksClp)obj;

		long primaryKey = mdSpeaks.getPrimaryKey();

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

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", username=");
		sb.append(getUsername());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.chola.mdspeak.model.MdSpeaks");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>username</column-name><column-value><![CDATA[");
		sb.append(getUsername());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _username;
	private BaseModel<?> _mdSpeaksRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}