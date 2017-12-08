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

import com.chola.productbuysell.service.BuySellProductsLocalServiceUtil;
import com.chola.productbuysell.service.ClpSerializer;

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
public class BuySellProductsClp extends BaseModelImpl<BuySellProducts>
	implements BuySellProducts {
	public BuySellProductsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BuySellProducts.class;
	}

	@Override
	public String getModelClassName() {
		return BuySellProducts.class.getName();
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
		attributes.put("sellerName", getSellerName());
		attributes.put("contactNumber", getContactNumber());
		attributes.put("content_id", getContent_id());
		attributes.put("category_id", getCategory_id());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("askingPrice", getAskingPrice());
		attributes.put("userScreenName", getUserScreenName());
		attributes.put("location", getLocation());
		attributes.put("status", getStatus());
		attributes.put("approvedstatus", getApprovedstatus());
		attributes.put("created_date", getCreated_date());

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

		String sellerName = (String)attributes.get("sellerName");

		if (sellerName != null) {
			setSellerName(sellerName);
		}

		String contactNumber = (String)attributes.get("contactNumber");

		if (contactNumber != null) {
			setContactNumber(contactNumber);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		Long category_id = (Long)attributes.get("category_id");

		if (category_id != null) {
			setCategory_id(category_id);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String askingPrice = (String)attributes.get("askingPrice");

		if (askingPrice != null) {
			setAskingPrice(askingPrice);
		}

		String userScreenName = (String)attributes.get("userScreenName");

		if (userScreenName != null) {
			setUserScreenName(userScreenName);
		}

		Long location = (Long)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long approvedstatus = (Long)attributes.get("approvedstatus");

		if (approvedstatus != null) {
			setApprovedstatus(approvedstatus);
		}

		Date created_date = (Date)attributes.get("created_date");

		if (created_date != null) {
			setCreated_date(created_date);
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

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_buySellProductsRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSellerName() {
		return _sellerName;
	}

	@Override
	public void setSellerName(String sellerName) {
		_sellerName = sellerName;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setSellerName", String.class);

				method.invoke(_buySellProductsRemoteModel, sellerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactNumber() {
		return _contactNumber;
	}

	@Override
	public void setContactNumber(String contactNumber) {
		_contactNumber = contactNumber;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setContactNumber", String.class);

				method.invoke(_buySellProductsRemoteModel, contactNumber);
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

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_buySellProductsRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCategory_id() {
		return _category_id;
	}

	@Override
	public void setCategory_id(long category_id) {
		_category_id = category_id;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setCategory_id", long.class);

				method.invoke(_buySellProductsRemoteModel, category_id);
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

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_buySellProductsRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_buySellProductsRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAskingPrice() {
		return _askingPrice;
	}

	@Override
	public void setAskingPrice(String askingPrice) {
		_askingPrice = askingPrice;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setAskingPrice", String.class);

				method.invoke(_buySellProductsRemoteModel, askingPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserScreenName() {
		return _userScreenName;
	}

	@Override
	public void setUserScreenName(String userScreenName) {
		_userScreenName = userScreenName;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserScreenName",
						String.class);

				method.invoke(_buySellProductsRemoteModel, userScreenName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLocation() {
		return _location;
	}

	@Override
	public void setLocation(long location) {
		_location = location;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", long.class);

				method.invoke(_buySellProductsRemoteModel, location);
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

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", long.class);

				method.invoke(_buySellProductsRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getApprovedstatus() {
		return _approvedstatus;
	}

	@Override
	public void setApprovedstatus(long approvedstatus) {
		_approvedstatus = approvedstatus;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedstatus", long.class);

				method.invoke(_buySellProductsRemoteModel, approvedstatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreated_date() {
		return _created_date;
	}

	@Override
	public void setCreated_date(Date created_date) {
		_created_date = created_date;

		if (_buySellProductsRemoteModel != null) {
			try {
				Class<?> clazz = _buySellProductsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreated_date", Date.class);

				method.invoke(_buySellProductsRemoteModel, created_date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBuySellProductsRemoteModel() {
		return _buySellProductsRemoteModel;
	}

	public void setBuySellProductsRemoteModel(
		BaseModel<?> buySellProductsRemoteModel) {
		_buySellProductsRemoteModel = buySellProductsRemoteModel;
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

		Class<?> remoteModelClass = _buySellProductsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_buySellProductsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			BuySellProductsLocalServiceUtil.addBuySellProducts(this);
		}
		else {
			BuySellProductsLocalServiceUtil.updateBuySellProducts(this);
		}
	}

	@Override
	public BuySellProducts toEscapedModel() {
		return (BuySellProducts)ProxyUtil.newProxyInstance(BuySellProducts.class.getClassLoader(),
			new Class[] { BuySellProducts.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BuySellProductsClp clone = new BuySellProductsClp();

		clone.setId(getId());
		clone.setSellerName(getSellerName());
		clone.setContactNumber(getContactNumber());
		clone.setContent_id(getContent_id());
		clone.setCategory_id(getCategory_id());
		clone.setTitle(getTitle());
		clone.setDescription(getDescription());
		clone.setAskingPrice(getAskingPrice());
		clone.setUserScreenName(getUserScreenName());
		clone.setLocation(getLocation());
		clone.setStatus(getStatus());
		clone.setApprovedstatus(getApprovedstatus());
		clone.setCreated_date(getCreated_date());

		return clone;
	}

	@Override
	public int compareTo(BuySellProducts buySellProducts) {
		int value = 0;

		value = DateUtil.compareTo(getCreated_date(),
				buySellProducts.getCreated_date());

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

		if (!(obj instanceof BuySellProductsClp)) {
			return false;
		}

		BuySellProductsClp buySellProducts = (BuySellProductsClp)obj;

		long primaryKey = buySellProducts.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", sellerName=");
		sb.append(getSellerName());
		sb.append(", contactNumber=");
		sb.append(getContactNumber());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", category_id=");
		sb.append(getCategory_id());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", askingPrice=");
		sb.append(getAskingPrice());
		sb.append(", userScreenName=");
		sb.append(getUserScreenName());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", approvedstatus=");
		sb.append(getApprovedstatus());
		sb.append(", created_date=");
		sb.append(getCreated_date());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.chola.productbuysell.model.BuySellProducts");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sellerName</column-name><column-value><![CDATA[");
		sb.append(getSellerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactNumber</column-name><column-value><![CDATA[");
		sb.append(getContactNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content_id</column-name><column-value><![CDATA[");
		sb.append(getContent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category_id</column-name><column-value><![CDATA[");
		sb.append(getCategory_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>askingPrice</column-name><column-value><![CDATA[");
		sb.append(getAskingPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userScreenName</column-name><column-value><![CDATA[");
		sb.append(getUserScreenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedstatus</column-name><column-value><![CDATA[");
		sb.append(getApprovedstatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>created_date</column-name><column-value><![CDATA[");
		sb.append(getCreated_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _sellerName;
	private String _contactNumber;
	private long _content_id;
	private long _category_id;
	private String _title;
	private String _description;
	private String _askingPrice;
	private String _userScreenName;
	private long _location;
	private long _status;
	private long _approvedstatus;
	private Date _created_date;
	private BaseModel<?> _buySellProductsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}