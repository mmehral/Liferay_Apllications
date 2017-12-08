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

package com.chola.industrynews.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the LatestIndustryNews service. Represents a row in the &quot;chola_LatestIndustryNews&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.chola.industrynews.model.impl.LatestIndustryNewsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.chola.industrynews.model.impl.LatestIndustryNewsImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see LatestIndustryNews
 * @see com.chola.industrynews.model.impl.LatestIndustryNewsImpl
 * @see com.chola.industrynews.model.impl.LatestIndustryNewsModelImpl
 * @generated
 */
@ProviderType
public interface LatestIndustryNewsModel extends BaseModel<LatestIndustryNews> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a latest industry news model instance should use the {@link LatestIndustryNews} interface instead.
	 */

	/**
	 * Returns the primary key of this latest industry news.
	 *
	 * @return the primary key of this latest industry news
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this latest industry news.
	 *
	 * @param primaryKey the primary key of this latest industry news
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this latest industry news.
	 *
	 * @return the ID of this latest industry news
	 */
	public long getId();

	/**
	 * Sets the ID of this latest industry news.
	 *
	 * @param id the ID of this latest industry news
	 */
	public void setId(long id);

	/**
	 * Returns the title of this latest industry news.
	 *
	 * @return the title of this latest industry news
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this latest industry news.
	 *
	 * @param title the title of this latest industry news
	 */
	public void setTitle(String title);

	/**
	 * Returns the content of this latest industry news.
	 *
	 * @return the content of this latest industry news
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this latest industry news.
	 *
	 * @param content the content of this latest industry news
	 */
	public void setContent(String content);

	/**
	 * Returns the createdate of this latest industry news.
	 *
	 * @return the createdate of this latest industry news
	 */
	@AutoEscape
	public String getCreatedate();

	/**
	 * Sets the createdate of this latest industry news.
	 *
	 * @param createdate the createdate of this latest industry news
	 */
	public void setCreatedate(String createdate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LatestIndustryNews latestIndustryNews);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LatestIndustryNews> toCacheModel();

	@Override
	public LatestIndustryNews toEscapedModel();

	@Override
	public LatestIndustryNews toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}