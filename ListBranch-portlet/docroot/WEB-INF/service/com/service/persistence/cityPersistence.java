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

package com.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.exception.NoSuchcityException;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.model.city;

/**
 * The persistence interface for the city service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.service.persistence.impl.cityPersistenceImpl
 * @see cityUtil
 * @generated
 */
@ProviderType
public interface cityPersistence extends BasePersistence<city> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link cityUtil} to access the city persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the city in the entity cache if it is enabled.
	*
	* @param city the city
	*/
	public void cacheResult(city city);

	/**
	* Caches the cities in the entity cache if it is enabled.
	*
	* @param cities the cities
	*/
	public void cacheResult(java.util.List<city> cities);

	/**
	* Creates a new city with the primary key. Does not add the city to the database.
	*
	* @param city_id the primary key for the new city
	* @return the new city
	*/
	public city create(long city_id);

	/**
	* Removes the city with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param city_id the primary key of the city
	* @return the city that was removed
	* @throws NoSuchcityException if a city with the primary key could not be found
	*/
	public city remove(long city_id) throws NoSuchcityException;

	public city updateImpl(city city);

	/**
	* Returns the city with the primary key or throws a {@link NoSuchcityException} if it could not be found.
	*
	* @param city_id the primary key of the city
	* @return the city
	* @throws NoSuchcityException if a city with the primary key could not be found
	*/
	public city findByPrimaryKey(long city_id) throws NoSuchcityException;

	/**
	* Returns the city with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param city_id the primary key of the city
	* @return the city, or <code>null</code> if a city with the primary key could not be found
	*/
	public city fetchByPrimaryKey(long city_id);

	@Override
	public java.util.Map<java.io.Serializable, city> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the cities.
	*
	* @return the cities
	*/
	public java.util.List<city> findAll();

	/**
	* Returns a range of all the cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cities
	* @param end the upper bound of the range of cities (not inclusive)
	* @return the range of cities
	*/
	public java.util.List<city> findAll(int start, int end);

	/**
	* Returns an ordered range of all the cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cities
	* @param end the upper bound of the range of cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cities
	*/
	public java.util.List<city> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<city> orderByComparator);

	/**
	* Returns an ordered range of all the cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cities
	* @param end the upper bound of the range of cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cities
	*/
	public java.util.List<city> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<city> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the cities from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of cities.
	*
	* @return the number of cities
	*/
	public int countAll();
}