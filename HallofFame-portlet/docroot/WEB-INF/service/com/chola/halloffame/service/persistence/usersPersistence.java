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

package com.chola.halloffame.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.halloffame.exception.NoSuchusersException;
import com.chola.halloffame.model.users;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.halloffame.service.persistence.impl.usersPersistenceImpl
 * @see usersUtil
 * @generated
 */
@ProviderType
public interface usersPersistence extends BasePersistence<users> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link usersUtil} to access the users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the users in the entity cache if it is enabled.
	*
	* @param users the users
	*/
	public void cacheResult(users users);

	/**
	* Caches the userses in the entity cache if it is enabled.
	*
	* @param userses the userses
	*/
	public void cacheResult(java.util.List<users> userses);

	/**
	* Creates a new users with the primary key. Does not add the users to the database.
	*
	* @param Id the primary key for the new users
	* @return the new users
	*/
	public users create(long Id);

	/**
	* Removes the users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the users
	* @return the users that was removed
	* @throws NoSuchusersException if a users with the primary key could not be found
	*/
	public users remove(long Id) throws NoSuchusersException;

	public users updateImpl(users users);

	/**
	* Returns the users with the primary key or throws a {@link NoSuchusersException} if it could not be found.
	*
	* @param Id the primary key of the users
	* @return the users
	* @throws NoSuchusersException if a users with the primary key could not be found
	*/
	public users findByPrimaryKey(long Id) throws NoSuchusersException;

	/**
	* Returns the users with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the users
	* @return the users, or <code>null</code> if a users with the primary key could not be found
	*/
	public users fetchByPrimaryKey(long Id);

	@Override
	public java.util.Map<java.io.Serializable, users> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the userses.
	*
	* @return the userses
	*/
	public java.util.List<users> findAll();

	/**
	* Returns a range of all the userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of userses
	* @param end the upper bound of the range of userses (not inclusive)
	* @return the range of userses
	*/
	public java.util.List<users> findAll(int start, int end);

	/**
	* Returns an ordered range of all the userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of userses
	* @param end the upper bound of the range of userses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of userses
	*/
	public java.util.List<users> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<users> orderByComparator);

	/**
	* Returns an ordered range of all the userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of userses
	* @param end the upper bound of the range of userses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of userses
	*/
	public java.util.List<users> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<users> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the userses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of userses.
	*
	* @return the number of userses
	*/
	public int countAll();
}