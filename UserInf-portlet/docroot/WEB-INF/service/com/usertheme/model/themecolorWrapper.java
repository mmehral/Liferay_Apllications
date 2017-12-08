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

package com.usertheme.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link themecolor}.
 * </p>
 *
 * @author CloverLiferay02
 * @see themecolor
 * @generated
 */
@ProviderType
public class themecolorWrapper implements themecolor, ModelWrapper<themecolor> {
	public themecolorWrapper(themecolor themecolor) {
		_themecolor = themecolor;
	}

	@Override
	public Class<?> getModelClass() {
		return themecolor.class;
	}

	@Override
	public String getModelClassName() {
		return themecolor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("color", getColor());
		attributes.put("updatedDate", getUpdatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String user_id = (String)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		Date updatedDate = (Date)attributes.get("updatedDate");

		if (updatedDate != null) {
			setUpdatedDate(updatedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _themecolor.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _themecolor.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _themecolor.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _themecolor.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.usertheme.model.themecolor> toCacheModel() {
		return _themecolor.toCacheModel();
	}

	@Override
	public com.usertheme.model.themecolor toEscapedModel() {
		return new themecolorWrapper(_themecolor.toEscapedModel());
	}

	@Override
	public com.usertheme.model.themecolor toUnescapedModel() {
		return new themecolorWrapper(_themecolor.toUnescapedModel());
	}

	@Override
	public int compareTo(com.usertheme.model.themecolor themecolor) {
		return _themecolor.compareTo(themecolor);
	}

	@Override
	public int hashCode() {
		return _themecolor.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _themecolor.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new themecolorWrapper((themecolor)_themecolor.clone());
	}

	/**
	* Returns the color of this themecolor.
	*
	* @return the color of this themecolor
	*/
	@Override
	public java.lang.String getColor() {
		return _themecolor.getColor();
	}

	/**
	* Returns the user_id of this themecolor.
	*
	* @return the user_id of this themecolor
	*/
	@Override
	public java.lang.String getUser_id() {
		return _themecolor.getUser_id();
	}

	@Override
	public java.lang.String toString() {
		return _themecolor.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _themecolor.toXmlString();
	}

	/**
	* Returns the updated date of this themecolor.
	*
	* @return the updated date of this themecolor
	*/
	@Override
	public Date getUpdatedDate() {
		return _themecolor.getUpdatedDate();
	}

	/**
	* Returns the ID of this themecolor.
	*
	* @return the ID of this themecolor
	*/
	@Override
	public long getId() {
		return _themecolor.getId();
	}

	/**
	* Returns the primary key of this themecolor.
	*
	* @return the primary key of this themecolor
	*/
	@Override
	public long getPrimaryKey() {
		return _themecolor.getPrimaryKey();
	}

	@Override
	public void persist() {
		_themecolor.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_themecolor.setCachedModel(cachedModel);
	}

	/**
	* Sets the color of this themecolor.
	*
	* @param color the color of this themecolor
	*/
	@Override
	public void setColor(java.lang.String color) {
		_themecolor.setColor(color);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_themecolor.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_themecolor.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_themecolor.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this themecolor.
	*
	* @param id the ID of this themecolor
	*/
	@Override
	public void setId(long id) {
		_themecolor.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_themecolor.setNew(n);
	}

	/**
	* Sets the primary key of this themecolor.
	*
	* @param primaryKey the primary key of this themecolor
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_themecolor.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_themecolor.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the updated date of this themecolor.
	*
	* @param updatedDate the updated date of this themecolor
	*/
	@Override
	public void setUpdatedDate(Date updatedDate) {
		_themecolor.setUpdatedDate(updatedDate);
	}

	/**
	* Sets the user_id of this themecolor.
	*
	* @param user_id the user_id of this themecolor
	*/
	@Override
	public void setUser_id(java.lang.String user_id) {
		_themecolor.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof themecolorWrapper)) {
			return false;
		}

		themecolorWrapper themecolorWrapper = (themecolorWrapper)obj;

		if (Objects.equals(_themecolor, themecolorWrapper._themecolor)) {
			return true;
		}

		return false;
	}

	@Override
	public themecolor getWrappedModel() {
		return _themecolor;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _themecolor.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _themecolor.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_themecolor.resetOriginalValues();
	}

	private final themecolor _themecolor;
}