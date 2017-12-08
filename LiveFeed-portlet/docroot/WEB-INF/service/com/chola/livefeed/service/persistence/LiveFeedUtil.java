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

import com.chola.livefeed.model.LiveFeed;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the live feed service. This utility wraps {@link com.chola.livefeed.service.persistence.impl.LiveFeedPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see LiveFeedPersistence
 * @see com.chola.livefeed.service.persistence.impl.LiveFeedPersistenceImpl
 * @generated
 */
@ProviderType
public class LiveFeedUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(LiveFeed liveFeed) {
		getPersistence().clearCache(liveFeed);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LiveFeed> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LiveFeed> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LiveFeed> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LiveFeed> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LiveFeed update(LiveFeed liveFeed) {
		return getPersistence().update(liveFeed);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LiveFeed update(LiveFeed liveFeed,
		ServiceContext serviceContext) {
		return getPersistence().update(liveFeed, serviceContext);
	}

	/**
	* Caches the live feed in the entity cache if it is enabled.
	*
	* @param liveFeed the live feed
	*/
	public static void cacheResult(LiveFeed liveFeed) {
		getPersistence().cacheResult(liveFeed);
	}

	/**
	* Caches the live feeds in the entity cache if it is enabled.
	*
	* @param liveFeeds the live feeds
	*/
	public static void cacheResult(List<LiveFeed> liveFeeds) {
		getPersistence().cacheResult(liveFeeds);
	}

	/**
	* Creates a new live feed with the primary key. Does not add the live feed to the database.
	*
	* @param id the primary key for the new live feed
	* @return the new live feed
	*/
	public static LiveFeed create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the live feed with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the live feed
	* @return the live feed that was removed
	* @throws NoSuchLiveFeedException if a live feed with the primary key could not be found
	*/
	public static LiveFeed remove(long id)
		throws com.chola.livefeed.exception.NoSuchLiveFeedException {
		return getPersistence().remove(id);
	}

	public static LiveFeed updateImpl(LiveFeed liveFeed) {
		return getPersistence().updateImpl(liveFeed);
	}

	/**
	* Returns the live feed with the primary key or throws a {@link NoSuchLiveFeedException} if it could not be found.
	*
	* @param id the primary key of the live feed
	* @return the live feed
	* @throws NoSuchLiveFeedException if a live feed with the primary key could not be found
	*/
	public static LiveFeed findByPrimaryKey(long id)
		throws com.chola.livefeed.exception.NoSuchLiveFeedException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the live feed with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the live feed
	* @return the live feed, or <code>null</code> if a live feed with the primary key could not be found
	*/
	public static LiveFeed fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, LiveFeed> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the live feeds.
	*
	* @return the live feeds
	*/
	public static List<LiveFeed> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<LiveFeed> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<LiveFeed> findAll(int start, int end,
		OrderByComparator<LiveFeed> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<LiveFeed> findAll(int start, int end,
		OrderByComparator<LiveFeed> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the live feeds from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of live feeds.
	*
	* @return the number of live feeds
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LiveFeedPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LiveFeedPersistence)PortletBeanLocatorUtil.locate(com.chola.livefeed.service.ClpSerializer.getServletContextName(),
					LiveFeedPersistence.class.getName());

			ReferenceRegistry.registerReference(LiveFeedUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static LiveFeedPersistence _persistence;
}