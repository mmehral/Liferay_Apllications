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

package com.empoylee.model;

import aQute.bnd.annotation.ProviderType;

import com.empoylee.service.ClpSerializer;
import com.empoylee.service.employeeLocalServiceUtil;

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
public class employeeClp extends BaseModelImpl<employee> implements employee {
	public employeeClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return employee.class;
	}

	@Override
	public String getModelClassName() {
		return employee.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _empId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmpId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empId", getEmpId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("desigation", getDesigation());
		attributes.put("mobileNO", getMobileNO());
		attributes.put("salary", getSalary());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String desigation = (String)attributes.get("desigation");

		if (desigation != null) {
			setDesigation(desigation);
		}

		Integer mobileNO = (Integer)attributes.get("mobileNO");

		if (mobileNO != null) {
			setMobileNO(mobileNO);
		}

		Float salary = (Float)attributes.get("salary");

		if (salary != null) {
			setSalary(salary);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getEmpId() {
		return _empId;
	}

	@Override
	public void setEmpId(long empId) {
		_empId = empId;

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpId", long.class);

				method.invoke(_employeeRemoteModel, empId);
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

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_employeeRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_employeeRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesigation() {
		return _desigation;
	}

	@Override
	public void setDesigation(String desigation) {
		_desigation = desigation;

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setDesigation", String.class);

				method.invoke(_employeeRemoteModel, desigation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMobileNO() {
		return _mobileNO;
	}

	@Override
	public void setMobileNO(int mobileNO) {
		_mobileNO = mobileNO;

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setMobileNO", int.class);

				method.invoke(_employeeRemoteModel, mobileNO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public float getSalary() {
		return _salary;
	}

	@Override
	public void setSalary(float salary) {
		_salary = salary;

		if (_employeeRemoteModel != null) {
			try {
				Class<?> clazz = _employeeRemoteModel.getClass();

				Method method = clazz.getMethod("setSalary", float.class);

				method.invoke(_employeeRemoteModel, salary);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getemployeeRemoteModel() {
		return _employeeRemoteModel;
	}

	public void setemployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
		_employeeRemoteModel = employeeRemoteModel;
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

		Class<?> remoteModelClass = _employeeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_employeeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			employeeLocalServiceUtil.addemployee(this);
		}
		else {
			employeeLocalServiceUtil.updateemployee(this);
		}
	}

	@Override
	public employee toEscapedModel() {
		return (employee)ProxyUtil.newProxyInstance(employee.class.getClassLoader(),
			new Class[] { employee.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		employeeClp clone = new employeeClp();

		clone.setEmpId(getEmpId());
		clone.setName(getName());
		clone.setEmail(getEmail());
		clone.setDesigation(getDesigation());
		clone.setMobileNO(getMobileNO());
		clone.setSalary(getSalary());

		return clone;
	}

	@Override
	public int compareTo(employee employee) {
		long primaryKey = employee.getPrimaryKey();

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

		if (!(obj instanceof employeeClp)) {
			return false;
		}

		employeeClp employee = (employeeClp)obj;

		long primaryKey = employee.getPrimaryKey();

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

		sb.append("{empId=");
		sb.append(getEmpId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", desigation=");
		sb.append(getDesigation());
		sb.append(", mobileNO=");
		sb.append(getMobileNO());
		sb.append(", salary=");
		sb.append(getSalary());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.empoylee.model.employee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>empId</column-name><column-value><![CDATA[");
		sb.append(getEmpId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>desigation</column-name><column-value><![CDATA[");
		sb.append(getDesigation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobileNO</column-name><column-value><![CDATA[");
		sb.append(getMobileNO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salary</column-name><column-value><![CDATA[");
		sb.append(getSalary());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _empId;
	private String _name;
	private String _email;
	private String _desigation;
	private int _mobileNO;
	private float _salary;
	private BaseModel<?> _employeeRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}