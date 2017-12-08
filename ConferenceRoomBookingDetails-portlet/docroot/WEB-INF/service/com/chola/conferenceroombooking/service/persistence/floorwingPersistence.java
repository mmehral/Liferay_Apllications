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

package com.chola.conferenceroombooking.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.exception.NoSuchfloorwingException;
import com.chola.conferenceroombooking.model.floorwing;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the floorwing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.conferenceroombooking.service.persistence.impl.floorwingPersistenceImpl
 * @see floorwingUtil
 * @generated
 */
@ProviderType
public interface floorwingPersistence extends BasePersistence<floorwing> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link floorwingUtil} to access the floorwing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the floorwing in the entity cache if it is enabled.
	*
	* @param floorwing the floorwing
	*/
	public void cacheResult(floorwing floorwing);

	/**
	* Caches the floorwings in the entity cache if it is enabled.
	*
	* @param floorwings the floorwings
	*/
	public void cacheResult(java.util.List<floorwing> floorwings);

	/**
	* Creates a new floorwing with the primary key. Does not add the floorwing to the database.
	*
	* @param floorwing_id the primary key for the new floorwing
	* @return the new floorwing
	*/
	public floorwing create(long floorwing_id);

	/**
	* Removes the floorwing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param floorwing_id the primary key of the floorwing
	* @return the floorwing that was removed
	* @throws NoSuchfloorwingException if a floorwing with the primary key could not be found
	*/
	public floorwing remove(long floorwing_id) throws NoSuchfloorwingException;

	public floorwing updateImpl(floorwing floorwing);

	/**
	* Returns the floorwing with the primary key or throws a {@link NoSuchfloorwingException} if it could not be found.
	*
	* @param floorwing_id the primary key of the floorwing
	* @return the floorwing
	* @throws NoSuchfloorwingException if a floorwing with the primary key could not be found
	*/
	public floorwing findByPrimaryKey(long floorwing_id)
		throws NoSuchfloorwingException;

	/**
	* Returns the floorwing with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param floorwing_id the primary key of the floorwing
	* @return the floorwing, or <code>null</code> if a floorwing with the primary key could not be found
	*/
	public floorwing fetchByPrimaryKey(long floorwing_id);

	@Override
	public java.util.Map<java.io.Serializable, floorwing> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the floorwings.
	*
	* @return the floorwings
	*/
	public java.util.List<floorwing> findAll();

	/**
	* Returns a range of all the floorwings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floorwings
	* @param end the upper bound of the range of floorwings (not inclusive)
	* @return the range of floorwings
	*/
	public java.util.List<floorwing> findAll(int start, int end);

	/**
	* Returns an ordered range of all the floorwings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floorwings
	* @param end the upper bound of the range of floorwings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of floorwings
	*/
	public java.util.List<floorwing> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<floorwing> orderByComparator);

	/**
	* Returns an ordered range of all the floorwings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floorwings
	* @param end the upper bound of the range of floorwings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of floorwings
	*/
	public java.util.List<floorwing> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<floorwing> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the floorwings from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of floorwings.
	*
	* @return the number of floorwings
	*/
	public int countAll();
}