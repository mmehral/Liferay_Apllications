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
 * Provides a wrapper for {@link businesssoppathLocalService}.
 *
 * @author adms.java1
 * @see businesssoppathLocalService
 * @generated
 */
@ProviderType
public class businesssoppathLocalServiceWrapper
	implements businesssoppathLocalService,
		ServiceWrapper<businesssoppathLocalService> {
	public businesssoppathLocalServiceWrapper(
		businesssoppathLocalService businesssoppathLocalService) {
		_businesssoppathLocalService = businesssoppathLocalService;
	}

	/**
	* Adds the businesssoppath to the database. Also notifies the appropriate model listeners.
	*
	* @param businesssoppath the businesssoppath
	* @return the businesssoppath that was added
	*/
	@Override
	public com.chola.business.model.businesssoppath addbusinesssoppath(
		com.chola.business.model.businesssoppath businesssoppath) {
		return _businesssoppathLocalService.addbusinesssoppath(businesssoppath);
	}

	/**
	* Creates a new businesssoppath with the primary key. Does not add the businesssoppath to the database.
	*
	* @param id the primary key for the new businesssoppath
	* @return the new businesssoppath
	*/
	@Override
	public com.chola.business.model.businesssoppath createbusinesssoppath(
		long id) {
		return _businesssoppathLocalService.createbusinesssoppath(id);
	}

	/**
	* Deletes the businesssoppath from the database. Also notifies the appropriate model listeners.
	*
	* @param businesssoppath the businesssoppath
	* @return the businesssoppath that was removed
	*/
	@Override
	public com.chola.business.model.businesssoppath deletebusinesssoppath(
		com.chola.business.model.businesssoppath businesssoppath) {
		return _businesssoppathLocalService.deletebusinesssoppath(businesssoppath);
	}

	/**
	* Deletes the businesssoppath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssoppath
	* @return the businesssoppath that was removed
	* @throws PortalException if a businesssoppath with the primary key could not be found
	*/
	@Override
	public com.chola.business.model.businesssoppath deletebusinesssoppath(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssoppathLocalService.deletebusinesssoppath(id);
	}

	@Override
	public com.chola.business.model.businesssoppath fetchbusinesssoppath(
		long id) {
		return _businesssoppathLocalService.fetchbusinesssoppath(id);
	}

	/**
	* Returns the businesssoppath with the primary key.
	*
	* @param id the primary key of the businesssoppath
	* @return the businesssoppath
	* @throws PortalException if a businesssoppath with the primary key could not be found
	*/
	@Override
	public com.chola.business.model.businesssoppath getbusinesssoppath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssoppathLocalService.getbusinesssoppath(id);
	}

	/**
	* Updates the businesssoppath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param businesssoppath the businesssoppath
	* @return the businesssoppath that was updated
	*/
	@Override
	public com.chola.business.model.businesssoppath updatebusinesssoppath(
		com.chola.business.model.businesssoppath businesssoppath) {
		return _businesssoppathLocalService.updatebusinesssoppath(businesssoppath);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _businesssoppathLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _businesssoppathLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _businesssoppathLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssoppathLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businesssoppathLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of businesssoppaths.
	*
	* @return the number of businesssoppaths
	*/
	@Override
	public int getbusinesssoppathsCount() {
		return _businesssoppathLocalService.getbusinesssoppathsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _businesssoppathLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _businesssoppathLocalService.getOSGiServiceIdentifier();
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
		return _businesssoppathLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businesssoppathLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businesssoppathLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.business.model.businesssoppath> getSOPdocuments(
		long sopId) {
		return _businesssoppathLocalService.getSOPdocuments(sopId);
	}

	/**
	* Returns a range of all the businesssoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @return the range of businesssoppaths
	*/
	@Override
	public java.util.List<com.chola.business.model.businesssoppath> getbusinesssoppaths(
		int start, int end) {
		return _businesssoppathLocalService.getbusinesssoppaths(start, end);
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
		return _businesssoppathLocalService.dynamicQueryCount(dynamicQuery);
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
		return _businesssoppathLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public businesssoppathLocalService getWrappedService() {
		return _businesssoppathLocalService;
	}

	@Override
	public void setWrappedService(
		businesssoppathLocalService businesssoppathLocalService) {
		_businesssoppathLocalService = businesssoppathLocalService;
	}

	private businesssoppathLocalService _businesssoppathLocalService;
}