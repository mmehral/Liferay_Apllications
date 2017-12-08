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

package com.chola.news.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Around_WorldLocalService}.
 *
 * @author adms.java1
 * @see Around_WorldLocalService
 * @generated
 */
@ProviderType
public class Around_WorldLocalServiceWrapper implements Around_WorldLocalService,
	ServiceWrapper<Around_WorldLocalService> {
	public Around_WorldLocalServiceWrapper(
		Around_WorldLocalService around_WorldLocalService) {
		_around_WorldLocalService = around_WorldLocalService;
	}

	/**
	* Adds the around_ world to the database. Also notifies the appropriate model listeners.
	*
	* @param around_World the around_ world
	* @return the around_ world that was added
	*/
	@Override
	public com.chola.news.model.Around_World addAround_World(
		com.chola.news.model.Around_World around_World) {
		return _around_WorldLocalService.addAround_World(around_World);
	}

	/**
	* Creates a new around_ world with the primary key. Does not add the around_ world to the database.
	*
	* @param id the primary key for the new around_ world
	* @return the new around_ world
	*/
	@Override
	public com.chola.news.model.Around_World createAround_World(long id) {
		return _around_WorldLocalService.createAround_World(id);
	}

	/**
	* Deletes the around_ world from the database. Also notifies the appropriate model listeners.
	*
	* @param around_World the around_ world
	* @return the around_ world that was removed
	*/
	@Override
	public com.chola.news.model.Around_World deleteAround_World(
		com.chola.news.model.Around_World around_World) {
		return _around_WorldLocalService.deleteAround_World(around_World);
	}

	/**
	* Deletes the around_ world with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the around_ world
	* @return the around_ world that was removed
	* @throws PortalException if a around_ world with the primary key could not be found
	*/
	@Override
	public com.chola.news.model.Around_World deleteAround_World(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _around_WorldLocalService.deleteAround_World(id);
	}

	@Override
	public com.chola.news.model.Around_World fetchAround_World(long id) {
		return _around_WorldLocalService.fetchAround_World(id);
	}

	/**
	* Returns the around_ world with the primary key.
	*
	* @param id the primary key of the around_ world
	* @return the around_ world
	* @throws PortalException if a around_ world with the primary key could not be found
	*/
	@Override
	public com.chola.news.model.Around_World getAround_World(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _around_WorldLocalService.getAround_World(id);
	}

	/**
	* Updates the around_ world in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param around_World the around_ world
	* @return the around_ world that was updated
	*/
	@Override
	public com.chola.news.model.Around_World updateAround_World(
		com.chola.news.model.Around_World around_World) {
		return _around_WorldLocalService.updateAround_World(around_World);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _around_WorldLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _around_WorldLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _around_WorldLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _around_WorldLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _around_WorldLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of around_ worlds.
	*
	* @return the number of around_ worlds
	*/
	@Override
	public int getAround_WorldsCount() {
		return _around_WorldLocalService.getAround_WorldsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _around_WorldLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _around_WorldLocalService.getOSGiServiceIdentifier();
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
		return _around_WorldLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.news.model.impl.Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _around_WorldLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.news.model.impl.Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _around_WorldLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the around_ worlds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.news.model.impl.Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of around_ worlds
	* @param end the upper bound of the range of around_ worlds (not inclusive)
	* @return the range of around_ worlds
	*/
	@Override
	public java.util.List<com.chola.news.model.Around_World> getAround_Worlds(
		int start, int end) {
		return _around_WorldLocalService.getAround_Worlds(start, end);
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
		return _around_WorldLocalService.dynamicQueryCount(dynamicQuery);
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
		return _around_WorldLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public Around_WorldLocalService getWrappedService() {
		return _around_WorldLocalService;
	}

	@Override
	public void setWrappedService(
		Around_WorldLocalService around_WorldLocalService) {
		_around_WorldLocalService = around_WorldLocalService;
	}

	private Around_WorldLocalService _around_WorldLocalService;
}