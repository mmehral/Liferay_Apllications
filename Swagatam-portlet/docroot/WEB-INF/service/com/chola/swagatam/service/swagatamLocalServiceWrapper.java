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
 * Provides a wrapper for {@link swagatamLocalService}.
 *
 * @author CloverLiferay02
 * @see swagatamLocalService
 * @generated
 */
@ProviderType
public class swagatamLocalServiceWrapper implements swagatamLocalService,
	ServiceWrapper<swagatamLocalService> {
	public swagatamLocalServiceWrapper(
		swagatamLocalService swagatamLocalService) {
		_swagatamLocalService = swagatamLocalService;
	}

	/**
	* Adds the swagatam to the database. Also notifies the appropriate model listeners.
	*
	* @param swagatam the swagatam
	* @return the swagatam that was added
	*/
	@Override
	public com.chola.swagatam.model.swagatam addswagatam(
		com.chola.swagatam.model.swagatam swagatam) {
		return _swagatamLocalService.addswagatam(swagatam);
	}

	/**
	* Creates a new swagatam with the primary key. Does not add the swagatam to the database.
	*
	* @param id the primary key for the new swagatam
	* @return the new swagatam
	*/
	@Override
	public com.chola.swagatam.model.swagatam createswagatam(long id) {
		return _swagatamLocalService.createswagatam(id);
	}

	/**
	* Deletes the swagatam from the database. Also notifies the appropriate model listeners.
	*
	* @param swagatam the swagatam
	* @return the swagatam that was removed
	*/
	@Override
	public com.chola.swagatam.model.swagatam deleteswagatam(
		com.chola.swagatam.model.swagatam swagatam) {
		return _swagatamLocalService.deleteswagatam(swagatam);
	}

	/**
	* Deletes the swagatam with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the swagatam
	* @return the swagatam that was removed
	* @throws PortalException if a swagatam with the primary key could not be found
	*/
	@Override
	public com.chola.swagatam.model.swagatam deleteswagatam(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _swagatamLocalService.deleteswagatam(id);
	}

	@Override
	public com.chola.swagatam.model.swagatam fetchswagatam(long id) {
		return _swagatamLocalService.fetchswagatam(id);
	}

	/**
	* Returns the swagatam with the primary key.
	*
	* @param id the primary key of the swagatam
	* @return the swagatam
	* @throws PortalException if a swagatam with the primary key could not be found
	*/
	@Override
	public com.chola.swagatam.model.swagatam getswagatam(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _swagatamLocalService.getswagatam(id);
	}

	/**
	* Updates the swagatam in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param swagatam the swagatam
	* @return the swagatam that was updated
	*/
	@Override
	public com.chola.swagatam.model.swagatam updateswagatam(
		com.chola.swagatam.model.swagatam swagatam) {
		return _swagatamLocalService.updateswagatam(swagatam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _swagatamLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _swagatamLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _swagatamLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _swagatamLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _swagatamLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of swagatams.
	*
	* @return the number of swagatams
	*/
	@Override
	public int getswagatamsCount() {
		return _swagatamLocalService.getswagatamsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _swagatamLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _swagatamLocalService.getOSGiServiceIdentifier();
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
		return _swagatamLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _swagatamLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _swagatamLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the swagatams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.swagatam.model.impl.swagatamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatams
	* @param end the upper bound of the range of swagatams (not inclusive)
	* @return the range of swagatams
	*/
	@Override
	public java.util.List<com.chola.swagatam.model.swagatam> getswagatams(
		int start, int end) {
		return _swagatamLocalService.getswagatams(start, end);
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
		return _swagatamLocalService.dynamicQueryCount(dynamicQuery);
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
		return _swagatamLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public swagatamLocalService getWrappedService() {
		return _swagatamLocalService;
	}

	@Override
	public void setWrappedService(swagatamLocalService swagatamLocalService) {
		_swagatamLocalService = swagatamLocalService;
	}

	private swagatamLocalService _swagatamLocalService;
}