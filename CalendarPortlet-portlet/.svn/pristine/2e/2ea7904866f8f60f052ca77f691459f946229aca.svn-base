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
import com.chola.calendar.service.dataLocalServiceUtil;

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
public class dataClp extends BaseModelImpl<data> implements data {
	public dataClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return data.class;
	}

	@Override
	public String getModelClassName() {
		return data.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _eventid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEventid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eventid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventid", getEventid());
		attributes.put("eventdetails", getEventdetails());
		attributes.put("eventfrom", getEventfrom());
		attributes.put("eventto", getEventto());
		attributes.put("location", getLocation());
		attributes.put("dept", getDept());
		attributes.put("subdept", getSubdept());
		attributes.put("grade", getGrade());
		attributes.put("age", getAge());
		attributes.put("companyname", getCompanyname());
		attributes.put("userid", getUserid());
		attributes.put("gender", getGender());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventid = (Long)attributes.get("eventid");

		if (eventid != null) {
			setEventid(eventid);
		}

		String eventdetails = (String)attributes.get("eventdetails");

		if (eventdetails != null) {
			setEventdetails(eventdetails);
		}

		String eventfrom = (String)attributes.get("eventfrom");

		if (eventfrom != null) {
			setEventfrom(eventfrom);
		}

		String eventto = (String)attributes.get("eventto");

		if (eventto != null) {
			setEventto(eventto);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String dept = (String)attributes.get("dept");

		if (dept != null) {
			setDept(dept);
		}

		String subdept = (String)attributes.get("subdept");

		if (subdept != null) {
			setSubdept(subdept);
		}

		String grade = (String)attributes.get("grade");

		if (grade != null) {
			setGrade(grade);
		}

		String age = (String)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		String companyname = (String)attributes.get("companyname");

		if (companyname != null) {
			setCompanyname(companyname);
		}

		String userid = (String)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getEventid() {
		return _eventid;
	}

	@Override
	public void setEventid(long eventid) {
		_eventid = eventid;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setEventid", long.class);

				method.invoke(_dataRemoteModel, eventid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEventdetails() {
		return _eventdetails;
	}

	@Override
	public void setEventdetails(String eventdetails) {
		_eventdetails = eventdetails;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setEventdetails", String.class);

				method.invoke(_dataRemoteModel, eventdetails);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEventfrom() {
		return _eventfrom;
	}

	@Override
	public void setEventfrom(String eventfrom) {
		_eventfrom = eventfrom;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setEventfrom", String.class);

				method.invoke(_dataRemoteModel, eventfrom);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEventto() {
		return _eventto;
	}

	@Override
	public void setEventto(String eventto) {
		_eventto = eventto;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setEventto", String.class);

				method.invoke(_dataRemoteModel, eventto);
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

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_dataRemoteModel, location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDept() {
		return _dept;
	}

	@Override
	public void setDept(String dept) {
		_dept = dept;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setDept", String.class);

				method.invoke(_dataRemoteModel, dept);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubdept() {
		return _subdept;
	}

	@Override
	public void setSubdept(String subdept) {
		_subdept = subdept;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setSubdept", String.class);

				method.invoke(_dataRemoteModel, subdept);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGrade() {
		return _grade;
	}

	@Override
	public void setGrade(String grade) {
		_grade = grade;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setGrade", String.class);

				method.invoke(_dataRemoteModel, grade);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAge() {
		return _age;
	}

	@Override
	public void setAge(String age) {
		_age = age;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setAge", String.class);

				method.invoke(_dataRemoteModel, age);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompanyname() {
		return _companyname;
	}

	@Override
	public void setCompanyname(String companyname) {
		_companyname = companyname;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyname", String.class);

				method.invoke(_dataRemoteModel, companyname);
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

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setUserid", String.class);

				method.invoke(_dataRemoteModel, userid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGender() {
		return _gender;
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;

		if (_dataRemoteModel != null) {
			try {
				Class<?> clazz = _dataRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_dataRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getdataRemoteModel() {
		return _dataRemoteModel;
	}

	public void setdataRemoteModel(BaseModel<?> dataRemoteModel) {
		_dataRemoteModel = dataRemoteModel;
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

		Class<?> remoteModelClass = _dataRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dataRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			dataLocalServiceUtil.adddata(this);
		}
		else {
			dataLocalServiceUtil.updatedata(this);
		}
	}

	@Override
	public data toEscapedModel() {
		return (data)ProxyUtil.newProxyInstance(data.class.getClassLoader(),
			new Class[] { data.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		dataClp clone = new dataClp();

		clone.setEventid(getEventid());
		clone.setEventdetails(getEventdetails());
		clone.setEventfrom(getEventfrom());
		clone.setEventto(getEventto());
		clone.setLocation(getLocation());
		clone.setDept(getDept());
		clone.setSubdept(getSubdept());
		clone.setGrade(getGrade());
		clone.setAge(getAge());
		clone.setCompanyname(getCompanyname());
		clone.setUserid(getUserid());
		clone.setGender(getGender());

		return clone;
	}

	@Override
	public int compareTo(data data) {
		long primaryKey = data.getPrimaryKey();

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

		if (!(obj instanceof dataClp)) {
			return false;
		}

		dataClp data = (dataClp)obj;

		long primaryKey = data.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{eventid=");
		sb.append(getEventid());
		sb.append(", eventdetails=");
		sb.append(getEventdetails());
		sb.append(", eventfrom=");
		sb.append(getEventfrom());
		sb.append(", eventto=");
		sb.append(getEventto());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", dept=");
		sb.append(getDept());
		sb.append(", subdept=");
		sb.append(getSubdept());
		sb.append(", grade=");
		sb.append(getGrade());
		sb.append(", age=");
		sb.append(getAge());
		sb.append(", companyname=");
		sb.append(getCompanyname());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.chola.calendar.model.data");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eventid</column-name><column-value><![CDATA[");
		sb.append(getEventid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventdetails</column-name><column-value><![CDATA[");
		sb.append(getEventdetails());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventfrom</column-name><column-value><![CDATA[");
		sb.append(getEventfrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventto</column-name><column-value><![CDATA[");
		sb.append(getEventto());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dept</column-name><column-value><![CDATA[");
		sb.append(getDept());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subdept</column-name><column-value><![CDATA[");
		sb.append(getSubdept());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grade</column-name><column-value><![CDATA[");
		sb.append(getGrade());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age</column-name><column-value><![CDATA[");
		sb.append(getAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyname</column-name><column-value><![CDATA[");
		sb.append(getCompanyname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _eventid;
	private String _eventdetails;
	private String _eventfrom;
	private String _eventto;
	private String _location;
	private String _dept;
	private String _subdept;
	private String _grade;
	private String _age;
	private String _companyname;
	private String _userid;
	private String _gender;
	private BaseModel<?> _dataRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}