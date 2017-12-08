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

import com.chola.productbuysell.exception.NoSuchBuySellProductsException;
import com.chola.productbuysell.model.BuySellProducts;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the buy sell products service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see com.chola.productbuysell.service.persistence.impl.BuySellProductsPersistenceImpl
 * @see BuySellProductsUtil
 * @generated
 */
@ProviderType
public interface BuySellProductsPersistence extends BasePersistence<BuySellProducts> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BuySellProductsUtil} to access the buy sell products persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the buy sell productses where category_id = &#63;.
	*
	* @param category_id the category_id
	* @return the matching buy sell productses
	*/
	public java.util.List<BuySellProducts> findByCATEGORY(long category_id);

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
	public java.util.List<BuySellProducts> findByCATEGORY(long category_id,
		int start, int end);

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
	public java.util.List<BuySellProducts> findByCATEGORY(long category_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public java.util.List<BuySellProducts> findByCATEGORY(long category_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63;.
	*
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findByCATEGORY_First(long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63;.
	*
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchByCATEGORY_First(long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63;.
	*
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findByCATEGORY_Last(long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63;.
	*
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchByCATEGORY_Last(long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where category_id = &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public BuySellProducts[] findByCATEGORY_PrevAndNext(long id,
		long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Removes all the buy sell productses where category_id = &#63; from the database.
	*
	* @param category_id the category_id
	*/
	public void removeByCATEGORY(long category_id);

	/**
	* Returns the number of buy sell productses where category_id = &#63;.
	*
	* @param category_id the category_id
	* @return the number of matching buy sell productses
	*/
	public int countByCATEGORY(long category_id);

	/**
	* Returns all the buy sell productses where location = &#63;.
	*
	* @param location the location
	* @return the matching buy sell productses
	*/
	public java.util.List<BuySellProducts> findByLOCATION(long location);

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
	public java.util.List<BuySellProducts> findByLOCATION(long location,
		int start, int end);

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
	public java.util.List<BuySellProducts> findByLOCATION(long location,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public java.util.List<BuySellProducts> findByLOCATION(long location,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first buy sell products in the ordered set where location = &#63;.
	*
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findByLOCATION_First(long location,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the first buy sell products in the ordered set where location = &#63;.
	*
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchByLOCATION_First(long location,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the last buy sell products in the ordered set where location = &#63;.
	*
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findByLOCATION_Last(long location,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the last buy sell products in the ordered set where location = &#63;.
	*
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchByLOCATION_Last(long location,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where location = &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public BuySellProducts[] findByLOCATION_PrevAndNext(long id, long location,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Removes all the buy sell productses where location = &#63; from the database.
	*
	* @param location the location
	*/
	public void removeByLOCATION(long location);

	/**
	* Returns the number of buy sell productses where location = &#63;.
	*
	* @param location the location
	* @return the number of matching buy sell productses
	*/
	public int countByLOCATION(long location);

	/**
	* Returns all the buy sell productses where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @return the matching buy sell productses
	*/
	public java.util.List<BuySellProducts> findByCATEGORYANDLOCATION(
		long location, long category_id);

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
	public java.util.List<BuySellProducts> findByCATEGORYANDLOCATION(
		long location, long category_id, int start, int end);

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
	public java.util.List<BuySellProducts> findByCATEGORYANDLOCATION(
		long location, long category_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public java.util.List<BuySellProducts> findByCATEGORYANDLOCATION(
		long location, long category_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findByCATEGORYANDLOCATION_First(long location,
		long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the first buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchByCATEGORYANDLOCATION_First(long location,
		long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the last buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findByCATEGORYANDLOCATION_Last(long location,
		long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the last buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchByCATEGORYANDLOCATION_Last(long location,
		long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public BuySellProducts[] findByCATEGORYANDLOCATION_PrevAndNext(long id,
		long location, long category_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Removes all the buy sell productses where location = &#63; and category_id = &#63; from the database.
	*
	* @param location the location
	* @param category_id the category_id
	*/
	public void removeByCATEGORYANDLOCATION(long location, long category_id);

	/**
	* Returns the number of buy sell productses where location = &#63; and category_id = &#63;.
	*
	* @param location the location
	* @param category_id the category_id
	* @return the number of matching buy sell productses
	*/
	public int countByCATEGORYANDLOCATION(long location, long category_id);

	/**
	* Returns all the buy sell productses where title LIKE &#63;.
	*
	* @param title the title
	* @return the matching buy sell productses
	*/
	public java.util.List<BuySellProducts> findByTITLEBASEDSEARCH(
		java.lang.String title);

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
	public java.util.List<BuySellProducts> findByTITLEBASEDSEARCH(
		java.lang.String title, int start, int end);

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
	public java.util.List<BuySellProducts> findByTITLEBASEDSEARCH(
		java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public java.util.List<BuySellProducts> findByTITLEBASEDSEARCH(
		java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findByTITLEBASEDSEARCH_First(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the first buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchByTITLEBASEDSEARCH_First(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the last buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findByTITLEBASEDSEARCH_Last(java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the last buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchByTITLEBASEDSEARCH_Last(
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the buy sell productses before and after the current buy sell products in the ordered set where title LIKE &#63;.
	*
	* @param id the primary key of the current buy sell products
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public BuySellProducts[] findByTITLEBASEDSEARCH_PrevAndNext(long id,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Removes all the buy sell productses where title LIKE &#63; from the database.
	*
	* @param title the title
	*/
	public void removeByTITLEBASEDSEARCH(java.lang.String title);

	/**
	* Returns the number of buy sell productses where title LIKE &#63;.
	*
	* @param title the title
	* @return the number of matching buy sell productses
	*/
	public int countByTITLEBASEDSEARCH(java.lang.String title);

	/**
	* Returns all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @return the matching buy sell productses
	*/
	public java.util.List<BuySellProducts> findBycategoryAndSearch(
		long category_id, java.lang.String title);

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
	public java.util.List<BuySellProducts> findBycategoryAndSearch(
		long category_id, java.lang.String title, int start, int end);

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
	public java.util.List<BuySellProducts> findBycategoryAndSearch(
		long category_id, java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public java.util.List<BuySellProducts> findBycategoryAndSearch(
		long category_id, java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findBycategoryAndSearch_First(long category_id,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchBycategoryAndSearch_First(long category_id,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findBycategoryAndSearch_Last(long category_id,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchBycategoryAndSearch_Last(long category_id,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public BuySellProducts[] findBycategoryAndSearch_PrevAndNext(long id,
		long category_id, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Removes all the buy sell productses where category_id = &#63; and title LIKE &#63; from the database.
	*
	* @param category_id the category_id
	* @param title the title
	*/
	public void removeBycategoryAndSearch(long category_id,
		java.lang.String title);

	/**
	* Returns the number of buy sell productses where category_id = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param title the title
	* @return the number of matching buy sell productses
	*/
	public int countBycategoryAndSearch(long category_id, java.lang.String title);

	/**
	* Returns all the buy sell productses where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @return the matching buy sell productses
	*/
	public java.util.List<BuySellProducts> findBylocationAndSearch(
		long location, java.lang.String title);

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
	public java.util.List<BuySellProducts> findBylocationAndSearch(
		long location, java.lang.String title, int start, int end);

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
	public java.util.List<BuySellProducts> findBylocationAndSearch(
		long location, java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public java.util.List<BuySellProducts> findBylocationAndSearch(
		long location, java.lang.String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findBylocationAndSearch_First(long location,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the first buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchBylocationAndSearch_First(long location,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

	/**
	* Returns the last buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products
	* @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	*/
	public BuySellProducts findBylocationAndSearch_Last(long location,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the last buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchBylocationAndSearch_Last(long location,
		java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public BuySellProducts[] findBylocationAndSearch_PrevAndNext(long id,
		long location, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Removes all the buy sell productses where location = &#63; and title LIKE &#63; from the database.
	*
	* @param location the location
	* @param title the title
	*/
	public void removeBylocationAndSearch(long location, java.lang.String title);

	/**
	* Returns the number of buy sell productses where location = &#63; and title LIKE &#63;.
	*
	* @param location the location
	* @param title the title
	* @return the number of matching buy sell productses
	*/
	public int countBylocationAndSearch(long location, java.lang.String title);

	/**
	* Returns all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @return the matching buy sell productses
	*/
	public java.util.List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, java.lang.String title);

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
	public java.util.List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, java.lang.String title, int start,
		int end);

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
	public java.util.List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, java.lang.String title, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public java.util.List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, java.lang.String title, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache);

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
	public BuySellProducts findBycategoryLocationAndSearch_First(
		long category_id, long location, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the first buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchBycategoryLocationAndSearch_First(
		long category_id, long location, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public BuySellProducts findBycategoryLocationAndSearch_Last(
		long category_id, long location, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the last buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	*/
	public BuySellProducts fetchBycategoryLocationAndSearch_Last(
		long category_id, long location, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public BuySellProducts[] findBycategoryLocationAndSearch_PrevAndNext(
		long id, long category_id, long location, java.lang.String title,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException;

	/**
	* Removes all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63; from the database.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	*/
	public void removeBycategoryLocationAndSearch(long category_id,
		long location, java.lang.String title);

	/**
	* Returns the number of buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	*
	* @param category_id the category_id
	* @param location the location
	* @param title the title
	* @return the number of matching buy sell productses
	*/
	public int countBycategoryLocationAndSearch(long category_id,
		long location, java.lang.String title);

	/**
	* Caches the buy sell products in the entity cache if it is enabled.
	*
	* @param buySellProducts the buy sell products
	*/
	public void cacheResult(BuySellProducts buySellProducts);

	/**
	* Caches the buy sell productses in the entity cache if it is enabled.
	*
	* @param buySellProductses the buy sell productses
	*/
	public void cacheResult(java.util.List<BuySellProducts> buySellProductses);

	/**
	* Creates a new buy sell products with the primary key. Does not add the buy sell products to the database.
	*
	* @param id the primary key for the new buy sell products
	* @return the new buy sell products
	*/
	public BuySellProducts create(long id);

	/**
	* Removes the buy sell products with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products that was removed
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public BuySellProducts remove(long id)
		throws NoSuchBuySellProductsException;

	public BuySellProducts updateImpl(BuySellProducts buySellProducts);

	/**
	* Returns the buy sell products with the primary key or throws a {@link NoSuchBuySellProductsException} if it could not be found.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products
	* @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	*/
	public BuySellProducts findByPrimaryKey(long id)
		throws NoSuchBuySellProductsException;

	/**
	* Returns the buy sell products with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the buy sell products
	* @return the buy sell products, or <code>null</code> if a buy sell products with the primary key could not be found
	*/
	public BuySellProducts fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, BuySellProducts> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the buy sell productses.
	*
	* @return the buy sell productses
	*/
	public java.util.List<BuySellProducts> findAll();

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
	public java.util.List<BuySellProducts> findAll(int start, int end);

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
	public java.util.List<BuySellProducts> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator);

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
	public java.util.List<BuySellProducts> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the buy sell productses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of buy sell productses.
	*
	* @return the number of buy sell productses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}