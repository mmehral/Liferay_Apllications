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

package com.chola.trainingcalendar.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.model.trainingintendedtable;
import com.chola.trainingcalendar.model.trainingintendedtableModel;
import com.chola.trainingcalendar.model.trainingintendedtableSoap;

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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the trainingintendedtable service. Represents a row in the &quot;chola_trainingintendedtable&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link trainingintendedtableModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link trainingintendedtableImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingintendedtableImpl
 * @see trainingintendedtable
 * @see trainingintendedtableModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class trainingintendedtableModelImpl extends BaseModelImpl<trainingintendedtable>
	implements trainingintendedtableModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a trainingintendedtable model instance should use the {@link trainingintendedtable} interface instead.
	 */
	public static final String TABLE_NAME = "chola_trainingintendedtable";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "trainingid", Types.BIGINT },
			{ "userid", Types.VARCHAR },
			{ "screenname", Types.VARCHAR },
			{ "createddate", Types.TIMESTAMP },
			{ "flag", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("trainingid", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userid", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("screenname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createddate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("flag", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table chola_trainingintendedtable (id_ LONG not null primary key,trainingid LONG,userid VARCHAR(75) null,screenname VARCHAR(75) null,createddate DATE null,flag INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table chola_trainingintendedtable";
	public static final String ORDER_BY_JPQL = " ORDER BY trainingintendedtable.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY chola_trainingintendedtable.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.chola.trainingcalendar.model.trainingintendedtable"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.chola.trainingcalendar.model.trainingintendedtable"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static trainingintendedtable toModel(
		trainingintendedtableSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		trainingintendedtable model = new trainingintendedtableImpl();

		model.setId(soapModel.getId());
		model.setTrainingid(soapModel.getTrainingid());
		model.setUserid(soapModel.getUserid());
		model.setScreenname(soapModel.getScreenname());
		model.setCreateddate(soapModel.getCreateddate());
		model.setFlag(soapModel.getFlag());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<trainingintendedtable> toModels(
		trainingintendedtableSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<trainingintendedtable> models = new ArrayList<trainingintendedtable>(soapModels.length);

		for (trainingintendedtableSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.chola.trainingcalendar.model.trainingintendedtable"));

	public trainingintendedtableModelImpl() {
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
		return trainingintendedtable.class;
	}

	@Override
	public String getModelClassName() {
		return trainingintendedtable.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("trainingid", getTrainingid());
		attributes.put("userid", getUserid());
		attributes.put("screenname", getScreenname());
		attributes.put("createddate", getCreateddate());
		attributes.put("flag", getFlag());

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

		Long trainingid = (Long)attributes.get("trainingid");

		if (trainingid != null) {
			setTrainingid(trainingid);
		}

		String userid = (String)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		String screenname = (String)attributes.get("screenname");

		if (screenname != null) {
			setScreenname(screenname);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		Integer flag = (Integer)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
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
	public long getTrainingid() {
		return _trainingid;
	}

	@Override
	public void setTrainingid(long trainingid) {
		_trainingid = trainingid;
	}

	@JSON
	@Override
	public String getUserid() {
		if (_userid == null) {
			return StringPool.BLANK;
		}
		else {
			return _userid;
		}
	}

	@Override
	public void setUserid(String userid) {
		_userid = userid;
	}

	@JSON
	@Override
	public String getScreenname() {
		if (_screenname == null) {
			return StringPool.BLANK;
		}
		else {
			return _screenname;
		}
	}

	@Override
	public void setScreenname(String screenname) {
		_screenname = screenname;
	}

	@JSON
	@Override
	public Date getCreateddate() {
		return _createddate;
	}

	@Override
	public void setCreateddate(Date createddate) {
		_createddate = createddate;
	}

	@JSON
	@Override
	public int getFlag() {
		return _flag;
	}

	@Override
	public void setFlag(int flag) {
		_flag = flag;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			trainingintendedtable.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public trainingintendedtable toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (trainingintendedtable)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		trainingintendedtableImpl trainingintendedtableImpl = new trainingintendedtableImpl();

		trainingintendedtableImpl.setId(getId());
		trainingintendedtableImpl.setTrainingid(getTrainingid());
		trainingintendedtableImpl.setUserid(getUserid());
		trainingintendedtableImpl.setScreenname(getScreenname());
		trainingintendedtableImpl.setCreateddate(getCreateddate());
		trainingintendedtableImpl.setFlag(getFlag());

		trainingintendedtableImpl.resetOriginalValues();

		return trainingintendedtableImpl;
	}

	@Override
	public int compareTo(trainingintendedtable trainingintendedtable) {
		long primaryKey = trainingintendedtable.getPrimaryKey();

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

		if (!(obj instanceof trainingintendedtable)) {
			return false;
		}

		trainingintendedtable trainingintendedtable = (trainingintendedtable)obj;

		long primaryKey = trainingintendedtable.getPrimaryKey();

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
	public CacheModel<trainingintendedtable> toCacheModel() {
		trainingintendedtableCacheModel trainingintendedtableCacheModel = new trainingintendedtableCacheModel();

		trainingintendedtableCacheModel.id = getId();

		trainingintendedtableCacheModel.trainingid = getTrainingid();

		trainingintendedtableCacheModel.userid = getUserid();

		String userid = trainingintendedtableCacheModel.userid;

		if ((userid != null) && (userid.length() == 0)) {
			trainingintendedtableCacheModel.userid = null;
		}

		trainingintendedtableCacheModel.screenname = getScreenname();

		String screenname = trainingintendedtableCacheModel.screenname;

		if ((screenname != null) && (screenname.length() == 0)) {
			trainingintendedtableCacheModel.screenname = null;
		}

		Date createddate = getCreateddate();

		if (createddate != null) {
			trainingintendedtableCacheModel.createddate = createddate.getTime();
		}
		else {
			trainingintendedtableCacheModel.createddate = Long.MIN_VALUE;
		}

		trainingintendedtableCacheModel.flag = getFlag();

		return trainingintendedtableCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", trainingid=");
		sb.append(getTrainingid());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append(", screenname=");
		sb.append(getScreenname());
		sb.append(", createddate=");
		sb.append(getCreateddate());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.chola.trainingcalendar.model.trainingintendedtable");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trainingid</column-name><column-value><![CDATA[");
		sb.append(getTrainingid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>screenname</column-name><column-value><![CDATA[");
		sb.append(getScreenname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createddate</column-name><column-value><![CDATA[");
		sb.append(getCreateddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = trainingintendedtable.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			trainingintendedtable.class
		};
	private long _id;
	private long _trainingid;
	private String _userid;
	private String _screenname;
	private Date _createddate;
	private int _flag;
	private trainingintendedtable _escapedModel;
}