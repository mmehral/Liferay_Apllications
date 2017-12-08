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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link trainingcalendarLocalService}.
 *
 * @author CloverLiferay01
 * @see trainingcalendarLocalService
 * @generated
 */
@ProviderType
public class trainingcalendarLocalServiceWrapper
	implements trainingcalendarLocalService,
		ServiceWrapper<trainingcalendarLocalService> {
	public trainingcalendarLocalServiceWrapper(
		trainingcalendarLocalService trainingcalendarLocalService) {
		_trainingcalendarLocalService = trainingcalendarLocalService;
	}

	@Override
	public boolean addAcceptRejectResponse(int trainingId,
		java.lang.String screenName, long contentId, int statusFlag) {
		return _trainingcalendarLocalService.addAcceptRejectResponse(trainingId,
			screenName, contentId, statusFlag);
	}

	@Override
	public boolean deletAllTrainings() {
		return _trainingcalendarLocalService.deletAllTrainings();
	}

	@Override
	public boolean getExistingintendedUserTrainingList(long trainingId,
		java.lang.String userId, java.lang.String screenName) {
		return _trainingcalendarLocalService.getExistingintendedUserTrainingList(trainingId,
			userId, screenName);
	}

	@Override
	public boolean insertIntoTrainingPPContentStore(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		long notification_type) {
		return _trainingcalendarLocalService.insertIntoTrainingPPContentStore(businessId,
			values, gender, age, option, uniqueContentId, lessthan_age,
			greaterthan_age, between_from_to_age, notification_type);
	}

	@Override
	public boolean updateFlag(int trainingId, java.lang.String screenName,
		int statusFlag) {
		return _trainingcalendarLocalService.updateFlag(trainingId, screenName,
			statusFlag);
	}

	/**
	* Adds the trainingcalendar to the database. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendar the trainingcalendar
	* @return the trainingcalendar that was added
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendar addtrainingcalendar(
		com.chola.trainingcalendar.model.trainingcalendar trainingcalendar) {
		return _trainingcalendarLocalService.addtrainingcalendar(trainingcalendar);
	}

	/**
	* Creates a new trainingcalendar with the primary key. Does not add the trainingcalendar to the database.
	*
	* @param trainingid the primary key for the new trainingcalendar
	* @return the new trainingcalendar
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendar createtrainingcalendar(
		long trainingid) {
		return _trainingcalendarLocalService.createtrainingcalendar(trainingid);
	}

	/**
	* Deletes the trainingcalendar from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendar the trainingcalendar
	* @return the trainingcalendar that was removed
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendar deletetrainingcalendar(
		com.chola.trainingcalendar.model.trainingcalendar trainingcalendar) {
		return _trainingcalendarLocalService.deletetrainingcalendar(trainingcalendar);
	}

	/**
	* Deletes the trainingcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar that was removed
	* @throws PortalException if a trainingcalendar with the primary key could not be found
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendar deletetrainingcalendar(
		long trainingid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingcalendarLocalService.deletetrainingcalendar(trainingid);
	}

	@Override
	public com.chola.trainingcalendar.model.trainingcalendar fetchtrainingcalendar(
		long trainingid) {
		return _trainingcalendarLocalService.fetchtrainingcalendar(trainingid);
	}

	/**
	* Returns the trainingcalendar with the primary key.
	*
	* @param trainingid the primary key of the trainingcalendar
	* @return the trainingcalendar
	* @throws PortalException if a trainingcalendar with the primary key could not be found
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendar gettrainingcalendar(
		long trainingid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingcalendarLocalService.gettrainingcalendar(trainingid);
	}

	/**
	* Updates the trainingcalendar in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendar the trainingcalendar
	* @return the trainingcalendar that was updated
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendar updatetrainingcalendar(
		com.chola.trainingcalendar.model.trainingcalendar trainingcalendar) {
		return _trainingcalendarLocalService.updatetrainingcalendar(trainingcalendar);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _trainingcalendarLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _trainingcalendarLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _trainingcalendarLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingcalendarLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingcalendarLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of trainingcalendars.
	*
	* @return the number of trainingcalendars
	*/
	@Override
	public int gettrainingcalendarsCount() {
		return _trainingcalendarLocalService.gettrainingcalendarsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _trainingcalendarLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.lang.Object[] getIntendedUserTrainingRecordList(long id) {
		return _trainingcalendarLocalService.getIntendedUserTrainingRecordList(id);
	}

	@Override
	public java.lang.String getBusinessNames(java.lang.String businessID) {
		return _trainingcalendarLocalService.getBusinessNames(businessID);
	}

	@Override
	public java.lang.String getEmpIdFromUID(java.lang.String uid) {
		return _trainingcalendarLocalService.getEmpIdFromUID(uid);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _trainingcalendarLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String getTrainingName(java.lang.String trainingId) {
		return _trainingcalendarLocalService.getTrainingName(trainingId);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _trainingcalendarLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _trainingcalendarLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _trainingcalendarLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeAll(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeAll(notificationType,
			gender, businessName, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeBranch(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String branch,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeBranch(notificationType,
			gender, businessName, branch, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDepartment(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String department,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeDepartment(notificationType,
			gender, businessName, department, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDesignation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String designation,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeDesignation(notificationType,
			gender, businessName, designation, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeFunction(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String function,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeFunction(notificationType,
			gender, businessName, function, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeGrade(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String grade,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeGrade(notificationType,
			gender, businessName, grade, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeLocation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String location,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeLocation(notificationType,
			gender, businessName, location, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeProduct(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String product,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeProduct(notificationType,
			gender, businessName, product, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeRegion(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String region,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeRegion(notificationType,
			gender, businessName, region, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUnit(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String unit,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeUnit(notificationType,
			gender, businessName, unit, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUserId(
		long notificationType, java.lang.String businessName,
		java.lang.String userId) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeUserId(notificationType,
			businessName, userId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeZone(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String zone,
		java.lang.String age) {
		return _trainingcalendarLocalService.getContentBasedOnNotificationTypeZone(notificationType,
			gender, businessName, zone, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getIntendedUserList(
		java.lang.String location, java.lang.String companyname) {
		return _trainingcalendarLocalService.getIntendedUserList(location,
			companyname);
	}

	@Override
	public java.util.List<java.lang.Object[]> getIntendedUserTrainingList(
		java.lang.String screenName) {
		return _trainingcalendarLocalService.getIntendedUserTrainingList(screenName);
	}

	@Override
	public java.util.List<java.lang.Object[]> getTrainingList() {
		return _trainingcalendarLocalService.getTrainingList();
	}

	@Override
	public java.util.List<java.lang.Object[]> getUsersData() {
		return _trainingcalendarLocalService.getUsersData();
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
	@Override
	public java.util.List<com.chola.trainingcalendar.model.trainingcalendar> gettrainingcalendars(
		int start, int end) {
		return _trainingcalendarLocalService.gettrainingcalendars(start, end);
	}

	@Override
	public java.util.List<java.lang.Object[]> gettrainingresponses() {
		return _trainingcalendarLocalService.gettrainingresponses();
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _trainingcalendarLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _trainingcalendarLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public trainingcalendarLocalService getWrappedService() {
		return _trainingcalendarLocalService;
	}

	@Override
	public void setWrappedService(
		trainingcalendarLocalService trainingcalendarLocalService) {
		_trainingcalendarLocalService = trainingcalendarLocalService;
	}

	private trainingcalendarLocalService _trainingcalendarLocalService;
}