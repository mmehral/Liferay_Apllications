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

package com.chola.swagatam.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for swagatamdata. This utility wraps
 * {@link com.chola.swagatam.service.impl.swagatamdataLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay02
 * @see swagatamdataLocalService
 * @see com.chola.swagatam.service.base.swagatamdataLocalServiceBaseImpl
 * @see com.chola.swagatam.service.impl.swagatamdataLocalServiceImpl
 * @generated
 */
@ProviderType
public class swagatamdataLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.swagatam.service.impl.swagatamdataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the swagatamdata to the database. Also notifies the appropriate model listeners.
	*
	* @param swagatamdata the swagatamdata
	* @return the swagatamdata that was added
	*/
	public static com.chola.swagatam.model.swagatamdata addswagatamdata(
		com.chola.swagatam.model.swagatamdata swagatamdata) {
		return getService().addswagatamdata(swagatamdata);
	}

	/**
	* Creates a new swagatamdata with the primary key. Does not add the swagatamdata to the database.
	*
	* @param id the primary key for the new swagatamdata
	* @return the new swagatamdata
	*/
	public static com.chola.swagatam.model.swagatamdata createswagatamdata(
		long id) {
		return getService().createswagatamdata(id);
	}

	/**
	* Deletes the swagatamdata from the database. Also notifies the appropriate model listeners.
	*
	* @param swagatamdata the swagatamdata
	* @return the swagatamdata that was removed
	*/
	public static com.chola.swagatam.model.swagatamdata deleteswagatamdata(
		com.chola.swagatam.model.swagatamdata swagatamdata) {
		return getService().deleteswagatamdata(swagatamdata);
	}

	/**
	* Deletes the swagatamdata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the swagatamdata
	* @return the swagatamdata that was removed
	* @throws PortalException if a swagatamdata with the primary key could not be found
	*/
	public static com.chola.swagatam.model.swagatamdata deleteswagatamdata(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteswagatamdata(id);
	}

	public static com.chola.swagatam.model.swagatamdata fetchswagatamdata(
		long id) {
		return getService().fetchswagatamdata(id);
	}

	/**
	* Returns the swagatamdata with the primary key.
	*
	* @param id the primary key of the swagatamdata
	* @return the swagatamdata
	* @throws PortalException if a swagatamdata with the primary key could not be found
	*/
	public static com.chola.swagatam.model.swagatamdata getswagatamdata(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getswagatamdata(id);
	}

	/**
	* Updates the swagatamdata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param swagatamdata the swagatamdata
	* @return the swagatamdata that was updated
	*/
	public static com.chola.swagatam.model.swagatamdata updateswagatamdata(
		com.chola.swagatam.model.swagatamdata swagatamdata) {
		return getService().updateswagatamdata(swagatamdata);
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
	* Returns the number of swagatamdatas.
	*
	* @return the number of swagatamdatas
	*/
	public static int getswagatamdatasCount() {
		return getService().getswagatamdatasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.chola.swagatam.model.swagatamdata> getEmpData(
		java.lang.String empId) {
		return getService().getEmpData(empId);
	}

	/**
	* Returns a range of all the swagatamdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatamdatas
	* @param end the upper bound of the range of swagatamdatas (not inclusive)
	* @return the range of swagatamdatas
	*/
	public static java.util.List<com.chola.swagatam.model.swagatamdata> getswagatamdatas(
		int start, int end) {
		return getService().getswagatamdatas(start, end);
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

	public static swagatamdataLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					swagatamdataLocalService.class.getName());

			if (invokableLocalService instanceof swagatamdataLocalService) {
				_service = (swagatamdataLocalService)invokableLocalService;
			}
			else {
				_service = new swagatamdataLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(swagatamdataLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static swagatamdataLocalService _service;
}