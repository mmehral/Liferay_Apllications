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

package com.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for cholatalkiespath. This utility wraps
 * {@link com.service.impl.cholatalkiespathLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adms.java1
 * @see cholatalkiespathLocalService
 * @see com.service.base.cholatalkiespathLocalServiceBaseImpl
 * @see com.service.impl.cholatalkiespathLocalServiceImpl
 * @generated
 */
@ProviderType
public class cholatalkiespathLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.service.impl.cholatalkiespathLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
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
	* Adds the cholatalkiespath to the database. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiespath the cholatalkiespath
	* @return the cholatalkiespath that was added
	*/
	public static com.model.cholatalkiespath addcholatalkiespath(
		com.model.cholatalkiespath cholatalkiespath) {
		return getService().addcholatalkiespath(cholatalkiespath);
	}

	/**
	* Creates a new cholatalkiespath with the primary key. Does not add the cholatalkiespath to the database.
	*
	* @param id the primary key for the new cholatalkiespath
	* @return the new cholatalkiespath
	*/
	public static com.model.cholatalkiespath createcholatalkiespath(long id) {
		return getService().createcholatalkiespath(id);
	}

	/**
	* Deletes the cholatalkiespath from the database. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiespath the cholatalkiespath
	* @return the cholatalkiespath that was removed
	*/
	public static com.model.cholatalkiespath deletecholatalkiespath(
		com.model.cholatalkiespath cholatalkiespath) {
		return getService().deletecholatalkiespath(cholatalkiespath);
	}

	/**
	* Deletes the cholatalkiespath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholatalkiespath
	* @return the cholatalkiespath that was removed
	* @throws PortalException if a cholatalkiespath with the primary key could not be found
	*/
	public static com.model.cholatalkiespath deletecholatalkiespath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletecholatalkiespath(id);
	}

	public static com.model.cholatalkiespath fetchcholatalkiespath(long id) {
		return getService().fetchcholatalkiespath(id);
	}

	/**
	* Returns the cholatalkiespath with the primary key.
	*
	* @param id the primary key of the cholatalkiespath
	* @return the cholatalkiespath
	* @throws PortalException if a cholatalkiespath with the primary key could not be found
	*/
	public static com.model.cholatalkiespath getcholatalkiespath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getcholatalkiespath(id);
	}

	/**
	* Updates the cholatalkiespath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiespath the cholatalkiespath
	* @return the cholatalkiespath that was updated
	*/
	public static com.model.cholatalkiespath updatecholatalkiespath(
		com.model.cholatalkiespath cholatalkiespath) {
		return getService().updatecholatalkiespath(cholatalkiespath);
	}

	/**
	* Returns the number of cholatalkiespaths.
	*
	* @return the number of cholatalkiespaths
	*/
	public static int getcholatalkiespathsCount() {
		return getService().getcholatalkiespathsCount();
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

	public static java.util.List<com.model.cholatalkiespath> cholaTalkiesVideoDetails(
		long contentId) {
		return getService().cholaTalkiesVideoDetails(contentId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the cholatalkiespaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @return the range of cholatalkiespaths
	*/
	public static java.util.List<com.model.cholatalkiespath> getcholatalkiespaths(
		int start, int end) {
		return getService().getcholatalkiespaths(start, end);
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

	public static cholatalkiespathLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					cholatalkiespathLocalService.class.getName());

			if (invokableLocalService instanceof cholatalkiespathLocalService) {
				_service = (cholatalkiespathLocalService)invokableLocalService;
			}
			else {
				_service = new cholatalkiespathLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(cholatalkiespathLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static cholatalkiespathLocalService _service;
}