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
import com.chola.calendar.service.corporateeventsdataLocalServiceUtil;

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
public class corporateeventsdataClp extends BaseModelImpl<corporateeventsdata>
	implements corporateeventsdata {
	public corporateeventsdataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return corporateeventsdata.class;
	}

	@Override
	public String getModelClassName() {
		return corporateeventsdata.class.getName();
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
		attributes.put("zone", getZone());
		attributes.put("region", getRegion());
		attributes.put("location", getLocation());
		attributes.put("personincharge", getPersonincharge());
		attributes.put("schedulestartdate", getSchedulestartdate());
		attributes.put("scheduleenddate", getScheduleenddate());

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

		String zone = (String)attributes.get("zone");

		if (zone != null) {
			setZone(zone);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String personincharge = (String)attributes.get("personincharge");

		if (personincharge != null) {
			setPersonincharge(personincharge);
		}

		Date schedulestartdate = (Date)attributes.get("schedulestartdate");

		if (schedulestartdate != null) {
			setSchedulestartdate(schedulestartdate);
		}

		Date scheduleenddate = (Date)attributes.get("scheduleenddate");

		if (scheduleenddate != null) {
			setScheduleenddate(scheduleenddate);
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

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_corporateeventsdataRemoteModel, id);
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

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_corporateeventsdataRemoteModel, title);
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

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_corporateeventsdataRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getZone() {
		return _zone;
	}

	@Override
	public void setZone(String zone) {
		_zone = zone;

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setZone", String.class);

				method.invoke(_corporateeventsdataRemoteModel, zone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegion() {
		return _region;
	}

	@Override
	public void setRegion(String region) {
		_region = region;

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setRegion", String.class);

				method.invoke(_corporateeventsdataRemoteModel, region);
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

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_corporateeventsdataRemoteModel, location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPersonincharge() {
		return _personincharge;
	}

	@Override
	public void setPersonincharge(String personincharge) {
		_personincharge = personincharge;

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setPersonincharge",
						String.class);

				method.invoke(_corporateeventsdataRemoteModel, personincharge);
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

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setSchedulestartdate",
						Date.class);

				method.invoke(_corporateeventsdataRemoteModel, schedulestartdate);
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

		if (_corporateeventsdataRemoteModel != null) {
			try {
				Class<?> clazz = _corporateeventsdataRemoteModel.getClass();

				Method method = clazz.getMethod("setScheduleenddate", Date.class);

				method.invoke(_corporateeventsdataRemoteModel, scheduleenddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcorporateeventsdataRemoteModel() {
		return _corporateeventsdataRemoteModel;
	}

	public void setcorporateeventsdataRemoteModel(
		BaseModel<?> corporateeventsdataRemoteModel) {
		_corporateeventsdataRemoteModel = corporateeventsdataRemoteModel;
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

		Class<?> remoteModelClass = _corporateeventsdataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_corporateeventsdataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			corporateeventsdataLocalServiceUtil.addcorporateeventsdata(this);
		}
		else {
			corporateeventsdataLocalServiceUtil.updatecorporateeventsdata(this);
		}
	}

	@Override
	public corporateeventsdata toEscapedModel() {
		return (corporateeventsdata)ProxyUtil.newProxyInstance(corporateeventsdata.class.getClassLoader(),
			new Class[] { corporateeventsdata.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		corporateeventsdataClp clone = new corporateeventsdataClp();

		clone.setId(getId());
		clone.setTitle(getTitle());
		clone.setDescription(getDescription());
		clone.setZone(getZone());
		clone.setRegion(getRegion());
		clone.setLocation(getLocation());
		clone.setPersonincharge(getPersonincharge());
		clone.setSchedulestartdate(getSchedulestartdate());
		clone.setScheduleenddate(getScheduleenddate());

		return clone;
	}

	@Override
	public int compareTo(corporateeventsdata corporateeventsdata) {
		long primaryKey = corporateeventsdata.getPrimaryKey();

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

		if (!(obj instanceof corporateeventsdataClp)) {
			return false;
		}

		corporateeventsdataClp corporateeventsdata = (corporateeventsdataClp)obj;

		long primaryKey = corporateeventsdata.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", zone=");
		sb.append(getZone());
		sb.append(", region=");
		sb.append(getRegion());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", personincharge=");
		sb.append(getPersonincharge());
		sb.append(", schedulestartdate=");
		sb.append(getSchedulestartdate());
		sb.append(", scheduleenddate=");
		sb.append(getScheduleenddate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.chola.calendar.model.corporateeventsdata");
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
			"<column><column-name>zone</column-name><column-value><![CDATA[");
		sb.append(getZone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>region</column-name><column-value><![CDATA[");
		sb.append(getRegion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>personincharge</column-name><column-value><![CDATA[");
		sb.append(getPersonincharge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>schedulestartdate</column-name><column-value><![CDATA[");
		sb.append(getSchedulestartdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scheduleenddate</column-name><column-value><![CDATA[");
		sb.append(getScheduleenddate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _title;
	private String _description;
	private String _zone;
	private String _region;
	private String _location;
	private String _personincharge;
	private Date _schedulestartdate;
	private Date _scheduleenddate;
	private BaseModel<?> _corporateeventsdataRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}