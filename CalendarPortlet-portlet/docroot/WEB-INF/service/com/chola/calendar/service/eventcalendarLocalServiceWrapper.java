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

package com.chola.calendar.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link eventcalendarLocalService}.
 *
 * @author adms.java1
 * @see eventcalendarLocalService
 * @generated
 */
@ProviderType
public class eventcalendarLocalServiceWrapper
	implements eventcalendarLocalService,
		ServiceWrapper<eventcalendarLocalService> {
	public eventcalendarLocalServiceWrapper(
		eventcalendarLocalService eventcalendarLocalService) {
		_eventcalendarLocalService = eventcalendarLocalService;
	}

	@Override
	public boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId) {
		return _eventcalendarLocalService.insertNotifyStts(syscode, val,
			sysname, stts, sttsflag, usernotifyId);
	}

	/**
	* Adds the eventcalendar to the database. Also notifies the appropriate model listeners.
	*
	* @param eventcalendar the eventcalendar
	* @return the eventcalendar that was added
	*/
	@Override
	public com.chola.calendar.model.eventcalendar addeventcalendar(
		com.chola.calendar.model.eventcalendar eventcalendar) {
		return _eventcalendarLocalService.addeventcalendar(eventcalendar);
	}

	/**
	* Creates a new eventcalendar with the primary key. Does not add the eventcalendar to the database.
	*
	* @param id the primary key for the new eventcalendar
	* @return the new eventcalendar
	*/
	@Override
	public com.chola.calendar.model.eventcalendar createeventcalendar(long id) {
		return _eventcalendarLocalService.createeventcalendar(id);
	}

	/**
	* Deletes the eventcalendar from the database. Also notifies the appropriate model listeners.
	*
	* @param eventcalendar the eventcalendar
	* @return the eventcalendar that was removed
	*/
	@Override
	public com.chola.calendar.model.eventcalendar deleteeventcalendar(
		com.chola.calendar.model.eventcalendar eventcalendar) {
		return _eventcalendarLocalService.deleteeventcalendar(eventcalendar);
	}

	/**
	* Deletes the eventcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the eventcalendar
	* @return the eventcalendar that was removed
	* @throws PortalException if a eventcalendar with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.eventcalendar deleteeventcalendar(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _eventcalendarLocalService.deleteeventcalendar(id);
	}

	@Override
	public com.chola.calendar.model.eventcalendar fetcheventcalendar(long id) {
		return _eventcalendarLocalService.fetcheventcalendar(id);
	}

	/**
	* Returns the eventcalendar with the primary key.
	*
	* @param id the primary key of the eventcalendar
	* @return the eventcalendar
	* @throws PortalException if a eventcalendar with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.eventcalendar geteventcalendar(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _eventcalendarLocalService.geteventcalendar(id);
	}

	/**
	* Updates the eventcalendar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param eventcalendar the eventcalendar
	* @return the eventcalendar that was updated
	*/
	@Override
	public com.chola.calendar.model.eventcalendar updateeventcalendar(
		com.chola.calendar.model.eventcalendar eventcalendar) {
		return _eventcalendarLocalService.updateeventcalendar(eventcalendar);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _eventcalendarLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _eventcalendarLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _eventcalendarLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _eventcalendarLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _eventcalendarLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of eventcalendars.
	*
	* @return the number of eventcalendars
	*/
	@Override
	public int geteventcalendarsCount() {
		return _eventcalendarLocalService.geteventcalendarsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _eventcalendarLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _eventcalendarLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<java.lang.Object[]> SyscodeCustomMsg(int syscode) {
		return _eventcalendarLocalService.SyscodeCustomMsg(syscode);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _eventcalendarLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _eventcalendarLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _eventcalendarLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getDetails(long userId) {
		return _eventcalendarLocalService.getDetails(userId);
	}

	/**
	* Returns a range of all the eventcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of eventcalendars
	* @param end the upper bound of the range of eventcalendars (not inclusive)
	* @return the range of eventcalendars
	*/
	@Override
	public java.util.List<com.chola.calendar.model.eventcalendar> geteventcalendars(
		int start, int end) {
		return _eventcalendarLocalService.geteventcalendars(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _eventcalendarLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _eventcalendarLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public eventcalendarLocalService getWrappedService() {
		return _eventcalendarLocalService;
	}

	@Override
	public void setWrappedService(
		eventcalendarLocalService eventcalendarLocalService) {
		_eventcalendarLocalService = eventcalendarLocalService;
	}

	private eventcalendarLocalService _eventcalendarLocalService;
}