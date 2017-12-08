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

package com.chola.industrynews.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.industrynews.service.ClpSerializer;
import com.chola.industrynews.service.LatestIndustryNewsLocalServiceUtil;

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
public class LatestIndustryNewsClp extends BaseModelImpl<LatestIndustryNews>
	implements LatestIndustryNews {
	public LatestIndustryNewsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LatestIndustryNews.class;
	}

	@Override
	public String getModelClassName() {
		return LatestIndustryNews.class.getName();
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
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("createdate", getCreatedate());

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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String createdate = (String)attributes.get("createdate");

		if (createdate != null) {
			setCreatedate(createdate);
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

		if (_latestIndustryNewsRemoteModel != null) {
			try {
				Class<?> clazz = _latestIndustryNewsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_latestIndustryNewsRemoteModel, id);
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

		if (_latestIndustryNewsRemoteModel != null) {
			try {
				Class<?> clazz = _latestIndustryNewsRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_latestIndustryNewsRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContent() {
		return _content;
	}

	@Override
	public void setContent(String content) {
		_content = content;

		if (_latestIndustryNewsRemoteModel != null) {
			try {
				Class<?> clazz = _latestIndustryNewsRemoteModel.getClass();

				Method method = clazz.getMethod("setContent", String.class);

				method.invoke(_latestIndustryNewsRemoteModel, content);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedate() {
		return _createdate;
	}

	@Override
	public void setCreatedate(String createdate) {
		_createdate = createdate;

		if (_latestIndustryNewsRemoteModel != null) {
			try {
				Class<?> clazz = _latestIndustryNewsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedate", String.class);

				method.invoke(_latestIndustryNewsRemoteModel, createdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLatestIndustryNewsRemoteModel() {
		return _latestIndustryNewsRemoteModel;
	}

	public void setLatestIndustryNewsRemoteModel(
		BaseModel<?> latestIndustryNewsRemoteModel) {
		_latestIndustryNewsRemoteModel = latestIndustryNewsRemoteModel;
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

		Class<?> remoteModelClass = _latestIndustryNewsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_latestIndustryNewsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			LatestIndustryNewsLocalServiceUtil.addLatestIndustryNews(this);
		}
		else {
			LatestIndustryNewsLocalServiceUtil.updateLatestIndustryNews(this);
		}
	}

	@Override
	public LatestIndustryNews toEscapedModel() {
		return (LatestIndustryNews)ProxyUtil.newProxyInstance(LatestIndustryNews.class.getClassLoader(),
			new Class[] { LatestIndustryNews.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LatestIndustryNewsClp clone = new LatestIndustryNewsClp();

		clone.setId(getId());
		clone.setTitle(getTitle());
		clone.setContent(getContent());
		clone.setCreatedate(getCreatedate());

		return clone;
	}

	@Override
	public int compareTo(LatestIndustryNews latestIndustryNews) {
		long primaryKey = latestIndustryNews.getPrimaryKey();

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

		if (!(obj instanceof LatestIndustryNewsClp)) {
			return false;
		}

		LatestIndustryNewsClp latestIndustryNews = (LatestIndustryNewsClp)obj;

		long primaryKey = latestIndustryNews.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", createdate=");
		sb.append(getCreatedate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.chola.industrynews.model.LatestIndustryNews");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdate</column-name><column-value><![CDATA[");
		sb.append(getCreatedate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _title;
	private String _content;
	private String _createdate;
	private BaseModel<?> _latestIndustryNewsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}