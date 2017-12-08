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

package com.chola.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.model.businessSOPppusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the business s o pppusers service. This utility wraps {@link com.chola.business.service.persistence.impl.businessSOPppusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see businessSOPppusersPersistence
 * @see com.chola.business.service.persistence.impl.businessSOPppusersPersistenceImpl
 * @generated
 */
@ProviderType
public class businessSOPppusersUtil {
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
	public static void clearCache(businessSOPppusers businessSOPppusers) {
		getPersistence().clearCache(businessSOPppusers);
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
	public static List<businessSOPppusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<businessSOPppusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<businessSOPppusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<businessSOPppusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static businessSOPppusers update(
		businessSOPppusers businessSOPppusers) {
		return getPersistence().update(businessSOPppusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static businessSOPppusers update(
		businessSOPppusers businessSOPppusers, ServiceContext serviceContext) {
		return getPersistence().update(businessSOPppusers, serviceContext);
	}

	/**
	* Caches the business s o pppusers in the entity cache if it is enabled.
	*
	* @param businessSOPppusers the business s o pppusers
	*/
	public static void cacheResult(businessSOPppusers businessSOPppusers) {
		getPersistence().cacheResult(businessSOPppusers);
	}

	/**
	* Caches the business s o pppuserses in the entity cache if it is enabled.
	*
	* @param businessSOPppuserses the business s o pppuserses
	*/
	public static void cacheResult(
		List<businessSOPppusers> businessSOPppuserses) {
		getPersistence().cacheResult(businessSOPppuserses);
	}

	/**
	* Creates a new business s o pppusers with the primary key. Does not add the business s o pppusers to the database.
	*
	* @param id the primary key for the new business s o pppusers
	* @return the new business s o pppusers
	*/
	public static businessSOPppusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the business s o pppusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the business s o pppusers
	* @return the business s o pppusers that was removed
	* @throws NoSuchbusinessSOPppusersException if a business s o pppusers with the primary key could not be found
	*/
	public static businessSOPppusers remove(long id)
		throws com.chola.business.exception.NoSuchbusinessSOPppusersException {
		return getPersistence().remove(id);
	}

	public static businessSOPppusers updateImpl(
		businessSOPppusers businessSOPppusers) {
		return getPersistence().updateImpl(businessSOPppusers);
	}

	/**
	* Returns the business s o pppusers with the primary key or throws a {@link NoSuchbusinessSOPppusersException} if it could not be found.
	*
	* @param id the primary key of the business s o pppusers
	* @return the business s o pppusers
	* @throws NoSuchbusinessSOPppusersException if a business s o pppusers with the primary key could not be found
	*/
	public static businessSOPppusers findByPrimaryKey(long id)
		throws com.chola.business.exception.NoSuchbusinessSOPppusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the business s o pppusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the business s o pppusers
	* @return the business s o pppusers, or <code>null</code> if a business s o pppusers with the primary key could not be found
	*/
	public static businessSOPppusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, businessSOPppusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the business s o pppuserses.
	*
	* @return the business s o pppuserses
	*/
	public static List<businessSOPppusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the business s o pppuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessSOPppusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business s o pppuserses
	* @param end the upper bound of the range of business s o pppuserses (not inclusive)
	* @return the range of business s o pppuserses
	*/
	public static List<businessSOPppusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the business s o pppuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessSOPppusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business s o pppuserses
	* @param end the upper bound of the range of business s o pppuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of business s o pppuserses
	*/
	public static List<businessSOPppusers> findAll(int start, int end,
		OrderByComparator<businessSOPppusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the business s o pppuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessSOPppusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of business s o pppuserses
	* @param end the upper bound of the range of business s o pppuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of business s o pppuserses
	*/
	public static List<businessSOPppusers> findAll(int start, int end,
		OrderByComparator<businessSOPppusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the business s o pppuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of business s o pppuserses.
	*
	* @return the number of business s o pppuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static businessSOPppusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (businessSOPppusersPersistence)PortletBeanLocatorUtil.locate(com.chola.business.service.ClpSerializer.getServletContextName(),
					businessSOPppusersPersistence.class.getName());

			ReferenceRegistry.registerReference(businessSOPppusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static businessSOPppusersPersistence _persistence;
}