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

package com.chola.bsop.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for bsoppath. This utility wraps
 * {@link com.chola.bsop.service.impl.bsoppathLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author cloverliferay01
 * @see bsoppathLocalService
 * @see com.chola.bsop.service.base.bsoppathLocalServiceBaseImpl
 * @see com.chola.bsop.service.impl.bsoppathLocalServiceImpl
 * @generated
 */
@ProviderType
public class bsoppathLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.bsop.service.impl.bsoppathLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the bsoppath to the database. Also notifies the appropriate model listeners.
	*
	* @param bsoppath the bsoppath
	* @return the bsoppath that was added
	*/
	public static com.chola.bsop.model.bsoppath addbsoppath(
		com.chola.bsop.model.bsoppath bsoppath) {
		return getService().addbsoppath(bsoppath);
	}

	/**
	* Creates a new bsoppath with the primary key. Does not add the bsoppath to the database.
	*
	* @param id the primary key for the new bsoppath
	* @return the new bsoppath
	*/
	public static com.chola.bsop.model.bsoppath createbsoppath(long id) {
		return getService().createbsoppath(id);
	}

	/**
	* Deletes the bsoppath from the database. Also notifies the appropriate model listeners.
	*
	* @param bsoppath the bsoppath
	* @return the bsoppath that was removed
	*/
	public static com.chola.bsop.model.bsoppath deletebsoppath(
		com.chola.bsop.model.bsoppath bsoppath) {
		return getService().deletebsoppath(bsoppath);
	}

	/**
	* Deletes the bsoppath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath that was removed
	* @throws PortalException if a bsoppath with the primary key could not be found
	*/
	public static com.chola.bsop.model.bsoppath deletebsoppath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletebsoppath(id);
	}

	public static com.chola.bsop.model.bsoppath fetchbsoppath(long id) {
		return getService().fetchbsoppath(id);
	}

	/**
	* Returns the bsoppath with the primary key.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath
	* @throws PortalException if a bsoppath with the primary key could not be found
	*/
	public static com.chola.bsop.model.bsoppath getbsoppath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getbsoppath(id);
	}

	/**
	* Updates the bsoppath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bsoppath the bsoppath
	* @return the bsoppath that was updated
	*/
	public static com.chola.bsop.model.bsoppath updatebsoppath(
		com.chola.bsop.model.bsoppath bsoppath) {
		return getService().updatebsoppath(bsoppath);
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
	* Returns the number of bsoppaths.
	*
	* @return the number of bsoppaths
	*/
	public static int getbsoppathsCount() {
		return getService().getbsoppathsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.bsop.model.impl.bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.bsop.model.impl.bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.chola.bsop.model.bsoppath> getbsopFileDetail(
		long contentId) {
		return getService().getbsopFileDetail(contentId);
	}

	/**
	* Returns a range of all the bsoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.bsop.model.impl.bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @return the range of bsoppaths
	*/
	public static java.util.List<com.chola.bsop.model.bsoppath> getbsoppaths(
		int start, int end) {
		return getService().getbsoppaths(start, end);
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

	public static bsoppathLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					bsoppathLocalService.class.getName());

			if (invokableLocalService instanceof bsoppathLocalService) {
				_service = (bsoppathLocalService)invokableLocalService;
			}
			else {
				_service = new bsoppathLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(bsoppathLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static bsoppathLocalService _service;
}