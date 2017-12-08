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

import com.chola.trainingcalendar.exception.NoSuchtrainingintendedtableException;
import com.chola.trainingcalendar.model.trainingintendedtable;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the trainingintendedtable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingintendedtablePersistenceImpl
 * @see trainingintendedtableUtil
 * @generated
 */
@ProviderType
public interface trainingintendedtablePersistence extends BasePersistence<trainingintendedtable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link trainingintendedtableUtil} to access the trainingintendedtable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the trainingintendedtable in the entity cache if it is enabled.
	*
	* @param trainingintendedtable the trainingintendedtable
	*/
	public void cacheResult(trainingintendedtable trainingintendedtable);

	/**
	* Caches the trainingintendedtables in the entity cache if it is enabled.
	*
	* @param trainingintendedtables the trainingintendedtables
	*/
	public void cacheResult(
		java.util.List<trainingintendedtable> trainingintendedtables);

	/**
	* Creates a new trainingintendedtable with the primary key. Does not add the trainingintendedtable to the database.
	*
	* @param id the primary key for the new trainingintendedtable
	* @return the new trainingintendedtable
	*/
	public trainingintendedtable create(long id);

	/**
	* Removes the trainingintendedtable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingintendedtable
	* @return the trainingintendedtable that was removed
	* @throws NoSuchtrainingintendedtableException if a trainingintendedtable with the primary key could not be found
	*/
	public trainingintendedtable remove(long id)
		throws NoSuchtrainingintendedtableException;

	public trainingintendedtable updateImpl(
		trainingintendedtable trainingintendedtable);

	/**
	* Returns the trainingintendedtable with the primary key or throws a {@link NoSuchtrainingintendedtableException} if it could not be found.
	*
	* @param id the primary key of the trainingintendedtable
	* @return the trainingintendedtable
	* @throws NoSuchtrainingintendedtableException if a trainingintendedtable with the primary key could not be found
	*/
	public trainingintendedtable findByPrimaryKey(long id)
		throws NoSuchtrainingintendedtableException;

	/**
	* Returns the trainingintendedtable with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the trainingintendedtable
	* @return the trainingintendedtable, or <code>null</code> if a trainingintendedtable with the primary key could not be found
	*/
	public trainingintendedtable fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, trainingintendedtable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the trainingintendedtables.
	*
	* @return the trainingintendedtables
	*/
	public java.util.List<trainingintendedtable> findAll();

	/**
	* Returns a range of all the trainingintendedtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingintendedtables
	* @param end the upper bound of the range of trainingintendedtables (not inclusive)
	* @return the range of trainingintendedtables
	*/
	public java.util.List<trainingintendedtable> findAll(int start, int end);

	/**
	* Returns an ordered range of all the trainingintendedtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingintendedtables
	* @param end the upper bound of the range of trainingintendedtables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingintendedtables
	*/
	public java.util.List<trainingintendedtable> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingintendedtable> orderByComparator);

	/**
	* Returns an ordered range of all the trainingintendedtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingintendedtables
	* @param end the upper bound of the range of trainingintendedtables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingintendedtables
	*/
	public java.util.List<trainingintendedtable> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingintendedtable> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the trainingintendedtables from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of trainingintendedtables.
	*
	* @return the number of trainingintendedtables
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}