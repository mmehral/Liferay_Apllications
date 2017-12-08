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

import com.chola.shutterspeed.model.shutterspeedgallerypath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the shutterspeedgallerypath service. This utility wraps {@link com.chola.shutterspeed.service.persistence.impl.shutterspeedgallerypathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see shutterspeedgallerypathPersistence
 * @see com.chola.shutterspeed.service.persistence.impl.shutterspeedgallerypathPersistenceImpl
 * @generated
 */
@ProviderType
public class shutterspeedgallerypathUtil {
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
		shutterspeedgallerypath shutterspeedgallerypath) {
		getPersistence().clearCache(shutterspeedgallerypath);
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
	public static List<shutterspeedgallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<shutterspeedgallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<shutterspeedgallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static shutterspeedgallerypath update(
		shutterspeedgallerypath shutterspeedgallerypath) {
		return getPersistence().update(shutterspeedgallerypath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static shutterspeedgallerypath update(
		shutterspeedgallerypath shutterspeedgallerypath,
		ServiceContext serviceContext) {
		return getPersistence().update(shutterspeedgallerypath, serviceContext);
	}

	/**
	* Returns all the shutterspeedgallerypaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findByCONTENT_ID(
		long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the shutterspeedgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @return the range of matching shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findByCONTENT_ID(
		long content_id, int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findByCONTENT_ID(
		long content_id, int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findByCONTENT_ID(
		long content_id, int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	*/
	public static shutterspeedgallerypath findByCONTENT_ID_First(
		long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	*/
	public static shutterspeedgallerypath fetchByCONTENT_ID_First(
		long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	*/
	public static shutterspeedgallerypath findByCONTENT_ID_Last(
		long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	*/
	public static shutterspeedgallerypath fetchByCONTENT_ID_Last(
		long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the shutterspeedgallerypaths before and after the current shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current shutterspeedgallerypath
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	*/
	public static shutterspeedgallerypath[] findByCONTENT_ID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the shutterspeedgallerypaths where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of shutterspeedgallerypaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching shutterspeedgallerypaths
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Returns all the shutterspeedgallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the matching shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findByALBUM_ID(
		java.lang.String albumId) {
		return getPersistence().findByALBUM_ID(albumId);
	}

	/**
	* Returns a range of all the shutterspeedgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @return the range of matching shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end) {
		return getPersistence().findByALBUM_ID(albumId, start, end);
	}

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return getPersistence()
				   .findByALBUM_ID(albumId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByALBUM_ID(albumId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	*/
	public static shutterspeedgallerypath findByALBUM_ID_First(
		java.lang.String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException {
		return getPersistence().findByALBUM_ID_First(albumId, orderByComparator);
	}

	/**
	* Returns the first shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	*/
	public static shutterspeedgallerypath fetchByALBUM_ID_First(
		java.lang.String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return getPersistence().fetchByALBUM_ID_First(albumId, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	*/
	public static shutterspeedgallerypath findByALBUM_ID_Last(
		java.lang.String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException {
		return getPersistence().findByALBUM_ID_Last(albumId, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	*/
	public static shutterspeedgallerypath fetchByALBUM_ID_Last(
		java.lang.String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return getPersistence().fetchByALBUM_ID_Last(albumId, orderByComparator);
	}

	/**
	* Returns the shutterspeedgallerypaths before and after the current shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param id the primary key of the current shutterspeedgallerypath
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	*/
	public static shutterspeedgallerypath[] findByALBUM_ID_PrevAndNext(
		long id, java.lang.String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException {
		return getPersistence()
				   .findByALBUM_ID_PrevAndNext(id, albumId, orderByComparator);
	}

	/**
	* Removes all the shutterspeedgallerypaths where albumId = &#63; from the database.
	*
	* @param albumId the album ID
	*/
	public static void removeByALBUM_ID(java.lang.String albumId) {
		getPersistence().removeByALBUM_ID(albumId);
	}

	/**
	* Returns the number of shutterspeedgallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the number of matching shutterspeedgallerypaths
	*/
	public static int countByALBUM_ID(java.lang.String albumId) {
		return getPersistence().countByALBUM_ID(albumId);
	}

	/**
	* Caches the shutterspeedgallerypath in the entity cache if it is enabled.
	*
	* @param shutterspeedgallerypath the shutterspeedgallerypath
	*/
	public static void cacheResult(
		shutterspeedgallerypath shutterspeedgallerypath) {
		getPersistence().cacheResult(shutterspeedgallerypath);
	}

	/**
	* Caches the shutterspeedgallerypaths in the entity cache if it is enabled.
	*
	* @param shutterspeedgallerypaths the shutterspeedgallerypaths
	*/
	public static void cacheResult(
		List<shutterspeedgallerypath> shutterspeedgallerypaths) {
		getPersistence().cacheResult(shutterspeedgallerypaths);
	}

	/**
	* Creates a new shutterspeedgallerypath with the primary key. Does not add the shutterspeedgallerypath to the database.
	*
	* @param id the primary key for the new shutterspeedgallerypath
	* @return the new shutterspeedgallerypath
	*/
	public static shutterspeedgallerypath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the shutterspeedgallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shutterspeedgallerypath
	* @return the shutterspeedgallerypath that was removed
	* @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	*/
	public static shutterspeedgallerypath remove(long id)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException {
		return getPersistence().remove(id);
	}

	public static shutterspeedgallerypath updateImpl(
		shutterspeedgallerypath shutterspeedgallerypath) {
		return getPersistence().updateImpl(shutterspeedgallerypath);
	}

	/**
	* Returns the shutterspeedgallerypath with the primary key or throws a {@link NoSuchshutterspeedgallerypathException} if it could not be found.
	*
	* @param id the primary key of the shutterspeedgallerypath
	* @return the shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	*/
	public static shutterspeedgallerypath findByPrimaryKey(long id)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the shutterspeedgallerypath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the shutterspeedgallerypath
	* @return the shutterspeedgallerypath, or <code>null</code> if a shutterspeedgallerypath with the primary key could not be found
	*/
	public static shutterspeedgallerypath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, shutterspeedgallerypath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the shutterspeedgallerypaths.
	*
	* @return the shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the shutterspeedgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @return the range of shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findAll(int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of shutterspeedgallerypaths
	*/
	public static List<shutterspeedgallerypath> findAll(int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the shutterspeedgallerypaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of shutterspeedgallerypaths.
	*
	* @return the number of shutterspeedgallerypaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static shutterspeedgallerypathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (shutterspeedgallerypathPersistence)PortletBeanLocatorUtil.locate(com.chola.shutterspeed.service.ClpSerializer.getServletContextName(),
					shutterspeedgallerypathPersistence.class.getName());

			ReferenceRegistry.registerReference(shutterspeedgallerypathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static shutterspeedgallerypathPersistence _persistence;
}