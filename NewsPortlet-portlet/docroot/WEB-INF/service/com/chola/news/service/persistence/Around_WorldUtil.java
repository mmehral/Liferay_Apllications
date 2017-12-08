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

package com.chola.news.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.news.model.Around_World;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the around_ world service. This utility wraps {@link com.chola.news.service.persistence.impl.Around_WorldPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see Around_WorldPersistence
 * @see com.chola.news.service.persistence.impl.Around_WorldPersistenceImpl
 * @generated
 */
@ProviderType
public class Around_WorldUtil {
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
	public static void clearCache(Around_World around_World) {
		getPersistence().clearCache(around_World);
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
	public static List<Around_World> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Around_World> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Around_World> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Around_World> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Around_World update(Around_World around_World) {
		return getPersistence().update(around_World);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Around_World update(Around_World around_World,
		ServiceContext serviceContext) {
		return getPersistence().update(around_World, serviceContext);
	}

	/**
	* Caches the around_ world in the entity cache if it is enabled.
	*
	* @param around_World the around_ world
	*/
	public static void cacheResult(Around_World around_World) {
		getPersistence().cacheResult(around_World);
	}

	/**
	* Caches the around_ worlds in the entity cache if it is enabled.
	*
	* @param around_Worlds the around_ worlds
	*/
	public static void cacheResult(List<Around_World> around_Worlds) {
		getPersistence().cacheResult(around_Worlds);
	}

	/**
	* Creates a new around_ world with the primary key. Does not add the around_ world to the database.
	*
	* @param id the primary key for the new around_ world
	* @return the new around_ world
	*/
	public static Around_World create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the around_ world with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the around_ world
	* @return the around_ world that was removed
	* @throws NoSuchAround_WorldException if a around_ world with the primary key could not be found
	*/
	public static Around_World remove(long id)
		throws com.chola.news.exception.NoSuchAround_WorldException {
		return getPersistence().remove(id);
	}

	public static Around_World updateImpl(Around_World around_World) {
		return getPersistence().updateImpl(around_World);
	}

	/**
	* Returns the around_ world with the primary key or throws a {@link NoSuchAround_WorldException} if it could not be found.
	*
	* @param id the primary key of the around_ world
	* @return the around_ world
	* @throws NoSuchAround_WorldException if a around_ world with the primary key could not be found
	*/
	public static Around_World findByPrimaryKey(long id)
		throws com.chola.news.exception.NoSuchAround_WorldException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the around_ world with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the around_ world
	* @return the around_ world, or <code>null</code> if a around_ world with the primary key could not be found
	*/
	public static Around_World fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, Around_World> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the around_ worlds.
	*
	* @return the around_ worlds
	*/
	public static List<Around_World> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the around_ worlds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of around_ worlds
	* @param end the upper bound of the range of around_ worlds (not inclusive)
	* @return the range of around_ worlds
	*/
	public static List<Around_World> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the around_ worlds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of around_ worlds
	* @param end the upper bound of the range of around_ worlds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of around_ worlds
	*/
	public static List<Around_World> findAll(int start, int end,
		OrderByComparator<Around_World> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the around_ worlds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of around_ worlds
	* @param end the upper bound of the range of around_ worlds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of around_ worlds
	*/
	public static List<Around_World> findAll(int start, int end,
		OrderByComparator<Around_World> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the around_ worlds from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of around_ worlds.
	*
	* @return the number of around_ worlds
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static Around_WorldPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (Around_WorldPersistence)PortletBeanLocatorUtil.locate(com.chola.news.service.ClpSerializer.getServletContextName(),
					Around_WorldPersistence.class.getName());

			ReferenceRegistry.registerReference(Around_WorldUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static Around_WorldPersistence _persistence;
}