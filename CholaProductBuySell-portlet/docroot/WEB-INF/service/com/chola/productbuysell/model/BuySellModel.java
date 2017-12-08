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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the BuySell service. Represents a row in the &quot;chola_BuySell&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.chola.productbuysell.model.impl.BuySellModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.chola.productbuysell.model.impl.BuySellImpl}.
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySell
 * @see com.chola.productbuysell.model.impl.BuySellImpl
 * @see com.chola.productbuysell.model.impl.BuySellModelImpl
 * @generated
 */
@ProviderType
public interface BuySellModel extends BaseModel<BuySell> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a buy sell model instance should use the {@link BuySell} interface instead.
	 */

	/**
	 * Returns the primary key of this buy sell.
	 *
	 * @return the primary key of this buy sell
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this buy sell.
	 *
	 * @param primaryKey the primary key of this buy sell
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this buy sell.
	 *
	 * @return the ID of this buy sell
	 */
	public long getId();

	/**
	 * Sets the ID of this buy sell.
	 *
	 * @param id the ID of this buy sell
	 */
	public void setId(long id);

	/**
	 * Returns the name of this buy sell.
	 *
	 * @return the name of this buy sell
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this buy sell.
	 *
	 * @param name the name of this buy sell
	 */
	public void setName(String name);

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
	public int compareTo(BuySell buySell);

	@Override
	public int hashCode();

	@Override
	public CacheModel<BuySell> toCacheModel();

	@Override
	public BuySell toEscapedModel();

	@Override
	public BuySell toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}