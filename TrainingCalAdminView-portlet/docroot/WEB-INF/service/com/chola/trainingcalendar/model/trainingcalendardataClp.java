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
import com.chola.trainingcalendar.service.trainingcalendardataLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class trainingcalendardataClp extends BaseModelImpl<trainingcalendardata>
	implements trainingcalendardata {
	public trainingcalendardataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return trainingcalendardata.class;
	}

	@Override
	public String getModelClassName() {
		return trainingcalendardata.class.getName();
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
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("schedulestartdate", getSchedulestartdate());
		attributes.put("scheduleenddate", getScheduleenddate());
		attributes.put("location", getLocation());

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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date schedulestartdate = (Date)attributes.get("schedulestartdate");

		if (schedulestartdate != null) {
			setSchedulestartdate(schedulestartdate);
		}

		Date scheduleenddate = (Date)attributes.get("scheduleenddate");

		if (scheduleenddate != null) {
			setScheduleenddate(scheduleenddate);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
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

		if (_trainingcalendardataRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcalendardataRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_trainingcalendardataRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_trainingcalendardataRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcalendardataRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_trainingcalendardataRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_trainingcalendardataRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcalendardataRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_trainingcalendardataRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSchedulestartdate() {
		return _schedulestartdate;
	}

	@Override
	public void setSchedulestartdate(Date schedulestartdate) {
		_schedulestartdate = schedulestartdate;

		if (_trainingcalendardataRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcalendardataRemoteModel.getClass();

				Method method = clazz.getMethod("setSchedulestartdate",
						Date.class);

				method.invoke(_trainingcalendardataRemoteModel,
					schedulestartdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getScheduleenddate() {
		return _scheduleenddate;
	}

	@Override
	public void setScheduleenddate(Date scheduleenddate) {
		_scheduleenddate = scheduleenddate;

		if (_trainingcalendardataRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcalendardataRemoteModel.getClass();

				Method method = clazz.getMethod("setScheduleenddate", Date.class);

				method.invoke(_trainingcalendardataRemoteModel, scheduleenddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocation() {
		return _location;
	}

	@Override
	public void setLocation(String location) {
		_location = location;

		if (_trainingcalendardataRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcalendardataRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_trainingcalendardataRemoteModel, location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gettrainingcalendardataRemoteModel() {
		return _trainingcalendardataRemoteModel;
	}

	public void settrainingcalendardataRemoteModel(
		BaseModel<?> trainingcalendardataRemoteModel) {
		_trainingcalendardataRemoteModel = trainingcalendardataRemoteModel;
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

		Class<?> remoteModelClass = _trainingcalendardataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_trainingcalendardataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			trainingcalendardataLocalServiceUtil.addtrainingcalendardata(this);
		}
		else {
			trainingcalendardataLocalServiceUtil.updatetrainingcalendardata(this);
		}
	}

	@Override
	public trainingcalendardata toEscapedModel() {
		return (trainingcalendardata)ProxyUtil.newProxyInstance(trainingcalendardata.class.getClassLoader(),
			new Class[] { trainingcalendardata.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		trainingcalendardataClp clone = new trainingcalendardataClp();

		clone.setId(getId());
		clone.setTitle(getTitle());
		clone.setDescription(getDescription());
		clone.setSchedulestartdate(getSchedulestartdate());
		clone.setScheduleenddate(getScheduleenddate());
		clone.setLocation(getLocation());

		return clone;
	}

	@Override
	public int compareTo(trainingcalendardata trainingcalendardata) {
		long primaryKey = trainingcalendardata.getPrimaryKey();

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

		if (!(obj instanceof trainingcalendardataClp)) {
			return false;
		}

		trainingcalendardataClp trainingcalendardata = (trainingcalendardataClp)obj;

		long primaryKey = trainingcalendardata.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", schedulestartdate=");
		sb.append(getSchedulestartdate());
		sb.append(", scheduleenddate=");
		sb.append(getScheduleenddate());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.chola.trainingcalendar.model.trainingcalendardata");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>schedulestartdate</column-name><column-value><![CDATA[");
		sb.append(getSchedulestartdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scheduleenddate</column-name><column-value><![CDATA[");
		sb.append(getScheduleenddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _title;
	private String _description;
	private Date _schedulestartdate;
	private Date _scheduleenddate;
	private String _location;
	private BaseModel<?> _trainingcalendardataRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}