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

package com.chola.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.model.businesssopDetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the businesssop details service. This utility wraps {@link com.chola.business.service.persistence.impl.businesssopDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see businesssopDetailsPersistence
 * @see com.chola.business.service.persistence.impl.businesssopDetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class businesssopDetailsUtil {
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
	public static void clearCache(businesssopDetails businesssopDetails) {
		getPersistence().clearCache(businesssopDetails);
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
	public static List<businesssopDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<businesssopDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<businesssopDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<businesssopDetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static businesssopDetails update(
		businesssopDetails businesssopDetails) {
		return getPersistence().update(businesssopDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static businesssopDetails update(
		businesssopDetails businesssopDetails, ServiceContext serviceContext) {
		return getPersistence().update(businesssopDetails, serviceContext);
	}

	/**
	* Caches the businesssop details in the entity cache if it is enabled.
	*
	* @param businesssopDetails the businesssop details
	*/
	public static void cacheResult(businesssopDetails businesssopDetails) {
		getPersistence().cacheResult(businesssopDetails);
	}

	/**
	* Caches the businesssop detailses in the entity cache if it is enabled.
	*
	* @param businesssopDetailses the businesssop detailses
	*/
	public static void cacheResult(
		List<businesssopDetails> businesssopDetailses) {
		getPersistence().cacheResult(businesssopDetailses);
	}

	/**
	* Creates a new businesssop details with the primary key. Does not add the businesssop details to the database.
	*
	* @param id the primary key for the new businesssop details
	* @return the new businesssop details
	*/
	public static businesssopDetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the businesssop details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details that was removed
	* @throws NoSuchbusinesssopDetailsException if a businesssop details with the primary key could not be found
	*/
	public static businesssopDetails remove(long id)
		throws com.chola.business.exception.NoSuchbusinesssopDetailsException {
		return getPersistence().remove(id);
	}

	public static businesssopDetails updateImpl(
		businesssopDetails businesssopDetails) {
		return getPersistence().updateImpl(businesssopDetails);
	}

	/**
	* Returns the businesssop details with the primary key or throws a {@link NoSuchbusinesssopDetailsException} if it could not be found.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details
	* @throws NoSuchbusinesssopDetailsException if a businesssop details with the primary key could not be found
	*/
	public static businesssopDetails findByPrimaryKey(long id)
		throws com.chola.business.exception.NoSuchbusinesssopDetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the businesssop details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details, or <code>null</code> if a businesssop details with the primary key could not be found
	*/
	public static businesssopDetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, businesssopDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the businesssop detailses.
	*
	* @return the businesssop detailses
	*/
	public static List<businesssopDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the businesssop detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssop detailses
	* @param end the upper bound of the range of businesssop detailses (not inclusive)
	* @return the range of businesssop detailses
	*/
	public static List<businesssopDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the businesssop detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssop detailses
	* @param end the upper bound of the range of businesssop detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesssop detailses
	*/
	public static List<businesssopDetails> findAll(int start, int end,
		OrderByComparator<businesssopDetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the businesssop detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssop detailses
	* @param end the upper bound of the range of businesssop detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businesssop detailses
	*/
	public static List<businesssopDetails> findAll(int start, int end,
		OrderByComparator<businesssopDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the businesssop detailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of businesssop detailses.
	*
	* @return the number of businesssop detailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static businesssopDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (businesssopDetailsPersistence)PortletBeanLocatorUtil.locate(com.chola.business.service.ClpSerializer.getServletContextName(),
					businesssopDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(businesssopDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static businesssopDetailsPersistence _persistence;
}