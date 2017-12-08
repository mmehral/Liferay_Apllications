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

package com.chola.InternalJobRef.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.InternalJobRef.service.ClpSerializer;
import com.chola.InternalJobRef.service.InternalReferenceLocalServiceUtil;

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
public class InternalReferenceClp extends BaseModelImpl<InternalReference>
	implements InternalReference {
	public InternalReferenceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return InternalReference.class;
	}

	@Override
	public String getModelClassName() {
		return InternalReference.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _refId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRefId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _refId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("refId", getRefId());
		attributes.put("title", getTitle());
		attributes.put("from", getFrom());
		attributes.put("to", getTo());
		attributes.put("body", getBody());
		attributes.put("flag", getFlag());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long refId = (Long)attributes.get("refId");

		if (refId != null) {
			setRefId(refId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String from = (String)attributes.get("from");

		if (from != null) {
			setFrom(from);
		}

		String to = (String)attributes.get("to");

		if (to != null) {
			setTo(to);
		}

		String body = (String)attributes.get("body");

		if (body != null) {
			setBody(body);
		}

		Long flag = (Long)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getRefId() {
		return _refId;
	}

	@Override
	public void setRefId(long refId) {
		_refId = refId;

		if (_internalReferenceRemoteModel != null) {
			try {
				Class<?> clazz = _internalReferenceRemoteModel.getClass();

				Method method = clazz.getMethod("setRefId", long.class);

				method.invoke(_internalReferenceRemoteModel, refId);
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

		if (_internalReferenceRemoteModel != null) {
			try {
				Class<?> clazz = _internalReferenceRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_internalReferenceRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFrom() {
		return _from;
	}

	@Override
	public void setFrom(String from) {
		_from = from;

		if (_internalReferenceRemoteModel != null) {
			try {
				Class<?> clazz = _internalReferenceRemoteModel.getClass();

				Method method = clazz.getMethod("setFrom", String.class);

				method.invoke(_internalReferenceRemoteModel, from);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTo() {
		return _to;
	}

	@Override
	public void setTo(String to) {
		_to = to;

		if (_internalReferenceRemoteModel != null) {
			try {
				Class<?> clazz = _internalReferenceRemoteModel.getClass();

				Method method = clazz.getMethod("setTo", String.class);

				method.invoke(_internalReferenceRemoteModel, to);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBody() {
		return _body;
	}

	@Override
	public void setBody(String body) {
		_body = body;

		if (_internalReferenceRemoteModel != null) {
			try {
				Class<?> clazz = _internalReferenceRemoteModel.getClass();

				Method method = clazz.getMethod("setBody", String.class);

				method.invoke(_internalReferenceRemoteModel, body);
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

		if (_internalReferenceRemoteModel != null) {
			try {
				Class<?> clazz = _internalReferenceRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", long.class);

				method.invoke(_internalReferenceRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_internalReferenceRemoteModel != null) {
			try {
				Class<?> clazz = _internalReferenceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_internalReferenceRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_internalReferenceRemoteModel != null) {
			try {
				Class<?> clazz = _internalReferenceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_internalReferenceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInternalReferenceRemoteModel() {
		return _internalReferenceRemoteModel;
	}

	public void setInternalReferenceRemoteModel(
		BaseModel<?> internalReferenceRemoteModel) {
		_internalReferenceRemoteModel = internalReferenceRemoteModel;
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

		Class<?> remoteModelClass = _internalReferenceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_internalReferenceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			InternalReferenceLocalServiceUtil.addInternalReference(this);
		}
		else {
			InternalReferenceLocalServiceUtil.updateInternalReference(this);
		}
	}

	@Override
	public InternalReference toEscapedModel() {
		return (InternalReference)ProxyUtil.newProxyInstance(InternalReference.class.getClassLoader(),
			new Class[] { InternalReference.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InternalReferenceClp clone = new InternalReferenceClp();

		clone.setRefId(getRefId());
		clone.setTitle(getTitle());
		clone.setFrom(getFrom());
		clone.setTo(getTo());
		clone.setBody(getBody());
		clone.setFlag(getFlag());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(InternalReference internalReference) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				internalReference.getCreateDate());

		value = value * -1;

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

		if (!(obj instanceof InternalReferenceClp)) {
			return false;
		}

		InternalReferenceClp internalReference = (InternalReferenceClp)obj;

		long primaryKey = internalReference.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{refId=");
		sb.append(getRefId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", from=");
		sb.append(getFrom());
		sb.append(", to=");
		sb.append(getTo());
		sb.append(", body=");
		sb.append(getBody());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.chola.InternalJobRef.model.InternalReference");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>refId</column-name><column-value><![CDATA[");
		sb.append(getRefId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>from</column-name><column-value><![CDATA[");
		sb.append(getFrom());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>to</column-name><column-value><![CDATA[");
		sb.append(getTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>body</column-name><column-value><![CDATA[");
		sb.append(getBody());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _refId;
	private String _title;
	private String _from;
	private String _to;
	private String _body;
	private long _flag;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _internalReferenceRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}