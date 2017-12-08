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

package com.chola.productbuysell.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.productbuysell.service.http.BuySellProductsImagesServiceSoap}.
 *
 * @author CloverLiferay03
 * @see com.chola.productbuysell.service.http.BuySellProductsImagesServiceSoap
 * @generated
 */
@ProviderType
public class BuySellProductsImagesSoap implements Serializable {
	public static BuySellProductsImagesSoap toSoapModel(
		BuySellProductsImages model) {
		BuySellProductsImagesSoap soapModel = new BuySellProductsImagesSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setImage_name(model.getImage_name());
		soapModel.setImage_path(model.getImage_path());
		soapModel.setProduct_id(model.getProduct_id());

		return soapModel;
	}

	public static BuySellProductsImagesSoap[] toSoapModels(
		BuySellProductsImages[] models) {
		BuySellProductsImagesSoap[] soapModels = new BuySellProductsImagesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BuySellProductsImagesSoap[][] toSoapModels(
		BuySellProductsImages[][] models) {
		BuySellProductsImagesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BuySellProductsImagesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BuySellProductsImagesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BuySellProductsImagesSoap[] toSoapModels(
		List<BuySellProductsImages> models) {
		List<BuySellProductsImagesSoap> soapModels = new ArrayList<BuySellProductsImagesSoap>(models.size());

		for (BuySellProductsImages model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BuySellProductsImagesSoap[soapModels.size()]);
	}

	public BuySellProductsImagesSoap() {
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

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public String getImage_name() {
		return _image_name;
	}

	public void setImage_name(String image_name) {
		_image_name = image_name;
	}

	public String getImage_path() {
		return _image_path;
	}

	public void setImage_path(String image_path) {
		_image_path = image_path;
	}

	public long getProduct_id() {
		return _product_id;
	}

	public void setProduct_id(long product_id) {
		_product_id = product_id;
	}

	private long _id;
	private long _content_id;
	private String _image_name;
	private String _image_path;
	private long _product_id;
}