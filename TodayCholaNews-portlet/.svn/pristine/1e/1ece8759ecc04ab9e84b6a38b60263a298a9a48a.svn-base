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

import com.chola.TodaycholaNews.model.TodayCholaNews;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the today chola news service. This utility wraps {@link com.chola.TodaycholaNews.service.persistence.impl.TodayCholaNewsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see TodayCholaNewsPersistence
 * @see com.chola.TodaycholaNews.service.persistence.impl.TodayCholaNewsPersistenceImpl
 * @generated
 */
@ProviderType
public class TodayCholaNewsUtil {
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
	public static void clearCache(TodayCholaNews todayCholaNews) {
		getPersistence().clearCache(todayCholaNews);
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
	public static List<TodayCholaNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TodayCholaNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TodayCholaNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TodayCholaNews> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TodayCholaNews update(TodayCholaNews todayCholaNews) {
		return getPersistence().update(todayCholaNews);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TodayCholaNews update(TodayCholaNews todayCholaNews,
		ServiceContext serviceContext) {
		return getPersistence().update(todayCholaNews, serviceContext);
	}

	/**
	* Caches the today chola news in the entity cache if it is enabled.
	*
	* @param todayCholaNews the today chola news
	*/
	public static void cacheResult(TodayCholaNews todayCholaNews) {
		getPersistence().cacheResult(todayCholaNews);
	}

	/**
	* Caches the today chola newses in the entity cache if it is enabled.
	*
	* @param todayCholaNewses the today chola newses
	*/
	public static void cacheResult(List<TodayCholaNews> todayCholaNewses) {
		getPersistence().cacheResult(todayCholaNewses);
	}

	/**
	* Creates a new today chola news with the primary key. Does not add the today chola news to the database.
	*
	* @param id the primary key for the new today chola news
	* @return the new today chola news
	*/
	public static TodayCholaNews create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the today chola news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the today chola news
	* @return the today chola news that was removed
	* @throws NoSuchTodayCholaNewsException if a today chola news with the primary key could not be found
	*/
	public static TodayCholaNews remove(long id)
		throws com.chola.TodaycholaNews.exception.NoSuchTodayCholaNewsException {
		return getPersistence().remove(id);
	}

	public static TodayCholaNews updateImpl(TodayCholaNews todayCholaNews) {
		return getPersistence().updateImpl(todayCholaNews);
	}

	/**
	* Returns the today chola news with the primary key or throws a {@link NoSuchTodayCholaNewsException} if it could not be found.
	*
	* @param id the primary key of the today chola news
	* @return the today chola news
	* @throws NoSuchTodayCholaNewsException if a today chola news with the primary key could not be found
	*/
	public static TodayCholaNews findByPrimaryKey(long id)
		throws com.chola.TodaycholaNews.exception.NoSuchTodayCholaNewsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the today chola news with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the today chola news
	* @return the today chola news, or <code>null</code> if a today chola news with the primary key could not be found
	*/
	public static TodayCholaNews fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, TodayCholaNews> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the today chola newses.
	*
	* @return the today chola newses
	*/
	public static List<TodayCholaNews> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<TodayCholaNews> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<TodayCholaNews> findAll(int start, int end,
		OrderByComparator<TodayCholaNews> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<TodayCholaNews> findAll(int start, int end,
		OrderByComparator<TodayCholaNews> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the today chola newses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of today chola newses.
	*
	* @return the number of today chola newses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TodayCholaNewsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TodayCholaNewsPersistence)PortletBeanLocatorUtil.locate(com.chola.TodaycholaNews.service.ClpSerializer.getServletContextName(),
					TodayCholaNewsPersistence.class.getName());

			ReferenceRegistry.registerReference(TodayCholaNewsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static TodayCholaNewsPersistence _persistence;
}