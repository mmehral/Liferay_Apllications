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

package com.chola.notificationchannel.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NoticationCategoryCountLocalService}.
 *
 * @author cloverliferay01
 * @see NoticationCategoryCountLocalService
 * @generated
 */
@ProviderType
public class NoticationCategoryCountLocalServiceWrapper
	implements NoticationCategoryCountLocalService,
		ServiceWrapper<NoticationCategoryCountLocalService> {
	public NoticationCategoryCountLocalServiceWrapper(
		NoticationCategoryCountLocalService noticationCategoryCountLocalService) {
		_noticationCategoryCountLocalService = noticationCategoryCountLocalService;
	}

	@Override
	public boolean insertIntoCholaUsernotification(long userId, long contentId,
		int readflag) {
		return _noticationCategoryCountLocalService.insertIntoCholaUsernotification(userId,
			contentId, readflag);
	}

	@Override
	public boolean updatenotificationstatus(int status, long userId,
		long eventId, long contentId, long tableUserId) {
		return _noticationCategoryCountLocalService.updatenotificationstatus(status,
			userId, eventId, contentId, tableUserId);
	}

	/**
	* Adds the notication category count to the database. Also notifies the appropriate model listeners.
	*
	* @param noticationCategoryCount the notication category count
	* @return the notication category count that was added
	*/
	@Override
	public com.chola.notificationchannel.model.NoticationCategoryCount addNoticationCategoryCount(
		com.chola.notificationchannel.model.NoticationCategoryCount noticationCategoryCount) {
		return _noticationCategoryCountLocalService.addNoticationCategoryCount(noticationCategoryCount);
	}

	/**
	* Creates a new notication category count with the primary key. Does not add the notication category count to the database.
	*
	* @param eventId the primary key for the new notication category count
	* @return the new notication category count
	*/
	@Override
	public com.chola.notificationchannel.model.NoticationCategoryCount createNoticationCategoryCount(
		long eventId) {
		return _noticationCategoryCountLocalService.createNoticationCategoryCount(eventId);
	}

	/**
	* Deletes the notication category count from the database. Also notifies the appropriate model listeners.
	*
	* @param noticationCategoryCount the notication category count
	* @return the notication category count that was removed
	*/
	@Override
	public com.chola.notificationchannel.model.NoticationCategoryCount deleteNoticationCategoryCount(
		com.chola.notificationchannel.model.NoticationCategoryCount noticationCategoryCount) {
		return _noticationCategoryCountLocalService.deleteNoticationCategoryCount(noticationCategoryCount);
	}

	/**
	* Deletes the notication category count with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count that was removed
	* @throws PortalException if a notication category count with the primary key could not be found
	*/
	@Override
	public com.chola.notificationchannel.model.NoticationCategoryCount deleteNoticationCategoryCount(
		long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noticationCategoryCountLocalService.deleteNoticationCategoryCount(eventId);
	}

	@Override
	public com.chola.notificationchannel.model.NoticationCategoryCount fetchNoticationCategoryCount(
		long eventId) {
		return _noticationCategoryCountLocalService.fetchNoticationCategoryCount(eventId);
	}

	/**
	* Returns the notication category count with the primary key.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count
	* @throws PortalException if a notication category count with the primary key could not be found
	*/
	@Override
	public com.chola.notificationchannel.model.NoticationCategoryCount getNoticationCategoryCount(
		long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noticationCategoryCountLocalService.getNoticationCategoryCount(eventId);
	}

	/**
	* Updates the notication category count in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param noticationCategoryCount the notication category count
	* @return the notication category count that was updated
	*/
	@Override
	public com.chola.notificationchannel.model.NoticationCategoryCount updateNoticationCategoryCount(
		com.chola.notificationchannel.model.NoticationCategoryCount noticationCategoryCount) {
		return _noticationCategoryCountLocalService.updateNoticationCategoryCount(noticationCategoryCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _noticationCategoryCountLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _noticationCategoryCountLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _noticationCategoryCountLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noticationCategoryCountLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noticationCategoryCountLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of notication category counts.
	*
	* @return the number of notication category counts
	*/
	@Override
	public int getNoticationCategoryCountsCount() {
		return _noticationCategoryCountLocalService.getNoticationCategoryCountsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _noticationCategoryCountLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.lang.String getEmpIdFromUID(java.lang.String uid) {
		return _noticationCategoryCountLocalService.getEmpIdFromUID(uid);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _noticationCategoryCountLocalService.getOSGiServiceIdentifier();
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
		return _noticationCategoryCountLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.notificationchannel.model.impl.NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _noticationCategoryCountLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.notificationchannel.model.impl.NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _noticationCategoryCountLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.Object[]> getActiveEmployeeInfoFromTable(
		java.lang.String empId) {
		return _noticationCategoryCountLocalService.getActiveEmployeeInfoFromTable(empId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeAll(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeAll(notificationType,
			gender, businessName, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeBranch(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String branch,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeBranch(notificationType,
			gender, businessName, branch, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDepartment(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String department,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeDepartment(notificationType,
			gender, businessName, department, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDesignation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String designation,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeDesignation(notificationType,
			gender, businessName, designation, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeFunction(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String function,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeFunction(notificationType,
			gender, businessName, function, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeGrade(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String grade,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeGrade(notificationType,
			gender, businessName, grade, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeLocation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String location,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeLocation(notificationType,
			gender, businessName, location, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeProduct(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String product,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeProduct(notificationType,
			gender, businessName, product, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeRegion(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String region,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeRegion(notificationType,
			gender, businessName, region, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUnit(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String unit,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeUnit(notificationType,
			gender, businessName, unit, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUserId(
		long notificationType, java.lang.String businessName,
		java.lang.String userId) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeUserId(notificationType,
			businessName, userId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeZone(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String zone,
		java.lang.String age) {
		return _noticationCategoryCountLocalService.getContentBasedOnNotificationTypeZone(notificationType,
			gender, businessName, zone, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getNotficationCategoryCount(
		long userid) {
		return _noticationCategoryCountLocalService.getNotficationCategoryCount(userid);
	}

	@Override
	public java.util.List<java.lang.Object[]> getNotficationCategoryList(
		long userid, java.lang.String sysval) {
		return _noticationCategoryCountLocalService.getNotficationCategoryList(userid,
			sysval);
	}

	/**
	* Returns a range of all the notication category counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.notificationchannel.model.impl.NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notication category counts
	* @param end the upper bound of the range of notication category counts (not inclusive)
	* @return the range of notication category counts
	*/
	@Override
	public java.util.List<com.chola.notificationchannel.model.NoticationCategoryCount> getNoticationCategoryCounts(
		int start, int end) {
		return _noticationCategoryCountLocalService.getNoticationCategoryCounts(start,
			end);
	}

	@Override
	public java.util.List<java.lang.Object[]> getPeoplePowerNotificationDetails(
		java.lang.String empId) {
		return _noticationCategoryCountLocalService.getPeoplePowerNotificationDetails(empId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getQtracNotificationDetails(
		java.lang.String empId) {
		return _noticationCategoryCountLocalService.getQtracNotificationDetails(empId);
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
		return _noticationCategoryCountLocalService.dynamicQueryCount(dynamicQuery);
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
		return _noticationCategoryCountLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public NoticationCategoryCountLocalService getWrappedService() {
		return _noticationCategoryCountLocalService;
	}

	@Override
	public void setWrappedService(
		NoticationCategoryCountLocalService noticationCategoryCountLocalService) {
		_noticationCategoryCountLocalService = noticationCategoryCountLocalService;
	}

	private NoticationCategoryCountLocalService _noticationCategoryCountLocalService;
}