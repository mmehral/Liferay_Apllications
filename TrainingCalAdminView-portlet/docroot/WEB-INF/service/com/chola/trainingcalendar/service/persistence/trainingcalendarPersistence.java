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

package com.chola.trainingcalendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.exception.NoSuchtrainingcalendarException;
import com.chola.trainingcalendar.model.trainingcalendar;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the trainingcalendar service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingcalendarPersistenceImpl
 * @see trainingcalendarUtil
 * @generated
 */
@ProviderType
public interface trainingcalendarPersistence extends BasePersistence<trainingcalendar> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link trainingcalendarUtil} to access the trainingcalendar persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the trainingcalendar in the entity cache if it is enabled.
	*
	* @param trainingcalendar the trainingcalendar
	*/
	public void cacheResult(trainingcalendar trainingcalendar);

	/**
	* Caches the trainingcalendars in the entity cache if it is enabled.
	*
	* @param trainingcalendars the trainingcalendars
	*/
	public void cacheResult(java.util.List<trainingcalendar> trainingcalendars);

	/**
	* Creates a new trainingcalendar with the primary key. Does not add the trainingcalendar to the database.
	*
	* @param trainingid the primary key for the new trainingcalendar
	* @return the new trainingcalendar
	*/
	public trainingcalendar create(long trainingid);

	/**
	* Removes the trainingcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar that was removed
	* @throws NoSuchtrainingcalendarException if a trainingcalendar with the primary key could not be found
	*/
	public trainingcalendar remove(long trainingid)
		throws NoSuchtrainingcalendarException;

	public trainingcalendar updateImpl(trainingcalendar trainingcalendar);

	/**
	* Returns the trainingcalendar with the primary key or throws a {@link NoSuchtrainingcalendarException} if it could not be found.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar
	* @throws NoSuchtrainingcalendarException if a trainingcalendar with the primary key could not be found
	*/
	public trainingcalendar findByPrimaryKey(long trainingid)
		throws NoSuchtrainingcalendarException;

	/**
	* Returns the trainingcalendar with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar, or <code>null</code> if a trainingcalendar with the primary key could not be found
	*/
	public trainingcalendar fetchByPrimaryKey(long trainingid);

	@Override
	public java.util.Map<java.io.Serializable, trainingcalendar> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the trainingcalendars.
	*
	* @return the trainingcalendars
	*/
	public java.util.List<trainingcalendar> findAll();

	/**
	* Returns a range of all the trainingcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendars
	* @param end the upper bound of the range of trainingcalendars (not inclusive)
	* @return the range of trainingcalendars
	*/
	public java.util.List<trainingcalendar> findAll(int start, int end);

	/**
	* Returns an ordered range of all the trainingcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendars
	* @param end the upper bound of the range of trainingcalendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingcalendars
	*/
	public java.util.List<trainingcalendar> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcalendar> orderByComparator);

	/**
	* Returns an ordered range of all the trainingcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendars
	* @param end the upper bound of the range of trainingcalendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingcalendars
	*/
	public java.util.List<trainingcalendar> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcalendar> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the trainingcalendars from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of trainingcalendars.
	*
	* @return the number of trainingcalendars
	*/
	public int countAll();
}