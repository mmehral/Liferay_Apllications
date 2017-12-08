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

import com.chola.industrynews.model.LatestIndustryNews;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the latest industry news service. This utility wraps {@link com.chola.industrynews.service.persistence.impl.LatestIndustryNewsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see LatestIndustryNewsPersistence
 * @see com.chola.industrynews.service.persistence.impl.LatestIndustryNewsPersistenceImpl
 * @generated
 */
@ProviderType
public class LatestIndustryNewsUtil {
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
	public static void clearCache(LatestIndustryNews latestIndustryNews) {
		getPersistence().clearCache(latestIndustryNews);
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
	public static List<LatestIndustryNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LatestIndustryNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LatestIndustryNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LatestIndustryNews> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LatestIndustryNews update(
		LatestIndustryNews latestIndustryNews) {
		return getPersistence().update(latestIndustryNews);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LatestIndustryNews update(
		LatestIndustryNews latestIndustryNews, ServiceContext serviceContext) {
		return getPersistence().update(latestIndustryNews, serviceContext);
	}

	/**
	* Caches the latest industry news in the entity cache if it is enabled.
	*
	* @param latestIndustryNews the latest industry news
	*/
	public static void cacheResult(LatestIndustryNews latestIndustryNews) {
		getPersistence().cacheResult(latestIndustryNews);
	}

	/**
	* Caches the latest industry newses in the entity cache if it is enabled.
	*
	* @param latestIndustryNewses the latest industry newses
	*/
	public static void cacheResult(
		List<LatestIndustryNews> latestIndustryNewses) {
		getPersistence().cacheResult(latestIndustryNewses);
	}

	/**
	* Creates a new latest industry news with the primary key. Does not add the latest industry news to the database.
	*
	* @param id the primary key for the new latest industry news
	* @return the new latest industry news
	*/
	public static LatestIndustryNews create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the latest industry news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the latest industry news
	* @return the latest industry news that was removed
	* @throws NoSuchLatestIndustryNewsException if a latest industry news with the primary key could not be found
	*/
	public static LatestIndustryNews remove(long id)
		throws com.chola.industrynews.exception.NoSuchLatestIndustryNewsException {
		return getPersistence().remove(id);
	}

	public static LatestIndustryNews updateImpl(
		LatestIndustryNews latestIndustryNews) {
		return getPersistence().updateImpl(latestIndustryNews);
	}

	/**
	* Returns the latest industry news with the primary key or throws a {@link NoSuchLatestIndustryNewsException} if it could not be found.
	*
	* @param id the primary key of the latest industry news
	* @return the latest industry news
	* @throws NoSuchLatestIndustryNewsException if a latest industry news with the primary key could not be found
	*/
	public static LatestIndustryNews findByPrimaryKey(long id)
		throws com.chola.industrynews.exception.NoSuchLatestIndustryNewsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the latest industry news with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the latest industry news
	* @return the latest industry news, or <code>null</code> if a latest industry news with the primary key could not be found
	*/
	public static LatestIndustryNews fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, LatestIndustryNews> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the latest industry newses.
	*
	* @return the latest industry newses
	*/
	public static List<LatestIndustryNews> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<LatestIndustryNews> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<LatestIndustryNews> findAll(int start, int end,
		OrderByComparator<LatestIndustryNews> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<LatestIndustryNews> findAll(int start, int end,
		OrderByComparator<LatestIndustryNews> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the latest industry newses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of latest industry newses.
	*
	* @return the number of latest industry newses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LatestIndustryNewsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LatestIndustryNewsPersistence)PortletBeanLocatorUtil.locate(com.chola.industrynews.service.ClpSerializer.getServletContextName(),
					LatestIndustryNewsPersistence.class.getName());

			ReferenceRegistry.registerReference(LatestIndustryNewsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static LatestIndustryNewsPersistence _persistence;
}