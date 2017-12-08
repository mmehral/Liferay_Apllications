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

package com.chola.app.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.app.service.ClpSerializer;
import com.chola.app.service.repliedLocalServiceUtil;

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
public class repliedClp extends BaseModelImpl<replied> implements replied {
	public repliedClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return replied.class;
	}

	@Override
	public String getModelClassName() {
		return replied.class.getName();
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
		attributes.put("repliedOnPost", getRepliedOnPost());
		attributes.put("repliedTo", getRepliedTo());
		attributes.put("repliedBy", getRepliedBy());
		attributes.put("repliedMessage", getRepliedMessage());
		attributes.put("repliedDate", getRepliedDate());

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

		Long repliedOnPost = (Long)attributes.get("repliedOnPost");

		if (repliedOnPost != null) {
			setRepliedOnPost(repliedOnPost);
		}

		String repliedTo = (String)attributes.get("repliedTo");

		if (repliedTo != null) {
			setRepliedTo(repliedTo);
		}

		String repliedBy = (String)attributes.get("repliedBy");

		if (repliedBy != null) {
			setRepliedBy(repliedBy);
		}

		String repliedMessage = (String)attributes.get("repliedMessage");

		if (repliedMessage != null) {
			setRepliedMessage(repliedMessage);
		}

		Date repliedDate = (Date)attributes.get("repliedDate");

		if (repliedDate != null) {
			setRepliedDate(repliedDate);
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

		if (_repliedRemoteModel != null) {
			try {
				Class<?> clazz = _repliedRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_repliedRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRepliedOnPost() {
		return _repliedOnPost;
	}

	@Override
	public void setRepliedOnPost(long repliedOnPost) {
		_repliedOnPost = repliedOnPost;

		if (_repliedRemoteModel != null) {
			try {
				Class<?> clazz = _repliedRemoteModel.getClass();

				Method method = clazz.getMethod("setRepliedOnPost", long.class);

				method.invoke(_repliedRemoteModel, repliedOnPost);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepliedTo() {
		return _repliedTo;
	}

	@Override
	public void setRepliedTo(String repliedTo) {
		_repliedTo = repliedTo;

		if (_repliedRemoteModel != null) {
			try {
				Class<?> clazz = _repliedRemoteModel.getClass();

				Method method = clazz.getMethod("setRepliedTo", String.class);

				method.invoke(_repliedRemoteModel, repliedTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepliedBy() {
		return _repliedBy;
	}

	@Override
	public void setRepliedBy(String repliedBy) {
		_repliedBy = repliedBy;

		if (_repliedRemoteModel != null) {
			try {
				Class<?> clazz = _repliedRemoteModel.getClass();

				Method method = clazz.getMethod("setRepliedBy", String.class);

				method.invoke(_repliedRemoteModel, repliedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRepliedMessage() {
		return _repliedMessage;
	}

	@Override
	public void setRepliedMessage(String repliedMessage) {
		_repliedMessage = repliedMessage;

		if (_repliedRemoteModel != null) {
			try {
				Class<?> clazz = _repliedRemoteModel.getClass();

				Method method = clazz.getMethod("setRepliedMessage",
						String.class);

				method.invoke(_repliedRemoteModel, repliedMessage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRepliedDate() {
		return _repliedDate;
	}

	@Override
	public void setRepliedDate(Date repliedDate) {
		_repliedDate = repliedDate;

		if (_repliedRemoteModel != null) {
			try {
				Class<?> clazz = _repliedRemoteModel.getClass();

				Method method = clazz.getMethod("setRepliedDate", Date.class);

				method.invoke(_repliedRemoteModel, repliedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getrepliedRemoteModel() {
		return _repliedRemoteModel;
	}

	public void setrepliedRemoteModel(BaseModel<?> repliedRemoteModel) {
		_repliedRemoteModel = repliedRemoteModel;
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

		Class<?> remoteModelClass = _repliedRemoteModel.getClass();

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

		Object returnValue = method.invoke(_repliedRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			repliedLocalServiceUtil.addreplied(this);
		}
		else {
			repliedLocalServiceUtil.updatereplied(this);
		}
	}

	@Override
	public replied toEscapedModel() {
		return (replied)ProxyUtil.newProxyInstance(replied.class.getClassLoader(),
			new Class[] { replied.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		repliedClp clone = new repliedClp();

		clone.setId(getId());
		clone.setRepliedOnPost(getRepliedOnPost());
		clone.setRepliedTo(getRepliedTo());
		clone.setRepliedBy(getRepliedBy());
		clone.setRepliedMessage(getRepliedMessage());
		clone.setRepliedDate(getRepliedDate());

		return clone;
	}

	@Override
	public int compareTo(replied replied) {
		long primaryKey = replied.getPrimaryKey();

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

		if (!(obj instanceof repliedClp)) {
			return false;
		}

		repliedClp replied = (repliedClp)obj;

		long primaryKey = replied.getPrimaryKey();

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
		sb.append(", repliedOnPost=");
		sb.append(getRepliedOnPost());
		sb.append(", repliedTo=");
		sb.append(getRepliedTo());
		sb.append(", repliedBy=");
		sb.append(getRepliedBy());
		sb.append(", repliedMessage=");
		sb.append(getRepliedMessage());
		sb.append(", repliedDate=");
		sb.append(getRepliedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.chola.app.model.replied");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repliedOnPost</column-name><column-value><![CDATA[");
		sb.append(getRepliedOnPost());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repliedTo</column-name><column-value><![CDATA[");
		sb.append(getRepliedTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repliedBy</column-name><column-value><![CDATA[");
		sb.append(getRepliedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repliedMessage</column-name><column-value><![CDATA[");
		sb.append(getRepliedMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>repliedDate</column-name><column-value><![CDATA[");
		sb.append(getRepliedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _repliedOnPost;
	private String _repliedTo;
	private String _repliedBy;
	private String _repliedMessage;
	private Date _repliedDate;
	private BaseModel<?> _repliedRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}