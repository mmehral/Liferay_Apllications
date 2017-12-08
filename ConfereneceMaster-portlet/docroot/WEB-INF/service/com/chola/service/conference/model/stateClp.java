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

package com.chola.service.conference.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.service.conference.service.ClpSerializer;
import com.chola.service.conference.service.stateLocalServiceUtil;

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
public class stateClp extends BaseModelImpl<state> implements state {
	public stateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return state.class;
	}

	@Override
	public String getModelClassName() {
		return state.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _state_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setState_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _state_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("state_id", getState_id());
		attributes.put("state_name", getState_name());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		String state_name = (String)attributes.get("state_name");

		if (state_name != null) {
			setState_name(state_name);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getState_id() {
		return _state_id;
	}

	@Override
	public void setState_id(long state_id) {
		_state_id = state_id;

		if (_stateRemoteModel != null) {
			try {
				Class<?> clazz = _stateRemoteModel.getClass();

				Method method = clazz.getMethod("setState_id", long.class);

				method.invoke(_stateRemoteModel, state_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getState_name() {
		return _state_name;
	}

	@Override
	public void setState_name(String state_name) {
		_state_name = state_name;

		if (_stateRemoteModel != null) {
			try {
				Class<?> clazz = _stateRemoteModel.getClass();

				Method method = clazz.getMethod("setState_name", String.class);

				method.invoke(_stateRemoteModel, state_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getstateRemoteModel() {
		return _stateRemoteModel;
	}

	public void setstateRemoteModel(BaseModel<?> stateRemoteModel) {
		_stateRemoteModel = stateRemoteModel;
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

		Class<?> remoteModelClass = _stateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_stateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			stateLocalServiceUtil.addstate(this);
		}
		else {
			stateLocalServiceUtil.updatestate(this);
		}
	}

	@Override
	public state toEscapedModel() {
		return (state)ProxyUtil.newProxyInstance(state.class.getClassLoader(),
			new Class[] { state.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		stateClp clone = new stateClp();

		clone.setState_id(getState_id());
		clone.setState_name(getState_name());

		return clone;
	}

	@Override
	public int compareTo(state state) {
		long primaryKey = state.getPrimaryKey();

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

		if (!(obj instanceof stateClp)) {
			return false;
		}

		stateClp state = (stateClp)obj;

		long primaryKey = state.getPrimaryKey();

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

		sb.append("{state_id=");
		sb.append(getState_id());
		sb.append(", state_name=");
		sb.append(getState_name());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.chola.service.conference.model.state");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_name</column-name><column-value><![CDATA[");
		sb.append(getState_name());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _state_id;
	private String _state_name;
	private BaseModel<?> _stateRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}