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

package com.chola.conferenceroombooking.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.service.ClpSerializer;
import com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
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
public class conferenceroombookingdetailsClp extends BaseModelImpl<conferenceroombookingdetails>
	implements conferenceroombookingdetails {
	public conferenceroombookingdetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return conferenceroombookingdetails.class;
	}

	@Override
	public String getModelClassName() {
		return conferenceroombookingdetails.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _bookid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBookid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookid", getBookid());
		attributes.put("startdate", getStartdate());
		attributes.put("startime", getStartime());
		attributes.put("endtime", getEndtime());
		attributes.put("roomid", getRoomid());
		attributes.put("meeting_emailid", getMeeting_emailid());
		attributes.put("meeting_title", getMeeting_title());
		attributes.put("meeting_agenda", getMeeting_agenda());
		attributes.put("status", getStatus());
		attributes.put("userid", getUserid());
		attributes.put("username", getUsername());
		attributes.put("createdate", getCreatedate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookid = (Long)attributes.get("bookid");

		if (bookid != null) {
			setBookid(bookid);
		}

		Date startdate = (Date)attributes.get("startdate");

		if (startdate != null) {
			setStartdate(startdate);
		}

		String startime = (String)attributes.get("startime");

		if (startime != null) {
			setStartime(startime);
		}

		String endtime = (String)attributes.get("endtime");

		if (endtime != null) {
			setEndtime(endtime);
		}

		Integer roomid = (Integer)attributes.get("roomid");

		if (roomid != null) {
			setRoomid(roomid);
		}

		String meeting_emailid = (String)attributes.get("meeting_emailid");

		if (meeting_emailid != null) {
			setMeeting_emailid(meeting_emailid);
		}

		String meeting_title = (String)attributes.get("meeting_title");

		if (meeting_title != null) {
			setMeeting_title(meeting_title);
		}

		String meeting_agenda = (String)attributes.get("meeting_agenda");

		if (meeting_agenda != null) {
			setMeeting_agenda(meeting_agenda);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		Date createdate = (Date)attributes.get("createdate");

		if (createdate != null) {
			setCreatedate(createdate);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getBookid() {
		return _bookid;
	}

	@Override
	public void setBookid(long bookid) {
		_bookid = bookid;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBookid", long.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel, bookid);
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

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setStartdate", Date.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel,
					startdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStartime() {
		return _startime;
	}

	@Override
	public void setStartime(String startime) {
		_startime = startime;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setStartime", String.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel, startime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEndtime() {
		return _endtime;
	}

	@Override
	public void setEndtime(String endtime) {
		_endtime = endtime;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setEndtime", String.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel, endtime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getRoomid() {
		return _roomid;
	}

	@Override
	public void setRoomid(int roomid) {
		_roomid = roomid;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setRoomid", int.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel, roomid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMeeting_emailid() {
		return _meeting_emailid;
	}

	@Override
	public void setMeeting_emailid(String meeting_emailid) {
		_meeting_emailid = meeting_emailid;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setMeeting_emailid",
						String.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel,
					meeting_emailid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMeeting_title() {
		return _meeting_title;
	}

	@Override
	public void setMeeting_title(String meeting_title) {
		_meeting_title = meeting_title;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setMeeting_title", String.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel,
					meeting_title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMeeting_agenda() {
		return _meeting_agenda;
	}

	@Override
	public void setMeeting_agenda(String meeting_agenda) {
		_meeting_agenda = meeting_agenda;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setMeeting_agenda",
						String.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel,
					meeting_agenda);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserid() {
		return _userid;
	}

	@Override
	public void setUserid(long userid) {
		_userid = userid;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUserid", long.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel, userid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUsername() {
		return _username;
	}

	@Override
	public void setUsername(String username) {
		_username = username;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setUsername", String.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel, username);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedate() {
		return _createdate;
	}

	@Override
	public void setCreatedate(Date createdate) {
		_createdate = createdate;

		if (_conferenceroombookingdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _conferenceroombookingdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedate", Date.class);

				method.invoke(_conferenceroombookingdetailsRemoteModel,
					createdate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getconferenceroombookingdetailsRemoteModel() {
		return _conferenceroombookingdetailsRemoteModel;
	}

	public void setconferenceroombookingdetailsRemoteModel(
		BaseModel<?> conferenceroombookingdetailsRemoteModel) {
		_conferenceroombookingdetailsRemoteModel = conferenceroombookingdetailsRemoteModel;
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

		Class<?> remoteModelClass = _conferenceroombookingdetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_conferenceroombookingdetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			conferenceroombookingdetailsLocalServiceUtil.addconferenceroombookingdetails(this);
		}
		else {
			conferenceroombookingdetailsLocalServiceUtil.updateconferenceroombookingdetails(this);
		}
	}

	@Override
	public conferenceroombookingdetails toEscapedModel() {
		return (conferenceroombookingdetails)ProxyUtil.newProxyInstance(conferenceroombookingdetails.class.getClassLoader(),
			new Class[] { conferenceroombookingdetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		conferenceroombookingdetailsClp clone = new conferenceroombookingdetailsClp();

		clone.setBookid(getBookid());
		clone.setStartdate(getStartdate());
		clone.setStartime(getStartime());
		clone.setEndtime(getEndtime());
		clone.setRoomid(getRoomid());
		clone.setMeeting_emailid(getMeeting_emailid());
		clone.setMeeting_title(getMeeting_title());
		clone.setMeeting_agenda(getMeeting_agenda());
		clone.setStatus(getStatus());
		clone.setUserid(getUserid());
		clone.setUsername(getUsername());
		clone.setCreatedate(getCreatedate());

		return clone;
	}

	@Override
	public int compareTo(
		conferenceroombookingdetails conferenceroombookingdetails) {
		long primaryKey = conferenceroombookingdetails.getPrimaryKey();

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

		if (!(obj instanceof conferenceroombookingdetailsClp)) {
			return false;
		}

		conferenceroombookingdetailsClp conferenceroombookingdetails = (conferenceroombookingdetailsClp)obj;

		long primaryKey = conferenceroombookingdetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{bookid=");
		sb.append(getBookid());
		sb.append(", startdate=");
		sb.append(getStartdate());
		sb.append(", startime=");
		sb.append(getStartime());
		sb.append(", endtime=");
		sb.append(getEndtime());
		sb.append(", roomid=");
		sb.append(getRoomid());
		sb.append(", meeting_emailid=");
		sb.append(getMeeting_emailid());
		sb.append(", meeting_title=");
		sb.append(getMeeting_title());
		sb.append(", meeting_agenda=");
		sb.append(getMeeting_agenda());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append(", username=");
		sb.append(getUsername());
		sb.append(", createdate=");
		sb.append(getCreatedate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append(
			"com.chola.conferenceroombooking.model.conferenceroombookingdetails");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bookid</column-name><column-value><![CDATA[");
		sb.append(getBookid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startdate</column-name><column-value><![CDATA[");
		sb.append(getStartdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startime</column-name><column-value><![CDATA[");
		sb.append(getStartime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endtime</column-name><column-value><![CDATA[");
		sb.append(getEndtime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roomid</column-name><column-value><![CDATA[");
		sb.append(getRoomid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>meeting_emailid</column-name><column-value><![CDATA[");
		sb.append(getMeeting_emailid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>meeting_title</column-name><column-value><![CDATA[");
		sb.append(getMeeting_title());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>meeting_agenda</column-name><column-value><![CDATA[");
		sb.append(getMeeting_agenda());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>username</column-name><column-value><![CDATA[");
		sb.append(getUsername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdate</column-name><column-value><![CDATA[");
		sb.append(getCreatedate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _bookid;
	private Date _startdate;
	private String _startime;
	private String _endtime;
	private int _roomid;
	private String _meeting_emailid;
	private String _meeting_title;
	private String _meeting_agenda;
	private int _status;
	private long _userid;
	private String _username;
	private Date _createdate;
	private BaseModel<?> _conferenceroombookingdetailsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}