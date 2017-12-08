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

package com.chola.rating.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.rating.service.ClpSerializer;
import com.chola.rating.service.RatingLocalServiceUtil;

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
public class RatingClp extends BaseModelImpl<Rating> implements Rating {
	public RatingClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Rating.class;
	}

	@Override
	public String getModelClassName() {
		return Rating.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _ratingId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRatingId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ratingId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ratingId", getRatingId());
		attributes.put("content", getContent());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ratingId = (Long)attributes.get("ratingId");

		if (ratingId != null) {
			setRatingId(ratingId);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getRatingId() {
		return _ratingId;
	}

	@Override
	public void setRatingId(long ratingId) {
		_ratingId = ratingId;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setRatingId", long.class);

				method.invoke(_ratingRemoteModel, ratingId);
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

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setContent", String.class);

				method.invoke(_ratingRemoteModel, content);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRatingRemoteModel() {
		return _ratingRemoteModel;
	}

	public void setRatingRemoteModel(BaseModel<?> ratingRemoteModel) {
		_ratingRemoteModel = ratingRemoteModel;
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

		Class<?> remoteModelClass = _ratingRemoteModel.getClass();

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

		Object returnValue = method.invoke(_ratingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			RatingLocalServiceUtil.addRating(this);
		}
		else {
			RatingLocalServiceUtil.updateRating(this);
		}
	}

	@Override
	public Rating toEscapedModel() {
		return (Rating)ProxyUtil.newProxyInstance(Rating.class.getClassLoader(),
			new Class[] { Rating.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RatingClp clone = new RatingClp();

		clone.setRatingId(getRatingId());
		clone.setContent(getContent());

		return clone;
	}

	@Override
	public int compareTo(Rating rating) {
		long primaryKey = rating.getPrimaryKey();

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

		if (!(obj instanceof RatingClp)) {
			return false;
		}

		RatingClp rating = (RatingClp)obj;

		long primaryKey = rating.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{ratingId=");
		sb.append(getRatingId());
		sb.append(", content=");
		sb.append(getContent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.chola.rating.model.Rating");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ratingId</column-name><column-value><![CDATA[");
		sb.append(getRatingId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ratingId;
	private String _content;
	private BaseModel<?> _ratingRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}