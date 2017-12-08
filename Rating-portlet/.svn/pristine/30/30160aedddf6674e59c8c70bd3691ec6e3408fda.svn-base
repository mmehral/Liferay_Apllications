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

package com.chola.rating.model;

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
 * This class is a wrapper for {@link Rating}.
 * </p>
 *
 * @author CloverLiferay03
 * @see Rating
 * @generated
 */
@ProviderType
public class RatingWrapper implements Rating, ModelWrapper<Rating> {
	public RatingWrapper(Rating rating) {
		_rating = rating;
	}

	@Override
	public Class<?> getModelClass() {
		return Rating.class;
	}

	@Override
	public String getModelClassName() {
		return Rating.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ratingId", getRatingId());
		attributes.put("content", getContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ratingId = (Long)attributes.get("ratingId");

		if (ratingId != null) {
			setRatingId(ratingId);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@Override
	public Rating toEscapedModel() {
		return new RatingWrapper(_rating.toEscapedModel());
	}

	@Override
	public Rating toUnescapedModel() {
		return new RatingWrapper(_rating.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _rating.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _rating.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _rating.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _rating.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Rating> toCacheModel() {
		return _rating.toCacheModel();
	}

	@Override
	public int compareTo(Rating rating) {
		return _rating.compareTo(rating);
	}

	@Override
	public int hashCode() {
		return _rating.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rating.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RatingWrapper((Rating)_rating.clone());
	}

	/**
	* Returns the content of this rating.
	*
	* @return the content of this rating
	*/
	@Override
	public java.lang.String getContent() {
		return _rating.getContent();
	}

	@Override
	public java.lang.String toString() {
		return _rating.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rating.toXmlString();
	}

	/**
	* Returns the primary key of this rating.
	*
	* @return the primary key of this rating
	*/
	@Override
	public long getPrimaryKey() {
		return _rating.getPrimaryKey();
	}

	/**
	* Returns the rating ID of this rating.
	*
	* @return the rating ID of this rating
	*/
	@Override
	public long getRatingId() {
		return _rating.getRatingId();
	}

	@Override
	public void persist() {
		_rating.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rating.setCachedModel(cachedModel);
	}

	/**
	* Sets the content of this rating.
	*
	* @param content the content of this rating
	*/
	@Override
	public void setContent(java.lang.String content) {
		_rating.setContent(content);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_rating.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_rating.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_rating.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_rating.setNew(n);
	}

	/**
	* Sets the primary key of this rating.
	*
	* @param primaryKey the primary key of this rating
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rating.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_rating.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rating ID of this rating.
	*
	* @param ratingId the rating ID of this rating
	*/
	@Override
	public void setRatingId(long ratingId) {
		_rating.setRatingId(ratingId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RatingWrapper)) {
			return false;
		}

		RatingWrapper ratingWrapper = (RatingWrapper)obj;

		if (Objects.equals(_rating, ratingWrapper._rating)) {
			return true;
		}

		return false;
	}

	@Override
	public Rating getWrappedModel() {
		return _rating;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _rating.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _rating.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_rating.resetOriginalValues();
	}

	private final Rating _rating;
}