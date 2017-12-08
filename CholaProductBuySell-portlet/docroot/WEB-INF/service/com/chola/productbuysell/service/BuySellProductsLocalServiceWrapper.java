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
 * Provides a wrapper for {@link BuySellProductsLocalService}.
 *
 * @author CloverLiferay03
 * @see BuySellProductsLocalService
 * @generated
 */
@ProviderType
public class BuySellProductsLocalServiceWrapper
	implements BuySellProductsLocalService,
		ServiceWrapper<BuySellProductsLocalService> {
	public BuySellProductsLocalServiceWrapper(
		BuySellProductsLocalService buySellProductsLocalService) {
		_buySellProductsLocalService = buySellProductsLocalService;
	}

	/**
	* Adds the buy sell products to the database. Also notifies the appropriate model listeners.
	*
	* @param buySellProducts the buy sell products
	* @return the buy sell products that was added
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProducts addBuySellProducts(
		com.chola.productbuysell.model.BuySellProducts buySellProducts) {
		return _buySellProductsLocalService.addBuySellProducts(buySellProducts);
	}

	/**
	* Creates a new buy sell products with the primary key. Does not add the buy sell products to the database.
	*
	* @param id the primary key for the new buy sell products
	* @return the new buy sell products
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProducts createBuySellProducts(
		long id) {
		return _buySellProductsLocalService.createBuySellProducts(id);
	}

	/**
	* Deletes the buy sell products from the database. Also notifies the appropriate model listeners.
	*
	* @param buySellProducts the buy sell products
	* @return the buy sell products that was removed
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProducts deleteBuySellProducts(
		com.chola.productbuysell.model.BuySellProducts buySellProducts) {
		return _buySellProductsLocalService.deleteBuySellProducts(buySellProducts);
	}

	/**
	* Deletes the buy sell products with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products that was removed
	* @throws PortalException if a buy sell products with the primary key could not be found
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProducts deleteBuySellProducts(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellProductsLocalService.deleteBuySellProducts(id);
	}

	@Override
	public com.chola.productbuysell.model.BuySellProducts fetchBuySellProducts(
		long id) {
		return _buySellProductsLocalService.fetchBuySellProducts(id);
	}

	/**
	* Returns the buy sell products with the primary key.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products
	* @throws PortalException if a buy sell products with the primary key could not be found
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProducts getBuySellProducts(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellProductsLocalService.getBuySellProducts(id);
	}

	/**
	* Updates the buy sell products in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param buySellProducts the buy sell products
	* @return the buy sell products that was updated
	*/
	@Override
	public com.chola.productbuysell.model.BuySellProducts updateBuySellProducts(
		com.chola.productbuysell.model.BuySellProducts buySellProducts) {
		return _buySellProductsLocalService.updateBuySellProducts(buySellProducts);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _buySellProductsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _buySellProductsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _buySellProductsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellProductsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellProductsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of buy sell productses.
	*
	* @return the number of buy sell productses
	*/
	@Override
	public int getBuySellProductsesCount() {
		return _buySellProductsLocalService.getBuySellProductsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _buySellProductsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _buySellProductsLocalService.getOSGiServiceIdentifier();
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
		return _buySellProductsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _buySellProductsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _buySellProductsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the buy sell productses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of buy sell productses
	*/
	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProducts> getBuySellProductses(
		int start, int end) {
		return _buySellProductsLocalService.getBuySellProductses(start, end);
	}

	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsCategoryAndLocationWise(
		int location_id, int category_id) {
		return _buySellProductsLocalService.getProductsCategoryAndLocationWise(location_id,
			category_id);
	}

	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsCategoryLocationSearchWise(
		int category_id, int location, java.lang.String title) {
		return _buySellProductsLocalService.getProductsCategoryLocationSearchWise(category_id,
			location, title);
	}

	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsCategorySearchWise(
		int category_id, java.lang.String title) {
		return _buySellProductsLocalService.getProductsCategorySearchWise(category_id,
			title);
	}

	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsCategoryWise(
		int category_id) {
		return _buySellProductsLocalService.getProductsCategoryWise(category_id);
	}

	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsLocationSearchWise(
		int location, java.lang.String title) {
		return _buySellProductsLocalService.getProductsLocationSearchWise(location,
			title);
	}

	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsLocationWise(
		int location_id) {
		return _buySellProductsLocalService.getProductsLocationWise(location_id);
	}

	@Override
	public java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsTitleBasedSearch(
		java.lang.String title) {
		return _buySellProductsLocalService.getProductsTitleBasedSearch(title);
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
		return _buySellProductsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _buySellProductsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public BuySellProductsLocalService getWrappedService() {
		return _buySellProductsLocalService;
	}

	@Override
	public void setWrappedService(
		BuySellProductsLocalService buySellProductsLocalService) {
		_buySellProductsLocalService = buySellProductsLocalService;
	}

	private BuySellProductsLocalService _buySellProductsLocalService;
}