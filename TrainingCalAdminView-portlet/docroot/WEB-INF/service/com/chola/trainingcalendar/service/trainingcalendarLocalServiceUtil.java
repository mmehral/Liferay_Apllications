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
 * Provides the local service utility for trainingcalendar. This utility wraps
 * {@link com.chola.trainingcalendar.service.impl.trainingcalendarLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay01
 * @see trainingcalendarLocalService
 * @see com.chola.trainingcalendar.service.base.trainingcalendarLocalServiceBaseImpl
 * @see com.chola.trainingcalendar.service.impl.trainingcalendarLocalServiceImpl
 * @generated
 */
@ProviderType
public class trainingcalendarLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.trainingcalendar.service.impl.trainingcalendarLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean addAcceptRejectResponse(int trainingId,
		java.lang.String screenName, long contentId, int statusFlag) {
		return getService()
				   .addAcceptRejectResponse(trainingId, screenName, contentId,
			statusFlag);
	}

	public static boolean deletAllTrainings() {
		return getService().deletAllTrainings();
	}

	public static boolean getExistingintendedUserTrainingList(long trainingId,
		java.lang.String userId, java.lang.String screenName) {
		return getService()
				   .getExistingintendedUserTrainingList(trainingId, userId,
			screenName);
	}

	public static boolean insertIntoTrainingPPContentStore(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		long notification_type) {
		return getService()
				   .insertIntoTrainingPPContentStore(businessId, values,
			gender, age, option, uniqueContentId, lessthan_age,
			greaterthan_age, between_from_to_age, notification_type);
	}

	public static boolean updateFlag(int trainingId,
		java.lang.String screenName, int statusFlag) {
		return getService().updateFlag(trainingId, screenName, statusFlag);
	}

	/**
	* Adds the trainingcalendar to the database. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendar the trainingcalendar
	* @return the trainingcalendar that was added
	*/
	public static com.chola.trainingcalendar.model.trainingcalendar addtrainingcalendar(
		com.chola.trainingcalendar.model.trainingcalendar trainingcalendar) {
		return getService().addtrainingcalendar(trainingcalendar);
	}

	/**
	* Creates a new trainingcalendar with the primary key. Does not add the trainingcalendar to the database.
	*
	* @param trainingid the primary key for the new trainingcalendar
	* @return the new trainingcalendar
	*/
	public static com.chola.trainingcalendar.model.trainingcalendar createtrainingcalendar(
		long trainingid) {
		return getService().createtrainingcalendar(trainingid);
	}

	/**
	* Deletes the trainingcalendar from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendar the trainingcalendar
	* @return the trainingcalendar that was removed
	*/
	public static com.chola.trainingcalendar.model.trainingcalendar deletetrainingcalendar(
		com.chola.trainingcalendar.model.trainingcalendar trainingcalendar) {
		return getService().deletetrainingcalendar(trainingcalendar);
	}

	/**
	* Deletes the trainingcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar that was removed
	* @throws PortalException if a trainingcalendar with the primary key could not be found
	*/
	public static com.chola.trainingcalendar.model.trainingcalendar deletetrainingcalendar(
		long trainingid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletetrainingcalendar(trainingid);
	}

	public static com.chola.trainingcalendar.model.trainingcalendar fetchtrainingcalendar(
		long trainingid) {
		return getService().fetchtrainingcalendar(trainingid);
	}

	/**
	* Returns the trainingcalendar with the primary key.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar
	* @throws PortalException if a trainingcalendar with the primary key could not be found
	*/
	public static com.chola.trainingcalendar.model.trainingcalendar gettrainingcalendar(
		long trainingid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().gettrainingcalendar(trainingid);
	}

	/**
	* Updates the trainingcalendar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendar the trainingcalendar
	* @return the trainingcalendar that was updated
	*/
	public static com.chola.trainingcalendar.model.trainingcalendar updatetrainingcalendar(
		com.chola.trainingcalendar.model.trainingcalendar trainingcalendar) {
		return getService().updatetrainingcalendar(trainingcalendar);
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
	* Returns the number of trainingcalendars.
	*
	* @return the number of trainingcalendars
	*/
	public static int gettrainingcalendarsCount() {
		return getService().gettrainingcalendarsCount();
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.lang.Object[] getIntendedUserTrainingRecordList(long id) {
		return getService().getIntendedUserTrainingRecordList(id);
	}

	public static java.lang.String getBusinessNames(java.lang.String businessID) {
		return getService().getBusinessNames(businessID);
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

	public static java.lang.String getTrainingName(java.lang.String trainingId) {
		return getService().getTrainingName(trainingId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<java.lang.Object[]> getIntendedUserList(
		java.lang.String location, java.lang.String companyname) {
		return getService().getIntendedUserList(location, companyname);
	}

	public static java.util.List<java.lang.Object[]> getIntendedUserTrainingList(
		java.lang.String screenName) {
		return getService().getIntendedUserTrainingList(screenName);
	}

	public static java.util.List<java.lang.Object[]> getTrainingList() {
		return getService().getTrainingList();
	}

	public static java.util.List<java.lang.Object[]> getUsersData() {
		return getService().getUsersData();
	}

	/**
	* Returns a range of all the trainingcalendars.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendars
	* @param end the upper bound of the range of trainingcalendars (not inclusive)
	* @return the range of trainingcalendars
	*/
	public static java.util.List<com.chola.trainingcalendar.model.trainingcalendar> gettrainingcalendars(
		int start, int end) {
		return getService().gettrainingcalendars(start, end);
	}

	public static java.util.List<java.lang.Object[]> gettrainingresponses() {
		return getService().gettrainingresponses();
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

	public static trainingcalendarLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					trainingcalendarLocalService.class.getName());

			if (invokableLocalService instanceof trainingcalendarLocalService) {
				_service = (trainingcalendarLocalService)invokableLocalService;
			}
			else {
				_service = new trainingcalendarLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(trainingcalendarLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static trainingcalendarLocalService _service;
}