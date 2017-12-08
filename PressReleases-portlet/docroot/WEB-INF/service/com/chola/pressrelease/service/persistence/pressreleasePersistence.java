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

package com.chola.pressrelease.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.pressrelease.exception.NoSuchpressreleaseException;
import com.chola.pressrelease.model.pressrelease;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the pressrelease service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.pressrelease.service.persistence.impl.pressreleasePersistenceImpl
 * @see pressreleaseUtil
 * @generated
 */
@ProviderType
public interface pressreleasePersistence extends BasePersistence<pressrelease> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link pressreleaseUtil} to access the pressrelease persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the pressrelease in the entity cache if it is enabled.
	*
	* @param pressrelease the pressrelease
	*/
	public void cacheResult(pressrelease pressrelease);

	/**
	* Caches the pressreleases in the entity cache if it is enabled.
	*
	* @param pressreleases the pressreleases
	*/
	public void cacheResult(java.util.List<pressrelease> pressreleases);

	/**
	* Creates a new pressrelease with the primary key. Does not add the pressrelease to the database.
	*
	* @param id the primary key for the new pressrelease
	* @return the new pressrelease
	*/
	public pressrelease create(long id);

	/**
	* Removes the pressrelease with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the pressrelease
	* @return the pressrelease that was removed
	* @throws NoSuchpressreleaseException if a pressrelease with the primary key could not be found
	*/
	public pressrelease remove(long id) throws NoSuchpressreleaseException;

	public pressrelease updateImpl(pressrelease pressrelease);

	/**
	* Returns the pressrelease with the primary key or throws a {@link NoSuchpressreleaseException} if it could not be found.
	*
	* @param id the primary key of the pressrelease
	* @return the pressrelease
	* @throws NoSuchpressreleaseException if a pressrelease with the primary key could not be found
	*/
	public pressrelease findByPrimaryKey(long id)
		throws NoSuchpressreleaseException;

	/**
	* Returns the pressrelease with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the pressrelease
	* @return the pressrelease, or <code>null</code> if a pressrelease with the primary key could not be found
	*/
	public pressrelease fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, pressrelease> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the pressreleases.
	*
	* @return the pressreleases
	*/
	public java.util.List<pressrelease> findAll();

	/**
	* Returns a range of all the pressreleases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pressreleases
	* @param end the upper bound of the range of pressreleases (not inclusive)
	* @return the range of pressreleases
	*/
	public java.util.List<pressrelease> findAll(int start, int end);

	/**
	* Returns an ordered range of all the pressreleases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pressreleases
	* @param end the upper bound of the range of pressreleases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pressreleases
	*/
	public java.util.List<pressrelease> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<pressrelease> orderByComparator);

	/**
	* Returns an ordered range of all the pressreleases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pressreleases
	* @param end the upper bound of the range of pressreleases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of pressreleases
	*/
	public java.util.List<pressrelease> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<pressrelease> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the pressreleases from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of pressreleases.
	*
	* @return the number of pressreleases
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}