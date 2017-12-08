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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link room}.
 * </p>
 *
 * @author adms.java1
 * @see room
 * @generated
 */
@ProviderType
public class roomWrapper implements room, ModelWrapper<room> {
	public roomWrapper(room room) {
		_room = room;
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
	}

	@Override
	public boolean isCachedModel() {
		return _room.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _room.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _room.isNew();
	}

	@Override
	public com.chola.service.conference.model.room toEscapedModel() {
		return new roomWrapper(_room.toEscapedModel());
	}

	@Override
	public com.chola.service.conference.model.room toUnescapedModel() {
		return new roomWrapper(_room.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _room.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.service.conference.model.room> toCacheModel() {
		return _room.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.service.conference.model.room room) {
		return _room.compareTo(room);
	}

	@Override
	public int hashCode() {
		return _room.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _room.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new roomWrapper((room)_room.clone());
	}

	/**
	* Returns the room_name of this room.
	*
	* @return the room_name of this room
	*/
	@Override
	public java.lang.String getRoom_name() {
		return _room.getRoom_name();
	}

	/**
	* Returns the room_values of this room.
	*
	* @return the room_values of this room
	*/
	@Override
	public java.lang.String getRoom_values() {
		return _room.getRoom_values();
	}

	@Override
	public java.lang.String toString() {
		return _room.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _room.toXmlString();
	}

	/**
	* Returns the floor_id of this room.
	*
	* @return the floor_id of this room
	*/
	@Override
	public long getFloor_id() {
		return _room.getFloor_id();
	}

	/**
	* Returns the location_id of this room.
	*
	* @return the location_id of this room
	*/
	@Override
	public long getLocation_id() {
		return _room.getLocation_id();
	}

	/**
	* Returns the primary key of this room.
	*
	* @return the primary key of this room
	*/
	@Override
	public long getPrimaryKey() {
		return _room.getPrimaryKey();
	}

	/**
	* Returns the room_capacity of this room.
	*
	* @return the room_capacity of this room
	*/
	@Override
	public long getRoom_capacity() {
		return _room.getRoom_capacity();
	}

	/**
	* Returns the room_extension of this room.
	*
	* @return the room_extension of this room
	*/
	@Override
	public long getRoom_extension() {
		return _room.getRoom_extension();
	}

	/**
	* Returns the room_id of this room.
	*
	* @return the room_id of this room
	*/
	@Override
	public long getRoom_id() {
		return _room.getRoom_id();
	}

	/**
	* Returns the state_id of this room.
	*
	* @return the state_id of this room
	*/
	@Override
	public long getState_id() {
		return _room.getState_id();
	}

	@Override
	public void persist() {
		_room.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_room.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_room.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_room.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_room.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the floor_id of this room.
	*
	* @param floor_id the floor_id of this room
	*/
	@Override
	public void setFloor_id(long floor_id) {
		_room.setFloor_id(floor_id);
	}

	/**
	* Sets the location_id of this room.
	*
	* @param location_id the location_id of this room
	*/
	@Override
	public void setLocation_id(long location_id) {
		_room.setLocation_id(location_id);
	}

	@Override
	public void setNew(boolean n) {
		_room.setNew(n);
	}

	/**
	* Sets the primary key of this room.
	*
	* @param primaryKey the primary key of this room
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_room.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_room.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the room_capacity of this room.
	*
	* @param room_capacity the room_capacity of this room
	*/
	@Override
	public void setRoom_capacity(long room_capacity) {
		_room.setRoom_capacity(room_capacity);
	}

	/**
	* Sets the room_extension of this room.
	*
	* @param room_extension the room_extension of this room
	*/
	@Override
	public void setRoom_extension(long room_extension) {
		_room.setRoom_extension(room_extension);
	}

	/**
	* Sets the room_id of this room.
	*
	* @param room_id the room_id of this room
	*/
	@Override
	public void setRoom_id(long room_id) {
		_room.setRoom_id(room_id);
	}

	/**
	* Sets the room_name of this room.
	*
	* @param room_name the room_name of this room
	*/
	@Override
	public void setRoom_name(java.lang.String room_name) {
		_room.setRoom_name(room_name);
	}

	/**
	* Sets the room_values of this room.
	*
	* @param room_values the room_values of this room
	*/
	@Override
	public void setRoom_values(java.lang.String room_values) {
		_room.setRoom_values(room_values);
	}

	/**
	* Sets the state_id of this room.
	*
	* @param state_id the state_id of this room
	*/
	@Override
	public void setState_id(long state_id) {
		_room.setState_id(state_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof roomWrapper)) {
			return false;
		}

		roomWrapper roomWrapper = (roomWrapper)obj;

		if (Objects.equals(_room, roomWrapper._room)) {
			return true;
		}

		return false;
	}

	@Override
	public room getWrappedModel() {
		return _room;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _room.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _room.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_room.resetOriginalValues();
	}

	private final room _room;
}