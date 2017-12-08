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

package com.chola.socho.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.socho.service.ClpSerializer;
import com.chola.socho.service.topicsLocalServiceUtil;

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
public class topicsClp extends BaseModelImpl<topics> implements topics {
	public topicsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return topics.class;
	}

	@Override
	public String getModelClassName() {
		return topics.class.getName();
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
		attributes.put("topicName", getTopicName());
		attributes.put("flag", getFlag());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("createdOn", getCreatedOn());
		attributes.put("modifiedBy", getModifiedBy());
		attributes.put("modifiedOn", getModifiedOn());

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

		String topicName = (String)attributes.get("topicName");

		if (topicName != null) {
			setTopicName(topicName);
		}

		Long flag = (Long)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date createdOn = (Date)attributes.get("createdOn");

		if (createdOn != null) {
			setCreatedOn(createdOn);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		Date modifiedOn = (Date)attributes.get("modifiedOn");

		if (modifiedOn != null) {
			setModifiedOn(modifiedOn);
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

		if (_topicsRemoteModel != null) {
			try {
				Class<?> clazz = _topicsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_topicsRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTopicName() {
		return _topicName;
	}

	@Override
	public void setTopicName(String topicName) {
		_topicName = topicName;

		if (_topicsRemoteModel != null) {
			try {
				Class<?> clazz = _topicsRemoteModel.getClass();

				Method method = clazz.getMethod("setTopicName", String.class);

				method.invoke(_topicsRemoteModel, topicName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFlag() {
		return _flag;
	}

	@Override
	public void setFlag(long flag) {
		_flag = flag;

		if (_topicsRemoteModel != null) {
			try {
				Class<?> clazz = _topicsRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", long.class);

				method.invoke(_topicsRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;

		if (_topicsRemoteModel != null) {
			try {
				Class<?> clazz = _topicsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_topicsRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedOn() {
		return _createdOn;
	}

	@Override
	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;

		if (_topicsRemoteModel != null) {
			try {
				Class<?> clazz = _topicsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedOn", Date.class);

				method.invoke(_topicsRemoteModel, createdOn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;

		if (_topicsRemoteModel != null) {
			try {
				Class<?> clazz = _topicsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_topicsRemoteModel, modifiedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedOn() {
		return _modifiedOn;
	}

	@Override
	public void setModifiedOn(Date modifiedOn) {
		_modifiedOn = modifiedOn;

		if (_topicsRemoteModel != null) {
			try {
				Class<?> clazz = _topicsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedOn", Date.class);

				method.invoke(_topicsRemoteModel, modifiedOn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gettopicsRemoteModel() {
		return _topicsRemoteModel;
	}

	public void settopicsRemoteModel(BaseModel<?> topicsRemoteModel) {
		_topicsRemoteModel = topicsRemoteModel;
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

		Class<?> remoteModelClass = _topicsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_topicsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			topicsLocalServiceUtil.addtopics(this);
		}
		else {
			topicsLocalServiceUtil.updatetopics(this);
		}
	}

	@Override
	public topics toEscapedModel() {
		return (topics)ProxyUtil.newProxyInstance(topics.class.getClassLoader(),
			new Class[] { topics.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		topicsClp clone = new topicsClp();

		clone.setId(getId());
		clone.setTopicName(getTopicName());
		clone.setFlag(getFlag());
		clone.setCreatedBy(getCreatedBy());
		clone.setCreatedOn(getCreatedOn());
		clone.setModifiedBy(getModifiedBy());
		clone.setModifiedOn(getModifiedOn());

		return clone;
	}

	@Override
	public int compareTo(topics topics) {
		long primaryKey = topics.getPrimaryKey();

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

		if (!(obj instanceof topicsClp)) {
			return false;
		}

		topicsClp topics = (topicsClp)obj;

		long primaryKey = topics.getPrimaryKey();

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
		sb.append(", topicName=");
		sb.append(getTopicName());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", createdOn=");
		sb.append(getCreatedOn());
		sb.append(", modifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", modifiedOn=");
		sb.append(getModifiedOn());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.chola.socho.model.topics");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>topicName</column-name><column-value><![CDATA[");
		sb.append(getTopicName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdOn</column-name><column-value><![CDATA[");
		sb.append(getCreatedOn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedOn</column-name><column-value><![CDATA[");
		sb.append(getModifiedOn());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _topicName;
	private long _flag;
	private long _createdBy;
	private Date _createdOn;
	private long _modifiedBy;
	private Date _modifiedOn;
	private BaseModel<?> _topicsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}