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

package com.chola.msappointment.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the calendarmsappointment service. Represents a row in the &quot;chola_calendarmsappointment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.chola.msappointment.model.impl.calendarmsappointmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.chola.msappointment.model.impl.calendarmsappointmentImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see calendarmsappointment
 * @see com.chola.msappointment.model.impl.calendarmsappointmentImpl
 * @see com.chola.msappointment.model.impl.calendarmsappointmentModelImpl
 * @generated
 */
@ProviderType
public interface calendarmsappointmentModel extends BaseModel<calendarmsappointment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a calendarmsappointment model instance should use the {@link calendarmsappointment} interface instead.
	 */

	/**
	 * Returns the primary key of this calendarmsappointment.
	 *
	 * @return the primary key of this calendarmsappointment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this calendarmsappointment.
	 *
	 * @param primaryKey the primary key of this calendarmsappointment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this calendarmsappointment.
	 *
	 * @return the ID of this calendarmsappointment
	 */
	public long getId();

	/**
	 * Sets the ID of this calendarmsappointment.
	 *
	 * @param id the ID of this calendarmsappointment
	 */
	public void setId(long id);

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
	public int compareTo(
		com.chola.msappointment.model.calendarmsappointment calendarmsappointment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.chola.msappointment.model.calendarmsappointment> toCacheModel();

	@Override
	public com.chola.msappointment.model.calendarmsappointment toEscapedModel();

	@Override
	public com.chola.msappointment.model.calendarmsappointment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}