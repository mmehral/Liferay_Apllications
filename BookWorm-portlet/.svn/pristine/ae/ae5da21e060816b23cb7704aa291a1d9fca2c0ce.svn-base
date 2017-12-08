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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.book.service.http.bookpathServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.book.service.http.bookpathServiceSoap
 * @generated
 */
@ProviderType
public class bookpathSoap implements Serializable {
	public static bookpathSoap toSoapModel(bookpath model) {
		bookpathSoap soapModel = new bookpathSoap();

		soapModel.setId(model.getId());
		soapModel.setBook(model.getBook());
		soapModel.setBookpath(model.getBookpath());
		soapModel.setCreateddate(model.getCreateddate());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setFlag(model.getFlag());
		soapModel.setBook_id(model.getBook_id());

		return soapModel;
	}

	public static bookpathSoap[] toSoapModels(bookpath[] models) {
		bookpathSoap[] soapModels = new bookpathSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bookpathSoap[][] toSoapModels(bookpath[][] models) {
		bookpathSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bookpathSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bookpathSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bookpathSoap[] toSoapModels(List<bookpath> models) {
		List<bookpathSoap> soapModels = new ArrayList<bookpathSoap>(models.size());

		for (bookpath model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bookpathSoap[soapModels.size()]);
	}

	public bookpathSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getBook() {
		return _book;
	}

	public void setBook(String book) {
		_book = book;
	}

	public String getBookpath() {
		return _bookpath;
	}

	public void setBookpath(String bookpath) {
		_bookpath = bookpath;
	}

	public Date getCreateddate() {
		return _createddate;
	}

	public void setCreateddate(Date createddate) {
		_createddate = createddate;
	}

	public String getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(String createdby) {
		_createdby = createdby;
	}

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	public long getBook_id() {
		return _book_id;
	}

	public void setBook_id(long book_id) {
		_book_id = book_id;
	}

	private long _id;
	private String _book;
	private String _bookpath;
	private Date _createddate;
	private String _createdby;
	private String _flag;
	private long _book_id;
}