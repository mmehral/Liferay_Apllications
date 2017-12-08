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

import com.chola.trainingcalendar.exception.NoSuchtrainingcalendardataException;
import com.chola.trainingcalendar.model.trainingcalendardata;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the trainingcalendardata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingcalendardataPersistenceImpl
 * @see trainingcalendardataUtil
 * @generated
 */
@ProviderType
public interface trainingcalendardataPersistence extends BasePersistence<trainingcalendardata> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link trainingcalendardataUtil} to access the trainingcalendardata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the trainingcalendardata in the entity cache if it is enabled.
	*
	* @param trainingcalendardata the trainingcalendardata
	*/
	public void cacheResult(trainingcalendardata trainingcalendardata);

	/**
	* Caches the trainingcalendardatas in the entity cache if it is enabled.
	*
	* @param trainingcalendardatas the trainingcalendardatas
	*/
	public void cacheResult(
		java.util.List<trainingcalendardata> trainingcalendardatas);

	/**
	* Creates a new trainingcalendardata with the primary key. Does not add the trainingcalendardata to the database.
	*
	* @param id the primary key for the new trainingcalendardata
	* @return the new trainingcalendardata
	*/
	public trainingcalendardata create(long id);

	/**
	* Removes the trainingcalendardata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata that was removed
	* @throws NoSuchtrainingcalendardataException if a trainingcalendardata with the primary key could not be found
	*/
	public trainingcalendardata remove(long id)
		throws NoSuchtrainingcalendardataException;

	public trainingcalendardata updateImpl(
		trainingcalendardata trainingcalendardata);

	/**
	* Returns the trainingcalendardata with the primary key or throws a {@link NoSuchtrainingcalendardataException} if it could not be found.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata
	* @throws NoSuchtrainingcalendardataException if a trainingcalendardata with the primary key could not be found
	*/
	public trainingcalendardata findByPrimaryKey(long id)
		throws NoSuchtrainingcalendardataException;

	/**
	* Returns the trainingcalendardata with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata, or <code>null</code> if a trainingcalendardata with the primary key could not be found
	*/
	public trainingcalendardata fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, trainingcalendardata> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the trainingcalendardatas.
	*
	* @return the trainingcalendardatas
	*/
	public java.util.List<trainingcalendardata> findAll();

	/**
	* Returns a range of all the trainingcalendardatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendardatas
	* @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	* @return the range of trainingcalendardatas
	*/
	public java.util.List<trainingcalendardata> findAll(int start, int end);

	/**
	* Returns an ordered range of all the trainingcalendardatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendardatas
	* @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingcalendardatas
	*/
	public java.util.List<trainingcalendardata> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcalendardata> orderByComparator);

	/**
	* Returns an ordered range of all the trainingcalendardatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendardatas
	* @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingcalendardatas
	*/
	public java.util.List<trainingcalendardata> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcalendardata> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the trainingcalendardatas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of trainingcalendardatas.
	*
	* @return the number of trainingcalendardatas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}