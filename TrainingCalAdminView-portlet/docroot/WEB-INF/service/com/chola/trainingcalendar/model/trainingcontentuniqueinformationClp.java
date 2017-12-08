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

package com.chola.trainingcalendar.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.service.ClpSerializer;
import com.chola.trainingcalendar.service.trainingcontentuniqueinformationLocalServiceUtil;

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
public class trainingcontentuniqueinformationClp extends BaseModelImpl<trainingcontentuniqueinformation>
	implements trainingcontentuniqueinformation {
	public trainingcontentuniqueinformationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return trainingcontentuniqueinformation.class;
	}

	@Override
	public String getModelClassName() {
		return trainingcontentuniqueinformation.class.getName();
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
		attributes.put("training_id", getTraining_id());
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

		Long training_id = (Long)attributes.get("training_id");

		if (training_id != null) {
			setTraining_id(training_id);
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

		if (_trainingcontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_trainingcontentuniqueinformationRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTraining_id() {
		return _training_id;
	}

	@Override
	public void setTraining_id(long training_id) {
		_training_id = training_id;

		if (_trainingcontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setTraining_id", long.class);

				method.invoke(_trainingcontentuniqueinformationRemoteModel,
					training_id);
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

		if (_trainingcontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_trainingcontentuniqueinformationRemoteModel,
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

		if (_trainingcontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", long.class);

				method.invoke(_trainingcontentuniqueinformationRemoteModel,
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

		if (_trainingcontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setUdflag", long.class);

				method.invoke(_trainingcontentuniqueinformationRemoteModel,
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

		if (_trainingcontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_type", String.class);

				method.invoke(_trainingcontentuniqueinformationRemoteModel,
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

		if (_trainingcontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setNotification_text",
						String.class);

				method.invoke(_trainingcontentuniqueinformationRemoteModel,
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

		if (_trainingcontentuniqueinformationRemoteModel != null) {
			try {
				Class<?> clazz = _trainingcontentuniqueinformationRemoteModel.getClass();

				Method method = clazz.getMethod("setPageurl", String.class);

				method.invoke(_trainingcontentuniqueinformationRemoteModel,
					pageurl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gettrainingcontentuniqueinformationRemoteModel() {
		return _trainingcontentuniqueinformationRemoteModel;
	}

	public void settrainingcontentuniqueinformationRemoteModel(
		BaseModel<?> trainingcontentuniqueinformationRemoteModel) {
		_trainingcontentuniqueinformationRemoteModel = trainingcontentuniqueinformationRemoteModel;
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

		Class<?> remoteModelClass = _trainingcontentuniqueinformationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_trainingcontentuniqueinformationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			trainingcontentuniqueinformationLocalServiceUtil.addtrainingcontentuniqueinformation(this);
		}
		else {
			trainingcontentuniqueinformationLocalServiceUtil.updatetrainingcontentuniqueinformation(this);
		}
	}

	@Override
	public trainingcontentuniqueinformation toEscapedModel() {
		return (trainingcontentuniqueinformation)ProxyUtil.newProxyInstance(trainingcontentuniqueinformation.class.getClassLoader(),
			new Class[] { trainingcontentuniqueinformation.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		trainingcontentuniqueinformationClp clone = new trainingcontentuniqueinformationClp();

		clone.setId(getId());
		clone.setTraining_id(getTraining_id());
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
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		long primaryKey = trainingcontentuniqueinformation.getPrimaryKey();

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

		if (!(obj instanceof trainingcontentuniqueinformationClp)) {
			return false;
		}

		trainingcontentuniqueinformationClp trainingcontentuniqueinformation = (trainingcontentuniqueinformationClp)obj;

		long primaryKey = trainingcontentuniqueinformation.getPrimaryKey();

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
		sb.append(", training_id=");
		sb.append(getTraining_id());
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
		sb.append(
			"com.chola.trainingcalendar.model.trainingcontentuniqueinformation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>training_id</column-name><column-value><![CDATA[");
		sb.append(getTraining_id());
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
	private long _training_id;
	private long _content_id;
	private long _status;
	private long _udflag;
	private String _content_type;
	private String _notification_text;
	private String _pageurl;
	private BaseModel<?> _trainingcontentuniqueinformationRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}