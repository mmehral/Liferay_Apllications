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

package com.chola.calendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.model.eventcalendar;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the eventcalendar service. This utility wraps {@link com.chola.calendar.service.persistence.impl.eventcalendarPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see eventcalendarPersistence
 * @see com.chola.calendar.service.persistence.impl.eventcalendarPersistenceImpl
 * @generated
 */
@ProviderType
public class eventcalendarUtil {
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
	public static void clearCache(eventcalendar eventcalendar) {
		getPersistence().clearCache(eventcalendar);
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
	public static List<eventcalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<eventcalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<eventcalendar> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<eventcalendar> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static eventcalendar update(eventcalendar eventcalendar) {
		return getPersistence().update(eventcalendar);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static eventcalendar update(eventcalendar eventcalendar,
		ServiceContext serviceContext) {
		return getPersistence().update(eventcalendar, serviceContext);
	}

	/**
	* Returns all the eventcalendars where name = &#63;.
	*
	* @param name the name
	* @return the matching eventcalendars
	*/
	public static List<eventcalendar> findByEVENT_NAME(java.lang.String name) {
		return getPersistence().findByEVENT_NAME(name);
	}

	/**
	* Returns a range of all the eventcalendars where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of eventcalendars
	* @param end the upper bound of the range of eventcalendars (not inclusive)
	* @return the range of matching eventcalendars
	*/
	public static List<eventcalendar> findByEVENT_NAME(java.lang.String name,
		int start, int end) {
		return getPersistence().findByEVENT_NAME(name, start, end);
	}

	/**
	* Returns an ordered range of all the eventcalendars where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of eventcalendars
	* @param end the upper bound of the range of eventcalendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching eventcalendars
	*/
	public static List<eventcalendar> findByEVENT_NAME(java.lang.String name,
		int start, int end, OrderByComparator<eventcalendar> orderByComparator) {
		return getPersistence()
				   .findByEVENT_NAME(name, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the eventcalendars where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of eventcalendars
	* @param end the upper bound of the range of eventcalendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching eventcalendars
	*/
	public static List<eventcalendar> findByEVENT_NAME(java.lang.String name,
		int start, int end, OrderByComparator<eventcalendar> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEVENT_NAME(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first eventcalendar in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eventcalendar
	* @throws NoSucheventcalendarException if a matching eventcalendar could not be found
	*/
	public static eventcalendar findByEVENT_NAME_First(java.lang.String name,
		OrderByComparator<eventcalendar> orderByComparator)
		throws com.chola.calendar.exception.NoSucheventcalendarException {
		return getPersistence().findByEVENT_NAME_First(name, orderByComparator);
	}

	/**
	* Returns the first eventcalendar in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eventcalendar, or <code>null</code> if a matching eventcalendar could not be found
	*/
	public static eventcalendar fetchByEVENT_NAME_First(java.lang.String name,
		OrderByComparator<eventcalendar> orderByComparator) {
		return getPersistence().fetchByEVENT_NAME_First(name, orderByComparator);
	}

	/**
	* Returns the last eventcalendar in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eventcalendar
	* @throws NoSucheventcalendarException if a matching eventcalendar could not be found
	*/
	public static eventcalendar findByEVENT_NAME_Last(java.lang.String name,
		OrderByComparator<eventcalendar> orderByComparator)
		throws com.chola.calendar.exception.NoSucheventcalendarException {
		return getPersistence().findByEVENT_NAME_Last(name, orderByComparator);
	}

	/**
	* Returns the last eventcalendar in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eventcalendar, or <code>null</code> if a matching eventcalendar could not be found
	*/
	public static eventcalendar fetchByEVENT_NAME_Last(java.lang.String name,
		OrderByComparator<eventcalendar> orderByComparator) {
		return getPersistence().fetchByEVENT_NAME_Last(name, orderByComparator);
	}

	/**
	* Returns the eventcalendars before and after the current eventcalendar in the ordered set where name = &#63;.
	*
	* @param id the primary key of the current eventcalendar
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next eventcalendar
	* @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	*/
	public static eventcalendar[] findByEVENT_NAME_PrevAndNext(long id,
		java.lang.String name,
		OrderByComparator<eventcalendar> orderByComparator)
		throws com.chola.calendar.exception.NoSucheventcalendarException {
		return getPersistence()
				   .findByEVENT_NAME_PrevAndNext(id, name, orderByComparator);
	}

	/**
	* Removes all the eventcalendars where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByEVENT_NAME(java.lang.String name) {
		getPersistence().removeByEVENT_NAME(name);
	}

	/**
	* Returns the number of eventcalendars where name = &#63;.
	*
	* @param name the name
	* @return the number of matching eventcalendars
	*/
	public static int countByEVENT_NAME(java.lang.String name) {
		return getPersistence().countByEVENT_NAME(name);
	}

	/**
	* Caches the eventcalendar in the entity cache if it is enabled.
	*
	* @param eventcalendar the eventcalendar
	*/
	public static void cacheResult(eventcalendar eventcalendar) {
		getPersistence().cacheResult(eventcalendar);
	}

	/**
	* Caches the eventcalendars in the entity cache if it is enabled.
	*
	* @param eventcalendars the eventcalendars
	*/
	public static void cacheResult(List<eventcalendar> eventcalendars) {
		getPersistence().cacheResult(eventcalendars);
	}

	/**
	* Creates a new eventcalendar with the primary key. Does not add the eventcalendar to the database.
	*
	* @param id the primary key for the new eventcalendar
	* @return the new eventcalendar
	*/
	public static eventcalendar create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the eventcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the eventcalendar
	* @return the eventcalendar that was removed
	* @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	*/
	public static eventcalendar remove(long id)
		throws com.chola.calendar.exception.NoSucheventcalendarException {
		return getPersistence().remove(id);
	}

	public static eventcalendar updateImpl(eventcalendar eventcalendar) {
		return getPersistence().updateImpl(eventcalendar);
	}

	/**
	* Returns the eventcalendar with the primary key or throws a {@link NoSucheventcalendarException} if it could not be found.
	*
	* @param id the primary key of the eventcalendar
	* @return the eventcalendar
	* @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	*/
	public static eventcalendar findByPrimaryKey(long id)
		throws com.chola.calendar.exception.NoSucheventcalendarException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the eventcalendar with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the eventcalendar
	* @return the eventcalendar, or <code>null</code> if a eventcalendar with the primary key could not be found
	*/
	public static eventcalendar fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, eventcalendar> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the eventcalendars.
	*
	* @return the eventcalendars
	*/
	public static List<eventcalendar> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the eventcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eventcalendars
	* @param end the upper bound of the range of eventcalendars (not inclusive)
	* @return the range of eventcalendars
	*/
	public static List<eventcalendar> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the eventcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eventcalendars
	* @param end the upper bound of the range of eventcalendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of eventcalendars
	*/
	public static List<eventcalendar> findAll(int start, int end,
		OrderByComparator<eventcalendar> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the eventcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eventcalendars
	* @param end the upper bound of the range of eventcalendars (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of eventcalendars
	*/
	public static List<eventcalendar> findAll(int start, int end,
		OrderByComparator<eventcalendar> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the eventcalendars from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of eventcalendars.
	*
	* @return the number of eventcalendars
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static eventcalendarPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (eventcalendarPersistence)PortletBeanLocatorUtil.locate(com.chola.calendar.service.ClpSerializer.getServletContextName(),
					eventcalendarPersistence.class.getName());

			ReferenceRegistry.registerReference(eventcalendarUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static eventcalendarPersistence _persistence;
}