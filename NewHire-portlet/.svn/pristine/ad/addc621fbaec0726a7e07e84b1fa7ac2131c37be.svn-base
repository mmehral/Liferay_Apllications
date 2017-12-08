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

package com.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.service.exception.NoSuchnewhireException;

import com.service.model.newhire;

/**
 * The persistence interface for the newhire service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.service.service.persistence.impl.newhirePersistenceImpl
 * @see newhireUtil
 * @generated
 */
@ProviderType
public interface newhirePersistence extends BasePersistence<newhire> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link newhireUtil} to access the newhire persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the newhire in the entity cache if it is enabled.
	*
	* @param newhire the newhire
	*/
	public void cacheResult(newhire newhire);

	/**
	* Caches the newhires in the entity cache if it is enabled.
	*
	* @param newhires the newhires
	*/
	public void cacheResult(java.util.List<newhire> newhires);

	/**
	* Creates a new newhire with the primary key. Does not add the newhire to the database.
	*
	* @param newhire_id the primary key for the new newhire
	* @return the new newhire
	*/
	public newhire create(long newhire_id);

	/**
	* Removes the newhire with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newhire_id the primary key of the newhire
	* @return the newhire that was removed
	* @throws NoSuchnewhireException if a newhire with the primary key could not be found
	*/
	public newhire remove(long newhire_id) throws NoSuchnewhireException;

	public newhire updateImpl(newhire newhire);

	/**
	* Returns the newhire with the primary key or throws a {@link NoSuchnewhireException} if it could not be found.
	*
	* @param newhire_id the primary key of the newhire
	* @return the newhire
	* @throws NoSuchnewhireException if a newhire with the primary key could not be found
	*/
	public newhire findByPrimaryKey(long newhire_id)
		throws NoSuchnewhireException;

	/**
	* Returns the newhire with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param newhire_id the primary key of the newhire
	* @return the newhire, or <code>null</code> if a newhire with the primary key could not be found
	*/
	public newhire fetchByPrimaryKey(long newhire_id);

	@Override
	public java.util.Map<java.io.Serializable, newhire> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the newhires.
	*
	* @return the newhires
	*/
	public java.util.List<newhire> findAll();

	/**
	* Returns a range of all the newhires.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of newhires
	* @param end the upper bound of the range of newhires (not inclusive)
	* @return the range of newhires
	*/
	public java.util.List<newhire> findAll(int start, int end);

	/**
	* Returns an ordered range of all the newhires.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of newhires
	* @param end the upper bound of the range of newhires (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of newhires
	*/
	public java.util.List<newhire> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<newhire> orderByComparator);

	/**
	* Returns an ordered range of all the newhires.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of newhires
	* @param end the upper bound of the range of newhires (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of newhires
	*/
	public java.util.List<newhire> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<newhire> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the newhires from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of newhires.
	*
	* @return the number of newhires
	*/
	public int countAll();
}