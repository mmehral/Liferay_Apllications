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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link contentupdateLocalService}.
 *
 * @author CloverLiferay02
 * @see contentupdateLocalService
 * @generated
 */
@ProviderType
public class contentupdateLocalServiceWrapper
	implements contentupdateLocalService,
		ServiceWrapper<contentupdateLocalService> {
	public contentupdateLocalServiceWrapper(
		contentupdateLocalService contentupdateLocalService) {
		_contentupdateLocalService = contentupdateLocalService;
	}

	@Override
	public boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId) {
		return _contentupdateLocalService.insertNotifyStts(syscode, val,
			sysname, stts, sttsflag, usernotifyId);
	}

	@Override
	public boolean insertPersonalisedParameters(java.lang.String businessId,
		java.lang.String[] values, java.lang.String gender,
		java.lang.String age, java.lang.String option, long uniqueContentId,
		java.lang.String lessthan_age, java.lang.String greaterthan_age,
		java.lang.String between_from_to_age,
		java.lang.Object[] notificationDetails, long notification_type) {
		return _contentupdateLocalService.insertPersonalisedParameters(businessId,
			values, gender, age, option, uniqueContentId, lessthan_age,
			greaterthan_age, between_from_to_age, notificationDetails,
			notification_type);
	}

	/**
	* Adds the contentupdate to the database. Also notifies the appropriate model listeners.
	*
	* @param contentupdate the contentupdate
	* @return the contentupdate that was added
	*/
	@Override
	public com.content.model.contentupdate addcontentupdate(
		com.content.model.contentupdate contentupdate) {
		return _contentupdateLocalService.addcontentupdate(contentupdate);
	}

	/**
	* Creates a new contentupdate with the primary key. Does not add the contentupdate to the database.
	*
	* @param id the primary key for the new contentupdate
	* @return the new contentupdate
	*/
	@Override
	public com.content.model.contentupdate createcontentupdate(long id) {
		return _contentupdateLocalService.createcontentupdate(id);
	}

	/**
	* Deletes the contentupdate from the database. Also notifies the appropriate model listeners.
	*
	* @param contentupdate the contentupdate
	* @return the contentupdate that was removed
	*/
	@Override
	public com.content.model.contentupdate deletecontentupdate(
		com.content.model.contentupdate contentupdate) {
		return _contentupdateLocalService.deletecontentupdate(contentupdate);
	}

	/**
	* Deletes the contentupdate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contentupdate
	* @return the contentupdate that was removed
	* @throws PortalException if a contentupdate with the primary key could not be found
	*/
	@Override
	public com.content.model.contentupdate deletecontentupdate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contentupdateLocalService.deletecontentupdate(id);
	}

	@Override
	public com.content.model.contentupdate fetchcontentupdate(long id) {
		return _contentupdateLocalService.fetchcontentupdate(id);
	}

	/**
	* Returns the contentupdate with the primary key.
	*
	* @param id the primary key of the contentupdate
	* @return the contentupdate
	* @throws PortalException if a contentupdate with the primary key could not be found
	*/
	@Override
	public com.content.model.contentupdate getcontentupdate(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contentupdateLocalService.getcontentupdate(id);
	}

	/**
	* Updates the contentupdate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contentupdate the contentupdate
	* @return the contentupdate that was updated
	*/
	@Override
	public com.content.model.contentupdate updatecontentupdate(
		com.content.model.contentupdate contentupdate) {
		return _contentupdateLocalService.updatecontentupdate(contentupdate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _contentupdateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contentupdateLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _contentupdateLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contentupdateLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contentupdateLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of contentupdates.
	*
	* @return the number of contentupdates
	*/
	@Override
	public int getcontentupdatesCount() {
		return _contentupdateLocalService.getcontentupdatesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _contentupdateLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _contentupdateLocalService.getOSGiServiceIdentifier();
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
		return _contentupdateLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _contentupdateLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _contentupdateLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option) {
		return _contentupdateLocalService.getAllUser(businessId, gender, age,
			option);
	}

	@Override
	public java.util.List<java.lang.String> getBranch(
		java.lang.String businessId) {
		return _contentupdateLocalService.getBranch(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getCompany() {
		return _contentupdateLocalService.getCompany();
	}

	@Override
	public java.util.List<java.lang.String> getDepart(
		java.lang.String businessId) {
		return _contentupdateLocalService.getDepart(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getDesignation(
		java.lang.String businessId) {
		return _contentupdateLocalService.getDesignation(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getFunction(
		java.lang.String businessId) {
		return _contentupdateLocalService.getFunction(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getGrade(
		java.lang.String businessId) {
		return _contentupdateLocalService.getGrade(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option) {
		return _contentupdateLocalService.getIntendedUser(businessId, values,
			gender, age, option);
	}

	@Override
	public java.util.List<java.lang.String> getLocation(
		java.lang.String businessId) {
		return _contentupdateLocalService.getLocation(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getProduct(
		java.lang.String businessId) {
		return _contentupdateLocalService.getProduct(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getRegion(
		java.lang.String businessId) {
		return _contentupdateLocalService.getRegion(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getUnit(java.lang.String businessId) {
		return _contentupdateLocalService.getUnit(businessId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getUsers() {
		return _contentupdateLocalService.getUsers();
	}

	@Override
	public java.util.List<java.lang.String> getZone(java.lang.String businessId) {
		return _contentupdateLocalService.getZone(businessId);
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
	@Override
	public java.util.List<com.content.model.contentupdate> getcontentupdates(
		int start, int end) {
		return _contentupdateLocalService.getcontentupdates(start, end);
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
		return _contentupdateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _contentupdateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public contentupdateLocalService getWrappedService() {
		return _contentupdateLocalService;
	}

	@Override
	public void setWrappedService(
		contentupdateLocalService contentupdateLocalService) {
		_contentupdateLocalService = contentupdateLocalService;
	}

	private contentupdateLocalService _contentupdateLocalService;
}