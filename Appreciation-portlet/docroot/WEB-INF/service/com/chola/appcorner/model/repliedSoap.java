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

package com.chola.appcorner.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.appcorner.service.http.repliedServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.appcorner.service.http.repliedServiceSoap
 * @generated
 */
@ProviderType
public class repliedSoap implements Serializable {
	public static repliedSoap toSoapModel(replied model) {
		repliedSoap soapModel = new repliedSoap();

		soapModel.setId(model.getId());
		soapModel.setRepliedOnPost(model.getRepliedOnPost());
		soapModel.setRepliedTo(model.getRepliedTo());
		soapModel.setRepliedBy(model.getRepliedBy());
		soapModel.setRepliedMessage(model.getRepliedMessage());
		soapModel.setRepliedDate(model.getRepliedDate());

		return soapModel;
	}

	public static repliedSoap[] toSoapModels(replied[] models) {
		repliedSoap[] soapModels = new repliedSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static repliedSoap[][] toSoapModels(replied[][] models) {
		repliedSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new repliedSoap[models.length][models[0].length];
		}
		else {
			soapModels = new repliedSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static repliedSoap[] toSoapModels(List<replied> models) {
		List<repliedSoap> soapModels = new ArrayList<repliedSoap>(models.size());

		for (replied model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new repliedSoap[soapModels.size()]);
	}

	public repliedSoap() {
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

	public long getRepliedOnPost() {
		return _repliedOnPost;
	}

	public void setRepliedOnPost(long repliedOnPost) {
		_repliedOnPost = repliedOnPost;
	}

	public long getRepliedTo() {
		return _repliedTo;
	}

	public void setRepliedTo(long repliedTo) {
		_repliedTo = repliedTo;
	}

	public long getRepliedBy() {
		return _repliedBy;
	}

	public void setRepliedBy(long repliedBy) {
		_repliedBy = repliedBy;
	}

	public String getRepliedMessage() {
		return _repliedMessage;
	}

	public void setRepliedMessage(String repliedMessage) {
		_repliedMessage = repliedMessage;
	}

	public String getRepliedDate() {
		return _repliedDate;
	}

	public void setRepliedDate(String repliedDate) {
		_repliedDate = repliedDate;
	}

	private long _id;
	private long _repliedOnPost;
	private long _repliedTo;
	private long _repliedBy;
	private String _repliedMessage;
	private String _repliedDate;
}