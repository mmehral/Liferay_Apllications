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

package com.chola.topsearch.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.topsearch.model.TopSearch;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the top search service. This utility wraps {@link com.chola.topsearch.service.persistence.impl.TopSearchPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see TopSearchPersistence
 * @see com.chola.topsearch.service.persistence.impl.TopSearchPersistenceImpl
 * @generated
 */
@ProviderType
public class TopSearchUtil {
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
	public static void clearCache(TopSearch topSearch) {
		getPersistence().clearCache(topSearch);
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
	public static List<TopSearch> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TopSearch> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TopSearch> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TopSearch> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TopSearch update(TopSearch topSearch) {
		return getPersistence().update(topSearch);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TopSearch update(TopSearch topSearch,
		ServiceContext serviceContext) {
		return getPersistence().update(topSearch, serviceContext);
	}

	/**
	* Caches the top search in the entity cache if it is enabled.
	*
	* @param topSearch the top search
	*/
	public static void cacheResult(TopSearch topSearch) {
		getPersistence().cacheResult(topSearch);
	}

	/**
	* Caches the top searchs in the entity cache if it is enabled.
	*
	* @param topSearchs the top searchs
	*/
	public static void cacheResult(List<TopSearch> topSearchs) {
		getPersistence().cacheResult(topSearchs);
	}

	/**
	* Creates a new top search with the primary key. Does not add the top search to the database.
	*
	* @param srchId the primary key for the new top search
	* @return the new top search
	*/
	public static TopSearch create(long srchId) {
		return getPersistence().create(srchId);
	}

	/**
	* Removes the top search with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srchId the primary key of the top search
	* @return the top search that was removed
	* @throws NoSuchTopSearchException if a top search with the primary key could not be found
	*/
	public static TopSearch remove(long srchId)
		throws com.chola.topsearch.exception.NoSuchTopSearchException {
		return getPersistence().remove(srchId);
	}

	public static TopSearch updateImpl(TopSearch topSearch) {
		return getPersistence().updateImpl(topSearch);
	}

	/**
	* Returns the top search with the primary key or throws a {@link NoSuchTopSearchException} if it could not be found.
	*
	* @param srchId the primary key of the top search
	* @return the top search
	* @throws NoSuchTopSearchException if a top search with the primary key could not be found
	*/
	public static TopSearch findByPrimaryKey(long srchId)
		throws com.chola.topsearch.exception.NoSuchTopSearchException {
		return getPersistence().findByPrimaryKey(srchId);
	}

	/**
	* Returns the top search with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srchId the primary key of the top search
	* @return the top search, or <code>null</code> if a top search with the primary key could not be found
	*/
	public static TopSearch fetchByPrimaryKey(long srchId) {
		return getPersistence().fetchByPrimaryKey(srchId);
	}

	public static java.util.Map<java.io.Serializable, TopSearch> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the top searchs.
	*
	* @return the top searchs
	*/
	public static List<TopSearch> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the top searchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TopSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of top searchs
	* @param end the upper bound of the range of top searchs (not inclusive)
	* @return the range of top searchs
	*/
	public static List<TopSearch> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the top searchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TopSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of top searchs
	* @param end the upper bound of the range of top searchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of top searchs
	*/
	public static List<TopSearch> findAll(int start, int end,
		OrderByComparator<TopSearch> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the top searchs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TopSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of top searchs
	* @param end the upper bound of the range of top searchs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of top searchs
	*/
	public static List<TopSearch> findAll(int start, int end,
		OrderByComparator<TopSearch> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the top searchs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of top searchs.
	*
	* @return the number of top searchs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TopSearchPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TopSearchPersistence)PortletBeanLocatorUtil.locate(com.chola.topsearch.service.ClpSerializer.getServletContextName(),
					TopSearchPersistence.class.getName());

			ReferenceRegistry.registerReference(TopSearchUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static TopSearchPersistence _persistence;
}