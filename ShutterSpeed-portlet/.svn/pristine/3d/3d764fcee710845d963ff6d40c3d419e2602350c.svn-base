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

import com.chola.shutterspeed.model.shutterspeedgallery;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the shutterspeedgallery service. This utility wraps {@link com.chola.shutterspeed.service.persistence.impl.shutterspeedgalleryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see shutterspeedgalleryPersistence
 * @see com.chola.shutterspeed.service.persistence.impl.shutterspeedgalleryPersistenceImpl
 * @generated
 */
@ProviderType
public class shutterspeedgalleryUtil {
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
	public static void clearCache(shutterspeedgallery shutterspeedgallery) {
		getPersistence().clearCache(shutterspeedgallery);
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
	public static List<shutterspeedgallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<shutterspeedgallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<shutterspeedgallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<shutterspeedgallery> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static shutterspeedgallery update(
		shutterspeedgallery shutterspeedgallery) {
		return getPersistence().update(shutterspeedgallery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static shutterspeedgallery update(
		shutterspeedgallery shutterspeedgallery, ServiceContext serviceContext) {
		return getPersistence().update(shutterspeedgallery, serviceContext);
	}

	/**
	* Returns all the shutterspeedgalleries where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching shutterspeedgalleries
	*/
	public static List<shutterspeedgallery> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the shutterspeedgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgalleries
	* @param end the upper bound of the range of shutterspeedgalleries (not inclusive)
	* @return the range of matching shutterspeedgalleries
	*/
	public static List<shutterspeedgallery> findByCONTENT_ID(long content_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgalleries
	* @param end the upper bound of the range of shutterspeedgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shutterspeedgalleries
	*/
	public static List<shutterspeedgallery> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<shutterspeedgallery> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgalleries
	* @param end the upper bound of the range of shutterspeedgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching shutterspeedgalleries
	*/
	public static List<shutterspeedgallery> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<shutterspeedgallery> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first shutterspeedgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallery
	* @throws NoSuchshutterspeedgalleryException if a matching shutterspeedgallery could not be found
	*/
	public static shutterspeedgallery findByCONTENT_ID_First(long content_id,
		OrderByComparator<shutterspeedgallery> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first shutterspeedgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallery, or <code>null</code> if a matching shutterspeedgallery could not be found
	*/
	public static shutterspeedgallery fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<shutterspeedgallery> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallery
	* @throws NoSuchshutterspeedgalleryException if a matching shutterspeedgallery could not be found
	*/
	public static shutterspeedgallery findByCONTENT_ID_Last(long content_id,
		OrderByComparator<shutterspeedgallery> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last shutterspeedgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallery, or <code>null</code> if a matching shutterspeedgallery could not be found
	*/
	public static shutterspeedgallery fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<shutterspeedgallery> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the shutterspeedgalleries before and after the current shutterspeedgallery in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current shutterspeedgallery
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shutterspeedgallery
	* @throws NoSuchshutterspeedgalleryException if a shutterspeedgallery with the primary key could not be found
	*/
	public static shutterspeedgallery[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id,
		OrderByComparator<shutterspeedgallery> orderByComparator)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the shutterspeedgalleries where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of shutterspeedgalleries where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching shutterspeedgalleries
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the shutterspeedgallery in the entity cache if it is enabled.
	*
	* @param shutterspeedgallery the shutterspeedgallery
	*/
	public static void cacheResult(shutterspeedgallery shutterspeedgallery) {
		getPersistence().cacheResult(shutterspeedgallery);
	}

	/**
	* Caches the shutterspeedgalleries in the entity cache if it is enabled.
	*
	* @param shutterspeedgalleries the shutterspeedgalleries
	*/
	public static void cacheResult(
		List<shutterspeedgallery> shutterspeedgalleries) {
		getPersistence().cacheResult(shutterspeedgalleries);
	}

	/**
	* Creates a new shutterspeedgallery with the primary key. Does not add the shutterspeedgallery to the database.
	*
	* @param id the primary key for the new shutterspeedgallery
	* @return the new shutterspeedgallery
	*/
	public static shutterspeedgallery create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the shutterspeedgallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shutterspeedgallery
	* @return the shutterspeedgallery that was removed
	* @throws NoSuchshutterspeedgalleryException if a shutterspeedgallery with the primary key could not be found
	*/
	public static shutterspeedgallery remove(long id)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryException {
		return getPersistence().remove(id);
	}

	public static shutterspeedgallery updateImpl(
		shutterspeedgallery shutterspeedgallery) {
		return getPersistence().updateImpl(shutterspeedgallery);
	}

	/**
	* Returns the shutterspeedgallery with the primary key or throws a {@link NoSuchshutterspeedgalleryException} if it could not be found.
	*
	* @param id the primary key of the shutterspeedgallery
	* @return the shutterspeedgallery
	* @throws NoSuchshutterspeedgalleryException if a shutterspeedgallery with the primary key could not be found
	*/
	public static shutterspeedgallery findByPrimaryKey(long id)
		throws com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the shutterspeedgallery with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the shutterspeedgallery
	* @return the shutterspeedgallery, or <code>null</code> if a shutterspeedgallery with the primary key could not be found
	*/
	public static shutterspeedgallery fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, shutterspeedgallery> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the shutterspeedgalleries.
	*
	* @return the shutterspeedgalleries
	*/
	public static List<shutterspeedgallery> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the shutterspeedgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgalleries
	* @param end the upper bound of the range of shutterspeedgalleries (not inclusive)
	* @return the range of shutterspeedgalleries
	*/
	public static List<shutterspeedgallery> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgalleries
	* @param end the upper bound of the range of shutterspeedgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shutterspeedgalleries
	*/
	public static List<shutterspeedgallery> findAll(int start, int end,
		OrderByComparator<shutterspeedgallery> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shutterspeedgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgalleries
	* @param end the upper bound of the range of shutterspeedgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of shutterspeedgalleries
	*/
	public static List<shutterspeedgallery> findAll(int start, int end,
		OrderByComparator<shutterspeedgallery> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the shutterspeedgalleries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of shutterspeedgalleries.
	*
	* @return the number of shutterspeedgalleries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static shutterspeedgalleryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (shutterspeedgalleryPersistence)PortletBeanLocatorUtil.locate(com.chola.shutterspeed.service.ClpSerializer.getServletContextName(),
					shutterspeedgalleryPersistence.class.getName());

			ReferenceRegistry.registerReference(shutterspeedgalleryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static shutterspeedgalleryPersistence _persistence;
}