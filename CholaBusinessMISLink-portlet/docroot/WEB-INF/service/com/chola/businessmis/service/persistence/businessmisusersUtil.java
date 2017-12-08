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

package com.chola.businessmis.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.model.businessmisusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the businessmisusers service. This utility wraps {@link com.chola.businessmis.service.persistence.impl.businessmisusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see businessmisusersPersistence
 * @see com.chola.businessmis.service.persistence.impl.businessmisusersPersistenceImpl
 * @generated
 */
@ProviderType
public class businessmisusersUtil {
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
	public static void clearCache(businessmisusers businessmisusers) {
		getPersistence().clearCache(businessmisusers);
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
	public static List<businessmisusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<businessmisusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<businessmisusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<businessmisusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static businessmisusers update(businessmisusers businessmisusers) {
		return getPersistence().update(businessmisusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static businessmisusers update(businessmisusers businessmisusers,
		ServiceContext serviceContext) {
		return getPersistence().update(businessmisusers, serviceContext);
	}

	/**
	* Returns all the businessmisuserses where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the matching businessmisuserses
	*/
	public static List<businessmisusers> findByBUSINESS_ID(
		long businessdetails_id) {
		return getPersistence().findByBUSINESS_ID(businessdetails_id);
	}

	/**
	* Returns a range of all the businessmisuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @return the range of matching businessmisuserses
	*/
	public static List<businessmisusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end) {
		return getPersistence().findByBUSINESS_ID(businessdetails_id, start, end);
	}

	/**
	* Returns an ordered range of all the businessmisuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businessmisuserses
	*/
	public static List<businessmisusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end,
		OrderByComparator<businessmisusers> orderByComparator) {
		return getPersistence()
				   .findByBUSINESS_ID(businessdetails_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the businessmisuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businessmisuserses
	*/
	public static List<businessmisusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end,
		OrderByComparator<businessmisusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByBUSINESS_ID(businessdetails_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first businessmisusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businessmisusers
	* @throws NoSuchbusinessmisusersException if a matching businessmisusers could not be found
	*/
	public static businessmisusers findByBUSINESS_ID_First(
		long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisusersException {
		return getPersistence()
				   .findByBUSINESS_ID_First(businessdetails_id,
			orderByComparator);
	}

	/**
	* Returns the first businessmisusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businessmisusers, or <code>null</code> if a matching businessmisusers could not be found
	*/
	public static businessmisusers fetchByBUSINESS_ID_First(
		long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator) {
		return getPersistence()
				   .fetchByBUSINESS_ID_First(businessdetails_id,
			orderByComparator);
	}

	/**
	* Returns the last businessmisusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businessmisusers
	* @throws NoSuchbusinessmisusersException if a matching businessmisusers could not be found
	*/
	public static businessmisusers findByBUSINESS_ID_Last(
		long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisusersException {
		return getPersistence()
				   .findByBUSINESS_ID_Last(businessdetails_id, orderByComparator);
	}

	/**
	* Returns the last businessmisusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businessmisusers, or <code>null</code> if a matching businessmisusers could not be found
	*/
	public static businessmisusers fetchByBUSINESS_ID_Last(
		long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator) {
		return getPersistence()
				   .fetchByBUSINESS_ID_Last(businessdetails_id,
			orderByComparator);
	}

	/**
	* Returns the businessmisuserses before and after the current businessmisusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param id the primary key of the current businessmisusers
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businessmisusers
	* @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	*/
	public static businessmisusers[] findByBUSINESS_ID_PrevAndNext(long id,
		long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisusersException {
		return getPersistence()
				   .findByBUSINESS_ID_PrevAndNext(id, businessdetails_id,
			orderByComparator);
	}

	/**
	* Removes all the businessmisuserses where businessdetails_id = &#63; from the database.
	*
	* @param businessdetails_id the businessdetails_id
	*/
	public static void removeByBUSINESS_ID(long businessdetails_id) {
		getPersistence().removeByBUSINESS_ID(businessdetails_id);
	}

	/**
	* Returns the number of businessmisuserses where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the number of matching businessmisuserses
	*/
	public static int countByBUSINESS_ID(long businessdetails_id) {
		return getPersistence().countByBUSINESS_ID(businessdetails_id);
	}

	/**
	* Returns all the businessmisuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching businessmisuserses
	*/
	public static List<businessmisusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the businessmisuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @return the range of matching businessmisuserses
	*/
	public static List<businessmisusers> findByUSER_ID(long user_id, int start,
		int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the businessmisuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businessmisuserses
	*/
	public static List<businessmisusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<businessmisusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the businessmisuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businessmisuserses
	*/
	public static List<businessmisusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<businessmisusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first businessmisusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businessmisusers
	* @throws NoSuchbusinessmisusersException if a matching businessmisusers could not be found
	*/
	public static businessmisusers findByUSER_ID_First(long user_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first businessmisusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businessmisusers, or <code>null</code> if a matching businessmisusers could not be found
	*/
	public static businessmisusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<businessmisusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last businessmisusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businessmisusers
	* @throws NoSuchbusinessmisusersException if a matching businessmisusers could not be found
	*/
	public static businessmisusers findByUSER_ID_Last(long user_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last businessmisusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businessmisusers, or <code>null</code> if a matching businessmisusers could not be found
	*/
	public static businessmisusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<businessmisusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the businessmisuserses before and after the current businessmisusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current businessmisusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businessmisusers
	* @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	*/
	public static businessmisusers[] findByUSER_ID_PrevAndNext(long id,
		long user_id, OrderByComparator<businessmisusers> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the businessmisuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of businessmisuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching businessmisuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the businessmisusers in the entity cache if it is enabled.
	*
	* @param businessmisusers the businessmisusers
	*/
	public static void cacheResult(businessmisusers businessmisusers) {
		getPersistence().cacheResult(businessmisusers);
	}

	/**
	* Caches the businessmisuserses in the entity cache if it is enabled.
	*
	* @param businessmisuserses the businessmisuserses
	*/
	public static void cacheResult(List<businessmisusers> businessmisuserses) {
		getPersistence().cacheResult(businessmisuserses);
	}

	/**
	* Creates a new businessmisusers with the primary key. Does not add the businessmisusers to the database.
	*
	* @param id the primary key for the new businessmisusers
	* @return the new businessmisusers
	*/
	public static businessmisusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the businessmisusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businessmisusers
	* @return the businessmisusers that was removed
	* @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	*/
	public static businessmisusers remove(long id)
		throws com.chola.businessmis.exception.NoSuchbusinessmisusersException {
		return getPersistence().remove(id);
	}

	public static businessmisusers updateImpl(businessmisusers businessmisusers) {
		return getPersistence().updateImpl(businessmisusers);
	}

	/**
	* Returns the businessmisusers with the primary key or throws a {@link NoSuchbusinessmisusersException} if it could not be found.
	*
	* @param id the primary key of the businessmisusers
	* @return the businessmisusers
	* @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	*/
	public static businessmisusers findByPrimaryKey(long id)
		throws com.chola.businessmis.exception.NoSuchbusinessmisusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the businessmisusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businessmisusers
	* @return the businessmisusers, or <code>null</code> if a businessmisusers with the primary key could not be found
	*/
	public static businessmisusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, businessmisusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the businessmisuserses.
	*
	* @return the businessmisuserses
	*/
	public static List<businessmisusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the businessmisuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @return the range of businessmisuserses
	*/
	public static List<businessmisusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the businessmisuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businessmisuserses
	*/
	public static List<businessmisusers> findAll(int start, int end,
		OrderByComparator<businessmisusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the businessmisuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businessmisuserses
	*/
	public static List<businessmisusers> findAll(int start, int end,
		OrderByComparator<businessmisusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the businessmisuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of businessmisuserses.
	*
	* @return the number of businessmisuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static businessmisusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (businessmisusersPersistence)PortletBeanLocatorUtil.locate(com.chola.businessmis.service.ClpSerializer.getServletContextName(),
					businessmisusersPersistence.class.getName());

			ReferenceRegistry.registerReference(businessmisusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static businessmisusersPersistence _persistence;
}