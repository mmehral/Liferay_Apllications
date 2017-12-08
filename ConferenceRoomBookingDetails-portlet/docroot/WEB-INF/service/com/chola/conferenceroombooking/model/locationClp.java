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

package com.chola.conferenceroombooking.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.service.ClpSerializer;
import com.chola.conferenceroombooking.service.locationLocalServiceUtil;

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
public class locationClp extends BaseModelImpl<location> implements location {
	public locationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return location.class;
	}

	@Override
	public String getModelClassName() {
		return location.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _location_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLocation_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _location_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("location_id", getLocation_id());
		attributes.put("location_name", getLocation_name());
		attributes.put("state_id", getState_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long location_id = (Long)attributes.get("location_id");

		if (location_id != null) {
			setLocation_id(location_id);
		}

		String location_name = (String)attributes.get("location_name");

		if (location_name != null) {
			setLocation_name(location_name);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getLocation_id() {
		return _location_id;
	}

	@Override
	public void setLocation_id(long location_id) {
		_location_id = location_id;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation_id", long.class);

				method.invoke(_locationRemoteModel, location_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocation_name() {
		return _location_name;
	}

	@Override
	public void setLocation_name(String location_name) {
		_location_name = location_name;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation_name", String.class);

				method.invoke(_locationRemoteModel, location_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getState_id() {
		return _state_id;
	}

	@Override
	public void setState_id(long state_id) {
		_state_id = state_id;

		if (_locationRemoteModel != null) {
			try {
				Class<?> clazz = _locationRemoteModel.getClass();

				Method method = clazz.getMethod("setState_id", long.class);

				method.invoke(_locationRemoteModel, state_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getlocationRemoteModel() {
		return _locationRemoteModel;
	}

	public void setlocationRemoteModel(BaseModel<?> locationRemoteModel) {
		_locationRemoteModel = locationRemoteModel;
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

		Class<?> remoteModelClass = _locationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_locationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			locationLocalServiceUtil.addlocation(this);
		}
		else {
			locationLocalServiceUtil.updatelocation(this);
		}
	}

	@Override
	public location toEscapedModel() {
		return (location)ProxyUtil.newProxyInstance(location.class.getClassLoader(),
			new Class[] { location.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		locationClp clone = new locationClp();

		clone.setLocation_id(getLocation_id());
		clone.setLocation_name(getLocation_name());
		clone.setState_id(getState_id());

		return clone;
	}

	@Override
	public int compareTo(location location) {
		long primaryKey = location.getPrimaryKey();

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

		if (!(obj instanceof locationClp)) {
			return false;
		}

		locationClp location = (locationClp)obj;

		long primaryKey = location.getPrimaryKey();

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

		sb.append("{location_id=");
		sb.append(getLocation_id());
		sb.append(", location_name=");
		sb.append(getLocation_name());
		sb.append(", state_id=");
		sb.append(getState_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.chola.conferenceroombooking.model.location");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>location_id</column-name><column-value><![CDATA[");
		sb.append(getLocation_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location_name</column-name><column-value><![CDATA[");
		sb.append(getLocation_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _location_id;
	private String _location_name;
	private long _state_id;
	private BaseModel<?> _locationRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}