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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link BuySellProductsImages}.
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySellProductsImages
 * @generated
 */
@ProviderType
public class BuySellProductsImagesWrapper implements BuySellProductsImages,
	ModelWrapper<BuySellProductsImages> {
	public BuySellProductsImagesWrapper(
		BuySellProductsImages buySellProductsImages) {
		_buySellProductsImages = buySellProductsImages;
	}

	@Override
	public Class<?> getModelClass() {
		return BuySellProductsImages.class;
	}

	@Override
	public String getModelClassName() {
		return BuySellProductsImages.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("image_name", getImage_name());
		attributes.put("image_path", getImage_path());
		attributes.put("product_id", getProduct_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		String image_name = (String)attributes.get("image_name");

		if (image_name != null) {
			setImage_name(image_name);
		}

		String image_path = (String)attributes.get("image_path");

		if (image_path != null) {
			setImage_path(image_path);
		}

		Long product_id = (Long)attributes.get("product_id");

		if (product_id != null) {
			setProduct_id(product_id);
		}
	}

	@Override
	public BuySellProductsImages toEscapedModel() {
		return new BuySellProductsImagesWrapper(_buySellProductsImages.toEscapedModel());
	}

	@Override
	public BuySellProductsImages toUnescapedModel() {
		return new BuySellProductsImagesWrapper(_buySellProductsImages.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _buySellProductsImages.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _buySellProductsImages.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _buySellProductsImages.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _buySellProductsImages.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<BuySellProductsImages> toCacheModel() {
		return _buySellProductsImages.toCacheModel();
	}

	@Override
	public int compareTo(BuySellProductsImages buySellProductsImages) {
		return _buySellProductsImages.compareTo(buySellProductsImages);
	}

	@Override
	public int hashCode() {
		return _buySellProductsImages.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _buySellProductsImages.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BuySellProductsImagesWrapper((BuySellProductsImages)_buySellProductsImages.clone());
	}

	/**
	* Returns the image_name of this buy sell products images.
	*
	* @return the image_name of this buy sell products images
	*/
	@Override
	public java.lang.String getImage_name() {
		return _buySellProductsImages.getImage_name();
	}

	/**
	* Returns the image_path of this buy sell products images.
	*
	* @return the image_path of this buy sell products images
	*/
	@Override
	public java.lang.String getImage_path() {
		return _buySellProductsImages.getImage_path();
	}

	@Override
	public java.lang.String toString() {
		return _buySellProductsImages.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _buySellProductsImages.toXmlString();
	}

	/**
	* Returns the content_id of this buy sell products images.
	*
	* @return the content_id of this buy sell products images
	*/
	@Override
	public long getContent_id() {
		return _buySellProductsImages.getContent_id();
	}

	/**
	* Returns the ID of this buy sell products images.
	*
	* @return the ID of this buy sell products images
	*/
	@Override
	public long getId() {
		return _buySellProductsImages.getId();
	}

	/**
	* Returns the primary key of this buy sell products images.
	*
	* @return the primary key of this buy sell products images
	*/
	@Override
	public long getPrimaryKey() {
		return _buySellProductsImages.getPrimaryKey();
	}

	/**
	* Returns the product_id of this buy sell products images.
	*
	* @return the product_id of this buy sell products images
	*/
	@Override
	public long getProduct_id() {
		return _buySellProductsImages.getProduct_id();
	}

	@Override
	public void persist() {
		_buySellProductsImages.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_buySellProductsImages.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this buy sell products images.
	*
	* @param content_id the content_id of this buy sell products images
	*/
	@Override
	public void setContent_id(long content_id) {
		_buySellProductsImages.setContent_id(content_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_buySellProductsImages.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_buySellProductsImages.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_buySellProductsImages.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this buy sell products images.
	*
	* @param id the ID of this buy sell products images
	*/
	@Override
	public void setId(long id) {
		_buySellProductsImages.setId(id);
	}

	/**
	* Sets the image_name of this buy sell products images.
	*
	* @param image_name the image_name of this buy sell products images
	*/
	@Override
	public void setImage_name(java.lang.String image_name) {
		_buySellProductsImages.setImage_name(image_name);
	}

	/**
	* Sets the image_path of this buy sell products images.
	*
	* @param image_path the image_path of this buy sell products images
	*/
	@Override
	public void setImage_path(java.lang.String image_path) {
		_buySellProductsImages.setImage_path(image_path);
	}

	@Override
	public void setNew(boolean n) {
		_buySellProductsImages.setNew(n);
	}

	/**
	* Sets the primary key of this buy sell products images.
	*
	* @param primaryKey the primary key of this buy sell products images
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_buySellProductsImages.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_buySellProductsImages.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product_id of this buy sell products images.
	*
	* @param product_id the product_id of this buy sell products images
	*/
	@Override
	public void setProduct_id(long product_id) {
		_buySellProductsImages.setProduct_id(product_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BuySellProductsImagesWrapper)) {
			return false;
		}

		BuySellProductsImagesWrapper buySellProductsImagesWrapper = (BuySellProductsImagesWrapper)obj;

		if (Objects.equals(_buySellProductsImages,
					buySellProductsImagesWrapper._buySellProductsImages)) {
			return true;
		}

		return false;
	}

	@Override
	public BuySellProductsImages getWrappedModel() {
		return _buySellProductsImages;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _buySellProductsImages.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _buySellProductsImages.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_buySellProductsImages.resetOriginalValues();
	}

	private final BuySellProductsImages _buySellProductsImages;
}