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

import com.chola.feedforward.model.feedforwardgallerypath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the feedforwardgallerypath service. This utility wraps {@link com.chola.feedforward.service.persistence.impl.feedforwardgallerypathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see feedforwardgallerypathPersistence
 * @see com.chola.feedforward.service.persistence.impl.feedforwardgallerypathPersistenceImpl
 * @generated
 */
@ProviderType
public class feedforwardgallerypathUtil {
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
	public static void clearCache(feedforwardgallerypath feedforwardgallerypath) {
		getPersistence().clearCache(feedforwardgallerypath);
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
	public static List<feedforwardgallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<feedforwardgallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<feedforwardgallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static feedforwardgallerypath update(
		feedforwardgallerypath feedforwardgallerypath) {
		return getPersistence().update(feedforwardgallerypath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static feedforwardgallerypath update(
		feedforwardgallerypath feedforwardgallerypath,
		ServiceContext serviceContext) {
		return getPersistence().update(feedforwardgallerypath, serviceContext);
	}

	/**
	* Returns all the feedforwardgallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the matching feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findByALBUM_ID(
		java.lang.String albumId) {
		return getPersistence().findByALBUM_ID(albumId);
	}

	/**
	* Returns a range of all the feedforwardgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @return the range of matching feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end) {
		return getPersistence().findByALBUM_ID(albumId, start, end);
	}

	/**
	* Returns an ordered range of all the feedforwardgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return getPersistence()
				   .findByALBUM_ID(albumId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedforwardgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByALBUM_ID(albumId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	*/
	public static feedforwardgallerypath findByALBUM_ID_First(
		java.lang.String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException {
		return getPersistence().findByALBUM_ID_First(albumId, orderByComparator);
	}

	/**
	* Returns the first feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	*/
	public static feedforwardgallerypath fetchByALBUM_ID_First(
		java.lang.String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return getPersistence().fetchByALBUM_ID_First(albumId, orderByComparator);
	}

	/**
	* Returns the last feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	*/
	public static feedforwardgallerypath findByALBUM_ID_Last(
		java.lang.String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException {
		return getPersistence().findByALBUM_ID_Last(albumId, orderByComparator);
	}

	/**
	* Returns the last feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	*/
	public static feedforwardgallerypath fetchByALBUM_ID_Last(
		java.lang.String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return getPersistence().fetchByALBUM_ID_Last(albumId, orderByComparator);
	}

	/**
	* Returns the feedforwardgallerypaths before and after the current feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param id the primary key of the current feedforwardgallerypath
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	*/
	public static feedforwardgallerypath[] findByALBUM_ID_PrevAndNext(long id,
		java.lang.String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException {
		return getPersistence()
				   .findByALBUM_ID_PrevAndNext(id, albumId, orderByComparator);
	}

	/**
	* Removes all the feedforwardgallerypaths where albumId = &#63; from the database.
	*
	* @param albumId the album ID
	*/
	public static void removeByALBUM_ID(java.lang.String albumId) {
		getPersistence().removeByALBUM_ID(albumId);
	}

	/**
	* Returns the number of feedforwardgallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the number of matching feedforwardgallerypaths
	*/
	public static int countByALBUM_ID(java.lang.String albumId) {
		return getPersistence().countByALBUM_ID(albumId);
	}

	/**
	* Returns all the feedforwardgallerypaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the feedforwardgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @return the range of matching feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findByCONTENT_ID(
		long content_id, int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the feedforwardgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findByCONTENT_ID(
		long content_id, int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedforwardgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findByCONTENT_ID(
		long content_id, int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	*/
	public static feedforwardgallerypath findByCONTENT_ID_First(
		long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	*/
	public static feedforwardgallerypath fetchByCONTENT_ID_First(
		long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	*/
	public static feedforwardgallerypath findByCONTENT_ID_Last(
		long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	*/
	public static feedforwardgallerypath fetchByCONTENT_ID_Last(
		long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the feedforwardgallerypaths before and after the current feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current feedforwardgallerypath
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	*/
	public static feedforwardgallerypath[] findByCONTENT_ID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the feedforwardgallerypaths where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of feedforwardgallerypaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching feedforwardgallerypaths
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the feedforwardgallerypath in the entity cache if it is enabled.
	*
	* @param feedforwardgallerypath the feedforwardgallerypath
	*/
	public static void cacheResult(
		feedforwardgallerypath feedforwardgallerypath) {
		getPersistence().cacheResult(feedforwardgallerypath);
	}

	/**
	* Caches the feedforwardgallerypaths in the entity cache if it is enabled.
	*
	* @param feedforwardgallerypaths the feedforwardgallerypaths
	*/
	public static void cacheResult(
		List<feedforwardgallerypath> feedforwardgallerypaths) {
		getPersistence().cacheResult(feedforwardgallerypaths);
	}

	/**
	* Creates a new feedforwardgallerypath with the primary key. Does not add the feedforwardgallerypath to the database.
	*
	* @param id the primary key for the new feedforwardgallerypath
	* @return the new feedforwardgallerypath
	*/
	public static feedforwardgallerypath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the feedforwardgallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the feedforwardgallerypath
	* @return the feedforwardgallerypath that was removed
	* @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	*/
	public static feedforwardgallerypath remove(long id)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException {
		return getPersistence().remove(id);
	}

	public static feedforwardgallerypath updateImpl(
		feedforwardgallerypath feedforwardgallerypath) {
		return getPersistence().updateImpl(feedforwardgallerypath);
	}

	/**
	* Returns the feedforwardgallerypath with the primary key or throws a {@link NoSuchfeedforwardgallerypathException} if it could not be found.
	*
	* @param id the primary key of the feedforwardgallerypath
	* @return the feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	*/
	public static feedforwardgallerypath findByPrimaryKey(long id)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the feedforwardgallerypath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the feedforwardgallerypath
	* @return the feedforwardgallerypath, or <code>null</code> if a feedforwardgallerypath with the primary key could not be found
	*/
	public static feedforwardgallerypath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, feedforwardgallerypath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the feedforwardgallerypaths.
	*
	* @return the feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the feedforwardgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @return the range of feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the feedforwardgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findAll(int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedforwardgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of feedforwardgallerypaths
	*/
	public static List<feedforwardgallerypath> findAll(int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the feedforwardgallerypaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of feedforwardgallerypaths.
	*
	* @return the number of feedforwardgallerypaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static feedforwardgallerypathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (feedforwardgallerypathPersistence)PortletBeanLocatorUtil.locate(com.chola.feedforward.service.ClpSerializer.getServletContextName(),
					feedforwardgallerypathPersistence.class.getName());

			ReferenceRegistry.registerReference(feedforwardgallerypathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static feedforwardgallerypathPersistence _persistence;
}