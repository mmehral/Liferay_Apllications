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

package com.chola.book.model;

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
 * This class is a wrapper for {@link bookusers}.
 * </p>
 *
 * @author CloverLiferay02
 * @see bookusers
 * @generated
 */
@ProviderType
public class bookusersWrapper implements bookusers, ModelWrapper<bookusers> {
	public bookusersWrapper(bookusers bookusers) {
		_bookusers = bookusers;
	}

	@Override
	public Class<?> getModelClass() {
		return bookusers.class;
	}

	@Override
	public String getModelClassName() {
		return bookusers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("book_id", getBook_id());

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

		Long book_id = (Long)attributes.get("book_id");

		if (book_id != null) {
			setBook_id(book_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _bookusers.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bookusers.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bookusers.isNew();
	}

	@Override
	public com.chola.book.model.bookusers toEscapedModel() {
		return new bookusersWrapper(_bookusers.toEscapedModel());
	}

	@Override
	public com.chola.book.model.bookusers toUnescapedModel() {
		return new bookusersWrapper(_bookusers.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bookusers.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.book.model.bookusers> toCacheModel() {
		return _bookusers.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.book.model.bookusers bookusers) {
		return _bookusers.compareTo(bookusers);
	}

	@Override
	public int hashCode() {
		return _bookusers.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookusers.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new bookusersWrapper((bookusers)_bookusers.clone());
	}

	@Override
	public java.lang.String toString() {
		return _bookusers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bookusers.toXmlString();
	}

	/**
	* Returns the book_id of this bookusers.
	*
	* @return the book_id of this bookusers
	*/
	@Override
	public long getBook_id() {
		return _bookusers.getBook_id();
	}

	/**
	* Returns the ID of this bookusers.
	*
	* @return the ID of this bookusers
	*/
	@Override
	public long getId() {
		return _bookusers.getId();
	}

	/**
	* Returns the primary key of this bookusers.
	*
	* @return the primary key of this bookusers
	*/
	@Override
	public long getPrimaryKey() {
		return _bookusers.getPrimaryKey();
	}

	/**
	* Returns the user_id of this bookusers.
	*
	* @return the user_id of this bookusers
	*/
	@Override
	public long getUser_id() {
		return _bookusers.getUser_id();
	}

	@Override
	public void persist() {
		_bookusers.persist();
	}

	/**
	* Sets the book_id of this bookusers.
	*
	* @param book_id the book_id of this bookusers
	*/
	@Override
	public void setBook_id(long book_id) {
		_bookusers.setBook_id(book_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bookusers.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bookusers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bookusers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bookusers.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this bookusers.
	*
	* @param id the ID of this bookusers
	*/
	@Override
	public void setId(long id) {
		_bookusers.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_bookusers.setNew(n);
	}

	/**
	* Sets the primary key of this bookusers.
	*
	* @param primaryKey the primary key of this bookusers
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bookusers.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bookusers.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user_id of this bookusers.
	*
	* @param user_id the user_id of this bookusers
	*/
	@Override
	public void setUser_id(long user_id) {
		_bookusers.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookusersWrapper)) {
			return false;
		}

		bookusersWrapper bookusersWrapper = (bookusersWrapper)obj;

		if (Objects.equals(_bookusers, bookusersWrapper._bookusers)) {
			return true;
		}

		return false;
	}

	@Override
	public bookusers getWrappedModel() {
		return _bookusers;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bookusers.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bookusers.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bookusers.resetOriginalValues();
	}

	private final bookusers _bookusers;
}