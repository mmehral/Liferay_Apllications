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
import com.chola.conferenceroombooking.service.facilitymasterLocalServiceUtil;

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
public class facilitymasterClp extends BaseModelImpl<facilitymaster>
	implements facilitymaster {
	public facilitymasterClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return facilitymaster.class;
	}

	@Override
	public String getModelClassName() {
		return facilitymaster.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _facility_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFacility_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _facility_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("facility_id", getFacility_id());
		attributes.put("facility_name", getFacility_name());
		attributes.put("facility_description", getFacility_description());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long facility_id = (Long)attributes.get("facility_id");

		if (facility_id != null) {
			setFacility_id(facility_id);
		}

		String facility_name = (String)attributes.get("facility_name");

		if (facility_name != null) {
			setFacility_name(facility_name);
		}

		String facility_description = (String)attributes.get(
				"facility_description");

		if (facility_description != null) {
			setFacility_description(facility_description);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getFacility_id() {
		return _facility_id;
	}

	@Override
	public void setFacility_id(long facility_id) {
		_facility_id = facility_id;

		if (_facilitymasterRemoteModel != null) {
			try {
				Class<?> clazz = _facilitymasterRemoteModel.getClass();

				Method method = clazz.getMethod("setFacility_id", long.class);

				method.invoke(_facilitymasterRemoteModel, facility_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFacility_name() {
		return _facility_name;
	}

	@Override
	public void setFacility_name(String facility_name) {
		_facility_name = facility_name;

		if (_facilitymasterRemoteModel != null) {
			try {
				Class<?> clazz = _facilitymasterRemoteModel.getClass();

				Method method = clazz.getMethod("setFacility_name", String.class);

				method.invoke(_facilitymasterRemoteModel, facility_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFacility_description() {
		return _facility_description;
	}

	@Override
	public void setFacility_description(String facility_description) {
		_facility_description = facility_description;

		if (_facilitymasterRemoteModel != null) {
			try {
				Class<?> clazz = _facilitymasterRemoteModel.getClass();

				Method method = clazz.getMethod("setFacility_description",
						String.class);

				method.invoke(_facilitymasterRemoteModel, facility_description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getfacilitymasterRemoteModel() {
		return _facilitymasterRemoteModel;
	}

	public void setfacilitymasterRemoteModel(
		BaseModel<?> facilitymasterRemoteModel) {
		_facilitymasterRemoteModel = facilitymasterRemoteModel;
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

		Class<?> remoteModelClass = _facilitymasterRemoteModel.getClass();

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

		Object returnValue = method.invoke(_facilitymasterRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			facilitymasterLocalServiceUtil.addfacilitymaster(this);
		}
		else {
			facilitymasterLocalServiceUtil.updatefacilitymaster(this);
		}
	}

	@Override
	public facilitymaster toEscapedModel() {
		return (facilitymaster)ProxyUtil.newProxyInstance(facilitymaster.class.getClassLoader(),
			new Class[] { facilitymaster.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		facilitymasterClp clone = new facilitymasterClp();

		clone.setFacility_id(getFacility_id());
		clone.setFacility_name(getFacility_name());
		clone.setFacility_description(getFacility_description());

		return clone;
	}

	@Override
	public int compareTo(facilitymaster facilitymaster) {
		long primaryKey = facilitymaster.getPrimaryKey();

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

		if (!(obj instanceof facilitymasterClp)) {
			return false;
		}

		facilitymasterClp facilitymaster = (facilitymasterClp)obj;

		long primaryKey = facilitymaster.getPrimaryKey();

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

		sb.append("{facility_id=");
		sb.append(getFacility_id());
		sb.append(", facility_name=");
		sb.append(getFacility_name());
		sb.append(", facility_description=");
		sb.append(getFacility_description());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.chola.conferenceroombooking.model.facilitymaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>facility_id</column-name><column-value><![CDATA[");
		sb.append(getFacility_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facility_name</column-name><column-value><![CDATA[");
		sb.append(getFacility_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facility_description</column-name><column-value><![CDATA[");
		sb.append(getFacility_description());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _facility_id;
	private String _facility_name;
	private String _facility_description;
	private BaseModel<?> _facilitymasterRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}