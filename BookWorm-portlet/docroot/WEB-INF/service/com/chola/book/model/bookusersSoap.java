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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.book.service.http.bookusersServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.book.service.http.bookusersServiceSoap
 * @generated
 */
@ProviderType
public class bookusersSoap implements Serializable {
	public static bookusersSoap toSoapModel(bookusers model) {
		bookusersSoap soapModel = new bookusersSoap();

		soapModel.setId(model.getId());
		soapModel.setUser_id(model.getUser_id());
		soapModel.setBook_id(model.getBook_id());

		return soapModel;
	}

	public static bookusersSoap[] toSoapModels(bookusers[] models) {
		bookusersSoap[] soapModels = new bookusersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bookusersSoap[][] toSoapModels(bookusers[][] models) {
		bookusersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bookusersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bookusersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bookusersSoap[] toSoapModels(List<bookusers> models) {
		List<bookusersSoap> soapModels = new ArrayList<bookusersSoap>(models.size());

		for (bookusers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bookusersSoap[soapModels.size()]);
	}

	public bookusersSoap() {
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

	public long getUser_id() {
		return _user_id;
	}

	public void setUser_id(long user_id) {
		_user_id = user_id;
	}

	public long getBook_id() {
		return _book_id;
	}

	public void setBook_id(long book_id) {
		_book_id = book_id;
	}

	private long _id;
	private long _user_id;
	private long _book_id;
}