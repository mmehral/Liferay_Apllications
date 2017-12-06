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

import com.chola.msappointment.exception.NoSuchcalendarmsappointmentException;
import com.chola.msappointment.model.calendarmsappointment;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the calendarmsappointment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.msappointment.service.persistence.impl.calendarmsappointmentPersistenceImpl
 * @see calendarmsappointmentUtil
 * @generated
 */
@ProviderType
public interface calendarmsappointmentPersistence extends BasePersistence<calendarmsappointment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link calendarmsappointmentUtil} to access the calendarmsappointment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the calendarmsappointment in the entity cache if it is enabled.
	*
	* @param calendarmsappointment the calendarmsappointment
	*/
	public void cacheResult(calendarmsappointment calendarmsappointment);

	/**
	* Caches the calendarmsappointments in the entity cache if it is enabled.
	*
	* @param calendarmsappointments the calendarmsappointments
	*/
	public void cacheResult(
		java.util.List<calendarmsappointment> calendarmsappointments);

	/**
	* Creates a new calendarmsappointment with the primary key. Does not add the calendarmsappointment to the database.
	*
	* @param id the primary key for the new calendarmsappointment
	* @return the new calendarmsappointment
	*/
	public calendarmsappointment create(long id);

	/**
	* Removes the calendarmsappointment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment that was removed
	* @throws NoSuchcalendarmsappointmentException if a calendarmsappointment with the primary key could not be found
	*/
	public calendarmsappointment remove(long id)
		throws NoSuchcalendarmsappointmentException;

	public calendarmsappointment updateImpl(
		calendarmsappointment calendarmsappointment);

	/**
	* Returns the calendarmsappointment with the primary key or throws a {@link NoSuchcalendarmsappointmentException} if it could not be found.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment
	* @throws NoSuchcalendarmsappointmentException if a calendarmsappointment with the primary key could not be found
	*/
	public calendarmsappointment findByPrimaryKey(long id)
		throws NoSuchcalendarmsappointmentException;

	/**
	* Returns the calendarmsappointment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment, or <code>null</code> if a calendarmsappointment with the primary key could not be found
	*/
	public calendarmsappointment fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, calendarmsappointment> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the calendarmsappointments.
	*
	* @return the calendarmsappointments
	*/
	public java.util.List<calendarmsappointment> findAll();

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
	public java.util.List<calendarmsappointment> findAll(int start, int end);

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
	public java.util.List<calendarmsappointment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<calendarmsappointment> orderByComparator);

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
	public java.util.List<calendarmsappointment> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<calendarmsappointment> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the calendarmsappointments from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of calendarmsappointments.
	*
	* @return the number of calendarmsappointments
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}