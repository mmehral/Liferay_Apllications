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
 * Provides the local service utility for BuySell. This utility wraps
 * {@link com.chola.productbuysell.service.impl.BuySellLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay03
 * @see BuySellLocalService
 * @see com.chola.productbuysell.service.base.BuySellLocalServiceBaseImpl
 * @see com.chola.productbuysell.service.impl.BuySellLocalServiceImpl
 * @generated
 */
@ProviderType
public class BuySellLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.productbuysell.service.impl.BuySellLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the buy sell to the database. Also notifies the appropriate model listeners.
	*
	* @param buySell the buy sell
	* @return the buy sell that was added
	*/
	public static com.chola.productbuysell.model.BuySell addBuySell(
		com.chola.productbuysell.model.BuySell buySell) {
		return getService().addBuySell(buySell);
	}

	/**
	* Creates a new buy sell with the primary key. Does not add the buy sell to the database.
	*
	* @param id the primary key for the new buy sell
	* @return the new buy sell
	*/
	public static com.chola.productbuysell.model.BuySell createBuySell(long id) {
		return getService().createBuySell(id);
	}

	/**
	* Deletes the buy sell from the database. Also notifies the appropriate model listeners.
	*
	* @param buySell the buy sell
	* @return the buy sell that was removed
	*/
	public static com.chola.productbuysell.model.BuySell deleteBuySell(
		com.chola.productbuysell.model.BuySell buySell) {
		return getService().deleteBuySell(buySell);
	}

	/**
	* Deletes the buy sell with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell that was removed
	* @throws PortalException if a buy sell with the primary key could not be found
	*/
	public static com.chola.productbuysell.model.BuySell deleteBuySell(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteBuySell(id);
	}

	public static com.chola.productbuysell.model.BuySell fetchBuySell(long id) {
		return getService().fetchBuySell(id);
	}

	/**
	* Returns the buy sell with the primary key.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell
	* @throws PortalException if a buy sell with the primary key could not be found
	*/
	public static com.chola.productbuysell.model.BuySell getBuySell(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBuySell(id);
	}

	/**
	* Updates the buy sell in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param buySell the buy sell
	* @return the buy sell that was updated
	*/
	public static com.chola.productbuysell.model.BuySell updateBuySell(
		com.chola.productbuysell.model.BuySell buySell) {
		return getService().updateBuySell(buySell);
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
	* Returns the number of buy sells.
	*
	* @return the number of buy sells
	*/
	public static int getBuySellsCount() {
		return getService().getBuySellsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.productbuysell.model.impl.BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<com.chola.productbuysell.model.BuySell> getBuySells(
		int start, int end) {
		return getService().getBuySells(start, end);
	}

	public static java.util.List<java.lang.Object[]> getLocationList() {
		return getService().getLocationList();
	}

	public static java.util.List<java.lang.Object[]> getProductCategoryList() {
		return getService().getProductCategoryList();
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

	public static BuySellLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BuySellLocalService.class.getName());

			if (invokableLocalService instanceof BuySellLocalService) {
				_service = (BuySellLocalService)invokableLocalService;
			}
			else {
				_service = new BuySellLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(BuySellLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static BuySellLocalService _service;
}