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

import com.chola.imagegallery.model.imagegallery;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the imagegallery service. This utility wraps {@link com.chola.imagegallery.service.persistence.impl.imagegalleryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see imagegalleryPersistence
 * @see com.chola.imagegallery.service.persistence.impl.imagegalleryPersistenceImpl
 * @generated
 */
@ProviderType
public class imagegalleryUtil {
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
	public static void clearCache(imagegallery imagegallery) {
		getPersistence().clearCache(imagegallery);
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
	public static List<imagegallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<imagegallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<imagegallery> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<imagegallery> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static imagegallery update(imagegallery imagegallery) {
		return getPersistence().update(imagegallery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static imagegallery update(imagegallery imagegallery,
		ServiceContext serviceContext) {
		return getPersistence().update(imagegallery, serviceContext);
	}

	/**
	* Caches the imagegallery in the entity cache if it is enabled.
	*
	* @param imagegallery the imagegallery
	*/
	public static void cacheResult(imagegallery imagegallery) {
		getPersistence().cacheResult(imagegallery);
	}

	/**
	* Caches the imagegalleries in the entity cache if it is enabled.
	*
	* @param imagegalleries the imagegalleries
	*/
	public static void cacheResult(List<imagegallery> imagegalleries) {
		getPersistence().cacheResult(imagegalleries);
	}

	/**
	* Creates a new imagegallery with the primary key. Does not add the imagegallery to the database.
	*
	* @param id the primary key for the new imagegallery
	* @return the new imagegallery
	*/
	public static imagegallery create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the imagegallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imagegallery
	* @return the imagegallery that was removed
	* @throws NoSuchimagegalleryException if a imagegallery with the primary key could not be found
	*/
	public static imagegallery remove(long id)
		throws com.chola.imagegallery.exception.NoSuchimagegalleryException {
		return getPersistence().remove(id);
	}

	public static imagegallery updateImpl(imagegallery imagegallery) {
		return getPersistence().updateImpl(imagegallery);
	}

	/**
	* Returns the imagegallery with the primary key or throws a {@link NoSuchimagegalleryException} if it could not be found.
	*
	* @param id the primary key of the imagegallery
	* @return the imagegallery
	* @throws NoSuchimagegalleryException if a imagegallery with the primary key could not be found
	*/
	public static imagegallery findByPrimaryKey(long id)
		throws com.chola.imagegallery.exception.NoSuchimagegalleryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the imagegallery with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the imagegallery
	* @return the imagegallery, or <code>null</code> if a imagegallery with the primary key could not be found
	*/
	public static imagegallery fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, imagegallery> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the imagegalleries.
	*
	* @return the imagegalleries
	*/
	public static List<imagegallery> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the imagegalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegalleries
	* @param end the upper bound of the range of imagegalleries (not inclusive)
	* @return the range of imagegalleries
	*/
	public static List<imagegallery> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the imagegalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegalleries
	* @param end the upper bound of the range of imagegalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of imagegalleries
	*/
	public static List<imagegallery> findAll(int start, int end,
		OrderByComparator<imagegallery> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the imagegalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegalleries
	* @param end the upper bound of the range of imagegalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of imagegalleries
	*/
	public static List<imagegallery> findAll(int start, int end,
		OrderByComparator<imagegallery> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the imagegalleries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of imagegalleries.
	*
	* @return the number of imagegalleries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static imagegalleryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (imagegalleryPersistence)PortletBeanLocatorUtil.locate(com.chola.imagegallery.service.ClpSerializer.getServletContextName(),
					imagegalleryPersistence.class.getName());

			ReferenceRegistry.registerReference(imagegalleryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static imagegalleryPersistence _persistence;
}