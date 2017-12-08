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

package com.chola.industrynews.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.industrynews.exception.NoSuchLatestIndustryNewsException;
import com.chola.industrynews.model.LatestIndustryNews;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the latest industry news service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.industrynews.service.persistence.impl.LatestIndustryNewsPersistenceImpl
 * @see LatestIndustryNewsUtil
 * @generated
 */
@ProviderType
public interface LatestIndustryNewsPersistence extends BasePersistence<LatestIndustryNews> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LatestIndustryNewsUtil} to access the latest industry news persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the latest industry news in the entity cache if it is enabled.
	*
	* @param latestIndustryNews the latest industry news
	*/
	public void cacheResult(LatestIndustryNews latestIndustryNews);

	/**
	* Caches the latest industry newses in the entity cache if it is enabled.
	*
	* @param latestIndustryNewses the latest industry newses
	*/
	public void cacheResult(
		java.util.List<LatestIndustryNews> latestIndustryNewses);

	/**
	* Creates a new latest industry news with the primary key. Does not add the latest industry news to the database.
	*
	* @param id the primary key for the new latest industry news
	* @return the new latest industry news
	*/
	public LatestIndustryNews create(long id);

	/**
	* Removes the latest industry news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the latest industry news
	* @return the latest industry news that was removed
	* @throws NoSuchLatestIndustryNewsException if a latest industry news with the primary key could not be found
	*/
	public LatestIndustryNews remove(long id)
		throws NoSuchLatestIndustryNewsException;

	public LatestIndustryNews updateImpl(LatestIndustryNews latestIndustryNews);

	/**
	* Returns the latest industry news with the primary key or throws a {@link NoSuchLatestIndustryNewsException} if it could not be found.
	*
	* @param id the primary key of the latest industry news
	* @return the latest industry news
	* @throws NoSuchLatestIndustryNewsException if a latest industry news with the primary key could not be found
	*/
	public LatestIndustryNews findByPrimaryKey(long id)
		throws NoSuchLatestIndustryNewsException;

	/**
	* Returns the latest industry news with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the latest industry news
	* @return the latest industry news, or <code>null</code> if a latest industry news with the primary key could not be found
	*/
	public LatestIndustryNews fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, LatestIndustryNews> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the latest industry newses.
	*
	* @return the latest industry newses
	*/
	public java.util.List<LatestIndustryNews> findAll();

	/**
	* Returns a range of all the latest industry newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of latest industry newses
	* @param end the upper bound of the range of latest industry newses (not inclusive)
	* @return the range of latest industry newses
	*/
	public java.util.List<LatestIndustryNews> findAll(int start, int end);

	/**
	* Returns an ordered range of all the latest industry newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of latest industry newses
	* @param end the upper bound of the range of latest industry newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of latest industry newses
	*/
	public java.util.List<LatestIndustryNews> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LatestIndustryNews> orderByComparator);

	/**
	* Returns an ordered range of all the latest industry newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of latest industry newses
	* @param end the upper bound of the range of latest industry newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of latest industry newses
	*/
	public java.util.List<LatestIndustryNews> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LatestIndustryNews> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the latest industry newses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of latest industry newses.
	*
	* @return the number of latest industry newses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}