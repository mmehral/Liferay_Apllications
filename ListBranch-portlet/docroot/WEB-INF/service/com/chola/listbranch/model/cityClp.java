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

package com.chola.listbranch.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.listbranch.service.ClpSerializer;
import com.chola.listbranch.service.cityLocalServiceUtil;

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
public class cityClp extends BaseModelImpl<city> implements city {
	public cityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return city.class;
	}

	@Override
	public String getModelClassName() {
		return city.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _city_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCity_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _city_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("city_id", getCity_id());
		attributes.put("city_name", getCity_name());
		attributes.put("state_id", getState_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long city_id = (Long)attributes.get("city_id");

		if (city_id != null) {
			setCity_id(city_id);
		}

		String city_name = (String)attributes.get("city_name");

		if (city_name != null) {
			setCity_name(city_name);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getCity_id() {
		return _city_id;
	}

	@Override
	public void setCity_id(long city_id) {
		_city_id = city_id;

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setCity_id", long.class);

				method.invoke(_cityRemoteModel, city_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCity_name() {
		return _city_name;
	}

	@Override
	public void setCity_name(String city_name) {
		_city_name = city_name;

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setCity_name", String.class);

				method.invoke(_cityRemoteModel, city_name);
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

		if (_cityRemoteModel != null) {
			try {
				Class<?> clazz = _cityRemoteModel.getClass();

				Method method = clazz.getMethod("setState_id", long.class);

				method.invoke(_cityRemoteModel, state_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcityRemoteModel() {
		return _cityRemoteModel;
	}

	public void setcityRemoteModel(BaseModel<?> cityRemoteModel) {
		_cityRemoteModel = cityRemoteModel;
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

		Class<?> remoteModelClass = _cityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			cityLocalServiceUtil.addcity(this);
		}
		else {
			cityLocalServiceUtil.updatecity(this);
		}
	}

	@Override
	public city toEscapedModel() {
		return (city)ProxyUtil.newProxyInstance(city.class.getClassLoader(),
			new Class[] { city.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		cityClp clone = new cityClp();

		clone.setCity_id(getCity_id());
		clone.setCity_name(getCity_name());
		clone.setState_id(getState_id());

		return clone;
	}

	@Override
	public int compareTo(city city) {
		long primaryKey = city.getPrimaryKey();

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

		if (!(obj instanceof cityClp)) {
			return false;
		}

		cityClp city = (cityClp)obj;

		long primaryKey = city.getPrimaryKey();

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

		sb.append("{city_id=");
		sb.append(getCity_id());
		sb.append(", city_name=");
		sb.append(getCity_name());
		sb.append(", state_id=");
		sb.append(getState_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.chola.listbranch.model.city");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>city_id</column-name><column-value><![CDATA[");
		sb.append(getCity_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city_name</column-name><column-value><![CDATA[");
		sb.append(getCity_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _city_id;
	private String _city_name;
	private long _state_id;
	private BaseModel<?> _cityRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}