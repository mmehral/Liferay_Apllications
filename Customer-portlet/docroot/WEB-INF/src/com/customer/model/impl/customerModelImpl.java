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

package com.customer.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.customer.model.customer;
import com.customer.model.customerModel;
import com.customer.model.customerSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the customer service. Represents a row in the &quot;Z_customer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link customerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link customerImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see customerImpl
 * @see customer
 * @see customerModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class customerModelImpl extends BaseModelImpl<customer>
	implements customerModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a customer model instance should use the {@link customer} interface instead.
	 */
	public static final String TABLE_NAME = "Z_customer";
	public static final Object[][] TABLE_COLUMNS = {
			{ "customerId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "product", Types.VARCHAR },
			{ "PhoneNo", Types.INTEGER },
			{ "price", Types.FLOAT },
			{ "email", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("customerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("product", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("PhoneNo", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("price", Types.FLOAT);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table Z_customer (customerId LONG not null primary key,name VARCHAR(75) null,product VARCHAR(75) null,PhoneNo INTEGER,price DOUBLE,email VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Z_customer";
	public static final String ORDER_BY_JPQL = " ORDER BY customer.customerId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Z_customer.customerId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.customer.model.customer"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.customer.model.customer"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.customer.model.customer"),
			true);
	public static final long NAME_COLUMN_BITMASK = 1L;
	public static final long CUSTOMERID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static customer toModel(customerSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		customer model = new customerImpl();

		model.setCustomerId(soapModel.getCustomerId());
		model.setName(soapModel.getName());
		model.setProduct(soapModel.getProduct());
		model.setPhoneNo(soapModel.getPhoneNo());
		model.setPrice(soapModel.getPrice());
		model.setEmail(soapModel.getEmail());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<customer> toModels(customerSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<customer> models = new ArrayList<customer>(soapModels.length);

		for (customerSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.customer.model.customer"));

	public customerModelImpl() {
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
	public Class<?> getModelClass() {
		return customer.class;
	}

	@Override
	public String getModelClassName() {
		return customer.class.getName();
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
	}

	@JSON
	@Override
	public long getCustomerId() {
		return _customerId;
	}

	@Override
	public void setCustomerId(long customerId) {
		_customerId = customerId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public String getProduct() {
		if (_product == null) {
			return StringPool.BLANK;
		}
		else {
			return _product;
		}
	}

	@Override
	public void setProduct(String product) {
		_product = product;
	}

	@JSON
	@Override
	public int getPhoneNo() {
		return _PhoneNo;
	}

	@Override
	public void setPhoneNo(int PhoneNo) {
		_PhoneNo = PhoneNo;
	}

	@JSON
	@Override
	public float getPrice() {
		return _price;
	}

	@Override
	public void setPrice(float price) {
		_price = price;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			customer.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public customer toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (customer)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		customerImpl customerImpl = new customerImpl();

		customerImpl.setCustomerId(getCustomerId());
		customerImpl.setName(getName());
		customerImpl.setProduct(getProduct());
		customerImpl.setPhoneNo(getPhoneNo());
		customerImpl.setPrice(getPrice());
		customerImpl.setEmail(getEmail());

		customerImpl.resetOriginalValues();

		return customerImpl;
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

		if (!(obj instanceof customer)) {
			return false;
		}

		customer customer = (customer)obj;

		long primaryKey = customer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		customerModelImpl customerModelImpl = this;

		customerModelImpl._originalName = customerModelImpl._name;

		customerModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<customer> toCacheModel() {
		customerCacheModel customerCacheModel = new customerCacheModel();

		customerCacheModel.customerId = getCustomerId();

		customerCacheModel.name = getName();

		String name = customerCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			customerCacheModel.name = null;
		}

		customerCacheModel.product = getProduct();

		String product = customerCacheModel.product;

		if ((product != null) && (product.length() == 0)) {
			customerCacheModel.product = null;
		}

		customerCacheModel.PhoneNo = getPhoneNo();

		customerCacheModel.price = getPrice();

		customerCacheModel.email = getEmail();

		String email = customerCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			customerCacheModel.email = null;
		}

		return customerCacheModel;
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

	private static final ClassLoader _classLoader = customer.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			customer.class
		};
	private long _customerId;
	private String _name;
	private String _originalName;
	private String _product;
	private int _PhoneNo;
	private float _price;
	private String _email;
	private long _columnBitmask;
	private customer _escapedModel;
}