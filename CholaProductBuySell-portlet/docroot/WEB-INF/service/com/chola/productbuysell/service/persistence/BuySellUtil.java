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

import com.chola.productbuysell.model.BuySell;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the buy sell service. This utility wraps {@link com.chola.productbuysell.service.persistence.impl.BuySellPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySellPersistence
 * @see com.chola.productbuysell.service.persistence.impl.BuySellPersistenceImpl
 * @generated
 */
@ProviderType
public class BuySellUtil {
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
	public static void clearCache(BuySell buySell) {
		getPersistence().clearCache(buySell);
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
	public static List<BuySell> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BuySell> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BuySell> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BuySell> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BuySell update(BuySell buySell) {
		return getPersistence().update(buySell);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BuySell update(BuySell buySell, ServiceContext serviceContext) {
		return getPersistence().update(buySell, serviceContext);
	}

	/**
	* Caches the buy sell in the entity cache if it is enabled.
	*
	* @param buySell the buy sell
	*/
	public static void cacheResult(BuySell buySell) {
		getPersistence().cacheResult(buySell);
	}

	/**
	* Caches the buy sells in the entity cache if it is enabled.
	*
	* @param buySells the buy sells
	*/
	public static void cacheResult(List<BuySell> buySells) {
		getPersistence().cacheResult(buySells);
	}

	/**
	* Creates a new buy sell with the primary key. Does not add the buy sell to the database.
	*
	* @param id the primary key for the new buy sell
	* @return the new buy sell
	*/
	public static BuySell create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the buy sell with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell that was removed
	* @throws NoSuchBuySellException if a buy sell with the primary key could not be found
	*/
	public static BuySell remove(long id)
		throws com.chola.productbuysell.exception.NoSuchBuySellException {
		return getPersistence().remove(id);
	}

	public static BuySell updateImpl(BuySell buySell) {
		return getPersistence().updateImpl(buySell);
	}

	/**
	* Returns the buy sell with the primary key or throws a {@link NoSuchBuySellException} if it could not be found.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell
	* @throws NoSuchBuySellException if a buy sell with the primary key could not be found
	*/
	public static BuySell findByPrimaryKey(long id)
		throws com.chola.productbuysell.exception.NoSuchBuySellException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the buy sell with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the buy sell
	* @return the buy sell, or <code>null</code> if a buy sell with the primary key could not be found
	*/
	public static BuySell fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, BuySell> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the buy sells.
	*
	* @return the buy sells
	*/
	public static List<BuySell> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<BuySell> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<BuySell> findAll(int start, int end,
		OrderByComparator<BuySell> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<BuySell> findAll(int start, int end,
		OrderByComparator<BuySell> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the buy sells from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of buy sells.
	*
	* @return the number of buy sells
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static BuySellPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BuySellPersistence)PortletBeanLocatorUtil.locate(com.chola.productbuysell.service.ClpSerializer.getServletContextName(),
					BuySellPersistence.class.getName());

			ReferenceRegistry.registerReference(BuySellUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static BuySellPersistence _persistence;
}