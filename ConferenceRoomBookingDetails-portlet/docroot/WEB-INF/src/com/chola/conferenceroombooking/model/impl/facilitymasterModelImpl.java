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

package com.chola.conferenceroombooking.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.model.facilitymaster;
import com.chola.conferenceroombooking.model.facilitymasterModel;
import com.chola.conferenceroombooking.model.facilitymasterSoap;

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
 * The base model implementation for the facilitymaster service. Represents a row in the &quot;branch_facilitymaster&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link facilitymasterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link facilitymasterImpl}.
 * </p>
 *
 * @author adms.java1
 * @see facilitymasterImpl
 * @see facilitymaster
 * @see facilitymasterModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class facilitymasterModelImpl extends BaseModelImpl<facilitymaster>
	implements facilitymasterModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a facilitymaster model instance should use the {@link facilitymaster} interface instead.
	 */
	public static final String TABLE_NAME = "branch_facilitymaster";
	public static final Object[][] TABLE_COLUMNS = {
			{ "facility_id", Types.BIGINT },
			{ "facility_name", Types.VARCHAR },
			{ "facility_description", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("facility_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("facility_name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("facility_description", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table branch_facilitymaster (facility_id LONG not null primary key,facility_name VARCHAR(100) null,facility_description VARCHAR(100) null)";
	public static final String TABLE_SQL_DROP = "drop table branch_facilitymaster";
	public static final String ORDER_BY_JPQL = " ORDER BY facilitymaster.facility_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY branch_facilitymaster.facility_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.chola.conferenceroombooking.model.facilitymaster"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.chola.conferenceroombooking.model.facilitymaster"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static facilitymaster toModel(facilitymasterSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		facilitymaster model = new facilitymasterImpl();

		model.setFacility_id(soapModel.getFacility_id());
		model.setFacility_name(soapModel.getFacility_name());
		model.setFacility_description(soapModel.getFacility_description());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<facilitymaster> toModels(facilitymasterSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<facilitymaster> models = new ArrayList<facilitymaster>(soapModels.length);

		for (facilitymasterSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.chola.conferenceroombooking.model.facilitymaster"));

	public facilitymasterModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _facility_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFacility_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _facility_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return facilitymaster.class;
	}

	@Override
	public String getModelClassName() {
		return facilitymaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("facility_id", getFacility_id());
		attributes.put("facility_name", getFacility_name());
		attributes.put("facility_description", getFacility_description());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long facility_id = (Long)attributes.get("facility_id");

		if (facility_id != null) {
			setFacility_id(facility_id);
		}

		String facility_name = (String)attributes.get("facility_name");

		if (facility_name != null) {
			setFacility_name(facility_name);
		}

		String facility_description = (String)attributes.get(
				"facility_description");

		if (facility_description != null) {
			setFacility_description(facility_description);
		}
	}

	@JSON
	@Override
	public long getFacility_id() {
		return _facility_id;
	}

	@Override
	public void setFacility_id(long facility_id) {
		_facility_id = facility_id;
	}

	@JSON
	@Override
	public String getFacility_name() {
		if (_facility_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _facility_name;
		}
	}

	@Override
	public void setFacility_name(String facility_name) {
		_facility_name = facility_name;
	}

	@JSON
	@Override
	public String getFacility_description() {
		if (_facility_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _facility_description;
		}
	}

	@Override
	public void setFacility_description(String facility_description) {
		_facility_description = facility_description;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			facilitymaster.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public facilitymaster toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (facilitymaster)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		facilitymasterImpl facilitymasterImpl = new facilitymasterImpl();

		facilitymasterImpl.setFacility_id(getFacility_id());
		facilitymasterImpl.setFacility_name(getFacility_name());
		facilitymasterImpl.setFacility_description(getFacility_description());

		facilitymasterImpl.resetOriginalValues();

		return facilitymasterImpl;
	}

	@Override
	public int compareTo(facilitymaster facilitymaster) {
		long primaryKey = facilitymaster.getPrimaryKey();

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

		if (!(obj instanceof facilitymaster)) {
			return false;
		}

		facilitymaster facilitymaster = (facilitymaster)obj;

		long primaryKey = facilitymaster.getPrimaryKey();

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
	public CacheModel<facilitymaster> toCacheModel() {
		facilitymasterCacheModel facilitymasterCacheModel = new facilitymasterCacheModel();

		facilitymasterCacheModel.facility_id = getFacility_id();

		facilitymasterCacheModel.facility_name = getFacility_name();

		String facility_name = facilitymasterCacheModel.facility_name;

		if ((facility_name != null) && (facility_name.length() == 0)) {
			facilitymasterCacheModel.facility_name = null;
		}

		facilitymasterCacheModel.facility_description = getFacility_description();

		String facility_description = facilitymasterCacheModel.facility_description;

		if ((facility_description != null) &&
				(facility_description.length() == 0)) {
			facilitymasterCacheModel.facility_description = null;
		}

		return facilitymasterCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{facility_id=");
		sb.append(getFacility_id());
		sb.append(", facility_name=");
		sb.append(getFacility_name());
		sb.append(", facility_description=");
		sb.append(getFacility_description());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.chola.conferenceroombooking.model.facilitymaster");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>facility_id</column-name><column-value><![CDATA[");
		sb.append(getFacility_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facility_name</column-name><column-value><![CDATA[");
		sb.append(getFacility_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facility_description</column-name><column-value><![CDATA[");
		sb.append(getFacility_description());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = facilitymaster.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			facilitymaster.class
		};
	private long _facility_id;
	private String _facility_name;
	private String _facility_description;
	private facilitymaster _escapedModel;
}