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

package com.chola.imagegallery.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link imagegallerypathLocalService}.
 *
 * @author CloverLiferay02
 * @see imagegallerypathLocalService
 * @generated
 */
@ProviderType
public class imagegallerypathLocalServiceWrapper
	implements imagegallerypathLocalService,
		ServiceWrapper<imagegallerypathLocalService> {
	public imagegallerypathLocalServiceWrapper(
		imagegallerypathLocalService imagegallerypathLocalService) {
		_imagegallerypathLocalService = imagegallerypathLocalService;
	}

	/**
	* Adds the imagegallerypath to the database. Also notifies the appropriate model listeners.
	*
	* @param imagegallerypath the imagegallerypath
	* @return the imagegallerypath that was added
	*/
	@Override
	public com.chola.imagegallery.model.imagegallerypath addimagegallerypath(
		com.chola.imagegallery.model.imagegallerypath imagegallerypath) {
		return _imagegallerypathLocalService.addimagegallerypath(imagegallerypath);
	}

	/**
	* Creates a new imagegallerypath with the primary key. Does not add the imagegallerypath to the database.
	*
	* @param id the primary key for the new imagegallerypath
	* @return the new imagegallerypath
	*/
	@Override
	public com.chola.imagegallery.model.imagegallerypath createimagegallerypath(
		long id) {
		return _imagegallerypathLocalService.createimagegallerypath(id);
	}

	/**
	* Deletes the imagegallerypath from the database. Also notifies the appropriate model listeners.
	*
	* @param imagegallerypath the imagegallerypath
	* @return the imagegallerypath that was removed
	*/
	@Override
	public com.chola.imagegallery.model.imagegallerypath deleteimagegallerypath(
		com.chola.imagegallery.model.imagegallerypath imagegallerypath) {
		return _imagegallerypathLocalService.deleteimagegallerypath(imagegallerypath);
	}

	/**
	* Deletes the imagegallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath that was removed
	* @throws PortalException if a imagegallerypath with the primary key could not be found
	*/
	@Override
	public com.chola.imagegallery.model.imagegallerypath deleteimagegallerypath(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _imagegallerypathLocalService.deleteimagegallerypath(id);
	}

	@Override
	public com.chola.imagegallery.model.imagegallerypath fetchimagegallerypath(
		long id) {
		return _imagegallerypathLocalService.fetchimagegallerypath(id);
	}

	/**
	* Returns the imagegallerypath with the primary key.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath
	* @throws PortalException if a imagegallerypath with the primary key could not be found
	*/
	@Override
	public com.chola.imagegallery.model.imagegallerypath getimagegallerypath(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _imagegallerypathLocalService.getimagegallerypath(id);
	}

	/**
	* Updates the imagegallerypath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param imagegallerypath the imagegallerypath
	* @return the imagegallerypath that was updated
	*/
	@Override
	public com.chola.imagegallery.model.imagegallerypath updateimagegallerypath(
		com.chola.imagegallery.model.imagegallerypath imagegallerypath) {
		return _imagegallerypathLocalService.updateimagegallerypath(imagegallerypath);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _imagegallerypathLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _imagegallerypathLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _imagegallerypathLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _imagegallerypathLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _imagegallerypathLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of imagegallerypaths.
	*
	* @return the number of imagegallerypaths
	*/
	@Override
	public int getimagegallerypathsCount() {
		return _imagegallerypathLocalService.getimagegallerypathsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _imagegallerypathLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _imagegallerypathLocalService.getOSGiServiceIdentifier();
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
		return _imagegallerypathLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.imagegallery.model.impl.imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _imagegallerypathLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.imagegallery.model.impl.imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _imagegallerypathLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.imagegallery.model.imagegallerypath> getAlbumDetails(
		java.lang.String albumId) {
		return _imagegallerypathLocalService.getAlbumDetails(albumId);
	}

	/**
	* Returns a range of all the imagegallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.imagegallery.model.impl.imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @return the range of imagegallerypaths
	*/
	@Override
	public java.util.List<com.chola.imagegallery.model.imagegallerypath> getimagegallerypaths(
		int start, int end) {
		return _imagegallerypathLocalService.getimagegallerypaths(start, end);
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
		return _imagegallerypathLocalService.dynamicQueryCount(dynamicQuery);
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
		return _imagegallerypathLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public imagegallerypathLocalService getWrappedService() {
		return _imagegallerypathLocalService;
	}

	@Override
	public void setWrappedService(
		imagegallerypathLocalService imagegallerypathLocalService) {
		_imagegallerypathLocalService = imagegallerypathLocalService;
	}

	private imagegallerypathLocalService _imagegallerypathLocalService;
}