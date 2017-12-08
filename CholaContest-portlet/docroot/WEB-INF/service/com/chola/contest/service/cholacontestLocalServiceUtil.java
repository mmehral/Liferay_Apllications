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

package com.chola.contest.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for cholacontest. This utility wraps
 * {@link com.chola.contest.service.impl.cholacontestLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author cloverliferay01
 * @see cholacontestLocalService
 * @see com.chola.contest.service.base.cholacontestLocalServiceBaseImpl
 * @see com.chola.contest.service.impl.cholacontestLocalServiceImpl
 * @generated
 */
@ProviderType
public class cholacontestLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.contest.service.impl.cholacontestLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the cholacontest to the database. Also notifies the appropriate model listeners.
	*
	* @param cholacontest the cholacontest
	* @return the cholacontest that was added
	*/
	public static com.chola.contest.model.cholacontest addcholacontest(
		com.chola.contest.model.cholacontest cholacontest) {
		return getService().addcholacontest(cholacontest);
	}

	/**
	* Creates a new cholacontest with the primary key. Does not add the cholacontest to the database.
	*
	* @param id the primary key for the new cholacontest
	* @return the new cholacontest
	*/
	public static com.chola.contest.model.cholacontest createcholacontest(
		long id) {
		return getService().createcholacontest(id);
	}

	/**
	* Deletes the cholacontest from the database. Also notifies the appropriate model listeners.
	*
	* @param cholacontest the cholacontest
	* @return the cholacontest that was removed
	*/
	public static com.chola.contest.model.cholacontest deletecholacontest(
		com.chola.contest.model.cholacontest cholacontest) {
		return getService().deletecholacontest(cholacontest);
	}

	/**
	* Deletes the cholacontest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholacontest
	* @return the cholacontest that was removed
	* @throws PortalException if a cholacontest with the primary key could not be found
	*/
	public static com.chola.contest.model.cholacontest deletecholacontest(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletecholacontest(id);
	}

	public static com.chola.contest.model.cholacontest fetchcholacontest(
		long id) {
		return getService().fetchcholacontest(id);
	}

	/**
	* Returns the cholacontest with the primary key.
	*
	* @param id the primary key of the cholacontest
	* @return the cholacontest
	* @throws PortalException if a cholacontest with the primary key could not be found
	*/
	public static com.chola.contest.model.cholacontest getcholacontest(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getcholacontest(id);
	}

	/**
	* Updates the cholacontest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cholacontest the cholacontest
	* @return the cholacontest that was updated
	*/
	public static com.chola.contest.model.cholacontest updatecholacontest(
		com.chola.contest.model.cholacontest cholacontest) {
		return getService().updatecholacontest(cholacontest);
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
	* Returns the number of cholacontests.
	*
	* @return the number of cholacontests
	*/
	public static int getcholacontestsCount() {
		return getService().getcholacontestsCount();
	}

	public static java.lang.Integer getContestType(java.lang.String id) {
		return getService().getContestType(id);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.lang.String getEmpIdFromUID(java.lang.String uid) {
		return getService().getEmpIdFromUID(uid);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<java.lang.Object[]> ContestList() {
		return getService().ContestList();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.contest.model.impl.cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.contest.model.impl.cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the cholacontests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.contest.model.impl.cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @return the range of cholacontests
	*/
	public static java.util.List<com.chola.contest.model.cholacontest> getcholacontests(
		int start, int end) {
		return getService().getcholacontests(start, end);
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

	public static cholacontestLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					cholacontestLocalService.class.getName());

			if (invokableLocalService instanceof cholacontestLocalService) {
				_service = (cholacontestLocalService)invokableLocalService;
			}
			else {
				_service = new cholacontestLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(cholacontestLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static cholacontestLocalService _service;
}