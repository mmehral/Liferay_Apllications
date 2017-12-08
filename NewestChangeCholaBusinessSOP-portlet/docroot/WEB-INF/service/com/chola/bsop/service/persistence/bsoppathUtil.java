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

package com.chola.bsop.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.bsop.model.bsoppath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the bsoppath service. This utility wraps {@link com.chola.bsop.service.persistence.impl.bsoppathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see bsoppathPersistence
 * @see com.chola.bsop.service.persistence.impl.bsoppathPersistenceImpl
 * @generated
 */
@ProviderType
public class bsoppathUtil {
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
	public static void clearCache(bsoppath bsoppath) {
		getPersistence().clearCache(bsoppath);
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
	public static List<bsoppath> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<bsoppath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<bsoppath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<bsoppath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static bsoppath update(bsoppath bsoppath) {
		return getPersistence().update(bsoppath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static bsoppath update(bsoppath bsoppath,
		ServiceContext serviceContext) {
		return getPersistence().update(bsoppath, serviceContext);
	}

	/**
	* Returns all the bsoppaths where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @return the matching bsoppaths
	*/
	public static List<bsoppath> findBySOP_ID(long bdetails_id) {
		return getPersistence().findBySOP_ID(bdetails_id);
	}

	/**
	* Returns a range of all the bsoppaths where bdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetails_id the bdetails_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @return the range of matching bsoppaths
	*/
	public static List<bsoppath> findBySOP_ID(long bdetails_id, int start,
		int end) {
		return getPersistence().findBySOP_ID(bdetails_id, start, end);
	}

	/**
	* Returns an ordered range of all the bsoppaths where bdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetails_id the bdetails_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bsoppaths
	*/
	public static List<bsoppath> findBySOP_ID(long bdetails_id, int start,
		int end, OrderByComparator<bsoppath> orderByComparator) {
		return getPersistence()
				   .findBySOP_ID(bdetails_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bsoppaths where bdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetails_id the bdetails_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bsoppaths
	*/
	public static List<bsoppath> findBySOP_ID(long bdetails_id, int start,
		int end, OrderByComparator<bsoppath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySOP_ID(bdetails_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsoppath
	* @throws NoSuchbsoppathException if a matching bsoppath could not be found
	*/
	public static bsoppath findBySOP_ID_First(long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws com.chola.bsop.exception.NoSuchbsoppathException {
		return getPersistence()
				   .findBySOP_ID_First(bdetails_id, orderByComparator);
	}

	/**
	* Returns the first bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	*/
	public static bsoppath fetchBySOP_ID_First(long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator) {
		return getPersistence()
				   .fetchBySOP_ID_First(bdetails_id, orderByComparator);
	}

	/**
	* Returns the last bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsoppath
	* @throws NoSuchbsoppathException if a matching bsoppath could not be found
	*/
	public static bsoppath findBySOP_ID_Last(long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws com.chola.bsop.exception.NoSuchbsoppathException {
		return getPersistence().findBySOP_ID_Last(bdetails_id, orderByComparator);
	}

	/**
	* Returns the last bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	*/
	public static bsoppath fetchBySOP_ID_Last(long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator) {
		return getPersistence()
				   .fetchBySOP_ID_Last(bdetails_id, orderByComparator);
	}

	/**
	* Returns the bsoppaths before and after the current bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param id the primary key of the current bsoppath
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bsoppath
	* @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	*/
	public static bsoppath[] findBySOP_ID_PrevAndNext(long id,
		long bdetails_id, OrderByComparator<bsoppath> orderByComparator)
		throws com.chola.bsop.exception.NoSuchbsoppathException {
		return getPersistence()
				   .findBySOP_ID_PrevAndNext(id, bdetails_id, orderByComparator);
	}

	/**
	* Removes all the bsoppaths where bdetails_id = &#63; from the database.
	*
	* @param bdetails_id the bdetails_id
	*/
	public static void removeBySOP_ID(long bdetails_id) {
		getPersistence().removeBySOP_ID(bdetails_id);
	}

	/**
	* Returns the number of bsoppaths where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @return the number of matching bsoppaths
	*/
	public static int countBySOP_ID(long bdetails_id) {
		return getPersistence().countBySOP_ID(bdetails_id);
	}

	/**
	* Returns all the bsoppaths where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @return the matching bsoppaths
	*/
	public static List<bsoppath> findByCONTENT_ID(long bdetailscontent_id) {
		return getPersistence().findByCONTENT_ID(bdetailscontent_id);
	}

	/**
	* Returns a range of all the bsoppaths where bdetailscontent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @return the range of matching bsoppaths
	*/
	public static List<bsoppath> findByCONTENT_ID(long bdetailscontent_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(bdetailscontent_id, start, end);
	}

	/**
	* Returns an ordered range of all the bsoppaths where bdetailscontent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bsoppaths
	*/
	public static List<bsoppath> findByCONTENT_ID(long bdetailscontent_id,
		int start, int end, OrderByComparator<bsoppath> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(bdetailscontent_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the bsoppaths where bdetailscontent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bsoppaths
	*/
	public static List<bsoppath> findByCONTENT_ID(long bdetailscontent_id,
		int start, int end, OrderByComparator<bsoppath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(bdetailscontent_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsoppath
	* @throws NoSuchbsoppathException if a matching bsoppath could not be found
	*/
	public static bsoppath findByCONTENT_ID_First(long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws com.chola.bsop.exception.NoSuchbsoppathException {
		return getPersistence()
				   .findByCONTENT_ID_First(bdetailscontent_id, orderByComparator);
	}

	/**
	* Returns the first bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	*/
	public static bsoppath fetchByCONTENT_ID_First(long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(bdetailscontent_id,
			orderByComparator);
	}

	/**
	* Returns the last bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsoppath
	* @throws NoSuchbsoppathException if a matching bsoppath could not be found
	*/
	public static bsoppath findByCONTENT_ID_Last(long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws com.chola.bsop.exception.NoSuchbsoppathException {
		return getPersistence()
				   .findByCONTENT_ID_Last(bdetailscontent_id, orderByComparator);
	}

	/**
	* Returns the last bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	*/
	public static bsoppath fetchByCONTENT_ID_Last(long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(bdetailscontent_id, orderByComparator);
	}

	/**
	* Returns the bsoppaths before and after the current bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param id the primary key of the current bsoppath
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bsoppath
	* @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	*/
	public static bsoppath[] findByCONTENT_ID_PrevAndNext(long id,
		long bdetailscontent_id, OrderByComparator<bsoppath> orderByComparator)
		throws com.chola.bsop.exception.NoSuchbsoppathException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, bdetailscontent_id,
			orderByComparator);
	}

	/**
	* Removes all the bsoppaths where bdetailscontent_id = &#63; from the database.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	*/
	public static void removeByCONTENT_ID(long bdetailscontent_id) {
		getPersistence().removeByCONTENT_ID(bdetailscontent_id);
	}

	/**
	* Returns the number of bsoppaths where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @return the number of matching bsoppaths
	*/
	public static int countByCONTENT_ID(long bdetailscontent_id) {
		return getPersistence().countByCONTENT_ID(bdetailscontent_id);
	}

	/**
	* Caches the bsoppath in the entity cache if it is enabled.
	*
	* @param bsoppath the bsoppath
	*/
	public static void cacheResult(bsoppath bsoppath) {
		getPersistence().cacheResult(bsoppath);
	}

	/**
	* Caches the bsoppaths in the entity cache if it is enabled.
	*
	* @param bsoppaths the bsoppaths
	*/
	public static void cacheResult(List<bsoppath> bsoppaths) {
		getPersistence().cacheResult(bsoppaths);
	}

	/**
	* Creates a new bsoppath with the primary key. Does not add the bsoppath to the database.
	*
	* @param id the primary key for the new bsoppath
	* @return the new bsoppath
	*/
	public static bsoppath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the bsoppath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath that was removed
	* @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	*/
	public static bsoppath remove(long id)
		throws com.chola.bsop.exception.NoSuchbsoppathException {
		return getPersistence().remove(id);
	}

	public static bsoppath updateImpl(bsoppath bsoppath) {
		return getPersistence().updateImpl(bsoppath);
	}

	/**
	* Returns the bsoppath with the primary key or throws a {@link NoSuchbsoppathException} if it could not be found.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath
	* @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	*/
	public static bsoppath findByPrimaryKey(long id)
		throws com.chola.bsop.exception.NoSuchbsoppathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the bsoppath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath, or <code>null</code> if a bsoppath with the primary key could not be found
	*/
	public static bsoppath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, bsoppath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bsoppaths.
	*
	* @return the bsoppaths
	*/
	public static List<bsoppath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bsoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @return the range of bsoppaths
	*/
	public static List<bsoppath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bsoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bsoppaths
	*/
	public static List<bsoppath> findAll(int start, int end,
		OrderByComparator<bsoppath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bsoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bsoppaths
	*/
	public static List<bsoppath> findAll(int start, int end,
		OrderByComparator<bsoppath> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bsoppaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bsoppaths.
	*
	* @return the number of bsoppaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static bsoppathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (bsoppathPersistence)PortletBeanLocatorUtil.locate(com.chola.bsop.service.ClpSerializer.getServletContextName(),
					bsoppathPersistence.class.getName());

			ReferenceRegistry.registerReference(bsoppathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static bsoppathPersistence _persistence;
}