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

package com.popular.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.popular.model.popularlinks;

import java.util.List;

/**
 * The persistence utility for the popularlinks service. This utility wraps {@link com.popular.service.persistence.impl.popularlinksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see popularlinksPersistence
 * @see com.popular.service.persistence.impl.popularlinksPersistenceImpl
 * @generated
 */
@ProviderType
public class popularlinksUtil {
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
	public static void clearCache(popularlinks popularlinks) {
		getPersistence().clearCache(popularlinks);
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
	public static List<popularlinks> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<popularlinks> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<popularlinks> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<popularlinks> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static popularlinks update(popularlinks popularlinks) {
		return getPersistence().update(popularlinks);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static popularlinks update(popularlinks popularlinks,
		ServiceContext serviceContext) {
		return getPersistence().update(popularlinks, serviceContext);
	}

	/**
	* Caches the popularlinks in the entity cache if it is enabled.
	*
	* @param popularlinks the popularlinks
	*/
	public static void cacheResult(popularlinks popularlinks) {
		getPersistence().cacheResult(popularlinks);
	}

	/**
	* Caches the popularlinkses in the entity cache if it is enabled.
	*
	* @param popularlinkses the popularlinkses
	*/
	public static void cacheResult(List<popularlinks> popularlinkses) {
		getPersistence().cacheResult(popularlinkses);
	}

	/**
	* Creates a new popularlinks with the primary key. Does not add the popularlinks to the database.
	*
	* @param id the primary key for the new popularlinks
	* @return the new popularlinks
	*/
	public static popularlinks create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the popularlinks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks that was removed
	* @throws NoSuchpopularlinksException if a popularlinks with the primary key could not be found
	*/
	public static popularlinks remove(long id)
		throws com.popular.exception.NoSuchpopularlinksException {
		return getPersistence().remove(id);
	}

	public static popularlinks updateImpl(popularlinks popularlinks) {
		return getPersistence().updateImpl(popularlinks);
	}

	/**
	* Returns the popularlinks with the primary key or throws a {@link NoSuchpopularlinksException} if it could not be found.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks
	* @throws NoSuchpopularlinksException if a popularlinks with the primary key could not be found
	*/
	public static popularlinks findByPrimaryKey(long id)
		throws com.popular.exception.NoSuchpopularlinksException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the popularlinks with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks, or <code>null</code> if a popularlinks with the primary key could not be found
	*/
	public static popularlinks fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, popularlinks> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the popularlinkses.
	*
	* @return the popularlinkses
	*/
	public static List<popularlinks> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<popularlinks> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<popularlinks> findAll(int start, int end,
		OrderByComparator<popularlinks> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<popularlinks> findAll(int start, int end,
		OrderByComparator<popularlinks> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the popularlinkses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of popularlinkses.
	*
	* @return the number of popularlinkses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static popularlinksPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (popularlinksPersistence)PortletBeanLocatorUtil.locate(com.popular.service.ClpSerializer.getServletContextName(),
					popularlinksPersistence.class.getName());

			ReferenceRegistry.registerReference(popularlinksUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static popularlinksPersistence _persistence;
}