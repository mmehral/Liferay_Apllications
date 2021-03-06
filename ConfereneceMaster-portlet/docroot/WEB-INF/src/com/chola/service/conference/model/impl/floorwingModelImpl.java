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

package com.chola.service.conference.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.service.conference.model.floorwing;
import com.chola.service.conference.model.floorwingModel;
import com.chola.service.conference.model.floorwingSoap;

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
 * The base model implementation for the floorwing service. Represents a row in the &quot;cholaconference_floorwing&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link floorwingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link floorwingImpl}.
 * </p>
 *
 * @author adms.java1
 * @see floorwingImpl
 * @see floorwing
 * @see floorwingModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class floorwingModelImpl extends BaseModelImpl<floorwing>
	implements floorwingModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a floorwing model instance should use the {@link floorwing} interface instead.
	 */
	public static final String TABLE_NAME = "cholaconference_floorwing";
	public static final Object[][] TABLE_COLUMNS = {
			{ "floorwing_id", Types.BIGINT },
			{ "state_id", Types.BIGINT },
			{ "location_id", Types.BIGINT },
			{ "floor_name", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("floorwing_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("state_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("location_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("floor_name", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table cholaconference_floorwing (floorwing_id LONG not null primary key,state_id LONG,location_id LONG,floor_name VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table cholaconference_floorwing";
	public static final String ORDER_BY_JPQL = " ORDER BY floorwing.floorwing_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY cholaconference_floorwing.floorwing_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.chola.service.conference.model.floorwing"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.chola.service.conference.model.floorwing"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static floorwing toModel(floorwingSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		floorwing model = new floorwingImpl();

		model.setFloorwing_id(soapModel.getFloorwing_id());
		model.setState_id(soapModel.getState_id());
		model.setLocation_id(soapModel.getLocation_id());
		model.setFloor_name(soapModel.getFloor_name());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<floorwing> toModels(floorwingSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<floorwing> models = new ArrayList<floorwing>(soapModels.length);

		for (floorwingSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.chola.service.conference.model.floorwing"));

	public floorwingModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _floorwing_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFloorwing_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _floorwing_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return floorwing.class;
	}

	@Override
	public String getModelClassName() {
		return floorwing.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("floorwing_id", getFloorwing_id());
		attributes.put("state_id", getState_id());
		attributes.put("location_id", getLocation_id());
		attributes.put("floor_name", getFloor_name());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long floorwing_id = (Long)attributes.get("floorwing_id");

		if (floorwing_id != null) {
			setFloorwing_id(floorwing_id);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Long location_id = (Long)attributes.get("location_id");

		if (location_id != null) {
			setLocation_id(location_id);
		}

		String floor_name = (String)attributes.get("floor_name");

		if (floor_name != null) {
			setFloor_name(floor_name);
		}
	}

	@JSON
	@Override
	public long getFloorwing_id() {
		return _floorwing_id;
	}

	@Override
	public void setFloorwing_id(long floorwing_id) {
		_floorwing_id = floorwing_id;
	}

	@JSON
	@Override
	public long getState_id() {
		return _state_id;
	}

	@Override
	public void setState_id(long state_id) {
		_state_id = state_id;
	}

	@JSON
	@Override
	public long getLocation_id() {
		return _location_id;
	}

	@Override
	public void setLocation_id(long location_id) {
		_location_id = location_id;
	}

	@JSON
	@Override
	public String getFloor_name() {
		if (_floor_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _floor_name;
		}
	}

	@Override
	public void setFloor_name(String floor_name) {
		_floor_name = floor_name;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			floorwing.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public floorwing toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (floorwing)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		floorwingImpl floorwingImpl = new floorwingImpl();

		floorwingImpl.setFloorwing_id(getFloorwing_id());
		floorwingImpl.setState_id(getState_id());
		floorwingImpl.setLocation_id(getLocation_id());
		floorwingImpl.setFloor_name(getFloor_name());

		floorwingImpl.resetOriginalValues();

		return floorwingImpl;
	}

	@Override
	public int compareTo(floorwing floorwing) {
		long primaryKey = floorwing.getPrimaryKey();

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

		if (!(obj instanceof floorwing)) {
			return false;
		}

		floorwing floorwing = (floorwing)obj;

		long primaryKey = floorwing.getPrimaryKey();

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
	}

	@Override
	public CacheModel<floorwing> toCacheModel() {
		floorwingCacheModel floorwingCacheModel = new floorwingCacheModel();

		floorwingCacheModel.floorwing_id = getFloorwing_id();

		floorwingCacheModel.state_id = getState_id();

		floorwingCacheModel.location_id = getLocation_id();

		floorwingCacheModel.floor_name = getFloor_name();

		String floor_name = floorwingCacheModel.floor_name;

		if ((floor_name != null) && (floor_name.length() == 0)) {
			floorwingCacheModel.floor_name = null;
		}

		return floorwingCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{floorwing_id=");
		sb.append(getFloorwing_id());
		sb.append(", state_id=");
		sb.append(getState_id());
		sb.append(", location_id=");
		sb.append(getLocation_id());
		sb.append(", floor_name=");
		sb.append(getFloor_name());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.chola.service.conference.model.floorwing");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>floorwing_id</column-name><column-value><![CDATA[");
		sb.append(getFloorwing_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state_id</column-name><column-value><![CDATA[");
		sb.append(getState_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location_id</column-name><column-value><![CDATA[");
		sb.append(getLocation_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>floor_name</column-name><column-value><![CDATA[");
		sb.append(getFloor_name());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = floorwing.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			floorwing.class
		};
	private long _floorwing_id;
	private long _state_id;
	private long _location_id;
	private String _floor_name;
	private floorwing _escapedModel;
}