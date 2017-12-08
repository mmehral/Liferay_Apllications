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

package com.chola.productbuysell.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.productbuysell.service.BuySellProductsImagesLocalServiceUtil;
import com.chola.productbuysell.service.ClpSerializer;

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
public class BuySellProductsImagesClp extends BaseModelImpl<BuySellProductsImages>
	implements BuySellProductsImages {
	public BuySellProductsImagesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BuySellProductsImages.class;
	}

	@Override
	public String getModelClassName() {
		return BuySellProductsImages.class.getName();
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
		attributes.put("content_id", getContent_id());
		attributes.put("image_name", getImage_name());
		attributes.put("image_path", getImage_path());
		attributes.put("product_id", getProduct_id());

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

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		String image_name = (String)attributes.get("image_name");

		if (image_name != null) {
			setImage_name(image_name);
		}

		String image_path = (String)attributes.get("image_path");

		if (image_path != null) {
			setImage_path(image_path);
		}

		Long product_id = (Long)attributes.get("product_id");

		if (product_id != null) {
			setProduct_id(product_id);
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

		if (_buySellProductsImagesRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsImagesRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_buySellProductsImagesRemoteModel, id);
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

		if (_buySellProductsImagesRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsImagesRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_buySellProductsImagesRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImage_name() {
		return _image_name;
	}

	@Override
	public void setImage_name(String image_name) {
		_image_name = image_name;

		if (_buySellProductsImagesRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsImagesRemoteModel.getClass();

				Method method = clazz.getMethod("setImage_name", String.class);

				method.invoke(_buySellProductsImagesRemoteModel, image_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImage_path() {
		return _image_path;
	}

	@Override
	public void setImage_path(String image_path) {
		_image_path = image_path;

		if (_buySellProductsImagesRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsImagesRemoteModel.getClass();

				Method method = clazz.getMethod("setImage_path", String.class);

				method.invoke(_buySellProductsImagesRemoteModel, image_path);
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

		if (_buySellProductsImagesRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsImagesRemoteModel.getClass();

				Method method = clazz.getMethod("setProduct_id", long.class);

				method.invoke(_buySellProductsImagesRemoteModel, product_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBuySellProductsImagesRemoteModel() {
		return _buySellProductsImagesRemoteModel;
	}

	public void setBuySellProductsImagesRemoteModel(
		BaseModel<?> buySellProductsImagesRemoteModel) {
		_buySellProductsImagesRemoteModel = buySellProductsImagesRemoteModel;
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

		Class<?> remoteModelClass = _buySellProductsImagesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_buySellProductsImagesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			BuySellProductsImagesLocalServiceUtil.addBuySellProductsImages(this);
		}
		else {
			BuySellProductsImagesLocalServiceUtil.updateBuySellProductsImages(this);
		}
	}

	@Override
	public BuySellProductsImages toEscapedModel() {
		return (BuySellProductsImages)ProxyUtil.newProxyInstance(BuySellProductsImages.class.getClassLoader(),
			new Class[] { BuySellProductsImages.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BuySellProductsImagesClp clone = new BuySellProductsImagesClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setImage_name(getImage_name());
		clone.setImage_path(getImage_path());
		clone.setProduct_id(getProduct_id());

		return clone;
	}

	@Override
	public int compareTo(BuySellProductsImages buySellProductsImages) {
		long primaryKey = buySellProductsImages.getPrimaryKey();

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

		if (!(obj instanceof BuySellProductsImagesClp)) {
			return false;
		}

		BuySellProductsImagesClp buySellProductsImages = (BuySellProductsImagesClp)obj;

		long primaryKey = buySellProductsImages.getPrimaryKey();

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

		sb.append("{id=");
		sb.append(getId());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", image_name=");
		sb.append(getImage_name());
		sb.append(", image_path=");
		sb.append(getImage_path());
		sb.append(", product_id=");
		sb.append(getProduct_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.chola.productbuysell.model.BuySellProductsImages");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content_id</column-name><column-value><![CDATA[");
		sb.append(getContent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image_name</column-name><column-value><![CDATA[");
		sb.append(getImage_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image_path</column-name><column-value><![CDATA[");
		sb.append(getImage_path());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>product_id</column-name><column-value><![CDATA[");
		sb.append(getProduct_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _content_id;
	private String _image_name;
	private String _image_path;
	private long _product_id;
	private BaseModel<?> _buySellProductsImagesRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}