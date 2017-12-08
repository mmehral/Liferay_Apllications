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

import com.chola.productbuysell.model.BuySellProductsImages;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the buy sell products images service. This utility wraps {@link com.chola.productbuysell.service.persistence.impl.BuySellProductsImagesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySellProductsImagesPersistence
 * @see com.chola.productbuysell.service.persistence.impl.BuySellProductsImagesPersistenceImpl
 * @generated
 */
@ProviderType
public class BuySellProductsImagesUtil {
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
	public static void clearCache(BuySellProductsImages buySellProductsImages) {
		getPersistence().clearCache(buySellProductsImages);
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
	public static List<BuySellProductsImages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BuySellProductsImages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BuySellProductsImages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BuySellProductsImages> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BuySellProductsImages update(
		BuySellProductsImages buySellProductsImages) {
		return getPersistence().update(buySellProductsImages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BuySellProductsImages update(
		BuySellProductsImages buySellProductsImages,
		ServiceContext serviceContext) {
		return getPersistence().update(buySellProductsImages, serviceContext);
	}

	/**
	* Returns all the buy sell products imageses where product_id = &#63;.
	*
	* @param product_id the product_id
	* @return the matching buy sell products imageses
	*/
	public static List<BuySellProductsImages> findByPRODUCTSIMAGES(
		long product_id) {
		return getPersistence().findByPRODUCTSIMAGES(product_id);
	}

	/**
	* Returns a range of all the buy sell products imageses where product_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param product_id the product_id
	* @param start the lower bound of the range of buy sell products imageses
	* @param end the upper bound of the range of buy sell products imageses (not inclusive)
	* @return the range of matching buy sell products imageses
	*/
	public static List<BuySellProductsImages> findByPRODUCTSIMAGES(
		long product_id, int start, int end) {
		return getPersistence().findByPRODUCTSIMAGES(product_id, start, end);
	}

	/**
	* Returns an ordered range of all the buy sell products imageses where product_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param product_id the product_id
	* @param start the lower bound of the range of buy sell products imageses
	* @param end the upper bound of the range of buy sell products imageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching buy sell products imageses
	*/
	public static List<BuySellProductsImages> findByPRODUCTSIMAGES(
		long product_id, int start, int end,
		OrderByComparator<BuySellProductsImages> orderByComparator) {
		return getPersistence()
				   .findByPRODUCTSIMAGES(product_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell products imageses where product_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param product_id the product_id
	* @param start the lower bound of the range of buy sell products imageses
	* @param end the upper bound of the range of buy sell products imageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching buy sell products imageses
	*/
	public static List<BuySellProductsImages> findByPRODUCTSIMAGES(
		long product_id, int start, int end,
		OrderByComparator<BuySellProductsImages> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPRODUCTSIMAGES(product_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products images
	* @throws NoSuchBuySellProductsImagesException if a matching buy sell products images could not be found
	*/
	public static BuySellProductsImages findByPRODUCTSIMAGES_First(
		long product_id,
		OrderByComparator<BuySellProductsImages> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsImagesException {
		return getPersistence()
				   .findByPRODUCTSIMAGES_First(product_id, orderByComparator);
	}

	/**
	* Returns the first buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products images, or <code>null</code> if a matching buy sell products images could not be found
	*/
	public static BuySellProductsImages fetchByPRODUCTSIMAGES_First(
		long product_id,
		OrderByComparator<BuySellProductsImages> orderByComparator) {
		return getPersistence()
				   .fetchByPRODUCTSIMAGES_First(product_id, orderByComparator);
	}

	/**
	* Returns the last buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products images
	* @throws NoSuchBuySellProductsImagesException if a matching buy sell products images could not be found
	*/
	public static BuySellProductsImages findByPRODUCTSIMAGES_Last(
		long product_id,
		OrderByComparator<BuySellProductsImages> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsImagesException {
		return getPersistence()
				   .findByPRODUCTSIMAGES_Last(product_id, orderByComparator);
	}

	/**
	* Returns the last buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products images, or <code>null</code> if a matching buy sell products images could not be found
	*/
	public static BuySellProductsImages fetchByPRODUCTSIMAGES_Last(
		long product_id,
		OrderByComparator<BuySellProductsImages> orderByComparator) {
		return getPersistence()
				   .fetchByPRODUCTSIMAGES_Last(product_id, orderByComparator);
	}

	/**
	* Returns the buy sell products imageses before and after the current buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param id the primary key of the current buy sell products images
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products images
	* @throws NoSuchBuySellProductsImagesException if a buy sell products images with the primary key could not be found
	*/
	public static BuySellProductsImages[] findByPRODUCTSIMAGES_PrevAndNext(
		long id, long product_id,
		OrderByComparator<BuySellProductsImages> orderByComparator)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsImagesException {
		return getPersistence()
				   .findByPRODUCTSIMAGES_PrevAndNext(id, product_id,
			orderByComparator);
	}

	/**
	* Removes all the buy sell products imageses where product_id = &#63; from the database.
	*
	* @param product_id the product_id
	*/
	public static void removeByPRODUCTSIMAGES(long product_id) {
		getPersistence().removeByPRODUCTSIMAGES(product_id);
	}

	/**
	* Returns the number of buy sell products imageses where product_id = &#63;.
	*
	* @param product_id the product_id
	* @return the number of matching buy sell products imageses
	*/
	public static int countByPRODUCTSIMAGES(long product_id) {
		return getPersistence().countByPRODUCTSIMAGES(product_id);
	}

	/**
	* Caches the buy sell products images in the entity cache if it is enabled.
	*
	* @param buySellProductsImages the buy sell products images
	*/
	public static void cacheResult(BuySellProductsImages buySellProductsImages) {
		getPersistence().cacheResult(buySellProductsImages);
	}

	/**
	* Caches the buy sell products imageses in the entity cache if it is enabled.
	*
	* @param buySellProductsImageses the buy sell products imageses
	*/
	public static void cacheResult(
		List<BuySellProductsImages> buySellProductsImageses) {
		getPersistence().cacheResult(buySellProductsImageses);
	}

	/**
	* Creates a new buy sell products images with the primary key. Does not add the buy sell products images to the database.
	*
	* @param id the primary key for the new buy sell products images
	* @return the new buy sell products images
	*/
	public static BuySellProductsImages create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the buy sell products images with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell products images
	* @return the buy sell products images that was removed
	* @throws NoSuchBuySellProductsImagesException if a buy sell products images with the primary key could not be found
	*/
	public static BuySellProductsImages remove(long id)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsImagesException {
		return getPersistence().remove(id);
	}

	public static BuySellProductsImages updateImpl(
		BuySellProductsImages buySellProductsImages) {
		return getPersistence().updateImpl(buySellProductsImages);
	}

	/**
	* Returns the buy sell products images with the primary key or throws a {@link NoSuchBuySellProductsImagesException} if it could not be found.
	*
	* @param id the primary key of the buy sell products images
	* @return the buy sell products images
	* @throws NoSuchBuySellProductsImagesException if a buy sell products images with the primary key could not be found
	*/
	public static BuySellProductsImages findByPrimaryKey(long id)
		throws com.chola.productbuysell.exception.NoSuchBuySellProductsImagesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the buy sell products images with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the buy sell products images
	* @return the buy sell products images, or <code>null</code> if a buy sell products images with the primary key could not be found
	*/
	public static BuySellProductsImages fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, BuySellProductsImages> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the buy sell products imageses.
	*
	* @return the buy sell products imageses
	*/
	public static List<BuySellProductsImages> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the buy sell products imageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sell products imageses
	* @param end the upper bound of the range of buy sell products imageses (not inclusive)
	* @return the range of buy sell products imageses
	*/
	public static List<BuySellProductsImages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the buy sell products imageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sell products imageses
	* @param end the upper bound of the range of buy sell products imageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of buy sell products imageses
	*/
	public static List<BuySellProductsImages> findAll(int start, int end,
		OrderByComparator<BuySellProductsImages> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the buy sell products imageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsImagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sell products imageses
	* @param end the upper bound of the range of buy sell products imageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of buy sell products imageses
	*/
	public static List<BuySellProductsImages> findAll(int start, int end,
		OrderByComparator<BuySellProductsImages> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the buy sell products imageses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of buy sell products imageses.
	*
	* @return the number of buy sell products imageses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static BuySellProductsImagesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BuySellProductsImagesPersistence)PortletBeanLocatorUtil.locate(com.chola.productbuysell.service.ClpSerializer.getServletContextName(),
					BuySellProductsImagesPersistence.class.getName());

			ReferenceRegistry.registerReference(BuySellProductsImagesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static BuySellProductsImagesPersistence _persistence;
}