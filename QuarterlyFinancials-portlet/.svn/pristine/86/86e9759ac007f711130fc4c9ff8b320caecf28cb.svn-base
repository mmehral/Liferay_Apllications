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

package com.chola.quarterly.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.quarterly.exception.NoSuchquarterlyreportsException;
import com.chola.quarterly.model.quarterlyreports;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the quarterlyreports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.quarterly.service.persistence.impl.quarterlyreportsPersistenceImpl
 * @see quarterlyreportsUtil
 * @generated
 */
@ProviderType
public interface quarterlyreportsPersistence extends BasePersistence<quarterlyreports> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link quarterlyreportsUtil} to access the quarterlyreports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the quarterlyreports in the entity cache if it is enabled.
	*
	* @param quarterlyreports the quarterlyreports
	*/
	public void cacheResult(quarterlyreports quarterlyreports);

	/**
	* Caches the quarterlyreportses in the entity cache if it is enabled.
	*
	* @param quarterlyreportses the quarterlyreportses
	*/
	public void cacheResult(java.util.List<quarterlyreports> quarterlyreportses);

	/**
	* Creates a new quarterlyreports with the primary key. Does not add the quarterlyreports to the database.
	*
	* @param id the primary key for the new quarterlyreports
	* @return the new quarterlyreports
	*/
	public quarterlyreports create(long id);

	/**
	* Removes the quarterlyreports with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the quarterlyreports
	* @return the quarterlyreports that was removed
	* @throws NoSuchquarterlyreportsException if a quarterlyreports with the primary key could not be found
	*/
	public quarterlyreports remove(long id)
		throws NoSuchquarterlyreportsException;

	public quarterlyreports updateImpl(quarterlyreports quarterlyreports);

	/**
	* Returns the quarterlyreports with the primary key or throws a {@link NoSuchquarterlyreportsException} if it could not be found.
	*
	* @param id the primary key of the quarterlyreports
	* @return the quarterlyreports
	* @throws NoSuchquarterlyreportsException if a quarterlyreports with the primary key could not be found
	*/
	public quarterlyreports findByPrimaryKey(long id)
		throws NoSuchquarterlyreportsException;

	/**
	* Returns the quarterlyreports with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the quarterlyreports
	* @return the quarterlyreports, or <code>null</code> if a quarterlyreports with the primary key could not be found
	*/
	public quarterlyreports fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, quarterlyreports> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the quarterlyreportses.
	*
	* @return the quarterlyreportses
	*/
	public java.util.List<quarterlyreports> findAll();

	/**
	* Returns a range of all the quarterlyreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of quarterlyreportses
	* @param end the upper bound of the range of quarterlyreportses (not inclusive)
	* @return the range of quarterlyreportses
	*/
	public java.util.List<quarterlyreports> findAll(int start, int end);

	/**
	* Returns an ordered range of all the quarterlyreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of quarterlyreportses
	* @param end the upper bound of the range of quarterlyreportses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of quarterlyreportses
	*/
	public java.util.List<quarterlyreports> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<quarterlyreports> orderByComparator);

	/**
	* Returns an ordered range of all the quarterlyreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of quarterlyreportses
	* @param end the upper bound of the range of quarterlyreportses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of quarterlyreportses
	*/
	public java.util.List<quarterlyreports> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<quarterlyreports> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the quarterlyreportses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of quarterlyreportses.
	*
	* @return the number of quarterlyreportses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}