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

package com.chola.feedforward.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.feedforward.model.feedforwardgalleryusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the feedforwardgalleryusers service. This utility wraps {@link com.chola.feedforward.service.persistence.impl.feedforwardgalleryusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see feedforwardgalleryusersPersistence
 * @see com.chola.feedforward.service.persistence.impl.feedforwardgalleryusersPersistenceImpl
 * @generated
 */
@ProviderType
public class feedforwardgalleryusersUtil {
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
	public static void clearCache(
		feedforwardgalleryusers feedforwardgalleryusers) {
		getPersistence().clearCache(feedforwardgalleryusers);
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
	public static List<feedforwardgalleryusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<feedforwardgalleryusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<feedforwardgalleryusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static feedforwardgalleryusers update(
		feedforwardgalleryusers feedforwardgalleryusers) {
		return getPersistence().update(feedforwardgalleryusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static feedforwardgalleryusers update(
		feedforwardgalleryusers feedforwardgalleryusers,
		ServiceContext serviceContext) {
		return getPersistence().update(feedforwardgalleryusers, serviceContext);
	}

	/**
	* Returns all the feedforwardgalleryuserses where album_id = &#63;.
	*
	* @param album_id the album_id
	* @return the matching feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findByALBUM_ID(long album_id) {
		return getPersistence().findByALBUM_ID(album_id);
	}

	/**
	* Returns a range of all the feedforwardgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @return the range of matching feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findByALBUM_ID(long album_id,
		int start, int end) {
		return getPersistence().findByALBUM_ID(album_id, start, end);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findByALBUM_ID(long album_id,
		int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return getPersistence()
				   .findByALBUM_ID(album_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findByALBUM_ID(long album_id,
		int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByALBUM_ID(album_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	*/
	public static feedforwardgalleryusers findByALBUM_ID_First(long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException {
		return getPersistence().findByALBUM_ID_First(album_id, orderByComparator);
	}

	/**
	* Returns the first feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	*/
	public static feedforwardgalleryusers fetchByALBUM_ID_First(long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return getPersistence()
				   .fetchByALBUM_ID_First(album_id, orderByComparator);
	}

	/**
	* Returns the last feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	*/
	public static feedforwardgalleryusers findByALBUM_ID_Last(long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException {
		return getPersistence().findByALBUM_ID_Last(album_id, orderByComparator);
	}

	/**
	* Returns the last feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	*/
	public static feedforwardgalleryusers fetchByALBUM_ID_Last(long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return getPersistence().fetchByALBUM_ID_Last(album_id, orderByComparator);
	}

	/**
	* Returns the feedforwardgalleryuserses before and after the current feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param id the primary key of the current feedforwardgalleryusers
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	*/
	public static feedforwardgalleryusers[] findByALBUM_ID_PrevAndNext(
		long id, long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException {
		return getPersistence()
				   .findByALBUM_ID_PrevAndNext(id, album_id, orderByComparator);
	}

	/**
	* Removes all the feedforwardgalleryuserses where album_id = &#63; from the database.
	*
	* @param album_id the album_id
	*/
	public static void removeByALBUM_ID(long album_id) {
		getPersistence().removeByALBUM_ID(album_id);
	}

	/**
	* Returns the number of feedforwardgalleryuserses where album_id = &#63;.
	*
	* @param album_id the album_id
	* @return the number of matching feedforwardgalleryuserses
	*/
	public static int countByALBUM_ID(long album_id) {
		return getPersistence().countByALBUM_ID(album_id);
	}

	/**
	* Returns all the feedforwardgalleryuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the feedforwardgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @return the range of matching feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findByUSER_ID(long user_id,
		int start, int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findByUSER_ID(long user_id,
		int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findByUSER_ID(long user_id,
		int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	*/
	public static feedforwardgalleryusers findByUSER_ID_First(long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	*/
	public static feedforwardgalleryusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	*/
	public static feedforwardgalleryusers findByUSER_ID_Last(long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	*/
	public static feedforwardgalleryusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the feedforwardgalleryuserses before and after the current feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current feedforwardgalleryusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	*/
	public static feedforwardgalleryusers[] findByUSER_ID_PrevAndNext(long id,
		long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the feedforwardgalleryuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of feedforwardgalleryuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching feedforwardgalleryuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the feedforwardgalleryusers in the entity cache if it is enabled.
	*
	* @param feedforwardgalleryusers the feedforwardgalleryusers
	*/
	public static void cacheResult(
		feedforwardgalleryusers feedforwardgalleryusers) {
		getPersistence().cacheResult(feedforwardgalleryusers);
	}

	/**
	* Caches the feedforwardgalleryuserses in the entity cache if it is enabled.
	*
	* @param feedforwardgalleryuserses the feedforwardgalleryuserses
	*/
	public static void cacheResult(
		List<feedforwardgalleryusers> feedforwardgalleryuserses) {
		getPersistence().cacheResult(feedforwardgalleryuserses);
	}

	/**
	* Creates a new feedforwardgalleryusers with the primary key. Does not add the feedforwardgalleryusers to the database.
	*
	* @param id the primary key for the new feedforwardgalleryusers
	* @return the new feedforwardgalleryusers
	*/
	public static feedforwardgalleryusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the feedforwardgalleryusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the feedforwardgalleryusers
	* @return the feedforwardgalleryusers that was removed
	* @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	*/
	public static feedforwardgalleryusers remove(long id)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException {
		return getPersistence().remove(id);
	}

	public static feedforwardgalleryusers updateImpl(
		feedforwardgalleryusers feedforwardgalleryusers) {
		return getPersistence().updateImpl(feedforwardgalleryusers);
	}

	/**
	* Returns the feedforwardgalleryusers with the primary key or throws a {@link NoSuchfeedforwardgalleryusersException} if it could not be found.
	*
	* @param id the primary key of the feedforwardgalleryusers
	* @return the feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	*/
	public static feedforwardgalleryusers findByPrimaryKey(long id)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the feedforwardgalleryusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the feedforwardgalleryusers
	* @return the feedforwardgalleryusers, or <code>null</code> if a feedforwardgalleryusers with the primary key could not be found
	*/
	public static feedforwardgalleryusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, feedforwardgalleryusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the feedforwardgalleryuserses.
	*
	* @return the feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the feedforwardgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @return the range of feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findAll(int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of feedforwardgalleryuserses
	*/
	public static List<feedforwardgalleryusers> findAll(int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the feedforwardgalleryuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of feedforwardgalleryuserses.
	*
	* @return the number of feedforwardgalleryuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static feedforwardgalleryusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (feedforwardgalleryusersPersistence)PortletBeanLocatorUtil.locate(com.chola.feedforward.service.ClpSerializer.getServletContextName(),
					feedforwardgalleryusersPersistence.class.getName());

			ReferenceRegistry.registerReference(feedforwardgalleryusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static feedforwardgalleryusersPersistence _persistence;
}