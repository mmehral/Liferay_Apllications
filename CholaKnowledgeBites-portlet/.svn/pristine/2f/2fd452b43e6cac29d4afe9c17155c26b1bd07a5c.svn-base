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

package com.chola.knowledgebites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.knowledgebites.model.kbusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the kbusers service. This utility wraps {@link com.chola.knowledgebites.service.persistence.impl.kbusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see kbusersPersistence
 * @see com.chola.knowledgebites.service.persistence.impl.kbusersPersistenceImpl
 * @generated
 */
@ProviderType
public class kbusersUtil {
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
	public static void clearCache(kbusers kbusers) {
		getPersistence().clearCache(kbusers);
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
	public static List<kbusers> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<kbusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<kbusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<kbusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static kbusers update(kbusers kbusers) {
		return getPersistence().update(kbusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static kbusers update(kbusers kbusers, ServiceContext serviceContext) {
		return getPersistence().update(kbusers, serviceContext);
	}

	/**
	* Returns all the kbuserses where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @return the matching kbuserses
	*/
	public static List<kbusers> findByKB_ID(long kbdetails_id) {
		return getPersistence().findByKB_ID(kbdetails_id);
	}

	/**
	* Returns a range of all the kbuserses where kbdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kbdetails_id the kbdetails_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @return the range of matching kbuserses
	*/
	public static List<kbusers> findByKB_ID(long kbdetails_id, int start,
		int end) {
		return getPersistence().findByKB_ID(kbdetails_id, start, end);
	}

	/**
	* Returns an ordered range of all the kbuserses where kbdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kbdetails_id the kbdetails_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kbuserses
	*/
	public static List<kbusers> findByKB_ID(long kbdetails_id, int start,
		int end, OrderByComparator<kbusers> orderByComparator) {
		return getPersistence()
				   .findByKB_ID(kbdetails_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kbuserses where kbdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kbdetails_id the kbdetails_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kbuserses
	*/
	public static List<kbusers> findByKB_ID(long kbdetails_id, int start,
		int end, OrderByComparator<kbusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByKB_ID(kbdetails_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbusers
	* @throws NoSuchkbusersException if a matching kbusers could not be found
	*/
	public static kbusers findByKB_ID_First(long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator)
		throws com.chola.knowledgebites.exception.NoSuchkbusersException {
		return getPersistence()
				   .findByKB_ID_First(kbdetails_id, orderByComparator);
	}

	/**
	* Returns the first kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbusers, or <code>null</code> if a matching kbusers could not be found
	*/
	public static kbusers fetchByKB_ID_First(long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator) {
		return getPersistence()
				   .fetchByKB_ID_First(kbdetails_id, orderByComparator);
	}

	/**
	* Returns the last kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbusers
	* @throws NoSuchkbusersException if a matching kbusers could not be found
	*/
	public static kbusers findByKB_ID_Last(long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator)
		throws com.chola.knowledgebites.exception.NoSuchkbusersException {
		return getPersistence().findByKB_ID_Last(kbdetails_id, orderByComparator);
	}

	/**
	* Returns the last kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbusers, or <code>null</code> if a matching kbusers could not be found
	*/
	public static kbusers fetchByKB_ID_Last(long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator) {
		return getPersistence()
				   .fetchByKB_ID_Last(kbdetails_id, orderByComparator);
	}

	/**
	* Returns the kbuserses before and after the current kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param id the primary key of the current kbusers
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kbusers
	* @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	*/
	public static kbusers[] findByKB_ID_PrevAndNext(long id, long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator)
		throws com.chola.knowledgebites.exception.NoSuchkbusersException {
		return getPersistence()
				   .findByKB_ID_PrevAndNext(id, kbdetails_id, orderByComparator);
	}

	/**
	* Removes all the kbuserses where kbdetails_id = &#63; from the database.
	*
	* @param kbdetails_id the kbdetails_id
	*/
	public static void removeByKB_ID(long kbdetails_id) {
		getPersistence().removeByKB_ID(kbdetails_id);
	}

	/**
	* Returns the number of kbuserses where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @return the number of matching kbuserses
	*/
	public static int countByKB_ID(long kbdetails_id) {
		return getPersistence().countByKB_ID(kbdetails_id);
	}

	/**
	* Returns all the kbuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching kbuserses
	*/
	public static List<kbusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the kbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @return the range of matching kbuserses
	*/
	public static List<kbusers> findByUSER_ID(long user_id, int start, int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the kbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kbuserses
	*/
	public static List<kbusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<kbusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kbuserses
	*/
	public static List<kbusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<kbusers> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first kbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbusers
	* @throws NoSuchkbusersException if a matching kbusers could not be found
	*/
	public static kbusers findByUSER_ID_First(long user_id,
		OrderByComparator<kbusers> orderByComparator)
		throws com.chola.knowledgebites.exception.NoSuchkbusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first kbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbusers, or <code>null</code> if a matching kbusers could not be found
	*/
	public static kbusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<kbusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last kbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbusers
	* @throws NoSuchkbusersException if a matching kbusers could not be found
	*/
	public static kbusers findByUSER_ID_Last(long user_id,
		OrderByComparator<kbusers> orderByComparator)
		throws com.chola.knowledgebites.exception.NoSuchkbusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last kbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbusers, or <code>null</code> if a matching kbusers could not be found
	*/
	public static kbusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<kbusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the kbuserses before and after the current kbusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current kbusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kbusers
	* @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	*/
	public static kbusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<kbusers> orderByComparator)
		throws com.chola.knowledgebites.exception.NoSuchkbusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the kbuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of kbuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching kbuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the kbusers in the entity cache if it is enabled.
	*
	* @param kbusers the kbusers
	*/
	public static void cacheResult(kbusers kbusers) {
		getPersistence().cacheResult(kbusers);
	}

	/**
	* Caches the kbuserses in the entity cache if it is enabled.
	*
	* @param kbuserses the kbuserses
	*/
	public static void cacheResult(List<kbusers> kbuserses) {
		getPersistence().cacheResult(kbuserses);
	}

	/**
	* Creates a new kbusers with the primary key. Does not add the kbusers to the database.
	*
	* @param id the primary key for the new kbusers
	* @return the new kbusers
	*/
	public static kbusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the kbusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kbusers
	* @return the kbusers that was removed
	* @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	*/
	public static kbusers remove(long id)
		throws com.chola.knowledgebites.exception.NoSuchkbusersException {
		return getPersistence().remove(id);
	}

	public static kbusers updateImpl(kbusers kbusers) {
		return getPersistence().updateImpl(kbusers);
	}

	/**
	* Returns the kbusers with the primary key or throws a {@link NoSuchkbusersException} if it could not be found.
	*
	* @param id the primary key of the kbusers
	* @return the kbusers
	* @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	*/
	public static kbusers findByPrimaryKey(long id)
		throws com.chola.knowledgebites.exception.NoSuchkbusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the kbusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kbusers
	* @return the kbusers, or <code>null</code> if a kbusers with the primary key could not be found
	*/
	public static kbusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, kbusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the kbuserses.
	*
	* @return the kbuserses
	*/
	public static List<kbusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the kbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @return the range of kbuserses
	*/
	public static List<kbusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the kbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kbuserses
	*/
	public static List<kbusers> findAll(int start, int end,
		OrderByComparator<kbusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of kbuserses
	*/
	public static List<kbusers> findAll(int start, int end,
		OrderByComparator<kbusers> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the kbuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of kbuserses.
	*
	* @return the number of kbuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static kbusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (kbusersPersistence)PortletBeanLocatorUtil.locate(com.chola.knowledgebites.service.ClpSerializer.getServletContextName(),
					kbusersPersistence.class.getName());

			ReferenceRegistry.registerReference(kbusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static kbusersPersistence _persistence;
}