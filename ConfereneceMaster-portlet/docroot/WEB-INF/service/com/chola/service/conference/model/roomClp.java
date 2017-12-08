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

package com.chola.service.conference.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.service.conference.service.ClpSerializer;
import com.chola.service.conference.service.roomLocalServiceUtil;

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
public class roomClp extends BaseModelImpl<room> implements room {
	public roomClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return room.class;
	}

	@Override
	public String getModelClassName() {
		return room.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _room_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRoom_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _room_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("room_id", getRoom_id());
		attributes.put("state_id", getState_id());
		attributes.put("location_id", getLocation_id());
		attributes.put("floor_id", getFloor_id());
		attributes.put("room_name", getRoom_name());
		attributes.put("room_capacity", getRoom_capacity());
		attributes.put("room_extension", getRoom_extension());
		attributes.put("room_values", getRoom_values());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long room_id = (Long)attributes.get("room_id");

		if (room_id != null) {
			setRoom_id(room_id);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Long location_id = (Long)attributes.get("location_id");

		if (location_id != null) {
			setLocation_id(location_id);
		}

		Long floor_id = (Long)attributes.get("floor_id");

		if (floor_id != null) {
			setFloor_id(floor_id);
		}

		String room_name = (String)attributes.get("room_name");

		if (room_name != null) {
			setRoom_name(room_name);
		}

		Long room_capacity = (Long)attributes.get("room_capacity");

		if (room_capacity != null) {
			setRoom_capacity(room_capacity);
		}

		Long room_extension = (Long)attributes.get("room_extension");

		if (room_extension != null) {
			setRoom_extension(room_extension);
		}

		String room_values = (String)attributes.get("room_values");

		if (room_values != null) {
			setRoom_values(room_values);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getRoom_id() {
		return _room_id;
	}

	@Override
	public void setRoom_id(long room_id) {
		_room_id = room_id;

		if (_roomRemoteModel != null) {
			try {
				Class<?> clazz = _roomRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_id", long.class);

				method.invoke(_roomRemoteModel, room_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getState_id() {
		return _state_id;
	}

	@Override
	public void setState_id(long state_id) {
		_state_id = state_id;

		if (_roomRemoteModel != null) {
			try {
				Class<?> clazz = _roomRemoteModel.getClass();

				Method method = clazz.getMethod("setState_id", long.class);

				method.invoke(_roomRemoteModel, state_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getLocation_id() {
		return _location_id;
	}

	@Override
	public void setLocation_id(long location_id) {
		_location_id = location_id;

		if (_roomRemoteModel != null) {
			try {
				Class<?> clazz = _roomRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation_id", long.class);

				method.invoke(_roomRemoteModel, location_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFloor_id() {
		return _floor_id;
	}

	@Override
	public void setFloor_id(long floor_id) {
		_floor_id = floor_id;

		if (_roomRemoteModel != null) {
			try {
				Class<?> clazz = _roomRemoteModel.getClass();

				Method method = clazz.getMethod("setFloor_id", long.class);

				method.invoke(_roomRemoteModel, floor_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_name() {
		return _room_name;
	}

	@Override
	public void setRoom_name(String room_name) {
		_room_name = room_name;

		if (_roomRemoteModel != null) {
			try {
				Class<?> clazz = _roomRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_name", String.class);

				method.invoke(_roomRemoteModel, room_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRoom_capacity() {
		return _room_capacity;
	}

	@Override
	public void setRoom_capacity(long room_capacity) {
		_room_capacity = room_capacity;

		if (_roomRemoteModel != null) {
			try {
				Class<?> clazz = _roomRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_capacity", long.class);

				method.invoke(_roomRemoteModel, room_capacity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRoom_extension() {
		return _room_extension;
	}

	@Override
	public void setRoom_extension(long room_extension) {
		_room_extension = room_extension;

		if (_roomRemoteModel != null) {
			try {
				Class<?> clazz = _roomRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_extension", long.class);

				method.invoke(_roomRemoteModel, room_extension);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRoom_values() {
		return _room_values;
	}

	@Override
	public void setRoom_values(String room_values) {
		_room_values = room_values;

		if (_roomRemoteModel != null) {
			try {
				Class<?> clazz = _roomRemoteModel.getClass();

				Method method = clazz.getMethod("setRoom_values", String.class);

				method.invoke(_roomRemoteModel, room_values);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getroomRemoteModel() {
		return _roomRemoteModel;
	}

	public void setroomRemoteModel(BaseModel<?> roomRemoteModel) {
		_roomRemoteModel = roomRemoteModel;
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

		Class<?> remoteModelClass = _roomRemoteModel.getClass();

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

		Object returnValue = method.invoke(_roomRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			roomLocalServiceUtil.addroom(this);
		}
		else {
			roomLocalServiceUtil.updateroom(this);
		}
	}

	@Override
	public room toEscapedModel() {
		return (room)ProxyUtil.newProxyInstance(room.class.getClassLoader(),
			new Class[] { room.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		roomClp clone = new roomClp();

		clone.setRoom_id(getRoom_id());
		clone.setState_id(getState_id());
		clone.setLocation_id(getLocation_id());
		clone.setFloor_id(getFloor_id());
		clone.setRoom_name(getRoom_name());
		clone.setRoom_capacity(getRoom_capacity());
		clone.setRoom_extension(getRoom_extension());
		clone.setRoom_values(getRoom_values());

		return clone;
	}

	@Override
	public int compareTo(room room) {
		long primaryKey = room.getPrimaryKey();

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

		if (!(obj instanceof roomClp)) {
			return false;
		}

		roomClp room = (roomClp)obj;

		long primaryKey = room.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{room_id=");
		sb.append(getRoom_id());
		sb.append(", state_id=");
		sb.append(getState_id());
		sb.append(", location_id=");
		sb.append(getLocation_id());
		sb.append(", floor_id=");
		sb.append(getFloor_id());
		sb.append(", room_name=");
		sb.append(getRoom_name());
		sb.append(", room_capacity=");
		sb.append(getRoom_capacity());
		sb.append(", room_extension=");
		sb.append(getRoom_extension());
		sb.append(", room_values=");
		sb.append(getRoom_values());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.chola.service.conference.model.room");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>room_id</column-name><column-value><![CDATA[");
		sb.append(getRoom_id());
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
			"<column><column-name>floor_id</column-name><column-value><![CDATA[");
		sb.append(getFloor_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_name</column-name><column-value><![CDATA[");
		sb.append(getRoom_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_capacity</column-name><column-value><![CDATA[");
		sb.append(getRoom_capacity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_extension</column-name><column-value><![CDATA[");
		sb.append(getRoom_extension());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>room_values</column-name><column-value><![CDATA[");
		sb.append(getRoom_values());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _room_id;
	private long _state_id;
	private long _location_id;
	private long _floor_id;
	private String _room_name;
	private long _room_capacity;
	private long _room_extension;
	private String _room_values;
	private BaseModel<?> _roomRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}