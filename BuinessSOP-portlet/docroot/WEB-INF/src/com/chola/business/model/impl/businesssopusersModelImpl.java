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

package com.chola.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.model.businesssopusers;
import com.chola.business.model.businesssopusersModel;
import com.chola.business.model.businesssopusersSoap;

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

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the businesssopusers service. Represents a row in the &quot;chola_businesssopusers&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link businesssopusersModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link businesssopusersImpl}.
 * </p>
 *
 * @author adms.java1
 * @see businesssopusersImpl
 * @see businesssopusers
 * @see businesssopusersModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class businesssopusersModelImpl extends BaseModelImpl<businesssopusers>
	implements businesssopusersModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a businesssopusers model instance should use the {@link businesssopusers} interface instead.
	 */
	public static final String TABLE_NAME = "chola_businesssopusers";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "user_id", Types.BIGINT },
			{ "businessdetails_id", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("user_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("businessdetails_id", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table chola_businesssopusers (id_ LONG not null primary key,user_id LONG,businessdetails_id LONG)";
	public static final String TABLE_SQL_DROP = "drop table chola_businesssopusers";
	public static final String ORDER_BY_JPQL = " ORDER BY businesssopusers.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY chola_businesssopusers.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.chola.business.model.businesssopusers"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.chola.business.model.businesssopusers"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.chola.business.model.businesssopusers"),
			true);
	public static final long BUSINESSDETAILS_ID_COLUMN_BITMASK = 1L;
	public static final long USER_ID_COLUMN_BITMASK = 2L;
	public static final long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static businesssopusers toModel(businesssopusersSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		businesssopusers model = new businesssopusersImpl();

		model.setId(soapModel.getId());
		model.setUser_id(soapModel.getUser_id());
		model.setBusinessdetails_id(soapModel.getBusinessdetails_id());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<businesssopusers> toModels(
		businesssopusersSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<businesssopusers> models = new ArrayList<businesssopusers>(soapModels.length);

		for (businesssopusersSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.chola.business.model.businesssopusers"));

	public businesssopusersModelImpl() {
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
	public Class<?> getModelClass() {
		return businesssopusers.class;
	}

	@Override
	public String getModelClassName() {
		return businesssopusers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("businessdetails_id", getBusinessdetails_id());

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

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long businessdetails_id = (Long)attributes.get("businessdetails_id");

		if (businessdetails_id != null) {
			setBusinessdetails_id(businessdetails_id);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public long getUser_id() {
		return _user_id;
	}

	@Override
	public void setUser_id(long user_id) {
		_columnBitmask |= USER_ID_COLUMN_BITMASK;

		if (!_setOriginalUser_id) {
			_setOriginalUser_id = true;

			_originalUser_id = _user_id;
		}

		_user_id = user_id;
	}

	public long getOriginalUser_id() {
		return _originalUser_id;
	}

	@JSON
	@Override
	public long getBusinessdetails_id() {
		return _businessdetails_id;
	}

	@Override
	public void setBusinessdetails_id(long businessdetails_id) {
		_columnBitmask |= BUSINESSDETAILS_ID_COLUMN_BITMASK;

		if (!_setOriginalBusinessdetails_id) {
			_setOriginalBusinessdetails_id = true;

			_originalBusinessdetails_id = _businessdetails_id;
		}

		_businessdetails_id = businessdetails_id;
	}

	public long getOriginalBusinessdetails_id() {
		return _originalBusinessdetails_id;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			businesssopusers.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public businesssopusers toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (businesssopusers)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		businesssopusersImpl businesssopusersImpl = new businesssopusersImpl();

		businesssopusersImpl.setId(getId());
		businesssopusersImpl.setUser_id(getUser_id());
		businesssopusersImpl.setBusinessdetails_id(getBusinessdetails_id());

		businesssopusersImpl.resetOriginalValues();

		return businesssopusersImpl;
	}

	@Override
	public int compareTo(businesssopusers businesssopusers) {
		long primaryKey = businesssopusers.getPrimaryKey();

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

		if (!(obj instanceof businesssopusers)) {
			return false;
		}

		businesssopusers businesssopusers = (businesssopusers)obj;

		long primaryKey = businesssopusers.getPrimaryKey();

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
		businesssopusersModelImpl businesssopusersModelImpl = this;

		businesssopusersModelImpl._originalUser_id = businesssopusersModelImpl._user_id;

		businesssopusersModelImpl._setOriginalUser_id = false;

		businesssopusersModelImpl._originalBusinessdetails_id = businesssopusersModelImpl._businessdetails_id;

		businesssopusersModelImpl._setOriginalBusinessdetails_id = false;

		businesssopusersModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<businesssopusers> toCacheModel() {
		businesssopusersCacheModel businesssopusersCacheModel = new businesssopusersCacheModel();

		businesssopusersCacheModel.id = getId();

		businesssopusersCacheModel.user_id = getUser_id();

		businesssopusersCacheModel.businessdetails_id = getBusinessdetails_id();

		return businesssopusersCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", businessdetails_id=");
		sb.append(getBusinessdetails_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.chola.business.model.businesssopusers");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessdetails_id</column-name><column-value><![CDATA[");
		sb.append(getBusinessdetails_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = businesssopusers.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			businesssopusers.class
		};
	private long _id;
	private long _user_id;
	private long _originalUser_id;
	private boolean _setOriginalUser_id;
	private long _businessdetails_id;
	private long _originalBusinessdetails_id;
	private boolean _setOriginalBusinessdetails_id;
	private long _columnBitmask;
	private businesssopusers _escapedModel;
}