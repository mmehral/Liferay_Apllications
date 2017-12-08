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

package com.chola.contest.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.contest.service.ClpSerializer;
import com.chola.contest.service.cholacontestLocalServiceUtil;

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
public class cholacontestClp extends BaseModelImpl<cholacontest>
	implements cholacontest {
	public cholacontestClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return cholacontest.class;
	}

	@Override
	public String getModelClassName() {
		return cholacontest.class.getName();
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
		attributes.put("content", getContent());
		attributes.put("startdate", getStartdate());
		attributes.put("enddate", getEnddate());
		attributes.put("feedback", getFeedback());
		attributes.put("createDate", getCreateDate());
		attributes.put("contest_code", getContest_code());
		attributes.put("contest_val", getContest_val());
		attributes.put("contest_desc", getContest_desc());
		attributes.put("contest_doc", getContest_doc());
		attributes.put("contest_path", getContest_path());
		attributes.put("contest_title", getContest_title());
		attributes.put("user_id", getUser_id());

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

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Date startdate = (Date)attributes.get("startdate");

		if (startdate != null) {
			setStartdate(startdate);
		}

		Date enddate = (Date)attributes.get("enddate");

		if (enddate != null) {
			setEnddate(enddate);
		}

		String feedback = (String)attributes.get("feedback");

		if (feedback != null) {
			setFeedback(feedback);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Integer contest_code = (Integer)attributes.get("contest_code");

		if (contest_code != null) {
			setContest_code(contest_code);
		}

		Integer contest_val = (Integer)attributes.get("contest_val");

		if (contest_val != null) {
			setContest_val(contest_val);
		}

		String contest_desc = (String)attributes.get("contest_desc");

		if (contest_desc != null) {
			setContest_desc(contest_desc);
		}

		String contest_doc = (String)attributes.get("contest_doc");

		if (contest_doc != null) {
			setContest_doc(contest_doc);
		}

		String contest_path = (String)attributes.get("contest_path");

		if (contest_path != null) {
			setContest_path(contest_path);
		}

		String contest_title = (String)attributes.get("contest_title");

		if (contest_title != null) {
			setContest_title(contest_title);
		}

		String user_id = (String)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
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

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_cholacontestRemoteModel, id);
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

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_cholacontestRemoteModel, content_id);
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

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setContent", String.class);

				method.invoke(_cholacontestRemoteModel, content);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartdate() {
		return _startdate;
	}

	@Override
	public void setStartdate(Date startdate) {
		_startdate = startdate;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setStartdate", Date.class);

				method.invoke(_cholacontestRemoteModel, startdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEnddate() {
		return _enddate;
	}

	@Override
	public void setEnddate(Date enddate) {
		_enddate = enddate;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setEnddate", Date.class);

				method.invoke(_cholacontestRemoteModel, enddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFeedback() {
		return _feedback;
	}

	@Override
	public void setFeedback(String feedback) {
		_feedback = feedback;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setFeedback", String.class);

				method.invoke(_cholacontestRemoteModel, feedback);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_cholacontestRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getContest_code() {
		return _contest_code;
	}

	@Override
	public void setContest_code(int contest_code) {
		_contest_code = contest_code;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setContest_code", int.class);

				method.invoke(_cholacontestRemoteModel, contest_code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getContest_val() {
		return _contest_val;
	}

	@Override
	public void setContest_val(int contest_val) {
		_contest_val = contest_val;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setContest_val", int.class);

				method.invoke(_cholacontestRemoteModel, contest_val);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContest_desc() {
		return _contest_desc;
	}

	@Override
	public void setContest_desc(String contest_desc) {
		_contest_desc = contest_desc;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setContest_desc", String.class);

				method.invoke(_cholacontestRemoteModel, contest_desc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContest_doc() {
		return _contest_doc;
	}

	@Override
	public void setContest_doc(String contest_doc) {
		_contest_doc = contest_doc;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setContest_doc", String.class);

				method.invoke(_cholacontestRemoteModel, contest_doc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContest_path() {
		return _contest_path;
	}

	@Override
	public void setContest_path(String contest_path) {
		_contest_path = contest_path;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setContest_path", String.class);

				method.invoke(_cholacontestRemoteModel, contest_path);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContest_title() {
		return _contest_title;
	}

	@Override
	public void setContest_title(String contest_title) {
		_contest_title = contest_title;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setContest_title", String.class);

				method.invoke(_cholacontestRemoteModel, contest_title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUser_id() {
		return _user_id;
	}

	@Override
	public void setUser_id(String user_id) {
		_user_id = user_id;

		if (_cholacontestRemoteModel != null) {
			try {
				Class<?> clazz = _cholacontestRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", String.class);

				method.invoke(_cholacontestRemoteModel, user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcholacontestRemoteModel() {
		return _cholacontestRemoteModel;
	}

	public void setcholacontestRemoteModel(BaseModel<?> cholacontestRemoteModel) {
		_cholacontestRemoteModel = cholacontestRemoteModel;
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

		Class<?> remoteModelClass = _cholacontestRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cholacontestRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			cholacontestLocalServiceUtil.addcholacontest(this);
		}
		else {
			cholacontestLocalServiceUtil.updatecholacontest(this);
		}
	}

	@Override
	public cholacontest toEscapedModel() {
		return (cholacontest)ProxyUtil.newProxyInstance(cholacontest.class.getClassLoader(),
			new Class[] { cholacontest.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		cholacontestClp clone = new cholacontestClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setContent(getContent());
		clone.setStartdate(getStartdate());
		clone.setEnddate(getEnddate());
		clone.setFeedback(getFeedback());
		clone.setCreateDate(getCreateDate());
		clone.setContest_code(getContest_code());
		clone.setContest_val(getContest_val());
		clone.setContest_desc(getContest_desc());
		clone.setContest_doc(getContest_doc());
		clone.setContest_path(getContest_path());
		clone.setContest_title(getContest_title());
		clone.setUser_id(getUser_id());

		return clone;
	}

	@Override
	public int compareTo(cholacontest cholacontest) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), cholacontest.getCreateDate());

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

		if (!(obj instanceof cholacontestClp)) {
			return false;
		}

		cholacontestClp cholacontest = (cholacontestClp)obj;

		long primaryKey = cholacontest.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", startdate=");
		sb.append(getStartdate());
		sb.append(", enddate=");
		sb.append(getEnddate());
		sb.append(", feedback=");
		sb.append(getFeedback());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", contest_code=");
		sb.append(getContest_code());
		sb.append(", contest_val=");
		sb.append(getContest_val());
		sb.append(", contest_desc=");
		sb.append(getContest_desc());
		sb.append(", contest_doc=");
		sb.append(getContest_doc());
		sb.append(", contest_path=");
		sb.append(getContest_path());
		sb.append(", contest_title=");
		sb.append(getContest_title());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.chola.contest.model.cholacontest");
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
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startdate</column-name><column-value><![CDATA[");
		sb.append(getStartdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enddate</column-name><column-value><![CDATA[");
		sb.append(getEnddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>feedback</column-name><column-value><![CDATA[");
		sb.append(getFeedback());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contest_code</column-name><column-value><![CDATA[");
		sb.append(getContest_code());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contest_val</column-name><column-value><![CDATA[");
		sb.append(getContest_val());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contest_desc</column-name><column-value><![CDATA[");
		sb.append(getContest_desc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contest_doc</column-name><column-value><![CDATA[");
		sb.append(getContest_doc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contest_path</column-name><column-value><![CDATA[");
		sb.append(getContest_path());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contest_title</column-name><column-value><![CDATA[");
		sb.append(getContest_title());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _content_id;
	private String _content;
	private Date _startdate;
	private Date _enddate;
	private String _feedback;
	private Date _createDate;
	private int _contest_code;
	private int _contest_val;
	private String _contest_desc;
	private String _contest_doc;
	private String _contest_path;
	private String _contest_title;
	private String _user_id;
	private BaseModel<?> _cholacontestRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}