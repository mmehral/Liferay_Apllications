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

package com.chola.msappointment.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link calendarmsappointmentLocalService}.
 *
 * @author CloverLiferay01
 * @see calendarmsappointmentLocalService
 * @generated
 */
@ProviderType
public class calendarmsappointmentLocalServiceWrapper
	implements calendarmsappointmentLocalService,
		ServiceWrapper<calendarmsappointmentLocalService> {
	public calendarmsappointmentLocalServiceWrapper(
		calendarmsappointmentLocalService calendarmsappointmentLocalService) {
		_calendarmsappointmentLocalService = calendarmsappointmentLocalService;
	}

	/**
	* Adds the calendarmsappointment to the database. Also notifies the appropriate model listeners.
	*
	* @param calendarmsappointment the calendarmsappointment
	* @return the calendarmsappointment that was added
	*/
	@Override
	public com.chola.msappointment.model.calendarmsappointment addcalendarmsappointment(
		com.chola.msappointment.model.calendarmsappointment calendarmsappointment) {
		return _calendarmsappointmentLocalService.addcalendarmsappointment(calendarmsappointment);
	}

	/**
	* Creates a new calendarmsappointment with the primary key. Does not add the calendarmsappointment to the database.
	*
	* @param id the primary key for the new calendarmsappointment
	* @return the new calendarmsappointment
	*/
	@Override
	public com.chola.msappointment.model.calendarmsappointment createcalendarmsappointment(
		long id) {
		return _calendarmsappointmentLocalService.createcalendarmsappointment(id);
	}

	/**
	* Deletes the calendarmsappointment from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarmsappointment the calendarmsappointment
	* @return the calendarmsappointment that was removed
	*/
	@Override
	public com.chola.msappointment.model.calendarmsappointment deletecalendarmsappointment(
		com.chola.msappointment.model.calendarmsappointment calendarmsappointment) {
		return _calendarmsappointmentLocalService.deletecalendarmsappointment(calendarmsappointment);
	}

	/**
	* Deletes the calendarmsappointment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment that was removed
	* @throws PortalException if a calendarmsappointment with the primary key could not be found
	*/
	@Override
	public com.chola.msappointment.model.calendarmsappointment deletecalendarmsappointment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarmsappointmentLocalService.deletecalendarmsappointment(id);
	}

	@Override
	public com.chola.msappointment.model.calendarmsappointment fetchcalendarmsappointment(
		long id) {
		return _calendarmsappointmentLocalService.fetchcalendarmsappointment(id);
	}

	/**
	* Returns the calendarmsappointment with the primary key.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment
	* @throws PortalException if a calendarmsappointment with the primary key could not be found
	*/
	@Override
	public com.chola.msappointment.model.calendarmsappointment getcalendarmsappointment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarmsappointmentLocalService.getcalendarmsappointment(id);
	}

	/**
	* Updates the calendarmsappointment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param calendarmsappointment the calendarmsappointment
	* @return the calendarmsappointment that was updated
	*/
	@Override
	public com.chola.msappointment.model.calendarmsappointment updatecalendarmsappointment(
		com.chola.msappointment.model.calendarmsappointment calendarmsappointment) {
		return _calendarmsappointmentLocalService.updatecalendarmsappointment(calendarmsappointment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _calendarmsappointmentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _calendarmsappointmentLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _calendarmsappointmentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarmsappointmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _calendarmsappointmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of calendarmsappointments.
	*
	* @return the number of calendarmsappointments
	*/
	@Override
	public int getcalendarmsappointmentsCount() {
		return _calendarmsappointmentLocalService.getcalendarmsappointmentsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _calendarmsappointmentLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _calendarmsappointmentLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String getScreenNameFromTable(java.lang.String empId) {
		return _calendarmsappointmentLocalService.getScreenNameFromTable(empId);
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
		return _calendarmsappointmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.msappointment.model.impl.calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _calendarmsappointmentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.msappointment.model.impl.calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _calendarmsappointmentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getEmailIdsFromUserTable() {
		return _calendarmsappointmentLocalService.getEmailIdsFromUserTable();
	}

	/**
	* Returns a range of all the calendarmsappointments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.msappointment.model.impl.calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of calendarmsappointments
	* @param end the upper bound of the range of calendarmsappointments (not inclusive)
	* @return the range of calendarmsappointments
	*/
	@Override
	public java.util.List<com.chola.msappointment.model.calendarmsappointment> getcalendarmsappointments(
		int start, int end) {
		return _calendarmsappointmentLocalService.getcalendarmsappointments(start,
			end);
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
		return _calendarmsappointmentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _calendarmsappointmentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public calendarmsappointmentLocalService getWrappedService() {
		return _calendarmsappointmentLocalService;
	}

	@Override
	public void setWrappedService(
		calendarmsappointmentLocalService calendarmsappointmentLocalService) {
		_calendarmsappointmentLocalService = calendarmsappointmentLocalService;
	}

	private calendarmsappointmentLocalService _calendarmsappointmentLocalService;
}