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

package com.chola.swagatam.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.service.ClpSerializer;
import com.chola.swagatam.service.swagatamdataLocalServiceUtil;

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
public class swagatamdataClp extends BaseModelImpl<swagatamdata>
	implements swagatamdata {
	public swagatamdataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return swagatamdata.class;
	}

	@Override
	public String getModelClassName() {
		return swagatamdata.class.getName();
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
		attributes.put("empId", getEmpId());
		attributes.put("watched", getWatched());
		attributes.put("acknowledged", getAcknowledged());

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

		String empId = (String)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String watched = (String)attributes.get("watched");

		if (watched != null) {
			setWatched(watched);
		}

		String acknowledged = (String)attributes.get("acknowledged");

		if (acknowledged != null) {
			setAcknowledged(acknowledged);
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

		if (_swagatamdataRemoteModel != null) {
			try {
				Class<?> clazz = _swagatamdataRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_swagatamdataRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmpId() {
		return _empId;
	}

	@Override
	public void setEmpId(String empId) {
		_empId = empId;

		if (_swagatamdataRemoteModel != null) {
			try {
				Class<?> clazz = _swagatamdataRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpId", String.class);

				method.invoke(_swagatamdataRemoteModel, empId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWatched() {
		return _watched;
	}

	@Override
	public void setWatched(String watched) {
		_watched = watched;

		if (_swagatamdataRemoteModel != null) {
			try {
				Class<?> clazz = _swagatamdataRemoteModel.getClass();

				Method method = clazz.getMethod("setWatched", String.class);

				method.invoke(_swagatamdataRemoteModel, watched);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAcknowledged() {
		return _acknowledged;
	}

	@Override
	public void setAcknowledged(String acknowledged) {
		_acknowledged = acknowledged;

		if (_swagatamdataRemoteModel != null) {
			try {
				Class<?> clazz = _swagatamdataRemoteModel.getClass();

				Method method = clazz.getMethod("setAcknowledged", String.class);

				method.invoke(_swagatamdataRemoteModel, acknowledged);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getswagatamdataRemoteModel() {
		return _swagatamdataRemoteModel;
	}

	public void setswagatamdataRemoteModel(BaseModel<?> swagatamdataRemoteModel) {
		_swagatamdataRemoteModel = swagatamdataRemoteModel;
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

		Class<?> remoteModelClass = _swagatamdataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_swagatamdataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			swagatamdataLocalServiceUtil.addswagatamdata(this);
		}
		else {
			swagatamdataLocalServiceUtil.updateswagatamdata(this);
		}
	}

	@Override
	public swagatamdata toEscapedModel() {
		return (swagatamdata)ProxyUtil.newProxyInstance(swagatamdata.class.getClassLoader(),
			new Class[] { swagatamdata.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		swagatamdataClp clone = new swagatamdataClp();

		clone.setId(getId());
		clone.setEmpId(getEmpId());
		clone.setWatched(getWatched());
		clone.setAcknowledged(getAcknowledged());

		return clone;
	}

	@Override
	public int compareTo(swagatamdata swagatamdata) {
		long primaryKey = swagatamdata.getPrimaryKey();

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

		if (!(obj instanceof swagatamdataClp)) {
			return false;
		}

		swagatamdataClp swagatamdata = (swagatamdataClp)obj;

		long primaryKey = swagatamdata.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", empId=");
		sb.append(getEmpId());
		sb.append(", watched=");
		sb.append(getWatched());
		sb.append(", acknowledged=");
		sb.append(getAcknowledged());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.chola.swagatam.model.swagatamdata");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empId</column-name><column-value><![CDATA[");
		sb.append(getEmpId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>watched</column-name><column-value><![CDATA[");
		sb.append(getWatched());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acknowledged</column-name><column-value><![CDATA[");
		sb.append(getAcknowledged());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _empId;
	private String _watched;
	private String _acknowledged;
	private BaseModel<?> _swagatamdataRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}