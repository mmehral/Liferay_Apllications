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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for BuySellProducts. This utility wraps
 * {@link com.chola.productbuysell.service.impl.BuySellProductsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay03
 * @see BuySellProductsLocalService
 * @see com.chola.productbuysell.service.base.BuySellProductsLocalServiceBaseImpl
 * @see com.chola.productbuysell.service.impl.BuySellProductsLocalServiceImpl
 * @generated
 */
@ProviderType
public class BuySellProductsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.productbuysell.service.impl.BuySellProductsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the buy sell products to the database. Also notifies the appropriate model listeners.
	*
	* @param buySellProducts the buy sell products
	* @return the buy sell products that was added
	*/
	public static com.chola.productbuysell.model.BuySellProducts addBuySellProducts(
		com.chola.productbuysell.model.BuySellProducts buySellProducts) {
		return getService().addBuySellProducts(buySellProducts);
	}

	/**
	* Creates a new buy sell products with the primary key. Does not add the buy sell products to the database.
	*
	* @param id the primary key for the new buy sell products
	* @return the new buy sell products
	*/
	public static com.chola.productbuysell.model.BuySellProducts createBuySellProducts(
		long id) {
		return getService().createBuySellProducts(id);
	}

	/**
	* Deletes the buy sell products from the database. Also notifies the appropriate model listeners.
	*
	* @param buySellProducts the buy sell products
	* @return the buy sell products that was removed
	*/
	public static com.chola.productbuysell.model.BuySellProducts deleteBuySellProducts(
		com.chola.productbuysell.model.BuySellProducts buySellProducts) {
		return getService().deleteBuySellProducts(buySellProducts);
	}

	/**
	* Deletes the buy sell products with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products that was removed
	* @throws PortalException if a buy sell products with the primary key could not be found
	*/
	public static com.chola.productbuysell.model.BuySellProducts deleteBuySellProducts(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteBuySellProducts(id);
	}

	public static com.chola.productbuysell.model.BuySellProducts fetchBuySellProducts(
		long id) {
		return getService().fetchBuySellProducts(id);
	}

	/**
	* Returns the buy sell products with the primary key.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products
	* @throws PortalException if a buy sell products with the primary key could not be found
	*/
	public static com.chola.productbuysell.model.BuySellProducts getBuySellProducts(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBuySellProducts(id);
	}

	/**
	* Updates the buy sell products in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param buySellProducts the buy sell products
	* @return the buy sell products that was updated
	*/
	public static com.chola.productbuysell.model.BuySellProducts updateBuySellProducts(
		com.chola.productbuysell.model.BuySellProducts buySellProducts) {
		return getService().updateBuySellProducts(buySellProducts);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of buy sell productses.
	*
	* @return the number of buy sell productses
	*/
	public static int getBuySellProductsesCount() {
		return getService().getBuySellProductsesCount();
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
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
	public static java.util.List<com.chola.productbuysell.model.BuySellProducts> getBuySellProductses(
		int start, int end) {
		return getService().getBuySellProductses(start, end);
	}

	public static java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsCategoryAndLocationWise(
		int location_id, int category_id) {
		return getService()
				   .getProductsCategoryAndLocationWise(location_id, category_id);
	}

	public static java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsCategoryLocationSearchWise(
		int category_id, int location, java.lang.String title) {
		return getService()
				   .getProductsCategoryLocationSearchWise(category_id,
			location, title);
	}

	public static java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsCategorySearchWise(
		int category_id, java.lang.String title) {
		return getService().getProductsCategorySearchWise(category_id, title);
	}

	public static java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsCategoryWise(
		int category_id) {
		return getService().getProductsCategoryWise(category_id);
	}

	public static java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsLocationSearchWise(
		int location, java.lang.String title) {
		return getService().getProductsLocationSearchWise(location, title);
	}

	public static java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsLocationWise(
		int location_id) {
		return getService().getProductsLocationWise(location_id);
	}

	public static java.util.List<com.chola.productbuysell.model.BuySellProducts> getProductsTitleBasedSearch(
		java.lang.String title) {
		return getService().getProductsTitleBasedSearch(title);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void clearService() {
		_service = null;
	}

	public static BuySellProductsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BuySellProductsLocalService.class.getName());

			if (invokableLocalService instanceof BuySellProductsLocalService) {
				_service = (BuySellProductsLocalService)invokableLocalService;
			}
			else {
				_service = new BuySellProductsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BuySellProductsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static BuySellProductsLocalService _service;
}