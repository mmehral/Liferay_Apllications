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

import com.chola.productbuysell.exception.NoSuchBuySellException;
import com.chola.productbuysell.model.BuySell;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the buy sell service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see com.chola.productbuysell.service.persistence.impl.BuySellPersistenceImpl
 * @see BuySellUtil
 * @generated
 */
@ProviderType
public interface BuySellPersistence extends BasePersistence<BuySell> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BuySellUtil} to access the buy sell persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the buy sell in the entity cache if it is enabled.
	*
	* @param buySell the buy sell
	*/
	public void cacheResult(BuySell buySell);

	/**
	* Caches the buy sells in the entity cache if it is enabled.
	*
	* @param buySells the buy sells
	*/
	public void cacheResult(java.util.List<BuySell> buySells);

	/**
	* Creates a new buy sell with the primary key. Does not add the buy sell to the database.
	*
	* @param id the primary key for the new buy sell
	* @return the new buy sell
	*/
	public BuySell create(long id);

	/**
	* Removes the buy sell with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell that was removed
	* @throws NoSuchBuySellException if a buy sell with the primary key could not be found
	*/
	public BuySell remove(long id) throws NoSuchBuySellException;

	public BuySell updateImpl(BuySell buySell);

	/**
	* Returns the buy sell with the primary key or throws a {@link NoSuchBuySellException} if it could not be found.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell
	* @throws NoSuchBuySellException if a buy sell with the primary key could not be found
	*/
	public BuySell findByPrimaryKey(long id) throws NoSuchBuySellException;

	/**
	* Returns the buy sell with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell, or <code>null</code> if a buy sell with the primary key could not be found
	*/
	public BuySell fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, BuySell> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the buy sells.
	*
	* @return the buy sells
	*/
	public java.util.List<BuySell> findAll();

	/**
	* Returns a range of all the buy sells.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sells
	* @param end the upper bound of the range of buy sells (not inclusive)
	* @return the range of buy sells
	*/
	public java.util.List<BuySell> findAll(int start, int end);

	/**
	* Returns an ordered range of all the buy sells.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sells
	* @param end the upper bound of the range of buy sells (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of buy sells
	*/
	public java.util.List<BuySell> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySell> orderByComparator);

	/**
	* Returns an ordered range of all the buy sells.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of buy sells
	* @param end the upper bound of the range of buy sells (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of buy sells
	*/
	public java.util.List<BuySell> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BuySell> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the buy sells from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of buy sells.
	*
	* @return the number of buy sells
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}