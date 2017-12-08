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

import com.chola.productbuysell.exception.NoSuchBuySellProductsImagesException;
import com.chola.productbuysell.model.BuySellProductsImages;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the buy sell products images service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see com.chola.productbuysell.service.persistence.impl.BuySellProductsImagesPersistenceImpl
 * @see BuySellProductsImagesUtil
 * @generated
 */
@ProviderType
public interface BuySellProductsImagesPersistence extends BasePersistence<BuySellProductsImages> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BuySellProductsImagesUtil} to access the buy sell products images persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the buy sell products imageses where product_id = &#63;.
	*
	* @param product_id the product_id
	* @return the matching buy sell products imageses
	*/
	public java.util.List<BuySellProductsImages> findByPRODUCTSIMAGES(
		long product_id);

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
	public java.util.List<BuySellProductsImages> findByPRODUCTSIMAGES(
		long product_id, int start, int end);

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
	public java.util.List<BuySellProductsImages> findByPRODUCTSIMAGES(
		long product_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator);

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
	public java.util.List<BuySellProductsImages> findByPRODUCTSIMAGES(
		long product_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products images
	* @throws NoSuchBuySellProductsImagesException if a matching buy sell products images could not be found
	*/
	public BuySellProductsImages findByPRODUCTSIMAGES_First(long product_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator)
		throws NoSuchBuySellProductsImagesException;

	/**
	* Returns the first buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching buy sell products images, or <code>null</code> if a matching buy sell products images could not be found
	*/
	public BuySellProductsImages fetchByPRODUCTSIMAGES_First(long product_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator);

	/**
	* Returns the last buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products images
	* @throws NoSuchBuySellProductsImagesException if a matching buy sell products images could not be found
	*/
	public BuySellProductsImages findByPRODUCTSIMAGES_Last(long product_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator)
		throws NoSuchBuySellProductsImagesException;

	/**
	* Returns the last buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching buy sell products images, or <code>null</code> if a matching buy sell products images could not be found
	*/
	public BuySellProductsImages fetchByPRODUCTSIMAGES_Last(long product_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator);

	/**
	* Returns the buy sell products imageses before and after the current buy sell products images in the ordered set where product_id = &#63;.
	*
	* @param id the primary key of the current buy sell products images
	* @param product_id the product_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next buy sell products images
	* @throws NoSuchBuySellProductsImagesException if a buy sell products images with the primary key could not be found
	*/
	public BuySellProductsImages[] findByPRODUCTSIMAGES_PrevAndNext(long id,
		long product_id,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator)
		throws NoSuchBuySellProductsImagesException;

	/**
	* Removes all the buy sell products imageses where product_id = &#63; from the database.
	*
	* @param product_id the product_id
	*/
	public void removeByPRODUCTSIMAGES(long product_id);

	/**
	* Returns the number of buy sell products imageses where product_id = &#63;.
	*
	* @param product_id the product_id
	* @return the number of matching buy sell products imageses
	*/
	public int countByPRODUCTSIMAGES(long product_id);

	/**
	* Caches the buy sell products images in the entity cache if it is enabled.
	*
	* @param buySellProductsImages the buy sell products images
	*/
	public void cacheResult(BuySellProductsImages buySellProductsImages);

	/**
	* Caches the buy sell products imageses in the entity cache if it is enabled.
	*
	* @param buySellProductsImageses the buy sell products imageses
	*/
	public void cacheResult(
		java.util.List<BuySellProductsImages> buySellProductsImageses);

	/**
	* Creates a new buy sell products images with the primary key. Does not add the buy sell products images to the database.
	*
	* @param id the primary key for the new buy sell products images
	* @return the new buy sell products images
	*/
	public BuySellProductsImages create(long id);

	/**
	* Removes the buy sell products images with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell products images
	* @return the buy sell products images that was removed
	* @throws NoSuchBuySellProductsImagesException if a buy sell products images with the primary key could not be found
	*/
	public BuySellProductsImages remove(long id)
		throws NoSuchBuySellProductsImagesException;

	public BuySellProductsImages updateImpl(
		BuySellProductsImages buySellProductsImages);

	/**
	* Returns the buy sell products images with the primary key or throws a {@link NoSuchBuySellProductsImagesException} if it could not be found.
	*
	* @param id the primary key of the buy sell products images
	* @return the buy sell products images
	* @throws NoSuchBuySellProductsImagesException if a buy sell products images with the primary key could not be found
	*/
	public BuySellProductsImages findByPrimaryKey(long id)
		throws NoSuchBuySellProductsImagesException;

	/**
	* Returns the buy sell products images with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the buy sell products images
	* @return the buy sell products images, or <code>null</code> if a buy sell products images with the primary key could not be found
	*/
	public BuySellProductsImages fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, BuySellProductsImages> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the buy sell products imageses.
	*
	* @return the buy sell products imageses
	*/
	public java.util.List<BuySellProductsImages> findAll();

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
	public java.util.List<BuySellProductsImages> findAll(int start, int end);

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
	public java.util.List<BuySellProductsImages> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator);

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
	public java.util.List<BuySellProductsImages> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySellProductsImages> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the buy sell products imageses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of buy sell products imageses.
	*
	* @return the number of buy sell products imageses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}