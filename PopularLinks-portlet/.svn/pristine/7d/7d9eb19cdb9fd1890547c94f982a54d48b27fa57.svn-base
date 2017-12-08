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

package com.chola.popularlinks.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.popularlinks.exception.NoSuchpopularlinksException;
import com.chola.popularlinks.model.popularlinks;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the popularlinks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.popularlinks.service.persistence.impl.popularlinksPersistenceImpl
 * @see popularlinksUtil
 * @generated
 */
@ProviderType
public interface popularlinksPersistence extends BasePersistence<popularlinks> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link popularlinksUtil} to access the popularlinks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the popularlinks in the entity cache if it is enabled.
	*
	* @param popularlinks the popularlinks
	*/
	public void cacheResult(popularlinks popularlinks);

	/**
	* Caches the popularlinkses in the entity cache if it is enabled.
	*
	* @param popularlinkses the popularlinkses
	*/
	public void cacheResult(java.util.List<popularlinks> popularlinkses);

	/**
	* Creates a new popularlinks with the primary key. Does not add the popularlinks to the database.
	*
	* @param id the primary key for the new popularlinks
	* @return the new popularlinks
	*/
	public popularlinks create(long id);

	/**
	* Removes the popularlinks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks that was removed
	* @throws NoSuchpopularlinksException if a popularlinks with the primary key could not be found
	*/
	public popularlinks remove(long id) throws NoSuchpopularlinksException;

	public popularlinks updateImpl(popularlinks popularlinks);

	/**
	* Returns the popularlinks with the primary key or throws a {@link NoSuchpopularlinksException} if it could not be found.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks
	* @throws NoSuchpopularlinksException if a popularlinks with the primary key could not be found
	*/
	public popularlinks findByPrimaryKey(long id)
		throws NoSuchpopularlinksException;

	/**
	* Returns the popularlinks with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks, or <code>null</code> if a popularlinks with the primary key could not be found
	*/
	public popularlinks fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, popularlinks> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the popularlinkses.
	*
	* @return the popularlinkses
	*/
	public java.util.List<popularlinks> findAll();

	/**
	* Returns a range of all the popularlinkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of popularlinkses
	* @param end the upper bound of the range of popularlinkses (not inclusive)
	* @return the range of popularlinkses
	*/
	public java.util.List<popularlinks> findAll(int start, int end);

	/**
	* Returns an ordered range of all the popularlinkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of popularlinkses
	* @param end the upper bound of the range of popularlinkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of popularlinkses
	*/
	public java.util.List<popularlinks> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<popularlinks> orderByComparator);

	/**
	* Returns an ordered range of all the popularlinkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of popularlinkses
	* @param end the upper bound of the range of popularlinkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of popularlinkses
	*/
	public java.util.List<popularlinks> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<popularlinks> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the popularlinkses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of popularlinkses.
	*
	* @return the number of popularlinkses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}