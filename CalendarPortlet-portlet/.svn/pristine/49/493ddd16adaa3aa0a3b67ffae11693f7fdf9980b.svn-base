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

package com.chola.calendar.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.service.ClpSerializer;
import com.chola.calendar.service.eventcalendarLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.DateUtil;
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
public class eventcalendarClp extends BaseModelImpl<eventcalendar>
	implements eventcalendar {
	public eventcalendarClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return eventcalendar.class;
	}

	@Override
	public String getModelClassName() {
		return eventcalendar.class.getName();
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
		attributes.put("name", getName());
		attributes.put("startdate", getStartdate());
		attributes.put("enddate", getEnddate());
		attributes.put("color", getColor());
		attributes.put("url", getUrl());
		attributes.put("userid", getUserid());

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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date startdate = (Date)attributes.get("startdate");

		if (startdate != null) {
			setStartdate(startdate);
		}

		Date enddate = (Date)attributes.get("enddate");

		if (enddate != null) {
			setEnddate(enddate);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String userid = (String)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
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

		if (_eventcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _eventcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_eventcalendarRemoteModel, id);
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

		if (_eventcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _eventcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_eventcalendarRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartdate() {
		return _startdate;
	}

	@Override
	public void setStartdate(Date startdate) {
		_startdate = startdate;

		if (_eventcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _eventcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setStartdate", Date.class);

				method.invoke(_eventcalendarRemoteModel, startdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEnddate() {
		return _enddate;
	}

	@Override
	public void setEnddate(Date enddate) {
		_enddate = enddate;

		if (_eventcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _eventcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setEnddate", Date.class);

				method.invoke(_eventcalendarRemoteModel, enddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getColor() {
		return _color;
	}

	@Override
	public void setColor(String color) {
		_color = color;

		if (_eventcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _eventcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setColor", String.class);

				method.invoke(_eventcalendarRemoteModel, color);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_eventcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _eventcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_eventcalendarRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserid() {
		return _userid;
	}

	@Override
	public void setUserid(String userid) {
		_userid = userid;

		if (_eventcalendarRemoteModel != null) {
			try {
				Class<?> clazz = _eventcalendarRemoteModel.getClass();

				Method method = clazz.getMethod("setUserid", String.class);

				method.invoke(_eventcalendarRemoteModel, userid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> geteventcalendarRemoteModel() {
		return _eventcalendarRemoteModel;
	}

	public void seteventcalendarRemoteModel(
		BaseModel<?> eventcalendarRemoteModel) {
		_eventcalendarRemoteModel = eventcalendarRemoteModel;
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

		Class<?> remoteModelClass = _eventcalendarRemoteModel.getClass();

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

		Object returnValue = method.invoke(_eventcalendarRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			eventcalendarLocalServiceUtil.addeventcalendar(this);
		}
		else {
			eventcalendarLocalServiceUtil.updateeventcalendar(this);
		}
	}

	@Override
	public eventcalendar toEscapedModel() {
		return (eventcalendar)ProxyUtil.newProxyInstance(eventcalendar.class.getClassLoader(),
			new Class[] { eventcalendar.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		eventcalendarClp clone = new eventcalendarClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setStartdate(getStartdate());
		clone.setEnddate(getEnddate());
		clone.setColor(getColor());
		clone.setUrl(getUrl());
		clone.setUserid(getUserid());

		return clone;
	}

	@Override
	public int compareTo(eventcalendar eventcalendar) {
		int value = 0;

		value = getName().compareTo(eventcalendar.getName());

		if (value != 0) {
			return value;
		}

		value = DateUtil.compareTo(getStartdate(), eventcalendar.getStartdate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof eventcalendarClp)) {
			return false;
		}

		eventcalendarClp eventcalendar = (eventcalendarClp)obj;

		long primaryKey = eventcalendar.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", startdate=");
		sb.append(getStartdate());
		sb.append(", enddate=");
		sb.append(getEnddate());
		sb.append(", color=");
		sb.append(getColor());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.chola.calendar.model.eventcalendar");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startdate</column-name><column-value><![CDATA[");
		sb.append(getStartdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enddate</column-name><column-value><![CDATA[");
		sb.append(getEnddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>color</column-name><column-value><![CDATA[");
		sb.append(getColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _name;
	private Date _startdate;
	private Date _enddate;
	private String _color;
	private String _url;
	private String _userid;
	private BaseModel<?> _eventcalendarRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}