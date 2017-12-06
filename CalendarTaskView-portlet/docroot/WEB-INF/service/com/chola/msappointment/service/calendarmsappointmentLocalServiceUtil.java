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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for calendarmsappointment. This utility wraps
 * {@link com.chola.msappointment.service.impl.calendarmsappointmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay01
 * @see calendarmsappointmentLocalService
 * @see com.chola.msappointment.service.base.calendarmsappointmentLocalServiceBaseImpl
 * @see com.chola.msappointment.service.impl.calendarmsappointmentLocalServiceImpl
 * @generated
 */
@ProviderType
public class calendarmsappointmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.msappointment.service.impl.calendarmsappointmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the calendarmsappointment to the database. Also notifies the appropriate model listeners.
	*
	* @param calendarmsappointment the calendarmsappointment
	* @return the calendarmsappointment that was added
	*/
	public static com.chola.msappointment.model.calendarmsappointment addcalendarmsappointment(
		com.chola.msappointment.model.calendarmsappointment calendarmsappointment) {
		return getService().addcalendarmsappointment(calendarmsappointment);
	}

	/**
	* Creates a new calendarmsappointment with the primary key. Does not add the calendarmsappointment to the database.
	*
	* @param id the primary key for the new calendarmsappointment
	* @return the new calendarmsappointment
	*/
	public static com.chola.msappointment.model.calendarmsappointment createcalendarmsappointment(
		long id) {
		return getService().createcalendarmsappointment(id);
	}

	/**
	* Deletes the calendarmsappointment from the database. Also notifies the appropriate model listeners.
	*
	* @param calendarmsappointment the calendarmsappointment
	* @return the calendarmsappointment that was removed
	*/
	public static com.chola.msappointment.model.calendarmsappointment deletecalendarmsappointment(
		com.chola.msappointment.model.calendarmsappointment calendarmsappointment) {
		return getService().deletecalendarmsappointment(calendarmsappointment);
	}

	/**
	* Deletes the calendarmsappointment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment that was removed
	* @throws PortalException if a calendarmsappointment with the primary key could not be found
	*/
	public static com.chola.msappointment.model.calendarmsappointment deletecalendarmsappointment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletecalendarmsappointment(id);
	}

	public static com.chola.msappointment.model.calendarmsappointment fetchcalendarmsappointment(
		long id) {
		return getService().fetchcalendarmsappointment(id);
	}

	/**
	* Returns the calendarmsappointment with the primary key.
	*
	* @param id the primary key of the calendarmsappointment
	* @return the calendarmsappointment
	* @throws PortalException if a calendarmsappointment with the primary key could not be found
	*/
	public static com.chola.msappointment.model.calendarmsappointment getcalendarmsappointment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getcalendarmsappointment(id);
	}

	/**
	* Updates the calendarmsappointment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param calendarmsappointment the calendarmsappointment
	* @return the calendarmsappointment that was updated
	*/
	public static com.chola.msappointment.model.calendarmsappointment updatecalendarmsappointment(
		com.chola.msappointment.model.calendarmsappointment calendarmsappointment) {
		return getService().updatecalendarmsappointment(calendarmsappointment);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of calendarmsappointments.
	*
	* @return the number of calendarmsappointments
	*/
	public static int getcalendarmsappointmentsCount() {
		return getService().getcalendarmsappointmentsCount();
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.lang.String getScreenNameFromTable(
		java.lang.String empId) {
		return getService().getScreenNameFromTable(empId);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<java.lang.String> getEmailIdsFromUserTable() {
		return getService().getEmailIdsFromUserTable();
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
	public static java.util.List<com.chola.msappointment.model.calendarmsappointment> getcalendarmsappointments(
		int start, int end) {
		return getService().getcalendarmsappointments(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void clearService() {
		_service = null;
	}

	public static calendarmsappointmentLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					calendarmsappointmentLocalService.class.getName());

			if (invokableLocalService instanceof calendarmsappointmentLocalService) {
				_service = (calendarmsappointmentLocalService)invokableLocalService;
			}
			else {
				_service = new calendarmsappointmentLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(calendarmsappointmentLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static calendarmsappointmentLocalService _service;
}