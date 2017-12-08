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

package com.popular.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.popular.service.ClpSerializer;
import com.popular.service.popularlinksLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class popularlinksClp extends BaseModelImpl<popularlinks>
	implements popularlinks {
	public popularlinksClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return popularlinks.class;
	}

	@Override
	public String getModelClassName() {
		return popularlinks.class.getName();
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
		attributes.put("userid", getUserid());
		attributes.put("url", getUrl());
		attributes.put("tag", getTag());
		attributes.put("count", getCount());
		attributes.put("flag", getFlag());
		attributes.put("createDate", getCreateDate());

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

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String tag = (String)attributes.get("tag");

		if (tag != null) {
			setTag(tag);
		}

		Long count = (Long)attributes.get("count");

		if (count != null) {
			setCount(count);
		}

		Integer flag = (Integer)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
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

		if (_popularlinksRemoteModel != null) {
			try {
				Class<?> clazz = _popularlinksRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_popularlinksRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserid() {
		return _userid;
	}

	@Override
	public void setUserid(long userid) {
		_userid = userid;

		if (_popularlinksRemoteModel != null) {
			try {
				Class<?> clazz = _popularlinksRemoteModel.getClass();

				Method method = clazz.getMethod("setUserid", long.class);

				method.invoke(_popularlinksRemoteModel, userid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUrl() {
		return _url;
	}

	@Override
	public void setUrl(String url) {
		_url = url;

		if (_popularlinksRemoteModel != null) {
			try {
				Class<?> clazz = _popularlinksRemoteModel.getClass();

				Method method = clazz.getMethod("setUrl", String.class);

				method.invoke(_popularlinksRemoteModel, url);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTag() {
		return _tag;
	}

	@Override
	public void setTag(String tag) {
		_tag = tag;

		if (_popularlinksRemoteModel != null) {
			try {
				Class<?> clazz = _popularlinksRemoteModel.getClass();

				Method method = clazz.getMethod("setTag", String.class);

				method.invoke(_popularlinksRemoteModel, tag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCount() {
		return _count;
	}

	@Override
	public void setCount(long count) {
		_count = count;

		if (_popularlinksRemoteModel != null) {
			try {
				Class<?> clazz = _popularlinksRemoteModel.getClass();

				Method method = clazz.getMethod("setCount", long.class);

				method.invoke(_popularlinksRemoteModel, count);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFlag() {
		return _flag;
	}

	@Override
	public void setFlag(int flag) {
		_flag = flag;

		if (_popularlinksRemoteModel != null) {
			try {
				Class<?> clazz = _popularlinksRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", int.class);

				method.invoke(_popularlinksRemoteModel, flag);
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

		if (_popularlinksRemoteModel != null) {
			try {
				Class<?> clazz = _popularlinksRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_popularlinksRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getpopularlinksRemoteModel() {
		return _popularlinksRemoteModel;
	}

	public void setpopularlinksRemoteModel(BaseModel<?> popularlinksRemoteModel) {
		_popularlinksRemoteModel = popularlinksRemoteModel;
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

		Class<?> remoteModelClass = _popularlinksRemoteModel.getClass();

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

		Object returnValue = method.invoke(_popularlinksRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			popularlinksLocalServiceUtil.addpopularlinks(this);
		}
		else {
			popularlinksLocalServiceUtil.updatepopularlinks(this);
		}
	}

	@Override
	public popularlinks toEscapedModel() {
		return (popularlinks)ProxyUtil.newProxyInstance(popularlinks.class.getClassLoader(),
			new Class[] { popularlinks.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		popularlinksClp clone = new popularlinksClp();

		clone.setId(getId());
		clone.setUserid(getUserid());
		clone.setUrl(getUrl());
		clone.setTag(getTag());
		clone.setCount(getCount());
		clone.setFlag(getFlag());
		clone.setCreateDate(getCreateDate());

		return clone;
	}

	@Override
	public int compareTo(popularlinks popularlinks) {
		long primaryKey = popularlinks.getPrimaryKey();

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

		if (!(obj instanceof popularlinksClp)) {
			return false;
		}

		popularlinksClp popularlinks = (popularlinksClp)obj;

		long primaryKey = popularlinks.getPrimaryKey();

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
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", tag=");
		sb.append(getTag());
		sb.append(", count=");
		sb.append(getCount());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.popular.model.popularlinks");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tag</column-name><column-value><![CDATA[");
		sb.append(getTag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>count</column-name><column-value><![CDATA[");
		sb.append(getCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userid;
	private String _url;
	private String _tag;
	private long _count;
	private int _flag;
	private Date _createDate;
	private BaseModel<?> _popularlinksRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}