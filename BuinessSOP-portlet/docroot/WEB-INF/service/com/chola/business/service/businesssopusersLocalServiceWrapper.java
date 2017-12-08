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
 * Provides a wrapper for {@link businesssopusersLocalService}.
 *
 * @author adms.java1
 * @see businesssopusersLocalService
 * @generated
 */
@ProviderType
public class businesssopusersLocalServiceWrapper
	implements businesssopusersLocalService,
		ServiceWrapper<businesssopusersLocalService> {
	public businesssopusersLocalServiceWrapper(
		businesssopusersLocalService businesssopusersLocalService) {
		_businesssopusersLocalService = businesssopusersLocalService;
	}

	/**
	* Adds the businesssopusers to the database. Also notifies the appropriate model listeners.
	*
	* @param businesssopusers the businesssopusers
	* @return the businesssopusers that was added
	*/
	@Override
	public com.chola.business.model.businesssopusers addbusinesssopusers(
		com.chola.business.model.businesssopusers businesssopusers) {
		return _businesssopusersLocalService.addbusinesssopusers(businesssopusers);
	}

	/**
	* Creates a new businesssopusers with the primary key. Does not add the businesssopusers to the database.
	*
	* @param id the primary key for the new businesssopusers
	* @return the new businesssopusers
	*/
	@Override
	public com.chola.business.model.businesssopusers createbusinesssopusers(
		long id) {
		return _businesssopusersLocalService.createbusinesssopusers(id);
	}

	/**
	* Deletes the businesssopusers from the database. Also notifies the appropriate model listeners.
	*
	* @param businesssopusers the businesssopusers
	* @return the businesssopusers that was removed
	*/
	@Override
	public com.chola.business.model.businesssopusers deletebusinesssopusers(
		com.chola.business.model.businesssopusers businesssopusers) {
		return _businesssopusersLocalService.deletebusinesssopusers(businesssopusers);
	}

	/**
	* Deletes the businesssopusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssopusers
	* @return the businesssopusers that was removed
	* @throws PortalException if a businesssopusers with the primary key could not be found
	*/
	@Override
	public com.chola.business.model.businesssopusers deletebusinesssopusers(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssopusersLocalService.deletebusinesssopusers(id);
	}

	@Override
	public com.chola.business.model.businesssopusers fetchbusinesssopusers(
		long id) {
		return _businesssopusersLocalService.fetchbusinesssopusers(id);
	}

	/**
	* Returns the businesssopusers with the primary key.
	*
	* @param id the primary key of the businesssopusers
	* @return the businesssopusers
	* @throws PortalException if a businesssopusers with the primary key could not be found
	*/
	@Override
	public com.chola.business.model.businesssopusers getbusinesssopusers(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssopusersLocalService.getbusinesssopusers(id);
	}

	/**
	* Updates the businesssopusers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param businesssopusers the businesssopusers
	* @return the businesssopusers that was updated
	*/
	@Override
	public com.chola.business.model.businesssopusers updatebusinesssopusers(
		com.chola.business.model.businesssopusers businesssopusers) {
		return _businesssopusersLocalService.updatebusinesssopusers(businesssopusers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _businesssopusersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _businesssopusersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _businesssopusersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssopusersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssopusersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of businesssopuserses.
	*
	* @return the number of businesssopuserses
	*/
	@Override
	public int getbusinesssopusersesCount() {
		return _businesssopusersLocalService.getbusinesssopusersesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _businesssopusersLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _businesssopusersLocalService.getOSGiServiceIdentifier();
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
		return _businesssopusersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businesssopusersLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businesssopusersLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.business.model.businesssopusers> getSOPUsers(
		long user_id) {
		return _businesssopusersLocalService.getSOPUsers(user_id);
	}

	@Override
	public java.util.List<com.chola.business.model.businesssopusers> getSOPdocuments(
		long sopId) {
		return _businesssopusersLocalService.getSOPdocuments(sopId);
	}

	/**
	* Returns a range of all the businesssopuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @return the range of businesssopuserses
	*/
	@Override
	public java.util.List<com.chola.business.model.businesssopusers> getbusinesssopuserses(
		int start, int end) {
		return _businesssopusersLocalService.getbusinesssopuserses(start, end);
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
		return _businesssopusersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _businesssopusersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public businesssopusersLocalService getWrappedService() {
		return _businesssopusersLocalService;
	}

	@Override
	public void setWrappedService(
		businesssopusersLocalService businesssopusersLocalService) {
		_businesssopusersLocalService = businesssopusersLocalService;
	}

	private businesssopusersLocalService _businesssopusersLocalService;
}