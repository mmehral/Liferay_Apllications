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

package com.customer.model;

import aQute.bnd.annotation.ProviderType;

import com.customer.service.ClpSerializer;
import com.customer.service.customerLocalServiceUtil;

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
public class customerClp extends BaseModelImpl<customer> implements customer {
	public customerClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return customer.class;
	}

	@Override
	public String getModelClassName() {
		return customer.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _customerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCustomerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("customerId", getCustomerId());
		attributes.put("name", getName());
		attributes.put("product", getProduct());
		attributes.put("PhoneNo", getPhoneNo());
		attributes.put("price", getPrice());
		attributes.put("email", getEmail());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String product = (String)attributes.get("product");

		if (product != null) {
			setProduct(product);
		}

		Integer PhoneNo = (Integer)attributes.get("PhoneNo");

		if (PhoneNo != null) {
			setPhoneNo(PhoneNo);
		}

		Float price = (Float)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getCustomerId() {
		return _customerId;
	}

	@Override
	public void setCustomerId(long customerId) {
		_customerId = customerId;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerId", long.class);

				method.invoke(_customerRemoteModel, customerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_customerRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProduct() {
		return _product;
	}

	@Override
	public void setProduct(String product) {
		_product = product;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setProduct", String.class);

				method.invoke(_customerRemoteModel, product);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPhoneNo() {
		return _PhoneNo;
	}

	@Override
	public void setPhoneNo(int PhoneNo) {
		_PhoneNo = PhoneNo;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setPhoneNo", int.class);

				method.invoke(_customerRemoteModel, PhoneNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public float getPrice() {
		return _price;
	}

	@Override
	public void setPrice(float price) {
		_price = price;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", float.class);

				method.invoke(_customerRemoteModel, price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_customerRemoteModel != null) {
			try {
				Class<?> clazz = _customerRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_customerRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcustomerRemoteModel() {
		return _customerRemoteModel;
	}

	public void setcustomerRemoteModel(BaseModel<?> customerRemoteModel) {
		_customerRemoteModel = customerRemoteModel;
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

		Class<?> remoteModelClass = _customerRemoteModel.getClass();

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

		Object returnValue = method.invoke(_customerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			customerLocalServiceUtil.addcustomer(this);
		}
		else {
			customerLocalServiceUtil.updatecustomer(this);
		}
	}

	@Override
	public customer toEscapedModel() {
		return (customer)ProxyUtil.newProxyInstance(customer.class.getClassLoader(),
			new Class[] { customer.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		customerClp clone = new customerClp();

		clone.setCustomerId(getCustomerId());
		clone.setName(getName());
		clone.setProduct(getProduct());
		clone.setPhoneNo(getPhoneNo());
		clone.setPrice(getPrice());
		clone.setEmail(getEmail());

		return clone;
	}

	@Override
	public int compareTo(customer customer) {
		long primaryKey = customer.getPrimaryKey();

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

		if (!(obj instanceof customerClp)) {
			return false;
		}

		customerClp customer = (customerClp)obj;

		long primaryKey = customer.getPrimaryKey();

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

		sb.append("{customerId=");
		sb.append(getCustomerId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", product=");
		sb.append(getProduct());
		sb.append(", PhoneNo=");
		sb.append(getPhoneNo());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.customer.model.customer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>customerId</column-name><column-value><![CDATA[");
		sb.append(getCustomerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>product</column-name><column-value><![CDATA[");
		sb.append(getProduct());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>PhoneNo</column-name><column-value><![CDATA[");
		sb.append(getPhoneNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _customerId;
	private String _name;
	private String _product;
	private int _PhoneNo;
	private float _price;
	private String _email;
	private BaseModel<?> _customerRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}