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

package com.contest.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for ContestUserDetails. This utility wraps
 * {@link com.contest.service.impl.ContestUserDetailsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay01
 * @see ContestUserDetailsLocalService
 * @see com.contest.service.base.ContestUserDetailsLocalServiceBaseImpl
 * @see com.contest.service.impl.ContestUserDetailsLocalServiceImpl
 * @generated
 */
@ProviderType
public class ContestUserDetailsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.contest.service.impl.ContestUserDetailsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the contest user details to the database. Also notifies the appropriate model listeners.
	*
	* @param contestUserDetails the contest user details
	* @return the contest user details that was added
	*/
	public static com.contest.model.ContestUserDetails addContestUserDetails(
		com.contest.model.ContestUserDetails contestUserDetails) {
		return getService().addContestUserDetails(contestUserDetails);
	}

	/**
	* Creates a new contest user details with the primary key. Does not add the contest user details to the database.
	*
	* @param id the primary key for the new contest user details
	* @return the new contest user details
	*/
	public static com.contest.model.ContestUserDetails createContestUserDetails(
		long id) {
		return getService().createContestUserDetails(id);
	}

	/**
	* Deletes the contest user details from the database. Also notifies the appropriate model listeners.
	*
	* @param contestUserDetails the contest user details
	* @return the contest user details that was removed
	*/
	public static com.contest.model.ContestUserDetails deleteContestUserDetails(
		com.contest.model.ContestUserDetails contestUserDetails) {
		return getService().deleteContestUserDetails(contestUserDetails);
	}

	/**
	* Deletes the contest user details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details that was removed
	* @throws PortalException if a contest user details with the primary key could not be found
	*/
	public static com.contest.model.ContestUserDetails deleteContestUserDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteContestUserDetails(id);
	}

	public static com.contest.model.ContestUserDetails fetchContestUserDetails(
		long id) {
		return getService().fetchContestUserDetails(id);
	}

	/**
	* Returns the contest user details with the primary key.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details
	* @throws PortalException if a contest user details with the primary key could not be found
	*/
	public static com.contest.model.ContestUserDetails getContestUserDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getContestUserDetails(id);
	}

	/**
	* Updates the contest user details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contestUserDetails the contest user details
	* @return the contest user details that was updated
	*/
	public static com.contest.model.ContestUserDetails updateContestUserDetails(
		com.contest.model.ContestUserDetails contestUserDetails) {
		return getService().updateContestUserDetails(contestUserDetails);
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
	* Returns the number of contest user detailses.
	*
	* @return the number of contest user detailses
	*/
	public static int getContestUserDetailsesCount() {
		return getService().getContestUserDetailsesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the contest user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @return the range of contest user detailses
	*/
	public static java.util.List<com.contest.model.ContestUserDetails> getContestUserDetailses(
		int start, int end) {
		return getService().getContestUserDetailses(start, end);
	}

	public static java.util.List<com.contest.model.ContestUserDetails> getUserIdByContestId(
		long id) {
		return getService().getUserIdByContestId(id);
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

	public static ContestUserDetailsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ContestUserDetailsLocalService.class.getName());

			if (invokableLocalService instanceof ContestUserDetailsLocalService) {
				_service = (ContestUserDetailsLocalService)invokableLocalService;
			}
			else {
				_service = new ContestUserDetailsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ContestUserDetailsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static ContestUserDetailsLocalService _service;
}