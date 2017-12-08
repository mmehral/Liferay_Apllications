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

package com.chola.news.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.news.exception.NoSuchAround_WorldException;
import com.chola.news.model.Around_World;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the around_ world service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.news.service.persistence.impl.Around_WorldPersistenceImpl
 * @see Around_WorldUtil
 * @generated
 */
@ProviderType
public interface Around_WorldPersistence extends BasePersistence<Around_World> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Around_WorldUtil} to access the around_ world persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the around_ world in the entity cache if it is enabled.
	*
	* @param around_World the around_ world
	*/
	public void cacheResult(Around_World around_World);

	/**
	* Caches the around_ worlds in the entity cache if it is enabled.
	*
	* @param around_Worlds the around_ worlds
	*/
	public void cacheResult(java.util.List<Around_World> around_Worlds);

	/**
	* Creates a new around_ world with the primary key. Does not add the around_ world to the database.
	*
	* @param id the primary key for the new around_ world
	* @return the new around_ world
	*/
	public Around_World create(long id);

	/**
	* Removes the around_ world with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the around_ world
	* @return the around_ world that was removed
	* @throws NoSuchAround_WorldException if a around_ world with the primary key could not be found
	*/
	public Around_World remove(long id) throws NoSuchAround_WorldException;

	public Around_World updateImpl(Around_World around_World);

	/**
	* Returns the around_ world with the primary key or throws a {@link NoSuchAround_WorldException} if it could not be found.
	*
	* @param id the primary key of the around_ world
	* @return the around_ world
	* @throws NoSuchAround_WorldException if a around_ world with the primary key could not be found
	*/
	public Around_World findByPrimaryKey(long id)
		throws NoSuchAround_WorldException;

	/**
	* Returns the around_ world with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the around_ world
	* @return the around_ world, or <code>null</code> if a around_ world with the primary key could not be found
	*/
	public Around_World fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, Around_World> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the around_ worlds.
	*
	* @return the around_ worlds
	*/
	public java.util.List<Around_World> findAll();

	/**
	* Returns a range of all the around_ worlds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of around_ worlds
	* @param end the upper bound of the range of around_ worlds (not inclusive)
	* @return the range of around_ worlds
	*/
	public java.util.List<Around_World> findAll(int start, int end);

	/**
	* Returns an ordered range of all the around_ worlds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of around_ worlds
	* @param end the upper bound of the range of around_ worlds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of around_ worlds
	*/
	public java.util.List<Around_World> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Around_World> orderByComparator);

	/**
	* Returns an ordered range of all the around_ worlds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of around_ worlds
	* @param end the upper bound of the range of around_ worlds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of around_ worlds
	*/
	public java.util.List<Around_World> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Around_World> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the around_ worlds from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of around_ worlds.
	*
	* @return the number of around_ worlds
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}