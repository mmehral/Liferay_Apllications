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

package com.chola.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.model.businesssopusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the businesssopusers service. This utility wraps {@link com.chola.business.service.persistence.impl.businesssopusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see businesssopusersPersistence
 * @see com.chola.business.service.persistence.impl.businesssopusersPersistenceImpl
 * @generated
 */
@ProviderType
public class businesssopusersUtil {
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
	public static void clearCache(businesssopusers businesssopusers) {
		getPersistence().clearCache(businesssopusers);
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
	public static List<businesssopusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<businesssopusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<businesssopusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<businesssopusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static businesssopusers update(businesssopusers businesssopusers) {
		return getPersistence().update(businesssopusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static businesssopusers update(businesssopusers businesssopusers,
		ServiceContext serviceContext) {
		return getPersistence().update(businesssopusers, serviceContext);
	}

	/**
	* Returns all the businesssopuserses where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the matching businesssopuserses
	*/
	public static List<businesssopusers> findByBUSINESS_ID(
		long businessdetails_id) {
		return getPersistence().findByBUSINESS_ID(businessdetails_id);
	}

	/**
	* Returns a range of all the businesssopuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @return the range of matching businesssopuserses
	*/
	public static List<businesssopusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end) {
		return getPersistence().findByBUSINESS_ID(businessdetails_id, start, end);
	}

	/**
	* Returns an ordered range of all the businesssopuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesssopuserses
	*/
	public static List<businesssopusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end,
		OrderByComparator<businesssopusers> orderByComparator) {
		return getPersistence()
				   .findByBUSINESS_ID(businessdetails_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the businesssopuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businesssopuserses
	*/
	public static List<businesssopusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end,
		OrderByComparator<businesssopusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByBUSINESS_ID(businessdetails_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssopusers
	* @throws NoSuchbusinesssopusersException if a matching businesssopusers could not be found
	*/
	public static businesssopusers findByBUSINESS_ID_First(
		long businessdetails_id,
		OrderByComparator<businesssopusers> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssopusersException {
		return getPersistence()
				   .findByBUSINESS_ID_First(businessdetails_id,
			orderByComparator);
	}

	/**
	* Returns the first businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssopusers, or <code>null</code> if a matching businesssopusers could not be found
	*/
	public static businesssopusers fetchByBUSINESS_ID_First(
		long businessdetails_id,
		OrderByComparator<businesssopusers> orderByComparator) {
		return getPersistence()
				   .fetchByBUSINESS_ID_First(businessdetails_id,
			orderByComparator);
	}

	/**
	* Returns the last businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssopusers
	* @throws NoSuchbusinesssopusersException if a matching businesssopusers could not be found
	*/
	public static businesssopusers findByBUSINESS_ID_Last(
		long businessdetails_id,
		OrderByComparator<businesssopusers> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssopusersException {
		return getPersistence()
				   .findByBUSINESS_ID_Last(businessdetails_id, orderByComparator);
	}

	/**
	* Returns the last businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssopusers, or <code>null</code> if a matching businesssopusers could not be found
	*/
	public static businesssopusers fetchByBUSINESS_ID_Last(
		long businessdetails_id,
		OrderByComparator<businesssopusers> orderByComparator) {
		return getPersistence()
				   .fetchByBUSINESS_ID_Last(businessdetails_id,
			orderByComparator);
	}

	/**
	* Returns the businesssopuserses before and after the current businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param id the primary key of the current businesssopusers
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businesssopusers
	* @throws NoSuchbusinesssopusersException if a businesssopusers with the primary key could not be found
	*/
	public static businesssopusers[] findByBUSINESS_ID_PrevAndNext(long id,
		long businessdetails_id,
		OrderByComparator<businesssopusers> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssopusersException {
		return getPersistence()
				   .findByBUSINESS_ID_PrevAndNext(id, businessdetails_id,
			orderByComparator);
	}

	/**
	* Removes all the businesssopuserses where businessdetails_id = &#63; from the database.
	*
	* @param businessdetails_id the businessdetails_id
	*/
	public static void removeByBUSINESS_ID(long businessdetails_id) {
		getPersistence().removeByBUSINESS_ID(businessdetails_id);
	}

	/**
	* Returns the number of businesssopuserses where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the number of matching businesssopuserses
	*/
	public static int countByBUSINESS_ID(long businessdetails_id) {
		return getPersistence().countByBUSINESS_ID(businessdetails_id);
	}

	/**
	* Returns all the businesssopuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching businesssopuserses
	*/
	public static List<businesssopusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the businesssopuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @return the range of matching businesssopuserses
	*/
	public static List<businesssopusers> findByUSER_ID(long user_id, int start,
		int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the businesssopuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesssopuserses
	*/
	public static List<businesssopusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<businesssopusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the businesssopuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businesssopuserses
	*/
	public static List<businesssopusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<businesssopusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssopusers
	* @throws NoSuchbusinesssopusersException if a matching businesssopusers could not be found
	*/
	public static businesssopusers findByUSER_ID_First(long user_id,
		OrderByComparator<businesssopusers> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssopusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssopusers, or <code>null</code> if a matching businesssopusers could not be found
	*/
	public static businesssopusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<businesssopusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssopusers
	* @throws NoSuchbusinesssopusersException if a matching businesssopusers could not be found
	*/
	public static businesssopusers findByUSER_ID_Last(long user_id,
		OrderByComparator<businesssopusers> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssopusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssopusers, or <code>null</code> if a matching businesssopusers could not be found
	*/
	public static businesssopusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<businesssopusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the businesssopuserses before and after the current businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current businesssopusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businesssopusers
	* @throws NoSuchbusinesssopusersException if a businesssopusers with the primary key could not be found
	*/
	public static businesssopusers[] findByUSER_ID_PrevAndNext(long id,
		long user_id, OrderByComparator<businesssopusers> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssopusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the businesssopuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of businesssopuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching businesssopuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the businesssopusers in the entity cache if it is enabled.
	*
	* @param businesssopusers the businesssopusers
	*/
	public static void cacheResult(businesssopusers businesssopusers) {
		getPersistence().cacheResult(businesssopusers);
	}

	/**
	* Caches the businesssopuserses in the entity cache if it is enabled.
	*
	* @param businesssopuserses the businesssopuserses
	*/
	public static void cacheResult(List<businesssopusers> businesssopuserses) {
		getPersistence().cacheResult(businesssopuserses);
	}

	/**
	* Creates a new businesssopusers with the primary key. Does not add the businesssopusers to the database.
	*
	* @param id the primary key for the new businesssopusers
	* @return the new businesssopusers
	*/
	public static businesssopusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the businesssopusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssopusers
	* @return the businesssopusers that was removed
	* @throws NoSuchbusinesssopusersException if a businesssopusers with the primary key could not be found
	*/
	public static businesssopusers remove(long id)
		throws com.chola.business.exception.NoSuchbusinesssopusersException {
		return getPersistence().remove(id);
	}

	public static businesssopusers updateImpl(businesssopusers businesssopusers) {
		return getPersistence().updateImpl(businesssopusers);
	}

	/**
	* Returns the businesssopusers with the primary key or throws a {@link NoSuchbusinesssopusersException} if it could not be found.
	*
	* @param id the primary key of the businesssopusers
	* @return the businesssopusers
	* @throws NoSuchbusinesssopusersException if a businesssopusers with the primary key could not be found
	*/
	public static businesssopusers findByPrimaryKey(long id)
		throws com.chola.business.exception.NoSuchbusinesssopusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the businesssopusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businesssopusers
	* @return the businesssopusers, or <code>null</code> if a businesssopusers with the primary key could not be found
	*/
	public static businesssopusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, businesssopusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the businesssopuserses.
	*
	* @return the businesssopuserses
	*/
	public static List<businesssopusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the businesssopuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @return the range of businesssopuserses
	*/
	public static List<businesssopusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the businesssopuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesssopuserses
	*/
	public static List<businesssopusers> findAll(int start, int end,
		OrderByComparator<businesssopusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the businesssopuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businesssopuserses
	*/
	public static List<businesssopusers> findAll(int start, int end,
		OrderByComparator<businesssopusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the businesssopuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of businesssopuserses.
	*
	* @return the number of businesssopuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static businesssopusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (businesssopusersPersistence)PortletBeanLocatorUtil.locate(com.chola.business.service.ClpSerializer.getServletContextName(),
					businesssopusersPersistence.class.getName());

			ReferenceRegistry.registerReference(businesssopusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static businesssopusersPersistence _persistence;
}