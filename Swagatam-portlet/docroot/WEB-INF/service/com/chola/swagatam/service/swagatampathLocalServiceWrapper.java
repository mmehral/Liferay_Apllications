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

package com.chola.swagatam.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link swagatampathLocalService}.
 *
 * @author CloverLiferay02
 * @see swagatampathLocalService
 * @generated
 */
@ProviderType
public class swagatampathLocalServiceWrapper implements swagatampathLocalService,
	ServiceWrapper<swagatampathLocalService> {
	public swagatampathLocalServiceWrapper(
		swagatampathLocalService swagatampathLocalService) {
		_swagatampathLocalService = swagatampathLocalService;
	}

	/**
	* Adds the swagatampath to the database. Also notifies the appropriate model listeners.
	*
	* @param swagatampath the swagatampath
	* @return the swagatampath that was added
	*/
	@Override
	public com.chola.swagatam.model.swagatampath addswagatampath(
		com.chola.swagatam.model.swagatampath swagatampath) {
		return _swagatampathLocalService.addswagatampath(swagatampath);
	}

	/**
	* Creates a new swagatampath with the primary key. Does not add the swagatampath to the database.
	*
	* @param id the primary key for the new swagatampath
	* @return the new swagatampath
	*/
	@Override
	public com.chola.swagatam.model.swagatampath createswagatampath(long id) {
		return _swagatampathLocalService.createswagatampath(id);
	}

	/**
	* Deletes the swagatampath from the database. Also notifies the appropriate model listeners.
	*
	* @param swagatampath the swagatampath
	* @return the swagatampath that was removed
	*/
	@Override
	public com.chola.swagatam.model.swagatampath deleteswagatampath(
		com.chola.swagatam.model.swagatampath swagatampath) {
		return _swagatampathLocalService.deleteswagatampath(swagatampath);
	}

	/**
	* Deletes the swagatampath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the swagatampath
	* @return the swagatampath that was removed
	* @throws PortalException if a swagatampath with the primary key could not be found
	*/
	@Override
	public com.chola.swagatam.model.swagatampath deleteswagatampath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _swagatampathLocalService.deleteswagatampath(id);
	}

	@Override
	public com.chola.swagatam.model.swagatampath fetchswagatampath(long id) {
		return _swagatampathLocalService.fetchswagatampath(id);
	}

	/**
	* Returns the swagatampath with the primary key.
	*
	* @param id the primary key of the swagatampath
	* @return the swagatampath
	* @throws PortalException if a swagatampath with the primary key could not be found
	*/
	@Override
	public com.chola.swagatam.model.swagatampath getswagatampath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _swagatampathLocalService.getswagatampath(id);
	}

	/**
	* Updates the swagatampath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param swagatampath the swagatampath
	* @return the swagatampath that was updated
	*/
	@Override
	public com.chola.swagatam.model.swagatampath updateswagatampath(
		com.chola.swagatam.model.swagatampath swagatampath) {
		return _swagatampathLocalService.updateswagatampath(swagatampath);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _swagatampathLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _swagatampathLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _swagatampathLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _swagatampathLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _swagatampathLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of swagatampaths.
	*
	* @return the number of swagatampaths
	*/
	@Override
	public int getswagatampathsCount() {
		return _swagatampathLocalService.getswagatampathsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _swagatampathLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _swagatampathLocalService.getOSGiServiceIdentifier();
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
		return _swagatampathLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _swagatampathLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _swagatampathLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.swagatam.model.swagatampath> getVideoDetails(
		java.lang.String albumId) {
		return _swagatampathLocalService.getVideoDetails(albumId);
	}

	/**
	* Returns a range of all the swagatampaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @return the range of swagatampaths
	*/
	@Override
	public java.util.List<com.chola.swagatam.model.swagatampath> getswagatampaths(
		int start, int end) {
		return _swagatampathLocalService.getswagatampaths(start, end);
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
		return _swagatampathLocalService.dynamicQueryCount(dynamicQuery);
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
		return _swagatampathLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public swagatampathLocalService getWrappedService() {
		return _swagatampathLocalService;
	}

	@Override
	public void setWrappedService(
		swagatampathLocalService swagatampathLocalService) {
		_swagatampathLocalService = swagatampathLocalService;
	}

	private swagatampathLocalService _swagatampathLocalService;
}