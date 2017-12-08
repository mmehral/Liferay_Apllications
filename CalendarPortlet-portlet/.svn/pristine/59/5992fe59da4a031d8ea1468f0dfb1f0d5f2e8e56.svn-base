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
import com.chola.calendar.service.EmpInfoEntityLocalServiceUtil;

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
public class EmpInfoEntityClp extends BaseModelImpl<EmpInfoEntity>
	implements EmpInfoEntity {
	public EmpInfoEntityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EmpInfoEntity.class;
	}

	@Override
	public String getModelClassName() {
		return EmpInfoEntity.class.getName();
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
		attributes.put("name", getName());
		attributes.put("emailid", getEmailid());
		attributes.put("birthday", getBirthday());
		attributes.put("grade", getGrade());
		attributes.put("functionName", getFunctionName());
		attributes.put("department", getDepartment());
		attributes.put("subdepartment", getSubdepartment());
		attributes.put("location", getLocation());
		attributes.put("gender", getGender());
		attributes.put("unit", getUnit());
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

		String empId = (String)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String emailid = (String)attributes.get("emailid");

		if (emailid != null) {
			setEmailid(emailid);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		String grade = (String)attributes.get("grade");

		if (grade != null) {
			setGrade(grade);
		}

		String functionName = (String)attributes.get("functionName");

		if (functionName != null) {
			setFunctionName(functionName);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String subdepartment = (String)attributes.get("subdepartment");

		if (subdepartment != null) {
			setSubdepartment(subdepartment);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String unit = (String)attributes.get("unit");

		if (unit != null) {
			setUnit(unit);
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

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_empInfoEntityRemoteModel, id);
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

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpId", String.class);

				method.invoke(_empInfoEntityRemoteModel, empId);
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

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_empInfoEntityRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailid() {
		return _emailid;
	}

	@Override
	public void setEmailid(String emailid) {
		_emailid = emailid;

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailid", String.class);

				method.invoke(_empInfoEntityRemoteModel, emailid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getBirthday() {
		return _birthday;
	}

	@Override
	public void setBirthday(Date birthday) {
		_birthday = birthday;

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setBirthday", Date.class);

				method.invoke(_empInfoEntityRemoteModel, birthday);
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

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setGrade", String.class);

				method.invoke(_empInfoEntityRemoteModel, grade);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFunctionName() {
		return _functionName;
	}

	@Override
	public void setFunctionName(String functionName) {
		_functionName = functionName;

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setFunctionName", String.class);

				method.invoke(_empInfoEntityRemoteModel, functionName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDepartment() {
		return _department;
	}

	@Override
	public void setDepartment(String department) {
		_department = department;

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setDepartment", String.class);

				method.invoke(_empInfoEntityRemoteModel, department);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubdepartment() {
		return _subdepartment;
	}

	@Override
	public void setSubdepartment(String subdepartment) {
		_subdepartment = subdepartment;

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setSubdepartment", String.class);

				method.invoke(_empInfoEntityRemoteModel, subdepartment);
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

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_empInfoEntityRemoteModel, location);
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

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_empInfoEntityRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnit() {
		return _unit;
	}

	@Override
	public void setUnit(String unit) {
		_unit = unit;

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUnit", String.class);

				method.invoke(_empInfoEntityRemoteModel, unit);
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

		if (_empInfoEntityRemoteModel != null) {
			try {
				Class<?> clazz = _empInfoEntityRemoteModel.getClass();

				Method method = clazz.getMethod("setUserid", String.class);

				method.invoke(_empInfoEntityRemoteModel, userid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEmpInfoEntityRemoteModel() {
		return _empInfoEntityRemoteModel;
	}

	public void setEmpInfoEntityRemoteModel(
		BaseModel<?> empInfoEntityRemoteModel) {
		_empInfoEntityRemoteModel = empInfoEntityRemoteModel;
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

		Class<?> remoteModelClass = _empInfoEntityRemoteModel.getClass();

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

		Object returnValue = method.invoke(_empInfoEntityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			EmpInfoEntityLocalServiceUtil.addEmpInfoEntity(this);
		}
		else {
			EmpInfoEntityLocalServiceUtil.updateEmpInfoEntity(this);
		}
	}

	@Override
	public EmpInfoEntity toEscapedModel() {
		return (EmpInfoEntity)ProxyUtil.newProxyInstance(EmpInfoEntity.class.getClassLoader(),
			new Class[] { EmpInfoEntity.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EmpInfoEntityClp clone = new EmpInfoEntityClp();

		clone.setId(getId());
		clone.setEmpId(getEmpId());
		clone.setName(getName());
		clone.setEmailid(getEmailid());
		clone.setBirthday(getBirthday());
		clone.setGrade(getGrade());
		clone.setFunctionName(getFunctionName());
		clone.setDepartment(getDepartment());
		clone.setSubdepartment(getSubdepartment());
		clone.setLocation(getLocation());
		clone.setGender(getGender());
		clone.setUnit(getUnit());
		clone.setUserid(getUserid());

		return clone;
	}

	@Override
	public int compareTo(EmpInfoEntity empInfoEntity) {
		int value = 0;

		value = getName().compareTo(empInfoEntity.getName());

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

		if (!(obj instanceof EmpInfoEntityClp)) {
			return false;
		}

		EmpInfoEntityClp empInfoEntity = (EmpInfoEntityClp)obj;

		long primaryKey = empInfoEntity.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", empId=");
		sb.append(getEmpId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", emailid=");
		sb.append(getEmailid());
		sb.append(", birthday=");
		sb.append(getBirthday());
		sb.append(", grade=");
		sb.append(getGrade());
		sb.append(", functionName=");
		sb.append(getFunctionName());
		sb.append(", department=");
		sb.append(getDepartment());
		sb.append(", subdepartment=");
		sb.append(getSubdepartment());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", unit=");
		sb.append(getUnit());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.chola.calendar.model.EmpInfoEntity");
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailid</column-name><column-value><![CDATA[");
		sb.append(getEmailid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthday</column-name><column-value><![CDATA[");
		sb.append(getBirthday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grade</column-name><column-value><![CDATA[");
		sb.append(getGrade());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>functionName</column-name><column-value><![CDATA[");
		sb.append(getFunctionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subdepartment</column-name><column-value><![CDATA[");
		sb.append(getSubdepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unit</column-name><column-value><![CDATA[");
		sb.append(getUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _empId;
	private String _name;
	private String _emailid;
	private Date _birthday;
	private String _grade;
	private String _functionName;
	private String _department;
	private String _subdepartment;
	private String _location;
	private String _gender;
	private String _unit;
	private String _userid;
	private BaseModel<?> _empInfoEntityRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}