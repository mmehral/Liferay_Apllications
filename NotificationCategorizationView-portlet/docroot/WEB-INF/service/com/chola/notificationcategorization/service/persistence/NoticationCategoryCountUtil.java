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

package com.chola.notificationcategorization.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.notificationcategorization.model.NoticationCategoryCount;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the notication category count service. This utility wraps {@link com.chola.notificationcategorization.service.persistence.impl.NoticationCategoryCountPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay03
 * @see NoticationCategoryCountPersistence
 * @see com.chola.notificationcategorization.service.persistence.impl.NoticationCategoryCountPersistenceImpl
 * @generated
 */
@ProviderType
public class NoticationCategoryCountUtil {
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
		NoticationCategoryCount noticationCategoryCount) {
		getPersistence().clearCache(noticationCategoryCount);
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
	public static List<NoticationCategoryCount> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NoticationCategoryCount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NoticationCategoryCount> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NoticationCategoryCount> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NoticationCategoryCount update(
		NoticationCategoryCount noticationCategoryCount) {
		return getPersistence().update(noticationCategoryCount);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NoticationCategoryCount update(
		NoticationCategoryCount noticationCategoryCount,
		ServiceContext serviceContext) {
		return getPersistence().update(noticationCategoryCount, serviceContext);
	}

	/**
	* Caches the notication category count in the entity cache if it is enabled.
	*
	* @param noticationCategoryCount the notication category count
	*/
	public static void cacheResult(
		NoticationCategoryCount noticationCategoryCount) {
		getPersistence().cacheResult(noticationCategoryCount);
	}

	/**
	* Caches the notication category counts in the entity cache if it is enabled.
	*
	* @param noticationCategoryCounts the notication category counts
	*/
	public static void cacheResult(
		List<NoticationCategoryCount> noticationCategoryCounts) {
		getPersistence().cacheResult(noticationCategoryCounts);
	}

	/**
	* Creates a new notication category count with the primary key. Does not add the notication category count to the database.
	*
	* @param eventId the primary key for the new notication category count
	* @return the new notication category count
	*/
	public static NoticationCategoryCount create(long eventId) {
		return getPersistence().create(eventId);
	}

	/**
	* Removes the notication category count with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count that was removed
	* @throws NoSuchNoticationCategoryCountException if a notication category count with the primary key could not be found
	*/
	public static NoticationCategoryCount remove(long eventId)
		throws com.chola.notificationcategorization.exception.NoSuchNoticationCategoryCountException {
		return getPersistence().remove(eventId);
	}

	public static NoticationCategoryCount updateImpl(
		NoticationCategoryCount noticationCategoryCount) {
		return getPersistence().updateImpl(noticationCategoryCount);
	}

	/**
	* Returns the notication category count with the primary key or throws a {@link NoSuchNoticationCategoryCountException} if it could not be found.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count
	* @throws NoSuchNoticationCategoryCountException if a notication category count with the primary key could not be found
	*/
	public static NoticationCategoryCount findByPrimaryKey(long eventId)
		throws com.chola.notificationcategorization.exception.NoSuchNoticationCategoryCountException {
		return getPersistence().findByPrimaryKey(eventId);
	}

	/**
	* Returns the notication category count with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count, or <code>null</code> if a notication category count with the primary key could not be found
	*/
	public static NoticationCategoryCount fetchByPrimaryKey(long eventId) {
		return getPersistence().fetchByPrimaryKey(eventId);
	}

	public static java.util.Map<java.io.Serializable, NoticationCategoryCount> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the notication category counts.
	*
	* @return the notication category counts
	*/
	public static List<NoticationCategoryCount> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the notication category counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notication category counts
	* @param end the upper bound of the range of notication category counts (not inclusive)
	* @return the range of notication category counts
	*/
	public static List<NoticationCategoryCount> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the notication category counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notication category counts
	* @param end the upper bound of the range of notication category counts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of notication category counts
	*/
	public static List<NoticationCategoryCount> findAll(int start, int end,
		OrderByComparator<NoticationCategoryCount> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the notication category counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notication category counts
	* @param end the upper bound of the range of notication category counts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of notication category counts
	*/
	public static List<NoticationCategoryCount> findAll(int start, int end,
		OrderByComparator<NoticationCategoryCount> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the notication category counts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of notication category counts.
	*
	* @return the number of notication category counts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NoticationCategoryCountPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NoticationCategoryCountPersistence)PortletBeanLocatorUtil.locate(com.chola.notificationcategorization.service.ClpSerializer.getServletContextName(),
					NoticationCategoryCountPersistence.class.getName());

			ReferenceRegistry.registerReference(NoticationCategoryCountUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static NoticationCategoryCountPersistence _persistence;
}