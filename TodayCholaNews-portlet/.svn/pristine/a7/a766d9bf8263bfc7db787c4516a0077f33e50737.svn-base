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

package com.chola.TodaycholaNews.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.TodaycholaNews.exception.NoSuchTodayCholaNewsException;
import com.chola.TodaycholaNews.model.TodayCholaNews;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the today chola news service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.TodaycholaNews.service.persistence.impl.TodayCholaNewsPersistenceImpl
 * @see TodayCholaNewsUtil
 * @generated
 */
@ProviderType
public interface TodayCholaNewsPersistence extends BasePersistence<TodayCholaNews> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TodayCholaNewsUtil} to access the today chola news persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the today chola news in the entity cache if it is enabled.
	*
	* @param todayCholaNews the today chola news
	*/
	public void cacheResult(TodayCholaNews todayCholaNews);

	/**
	* Caches the today chola newses in the entity cache if it is enabled.
	*
	* @param todayCholaNewses the today chola newses
	*/
	public void cacheResult(java.util.List<TodayCholaNews> todayCholaNewses);

	/**
	* Creates a new today chola news with the primary key. Does not add the today chola news to the database.
	*
	* @param id the primary key for the new today chola news
	* @return the new today chola news
	*/
	public TodayCholaNews create(long id);

	/**
	* Removes the today chola news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the today chola news
	* @return the today chola news that was removed
	* @throws NoSuchTodayCholaNewsException if a today chola news with the primary key could not be found
	*/
	public TodayCholaNews remove(long id) throws NoSuchTodayCholaNewsException;

	public TodayCholaNews updateImpl(TodayCholaNews todayCholaNews);

	/**
	* Returns the today chola news with the primary key or throws a {@link NoSuchTodayCholaNewsException} if it could not be found.
	*
	* @param id the primary key of the today chola news
	* @return the today chola news
	* @throws NoSuchTodayCholaNewsException if a today chola news with the primary key could not be found
	*/
	public TodayCholaNews findByPrimaryKey(long id)
		throws NoSuchTodayCholaNewsException;

	/**
	* Returns the today chola news with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the today chola news
	* @return the today chola news, or <code>null</code> if a today chola news with the primary key could not be found
	*/
	public TodayCholaNews fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, TodayCholaNews> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the today chola newses.
	*
	* @return the today chola newses
	*/
	public java.util.List<TodayCholaNews> findAll();

	/**
	* Returns a range of all the today chola newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TodayCholaNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of today chola newses
	* @param end the upper bound of the range of today chola newses (not inclusive)
	* @return the range of today chola newses
	*/
	public java.util.List<TodayCholaNews> findAll(int start, int end);

	/**
	* Returns an ordered range of all the today chola newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TodayCholaNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of today chola newses
	* @param end the upper bound of the range of today chola newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of today chola newses
	*/
	public java.util.List<TodayCholaNews> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TodayCholaNews> orderByComparator);

	/**
	* Returns an ordered range of all the today chola newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TodayCholaNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of today chola newses
	* @param end the upper bound of the range of today chola newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of today chola newses
	*/
	public java.util.List<TodayCholaNews> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TodayCholaNews> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the today chola newses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of today chola newses.
	*
	* @return the number of today chola newses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}