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

package com.chola.trainingcalendar.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for trainingcalendardata. This utility wraps
 * {@link com.chola.trainingcalendar.service.impl.trainingcalendardataLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay01
 * @see trainingcalendardataLocalService
 * @see com.chola.trainingcalendar.service.base.trainingcalendardataLocalServiceBaseImpl
 * @see com.chola.trainingcalendar.service.impl.trainingcalendardataLocalServiceImpl
 * @generated
 */
@ProviderType
public class trainingcalendardataLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.trainingcalendar.service.impl.trainingcalendardataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the trainingcalendardata to the database. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendardata the trainingcalendardata
	* @return the trainingcalendardata that was added
	*/
	public static com.chola.trainingcalendar.model.trainingcalendardata addtrainingcalendardata(
		com.chola.trainingcalendar.model.trainingcalendardata trainingcalendardata) {
		return getService().addtrainingcalendardata(trainingcalendardata);
	}

	/**
	* Creates a new trainingcalendardata with the primary key. Does not add the trainingcalendardata to the database.
	*
	* @param id the primary key for the new trainingcalendardata
	* @return the new trainingcalendardata
	*/
	public static com.chola.trainingcalendar.model.trainingcalendardata createtrainingcalendardata(
		long id) {
		return getService().createtrainingcalendardata(id);
	}

	/**
	* Deletes the trainingcalendardata from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendardata the trainingcalendardata
	* @return the trainingcalendardata that was removed
	*/
	public static com.chola.trainingcalendar.model.trainingcalendardata deletetrainingcalendardata(
		com.chola.trainingcalendar.model.trainingcalendardata trainingcalendardata) {
		return getService().deletetrainingcalendardata(trainingcalendardata);
	}

	/**
	* Deletes the trainingcalendardata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata that was removed
	* @throws PortalException if a trainingcalendardata with the primary key could not be found
	*/
	public static com.chola.trainingcalendar.model.trainingcalendardata deletetrainingcalendardata(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletetrainingcalendardata(id);
	}

	public static com.chola.trainingcalendar.model.trainingcalendardata fetchtrainingcalendardata(
		long id) {
		return getService().fetchtrainingcalendardata(id);
	}

	/**
	* Returns the trainingcalendardata with the primary key.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata
	* @throws PortalException if a trainingcalendardata with the primary key could not be found
	*/
	public static com.chola.trainingcalendar.model.trainingcalendardata gettrainingcalendardata(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().gettrainingcalendardata(id);
	}

	/**
	* Updates the trainingcalendardata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendardata the trainingcalendardata
	* @return the trainingcalendardata that was updated
	*/
	public static com.chola.trainingcalendar.model.trainingcalendardata updatetrainingcalendardata(
		com.chola.trainingcalendar.model.trainingcalendardata trainingcalendardata) {
		return getService().updatetrainingcalendardata(trainingcalendardata);
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
	* Returns the number of trainingcalendardatas.
	*
	* @return the number of trainingcalendardatas
	*/
	public static int gettrainingcalendardatasCount() {
		return getService().gettrainingcalendardatasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the trainingcalendardatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendardatas
	* @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	* @return the range of trainingcalendardatas
	*/
	public static java.util.List<com.chola.trainingcalendar.model.trainingcalendardata> gettrainingcalendardatas(
		int start, int end) {
		return getService().gettrainingcalendardatas(start, end);
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

	public static trainingcalendardataLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					trainingcalendardataLocalService.class.getName());

			if (invokableLocalService instanceof trainingcalendardataLocalService) {
				_service = (trainingcalendardataLocalService)invokableLocalService;
			}
			else {
				_service = new trainingcalendardataLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(trainingcalendardataLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static trainingcalendardataLocalService _service;
}