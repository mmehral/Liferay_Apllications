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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link bookpath}.
 * </p>
 *
 * @author CloverLiferay02
 * @see bookpath
 * @generated
 */
@ProviderType
public class bookpathWrapper implements bookpath, ModelWrapper<bookpath> {
	public bookpathWrapper(bookpath bookpath) {
		_bookpath = bookpath;
	}

	@Override
	public Class<?> getModelClass() {
		return bookpath.class;
	}

	@Override
	public String getModelClassName() {
		return bookpath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("book", getBook());
		attributes.put("bookpath", getBookpath());
		attributes.put("createddate", getCreateddate());
		attributes.put("createdby", getCreatedby());
		attributes.put("flag", getFlag());
		attributes.put("book_id", getBook_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String book = (String)attributes.get("book");

		if (book != null) {
			setBook(book);
		}

		String bookpath = (String)attributes.get("bookpath");

		if (bookpath != null) {
			setBookpath(bookpath);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		String createdby = (String)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long book_id = (Long)attributes.get("book_id");

		if (book_id != null) {
			setBook_id(book_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _bookpath.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bookpath.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bookpath.isNew();
	}

	@Override
	public com.chola.book.model.bookpath toEscapedModel() {
		return new bookpathWrapper(_bookpath.toEscapedModel());
	}

	@Override
	public com.chola.book.model.bookpath toUnescapedModel() {
		return new bookpathWrapper(_bookpath.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bookpath.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.book.model.bookpath> toCacheModel() {
		return _bookpath.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.book.model.bookpath bookpath) {
		return _bookpath.compareTo(bookpath);
	}

	@Override
	public int hashCode() {
		return _bookpath.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookpath.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new bookpathWrapper((bookpath)_bookpath.clone());
	}

	/**
	* Returns the book of this bookpath.
	*
	* @return the book of this bookpath
	*/
	@Override
	public java.lang.String getBook() {
		return _bookpath.getBook();
	}

	/**
	* Returns the bookpath of this bookpath.
	*
	* @return the bookpath of this bookpath
	*/
	@Override
	public java.lang.String getBookpath() {
		return _bookpath.getBookpath();
	}

	/**
	* Returns the createdby of this bookpath.
	*
	* @return the createdby of this bookpath
	*/
	@Override
	public java.lang.String getCreatedby() {
		return _bookpath.getCreatedby();
	}

	/**
	* Returns the flag of this bookpath.
	*
	* @return the flag of this bookpath
	*/
	@Override
	public java.lang.String getFlag() {
		return _bookpath.getFlag();
	}

	@Override
	public java.lang.String toString() {
		return _bookpath.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bookpath.toXmlString();
	}

	/**
	* Returns the createddate of this bookpath.
	*
	* @return the createddate of this bookpath
	*/
	@Override
	public Date getCreateddate() {
		return _bookpath.getCreateddate();
	}

	/**
	* Returns the book_id of this bookpath.
	*
	* @return the book_id of this bookpath
	*/
	@Override
	public long getBook_id() {
		return _bookpath.getBook_id();
	}

	/**
	* Returns the ID of this bookpath.
	*
	* @return the ID of this bookpath
	*/
	@Override
	public long getId() {
		return _bookpath.getId();
	}

	/**
	* Returns the primary key of this bookpath.
	*
	* @return the primary key of this bookpath
	*/
	@Override
	public long getPrimaryKey() {
		return _bookpath.getPrimaryKey();
	}

	@Override
	public void persist() {
		_bookpath.persist();
	}

	/**
	* Sets the book of this bookpath.
	*
	* @param book the book of this bookpath
	*/
	@Override
	public void setBook(java.lang.String book) {
		_bookpath.setBook(book);
	}

	/**
	* Sets the book_id of this bookpath.
	*
	* @param book_id the book_id of this bookpath
	*/
	@Override
	public void setBook_id(long book_id) {
		_bookpath.setBook_id(book_id);
	}

	/**
	* Sets the bookpath of this bookpath.
	*
	* @param bookpath the bookpath of this bookpath
	*/
	@Override
	public void setBookpath(java.lang.String bookpath) {
		_bookpath.setBookpath(bookpath);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bookpath.setCachedModel(cachedModel);
	}

	/**
	* Sets the createdby of this bookpath.
	*
	* @param createdby the createdby of this bookpath
	*/
	@Override
	public void setCreatedby(java.lang.String createdby) {
		_bookpath.setCreatedby(createdby);
	}

	/**
	* Sets the createddate of this bookpath.
	*
	* @param createddate the createddate of this bookpath
	*/
	@Override
	public void setCreateddate(Date createddate) {
		_bookpath.setCreateddate(createddate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bookpath.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bookpath.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bookpath.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this bookpath.
	*
	* @param flag the flag of this bookpath
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_bookpath.setFlag(flag);
	}

	/**
	* Sets the ID of this bookpath.
	*
	* @param id the ID of this bookpath
	*/
	@Override
	public void setId(long id) {
		_bookpath.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_bookpath.setNew(n);
	}

	/**
	* Sets the primary key of this bookpath.
	*
	* @param primaryKey the primary key of this bookpath
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bookpath.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bookpath.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookpathWrapper)) {
			return false;
		}

		bookpathWrapper bookpathWrapper = (bookpathWrapper)obj;

		if (Objects.equals(_bookpath, bookpathWrapper._bookpath)) {
			return true;
		}

		return false;
	}

	@Override
	public bookpath getWrappedModel() {
		return _bookpath;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bookpath.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bookpath.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bookpath.resetOriginalValues();
	}

	private final bookpath _bookpath;
}