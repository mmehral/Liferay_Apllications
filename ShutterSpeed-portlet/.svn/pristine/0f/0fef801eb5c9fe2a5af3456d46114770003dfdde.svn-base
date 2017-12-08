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

package com.chola.shutterspeed.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.shutterspeed.model.shutterspeedgalleryusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the shutterspeedgalleryusers service. This utility wraps {@link com.chola.shutterspeed.service.persistence.impl.shutterspeedgalleryusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see shutterspeedgalleryusersPersistence
 * @see com.chola.shutterspeed.service.persistence.impl.shutterspeedgalleryusersPersistenceImpl
 * @generated
 */
@ProviderType
public class shutterspeedgalleryusersUtil {
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
		shutterspeedgalleryusers shutterspeedgalleryusers) {
		getPersistence().clearCache(shutterspeedgalleryusers);
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
	public static List<shutterspeedgalleryusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<shutterspeedgalleryusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<shutterspeedgalleryusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static shutterspeedgalleryusers update(
		shutterspeedgalleryusers shutterspeedgalleryusers) {
		return getPersistence().update(shutterspeedgalleryusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static shutterspeedgalleryusers update(
		shutterspeedgalleryusers shutterspeedgalleryusers,
		ServiceContext serviceContext) {
		return getPersistence().update(shutterspeedgalleryusers, serviceContext);
	}

	/**
	* Returns all the shutterspeedgalleryuserses where album_id = &#63;.
	*
	* @param album_id the album_id
	* @return the matching shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findByALBUM_ID(long album_id) {
		return getPersistence().findByALBUM_ID(album_id);
	}

	/**
	* Returns a range of all the shutterspeedgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @return the range of matching shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findByALBUM_ID(long album_id,
		int start, int end) {
		return getPersistence().findByALBUM_ID(album_id, start, end);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findByALBUM_ID(long album_id,
		int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return getPersistence()
				   .findByALBUM_ID(album_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findByALBUM_ID(long album_id,
		int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByALBUM_ID(album_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgalleryusers
	* @throws NoSuchshutterspeedgalleryusersException if a matching shutterspeedgalleryusers could not be found
	*/
	public static shutterspeedgalleryusers findByALBUM_ID_First(long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException {
		return getPersistence().findByALBUM_ID_First(album_id, orderByComparator);
	}

	/**
	* Returns the first shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgalleryusers, or <code>null</code> if a matching shutterspeedgalleryusers could not be found
	*/
	public static shutterspeedgalleryusers fetchByALBUM_ID_First(
		long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return getPersistence()
				   .fetchByALBUM_ID_First(album_id, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgalleryusers
	* @throws NoSuchshutterspeedgalleryusersException if a matching shutterspeedgalleryusers could not be found
	*/
	public static shutterspeedgalleryusers findByALBUM_ID_Last(long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException {
		return getPersistence().findByALBUM_ID_Last(album_id, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgalleryusers, or <code>null</code> if a matching shutterspeedgalleryusers could not be found
	*/
	public static shutterspeedgalleryusers fetchByALBUM_ID_Last(long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return getPersistence().fetchByALBUM_ID_Last(album_id, orderByComparator);
	}

	/**
	* Returns the shutterspeedgalleryuserses before and after the current shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param id the primary key of the current shutterspeedgalleryusers
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shutterspeedgalleryusers
	* @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	*/
	public static shutterspeedgalleryusers[] findByALBUM_ID_PrevAndNext(
		long id, long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException {
		return getPersistence()
				   .findByALBUM_ID_PrevAndNext(id, album_id, orderByComparator);
	}

	/**
	* Removes all the shutterspeedgalleryuserses where album_id = &#63; from the database.
	*
	* @param album_id the album_id
	*/
	public static void removeByALBUM_ID(long album_id) {
		getPersistence().removeByALBUM_ID(album_id);
	}

	/**
	* Returns the number of shutterspeedgalleryuserses where album_id = &#63;.
	*
	* @param album_id the album_id
	* @return the number of matching shutterspeedgalleryuserses
	*/
	public static int countByALBUM_ID(long album_id) {
		return getPersistence().countByALBUM_ID(album_id);
	}

	/**
	* Returns all the shutterspeedgalleryuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the shutterspeedgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @return the range of matching shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findByUSER_ID(long user_id,
		int start, int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findByUSER_ID(long user_id,
		int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findByUSER_ID(long user_id,
		int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgalleryusers
	* @throws NoSuchshutterspeedgalleryusersException if a matching shutterspeedgalleryusers could not be found
	*/
	public static shutterspeedgalleryusers findByUSER_ID_First(long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgalleryusers, or <code>null</code> if a matching shutterspeedgalleryusers could not be found
	*/
	public static shutterspeedgalleryusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgalleryusers
	* @throws NoSuchshutterspeedgalleryusersException if a matching shutterspeedgalleryusers could not be found
	*/
	public static shutterspeedgalleryusers findByUSER_ID_Last(long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgalleryusers, or <code>null</code> if a matching shutterspeedgalleryusers could not be found
	*/
	public static shutterspeedgalleryusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the shutterspeedgalleryuserses before and after the current shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current shutterspeedgalleryusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shutterspeedgalleryusers
	* @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	*/
	public static shutterspeedgalleryusers[] findByUSER_ID_PrevAndNext(
		long id, long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the shutterspeedgalleryuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of shutterspeedgalleryuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching shutterspeedgalleryuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the shutterspeedgalleryusers in the entity cache if it is enabled.
	*
	* @param shutterspeedgalleryusers the shutterspeedgalleryusers
	*/
	public static void cacheResult(
		shutterspeedgalleryusers shutterspeedgalleryusers) {
		getPersistence().cacheResult(shutterspeedgalleryusers);
	}

	/**
	* Caches the shutterspeedgalleryuserses in the entity cache if it is enabled.
	*
	* @param shutterspeedgalleryuserses the shutterspeedgalleryuserses
	*/
	public static void cacheResult(
		List<shutterspeedgalleryusers> shutterspeedgalleryuserses) {
		getPersistence().cacheResult(shutterspeedgalleryuserses);
	}

	/**
	* Creates a new shutterspeedgalleryusers with the primary key. Does not add the shutterspeedgalleryusers to the database.
	*
	* @param id the primary key for the new shutterspeedgalleryusers
	* @return the new shutterspeedgalleryusers
	*/
	public static shutterspeedgalleryusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the shutterspeedgalleryusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shutterspeedgalleryusers
	* @return the shutterspeedgalleryusers that was removed
	* @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	*/
	public static shutterspeedgalleryusers remove(long id)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException {
		return getPersistence().remove(id);
	}

	public static shutterspeedgalleryusers updateImpl(
		shutterspeedgalleryusers shutterspeedgalleryusers) {
		return getPersistence().updateImpl(shutterspeedgalleryusers);
	}

	/**
	* Returns the shutterspeedgalleryusers with the primary key or throws a {@link NoSuchshutterspeedgalleryusersException} if it could not be found.
	*
	* @param id the primary key of the shutterspeedgalleryusers
	* @return the shutterspeedgalleryusers
	* @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	*/
	public static shutterspeedgalleryusers findByPrimaryKey(long id)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the shutterspeedgalleryusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the shutterspeedgalleryusers
	* @return the shutterspeedgalleryusers, or <code>null</code> if a shutterspeedgalleryusers with the primary key could not be found
	*/
	public static shutterspeedgalleryusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, shutterspeedgalleryusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the shutterspeedgalleryuserses.
	*
	* @return the shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the shutterspeedgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @return the range of shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findAll(int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgalleryuserses
	* @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of shutterspeedgalleryuserses
	*/
	public static List<shutterspeedgalleryusers> findAll(int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the shutterspeedgalleryuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of shutterspeedgalleryuserses.
	*
	* @return the number of shutterspeedgalleryuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static shutterspeedgalleryusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (shutterspeedgalleryusersPersistence)PortletBeanLocatorUtil.locate(com.chola.shutterspeed.service.ClpSerializer.getServletContextName(),
					shutterspeedgalleryusersPersistence.class.getName());

			ReferenceRegistry.registerReference(shutterspeedgalleryusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static shutterspeedgalleryusersPersistence _persistence;
}