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

package com.content.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for contentupdate. This utility wraps
 * {@link com.content.service.impl.contentupdateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay02
 * @see contentupdateLocalService
 * @see com.content.service.base.contentupdateLocalServiceBaseImpl
 * @see com.content.service.impl.contentupdateLocalServiceImpl
 * @generated
 */
@ProviderType
public class contentupdateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.content.service.impl.contentupdateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId) {
		return getService()
				   .insertNotifyStts(syscode, val, sysname, stts, sttsflag,
			usernotifyId);
	}

	public static boolean insertPersonalisedParameters(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		java.lang.Object[] notificationDetails, long notification_type) {
		return getService()
				   .insertPersonalisedParameters(businessId, values, gender,
			age, option, uniqueContentId, lessthan_age, greaterthan_age,
			between_from_to_age, notificationDetails, notification_type);
	}

	/**
	* Adds the contentupdate to the database. Also notifies the appropriate model listeners.
	*
	* @param contentupdate the contentupdate
	* @return the contentupdate that was added
	*/
	public static com.content.model.contentupdate addcontentupdate(
		com.content.model.contentupdate contentupdate) {
		return getService().addcontentupdate(contentupdate);
	}

	/**
	* Creates a new contentupdate with the primary key. Does not add the contentupdate to the database.
	*
	* @param id the primary key for the new contentupdate
	* @return the new contentupdate
	*/
	public static com.content.model.contentupdate createcontentupdate(long id) {
		return getService().createcontentupdate(id);
	}

	/**
	* Deletes the contentupdate from the database. Also notifies the appropriate model listeners.
	*
	* @param contentupdate the contentupdate
	* @return the contentupdate that was removed
	*/
	public static com.content.model.contentupdate deletecontentupdate(
		com.content.model.contentupdate contentupdate) {
		return getService().deletecontentupdate(contentupdate);
	}

	/**
	* Deletes the contentupdate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contentupdate
	* @return the contentupdate that was removed
	* @throws PortalException if a contentupdate with the primary key could not be found
	*/
	public static com.content.model.contentupdate deletecontentupdate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletecontentupdate(id);
	}

	public static com.content.model.contentupdate fetchcontentupdate(long id) {
		return getService().fetchcontentupdate(id);
	}

	/**
	* Returns the contentupdate with the primary key.
	*
	* @param id the primary key of the contentupdate
	* @return the contentupdate
	* @throws PortalException if a contentupdate with the primary key could not be found
	*/
	public static com.content.model.contentupdate getcontentupdate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getcontentupdate(id);
	}

	/**
	* Updates the contentupdate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contentupdate the contentupdate
	* @return the contentupdate that was updated
	*/
	public static com.content.model.contentupdate updatecontentupdate(
		com.content.model.contentupdate contentupdate) {
		return getService().updatecontentupdate(contentupdate);
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
	* Returns the number of contentupdates.
	*
	* @return the number of contentupdates
	*/
	public static int getcontentupdatesCount() {
		return getService().getcontentupdatesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.content.model.impl.contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.content.model.impl.contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option) {
		return getService().getAllUser(businessId, gender, age, option);
	}

	public static java.util.List<java.lang.String> getBranch(
		java.lang.String businessId) {
		return getService().getBranch(businessId);
	}

	public static java.util.List<java.lang.String> getCompany() {
		return getService().getCompany();
	}

	public static java.util.List<java.lang.String> getDepart(
		java.lang.String businessId) {
		return getService().getDepart(businessId);
	}

	public static java.util.List<java.lang.String> getDesignation(
		java.lang.String businessId) {
		return getService().getDesignation(businessId);
	}

	public static java.util.List<java.lang.String> getFunction(
		java.lang.String businessId) {
		return getService().getFunction(businessId);
	}

	public static java.util.List<java.lang.String> getGrade(
		java.lang.String businessId) {
		return getService().getGrade(businessId);
	}

	public static java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option) {
		return getService()
				   .getIntendedUser(businessId, values, gender, age, option);
	}

	public static java.util.List<java.lang.String> getLocation(
		java.lang.String businessId) {
		return getService().getLocation(businessId);
	}

	public static java.util.List<java.lang.String> getProduct(
		java.lang.String businessId) {
		return getService().getProduct(businessId);
	}

	public static java.util.List<java.lang.String> getRegion(
		java.lang.String businessId) {
		return getService().getRegion(businessId);
	}

	public static java.util.List<java.lang.String> getUnit(
		java.lang.String businessId) {
		return getService().getUnit(businessId);
	}

	public static java.util.List<java.lang.Object[]> getUsers() {
		return getService().getUsers();
	}

	public static java.util.List<java.lang.String> getZone(
		java.lang.String businessId) {
		return getService().getZone(businessId);
	}

	/**
	* Returns a range of all the contentupdates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.content.model.impl.contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentupdates
	* @param end the upper bound of the range of contentupdates (not inclusive)
	* @return the range of contentupdates
	*/
	public static java.util.List<com.content.model.contentupdate> getcontentupdates(
		int start, int end) {
		return getService().getcontentupdates(start, end);
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

	public static contentupdateLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					contentupdateLocalService.class.getName());

			if (invokableLocalService instanceof contentupdateLocalService) {
				_service = (contentupdateLocalService)invokableLocalService;
			}
			else {
				_service = new contentupdateLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(contentupdateLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static contentupdateLocalService _service;
}