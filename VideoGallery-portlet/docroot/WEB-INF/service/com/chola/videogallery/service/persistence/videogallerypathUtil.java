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

package com.chola.videogallery.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.videogallery.model.videogallerypath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the videogallerypath service. This utility wraps {@link com.chola.videogallery.service.persistence.impl.videogallerypathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see videogallerypathPersistence
 * @see com.chola.videogallery.service.persistence.impl.videogallerypathPersistenceImpl
 * @generated
 */
@ProviderType
public class videogallerypathUtil {
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
	public static void clearCache(videogallerypath videogallerypath) {
		getPersistence().clearCache(videogallerypath);
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
	public static List<videogallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<videogallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<videogallerypath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<videogallerypath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static videogallerypath update(videogallerypath videogallerypath) {
		return getPersistence().update(videogallerypath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static videogallerypath update(videogallerypath videogallerypath,
		ServiceContext serviceContext) {
		return getPersistence().update(videogallerypath, serviceContext);
	}

	/**
	* Returns all the videogallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the matching videogallerypaths
	*/
	public static List<videogallerypath> findByALBUMID(java.lang.String albumId) {
		return getPersistence().findByALBUMID(albumId);
	}

	/**
	* Returns a range of all the videogallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @return the range of matching videogallerypaths
	*/
	public static List<videogallerypath> findByALBUMID(
		java.lang.String albumId, int start, int end) {
		return getPersistence().findByALBUMID(albumId, start, end);
	}

	/**
	* Returns an ordered range of all the videogallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching videogallerypaths
	*/
	public static List<videogallerypath> findByALBUMID(
		java.lang.String albumId, int start, int end,
		OrderByComparator<videogallerypath> orderByComparator) {
		return getPersistence()
				   .findByALBUMID(albumId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the videogallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching videogallerypaths
	*/
	public static List<videogallerypath> findByALBUMID(
		java.lang.String albumId, int start, int end,
		OrderByComparator<videogallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByALBUMID(albumId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching videogallerypath
	* @throws NoSuchvideogallerypathException if a matching videogallerypath could not be found
	*/
	public static videogallerypath findByALBUMID_First(
		java.lang.String albumId,
		OrderByComparator<videogallerypath> orderByComparator)
		throws com.chola.videogallery.exception.NoSuchvideogallerypathException {
		return getPersistence().findByALBUMID_First(albumId, orderByComparator);
	}

	/**
	* Returns the first videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching videogallerypath, or <code>null</code> if a matching videogallerypath could not be found
	*/
	public static videogallerypath fetchByALBUMID_First(
		java.lang.String albumId,
		OrderByComparator<videogallerypath> orderByComparator) {
		return getPersistence().fetchByALBUMID_First(albumId, orderByComparator);
	}

	/**
	* Returns the last videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching videogallerypath
	* @throws NoSuchvideogallerypathException if a matching videogallerypath could not be found
	*/
	public static videogallerypath findByALBUMID_Last(
		java.lang.String albumId,
		OrderByComparator<videogallerypath> orderByComparator)
		throws com.chola.videogallery.exception.NoSuchvideogallerypathException {
		return getPersistence().findByALBUMID_Last(albumId, orderByComparator);
	}

	/**
	* Returns the last videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching videogallerypath, or <code>null</code> if a matching videogallerypath could not be found
	*/
	public static videogallerypath fetchByALBUMID_Last(
		java.lang.String albumId,
		OrderByComparator<videogallerypath> orderByComparator) {
		return getPersistence().fetchByALBUMID_Last(albumId, orderByComparator);
	}

	/**
	* Returns the videogallerypaths before and after the current videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param id the primary key of the current videogallerypath
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next videogallerypath
	* @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	*/
	public static videogallerypath[] findByALBUMID_PrevAndNext(long id,
		java.lang.String albumId,
		OrderByComparator<videogallerypath> orderByComparator)
		throws com.chola.videogallery.exception.NoSuchvideogallerypathException {
		return getPersistence()
				   .findByALBUMID_PrevAndNext(id, albumId, orderByComparator);
	}

	/**
	* Removes all the videogallerypaths where albumId = &#63; from the database.
	*
	* @param albumId the album ID
	*/
	public static void removeByALBUMID(java.lang.String albumId) {
		getPersistence().removeByALBUMID(albumId);
	}

	/**
	* Returns the number of videogallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the number of matching videogallerypaths
	*/
	public static int countByALBUMID(java.lang.String albumId) {
		return getPersistence().countByALBUMID(albumId);
	}

	/**
	* Caches the videogallerypath in the entity cache if it is enabled.
	*
	* @param videogallerypath the videogallerypath
	*/
	public static void cacheResult(videogallerypath videogallerypath) {
		getPersistence().cacheResult(videogallerypath);
	}

	/**
	* Caches the videogallerypaths in the entity cache if it is enabled.
	*
	* @param videogallerypaths the videogallerypaths
	*/
	public static void cacheResult(List<videogallerypath> videogallerypaths) {
		getPersistence().cacheResult(videogallerypaths);
	}

	/**
	* Creates a new videogallerypath with the primary key. Does not add the videogallerypath to the database.
	*
	* @param id the primary key for the new videogallerypath
	* @return the new videogallerypath
	*/
	public static videogallerypath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the videogallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the videogallerypath
	* @return the videogallerypath that was removed
	* @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	*/
	public static videogallerypath remove(long id)
		throws com.chola.videogallery.exception.NoSuchvideogallerypathException {
		return getPersistence().remove(id);
	}

	public static videogallerypath updateImpl(videogallerypath videogallerypath) {
		return getPersistence().updateImpl(videogallerypath);
	}

	/**
	* Returns the videogallerypath with the primary key or throws a {@link NoSuchvideogallerypathException} if it could not be found.
	*
	* @param id the primary key of the videogallerypath
	* @return the videogallerypath
	* @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	*/
	public static videogallerypath findByPrimaryKey(long id)
		throws com.chola.videogallery.exception.NoSuchvideogallerypathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the videogallerypath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the videogallerypath
	* @return the videogallerypath, or <code>null</code> if a videogallerypath with the primary key could not be found
	*/
	public static videogallerypath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, videogallerypath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the videogallerypaths.
	*
	* @return the videogallerypaths
	*/
	public static List<videogallerypath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the videogallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @return the range of videogallerypaths
	*/
	public static List<videogallerypath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the videogallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of videogallerypaths
	*/
	public static List<videogallerypath> findAll(int start, int end,
		OrderByComparator<videogallerypath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the videogallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of videogallerypaths
	*/
	public static List<videogallerypath> findAll(int start, int end,
		OrderByComparator<videogallerypath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the videogallerypaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of videogallerypaths.
	*
	* @return the number of videogallerypaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static videogallerypathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (videogallerypathPersistence)PortletBeanLocatorUtil.locate(com.chola.videogallery.service.ClpSerializer.getServletContextName(),
					videogallerypathPersistence.class.getName());

			ReferenceRegistry.registerReference(videogallerypathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static videogallerypathPersistence _persistence;
}