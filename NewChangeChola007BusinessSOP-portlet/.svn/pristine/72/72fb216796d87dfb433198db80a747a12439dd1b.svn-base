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

package com.chola.personalisedparameters.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link bsopdetailsLocalService}.
 *
 * @author cloverliferay01
 * @see bsopdetailsLocalService
 * @generated
 */
@ProviderType
public class bsopdetailsLocalServiceWrapper implements bsopdetailsLocalService,
	ServiceWrapper<bsopdetailsLocalService> {
	public bsopdetailsLocalServiceWrapper(
		bsopdetailsLocalService bsopdetailsLocalService) {
		_bsopdetailsLocalService = bsopdetailsLocalService;
	}

	@Override
	public boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId) {
		return _bsopdetailsLocalService.insertNotifyStts(syscode, val, sysname,
			stts, sttsflag, usernotifyId);
	}

	@Override
	public boolean insertPersonalisedParameters(java.lang.String businessId,
		java.lang.String[] values, java.lang.String gender,
		java.lang.String age, java.lang.String option, long uniqueContentId,
		java.lang.String lessthan_age, java.lang.String greaterthan_age,
		java.lang.String between_from_to_age,
		java.lang.Object[] notificationDetails, long notification_type) {
		return _bsopdetailsLocalService.insertPersonalisedParameters(businessId,
			values, gender, age, option, uniqueContentId, lessthan_age,
			greaterthan_age, between_from_to_age, notificationDetails,
			notification_type);
	}

	/**
	* Adds the bsopdetails to the database. Also notifies the appropriate model listeners.
	*
	* @param bsopdetails the bsopdetails
	* @return the bsopdetails that was added
	*/
	@Override
	public com.chola.personalisedparameters.model.bsopdetails addbsopdetails(
		com.chola.personalisedparameters.model.bsopdetails bsopdetails) {
		return _bsopdetailsLocalService.addbsopdetails(bsopdetails);
	}

	/**
	* Creates a new bsopdetails with the primary key. Does not add the bsopdetails to the database.
	*
	* @param id the primary key for the new bsopdetails
	* @return the new bsopdetails
	*/
	@Override
	public com.chola.personalisedparameters.model.bsopdetails createbsopdetails(
		long id) {
		return _bsopdetailsLocalService.createbsopdetails(id);
	}

	/**
	* Deletes the bsopdetails from the database. Also notifies the appropriate model listeners.
	*
	* @param bsopdetails the bsopdetails
	* @return the bsopdetails that was removed
	*/
	@Override
	public com.chola.personalisedparameters.model.bsopdetails deletebsopdetails(
		com.chola.personalisedparameters.model.bsopdetails bsopdetails) {
		return _bsopdetailsLocalService.deletebsopdetails(bsopdetails);
	}

	/**
	* Deletes the bsopdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bsopdetails
	* @return the bsopdetails that was removed
	* @throws PortalException if a bsopdetails with the primary key could not be found
	*/
	@Override
	public com.chola.personalisedparameters.model.bsopdetails deletebsopdetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _bsopdetailsLocalService.deletebsopdetails(id);
	}

	@Override
	public com.chola.personalisedparameters.model.bsopdetails fetchbsopdetails(
		long id) {
		return _bsopdetailsLocalService.fetchbsopdetails(id);
	}

	/**
	* Returns the bsopdetails with the primary key.
	*
	* @param id the primary key of the bsopdetails
	* @return the bsopdetails
	* @throws PortalException if a bsopdetails with the primary key could not be found
	*/
	@Override
	public com.chola.personalisedparameters.model.bsopdetails getbsopdetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _bsopdetailsLocalService.getbsopdetails(id);
	}

	/**
	* Updates the bsopdetails in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bsopdetails the bsopdetails
	* @return the bsopdetails that was updated
	*/
	@Override
	public com.chola.personalisedparameters.model.bsopdetails updatebsopdetails(
		com.chola.personalisedparameters.model.bsopdetails bsopdetails) {
		return _bsopdetailsLocalService.updatebsopdetails(bsopdetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bsopdetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bsopdetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bsopdetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bsopdetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bsopdetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of bsopdetailses.
	*
	* @return the number of bsopdetailses
	*/
	@Override
	public int getbsopdetailsesCount() {
		return _bsopdetailsLocalService.getbsopdetailsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bsopdetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bsopdetailsLocalService.getOSGiServiceIdentifier();
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
		return _bsopdetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.personalisedparameters.model.impl.bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bsopdetailsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.personalisedparameters.model.impl.bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bsopdetailsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option) {
		return _bsopdetailsLocalService.getAllUser(businessId, gender, age,
			option);
	}

	@Override
	public java.util.List<java.lang.String> getBranch(
		java.lang.String businessId) {
		return _bsopdetailsLocalService.getBranch(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getCompany() {
		return _bsopdetailsLocalService.getCompany();
	}

	@Override
	public java.util.List<java.lang.String> getDepart(
		java.lang.String businessId) {
		return _bsopdetailsLocalService.getDepart(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getDesignation(
		java.lang.String businessId) {
		return _bsopdetailsLocalService.getDesignation(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getFunction(
		java.lang.String businessId) {
		return _bsopdetailsLocalService.getFunction(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getGrade(
		java.lang.String businessId) {
		return _bsopdetailsLocalService.getGrade(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option) {
		return _bsopdetailsLocalService.getIntendedUser(businessId, values,
			gender, age, option);
	}

	@Override
	public java.util.List<java.lang.String> getLocation(
		java.lang.String businessId) {
		return _bsopdetailsLocalService.getLocation(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getProduct(
		java.lang.String businessId) {
		return _bsopdetailsLocalService.getProduct(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getRegion(
		java.lang.String businessId) {
		return _bsopdetailsLocalService.getRegion(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getUnit(java.lang.String businessId) {
		return _bsopdetailsLocalService.getUnit(businessId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getUsers() {
		return _bsopdetailsLocalService.getUsers();
	}

	@Override
	public java.util.List<java.lang.String> getZone(java.lang.String businessId) {
		return _bsopdetailsLocalService.getZone(businessId);
	}

	/**
	* Returns a range of all the bsopdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.personalisedparameters.model.impl.bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @return the range of bsopdetailses
	*/
	@Override
	public java.util.List<com.chola.personalisedparameters.model.bsopdetails> getbsopdetailses(
		int start, int end) {
		return _bsopdetailsLocalService.getbsopdetailses(start, end);
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
		return _bsopdetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bsopdetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public bsopdetailsLocalService getWrappedService() {
		return _bsopdetailsLocalService;
	}

	@Override
	public void setWrappedService(
		bsopdetailsLocalService bsopdetailsLocalService) {
		_bsopdetailsLocalService = bsopdetailsLocalService;
	}

	private bsopdetailsLocalService _bsopdetailsLocalService;
}