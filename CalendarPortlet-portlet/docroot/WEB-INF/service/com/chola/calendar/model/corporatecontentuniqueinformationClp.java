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
import com.chola.calendar.service.corporatecontentuniqueinformationLocalServiceUtil;

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
public class corporatecontentuniqueinformationClp extends BaseModelImpl<corporatecontentuniqueinformation>
	implements corporatecontentuniqueinformation {
	public corporatecontentuniqueinformationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return corporatecontentuniqueinformation.class;
	}

	@Override
	public String getModelClassName() {
		return corporatecontentuniqueinformation.class.getName();
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
		attributes.put("corporatevent_id", getCorporatevent_id());
		attributes.put("content_id", getContent_id());
		attributes.put("status", getStatus());
		attributes.put("udflag", getUdflag());
		attributes.put("content_type", getContent_type());
		attributes.put("notification_text", getNotification_text());
		attributes.put("pageurl", getPageurl());

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

		Long corporatevent_id = (Long)attributes.get("corporatevent_id");

		if (corporatevent_id != null) {
			setCorporatevent_id(corporatevent_id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long udflag = (Long)attributes.get("udflag");

		if (udflag != null) {
			setUdflag(udflag);
		}

		String content_type = (String)attributes.get("content_type");

		if (content_type != null) {
			setContent_type(content_type);
		}

		String notification_text = (String)attributes.get("notification_text");

		if (notification_text != null) {
			setNotification_text(notification_text);
		}

		String pageurl = (String)attributes.get("pageurl");

		if (pageurl != null) {
			setPageurl(pageurl);
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

		if (_corporatecontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _corporatecontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_corporatecontentuniqueinformationRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCorporatevent_id() {
		return _corporatevent_id;
	}

	@Override
	public void setCorporatevent_id(long corporatevent_id) {
		_corporatevent_id = corporatevent_id;

		if (_corporatecontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _corporatecontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setCorporatevent_id",
						long.class);

				method.invoke(_corporatecontentuniqueinformationRemoteModel,
					corporatevent_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getContent_id() {
		return _content_id;
	}

	@Override
	public void setContent_id(long content_id) {
		_content_id = content_id;

		if (_corporatecontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _corporatecontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_corporatecontentuniqueinformationRemoteModel,
					content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatus() {
		return _status;
	}

	@Override
	public void setStatus(long status) {
		_status = status;

		if (_corporatecontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _corporatecontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", long.class);

				method.invoke(_corporatecontentuniqueinformationRemoteModel,
					status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUdflag() {
		return _udflag;
	}

	@Override
	public void setUdflag(long udflag) {
		_udflag = udflag;

		if (_corporatecontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _corporatecontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setUdflag", long.class);

				method.invoke(_corporatecontentuniqueinformationRemoteModel,
					udflag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContent_type() {
		return _content_type;
	}

	@Override
	public void setContent_type(String content_type) {
		_content_type = content_type;

		if (_corporatecontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _corporatecontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_type", String.class);

				method.invoke(_corporatecontentuniqueinformationRemoteModel,
					content_type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNotification_text() {
		return _notification_text;
	}

	@Override
	public void setNotification_text(String notification_text) {
		_notification_text = notification_text;

		if (_corporatecontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _corporatecontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setNotification_text",
						String.class);

				method.invoke(_corporatecontentuniqueinformationRemoteModel,
					notification_text);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPageurl() {
		return _pageurl;
	}

	@Override
	public void setPageurl(String pageurl) {
		_pageurl = pageurl;

		if (_corporatecontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _corporatecontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setPageurl", String.class);

				method.invoke(_corporatecontentuniqueinformationRemoteModel,
					pageurl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcorporatecontentuniqueinformationRemoteModel() {
		return _corporatecontentuniqueinformationRemoteModel;
	}

	public void setcorporatecontentuniqueinformationRemoteModel(
		BaseModel<?> corporatecontentuniqueinformationRemoteModel) {
		_corporatecontentuniqueinformationRemoteModel = corporatecontentuniqueinformationRemoteModel;
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

		Class<?> remoteModelClass = _corporatecontentuniqueinformationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_corporatecontentuniqueinformationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			corporatecontentuniqueinformationLocalServiceUtil.addcorporatecontentuniqueinformation(this);
		}
		else {
			corporatecontentuniqueinformationLocalServiceUtil.updatecorporatecontentuniqueinformation(this);
		}
	}

	@Override
	public corporatecontentuniqueinformation toEscapedModel() {
		return (corporatecontentuniqueinformation)ProxyUtil.newProxyInstance(corporatecontentuniqueinformation.class.getClassLoader(),
			new Class[] { corporatecontentuniqueinformation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		corporatecontentuniqueinformationClp clone = new corporatecontentuniqueinformationClp();

		clone.setId(getId());
		clone.setCorporatevent_id(getCorporatevent_id());
		clone.setContent_id(getContent_id());
		clone.setStatus(getStatus());
		clone.setUdflag(getUdflag());
		clone.setContent_type(getContent_type());
		clone.setNotification_text(getNotification_text());
		clone.setPageurl(getPageurl());

		return clone;
	}

	@Override
	public int compareTo(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		long primaryKey = corporatecontentuniqueinformation.getPrimaryKey();

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

		if (!(obj instanceof corporatecontentuniqueinformationClp)) {
			return false;
		}

		corporatecontentuniqueinformationClp corporatecontentuniqueinformation = (corporatecontentuniqueinformationClp)obj;

		long primaryKey = corporatecontentuniqueinformation.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", corporatevent_id=");
		sb.append(getCorporatevent_id());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", udflag=");
		sb.append(getUdflag());
		sb.append(", content_type=");
		sb.append(getContent_type());
		sb.append(", notification_text=");
		sb.append(getNotification_text());
		sb.append(", pageurl=");
		sb.append(getPageurl());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.chola.calendar.model.corporatecontentuniqueinformation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>corporatevent_id</column-name><column-value><![CDATA[");
		sb.append(getCorporatevent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content_id</column-name><column-value><![CDATA[");
		sb.append(getContent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>udflag</column-name><column-value><![CDATA[");
		sb.append(getUdflag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content_type</column-name><column-value><![CDATA[");
		sb.append(getContent_type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notification_text</column-name><column-value><![CDATA[");
		sb.append(getNotification_text());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pageurl</column-name><column-value><![CDATA[");
		sb.append(getPageurl());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _corporatevent_id;
	private long _content_id;
	private long _status;
	private long _udflag;
	private String _content_type;
	private String _notification_text;
	private String _pageurl;
	private BaseModel<?> _corporatecontentuniqueinformationRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}