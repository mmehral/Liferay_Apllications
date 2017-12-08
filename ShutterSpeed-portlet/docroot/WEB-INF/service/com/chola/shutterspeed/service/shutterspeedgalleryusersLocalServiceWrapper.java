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

package com.chola.shutterspeed.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link shutterspeedgalleryusersLocalService}.
 *
 * @author CloverLiferay02
 * @see shutterspeedgalleryusersLocalService
 * @generated
 */
@ProviderType
public class shutterspeedgalleryusersLocalServiceWrapper
	implements shutterspeedgalleryusersLocalService,
		ServiceWrapper<shutterspeedgalleryusersLocalService> {
	public shutterspeedgalleryusersLocalServiceWrapper(
		shutterspeedgalleryusersLocalService shutterspeedgalleryusersLocalService) {
		_shutterspeedgalleryusersLocalService = shutterspeedgalleryusersLocalService;
	}

	/**
	* Adds the shutterspeedgalleryusers to the database. Also notifies the appropriate model listeners.
	*
	* @param shutterspeedgalleryusers the shutterspeedgalleryusers
	* @return the shutterspeedgalleryusers that was added
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgalleryusers addshutterspeedgalleryusers(
		com.chola.shutterspeed.model.shutterspeedgalleryusers shutterspeedgalleryusers) {
		return _shutterspeedgalleryusersLocalService.addshutterspeedgalleryusers(shutterspeedgalleryusers);
	}

	/**
	* Creates a new shutterspeedgalleryusers with the primary key. Does not add the shutterspeedgalleryusers to the database.
	*
	* @param id the primary key for the new shutterspeedgalleryusers
	* @return the new shutterspeedgalleryusers
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgalleryusers createshutterspeedgalleryusers(
		long id) {
		return _shutterspeedgalleryusersLocalService.createshutterspeedgalleryusers(id);
	}

	/**
	* Deletes the shutterspeedgalleryusers from the database. Also notifies the appropriate model listeners.
	*
	* @param shutterspeedgalleryusers the shutterspeedgalleryusers
	* @return the shutterspeedgalleryusers that was removed
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgalleryusers deleteshutterspeedgalleryusers(
		com.chola.shutterspeed.model.shutterspeedgalleryusers shutterspeedgalleryusers) {
		return _shutterspeedgalleryusersLocalService.deleteshutterspeedgalleryusers(shutterspeedgalleryusers);
	}

	/**
	* Deletes the shutterspeedgalleryusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shutterspeedgalleryusers
	* @return the shutterspeedgalleryusers that was removed
	* @throws PortalException if a shutterspeedgalleryusers with the primary key could not be found
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgalleryusers deleteshutterspeedgalleryusers(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _shutterspeedgalleryusersLocalService.deleteshutterspeedgalleryusers(id);
	}

	@Override
	public com.chola.shutterspeed.model.shutterspeedgalleryusers fetchshutterspeedgalleryusers(
		long id) {
		return _shutterspeedgalleryusersLocalService.fetchshutterspeedgalleryusers(id);
	}

	/**
	* Returns the shutterspeedgalleryusers with the primary key.
	*
	* @param id the primary key of the shutterspeedgalleryusers
	* @return the shutterspeedgalleryusers
	* @throws PortalException if a shutterspeedgalleryusers with the primary key could not be found
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgalleryusers getshutterspeedgalleryusers(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _shutterspeedgalleryusersLocalService.getshutterspeedgalleryusers(id);
	}

	/**
	* Updates the shutterspeedgalleryusers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shutterspeedgalleryusers the shutterspeedgalleryusers
	* @return the shutterspeedgalleryusers that was updated
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgalleryusers updateshutterspeedgalleryusers(
		com.chola.shutterspeed.model.shutterspeedgalleryusers shutterspeedgalleryusers) {
		return _shutterspeedgalleryusersLocalService.updateshutterspeedgalleryusers(shutterspeedgalleryusers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _shutterspeedgalleryusersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shutterspeedgalleryusersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _shutterspeedgalleryusersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shutterspeedgalleryusersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shutterspeedgalleryusersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of shutterspeedgalleryuserses.
	*
	* @return the number of shutterspeedgalleryuserses
	*/
	@Override
	public int getshutterspeedgalleryusersesCount() {
		return _shutterspeedgalleryusersLocalService.getshutterspeedgalleryusersesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _shutterspeedgalleryusersLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _shutterspeedgalleryusersLocalService.getOSGiServiceIdentifier();
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
		return _shutterspeedgalleryusersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.shutterspeed.model.impl.shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shutterspeedgalleryusersLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.shutterspeed.model.impl.shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shutterspeedgalleryusersLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.shutterspeed.model.shutterspeedgalleryusers> getAlbumUsers(
		long id) {
		return _shutterspeedgalleryusersLocalService.getAlbumUsers(id);
	}

	/**
	* Returns a range of all the shutterspeedgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.shutterspeed.model.impl.shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @return the range of shutterspeedgalleryuserses
	*/
	@Override
	public java.util.List<com.chola.shutterspeed.model.shutterspeedgalleryusers> getshutterspeedgalleryuserses(
		int start, int end) {
		return _shutterspeedgalleryusersLocalService.getshutterspeedgalleryuserses(start,
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
		return _shutterspeedgalleryusersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _shutterspeedgalleryusersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public shutterspeedgalleryusersLocalService getWrappedService() {
		return _shutterspeedgalleryusersLocalService;
	}

	@Override
	public void setWrappedService(
		shutterspeedgalleryusersLocalService shutterspeedgalleryusersLocalService) {
		_shutterspeedgalleryusersLocalService = shutterspeedgalleryusersLocalService;
	}

	private shutterspeedgalleryusersLocalService _shutterspeedgalleryusersLocalService;
}