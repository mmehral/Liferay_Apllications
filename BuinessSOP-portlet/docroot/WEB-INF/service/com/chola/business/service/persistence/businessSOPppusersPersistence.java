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

package com.chola.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.exception.NoSuchbusinessSOPppusersException;
import com.chola.business.model.businessSOPppusers;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the business s o pppusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.business.service.persistence.impl.businessSOPppusersPersistenceImpl
 * @see businessSOPppusersUtil
 * @generated
 */
@ProviderType
public interface businessSOPppusersPersistence extends BasePersistence<businessSOPppusers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link businessSOPppusersUtil} to access the business s o pppusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the business s o pppusers in the entity cache if it is enabled.
	*
	* @param businessSOPppusers the business s o pppusers
	*/
	public void cacheResult(businessSOPppusers businessSOPppusers);

	/**
	* Caches the business s o pppuserses in the entity cache if it is enabled.
	*
	* @param businessSOPppuserses the business s o pppuserses
	*/
	public void cacheResult(
		java.util.List<businessSOPppusers> businessSOPppuserses);

	/**
	* Creates a new business s o pppusers with the primary key. Does not add the business s o pppusers to the database.
	*
	* @param id the primary key for the new business s o pppusers
	* @return the new business s o pppusers
	*/
	public businessSOPppusers create(long id);

	/**
	* Removes the business s o pppusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the business s o pppusers
	* @return the business s o pppusers that was removed
	* @throws NoSuchbusinessSOPppusersException if a business s o pppusers with the primary key could not be found
	*/
	public businessSOPppusers remove(long id)
		throws NoSuchbusinessSOPppusersException;

	public businessSOPppusers updateImpl(businessSOPppusers businessSOPppusers);

	/**
	* Returns the business s o pppusers with the primary key or throws a {@link NoSuchbusinessSOPppusersException} if it could not be found.
	*
	* @param id the primary key of the business s o pppusers
	* @return the business s o pppusers
	* @throws NoSuchbusinessSOPppusersException if a business s o pppusers with the primary key could not be found
	*/
	public businessSOPppusers findByPrimaryKey(long id)
		throws NoSuchbusinessSOPppusersException;

	/**
	* Returns the business s o pppusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the business s o pppusers
	* @return the business s o pppusers, or <code>null</code> if a business s o pppusers with the primary key could not be found
	*/
	public businessSOPppusers fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, businessSOPppusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the business s o pppuserses.
	*
	* @return the business s o pppuserses
	*/
	public java.util.List<businessSOPppusers> findAll();

	/**
	* Returns a range of all the business s o pppuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessSOPppusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business s o pppuserses
	* @param end the upper bound of the range of business s o pppuserses (not inclusive)
	* @return the range of business s o pppuserses
	*/
	public java.util.List<businessSOPppusers> findAll(int start, int end);

	/**
	* Returns an ordered range of all the business s o pppuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessSOPppusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business s o pppuserses
	* @param end the upper bound of the range of business s o pppuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of business s o pppuserses
	*/
	public java.util.List<businessSOPppusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businessSOPppusers> orderByComparator);

	/**
	* Returns an ordered range of all the business s o pppuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessSOPppusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business s o pppuserses
	* @param end the upper bound of the range of business s o pppuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of business s o pppuserses
	*/
	public java.util.List<businessSOPppusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businessSOPppusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the business s o pppuserses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of business s o pppuserses.
	*
	* @return the number of business s o pppuserses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}