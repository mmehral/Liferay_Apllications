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

package com.chola.trainingcalendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.model.trainingcalendar;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the trainingcalendar service. This utility wraps {@link com.chola.trainingcalendar.service.persistence.impl.trainingcalendarPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcalendarPersistence
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingcalendarPersistenceImpl
 * @generated
 */
@ProviderType
public class trainingcalendarUtil {
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
	public static void clearCache(trainingcalendar trainingcalendar) {
		getPersistence().clearCache(trainingcalendar);
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
	public static List<trainingcalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<trainingcalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<trainingcalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<trainingcalendar> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static trainingcalendar update(trainingcalendar trainingcalendar) {
		return getPersistence().update(trainingcalendar);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static trainingcalendar update(trainingcalendar trainingcalendar,
		ServiceContext serviceContext) {
		return getPersistence().update(trainingcalendar, serviceContext);
	}

	/**
	* Caches the trainingcalendar in the entity cache if it is enabled.
	*
	* @param trainingcalendar the trainingcalendar
	*/
	public static void cacheResult(trainingcalendar trainingcalendar) {
		getPersistence().cacheResult(trainingcalendar);
	}

	/**
	* Caches the trainingcalendars in the entity cache if it is enabled.
	*
	* @param trainingcalendars the trainingcalendars
	*/
	public static void cacheResult(List<trainingcalendar> trainingcalendars) {
		getPersistence().cacheResult(trainingcalendars);
	}

	/**
	* Creates a new trainingcalendar with the primary key. Does not add the trainingcalendar to the database.
	*
	* @param trainingid the primary key for the new trainingcalendar
	* @return the new trainingcalendar
	*/
	public static trainingcalendar create(long trainingid) {
		return getPersistence().create(trainingid);
	}

	/**
	* Removes the trainingcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar that was removed
	* @throws NoSuchtrainingcalendarException if a trainingcalendar with the primary key could not be found
	*/
	public static trainingcalendar remove(long trainingid)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcalendarException {
		return getPersistence().remove(trainingid);
	}

	public static trainingcalendar updateImpl(trainingcalendar trainingcalendar) {
		return getPersistence().updateImpl(trainingcalendar);
	}

	/**
	* Returns the trainingcalendar with the primary key or throws a {@link NoSuchtrainingcalendarException} if it could not be found.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar
	* @throws NoSuchtrainingcalendarException if a trainingcalendar with the primary key could not be found
	*/
	public static trainingcalendar findByPrimaryKey(long trainingid)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcalendarException {
		return getPersistence().findByPrimaryKey(trainingid);
	}

	/**
	* Returns the trainingcalendar with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar, or <code>null</code> if a trainingcalendar with the primary key could not be found
	*/
	public static trainingcalendar fetchByPrimaryKey(long trainingid) {
		return getPersistence().fetchByPrimaryKey(trainingid);
	}

	public static java.util.Map<java.io.Serializable, trainingcalendar> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the trainingcalendars.
	*
	* @return the trainingcalendars
	*/
	public static List<trainingcalendar> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the trainingcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendars
	* @param end the upper bound of the range of trainingcalendars (not inclusive)
	* @return the range of trainingcalendars
	*/
	public static List<trainingcalendar> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the trainingcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendars
	* @param end the upper bound of the range of trainingcalendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingcalendars
	*/
	public static List<trainingcalendar> findAll(int start, int end,
		OrderByComparator<trainingcalendar> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the trainingcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendars
	* @param end the upper bound of the range of trainingcalendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingcalendars
	*/
	public static List<trainingcalendar> findAll(int start, int end,
		OrderByComparator<trainingcalendar> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the trainingcalendars from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of trainingcalendars.
	*
	* @return the number of trainingcalendars
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static trainingcalendarPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (trainingcalendarPersistence)PortletBeanLocatorUtil.locate(com.chola.trainingcalendar.service.ClpSerializer.getServletContextName(),
					trainingcalendarPersistence.class.getName());

			ReferenceRegistry.registerReference(trainingcalendarUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static trainingcalendarPersistence _persistence;
}