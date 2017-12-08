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

package com.chola.videogallery.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link videogalleryLocalService}.
 *
 * @author CloverLiferay02
 * @see videogalleryLocalService
 * @generated
 */
@ProviderType
public class videogalleryLocalServiceWrapper implements videogalleryLocalService,
	ServiceWrapper<videogalleryLocalService> {
	public videogalleryLocalServiceWrapper(
		videogalleryLocalService videogalleryLocalService) {
		_videogalleryLocalService = videogalleryLocalService;
	}

	/**
	* Adds the videogallery to the database. Also notifies the appropriate model listeners.
	*
	* @param videogallery the videogallery
	* @return the videogallery that was added
	*/
	@Override
	public com.chola.videogallery.model.videogallery addvideogallery(
		com.chola.videogallery.model.videogallery videogallery) {
		return _videogalleryLocalService.addvideogallery(videogallery);
	}

	/**
	* Creates a new videogallery with the primary key. Does not add the videogallery to the database.
	*
	* @param id the primary key for the new videogallery
	* @return the new videogallery
	*/
	@Override
	public com.chola.videogallery.model.videogallery createvideogallery(long id) {
		return _videogalleryLocalService.createvideogallery(id);
	}

	/**
	* Deletes the videogallery from the database. Also notifies the appropriate model listeners.
	*
	* @param videogallery the videogallery
	* @return the videogallery that was removed
	*/
	@Override
	public com.chola.videogallery.model.videogallery deletevideogallery(
		com.chola.videogallery.model.videogallery videogallery) {
		return _videogalleryLocalService.deletevideogallery(videogallery);
	}

	/**
	* Deletes the videogallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the videogallery
	* @return the videogallery that was removed
	* @throws PortalException if a videogallery with the primary key could not be found
	*/
	@Override
	public com.chola.videogallery.model.videogallery deletevideogallery(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videogalleryLocalService.deletevideogallery(id);
	}

	@Override
	public com.chola.videogallery.model.videogallery fetchvideogallery(long id) {
		return _videogalleryLocalService.fetchvideogallery(id);
	}

	/**
	* Returns the videogallery with the primary key.
	*
	* @param id the primary key of the videogallery
	* @return the videogallery
	* @throws PortalException if a videogallery with the primary key could not be found
	*/
	@Override
	public com.chola.videogallery.model.videogallery getvideogallery(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videogalleryLocalService.getvideogallery(id);
	}

	/**
	* Updates the videogallery in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videogallery the videogallery
	* @return the videogallery that was updated
	*/
	@Override
	public com.chola.videogallery.model.videogallery updatevideogallery(
		com.chola.videogallery.model.videogallery videogallery) {
		return _videogalleryLocalService.updatevideogallery(videogallery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _videogalleryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _videogalleryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _videogalleryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videogalleryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _videogalleryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of videogalleries.
	*
	* @return the number of videogalleries
	*/
	@Override
	public int getvideogalleriesCount() {
		return _videogalleryLocalService.getvideogalleriesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _videogalleryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _videogalleryLocalService.getOSGiServiceIdentifier();
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
		return _videogalleryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.videogallery.model.impl.videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _videogalleryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.videogallery.model.impl.videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _videogalleryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the videogalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.videogallery.model.impl.videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogalleries
	* @param end the upper bound of the range of videogalleries (not inclusive)
	* @return the range of videogalleries
	*/
	@Override
	public java.util.List<com.chola.videogallery.model.videogallery> getvideogalleries(
		int start, int end) {
		return _videogalleryLocalService.getvideogalleries(start, end);
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
		return _videogalleryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _videogalleryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public videogalleryLocalService getWrappedService() {
		return _videogalleryLocalService;
	}

	@Override
	public void setWrappedService(
		videogalleryLocalService videogalleryLocalService) {
		_videogalleryLocalService = videogalleryLocalService;
	}

	private videogalleryLocalService _videogalleryLocalService;
}