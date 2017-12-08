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

package com.branchdetails.model;

import aQute.bnd.annotation.ProviderType;

import com.branchdetails.service.ClpSerializer;
import com.branchdetails.service.branchdetailsLocalServiceUtil;

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
public class branchdetailsClp extends BaseModelImpl<branchdetails>
	implements branchdetails {
	public branchdetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return branchdetails.class;
	}

	@Override
	public String getModelClassName() {
		return branchdetails.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _branch_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBranch_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _branch_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("branch_id", getBranch_id());
		attributes.put("branch_code", getBranch_code());
		attributes.put("branch_address", getBranch_address());
		attributes.put("city_id", getCity_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long branch_id = (Long)attributes.get("branch_id");

		if (branch_id != null) {
			setBranch_id(branch_id);
		}

		String branch_code = (String)attributes.get("branch_code");

		if (branch_code != null) {
			setBranch_code(branch_code);
		}

		String branch_address = (String)attributes.get("branch_address");

		if (branch_address != null) {
			setBranch_address(branch_address);
		}

		Long city_id = (Long)attributes.get("city_id");

		if (city_id != null) {
			setCity_id(city_id);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getBranch_id() {
		return _branch_id;
	}

	@Override
	public void setBranch_id(long branch_id) {
		_branch_id = branch_id;

		if (_branchdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBranch_id", long.class);

				method.invoke(_branchdetailsRemoteModel, branch_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBranch_code() {
		return _branch_code;
	}

	@Override
	public void setBranch_code(String branch_code) {
		_branch_code = branch_code;

		if (_branchdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBranch_code", String.class);

				method.invoke(_branchdetailsRemoteModel, branch_code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBranch_address() {
		return _branch_address;
	}

	@Override
	public void setBranch_address(String branch_address) {
		_branch_address = branch_address;

		if (_branchdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBranch_address",
						String.class);

				method.invoke(_branchdetailsRemoteModel, branch_address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCity_id() {
		return _city_id;
	}

	@Override
	public void setCity_id(long city_id) {
		_city_id = city_id;

		if (_branchdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _branchdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCity_id", long.class);

				method.invoke(_branchdetailsRemoteModel, city_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbranchdetailsRemoteModel() {
		return _branchdetailsRemoteModel;
	}

	public void setbranchdetailsRemoteModel(
		BaseModel<?> branchdetailsRemoteModel) {
		_branchdetailsRemoteModel = branchdetailsRemoteModel;
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

		Class<?> remoteModelClass = _branchdetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_branchdetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			branchdetailsLocalServiceUtil.addbranchdetails(this);
		}
		else {
			branchdetailsLocalServiceUtil.updatebranchdetails(this);
		}
	}

	@Override
	public branchdetails toEscapedModel() {
		return (branchdetails)ProxyUtil.newProxyInstance(branchdetails.class.getClassLoader(),
			new Class[] { branchdetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		branchdetailsClp clone = new branchdetailsClp();

		clone.setBranch_id(getBranch_id());
		clone.setBranch_code(getBranch_code());
		clone.setBranch_address(getBranch_address());
		clone.setCity_id(getCity_id());

		return clone;
	}

	@Override
	public int compareTo(branchdetails branchdetails) {
		long primaryKey = branchdetails.getPrimaryKey();

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

		if (!(obj instanceof branchdetailsClp)) {
			return false;
		}

		branchdetailsClp branchdetails = (branchdetailsClp)obj;

		long primaryKey = branchdetails.getPrimaryKey();

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

		sb.append("{branch_id=");
		sb.append(getBranch_id());
		sb.append(", branch_code=");
		sb.append(getBranch_code());
		sb.append(", branch_address=");
		sb.append(getBranch_address());
		sb.append(", city_id=");
		sb.append(getCity_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.branchdetails.model.branchdetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>branch_id</column-name><column-value><![CDATA[");
		sb.append(getBranch_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>branch_code</column-name><column-value><![CDATA[");
		sb.append(getBranch_code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>branch_address</column-name><column-value><![CDATA[");
		sb.append(getBranch_address());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city_id</column-name><column-value><![CDATA[");
		sb.append(getCity_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _branch_id;
	private String _branch_code;
	private String _branch_address;
	private long _city_id;
	private BaseModel<?> _branchdetailsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}