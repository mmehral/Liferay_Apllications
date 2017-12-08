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

import com.chola.conferenceroombooking.exception.NoSuchfacilitymasterException;
import com.chola.conferenceroombooking.model.facilitymaster;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the facilitymaster service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.conferenceroombooking.service.persistence.impl.facilitymasterPersistenceImpl
 * @see facilitymasterUtil
 * @generated
 */
@ProviderType
public interface facilitymasterPersistence extends BasePersistence<facilitymaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link facilitymasterUtil} to access the facilitymaster persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the facilitymaster in the entity cache if it is enabled.
	*
	* @param facilitymaster the facilitymaster
	*/
	public void cacheResult(facilitymaster facilitymaster);

	/**
	* Caches the facilitymasters in the entity cache if it is enabled.
	*
	* @param facilitymasters the facilitymasters
	*/
	public void cacheResult(java.util.List<facilitymaster> facilitymasters);

	/**
	* Creates a new facilitymaster with the primary key. Does not add the facilitymaster to the database.
	*
	* @param facility_id the primary key for the new facilitymaster
	* @return the new facilitymaster
	*/
	public facilitymaster create(long facility_id);

	/**
	* Removes the facilitymaster with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param facility_id the primary key of the facilitymaster
	* @return the facilitymaster that was removed
	* @throws NoSuchfacilitymasterException if a facilitymaster with the primary key could not be found
	*/
	public facilitymaster remove(long facility_id)
		throws NoSuchfacilitymasterException;

	public facilitymaster updateImpl(facilitymaster facilitymaster);

	/**
	* Returns the facilitymaster with the primary key or throws a {@link NoSuchfacilitymasterException} if it could not be found.
	*
	* @param facility_id the primary key of the facilitymaster
	* @return the facilitymaster
	* @throws NoSuchfacilitymasterException if a facilitymaster with the primary key could not be found
	*/
	public facilitymaster findByPrimaryKey(long facility_id)
		throws NoSuchfacilitymasterException;

	/**
	* Returns the facilitymaster with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param facility_id the primary key of the facilitymaster
	* @return the facilitymaster, or <code>null</code> if a facilitymaster with the primary key could not be found
	*/
	public facilitymaster fetchByPrimaryKey(long facility_id);

	@Override
	public java.util.Map<java.io.Serializable, facilitymaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the facilitymasters.
	*
	* @return the facilitymasters
	*/
	public java.util.List<facilitymaster> findAll();

	/**
	* Returns a range of all the facilitymasters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of facilitymasters
	* @param end the upper bound of the range of facilitymasters (not inclusive)
	* @return the range of facilitymasters
	*/
	public java.util.List<facilitymaster> findAll(int start, int end);

	/**
	* Returns an ordered range of all the facilitymasters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of facilitymasters
	* @param end the upper bound of the range of facilitymasters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facilitymasters
	*/
	public java.util.List<facilitymaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<facilitymaster> orderByComparator);

	/**
	* Returns an ordered range of all the facilitymasters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of facilitymasters
	* @param end the upper bound of the range of facilitymasters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of facilitymasters
	*/
	public java.util.List<facilitymaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<facilitymaster> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the facilitymasters from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of facilitymasters.
	*
	* @return the number of facilitymasters
	*/
	public int countAll();
}