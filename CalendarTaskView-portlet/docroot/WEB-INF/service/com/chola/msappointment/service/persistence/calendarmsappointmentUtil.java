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

package com.chola.msappointment.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.msappointment.model.calendarmsappointment;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the calendarmsappointment service. This utility wraps {@link com.chola.msappointment.service.persistence.impl.calendarmsappointmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see calendarmsappointmentPersistence
 * @see com.chola.msappointment.service.persistence.impl.calendarmsappointmentPersistenceImpl
 * @generated
 */
@ProviderType
public class calendarmsappointmentUtil {
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
	public static void clearCache(calendarmsappointment calendarmsappointment) {
		getPersistence().clearCache(calendarmsappointment);
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
	public static List<calendarmsappointment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<calendarmsappointment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<calendarmsappointment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<calendarmsappointment> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static calendarmsappointment update(
		calendarmsappointment calendarmsappointment) {
		return getPersistence().update(calendarmsappointment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static calendarmsappointment update(
		calendarmsappointment calendarmsappointment,
		ServiceContext serviceContext) {
		return getPersistence().update(calendarmsappointment, serviceContext);
	}

	/**
	* Caches the calendarmsappointment in the entity cache if it is enabled.
	*
	* @param calendarmsappointment the calendarmsappointment
	*/
	public static void cacheResult(calendarmsappointment calendarmsappointment) {
		getPersistence().cacheResult(calendarmsappointment);
	}

	/**
	* Caches the calendarmsappointments in the entity cache if it is enabled.
	*
	* @param calendarmsappointments the calendarmsappointments
	*/
	public static void cacheResult(
		List<calendarmsappointment> calendarmsappointments) {
		getPersistence().cacheResult(calendarmsappointments);
	}

	/**
	* Creates a new calendarmsappointment with the primary key. Does not add the calendarmsappointment to the database.
	*
	* @param id the primary key for the new calendarmsappointment
	* @return the new calendarmsappointment
	*/
	public static calendarmsappointment create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the calendarmsappointment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment that was removed
	* @throws NoSuchcalendarmsappointmentException if a calendarmsappointment with the primary key could not be found
	*/
	public static calendarmsappointment remove(long id)
		throws com.chola.msappointment.exception.NoSuchcalendarmsappointmentException {
		return getPersistence().remove(id);
	}

	public static calendarmsappointment updateImpl(
		calendarmsappointment calendarmsappointment) {
		return getPersistence().updateImpl(calendarmsappointment);
	}

	/**
	* Returns the calendarmsappointment with the primary key or throws a {@link NoSuchcalendarmsappointmentException} if it could not be found.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment
	* @throws NoSuchcalendarmsappointmentException if a calendarmsappointment with the primary key could not be found
	*/
	public static calendarmsappointment findByPrimaryKey(long id)
		throws com.chola.msappointment.exception.NoSuchcalendarmsappointmentException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the calendarmsappointment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment, or <code>null</code> if a calendarmsappointment with the primary key could not be found
	*/
	public static calendarmsappointment fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, calendarmsappointment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the calendarmsappointments.
	*
	* @return the calendarmsappointments
	*/
	public static List<calendarmsappointment> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the calendarmsappointments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendarmsappointments
	* @param end the upper bound of the range of calendarmsappointments (not inclusive)
	* @return the range of calendarmsappointments
	*/
	public static List<calendarmsappointment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the calendarmsappointments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendarmsappointments
	* @param end the upper bound of the range of calendarmsappointments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of calendarmsappointments
	*/
	public static List<calendarmsappointment> findAll(int start, int end,
		OrderByComparator<calendarmsappointment> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the calendarmsappointments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendarmsappointments
	* @param end the upper bound of the range of calendarmsappointments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of calendarmsappointments
	*/
	public static List<calendarmsappointment> findAll(int start, int end,
		OrderByComparator<calendarmsappointment> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the calendarmsappointments from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of calendarmsappointments.
	*
	* @return the number of calendarmsappointments
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static calendarmsappointmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (calendarmsappointmentPersistence)PortletBeanLocatorUtil.locate(com.chola.msappointment.service.ClpSerializer.getServletContextName(),
					calendarmsappointmentPersistence.class.getName());

			ReferenceRegistry.registerReference(calendarmsappointmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static calendarmsappointmentPersistence _persistence;
}