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

package com.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link cholatalkiespathLocalService}.
 *
 * @author adms.java1
 * @see cholatalkiespathLocalService
 * @generated
 */
@ProviderType
public class cholatalkiespathLocalServiceWrapper
	implements cholatalkiespathLocalService,
		ServiceWrapper<cholatalkiespathLocalService> {
	public cholatalkiespathLocalServiceWrapper(
		cholatalkiespathLocalService cholatalkiespathLocalService) {
		_cholatalkiespathLocalService = cholatalkiespathLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cholatalkiespathLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cholatalkiespathLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cholatalkiespathLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholatalkiespathLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholatalkiespathLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the cholatalkiespath to the database. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiespath the cholatalkiespath
	* @return the cholatalkiespath that was added
	*/
	@Override
	public com.model.cholatalkiespath addcholatalkiespath(
		com.model.cholatalkiespath cholatalkiespath) {
		return _cholatalkiespathLocalService.addcholatalkiespath(cholatalkiespath);
	}

	/**
	* Creates a new cholatalkiespath with the primary key. Does not add the cholatalkiespath to the database.
	*
	* @param id the primary key for the new cholatalkiespath
	* @return the new cholatalkiespath
	*/
	@Override
	public com.model.cholatalkiespath createcholatalkiespath(long id) {
		return _cholatalkiespathLocalService.createcholatalkiespath(id);
	}

	/**
	* Deletes the cholatalkiespath from the database. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiespath the cholatalkiespath
	* @return the cholatalkiespath that was removed
	*/
	@Override
	public com.model.cholatalkiespath deletecholatalkiespath(
		com.model.cholatalkiespath cholatalkiespath) {
		return _cholatalkiespathLocalService.deletecholatalkiespath(cholatalkiespath);
	}

	/**
	* Deletes the cholatalkiespath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholatalkiespath
	* @return the cholatalkiespath that was removed
	* @throws PortalException if a cholatalkiespath with the primary key could not be found
	*/
	@Override
	public com.model.cholatalkiespath deletecholatalkiespath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholatalkiespathLocalService.deletecholatalkiespath(id);
	}

	@Override
	public com.model.cholatalkiespath fetchcholatalkiespath(long id) {
		return _cholatalkiespathLocalService.fetchcholatalkiespath(id);
	}

	/**
	* Returns the cholatalkiespath with the primary key.
	*
	* @param id the primary key of the cholatalkiespath
	* @return the cholatalkiespath
	* @throws PortalException if a cholatalkiespath with the primary key could not be found
	*/
	@Override
	public com.model.cholatalkiespath getcholatalkiespath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholatalkiespathLocalService.getcholatalkiespath(id);
	}

	/**
	* Updates the cholatalkiespath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiespath the cholatalkiespath
	* @return the cholatalkiespath that was updated
	*/
	@Override
	public com.model.cholatalkiespath updatecholatalkiespath(
		com.model.cholatalkiespath cholatalkiespath) {
		return _cholatalkiespathLocalService.updatecholatalkiespath(cholatalkiespath);
	}

	/**
	* Returns the number of cholatalkiespaths.
	*
	* @return the number of cholatalkiespaths
	*/
	@Override
	public int getcholatalkiespathsCount() {
		return _cholatalkiespathLocalService.getcholatalkiespathsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cholatalkiespathLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cholatalkiespathLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.model.cholatalkiespath> cholaTalkiesVideoDetails(
		long contentId) {
		return _cholatalkiespathLocalService.cholaTalkiesVideoDetails(contentId);
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
		return _cholatalkiespathLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cholatalkiespathLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cholatalkiespathLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the cholatalkiespaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @return the range of cholatalkiespaths
	*/
	@Override
	public java.util.List<com.model.cholatalkiespath> getcholatalkiespaths(
		int start, int end) {
		return _cholatalkiespathLocalService.getcholatalkiespaths(start, end);
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
		return _cholatalkiespathLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cholatalkiespathLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public cholatalkiespathLocalService getWrappedService() {
		return _cholatalkiespathLocalService;
	}

	@Override
	public void setWrappedService(
		cholatalkiespathLocalService cholatalkiespathLocalService) {
		_cholatalkiespathLocalService = cholatalkiespathLocalService;
	}

	private cholatalkiespathLocalService _cholatalkiespathLocalService;
}