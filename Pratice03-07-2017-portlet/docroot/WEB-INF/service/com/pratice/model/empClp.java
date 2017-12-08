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

package com.pratice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.pratice.service.ClpSerializer;
import com.pratice.service.empLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class empClp extends BaseModelImpl<emp> implements emp {
	public empClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return emp.class;
	}

	@Override
	public String getModelClassName() {
		return emp.class.getName();
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
		attributes.put("empName", getEmpName());
		attributes.put("dept", getDept());
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

		String empName = (String)attributes.get("empName");

		if (empName != null) {
			setEmpName(empName);
		}

		String dept = (String)attributes.get("dept");

		if (dept != null) {
			setDept(dept);
		}

		String salary = (String)attributes.get("salary");

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

		if (_empRemoteModel != null) {
			try {
				Class<?> clazz = _empRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpId", long.class);

				method.invoke(_empRemoteModel, empId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmpName() {
		return _empName;
	}

	@Override
	public void setEmpName(String empName) {
		_empName = empName;

		if (_empRemoteModel != null) {
			try {
				Class<?> clazz = _empRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpName", String.class);

				method.invoke(_empRemoteModel, empName);
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

		if (_empRemoteModel != null) {
			try {
				Class<?> clazz = _empRemoteModel.getClass();

				Method method = clazz.getMethod("setDept", String.class);

				method.invoke(_empRemoteModel, dept);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSalary() {
		return _salary;
	}

	@Override
	public void setSalary(String salary) {
		_salary = salary;

		if (_empRemoteModel != null) {
			try {
				Class<?> clazz = _empRemoteModel.getClass();

				Method method = clazz.getMethod("setSalary", String.class);

				method.invoke(_empRemoteModel, salary);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getempRemoteModel() {
		return _empRemoteModel;
	}

	public void setempRemoteModel(BaseModel<?> empRemoteModel) {
		_empRemoteModel = empRemoteModel;
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

		Class<?> remoteModelClass = _empRemoteModel.getClass();

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

		Object returnValue = method.invoke(_empRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			empLocalServiceUtil.addemp(this);
		}
		else {
			empLocalServiceUtil.updateemp(this);
		}
	}

	@Override
	public emp toEscapedModel() {
		return (emp)ProxyUtil.newProxyInstance(emp.class.getClassLoader(),
			new Class[] { emp.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		empClp clone = new empClp();

		clone.setEmpId(getEmpId());
		clone.setEmpName(getEmpName());
		clone.setDept(getDept());
		clone.setSalary(getSalary());

		return clone;
	}

	@Override
	public int compareTo(emp emp) {
		long primaryKey = emp.getPrimaryKey();

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

		if (!(obj instanceof empClp)) {
			return false;
		}

		empClp emp = (empClp)obj;

		long primaryKey = emp.getPrimaryKey();

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

		sb.append("{empId=");
		sb.append(getEmpId());
		sb.append(", empName=");
		sb.append(getEmpName());
		sb.append(", dept=");
		sb.append(getDept());
		sb.append(", salary=");
		sb.append(getSalary());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.pratice.model.emp");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>empId</column-name><column-value><![CDATA[");
		sb.append(getEmpId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empName</column-name><column-value><![CDATA[");
		sb.append(getEmpName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dept</column-name><column-value><![CDATA[");
		sb.append(getDept());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>salary</column-name><column-value><![CDATA[");
		sb.append(getSalary());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _empId;
	private String _empName;
	private String _dept;
	private String _salary;
	private BaseModel<?> _empRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}