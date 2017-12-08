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
 * Provides a wrapper for {@link shutterspeedgalleryLocalService}.
 *
 * @author CloverLiferay02
 * @see shutterspeedgalleryLocalService
 * @generated
 */
@ProviderType
public class shutterspeedgalleryLocalServiceWrapper
	implements shutterspeedgalleryLocalService,
		ServiceWrapper<shutterspeedgalleryLocalService> {
	public shutterspeedgalleryLocalServiceWrapper(
		shutterspeedgalleryLocalService shutterspeedgalleryLocalService) {
		_shutterspeedgalleryLocalService = shutterspeedgalleryLocalService;
	}

	/**
	* Adds the shutterspeedgallery to the database. Also notifies the appropriate model listeners.
	*
	* @param shutterspeedgallery the shutterspeedgallery
	* @return the shutterspeedgallery that was added
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgallery addshutterspeedgallery(
		com.chola.shutterspeed.model.shutterspeedgallery shutterspeedgallery) {
		return _shutterspeedgalleryLocalService.addshutterspeedgallery(shutterspeedgallery);
	}

	/**
	* Creates a new shutterspeedgallery with the primary key. Does not add the shutterspeedgallery to the database.
	*
	* @param id the primary key for the new shutterspeedgallery
	* @return the new shutterspeedgallery
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgallery createshutterspeedgallery(
		long id) {
		return _shutterspeedgalleryLocalService.createshutterspeedgallery(id);
	}

	/**
	* Deletes the shutterspeedgallery from the database. Also notifies the appropriate model listeners.
	*
	* @param shutterspeedgallery the shutterspeedgallery
	* @return the shutterspeedgallery that was removed
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgallery deleteshutterspeedgallery(
		com.chola.shutterspeed.model.shutterspeedgallery shutterspeedgallery) {
		return _shutterspeedgalleryLocalService.deleteshutterspeedgallery(shutterspeedgallery);
	}

	/**
	* Deletes the shutterspeedgallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shutterspeedgallery
	* @return the shutterspeedgallery that was removed
	* @throws PortalException if a shutterspeedgallery with the primary key could not be found
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgallery deleteshutterspeedgallery(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _shutterspeedgalleryLocalService.deleteshutterspeedgallery(id);
	}

	@Override
	public com.chola.shutterspeed.model.shutterspeedgallery fetchshutterspeedgallery(
		long id) {
		return _shutterspeedgalleryLocalService.fetchshutterspeedgallery(id);
	}

	/**
	* Returns the shutterspeedgallery with the primary key.
	*
	* @param id the primary key of the shutterspeedgallery
	* @return the shutterspeedgallery
	* @throws PortalException if a shutterspeedgallery with the primary key could not be found
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgallery getshutterspeedgallery(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _shutterspeedgalleryLocalService.getshutterspeedgallery(id);
	}

	/**
	* Updates the shutterspeedgallery in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shutterspeedgallery the shutterspeedgallery
	* @return the shutterspeedgallery that was updated
	*/
	@Override
	public com.chola.shutterspeed.model.shutterspeedgallery updateshutterspeedgallery(
		com.chola.shutterspeed.model.shutterspeedgallery shutterspeedgallery) {
		return _shutterspeedgalleryLocalService.updateshutterspeedgallery(shutterspeedgallery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _shutterspeedgalleryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shutterspeedgalleryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _shutterspeedgalleryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shutterspeedgalleryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shutterspeedgalleryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of shutterspeedgalleries.
	*
	* @return the number of shutterspeedgalleries
	*/
	@Override
	public int getshutterspeedgalleriesCount() {
		return _shutterspeedgalleryLocalService.getshutterspeedgalleriesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _shutterspeedgalleryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _shutterspeedgalleryLocalService.getOSGiServiceIdentifier();
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
		return _shutterspeedgalleryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.shutterspeed.model.impl.shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shutterspeedgalleryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.shutterspeed.model.impl.shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shutterspeedgalleryLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.shutterspeed.model.shutterspeedgallery> getShutterSpeed(
		long contentId) {
		return _shutterspeedgalleryLocalService.getShutterSpeed(contentId);
	}

	/**
	* Returns a range of all the shutterspeedgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.shutterspeed.model.impl.shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgalleries
	* @param end the upper bound of the range of shutterspeedgalleries (not inclusive)
	* @return the range of shutterspeedgalleries
	*/
	@Override
	public java.util.List<com.chola.shutterspeed.model.shutterspeedgallery> getshutterspeedgalleries(
		int start, int end) {
		return _shutterspeedgalleryLocalService.getshutterspeedgalleries(start,
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
		return _shutterspeedgalleryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _shutterspeedgalleryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public shutterspeedgalleryLocalService getWrappedService() {
		return _shutterspeedgalleryLocalService;
	}

	@Override
	public void setWrappedService(
		shutterspeedgalleryLocalService shutterspeedgalleryLocalService) {
		_shutterspeedgalleryLocalService = shutterspeedgalleryLocalService;
	}

	private shutterspeedgalleryLocalService _shutterspeedgalleryLocalService;
}