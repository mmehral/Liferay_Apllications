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

package com.chola.successstories.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for ssusers. This utility wraps
 * {@link com.chola.successstories.service.impl.ssusersLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author cloverliferay01
 * @see ssusersLocalService
 * @see com.chola.successstories.service.base.ssusersLocalServiceBaseImpl
 * @see com.chola.successstories.service.impl.ssusersLocalServiceImpl
 * @generated
 */
@ProviderType
public class ssusersLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.successstories.service.impl.ssusersLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ssusers to the database. Also notifies the appropriate model listeners.
	*
	* @param ssusers the ssusers
	* @return the ssusers that was added
	*/
	public static com.chola.successstories.model.ssusers addssusers(
		com.chola.successstories.model.ssusers ssusers) {
		return getService().addssusers(ssusers);
	}

	/**
	* Creates a new ssusers with the primary key. Does not add the ssusers to the database.
	*
	* @param id the primary key for the new ssusers
	* @return the new ssusers
	*/
	public static com.chola.successstories.model.ssusers createssusers(long id) {
		return getService().createssusers(id);
	}

	/**
	* Deletes the ssusers from the database. Also notifies the appropriate model listeners.
	*
	* @param ssusers the ssusers
	* @return the ssusers that was removed
	*/
	public static com.chola.successstories.model.ssusers deletessusers(
		com.chola.successstories.model.ssusers ssusers) {
		return getService().deletessusers(ssusers);
	}

	/**
	* Deletes the ssusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ssusers
	* @return the ssusers that was removed
	* @throws PortalException if a ssusers with the primary key could not be found
	*/
	public static com.chola.successstories.model.ssusers deletessusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletessusers(id);
	}

	public static com.chola.successstories.model.ssusers fetchssusers(long id) {
		return getService().fetchssusers(id);
	}

	/**
	* Returns the ssusers with the primary key.
	*
	* @param id the primary key of the ssusers
	* @return the ssusers
	* @throws PortalException if a ssusers with the primary key could not be found
	*/
	public static com.chola.successstories.model.ssusers getssusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getssusers(id);
	}

	/**
	* Updates the ssusers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ssusers the ssusers
	* @return the ssusers that was updated
	*/
	public static com.chola.successstories.model.ssusers updatessusers(
		com.chola.successstories.model.ssusers ssusers) {
		return getService().updatessusers(ssusers);
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
	* Returns the number of ssuserses.
	*
	* @return the number of ssuserses
	*/
	public static int getssusersesCount() {
		return getService().getssusersesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.successstories.model.impl.ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.successstories.model.impl.ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.chola.successstories.model.ssusers> getSSDetails(
		long ssId) {
		return getService().getSSDetails(ssId);
	}

	public static java.util.List<com.chola.successstories.model.ssusers> getSSUsers(
		long user_id) {
		return getService().getSSUsers(user_id);
	}

	/**
	* Returns a range of all the ssuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.successstories.model.impl.ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @return the range of ssuserses
	*/
	public static java.util.List<com.chola.successstories.model.ssusers> getssuserses(
		int start, int end) {
		return getService().getssuserses(start, end);
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

	public static ssusersLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ssusersLocalService.class.getName());

			if (invokableLocalService instanceof ssusersLocalService) {
				_service = (ssusersLocalService)invokableLocalService;
			}
			else {
				_service = new ssusersLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ssusersLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static ssusersLocalService _service;
}