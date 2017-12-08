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

package com.chola.swagatam.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.model.swagatamdata;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the swagatamdata service. This utility wraps {@link com.chola.swagatam.service.persistence.impl.swagatamdataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see swagatamdataPersistence
 * @see com.chola.swagatam.service.persistence.impl.swagatamdataPersistenceImpl
 * @generated
 */
@ProviderType
public class swagatamdataUtil {
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
	public static void clearCache(swagatamdata swagatamdata) {
		getPersistence().clearCache(swagatamdata);
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
	public static List<swagatamdata> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<swagatamdata> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<swagatamdata> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<swagatamdata> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static swagatamdata update(swagatamdata swagatamdata) {
		return getPersistence().update(swagatamdata);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static swagatamdata update(swagatamdata swagatamdata,
		ServiceContext serviceContext) {
		return getPersistence().update(swagatamdata, serviceContext);
	}

	/**
	* Caches the swagatamdata in the entity cache if it is enabled.
	*
	* @param swagatamdata the swagatamdata
	*/
	public static void cacheResult(swagatamdata swagatamdata) {
		getPersistence().cacheResult(swagatamdata);
	}

	/**
	* Caches the swagatamdatas in the entity cache if it is enabled.
	*
	* @param swagatamdatas the swagatamdatas
	*/
	public static void cacheResult(List<swagatamdata> swagatamdatas) {
		getPersistence().cacheResult(swagatamdatas);
	}

	/**
	* Creates a new swagatamdata with the primary key. Does not add the swagatamdata to the database.
	*
	* @param id the primary key for the new swagatamdata
	* @return the new swagatamdata
	*/
	public static swagatamdata create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the swagatamdata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the swagatamdata
	* @return the swagatamdata that was removed
	* @throws NoSuchswagatamdataException if a swagatamdata with the primary key could not be found
	*/
	public static swagatamdata remove(long id)
		throws com.chola.swagatam.exception.NoSuchswagatamdataException {
		return getPersistence().remove(id);
	}

	public static swagatamdata updateImpl(swagatamdata swagatamdata) {
		return getPersistence().updateImpl(swagatamdata);
	}

	/**
	* Returns the swagatamdata with the primary key or throws a {@link NoSuchswagatamdataException} if it could not be found.
	*
	* @param id the primary key of the swagatamdata
	* @return the swagatamdata
	* @throws NoSuchswagatamdataException if a swagatamdata with the primary key could not be found
	*/
	public static swagatamdata findByPrimaryKey(long id)
		throws com.chola.swagatam.exception.NoSuchswagatamdataException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the swagatamdata with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the swagatamdata
	* @return the swagatamdata, or <code>null</code> if a swagatamdata with the primary key could not be found
	*/
	public static swagatamdata fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, swagatamdata> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the swagatamdatas.
	*
	* @return the swagatamdatas
	*/
	public static List<swagatamdata> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the swagatamdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatamdatas
	* @param end the upper bound of the range of swagatamdatas (not inclusive)
	* @return the range of swagatamdatas
	*/
	public static List<swagatamdata> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the swagatamdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatamdatas
	* @param end the upper bound of the range of swagatamdatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of swagatamdatas
	*/
	public static List<swagatamdata> findAll(int start, int end,
		OrderByComparator<swagatamdata> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the swagatamdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatamdatas
	* @param end the upper bound of the range of swagatamdatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of swagatamdatas
	*/
	public static List<swagatamdata> findAll(int start, int end,
		OrderByComparator<swagatamdata> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the swagatamdatas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of swagatamdatas.
	*
	* @return the number of swagatamdatas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static swagatamdataPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (swagatamdataPersistence)PortletBeanLocatorUtil.locate(com.chola.swagatam.service.ClpSerializer.getServletContextName(),
					swagatamdataPersistence.class.getName());

			ReferenceRegistry.registerReference(swagatamdataUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static swagatamdataPersistence _persistence;
}