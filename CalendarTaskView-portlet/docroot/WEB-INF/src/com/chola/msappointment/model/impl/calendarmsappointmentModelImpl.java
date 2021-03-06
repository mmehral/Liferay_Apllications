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

package com.chola.msappointment.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.msappointment.model.calendarmsappointment;
import com.chola.msappointment.model.calendarmsappointmentModel;
import com.chola.msappointment.model.calendarmsappointmentSoap;

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
 * The base model implementation for the calendarmsappointment service. Represents a row in the &quot;chola_calendarmsappointment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link calendarmsappointmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link calendarmsappointmentImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see calendarmsappointmentImpl
 * @see calendarmsappointment
 * @see calendarmsappointmentModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class calendarmsappointmentModelImpl extends BaseModelImpl<calendarmsappointment>
	implements calendarmsappointmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a calendarmsappointment model instance should use the {@link calendarmsappointment} interface instead.
	 */
	public static final String TABLE_NAME = "chola_calendarmsappointment";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table chola_calendarmsappointment (id_ LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table chola_calendarmsappointment";
	public static final String ORDER_BY_JPQL = " ORDER BY calendarmsappointment.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY chola_calendarmsappointment.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.chola.msappointment.model.calendarmsappointment"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.chola.msappointment.model.calendarmsappointment"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static calendarmsappointment toModel(
		calendarmsappointmentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		calendarmsappointment model = new calendarmsappointmentImpl();

		model.setId(soapModel.getId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<calendarmsappointment> toModels(
		calendarmsappointmentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<calendarmsappointment> models = new ArrayList<calendarmsappointment>(soapModels.length);

		for (calendarmsappointmentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.chola.msappointment.model.calendarmsappointment"));

	public calendarmsappointmentModelImpl() {
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
		return calendarmsappointment.class;
	}

	@Override
	public String getModelClassName() {
		return calendarmsappointment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());

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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			calendarmsappointment.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public calendarmsappointment toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (calendarmsappointment)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		calendarmsappointmentImpl calendarmsappointmentImpl = new calendarmsappointmentImpl();

		calendarmsappointmentImpl.setId(getId());

		calendarmsappointmentImpl.resetOriginalValues();

		return calendarmsappointmentImpl;
	}

	@Override
	public int compareTo(calendarmsappointment calendarmsappointment) {
		long primaryKey = calendarmsappointment.getPrimaryKey();

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

		if (!(obj instanceof calendarmsappointment)) {
			return false;
		}

		calendarmsappointment calendarmsappointment = (calendarmsappointment)obj;

		long primaryKey = calendarmsappointment.getPrimaryKey();

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
	public CacheModel<calendarmsappointment> toCacheModel() {
		calendarmsappointmentCacheModel calendarmsappointmentCacheModel = new calendarmsappointmentCacheModel();

		calendarmsappointmentCacheModel.id = getId();

		return calendarmsappointmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{id=");
		sb.append(getId());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("com.chola.msappointment.model.calendarmsappointment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = calendarmsappointment.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			calendarmsappointment.class
		};
	private long _id;
	private calendarmsappointment _escapedModel;
}