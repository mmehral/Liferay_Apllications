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

package com.chola.successstories.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.model.ssusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the ssusers service. This utility wraps {@link com.chola.successstories.service.persistence.impl.ssusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see ssusersPersistence
 * @see com.chola.successstories.service.persistence.impl.ssusersPersistenceImpl
 * @generated
 */
@ProviderType
public class ssusersUtil {
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
	public static void clearCache(ssusers ssusers) {
		getPersistence().clearCache(ssusers);
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
	public static List<ssusers> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ssusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ssusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ssusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ssusers update(ssusers ssusers) {
		return getPersistence().update(ssusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ssusers update(ssusers ssusers, ServiceContext serviceContext) {
		return getPersistence().update(ssusers, serviceContext);
	}

	/**
	* Returns all the ssuserses where ssdetails_id = &#63;.
	*
	* @param ssdetails_id the ssdetails_id
	* @return the matching ssuserses
	*/
	public static List<ssusers> findBySS_ID(long ssdetails_id) {
		return getPersistence().findBySS_ID(ssdetails_id);
	}

	/**
	* Returns a range of all the ssuserses where ssdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ssdetails_id the ssdetails_id
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @return the range of matching ssuserses
	*/
	public static List<ssusers> findBySS_ID(long ssdetails_id, int start,
		int end) {
		return getPersistence().findBySS_ID(ssdetails_id, start, end);
	}

	/**
	* Returns an ordered range of all the ssuserses where ssdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ssdetails_id the ssdetails_id
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ssuserses
	*/
	public static List<ssusers> findBySS_ID(long ssdetails_id, int start,
		int end, OrderByComparator<ssusers> orderByComparator) {
		return getPersistence()
				   .findBySS_ID(ssdetails_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ssuserses where ssdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ssdetails_id the ssdetails_id
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ssuserses
	*/
	public static List<ssusers> findBySS_ID(long ssdetails_id, int start,
		int end, OrderByComparator<ssusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySS_ID(ssdetails_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ssusers in the ordered set where ssdetails_id = &#63;.
	*
	* @param ssdetails_id the ssdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ssusers
	* @throws NoSuchssusersException if a matching ssusers could not be found
	*/
	public static ssusers findBySS_ID_First(long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssusersException {
		return getPersistence()
				   .findBySS_ID_First(ssdetails_id, orderByComparator);
	}

	/**
	* Returns the first ssusers in the ordered set where ssdetails_id = &#63;.
	*
	* @param ssdetails_id the ssdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ssusers, or <code>null</code> if a matching ssusers could not be found
	*/
	public static ssusers fetchBySS_ID_First(long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator) {
		return getPersistence()
				   .fetchBySS_ID_First(ssdetails_id, orderByComparator);
	}

	/**
	* Returns the last ssusers in the ordered set where ssdetails_id = &#63;.
	*
	* @param ssdetails_id the ssdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ssusers
	* @throws NoSuchssusersException if a matching ssusers could not be found
	*/
	public static ssusers findBySS_ID_Last(long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssusersException {
		return getPersistence().findBySS_ID_Last(ssdetails_id, orderByComparator);
	}

	/**
	* Returns the last ssusers in the ordered set where ssdetails_id = &#63;.
	*
	* @param ssdetails_id the ssdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ssusers, or <code>null</code> if a matching ssusers could not be found
	*/
	public static ssusers fetchBySS_ID_Last(long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator) {
		return getPersistence()
				   .fetchBySS_ID_Last(ssdetails_id, orderByComparator);
	}

	/**
	* Returns the ssuserses before and after the current ssusers in the ordered set where ssdetails_id = &#63;.
	*
	* @param id the primary key of the current ssusers
	* @param ssdetails_id the ssdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ssusers
	* @throws NoSuchssusersException if a ssusers with the primary key could not be found
	*/
	public static ssusers[] findBySS_ID_PrevAndNext(long id, long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssusersException {
		return getPersistence()
				   .findBySS_ID_PrevAndNext(id, ssdetails_id, orderByComparator);
	}

	/**
	* Removes all the ssuserses where ssdetails_id = &#63; from the database.
	*
	* @param ssdetails_id the ssdetails_id
	*/
	public static void removeBySS_ID(long ssdetails_id) {
		getPersistence().removeBySS_ID(ssdetails_id);
	}

	/**
	* Returns the number of ssuserses where ssdetails_id = &#63;.
	*
	* @param ssdetails_id the ssdetails_id
	* @return the number of matching ssuserses
	*/
	public static int countBySS_ID(long ssdetails_id) {
		return getPersistence().countBySS_ID(ssdetails_id);
	}

	/**
	* Returns all the ssuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching ssuserses
	*/
	public static List<ssusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the ssuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @return the range of matching ssuserses
	*/
	public static List<ssusers> findByUSER_ID(long user_id, int start, int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the ssuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ssuserses
	*/
	public static List<ssusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<ssusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ssuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ssuserses
	*/
	public static List<ssusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<ssusers> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ssusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ssusers
	* @throws NoSuchssusersException if a matching ssusers could not be found
	*/
	public static ssusers findByUSER_ID_First(long user_id,
		OrderByComparator<ssusers> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first ssusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ssusers, or <code>null</code> if a matching ssusers could not be found
	*/
	public static ssusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<ssusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last ssusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ssusers
	* @throws NoSuchssusersException if a matching ssusers could not be found
	*/
	public static ssusers findByUSER_ID_Last(long user_id,
		OrderByComparator<ssusers> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last ssusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ssusers, or <code>null</code> if a matching ssusers could not be found
	*/
	public static ssusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<ssusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the ssuserses before and after the current ssusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current ssusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ssusers
	* @throws NoSuchssusersException if a ssusers with the primary key could not be found
	*/
	public static ssusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<ssusers> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the ssuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of ssuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching ssuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the ssusers in the entity cache if it is enabled.
	*
	* @param ssusers the ssusers
	*/
	public static void cacheResult(ssusers ssusers) {
		getPersistence().cacheResult(ssusers);
	}

	/**
	* Caches the ssuserses in the entity cache if it is enabled.
	*
	* @param ssuserses the ssuserses
	*/
	public static void cacheResult(List<ssusers> ssuserses) {
		getPersistence().cacheResult(ssuserses);
	}

	/**
	* Creates a new ssusers with the primary key. Does not add the ssusers to the database.
	*
	* @param id the primary key for the new ssusers
	* @return the new ssusers
	*/
	public static ssusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the ssusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ssusers
	* @return the ssusers that was removed
	* @throws NoSuchssusersException if a ssusers with the primary key could not be found
	*/
	public static ssusers remove(long id)
		throws com.chola.successstories.exception.NoSuchssusersException {
		return getPersistence().remove(id);
	}

	public static ssusers updateImpl(ssusers ssusers) {
		return getPersistence().updateImpl(ssusers);
	}

	/**
	* Returns the ssusers with the primary key or throws a {@link NoSuchssusersException} if it could not be found.
	*
	* @param id the primary key of the ssusers
	* @return the ssusers
	* @throws NoSuchssusersException if a ssusers with the primary key could not be found
	*/
	public static ssusers findByPrimaryKey(long id)
		throws com.chola.successstories.exception.NoSuchssusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the ssusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ssusers
	* @return the ssusers, or <code>null</code> if a ssusers with the primary key could not be found
	*/
	public static ssusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ssusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ssuserses.
	*
	* @return the ssuserses
	*/
	public static List<ssusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ssuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @return the range of ssuserses
	*/
	public static List<ssusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ssuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ssuserses
	*/
	public static List<ssusers> findAll(int start, int end,
		OrderByComparator<ssusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ssuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ssuserses
	*/
	public static List<ssusers> findAll(int start, int end,
		OrderByComparator<ssusers> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ssuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ssuserses.
	*
	* @return the number of ssuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ssusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ssusersPersistence)PortletBeanLocatorUtil.locate(com.chola.successstories.service.ClpSerializer.getServletContextName(),
					ssusersPersistence.class.getName());

			ReferenceRegistry.registerReference(ssusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static ssusersPersistence _persistence;
}