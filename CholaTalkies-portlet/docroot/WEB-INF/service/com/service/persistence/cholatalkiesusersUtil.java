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

package com.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.model.cholatalkiesusers;

import java.util.List;

/**
 * The persistence utility for the cholatalkiesusers service. This utility wraps {@link com.service.persistence.impl.cholatalkiesusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiesusersPersistence
 * @see com.service.persistence.impl.cholatalkiesusersPersistenceImpl
 * @generated
 */
@ProviderType
public class cholatalkiesusersUtil {
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
	public static void clearCache(cholatalkiesusers cholatalkiesusers) {
		getPersistence().clearCache(cholatalkiesusers);
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
	public static List<cholatalkiesusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<cholatalkiesusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<cholatalkiesusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static cholatalkiesusers update(cholatalkiesusers cholatalkiesusers) {
		return getPersistence().update(cholatalkiesusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static cholatalkiesusers update(
		cholatalkiesusers cholatalkiesusers, ServiceContext serviceContext) {
		return getPersistence().update(cholatalkiesusers, serviceContext);
	}

	/**
	* Returns all the cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @return the matching cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findByCHOLATALKIES_ID(
		long cholatalkiesdetails_id) {
		return getPersistence().findByCHOLATALKIES_ID(cholatalkiesdetails_id);
	}

	/**
	* Returns a range of all the cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @return the range of matching cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findByCHOLATALKIES_ID(
		long cholatalkiesdetails_id, int start, int end) {
		return getPersistence()
				   .findByCHOLATALKIES_ID(cholatalkiesdetails_id, start, end);
	}

	/**
	* Returns an ordered range of all the cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findByCHOLATALKIES_ID(
		long cholatalkiesdetails_id, int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return getPersistence()
				   .findByCHOLATALKIES_ID(cholatalkiesdetails_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findByCHOLATALKIES_ID(
		long cholatalkiesdetails_id, int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCHOLATALKIES_ID(cholatalkiesdetails_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkiesusers
	* @throws NoSuchcholatalkiesusersException if a matching cholatalkiesusers could not be found
	*/
	public static cholatalkiesusers findByCHOLATALKIES_ID_First(
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws com.exception.NoSuchcholatalkiesusersException {
		return getPersistence()
				   .findByCHOLATALKIES_ID_First(cholatalkiesdetails_id,
			orderByComparator);
	}

	/**
	* Returns the first cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkiesusers, or <code>null</code> if a matching cholatalkiesusers could not be found
	*/
	public static cholatalkiesusers fetchByCHOLATALKIES_ID_First(
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return getPersistence()
				   .fetchByCHOLATALKIES_ID_First(cholatalkiesdetails_id,
			orderByComparator);
	}

	/**
	* Returns the last cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkiesusers
	* @throws NoSuchcholatalkiesusersException if a matching cholatalkiesusers could not be found
	*/
	public static cholatalkiesusers findByCHOLATALKIES_ID_Last(
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws com.exception.NoSuchcholatalkiesusersException {
		return getPersistence()
				   .findByCHOLATALKIES_ID_Last(cholatalkiesdetails_id,
			orderByComparator);
	}

	/**
	* Returns the last cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkiesusers, or <code>null</code> if a matching cholatalkiesusers could not be found
	*/
	public static cholatalkiesusers fetchByCHOLATALKIES_ID_Last(
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return getPersistence()
				   .fetchByCHOLATALKIES_ID_Last(cholatalkiesdetails_id,
			orderByComparator);
	}

	/**
	* Returns the cholatalkiesuserses before and after the current cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	*
	* @param id the primary key of the current cholatalkiesusers
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cholatalkiesusers
	* @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	*/
	public static cholatalkiesusers[] findByCHOLATALKIES_ID_PrevAndNext(
		long id, long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws com.exception.NoSuchcholatalkiesusersException {
		return getPersistence()
				   .findByCHOLATALKIES_ID_PrevAndNext(id,
			cholatalkiesdetails_id, orderByComparator);
	}

	/**
	* Removes all the cholatalkiesuserses where cholatalkiesdetails_id = &#63; from the database.
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	*/
	public static void removeByCHOLATALKIES_ID(long cholatalkiesdetails_id) {
		getPersistence().removeByCHOLATALKIES_ID(cholatalkiesdetails_id);
	}

	/**
	* Returns the number of cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	*
	* @param cholatalkiesdetails_id the cholatalkiesdetails_id
	* @return the number of matching cholatalkiesuserses
	*/
	public static int countByCHOLATALKIES_ID(long cholatalkiesdetails_id) {
		return getPersistence().countByCHOLATALKIES_ID(cholatalkiesdetails_id);
	}

	/**
	* Returns all the cholatalkiesuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the cholatalkiesuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @return the range of matching cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findByUSER_ID(long user_id,
		int start, int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the cholatalkiesuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findByUSER_ID(long user_id,
		int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholatalkiesuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findByUSER_ID(long user_id,
		int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first cholatalkiesusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkiesusers
	* @throws NoSuchcholatalkiesusersException if a matching cholatalkiesusers could not be found
	*/
	public static cholatalkiesusers findByUSER_ID_First(long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws com.exception.NoSuchcholatalkiesusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first cholatalkiesusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkiesusers, or <code>null</code> if a matching cholatalkiesusers could not be found
	*/
	public static cholatalkiesusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last cholatalkiesusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkiesusers
	* @throws NoSuchcholatalkiesusersException if a matching cholatalkiesusers could not be found
	*/
	public static cholatalkiesusers findByUSER_ID_Last(long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws com.exception.NoSuchcholatalkiesusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last cholatalkiesusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkiesusers, or <code>null</code> if a matching cholatalkiesusers could not be found
	*/
	public static cholatalkiesusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the cholatalkiesuserses before and after the current cholatalkiesusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current cholatalkiesusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cholatalkiesusers
	* @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	*/
	public static cholatalkiesusers[] findByUSER_ID_PrevAndNext(long id,
		long user_id, OrderByComparator<cholatalkiesusers> orderByComparator)
		throws com.exception.NoSuchcholatalkiesusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the cholatalkiesuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of cholatalkiesuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching cholatalkiesuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the cholatalkiesusers in the entity cache if it is enabled.
	*
	* @param cholatalkiesusers the cholatalkiesusers
	*/
	public static void cacheResult(cholatalkiesusers cholatalkiesusers) {
		getPersistence().cacheResult(cholatalkiesusers);
	}

	/**
	* Caches the cholatalkiesuserses in the entity cache if it is enabled.
	*
	* @param cholatalkiesuserses the cholatalkiesuserses
	*/
	public static void cacheResult(List<cholatalkiesusers> cholatalkiesuserses) {
		getPersistence().cacheResult(cholatalkiesuserses);
	}

	/**
	* Creates a new cholatalkiesusers with the primary key. Does not add the cholatalkiesusers to the database.
	*
	* @param id the primary key for the new cholatalkiesusers
	* @return the new cholatalkiesusers
	*/
	public static cholatalkiesusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the cholatalkiesusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholatalkiesusers
	* @return the cholatalkiesusers that was removed
	* @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	*/
	public static cholatalkiesusers remove(long id)
		throws com.exception.NoSuchcholatalkiesusersException {
		return getPersistence().remove(id);
	}

	public static cholatalkiesusers updateImpl(
		cholatalkiesusers cholatalkiesusers) {
		return getPersistence().updateImpl(cholatalkiesusers);
	}

	/**
	* Returns the cholatalkiesusers with the primary key or throws a {@link NoSuchcholatalkiesusersException} if it could not be found.
	*
	* @param id the primary key of the cholatalkiesusers
	* @return the cholatalkiesusers
	* @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	*/
	public static cholatalkiesusers findByPrimaryKey(long id)
		throws com.exception.NoSuchcholatalkiesusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the cholatalkiesusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the cholatalkiesusers
	* @return the cholatalkiesusers, or <code>null</code> if a cholatalkiesusers with the primary key could not be found
	*/
	public static cholatalkiesusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, cholatalkiesusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the cholatalkiesuserses.
	*
	* @return the cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cholatalkiesuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @return the range of cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cholatalkiesuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findAll(int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholatalkiesuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cholatalkiesuserses
	*/
	public static List<cholatalkiesusers> findAll(int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the cholatalkiesuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cholatalkiesuserses.
	*
	* @return the number of cholatalkiesuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static cholatalkiesusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (cholatalkiesusersPersistence)PortletBeanLocatorUtil.locate(com.service.ClpSerializer.getServletContextName(),
					cholatalkiesusersPersistence.class.getName());

			ReferenceRegistry.registerReference(cholatalkiesusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static cholatalkiesusersPersistence _persistence;
}