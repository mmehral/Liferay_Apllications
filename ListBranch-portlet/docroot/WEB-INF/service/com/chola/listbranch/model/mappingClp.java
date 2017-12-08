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

package com.chola.listbranch.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.listbranch.service.ClpSerializer;
import com.chola.listbranch.service.mappingLocalServiceUtil;

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
public class mappingClp extends BaseModelImpl<mapping> implements mapping {
	public mappingClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return mapping.class;
	}

	@Override
	public String getModelClassName() {
		return mapping.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _mapping_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMapping_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mapping_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mapping_id", getMapping_id());
		attributes.put("product_id", getProduct_id());
		attributes.put("state_id", getState_id());
		attributes.put("city_id", getCity_id());
		attributes.put("branch_id", getBranch_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mapping_id = (Long)attributes.get("mapping_id");

		if (mapping_id != null) {
			setMapping_id(mapping_id);
		}

		Long product_id = (Long)attributes.get("product_id");

		if (product_id != null) {
			setProduct_id(product_id);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Long city_id = (Long)attributes.get("city_id");

		if (city_id != null) {
			setCity_id(city_id);
		}

		Long branch_id = (Long)attributes.get("branch_id");

		if (branch_id != null) {
			setBranch_id(branch_id);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getMapping_id() {
		return _mapping_id;
	}

	@Override
	public void setMapping_id(long mapping_id) {
		_mapping_id = mapping_id;

		if (_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setMapping_id", long.class);

				method.invoke(_mappingRemoteModel, mapping_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProduct_id() {
		return _product_id;
	}

	@Override
	public void setProduct_id(long product_id) {
		_product_id = product_id;

		if (_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setProduct_id", long.class);

				method.invoke(_mappingRemoteModel, product_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getState_id() {
		return _state_id;
	}

	@Override
	public void setState_id(long state_id) {
		_state_id = state_id;

		if (_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setState_id", long.class);

				method.invoke(_mappingRemoteModel, state_id);
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

		if (_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setCity_id", long.class);

				method.invoke(_mappingRemoteModel, city_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBranch_id() {
		return _branch_id;
	}

	@Override
	public void setBranch_id(long branch_id) {
		_branch_id = branch_id;

		if (_mappingRemoteModel != null) {
			try {
				Class<?> clazz = _mappingRemoteModel.getClass();

				Method method = clazz.getMethod("setBranch_id", long.class);

				method.invoke(_mappingRemoteModel, branch_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getmappingRemoteModel() {
		return _mappingRemoteModel;
	}

	public void setmappingRemoteModel(BaseModel<?> mappingRemoteModel) {
		_mappingRemoteModel = mappingRemoteModel;
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

		Class<?> remoteModelClass = _mappingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_mappingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			mappingLocalServiceUtil.addmapping(this);
		}
		else {
			mappingLocalServiceUtil.updatemapping(this);
		}
	}

	@Override
	public mapping toEscapedModel() {
		return (mapping)ProxyUtil.newProxyInstance(mapping.class.getClassLoader(),
			new Class[] { mapping.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		mappingClp clone = new mappingClp();

		clone.setMapping_id(getMapping_id());
		clone.setProduct_id(getProduct_id());
		clone.setState_id(getState_id());
		clone.setCity_id(getCity_id());
		clone.setBranch_id(getBranch_id());

		return clone;
	}

	@Override
	public int compareTo(mapping mapping) {
		long primaryKey = mapping.getPrimaryKey();

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

		if (!(obj instanceof mappingClp)) {
			return false;
		}

		mappingClp mapping = (mappingClp)obj;

		long primaryKey = mapping.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{mapping_id=");
		sb.append(getMapping_id());
		sb.append(", product_id=");
		sb.append(getProduct_id());
		sb.append(", state_id=");
		sb.append(getState_id());
		sb.append(", city_id=");
		sb.append(getCity_id());
		sb.append(", branch_id=");
		sb.append(getBranch_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.chola.listbranch.model.mapping");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mapping_id</column-name><column-value><![CDATA[");
		sb.append(getMapping_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>product_id</column-name><column-value><![CDATA[");
		sb.append(getProduct_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city_id</column-name><column-value><![CDATA[");
		sb.append(getCity_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>branch_id</column-name><column-value><![CDATA[");
		sb.append(getBranch_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _mapping_id;
	private long _product_id;
	private long _state_id;
	private long _city_id;
	private long _branch_id;
	private BaseModel<?> _mappingRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}