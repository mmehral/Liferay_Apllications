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
 * Provides a wrapper for {@link BuySellLocalService}.
 *
 * @author CloverLiferay03
 * @see BuySellLocalService
 * @generated
 */
@ProviderType
public class BuySellLocalServiceWrapper implements BuySellLocalService,
	ServiceWrapper<BuySellLocalService> {
	public BuySellLocalServiceWrapper(BuySellLocalService buySellLocalService) {
		_buySellLocalService = buySellLocalService;
	}

	/**
	* Adds the buy sell to the database. Also notifies the appropriate model listeners.
	*
	* @param buySell the buy sell
	* @return the buy sell that was added
	*/
	@Override
	public com.chola.productbuysell.model.BuySell addBuySell(
		com.chola.productbuysell.model.BuySell buySell) {
		return _buySellLocalService.addBuySell(buySell);
	}

	/**
	* Creates a new buy sell with the primary key. Does not add the buy sell to the database.
	*
	* @param id the primary key for the new buy sell
	* @return the new buy sell
	*/
	@Override
	public com.chola.productbuysell.model.BuySell createBuySell(long id) {
		return _buySellLocalService.createBuySell(id);
	}

	/**
	* Deletes the buy sell from the database. Also notifies the appropriate model listeners.
	*
	* @param buySell the buy sell
	* @return the buy sell that was removed
	*/
	@Override
	public com.chola.productbuysell.model.BuySell deleteBuySell(
		com.chola.productbuysell.model.BuySell buySell) {
		return _buySellLocalService.deleteBuySell(buySell);
	}

	/**
	* Deletes the buy sell with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell that was removed
	* @throws PortalException if a buy sell with the primary key could not be found
	*/
	@Override
	public com.chola.productbuysell.model.BuySell deleteBuySell(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellLocalService.deleteBuySell(id);
	}

	@Override
	public com.chola.productbuysell.model.BuySell fetchBuySell(long id) {
		return _buySellLocalService.fetchBuySell(id);
	}

	/**
	* Returns the buy sell with the primary key.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell
	* @throws PortalException if a buy sell with the primary key could not be found
	*/
	@Override
	public com.chola.productbuysell.model.BuySell getBuySell(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellLocalService.getBuySell(id);
	}

	/**
	* Updates the buy sell in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param buySell the buy sell
	* @return the buy sell that was updated
	*/
	@Override
	public com.chola.productbuysell.model.BuySell updateBuySell(
		com.chola.productbuysell.model.BuySell buySell) {
		return _buySellLocalService.updateBuySell(buySell);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _buySellLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _buySellLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _buySellLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _buySellLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of buy sells.
	*
	* @return the number of buy sells
	*/
	@Override
	public int getBuySellsCount() {
		return _buySellLocalService.getBuySellsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _buySellLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _buySellLocalService.getOSGiServiceIdentifier();
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
		return _buySellLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _buySellLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _buySellLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the buy sells.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sells
	* @param end the upper bound of the range of buy sells (not inclusive)
	* @return the range of buy sells
	*/
	@Override
	public java.util.List<com.chola.productbuysell.model.BuySell> getBuySells(
		int start, int end) {
		return _buySellLocalService.getBuySells(start, end);
	}

	@Override
	public java.util.List<java.lang.Object[]> getLocationList() {
		return _buySellLocalService.getLocationList();
	}

	@Override
	public java.util.List<java.lang.Object[]> getProductCategoryList() {
		return _buySellLocalService.getProductCategoryList();
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
		return _buySellLocalService.dynamicQueryCount(dynamicQuery);
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
		return _buySellLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public BuySellLocalService getWrappedService() {
		return _buySellLocalService;
	}

	@Override
	public void setWrappedService(BuySellLocalService buySellLocalService) {
		_buySellLocalService = buySellLocalService;
	}

	private BuySellLocalService _buySellLocalService;
}