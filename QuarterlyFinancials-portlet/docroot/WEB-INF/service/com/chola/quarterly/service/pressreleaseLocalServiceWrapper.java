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

package com.chola.quarterly.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link pressreleaseLocalService}.
 *
 * @author CloverLiferay02
 * @see pressreleaseLocalService
 * @generated
 */
@ProviderType
public class pressreleaseLocalServiceWrapper implements pressreleaseLocalService,
	ServiceWrapper<pressreleaseLocalService> {
	public pressreleaseLocalServiceWrapper(
		pressreleaseLocalService pressreleaseLocalService) {
		_pressreleaseLocalService = pressreleaseLocalService;
	}

	/**
	* Adds the pressrelease to the database. Also notifies the appropriate model listeners.
	*
	* @param pressrelease the pressrelease
	* @return the pressrelease that was added
	*/
	@Override
	public com.chola.quarterly.model.pressrelease addpressrelease(
		com.chola.quarterly.model.pressrelease pressrelease) {
		return _pressreleaseLocalService.addpressrelease(pressrelease);
	}

	/**
	* Creates a new pressrelease with the primary key. Does not add the pressrelease to the database.
	*
	* @param id the primary key for the new pressrelease
	* @return the new pressrelease
	*/
	@Override
	public com.chola.quarterly.model.pressrelease createpressrelease(long id) {
		return _pressreleaseLocalService.createpressrelease(id);
	}

	/**
	* Deletes the pressrelease from the database. Also notifies the appropriate model listeners.
	*
	* @param pressrelease the pressrelease
	* @return the pressrelease that was removed
	*/
	@Override
	public com.chola.quarterly.model.pressrelease deletepressrelease(
		com.chola.quarterly.model.pressrelease pressrelease) {
		return _pressreleaseLocalService.deletepressrelease(pressrelease);
	}

	/**
	* Deletes the pressrelease with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the pressrelease
	* @return the pressrelease that was removed
	* @throws PortalException if a pressrelease with the primary key could not be found
	*/
	@Override
	public com.chola.quarterly.model.pressrelease deletepressrelease(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressreleaseLocalService.deletepressrelease(id);
	}

	@Override
	public com.chola.quarterly.model.pressrelease fetchpressrelease(long id) {
		return _pressreleaseLocalService.fetchpressrelease(id);
	}

	/**
	* Returns the pressrelease with the primary key.
	*
	* @param id the primary key of the pressrelease
	* @return the pressrelease
	* @throws PortalException if a pressrelease with the primary key could not be found
	*/
	@Override
	public com.chola.quarterly.model.pressrelease getpressrelease(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressreleaseLocalService.getpressrelease(id);
	}

	/**
	* Updates the pressrelease in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pressrelease the pressrelease
	* @return the pressrelease that was updated
	*/
	@Override
	public com.chola.quarterly.model.pressrelease updatepressrelease(
		com.chola.quarterly.model.pressrelease pressrelease) {
		return _pressreleaseLocalService.updatepressrelease(pressrelease);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _pressreleaseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pressreleaseLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _pressreleaseLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressreleaseLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressreleaseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of pressreleases.
	*
	* @return the number of pressreleases
	*/
	@Override
	public int getpressreleasesCount() {
		return _pressreleaseLocalService.getpressreleasesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _pressreleaseLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _pressreleaseLocalService.getOSGiServiceIdentifier();
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
		return _pressreleaseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.quarterly.model.impl.pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pressreleaseLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.quarterly.model.impl.pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pressreleaseLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the pressreleases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.quarterly.model.impl.pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pressreleases
	* @param end the upper bound of the range of pressreleases (not inclusive)
	* @return the range of pressreleases
	*/
	@Override
	public java.util.List<com.chola.quarterly.model.pressrelease> getpressreleases(
		int start, int end) {
		return _pressreleaseLocalService.getpressreleases(start, end);
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
		return _pressreleaseLocalService.dynamicQueryCount(dynamicQuery);
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
		return _pressreleaseLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public pressreleaseLocalService getWrappedService() {
		return _pressreleaseLocalService;
	}

	@Override
	public void setWrappedService(
		pressreleaseLocalService pressreleaseLocalService) {
		_pressreleaseLocalService = pressreleaseLocalService;
	}

	private pressreleaseLocalService _pressreleaseLocalService;
}