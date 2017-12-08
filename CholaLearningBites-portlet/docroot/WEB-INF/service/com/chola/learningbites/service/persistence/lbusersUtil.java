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

package com.chola.learningbites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.learningbites.model.lbusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the lbusers service. This utility wraps {@link com.chola.learningbites.service.persistence.impl.lbusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see lbusersPersistence
 * @see com.chola.learningbites.service.persistence.impl.lbusersPersistenceImpl
 * @generated
 */
@ProviderType
public class lbusersUtil {
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
	public static void clearCache(lbusers lbusers) {
		getPersistence().clearCache(lbusers);
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
	public static List<lbusers> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<lbusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<lbusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<lbusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static lbusers update(lbusers lbusers) {
		return getPersistence().update(lbusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static lbusers update(lbusers lbusers, ServiceContext serviceContext) {
		return getPersistence().update(lbusers, serviceContext);
	}

	/**
	* Returns all the lbuserses where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @return the matching lbuserses
	*/
	public static List<lbusers> findByLB_ID(long lb_id) {
		return getPersistence().findByLB_ID(lb_id);
	}

	/**
	* Returns a range of all the lbuserses where lb_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lb_id the lb_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @return the range of matching lbuserses
	*/
	public static List<lbusers> findByLB_ID(long lb_id, int start, int end) {
		return getPersistence().findByLB_ID(lb_id, start, end);
	}

	/**
	* Returns an ordered range of all the lbuserses where lb_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lb_id the lb_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lbuserses
	*/
	public static List<lbusers> findByLB_ID(long lb_id, int start, int end,
		OrderByComparator<lbusers> orderByComparator) {
		return getPersistence().findByLB_ID(lb_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lbuserses where lb_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lb_id the lb_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lbuserses
	*/
	public static List<lbusers> findByLB_ID(long lb_id, int start, int end,
		OrderByComparator<lbusers> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByLB_ID(lb_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lbusers in the ordered set where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbusers
	* @throws NoSuchlbusersException if a matching lbusers could not be found
	*/
	public static lbusers findByLB_ID_First(long lb_id,
		OrderByComparator<lbusers> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbusersException {
		return getPersistence().findByLB_ID_First(lb_id, orderByComparator);
	}

	/**
	* Returns the first lbusers in the ordered set where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbusers, or <code>null</code> if a matching lbusers could not be found
	*/
	public static lbusers fetchByLB_ID_First(long lb_id,
		OrderByComparator<lbusers> orderByComparator) {
		return getPersistence().fetchByLB_ID_First(lb_id, orderByComparator);
	}

	/**
	* Returns the last lbusers in the ordered set where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbusers
	* @throws NoSuchlbusersException if a matching lbusers could not be found
	*/
	public static lbusers findByLB_ID_Last(long lb_id,
		OrderByComparator<lbusers> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbusersException {
		return getPersistence().findByLB_ID_Last(lb_id, orderByComparator);
	}

	/**
	* Returns the last lbusers in the ordered set where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbusers, or <code>null</code> if a matching lbusers could not be found
	*/
	public static lbusers fetchByLB_ID_Last(long lb_id,
		OrderByComparator<lbusers> orderByComparator) {
		return getPersistence().fetchByLB_ID_Last(lb_id, orderByComparator);
	}

	/**
	* Returns the lbuserses before and after the current lbusers in the ordered set where lb_id = &#63;.
	*
	* @param id the primary key of the current lbusers
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lbusers
	* @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	*/
	public static lbusers[] findByLB_ID_PrevAndNext(long id, long lb_id,
		OrderByComparator<lbusers> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbusersException {
		return getPersistence()
				   .findByLB_ID_PrevAndNext(id, lb_id, orderByComparator);
	}

	/**
	* Removes all the lbuserses where lb_id = &#63; from the database.
	*
	* @param lb_id the lb_id
	*/
	public static void removeByLB_ID(long lb_id) {
		getPersistence().removeByLB_ID(lb_id);
	}

	/**
	* Returns the number of lbuserses where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @return the number of matching lbuserses
	*/
	public static int countByLB_ID(long lb_id) {
		return getPersistence().countByLB_ID(lb_id);
	}

	/**
	* Returns all the lbuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching lbuserses
	*/
	public static List<lbusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the lbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @return the range of matching lbuserses
	*/
	public static List<lbusers> findByUSER_ID(long user_id, int start, int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the lbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lbuserses
	*/
	public static List<lbusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<lbusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lbuserses
	*/
	public static List<lbusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<lbusers> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbusers
	* @throws NoSuchlbusersException if a matching lbusers could not be found
	*/
	public static lbusers findByUSER_ID_First(long user_id,
		OrderByComparator<lbusers> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first lbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbusers, or <code>null</code> if a matching lbusers could not be found
	*/
	public static lbusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<lbusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last lbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbusers
	* @throws NoSuchlbusersException if a matching lbusers could not be found
	*/
	public static lbusers findByUSER_ID_Last(long user_id,
		OrderByComparator<lbusers> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last lbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbusers, or <code>null</code> if a matching lbusers could not be found
	*/
	public static lbusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<lbusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the lbuserses before and after the current lbusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current lbusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lbusers
	* @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	*/
	public static lbusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<lbusers> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the lbuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of lbuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching lbuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the lbusers in the entity cache if it is enabled.
	*
	* @param lbusers the lbusers
	*/
	public static void cacheResult(lbusers lbusers) {
		getPersistence().cacheResult(lbusers);
	}

	/**
	* Caches the lbuserses in the entity cache if it is enabled.
	*
	* @param lbuserses the lbuserses
	*/
	public static void cacheResult(List<lbusers> lbuserses) {
		getPersistence().cacheResult(lbuserses);
	}

	/**
	* Creates a new lbusers with the primary key. Does not add the lbusers to the database.
	*
	* @param id the primary key for the new lbusers
	* @return the new lbusers
	*/
	public static lbusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the lbusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lbusers
	* @return the lbusers that was removed
	* @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	*/
	public static lbusers remove(long id)
		throws com.chola.learningbites.exception.NoSuchlbusersException {
		return getPersistence().remove(id);
	}

	public static lbusers updateImpl(lbusers lbusers) {
		return getPersistence().updateImpl(lbusers);
	}

	/**
	* Returns the lbusers with the primary key or throws a {@link NoSuchlbusersException} if it could not be found.
	*
	* @param id the primary key of the lbusers
	* @return the lbusers
	* @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	*/
	public static lbusers findByPrimaryKey(long id)
		throws com.chola.learningbites.exception.NoSuchlbusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the lbusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lbusers
	* @return the lbusers, or <code>null</code> if a lbusers with the primary key could not be found
	*/
	public static lbusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, lbusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the lbuserses.
	*
	* @return the lbuserses
	*/
	public static List<lbusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @return the range of lbuserses
	*/
	public static List<lbusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lbuserses
	*/
	public static List<lbusers> findAll(int start, int end,
		OrderByComparator<lbusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of lbuserses
	*/
	public static List<lbusers> findAll(int start, int end,
		OrderByComparator<lbusers> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the lbuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lbuserses.
	*
	* @return the number of lbuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static lbusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (lbusersPersistence)PortletBeanLocatorUtil.locate(com.chola.learningbites.service.ClpSerializer.getServletContextName(),
					lbusersPersistence.class.getName());

			ReferenceRegistry.registerReference(lbusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static lbusersPersistence _persistence;
}