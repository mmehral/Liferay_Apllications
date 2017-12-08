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

import com.chola.feedforward.model.feedforwardgallery;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the feedforwardgallery service. This utility wraps {@link com.chola.feedforward.service.persistence.impl.feedforwardgalleryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see feedforwardgalleryPersistence
 * @see com.chola.feedforward.service.persistence.impl.feedforwardgalleryPersistenceImpl
 * @generated
 */
@ProviderType
public class feedforwardgalleryUtil {
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
	public static void clearCache(feedforwardgallery feedforwardgallery) {
		getPersistence().clearCache(feedforwardgallery);
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
	public static List<feedforwardgallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<feedforwardgallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<feedforwardgallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<feedforwardgallery> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static feedforwardgallery update(
		feedforwardgallery feedforwardgallery) {
		return getPersistence().update(feedforwardgallery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static feedforwardgallery update(
		feedforwardgallery feedforwardgallery, ServiceContext serviceContext) {
		return getPersistence().update(feedforwardgallery, serviceContext);
	}

	/**
	* Returns all the feedforwardgalleries where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching feedforwardgalleries
	*/
	public static List<feedforwardgallery> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the feedforwardgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @return the range of matching feedforwardgalleries
	*/
	public static List<feedforwardgallery> findByCONTENT_ID(long content_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgalleries
	*/
	public static List<feedforwardgallery> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<feedforwardgallery> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgalleries
	*/
	public static List<feedforwardgallery> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<feedforwardgallery> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallery
	* @throws NoSuchfeedforwardgalleryException if a matching feedforwardgallery could not be found
	*/
	public static feedforwardgallery findByCONTENT_ID_First(long content_id,
		OrderByComparator<feedforwardgallery> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallery, or <code>null</code> if a matching feedforwardgallery could not be found
	*/
	public static feedforwardgallery fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<feedforwardgallery> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallery
	* @throws NoSuchfeedforwardgalleryException if a matching feedforwardgallery could not be found
	*/
	public static feedforwardgallery findByCONTENT_ID_Last(long content_id,
		OrderByComparator<feedforwardgallery> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallery, or <code>null</code> if a matching feedforwardgallery could not be found
	*/
	public static feedforwardgallery fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<feedforwardgallery> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the feedforwardgalleries before and after the current feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current feedforwardgallery
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgallery
	* @throws NoSuchfeedforwardgalleryException if a feedforwardgallery with the primary key could not be found
	*/
	public static feedforwardgallery[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<feedforwardgallery> orderByComparator)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the feedforwardgalleries where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of feedforwardgalleries where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching feedforwardgalleries
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the feedforwardgallery in the entity cache if it is enabled.
	*
	* @param feedforwardgallery the feedforwardgallery
	*/
	public static void cacheResult(feedforwardgallery feedforwardgallery) {
		getPersistence().cacheResult(feedforwardgallery);
	}

	/**
	* Caches the feedforwardgalleries in the entity cache if it is enabled.
	*
	* @param feedforwardgalleries the feedforwardgalleries
	*/
	public static void cacheResult(
		List<feedforwardgallery> feedforwardgalleries) {
		getPersistence().cacheResult(feedforwardgalleries);
	}

	/**
	* Creates a new feedforwardgallery with the primary key. Does not add the feedforwardgallery to the database.
	*
	* @param id the primary key for the new feedforwardgallery
	* @return the new feedforwardgallery
	*/
	public static feedforwardgallery create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the feedforwardgallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the feedforwardgallery
	* @return the feedforwardgallery that was removed
	* @throws NoSuchfeedforwardgalleryException if a feedforwardgallery with the primary key could not be found
	*/
	public static feedforwardgallery remove(long id)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryException {
		return getPersistence().remove(id);
	}

	public static feedforwardgallery updateImpl(
		feedforwardgallery feedforwardgallery) {
		return getPersistence().updateImpl(feedforwardgallery);
	}

	/**
	* Returns the feedforwardgallery with the primary key or throws a {@link NoSuchfeedforwardgalleryException} if it could not be found.
	*
	* @param id the primary key of the feedforwardgallery
	* @return the feedforwardgallery
	* @throws NoSuchfeedforwardgalleryException if a feedforwardgallery with the primary key could not be found
	*/
	public static feedforwardgallery findByPrimaryKey(long id)
		throws com.chola.feedforward.exception.NoSuchfeedforwardgalleryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the feedforwardgallery with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the feedforwardgallery
	* @return the feedforwardgallery, or <code>null</code> if a feedforwardgallery with the primary key could not be found
	*/
	public static feedforwardgallery fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, feedforwardgallery> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the feedforwardgalleries.
	*
	* @return the feedforwardgalleries
	*/
	public static List<feedforwardgallery> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the feedforwardgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @return the range of feedforwardgalleries
	*/
	public static List<feedforwardgallery> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedforwardgalleries
	*/
	public static List<feedforwardgallery> findAll(int start, int end,
		OrderByComparator<feedforwardgallery> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedforwardgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of feedforwardgalleries
	*/
	public static List<feedforwardgallery> findAll(int start, int end,
		OrderByComparator<feedforwardgallery> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the feedforwardgalleries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of feedforwardgalleries.
	*
	* @return the number of feedforwardgalleries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static feedforwardgalleryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (feedforwardgalleryPersistence)PortletBeanLocatorUtil.locate(com.chola.feedforward.service.ClpSerializer.getServletContextName(),
					feedforwardgalleryPersistence.class.getName());

			ReferenceRegistry.registerReference(feedforwardgalleryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static feedforwardgalleryPersistence _persistence;
}