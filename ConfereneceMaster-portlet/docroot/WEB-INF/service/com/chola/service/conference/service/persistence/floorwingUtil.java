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

package com.chola.service.conference.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.service.conference.model.floorwing;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the floorwing service. This utility wraps {@link com.chola.service.conference.service.persistence.impl.floorwingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see floorwingPersistence
 * @see com.chola.service.conference.service.persistence.impl.floorwingPersistenceImpl
 * @generated
 */
@ProviderType
public class floorwingUtil {
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
	public static void clearCache(floorwing floorwing) {
		getPersistence().clearCache(floorwing);
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
	public static List<floorwing> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<floorwing> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<floorwing> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<floorwing> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static floorwing update(floorwing floorwing) {
		return getPersistence().update(floorwing);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static floorwing update(floorwing floorwing,
		ServiceContext serviceContext) {
		return getPersistence().update(floorwing, serviceContext);
	}

	/**
	* Caches the floorwing in the entity cache if it is enabled.
	*
	* @param floorwing the floorwing
	*/
	public static void cacheResult(floorwing floorwing) {
		getPersistence().cacheResult(floorwing);
	}

	/**
	* Caches the floorwings in the entity cache if it is enabled.
	*
	* @param floorwings the floorwings
	*/
	public static void cacheResult(List<floorwing> floorwings) {
		getPersistence().cacheResult(floorwings);
	}

	/**
	* Creates a new floorwing with the primary key. Does not add the floorwing to the database.
	*
	* @param floorwing_id the primary key for the new floorwing
	* @return the new floorwing
	*/
	public static floorwing create(long floorwing_id) {
		return getPersistence().create(floorwing_id);
	}

	/**
	* Removes the floorwing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param floorwing_id the primary key of the floorwing
	* @return the floorwing that was removed
	* @throws NoSuchfloorwingException if a floorwing with the primary key could not be found
	*/
	public static floorwing remove(long floorwing_id)
		throws com.chola.service.conference.exception.NoSuchfloorwingException {
		return getPersistence().remove(floorwing_id);
	}

	public static floorwing updateImpl(floorwing floorwing) {
		return getPersistence().updateImpl(floorwing);
	}

	/**
	* Returns the floorwing with the primary key or throws a {@link NoSuchfloorwingException} if it could not be found.
	*
	* @param floorwing_id the primary key of the floorwing
	* @return the floorwing
	* @throws NoSuchfloorwingException if a floorwing with the primary key could not be found
	*/
	public static floorwing findByPrimaryKey(long floorwing_id)
		throws com.chola.service.conference.exception.NoSuchfloorwingException {
		return getPersistence().findByPrimaryKey(floorwing_id);
	}

	/**
	* Returns the floorwing with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param floorwing_id the primary key of the floorwing
	* @return the floorwing, or <code>null</code> if a floorwing with the primary key could not be found
	*/
	public static floorwing fetchByPrimaryKey(long floorwing_id) {
		return getPersistence().fetchByPrimaryKey(floorwing_id);
	}

	public static java.util.Map<java.io.Serializable, floorwing> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the floorwings.
	*
	* @return the floorwings
	*/
	public static List<floorwing> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the floorwings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floorwings
	* @param end the upper bound of the range of floorwings (not inclusive)
	* @return the range of floorwings
	*/
	public static List<floorwing> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the floorwings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floorwings
	* @param end the upper bound of the range of floorwings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of floorwings
	*/
	public static List<floorwing> findAll(int start, int end,
		OrderByComparator<floorwing> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the floorwings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floorwings
	* @param end the upper bound of the range of floorwings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of floorwings
	*/
	public static List<floorwing> findAll(int start, int end,
		OrderByComparator<floorwing> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the floorwings from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of floorwings.
	*
	* @return the number of floorwings
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static floorwingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (floorwingPersistence)PortletBeanLocatorUtil.locate(com.chola.service.conference.service.ClpSerializer.getServletContextName(),
					floorwingPersistence.class.getName());

			ReferenceRegistry.registerReference(floorwingUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static floorwingPersistence _persistence;
}