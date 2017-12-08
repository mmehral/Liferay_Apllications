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

package com.chola.calendar.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link corporateeventsdataLocalService}.
 *
 * @author adms.java1
 * @see corporateeventsdataLocalService
 * @generated
 */
@ProviderType
public class corporateeventsdataLocalServiceWrapper
	implements corporateeventsdataLocalService,
		ServiceWrapper<corporateeventsdataLocalService> {
	public corporateeventsdataLocalServiceWrapper(
		corporateeventsdataLocalService corporateeventsdataLocalService) {
		_corporateeventsdataLocalService = corporateeventsdataLocalService;
	}

	@Override
	public boolean deletCorporateEvents() {
		return _corporateeventsdataLocalService.deletCorporateEvents();
	}

	@Override
	public boolean insertIntoCorporatePPContentStore(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		long notification_type) {
		return _corporateeventsdataLocalService.insertIntoCorporatePPContentStore(businessId,
			values, gender, age, option, uniqueContentId, lessthan_age,
			greaterthan_age, between_from_to_age, notification_type);
	}

	/**
	* Adds the corporateeventsdata to the database. Also notifies the appropriate model listeners.
	*
	* @param corporateeventsdata the corporateeventsdata
	* @return the corporateeventsdata that was added
	*/
	@Override
	public com.chola.calendar.model.corporateeventsdata addcorporateeventsdata(
		com.chola.calendar.model.corporateeventsdata corporateeventsdata) {
		return _corporateeventsdataLocalService.addcorporateeventsdata(corporateeventsdata);
	}

	/**
	* Creates a new corporateeventsdata with the primary key. Does not add the corporateeventsdata to the database.
	*
	* @param id the primary key for the new corporateeventsdata
	* @return the new corporateeventsdata
	*/
	@Override
	public com.chola.calendar.model.corporateeventsdata createcorporateeventsdata(
		long id) {
		return _corporateeventsdataLocalService.createcorporateeventsdata(id);
	}

	/**
	* Deletes the corporateeventsdata from the database. Also notifies the appropriate model listeners.
	*
	* @param corporateeventsdata the corporateeventsdata
	* @return the corporateeventsdata that was removed
	*/
	@Override
	public com.chola.calendar.model.corporateeventsdata deletecorporateeventsdata(
		com.chola.calendar.model.corporateeventsdata corporateeventsdata) {
		return _corporateeventsdataLocalService.deletecorporateeventsdata(corporateeventsdata);
	}

	/**
	* Deletes the corporateeventsdata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata that was removed
	* @throws PortalException if a corporateeventsdata with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.corporateeventsdata deletecorporateeventsdata(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _corporateeventsdataLocalService.deletecorporateeventsdata(id);
	}

	@Override
	public com.chola.calendar.model.corporateeventsdata fetchcorporateeventsdata(
		long id) {
		return _corporateeventsdataLocalService.fetchcorporateeventsdata(id);
	}

	/**
	* Returns the corporateeventsdata with the primary key.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata
	* @throws PortalException if a corporateeventsdata with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.corporateeventsdata getcorporateeventsdata(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _corporateeventsdataLocalService.getcorporateeventsdata(id);
	}

	/**
	* Updates the corporateeventsdata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param corporateeventsdata the corporateeventsdata
	* @return the corporateeventsdata that was updated
	*/
	@Override
	public com.chola.calendar.model.corporateeventsdata updatecorporateeventsdata(
		com.chola.calendar.model.corporateeventsdata corporateeventsdata) {
		return _corporateeventsdataLocalService.updatecorporateeventsdata(corporateeventsdata);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _corporateeventsdataLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _corporateeventsdataLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _corporateeventsdataLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _corporateeventsdataLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _corporateeventsdataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of corporateeventsdatas.
	*
	* @return the number of corporateeventsdatas
	*/
	@Override
	public int getcorporateeventsdatasCount() {
		return _corporateeventsdataLocalService.getcorporateeventsdatasCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _corporateeventsdataLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.lang.Object[] getIntendedUserCorporateEventRecordList(long id) {
		return _corporateeventsdataLocalService.getIntendedUserCorporateEventRecordList(id);
	}

	@Override
	public java.lang.String getBusinessNames(java.lang.String businessID) {
		return _corporateeventsdataLocalService.getBusinessNames(businessID);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _corporateeventsdataLocalService.getOSGiServiceIdentifier();
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
		return _corporateeventsdataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporateeventsdataLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporateeventsdataLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeAll(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeAll(notificationType,
			gender, businessName, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeBranch(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String branch,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeBranch(notificationType,
			gender, businessName, branch, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDepartment(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String department,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeDepartment(notificationType,
			gender, businessName, department, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDesignation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String designation,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeDesignation(notificationType,
			gender, businessName, designation, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeFunction(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String function,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeFunction(notificationType,
			gender, businessName, function, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeGrade(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String grade,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeGrade(notificationType,
			gender, businessName, grade, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeLocation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String location,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeLocation(notificationType,
			gender, businessName, location, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeProduct(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String product,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeProduct(notificationType,
			gender, businessName, product, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeRegion(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String region,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeRegion(notificationType,
			gender, businessName, region, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUnit(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String unit,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeUnit(notificationType,
			gender, businessName, unit, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUserId(
		long notificationType, java.lang.String businessName,
		java.lang.String userId) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeUserId(notificationType,
			businessName, userId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeZone(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String zone,
		java.lang.String age) {
		return _corporateeventsdataLocalService.getContentBasedOnNotificationTypeZone(notificationType,
			gender, businessName, zone, age);
	}

	@Override
	public java.util.List<java.lang.Object[]> getCorporateEventsList() {
		return _corporateeventsdataLocalService.getCorporateEventsList();
	}

	/**
	* Returns a range of all the corporateeventsdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporateeventsdatas
	* @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	* @return the range of corporateeventsdatas
	*/
	@Override
	public java.util.List<com.chola.calendar.model.corporateeventsdata> getcorporateeventsdatas(
		int start, int end) {
		return _corporateeventsdataLocalService.getcorporateeventsdatas(start,
			end);
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
		return _corporateeventsdataLocalService.dynamicQueryCount(dynamicQuery);
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
		return _corporateeventsdataLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public corporateeventsdataLocalService getWrappedService() {
		return _corporateeventsdataLocalService;
	}

	@Override
	public void setWrappedService(
		corporateeventsdataLocalService corporateeventsdataLocalService) {
		_corporateeventsdataLocalService = corporateeventsdataLocalService;
	}

	private corporateeventsdataLocalService _corporateeventsdataLocalService;
}