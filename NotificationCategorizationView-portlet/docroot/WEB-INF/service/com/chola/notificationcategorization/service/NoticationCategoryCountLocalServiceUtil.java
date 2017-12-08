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

package com.chola.notificationcategorization.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for NoticationCategoryCount. This utility wraps
 * {@link com.chola.notificationcategorization.service.impl.NoticationCategoryCountLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author cloverliferay03
 * @see NoticationCategoryCountLocalService
 * @see com.chola.notificationcategorization.service.base.NoticationCategoryCountLocalServiceBaseImpl
 * @see com.chola.notificationcategorization.service.impl.NoticationCategoryCountLocalServiceImpl
 * @generated
 */
@ProviderType
public class NoticationCategoryCountLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.notificationcategorization.service.impl.NoticationCategoryCountLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean insertIntoCholaUsernotification(long userId,
		long contentId, int readflag) {
		return getService()
				   .insertIntoCholaUsernotification(userId, contentId, readflag);
	}

	public static boolean updatenotificationstatus(int status, long userId,
		long eventId, long contentId, long tableUserId) {
		return getService()
				   .updatenotificationstatus(status, userId, eventId,
			contentId, tableUserId);
	}

	/**
	* Adds the notication category count to the database. Also notifies the appropriate model listeners.
	*
	* @param noticationCategoryCount the notication category count
	* @return the notication category count that was added
	*/
	public static com.chola.notificationcategorization.model.NoticationCategoryCount addNoticationCategoryCount(
		com.chola.notificationcategorization.model.NoticationCategoryCount noticationCategoryCount) {
		return getService().addNoticationCategoryCount(noticationCategoryCount);
	}

	/**
	* Creates a new notication category count with the primary key. Does not add the notication category count to the database.
	*
	* @param eventId the primary key for the new notication category count
	* @return the new notication category count
	*/
	public static com.chola.notificationcategorization.model.NoticationCategoryCount createNoticationCategoryCount(
		long eventId) {
		return getService().createNoticationCategoryCount(eventId);
	}

	/**
	* Deletes the notication category count from the database. Also notifies the appropriate model listeners.
	*
	* @param noticationCategoryCount the notication category count
	* @return the notication category count that was removed
	*/
	public static com.chola.notificationcategorization.model.NoticationCategoryCount deleteNoticationCategoryCount(
		com.chola.notificationcategorization.model.NoticationCategoryCount noticationCategoryCount) {
		return getService()
				   .deleteNoticationCategoryCount(noticationCategoryCount);
	}

	/**
	* Deletes the notication category count with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count that was removed
	* @throws PortalException if a notication category count with the primary key could not be found
	*/
	public static com.chola.notificationcategorization.model.NoticationCategoryCount deleteNoticationCategoryCount(
		long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteNoticationCategoryCount(eventId);
	}

	public static com.chola.notificationcategorization.model.NoticationCategoryCount fetchNoticationCategoryCount(
		long eventId) {
		return getService().fetchNoticationCategoryCount(eventId);
	}

	/**
	* Returns the notication category count with the primary key.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count
	* @throws PortalException if a notication category count with the primary key could not be found
	*/
	public static com.chola.notificationcategorization.model.NoticationCategoryCount getNoticationCategoryCount(
		long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getNoticationCategoryCount(eventId);
	}

	/**
	* Updates the notication category count in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param noticationCategoryCount the notication category count
	* @return the notication category count that was updated
	*/
	public static com.chola.notificationcategorization.model.NoticationCategoryCount updateNoticationCategoryCount(
		com.chola.notificationcategorization.model.NoticationCategoryCount noticationCategoryCount) {
		return getService()
				   .updateNoticationCategoryCount(noticationCategoryCount);
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
	* Returns the number of notication category counts.
	*
	* @return the number of notication category counts
	*/
	public static int getNoticationCategoryCountsCount() {
		return getService().getNoticationCategoryCountsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.notificationcategorization.model.impl.NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.notificationcategorization.model.impl.NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeAll(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeAll(notificationType,
			gender, businessName, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeBranch(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String branch,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeBranch(notificationType,
			gender, businessName, branch, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDepartment(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String department,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeDepartment(notificationType,
			gender, businessName, department, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDesignation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String designation,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeDesignation(notificationType,
			gender, businessName, designation, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeFunction(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String function,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeFunction(notificationType,
			gender, businessName, function, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeGrade(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String grade,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeGrade(notificationType,
			gender, businessName, grade, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeLocation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String location,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeLocation(notificationType,
			gender, businessName, location, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeProduct(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String product,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeProduct(notificationType,
			gender, businessName, product, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeRegion(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String region,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeRegion(notificationType,
			gender, businessName, region, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUnit(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String unit,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeUnit(notificationType,
			gender, businessName, unit, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUserId(
		long notificationType, java.lang.String businessName,
		java.lang.String userId) {
		return getService()
				   .getContentBasedOnNotificationTypeUserId(notificationType,
			businessName, userId);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeZone(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String zone,
		java.lang.String age) {
		return getService()
				   .getContentBasedOnNotificationTypeZone(notificationType,
			gender, businessName, zone, age);
	}

	public static java.util.List<java.lang.Object[]> getNotficationCategoryCount(
		long userid) {
		return getService().getNotficationCategoryCount(userid);
	}

	public static java.util.List<java.lang.Object[]> getNotficationCategoryList(
		long userid, java.lang.String sysval) {
		return getService().getNotficationCategoryList(userid, sysval);
	}

	/**
	* Returns a range of all the notication category counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.notificationcategorization.model.impl.NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notication category counts
	* @param end the upper bound of the range of notication category counts (not inclusive)
	* @return the range of notication category counts
	*/
	public static java.util.List<com.chola.notificationcategorization.model.NoticationCategoryCount> getNoticationCategoryCounts(
		int start, int end) {
		return getService().getNoticationCategoryCounts(start, end);
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

	public static NoticationCategoryCountLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					NoticationCategoryCountLocalService.class.getName());

			if (invokableLocalService instanceof NoticationCategoryCountLocalService) {
				_service = (NoticationCategoryCountLocalService)invokableLocalService;
			}
			else {
				_service = new NoticationCategoryCountLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(NoticationCategoryCountLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static NoticationCategoryCountLocalService _service;
}