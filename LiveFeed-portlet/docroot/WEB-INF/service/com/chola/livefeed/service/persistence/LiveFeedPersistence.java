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

package com.chola.livefeed.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.livefeed.exception.NoSuchLiveFeedException;
import com.chola.livefeed.model.LiveFeed;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the live feed service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.livefeed.service.persistence.impl.LiveFeedPersistenceImpl
 * @see LiveFeedUtil
 * @generated
 */
@ProviderType
public interface LiveFeedPersistence extends BasePersistence<LiveFeed> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LiveFeedUtil} to access the live feed persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the live feed in the entity cache if it is enabled.
	*
	* @param liveFeed the live feed
	*/
	public void cacheResult(LiveFeed liveFeed);

	/**
	* Caches the live feeds in the entity cache if it is enabled.
	*
	* @param liveFeeds the live feeds
	*/
	public void cacheResult(java.util.List<LiveFeed> liveFeeds);

	/**
	* Creates a new live feed with the primary key. Does not add the live feed to the database.
	*
	* @param id the primary key for the new live feed
	* @return the new live feed
	*/
	public LiveFeed create(long id);

	/**
	* Removes the live feed with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the live feed
	* @return the live feed that was removed
	* @throws NoSuchLiveFeedException if a live feed with the primary key could not be found
	*/
	public LiveFeed remove(long id) throws NoSuchLiveFeedException;

	public LiveFeed updateImpl(LiveFeed liveFeed);

	/**
	* Returns the live feed with the primary key or throws a {@link NoSuchLiveFeedException} if it could not be found.
	*
	* @param id the primary key of the live feed
	* @return the live feed
	* @throws NoSuchLiveFeedException if a live feed with the primary key could not be found
	*/
	public LiveFeed findByPrimaryKey(long id) throws NoSuchLiveFeedException;

	/**
	* Returns the live feed with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the live feed
	* @return the live feed, or <code>null</code> if a live feed with the primary key could not be found
	*/
	public LiveFeed fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, LiveFeed> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the live feeds.
	*
	* @return the live feeds
	*/
	public java.util.List<LiveFeed> findAll();

	/**
	* Returns a range of all the live feeds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of live feeds
	* @param end the upper bound of the range of live feeds (not inclusive)
	* @return the range of live feeds
	*/
	public java.util.List<LiveFeed> findAll(int start, int end);

	/**
	* Returns an ordered range of all the live feeds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of live feeds
	* @param end the upper bound of the range of live feeds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of live feeds
	*/
	public java.util.List<LiveFeed> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiveFeed> orderByComparator);

	/**
	* Returns an ordered range of all the live feeds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of live feeds
	* @param end the upper bound of the range of live feeds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of live feeds
	*/
	public java.util.List<LiveFeed> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LiveFeed> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the live feeds from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of live feeds.
	*
	* @return the number of live feeds
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}