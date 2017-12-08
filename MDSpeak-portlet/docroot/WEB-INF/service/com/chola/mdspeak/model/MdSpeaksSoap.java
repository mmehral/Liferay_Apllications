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

package com.chola.mdspeak.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.mdspeak.service.http.MdSpeaksServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.mdspeak.service.http.MdSpeaksServiceSoap
 * @generated
 */
@ProviderType
public class MdSpeaksSoap implements Serializable {
	public static MdSpeaksSoap toSoapModel(MdSpeaks model) {
		MdSpeaksSoap soapModel = new MdSpeaksSoap();

		soapModel.setId(model.getId());
		soapModel.setUsername(model.getUsername());

		return soapModel;
	}

	public static MdSpeaksSoap[] toSoapModels(MdSpeaks[] models) {
		MdSpeaksSoap[] soapModels = new MdSpeaksSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MdSpeaksSoap[][] toSoapModels(MdSpeaks[][] models) {
		MdSpeaksSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MdSpeaksSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MdSpeaksSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MdSpeaksSoap[] toSoapModels(List<MdSpeaks> models) {
		List<MdSpeaksSoap> soapModels = new ArrayList<MdSpeaksSoap>(models.size());

		for (MdSpeaks model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MdSpeaksSoap[soapModels.size()]);
	}

	public MdSpeaksSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	private long _Id;
	private String _username;
}