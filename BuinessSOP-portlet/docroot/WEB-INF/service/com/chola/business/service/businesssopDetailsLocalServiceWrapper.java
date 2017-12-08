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

package com.chola.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link businesssopDetailsLocalService}.
 *
 * @author adms.java1
 * @see businesssopDetailsLocalService
 * @generated
 */
@ProviderType
public class businesssopDetailsLocalServiceWrapper
	implements businesssopDetailsLocalService,
		ServiceWrapper<businesssopDetailsLocalService> {
	public businesssopDetailsLocalServiceWrapper(
		businesssopDetailsLocalService businesssopDetailsLocalService) {
		_businesssopDetailsLocalService = businesssopDetailsLocalService;
	}

	@Override
	public boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId) {
		return _businesssopDetailsLocalService.insertNotifyStts(syscode, val,
			sysname, stts, sttsflag, usernotifyId);
	}

	/**
	* Adds the businesssop details to the database. Also notifies the appropriate model listeners.
	*
	* @param businesssopDetails the businesssop details
	* @return the businesssop details that was added
	*/
	@Override
	public com.chola.business.model.businesssopDetails addbusinesssopDetails(
		com.chola.business.model.businesssopDetails businesssopDetails) {
		return _businesssopDetailsLocalService.addbusinesssopDetails(businesssopDetails);
	}

	/**
	* Creates a new businesssop details with the primary key. Does not add the businesssop details to the database.
	*
	* @param id the primary key for the new businesssop details
	* @return the new businesssop details
	*/
	@Override
	public com.chola.business.model.businesssopDetails createbusinesssopDetails(
		long id) {
		return _businesssopDetailsLocalService.createbusinesssopDetails(id);
	}

	/**
	* Deletes the businesssop details from the database. Also notifies the appropriate model listeners.
	*
	* @param businesssopDetails the businesssop details
	* @return the businesssop details that was removed
	*/
	@Override
	public com.chola.business.model.businesssopDetails deletebusinesssopDetails(
		com.chola.business.model.businesssopDetails businesssopDetails) {
		return _businesssopDetailsLocalService.deletebusinesssopDetails(businesssopDetails);
	}

	/**
	* Deletes the businesssop details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details that was removed
	* @throws PortalException if a businesssop details with the primary key could not be found
	*/
	@Override
	public com.chola.business.model.businesssopDetails deletebusinesssopDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssopDetailsLocalService.deletebusinesssopDetails(id);
	}

	@Override
	public com.chola.business.model.businesssopDetails fetchbusinesssopDetails(
		long id) {
		return _businesssopDetailsLocalService.fetchbusinesssopDetails(id);
	}

	/**
	* Returns the businesssop details with the primary key.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details
	* @throws PortalException if a businesssop details with the primary key could not be found
	*/
	@Override
	public com.chola.business.model.businesssopDetails getbusinesssopDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssopDetailsLocalService.getbusinesssopDetails(id);
	}

	/**
	* Updates the businesssop details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param businesssopDetails the businesssop details
	* @return the businesssop details that was updated
	*/
	@Override
	public com.chola.business.model.businesssopDetails updatebusinesssopDetails(
		com.chola.business.model.businesssopDetails businesssopDetails) {
		return _businesssopDetailsLocalService.updatebusinesssopDetails(businesssopDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _businesssopDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _businesssopDetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _businesssopDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssopDetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssopDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of businesssop detailses.
	*
	* @return the number of businesssop detailses
	*/
	@Override
	public int getbusinesssopDetailsesCount() {
		return _businesssopDetailsLocalService.getbusinesssopDetailsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _businesssopDetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _businesssopDetailsLocalService.getOSGiServiceIdentifier();
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
		return _businesssopDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businesssopDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businesssopDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option) {
		return _businesssopDetailsLocalService.getAllUser(businessId, gender,
			age, option);
	}

	@Override
	public java.util.List<java.lang.String> getBranch(
		java.lang.String businessId) {
		return _businesssopDetailsLocalService.getBranch(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getCompany() {
		return _businesssopDetailsLocalService.getCompany();
	}

	@Override
	public java.util.List<java.lang.String> getDepart(
		java.lang.String businessId) {
		return _businesssopDetailsLocalService.getDepart(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getDesignation(
		java.lang.String businessId) {
		return _businesssopDetailsLocalService.getDesignation(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getFunction(
		java.lang.String businessId) {
		return _businesssopDetailsLocalService.getFunction(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getGrade(
		java.lang.String businessId) {
		return _businesssopDetailsLocalService.getGrade(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option) {
		return _businesssopDetailsLocalService.getIntendedUser(businessId,
			values, gender, age, option);
	}

	@Override
	public java.util.List<java.lang.String> getLocation(
		java.lang.String businessId) {
		return _businesssopDetailsLocalService.getLocation(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getProduct(
		java.lang.String businessId) {
		return _businesssopDetailsLocalService.getProduct(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getRegion(
		java.lang.String businessId) {
		return _businesssopDetailsLocalService.getRegion(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getUnit(java.lang.String businessId) {
		return _businesssopDetailsLocalService.getUnit(businessId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getUsers() {
		return _businesssopDetailsLocalService.getUsers();
	}

	@Override
	public java.util.List<java.lang.String> getZone(java.lang.String businessId) {
		return _businesssopDetailsLocalService.getZone(businessId);
	}

	/**
	* Returns a range of all the businesssop detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssop detailses
	* @param end the upper bound of the range of businesssop detailses (not inclusive)
	* @return the range of businesssop detailses
	*/
	@Override
	public java.util.List<com.chola.business.model.businesssopDetails> getbusinesssopDetailses(
		int start, int end) {
		return _businesssopDetailsLocalService.getbusinesssopDetailses(start,
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
		return _businesssopDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _businesssopDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public businesssopDetailsLocalService getWrappedService() {
		return _businesssopDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		businesssopDetailsLocalService businesssopDetailsLocalService) {
		_businesssopDetailsLocalService = businesssopDetailsLocalService;
	}

	private businesssopDetailsLocalService _businesssopDetailsLocalService;
}