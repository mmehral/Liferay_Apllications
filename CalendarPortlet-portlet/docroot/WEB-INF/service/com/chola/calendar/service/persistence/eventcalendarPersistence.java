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

import com.chola.calendar.exception.NoSucheventcalendarException;
import com.chola.calendar.model.eventcalendar;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the eventcalendar service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.calendar.service.persistence.impl.eventcalendarPersistenceImpl
 * @see eventcalendarUtil
 * @generated
 */
@ProviderType
public interface eventcalendarPersistence extends BasePersistence<eventcalendar> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link eventcalendarUtil} to access the eventcalendar persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the eventcalendars where name = &#63;.
	*
	* @param name the name
	* @return the matching eventcalendars
	*/
	public java.util.List<eventcalendar> findByEVENT_NAME(java.lang.String name);

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
	public java.util.List<eventcalendar> findByEVENT_NAME(
		java.lang.String name, int start, int end);

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
	public java.util.List<eventcalendar> findByEVENT_NAME(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator);

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
	public java.util.List<eventcalendar> findByEVENT_NAME(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first eventcalendar in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eventcalendar
	* @throws NoSucheventcalendarException if a matching eventcalendar could not be found
	*/
	public eventcalendar findByEVENT_NAME_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator)
		throws NoSucheventcalendarException;

	/**
	* Returns the first eventcalendar in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching eventcalendar, or <code>null</code> if a matching eventcalendar could not be found
	*/
	public eventcalendar fetchByEVENT_NAME_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator);

	/**
	* Returns the last eventcalendar in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eventcalendar
	* @throws NoSucheventcalendarException if a matching eventcalendar could not be found
	*/
	public eventcalendar findByEVENT_NAME_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator)
		throws NoSucheventcalendarException;

	/**
	* Returns the last eventcalendar in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching eventcalendar, or <code>null</code> if a matching eventcalendar could not be found
	*/
	public eventcalendar fetchByEVENT_NAME_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator);

	/**
	* Returns the eventcalendars before and after the current eventcalendar in the ordered set where name = &#63;.
	*
	* @param id the primary key of the current eventcalendar
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next eventcalendar
	* @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	*/
	public eventcalendar[] findByEVENT_NAME_PrevAndNext(long id,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator)
		throws NoSucheventcalendarException;

	/**
	* Removes all the eventcalendars where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByEVENT_NAME(java.lang.String name);

	/**
	* Returns the number of eventcalendars where name = &#63;.
	*
	* @param name the name
	* @return the number of matching eventcalendars
	*/
	public int countByEVENT_NAME(java.lang.String name);

	/**
	* Caches the eventcalendar in the entity cache if it is enabled.
	*
	* @param eventcalendar the eventcalendar
	*/
	public void cacheResult(eventcalendar eventcalendar);

	/**
	* Caches the eventcalendars in the entity cache if it is enabled.
	*
	* @param eventcalendars the eventcalendars
	*/
	public void cacheResult(java.util.List<eventcalendar> eventcalendars);

	/**
	* Creates a new eventcalendar with the primary key. Does not add the eventcalendar to the database.
	*
	* @param id the primary key for the new eventcalendar
	* @return the new eventcalendar
	*/
	public eventcalendar create(long id);

	/**
	* Removes the eventcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the eventcalendar
	* @return the eventcalendar that was removed
	* @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	*/
	public eventcalendar remove(long id) throws NoSucheventcalendarException;

	public eventcalendar updateImpl(eventcalendar eventcalendar);

	/**
	* Returns the eventcalendar with the primary key or throws a {@link NoSucheventcalendarException} if it could not be found.
	*
	* @param id the primary key of the eventcalendar
	* @return the eventcalendar
	* @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	*/
	public eventcalendar findByPrimaryKey(long id)
		throws NoSucheventcalendarException;

	/**
	* Returns the eventcalendar with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the eventcalendar
	* @return the eventcalendar, or <code>null</code> if a eventcalendar with the primary key could not be found
	*/
	public eventcalendar fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, eventcalendar> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the eventcalendars.
	*
	* @return the eventcalendars
	*/
	public java.util.List<eventcalendar> findAll();

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
	public java.util.List<eventcalendar> findAll(int start, int end);

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
	public java.util.List<eventcalendar> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator);

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
	public java.util.List<eventcalendar> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<eventcalendar> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the eventcalendars from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of eventcalendars.
	*
	* @return the number of eventcalendars
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}