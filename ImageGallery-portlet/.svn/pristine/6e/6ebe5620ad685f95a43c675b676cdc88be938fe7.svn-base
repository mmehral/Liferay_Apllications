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

package com.chola.imagegallery.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.imagegallery.model.imagegallerypath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the imagegallerypath service. This utility wraps {@link com.chola.imagegallery.service.persistence.impl.imagegallerypathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see imagegallerypathPersistence
 * @see com.chola.imagegallery.service.persistence.impl.imagegallerypathPersistenceImpl
 * @generated
 */
@ProviderType
public class imagegallerypathUtil {
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
	public static void clearCache(imagegallerypath imagegallerypath) {
		getPersistence().clearCache(imagegallerypath);
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
	public static List<imagegallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<imagegallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<imagegallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<imagegallerypath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static imagegallerypath update(imagegallerypath imagegallerypath) {
		return getPersistence().update(imagegallerypath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static imagegallerypath update(imagegallerypath imagegallerypath,
		ServiceContext serviceContext) {
		return getPersistence().update(imagegallerypath, serviceContext);
	}

	/**
	* Returns all the imagegallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the matching imagegallerypaths
	*/
	public static List<imagegallerypath> findByALBUM_ID(
		java.lang.String albumId) {
		return getPersistence().findByALBUM_ID(albumId);
	}

	/**
	* Returns a range of all the imagegallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @return the range of matching imagegallerypaths
	*/
	public static List<imagegallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end) {
		return getPersistence().findByALBUM_ID(albumId, start, end);
	}

	/**
	* Returns an ordered range of all the imagegallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imagegallerypaths
	*/
	public static List<imagegallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		OrderByComparator<imagegallerypath> orderByComparator) {
		return getPersistence()
				   .findByALBUM_ID(albumId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the imagegallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching imagegallerypaths
	*/
	public static List<imagegallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		OrderByComparator<imagegallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByALBUM_ID(albumId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imagegallerypath
	* @throws NoSuchimagegallerypathException if a matching imagegallerypath could not be found
	*/
	public static imagegallerypath findByALBUM_ID_First(
		java.lang.String albumId,
		OrderByComparator<imagegallerypath> orderByComparator)
		throws com.chola.imagegallery.exception.NoSuchimagegallerypathException {
		return getPersistence().findByALBUM_ID_First(albumId, orderByComparator);
	}

	/**
	* Returns the first imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imagegallerypath, or <code>null</code> if a matching imagegallerypath could not be found
	*/
	public static imagegallerypath fetchByALBUM_ID_First(
		java.lang.String albumId,
		OrderByComparator<imagegallerypath> orderByComparator) {
		return getPersistence().fetchByALBUM_ID_First(albumId, orderByComparator);
	}

	/**
	* Returns the last imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imagegallerypath
	* @throws NoSuchimagegallerypathException if a matching imagegallerypath could not be found
	*/
	public static imagegallerypath findByALBUM_ID_Last(
		java.lang.String albumId,
		OrderByComparator<imagegallerypath> orderByComparator)
		throws com.chola.imagegallery.exception.NoSuchimagegallerypathException {
		return getPersistence().findByALBUM_ID_Last(albumId, orderByComparator);
	}

	/**
	* Returns the last imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imagegallerypath, or <code>null</code> if a matching imagegallerypath could not be found
	*/
	public static imagegallerypath fetchByALBUM_ID_Last(
		java.lang.String albumId,
		OrderByComparator<imagegallerypath> orderByComparator) {
		return getPersistence().fetchByALBUM_ID_Last(albumId, orderByComparator);
	}

	/**
	* Returns the imagegallerypaths before and after the current imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param id the primary key of the current imagegallerypath
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imagegallerypath
	* @throws NoSuchimagegallerypathException if a imagegallerypath with the primary key could not be found
	*/
	public static imagegallerypath[] findByALBUM_ID_PrevAndNext(long id,
		java.lang.String albumId,
		OrderByComparator<imagegallerypath> orderByComparator)
		throws com.chola.imagegallery.exception.NoSuchimagegallerypathException {
		return getPersistence()
				   .findByALBUM_ID_PrevAndNext(id, albumId, orderByComparator);
	}

	/**
	* Removes all the imagegallerypaths where albumId = &#63; from the database.
	*
	* @param albumId the album ID
	*/
	public static void removeByALBUM_ID(java.lang.String albumId) {
		getPersistence().removeByALBUM_ID(albumId);
	}

	/**
	* Returns the number of imagegallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the number of matching imagegallerypaths
	*/
	public static int countByALBUM_ID(java.lang.String albumId) {
		return getPersistence().countByALBUM_ID(albumId);
	}

	/**
	* Caches the imagegallerypath in the entity cache if it is enabled.
	*
	* @param imagegallerypath the imagegallerypath
	*/
	public static void cacheResult(imagegallerypath imagegallerypath) {
		getPersistence().cacheResult(imagegallerypath);
	}

	/**
	* Caches the imagegallerypaths in the entity cache if it is enabled.
	*
	* @param imagegallerypaths the imagegallerypaths
	*/
	public static void cacheResult(List<imagegallerypath> imagegallerypaths) {
		getPersistence().cacheResult(imagegallerypaths);
	}

	/**
	* Creates a new imagegallerypath with the primary key. Does not add the imagegallerypath to the database.
	*
	* @param id the primary key for the new imagegallerypath
	* @return the new imagegallerypath
	*/
	public static imagegallerypath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the imagegallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath that was removed
	* @throws NoSuchimagegallerypathException if a imagegallerypath with the primary key could not be found
	*/
	public static imagegallerypath remove(long id)
		throws com.chola.imagegallery.exception.NoSuchimagegallerypathException {
		return getPersistence().remove(id);
	}

	public static imagegallerypath updateImpl(imagegallerypath imagegallerypath) {
		return getPersistence().updateImpl(imagegallerypath);
	}

	/**
	* Returns the imagegallerypath with the primary key or throws a {@link NoSuchimagegallerypathException} if it could not be found.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath
	* @throws NoSuchimagegallerypathException if a imagegallerypath with the primary key could not be found
	*/
	public static imagegallerypath findByPrimaryKey(long id)
		throws com.chola.imagegallery.exception.NoSuchimagegallerypathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the imagegallerypath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath, or <code>null</code> if a imagegallerypath with the primary key could not be found
	*/
	public static imagegallerypath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, imagegallerypath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the imagegallerypaths.
	*
	* @return the imagegallerypaths
	*/
	public static List<imagegallerypath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the imagegallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @return the range of imagegallerypaths
	*/
	public static List<imagegallerypath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the imagegallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of imagegallerypaths
	*/
	public static List<imagegallerypath> findAll(int start, int end,
		OrderByComparator<imagegallerypath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the imagegallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of imagegallerypaths
	*/
	public static List<imagegallerypath> findAll(int start, int end,
		OrderByComparator<imagegallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the imagegallerypaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of imagegallerypaths.
	*
	* @return the number of imagegallerypaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static imagegallerypathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (imagegallerypathPersistence)PortletBeanLocatorUtil.locate(com.chola.imagegallery.service.ClpSerializer.getServletContextName(),
					imagegallerypathPersistence.class.getName());

			ReferenceRegistry.registerReference(imagegallerypathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static imagegallerypathPersistence _persistence;
}