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

package com.chola.swagatam.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.exception.NoSuchswagatamdataException;
import com.chola.swagatam.model.swagatamdata;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the swagatamdata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.swagatam.service.persistence.impl.swagatamdataPersistenceImpl
 * @see swagatamdataUtil
 * @generated
 */
@ProviderType
public interface swagatamdataPersistence extends BasePersistence<swagatamdata> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link swagatamdataUtil} to access the swagatamdata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the swagatamdata in the entity cache if it is enabled.
	*
	* @param swagatamdata the swagatamdata
	*/
	public void cacheResult(swagatamdata swagatamdata);

	/**
	* Caches the swagatamdatas in the entity cache if it is enabled.
	*
	* @param swagatamdatas the swagatamdatas
	*/
	public void cacheResult(java.util.List<swagatamdata> swagatamdatas);

	/**
	* Creates a new swagatamdata with the primary key. Does not add the swagatamdata to the database.
	*
	* @param id the primary key for the new swagatamdata
	* @return the new swagatamdata
	*/
	public swagatamdata create(long id);

	/**
	* Removes the swagatamdata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the swagatamdata
	* @return the swagatamdata that was removed
	* @throws NoSuchswagatamdataException if a swagatamdata with the primary key could not be found
	*/
	public swagatamdata remove(long id) throws NoSuchswagatamdataException;

	public swagatamdata updateImpl(swagatamdata swagatamdata);

	/**
	* Returns the swagatamdata with the primary key or throws a {@link NoSuchswagatamdataException} if it could not be found.
	*
	* @param id the primary key of the swagatamdata
	* @return the swagatamdata
	* @throws NoSuchswagatamdataException if a swagatamdata with the primary key could not be found
	*/
	public swagatamdata findByPrimaryKey(long id)
		throws NoSuchswagatamdataException;

	/**
	* Returns the swagatamdata with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the swagatamdata
	* @return the swagatamdata, or <code>null</code> if a swagatamdata with the primary key could not be found
	*/
	public swagatamdata fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, swagatamdata> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the swagatamdatas.
	*
	* @return the swagatamdatas
	*/
	public java.util.List<swagatamdata> findAll();

	/**
	* Returns a range of all the swagatamdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatamdatas
	* @param end the upper bound of the range of swagatamdatas (not inclusive)
	* @return the range of swagatamdatas
	*/
	public java.util.List<swagatamdata> findAll(int start, int end);

	/**
	* Returns an ordered range of all the swagatamdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatamdatas
	* @param end the upper bound of the range of swagatamdatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of swagatamdatas
	*/
	public java.util.List<swagatamdata> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<swagatamdata> orderByComparator);

	/**
	* Returns an ordered range of all the swagatamdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatamdatas
	* @param end the upper bound of the range of swagatamdatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of swagatamdatas
	*/
	public java.util.List<swagatamdata> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<swagatamdata> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the swagatamdatas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of swagatamdatas.
	*
	* @return the number of swagatamdatas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}