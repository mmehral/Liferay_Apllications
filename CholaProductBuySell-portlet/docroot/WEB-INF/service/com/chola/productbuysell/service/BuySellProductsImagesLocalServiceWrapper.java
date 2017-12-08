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

package com.chola.productbuysell.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BuySellProductsImagesLocalService}.
 *
 * @author CloverLiferay03
 * @see BuySellProductsImagesLocalService
 * @generated
 */
@ProviderType
public class BuySellProductsImagesLocalServiceWrapper
	implements BuySellProductsImagesLocalService,
		ServiceWrapper<BuySellProductsImagesLocalService> {
	public BuySellProductsImagesLocalServiceWrapper(
		BuySellProductsImagesLocalService buySellProductsImagesLocalService) {
		_buySellProductsImagesLocalService = buySellProductsImagesLocalService;
	}

	/**
	* Adds the buy sell products images to the database. Also notifies the appropriate model listeners.
	*
	* @param buySellProductsImages the buy sell products images
	* @return the buy sell products images that was added
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProductsImages addBuySellProductsImages(
		com.chola.productbuysell.model.BuySellProductsImages buySellProductsImages) {
		return _buySellProductsImagesLocalService.addBuySellProductsImages(buySellProductsImages);
	}

	/**
	* Creates a new buy sell products images with the primary key. Does not add the buy sell products images to the database.
	*
	* @param id the primary key for the new buy sell products images
	* @return the new buy sell products images
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProductsImages createBuySellProductsImages(
		long id) {
		return _buySellProductsImagesLocalService.createBuySellProductsImages(id);
	}

	/**
	* Deletes the buy sell products images from the database. Also notifies the appropriate model listeners.
	*
	* @param buySellProductsImages the buy sell products images
	* @return the buy sell products images that was removed
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProductsImages deleteBuySellProductsImages(
		com.chola.productbuysell.model.BuySellProductsImages buySellProductsImages) {
		return _buySellProductsImagesLocalService.deleteBuySellProductsImages(buySellProductsImages);
	}

	/**
	* Deletes the buy sell products images with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell products images
	* @return the buy sell products images that was removed
	* @throws PortalException if a buy sell products images with the primary key could not be found
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProductsImages deleteBuySellProductsImages(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellProductsImagesLocalService.deleteBuySellProductsImages(id);
	}

	@Override
	public com.chola.productbuysell.model.BuySellProductsImages fetchBuySellProductsImages(
		long id) {
		return _buySellProductsImagesLocalService.fetchBuySellProductsImages(id);
	}

	/**
	* Returns the buy sell products images with the primary key.
	*
	* @param id the primary key of the buy sell products images
	* @return the buy sell products images
	* @throws PortalException if a buy sell products images with the primary key could not be found
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProductsImages getBuySellProductsImages(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellProductsImagesLocalService.getBuySellProductsImages(id);
	}

	/**
	* Updates the buy sell products images in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param buySellProductsImages the buy sell products images
	* @return the buy sell products images that was updated
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProductsImages updateBuySellProductsImages(
		com.chola.productbuysell.model.BuySellProductsImages buySellProductsImages) {
		return _buySellProductsImagesLocalService.updateBuySellProductsImages(buySellProductsImages);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _buySellProductsImagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _buySellProductsImagesLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _buySellProductsImagesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellProductsImagesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellProductsImagesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of buy sell products imageses.
	*
	* @return the number of buy sell products imageses
	*/
	@Override
	public int getBuySellProductsImagesesCount() {
		return _buySellProductsImagesLocalService.getBuySellProductsImagesesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _buySellProductsImagesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _buySellProductsImagesLocalService.getOSGiServiceIdentifier();
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
		return _buySellProductsImagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _buySellProductsImagesLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _buySellProductsImagesLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the buy sell products imageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sell products imageses
	* @param end the upper bound of the range of buy sell products imageses (not inclusive)
	* @return the range of buy sell products imageses
	*/
	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProductsImages> getBuySellProductsImageses(
		int start, int end) {
		return _buySellProductsImagesLocalService.getBuySellProductsImageses(start,
			end);
	}

	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProductsImages> getProductImages(
		long product_id) {
		return _buySellProductsImagesLocalService.getProductImages(product_id);
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
		return _buySellProductsImagesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _buySellProductsImagesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public BuySellProductsImagesLocalService getWrappedService() {
		return _buySellProductsImagesLocalService;
	}

	@Override
	public void setWrappedService(
		BuySellProductsImagesLocalService buySellProductsImagesLocalService) {
		_buySellProductsImagesLocalService = buySellProductsImagesLocalService;
	}

	private BuySellProductsImagesLocalService _buySellProductsImagesLocalService;
}