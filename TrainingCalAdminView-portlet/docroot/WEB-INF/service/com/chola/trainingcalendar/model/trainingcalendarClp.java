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

package com.chola.trainingcalendar.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.service.ClpSerializer;
import com.chola.trainingcalendar.service.trainingcalendarLocalServiceUtil;

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
public class trainingcalendarClp extends BaseModelImpl<trainingcalendar>
	implements trainingcalendar {
	public trainingcalendarClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return trainingcalendar.class;
	}

	@Override
	public String getModelClassName() {
		return trainingcalendar.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _trainingid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTrainingid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _trainingid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trainingid", getTrainingid());
		attributes.put("name", getName());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long trainingid = (Long)attributes.get("trainingid");

		if (trainingid != null) {
			setTrainingid(trainingid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getTrainingid() {
		return _trainingid;
	}

	@Override
	public void setTrainingid(long trainingid) {
		_trainingid = trainingid;

		if (_trainingcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setTrainingid", long.class);

				method.invoke(_trainingcalendarRemoteModel, trainingid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_trainingcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_trainingcalendarRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gettrainingcalendarRemoteModel() {
		return _trainingcalendarRemoteModel;
	}

	public void settrainingcalendarRemoteModel(
		BaseModel<?> trainingcalendarRemoteModel) {
		_trainingcalendarRemoteModel = trainingcalendarRemoteModel;
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

		Class<?> remoteModelClass = _trainingcalendarRemoteModel.getClass();

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

		Object returnValue = method.invoke(_trainingcalendarRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			trainingcalendarLocalServiceUtil.addtrainingcalendar(this);
		}
		else {
			trainingcalendarLocalServiceUtil.updatetrainingcalendar(this);
		}
	}

	@Override
	public trainingcalendar toEscapedModel() {
		return (trainingcalendar)ProxyUtil.newProxyInstance(trainingcalendar.class.getClassLoader(),
			new Class[] { trainingcalendar.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		trainingcalendarClp clone = new trainingcalendarClp();

		clone.setTrainingid(getTrainingid());
		clone.setName(getName());

		return clone;
	}

	@Override
	public int compareTo(trainingcalendar trainingcalendar) {
		long primaryKey = trainingcalendar.getPrimaryKey();

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

		if (!(obj instanceof trainingcalendarClp)) {
			return false;
		}

		trainingcalendarClp trainingcalendar = (trainingcalendarClp)obj;

		long primaryKey = trainingcalendar.getPrimaryKey();

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

		sb.append("{trainingid=");
		sb.append(getTrainingid());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.chola.trainingcalendar.model.trainingcalendar");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>trainingid</column-name><column-value><![CDATA[");
		sb.append(getTrainingid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _trainingid;
	private String _name;
	private BaseModel<?> _trainingcalendarRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}