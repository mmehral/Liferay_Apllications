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
import com.chola.service.conference.service.floorwingLocalServiceUtil;

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
public class floorwingClp extends BaseModelImpl<floorwing> implements floorwing {
	public floorwingClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return floorwing.class;
	}

	@Override
	public String getModelClassName() {
		return floorwing.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _floorwing_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFloorwing_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _floorwing_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("floorwing_id", getFloorwing_id());
		attributes.put("state_id", getState_id());
		attributes.put("location_id", getLocation_id());
		attributes.put("floor_name", getFloor_name());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long floorwing_id = (Long)attributes.get("floorwing_id");

		if (floorwing_id != null) {
			setFloorwing_id(floorwing_id);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Long location_id = (Long)attributes.get("location_id");

		if (location_id != null) {
			setLocation_id(location_id);
		}

		String floor_name = (String)attributes.get("floor_name");

		if (floor_name != null) {
			setFloor_name(floor_name);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getFloorwing_id() {
		return _floorwing_id;
	}

	@Override
	public void setFloorwing_id(long floorwing_id) {
		_floorwing_id = floorwing_id;

		if (_floorwingRemoteModel != null) {
			try {
				Class<?> clazz = _floorwingRemoteModel.getClass();

				Method method = clazz.getMethod("setFloorwing_id", long.class);

				method.invoke(_floorwingRemoteModel, floorwing_id);
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

		if (_floorwingRemoteModel != null) {
			try {
				Class<?> clazz = _floorwingRemoteModel.getClass();

				Method method = clazz.getMethod("setState_id", long.class);

				method.invoke(_floorwingRemoteModel, state_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLocation_id() {
		return _location_id;
	}

	@Override
	public void setLocation_id(long location_id) {
		_location_id = location_id;

		if (_floorwingRemoteModel != null) {
			try {
				Class<?> clazz = _floorwingRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation_id", long.class);

				method.invoke(_floorwingRemoteModel, location_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFloor_name() {
		return _floor_name;
	}

	@Override
	public void setFloor_name(String floor_name) {
		_floor_name = floor_name;

		if (_floorwingRemoteModel != null) {
			try {
				Class<?> clazz = _floorwingRemoteModel.getClass();

				Method method = clazz.getMethod("setFloor_name", String.class);

				method.invoke(_floorwingRemoteModel, floor_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getfloorwingRemoteModel() {
		return _floorwingRemoteModel;
	}

	public void setfloorwingRemoteModel(BaseModel<?> floorwingRemoteModel) {
		_floorwingRemoteModel = floorwingRemoteModel;
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

		Class<?> remoteModelClass = _floorwingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_floorwingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			floorwingLocalServiceUtil.addfloorwing(this);
		}
		else {
			floorwingLocalServiceUtil.updatefloorwing(this);
		}
	}

	@Override
	public floorwing toEscapedModel() {
		return (floorwing)ProxyUtil.newProxyInstance(floorwing.class.getClassLoader(),
			new Class[] { floorwing.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		floorwingClp clone = new floorwingClp();

		clone.setFloorwing_id(getFloorwing_id());
		clone.setState_id(getState_id());
		clone.setLocation_id(getLocation_id());
		clone.setFloor_name(getFloor_name());

		return clone;
	}

	@Override
	public int compareTo(floorwing floorwing) {
		long primaryKey = floorwing.getPrimaryKey();

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

		if (!(obj instanceof floorwingClp)) {
			return false;
		}

		floorwingClp floorwing = (floorwingClp)obj;

		long primaryKey = floorwing.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{floorwing_id=");
		sb.append(getFloorwing_id());
		sb.append(", state_id=");
		sb.append(getState_id());
		sb.append(", location_id=");
		sb.append(getLocation_id());
		sb.append(", floor_name=");
		sb.append(getFloor_name());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.chola.service.conference.model.floorwing");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>floorwing_id</column-name><column-value><![CDATA[");
		sb.append(getFloorwing_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location_id</column-name><column-value><![CDATA[");
		sb.append(getLocation_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>floor_name</column-name><column-value><![CDATA[");
		sb.append(getFloor_name());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _floorwing_id;
	private long _state_id;
	private long _location_id;
	private String _floor_name;
	private BaseModel<?> _floorwingRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}