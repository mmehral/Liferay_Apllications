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

package com.chola.productbuysell.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.productbuysell.model.BuySellProducts;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the buy sell products service. This utility wraps {@link com.chola.productbuysell.service.persistence.impl.BuySellProductsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySellProductsPersistence
 * @see com.chola.productbuysell.service.persistence.impl.BuySellProductsPersistenceImpl
 * @generated
 */
@ProviderType
public class BuySellProductsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(BuySellProducts buySellProducts) {
		getPersistence().clearCache(buySellProducts);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BuySellProducts> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BuySellProducts> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BuySellProducts> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BuySellProducts update(BuySellProducts buySellProducts) {
		return getPersistence().update(buySellProducts);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BuySellProducts update(BuySellProducts buySellProducts,
		ServiceContext serviceContext) {
		return getPersistence().update(buySellProducts, serviceContext);
	}

	/**
	* Returns all the buy sell productses where category_id = &#63;.
	*
	* @param category_id the category_id
	* @return the matching buy sell productses
	*/
	public static List<BuySellProducts> findByCATEGORY(long category_id) {
		return getPersistence().findByCATEGORY(category_id);
	}

	/**
	* Returns a range of all the buy sell productses where category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByCATEGORY(long category_id,
		int start, int end) {
		return getPersistence().findByCATEGORY(category_id, start, end);
	}

	/**
	* Returns an ordered range of all the buy sell productses where category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByCATEGORY(long category_id,
		int start, int end, OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .findByCATEGORY(category_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell productses where category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByCATEGORY(long category_id,
		int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCATEGORY(category_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63;.
	*
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findByCATEGORY_First(long category_id,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByCATEGORY_First(category_id, orderByComparator);
	}

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63;.
	*
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchByCATEGORY_First(long category_id,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchByCATEGORY_First(category_id, orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63;.
	*
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findByCATEGORY_Last(long category_id,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByCATEGORY_Last(category_id, orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63;.
	*
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchByCATEGORY_Last(long category_id,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchByCATEGORY_Last(category_id, orderByComparator);
	}

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where category_id = &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts[] findByCATEGORY_PrevAndNext(long id,
		long category_id, OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByCATEGORY_PrevAndNext(id, category_id,
			orderByComparator);
	}

	/**
	* Removes all the buy sell productses where category_id = &#63; from the database.
	*
	* @param category_id the category_id
	*/
	public static void removeByCATEGORY(long category_id) {
		getPersistence().removeByCATEGORY(category_id);
	}

	/**
	* Returns the number of buy sell productses where category_id = &#63;.
	*
	* @param category_id the category_id
	* @return the number of matching buy sell productses
	*/
	public static int countByCATEGORY(long category_id) {
		return getPersistence().countByCATEGORY(category_id);
	}

	/**
	* Returns all the buy sell productses where location = &#63;.
	*
	* @param location the location
	* @return the matching buy sell productses
	*/
	public static List<BuySellProducts> findByLOCATION(long location) {
		return getPersistence().findByLOCATION(location);
	}

	/**
	* Returns a range of all the buy sell productses where location = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByLOCATION(long location,
		int start, int end) {
		return getPersistence().findByLOCATION(location, start, end);
	}

	/**
	* Returns an ordered range of all the buy sell productses where location = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByLOCATION(long location,
		int start, int end, OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .findByLOCATION(location, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell productses where location = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByLOCATION(long location,
		int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLOCATION(location, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first buy sell products in the ordered set where location = &#63;.
	*
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findByLOCATION_First(long location,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence().findByLOCATION_First(location, orderByComparator);
	}

	/**
	* Returns the first buy sell products in the ordered set where location = &#63;.
	*
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchByLOCATION_First(long location,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchByLOCATION_First(location, orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where location = &#63;.
	*
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findByLOCATION_Last(long location,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence().findByLOCATION_Last(location, orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where location = &#63;.
	*
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchByLOCATION_Last(long location,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence().fetchByLOCATION_Last(location, orderByComparator);
	}

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where location = &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts[] findByLOCATION_PrevAndNext(long id,
		long location, OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByLOCATION_PrevAndNext(id, location, orderByComparator);
	}

	/**
	* Removes all the buy sell productses where location = &#63; from the database.
	*
	* @param location the location
	*/
	public static void removeByLOCATION(long location) {
		getPersistence().removeByLOCATION(location);
	}

	/**
	* Returns the number of buy sell productses where location = &#63;.
	*
	* @param location the location
	* @return the number of matching buy sell productses
	*/
	public static int countByLOCATION(long location) {
		return getPersistence().countByLOCATION(location);
	}

	/**
	* Returns all the buy sell productses where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @return the matching buy sell productses
	*/
	public static List<BuySellProducts> findByCATEGORYANDLOCATION(
		long location, long category_id) {
		return getPersistence().findByCATEGORYANDLOCATION(location, category_id);
	}

	/**
	* Returns a range of all the buy sell productses where location = &#63; and category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param category_id the category_id
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByCATEGORYANDLOCATION(
		long location, long category_id, int start, int end) {
		return getPersistence()
				   .findByCATEGORYANDLOCATION(location, category_id, start, end);
	}

	/**
	* Returns an ordered range of all the buy sell productses where location = &#63; and category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param category_id the category_id
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByCATEGORYANDLOCATION(
		long location, long category_id, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .findByCATEGORYANDLOCATION(location, category_id, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell productses where location = &#63; and category_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param category_id the category_id
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByCATEGORYANDLOCATION(
		long location, long category_id, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCATEGORYANDLOCATION(location, category_id, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findByCATEGORYANDLOCATION_First(
		long location, long category_id,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByCATEGORYANDLOCATION_First(location, category_id,
			orderByComparator);
	}

	/**
	* Returns the first buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchByCATEGORYANDLOCATION_First(
		long location, long category_id,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchByCATEGORYANDLOCATION_First(location, category_id,
			orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findByCATEGORYANDLOCATION_Last(
		long location, long category_id,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByCATEGORYANDLOCATION_Last(location, category_id,
			orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchByCATEGORYANDLOCATION_Last(
		long location, long category_id,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchByCATEGORYANDLOCATION_Last(location, category_id,
			orderByComparator);
	}

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts[] findByCATEGORYANDLOCATION_PrevAndNext(
		long id, long location, long category_id,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByCATEGORYANDLOCATION_PrevAndNext(id, location,
			category_id, orderByComparator);
	}

	/**
	* Removes all the buy sell productses where location = &#63; and category_id = &#63; from the database.
	*
	* @param location the location
	* @param category_id the category_id
	*/
	public static void removeByCATEGORYANDLOCATION(long location,
		long category_id) {
		getPersistence().removeByCATEGORYANDLOCATION(location, category_id);
	}

	/**
	* Returns the number of buy sell productses where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @return the number of matching buy sell productses
	*/
	public static int countByCATEGORYANDLOCATION(long location, long category_id) {
		return getPersistence().countByCATEGORYANDLOCATION(location, category_id);
	}

	/**
	* Returns all the buy sell productses where title LIKE &#63;.
	*
	* @param title the title
	* @return the matching buy sell productses
	*/
	public static List<BuySellProducts> findByTITLEBASEDSEARCH(
		java.lang.String title) {
		return getPersistence().findByTITLEBASEDSEARCH(title);
	}

	/**
	* Returns a range of all the buy sell productses where title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByTITLEBASEDSEARCH(
		java.lang.String title, int start, int end) {
		return getPersistence().findByTITLEBASEDSEARCH(title, start, end);
	}

	/**
	* Returns an ordered range of all the buy sell productses where title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByTITLEBASEDSEARCH(
		java.lang.String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .findByTITLEBASEDSEARCH(title, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell productses where title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findByTITLEBASEDSEARCH(
		java.lang.String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTITLEBASEDSEARCH(title, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findByTITLEBASEDSEARCH_First(
		java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByTITLEBASEDSEARCH_First(title, orderByComparator);
	}

	/**
	* Returns the first buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchByTITLEBASEDSEARCH_First(
		java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchByTITLEBASEDSEARCH_First(title, orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findByTITLEBASEDSEARCH_Last(
		java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByTITLEBASEDSEARCH_Last(title, orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchByTITLEBASEDSEARCH_Last(
		java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchByTITLEBASEDSEARCH_Last(title, orderByComparator);
	}

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts[] findByTITLEBASEDSEARCH_PrevAndNext(
		long id, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findByTITLEBASEDSEARCH_PrevAndNext(id, title,
			orderByComparator);
	}

	/**
	* Removes all the buy sell productses where title LIKE &#63; from the database.
	*
	* @param title the title
	*/
	public static void removeByTITLEBASEDSEARCH(java.lang.String title) {
		getPersistence().removeByTITLEBASEDSEARCH(title);
	}

	/**
	* Returns the number of buy sell productses where title LIKE &#63;.
	*
	* @param title the title
	* @return the number of matching buy sell productses
	*/
	public static int countByTITLEBASEDSEARCH(java.lang.String title) {
		return getPersistence().countByTITLEBASEDSEARCH(title);
	}

	/**
	* Returns all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @return the matching buy sell productses
	*/
	public static List<BuySellProducts> findBycategoryAndSearch(
		long category_id, java.lang.String title) {
		return getPersistence().findBycategoryAndSearch(category_id, title);
	}

	/**
	* Returns a range of all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBycategoryAndSearch(
		long category_id, java.lang.String title, int start, int end) {
		return getPersistence()
				   .findBycategoryAndSearch(category_id, title, start, end);
	}

	/**
	* Returns an ordered range of all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBycategoryAndSearch(
		long category_id, java.lang.String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .findBycategoryAndSearch(category_id, title, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBycategoryAndSearch(
		long category_id, java.lang.String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycategoryAndSearch(category_id, title, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findBycategoryAndSearch_First(
		long category_id, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBycategoryAndSearch_First(category_id, title,
			orderByComparator);
	}

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchBycategoryAndSearch_First(
		long category_id, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchBycategoryAndSearch_First(category_id, title,
			orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findBycategoryAndSearch_Last(
		long category_id, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBycategoryAndSearch_Last(category_id, title,
			orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchBycategoryAndSearch_Last(
		long category_id, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchBycategoryAndSearch_Last(category_id, title,
			orderByComparator);
	}

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts[] findBycategoryAndSearch_PrevAndNext(
		long id, long category_id, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBycategoryAndSearch_PrevAndNext(id, category_id, title,
			orderByComparator);
	}

	/**
	* Removes all the buy sell productses where category_id = &#63; and title LIKE &#63; from the database.
	*
	* @param category_id the category_id
	* @param title the title
	*/
	public static void removeBycategoryAndSearch(long category_id,
		java.lang.String title) {
		getPersistence().removeBycategoryAndSearch(category_id, title);
	}

	/**
	* Returns the number of buy sell productses where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @return the number of matching buy sell productses
	*/
	public static int countBycategoryAndSearch(long category_id,
		java.lang.String title) {
		return getPersistence().countBycategoryAndSearch(category_id, title);
	}

	/**
	* Returns all the buy sell productses where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @return the matching buy sell productses
	*/
	public static List<BuySellProducts> findBylocationAndSearch(long location,
		java.lang.String title) {
		return getPersistence().findBylocationAndSearch(location, title);
	}

	/**
	* Returns a range of all the buy sell productses where location = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBylocationAndSearch(long location,
		java.lang.String title, int start, int end) {
		return getPersistence()
				   .findBylocationAndSearch(location, title, start, end);
	}

	/**
	* Returns an ordered range of all the buy sell productses where location = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBylocationAndSearch(long location,
		java.lang.String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .findBylocationAndSearch(location, title, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell productses where location = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param location the location
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBylocationAndSearch(long location,
		java.lang.String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBylocationAndSearch(location, title, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findBylocationAndSearch_First(long location,
		java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBylocationAndSearch_First(location, title,
			orderByComparator);
	}

	/**
	* Returns the first buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchBylocationAndSearch_First(
		long location, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchBylocationAndSearch_First(location, title,
			orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findBylocationAndSearch_Last(long location,
		java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBylocationAndSearch_Last(location, title,
			orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchBylocationAndSearch_Last(long location,
		java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchBylocationAndSearch_Last(location, title,
			orderByComparator);
	}

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts[] findBylocationAndSearch_PrevAndNext(
		long id, long location, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBylocationAndSearch_PrevAndNext(id, location, title,
			orderByComparator);
	}

	/**
	* Removes all the buy sell productses where location = &#63; and title LIKE &#63; from the database.
	*
	* @param location the location
	* @param title the title
	*/
	public static void removeBylocationAndSearch(long location,
		java.lang.String title) {
		getPersistence().removeBylocationAndSearch(location, title);
	}

	/**
	* Returns the number of buy sell productses where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @return the number of matching buy sell productses
	*/
	public static int countBylocationAndSearch(long location,
		java.lang.String title) {
		return getPersistence().countBylocationAndSearch(location, title);
	}

	/**
	* Returns all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @return the matching buy sell productses
	*/
	public static List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, java.lang.String title) {
		return getPersistence()
				   .findBycategoryLocationAndSearch(category_id, location, title);
	}

	/**
	* Returns a range of all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, java.lang.String title, int start,
		int end) {
		return getPersistence()
				   .findBycategoryLocationAndSearch(category_id, location,
			title, start, end);
	}

	/**
	* Returns an ordered range of all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, java.lang.String title, int start,
		int end, OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .findBycategoryLocationAndSearch(category_id, location,
			title, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buy sell productses
	*/
	public static List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, java.lang.String title, int start,
		int end, OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycategoryLocationAndSearch(category_id, location,
			title, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findBycategoryLocationAndSearch_First(
		long category_id, long location, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBycategoryLocationAndSearch_First(category_id,
			location, title, orderByComparator);
	}

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchBycategoryLocationAndSearch_First(
		long category_id, long location, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchBycategoryLocationAndSearch_First(category_id,
			location, title, orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public static BuySellProducts findBycategoryLocationAndSearch_Last(
		long category_id, long location, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBycategoryLocationAndSearch_Last(category_id, location,
			title, orderByComparator);
	}

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public static BuySellProducts fetchBycategoryLocationAndSearch_Last(
		long category_id, long location, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence()
				   .fetchBycategoryLocationAndSearch_Last(category_id,
			location, title, orderByComparator);
	}

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts[] findBycategoryLocationAndSearch_PrevAndNext(
		long id, long category_id, long location, java.lang.String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence()
				   .findBycategoryLocationAndSearch_PrevAndNext(id,
			category_id, location, title, orderByComparator);
	}

	/**
	* Removes all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63; from the database.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	*/
	public static void removeBycategoryLocationAndSearch(long category_id,
		long location, java.lang.String title) {
		getPersistence()
			.removeBycategoryLocationAndSearch(category_id, location, title);
	}

	/**
	* Returns the number of buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @return the number of matching buy sell productses
	*/
	public static int countBycategoryLocationAndSearch(long category_id,
		long location, java.lang.String title) {
		return getPersistence()
				   .countBycategoryLocationAndSearch(category_id, location,
			title);
	}

	/**
	* Caches the buy sell products in the entity cache if it is enabled.
	*
	* @param buySellProducts the buy sell products
	*/
	public static void cacheResult(BuySellProducts buySellProducts) {
		getPersistence().cacheResult(buySellProducts);
	}

	/**
	* Caches the buy sell productses in the entity cache if it is enabled.
	*
	* @param buySellProductses the buy sell productses
	*/
	public static void cacheResult(List<BuySellProducts> buySellProductses) {
		getPersistence().cacheResult(buySellProductses);
	}

	/**
	* Creates a new buy sell products with the primary key. Does not add the buy sell products to the database.
	*
	* @param id the primary key for the new buy sell products
	* @return the new buy sell products
	*/
	public static BuySellProducts create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the buy sell products with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products that was removed
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts remove(long id)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence().remove(id);
	}

	public static BuySellProducts updateImpl(BuySellProducts buySellProducts) {
		return getPersistence().updateImpl(buySellProducts);
	}

	/**
	* Returns the buy sell products with the primary key or throws a {@link NoSuchBuySellProductsException} if it could not be found.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts findByPrimaryKey(long id)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the buy sell products with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products, or <code>null</code> if a buy sell products with the primary key could not be found
	*/
	public static BuySellProducts fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, BuySellProducts> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the buy sell productses.
	*
	* @return the buy sell productses
	*/
	public static List<BuySellProducts> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the buy sell productses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @return the range of buy sell productses
	*/
	public static List<BuySellProducts> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the buy sell productses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of buy sell productses
	*/
	public static List<BuySellProducts> findAll(int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell productses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sell productses
	* @param end the upper bound of the range of buy sell productses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of buy sell productses
	*/
	public static List<BuySellProducts> findAll(int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the buy sell productses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of buy sell productses.
	*
	* @return the number of buy sell productses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static BuySellProductsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BuySellProductsPersistence)PortletBeanLocatorUtil.locate(com.chola.productbuysell.service.ClpSerializer.getServletContextName(),
					BuySellProductsPersistence.class.getName());

			ReferenceRegistry.registerReference(BuySellProductsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static BuySellProductsPersistence _persistence;
}