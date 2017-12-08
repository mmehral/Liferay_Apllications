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

package com.chola.quarterly.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.quarterly.model.quarterlyreports;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the quarterlyreports service. This utility wraps {@link com.chola.quarterly.service.persistence.impl.quarterlyreportsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see quarterlyreportsPersistence
 * @see com.chola.quarterly.service.persistence.impl.quarterlyreportsPersistenceImpl
 * @generated
 */
@ProviderType
public class quarterlyreportsUtil {
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
	public static void clearCache(quarterlyreports quarterlyreports) {
		getPersistence().clearCache(quarterlyreports);
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
	public static List<quarterlyreports> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<quarterlyreports> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<quarterlyreports> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<quarterlyreports> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static quarterlyreports update(quarterlyreports quarterlyreports) {
		return getPersistence().update(quarterlyreports);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static quarterlyreports update(quarterlyreports quarterlyreports,
		ServiceContext serviceContext) {
		return getPersistence().update(quarterlyreports, serviceContext);
	}

	/**
	* Caches the quarterlyreports in the entity cache if it is enabled.
	*
	* @param quarterlyreports the quarterlyreports
	*/
	public static void cacheResult(quarterlyreports quarterlyreports) {
		getPersistence().cacheResult(quarterlyreports);
	}

	/**
	* Caches the quarterlyreportses in the entity cache if it is enabled.
	*
	* @param quarterlyreportses the quarterlyreportses
	*/
	public static void cacheResult(List<quarterlyreports> quarterlyreportses) {
		getPersistence().cacheResult(quarterlyreportses);
	}

	/**
	* Creates a new quarterlyreports with the primary key. Does not add the quarterlyreports to the database.
	*
	* @param id the primary key for the new quarterlyreports
	* @return the new quarterlyreports
	*/
	public static quarterlyreports create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the quarterlyreports with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the quarterlyreports
	* @return the quarterlyreports that was removed
	* @throws NoSuchquarterlyreportsException if a quarterlyreports with the primary key could not be found
	*/
	public static quarterlyreports remove(long id)
		throws com.chola.quarterly.exception.NoSuchquarterlyreportsException {
		return getPersistence().remove(id);
	}

	public static quarterlyreports updateImpl(quarterlyreports quarterlyreports) {
		return getPersistence().updateImpl(quarterlyreports);
	}

	/**
	* Returns the quarterlyreports with the primary key or throws a {@link NoSuchquarterlyreportsException} if it could not be found.
	*
	* @param id the primary key of the quarterlyreports
	* @return the quarterlyreports
	* @throws NoSuchquarterlyreportsException if a quarterlyreports with the primary key could not be found
	*/
	public static quarterlyreports findByPrimaryKey(long id)
		throws com.chola.quarterly.exception.NoSuchquarterlyreportsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the quarterlyreports with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the quarterlyreports
	* @return the quarterlyreports, or <code>null</code> if a quarterlyreports with the primary key could not be found
	*/
	public static quarterlyreports fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, quarterlyreports> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the quarterlyreportses.
	*
	* @return the quarterlyreportses
	*/
	public static List<quarterlyreports> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the quarterlyreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of quarterlyreportses
	* @param end the upper bound of the range of quarterlyreportses (not inclusive)
	* @return the range of quarterlyreportses
	*/
	public static List<quarterlyreports> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the quarterlyreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of quarterlyreportses
	* @param end the upper bound of the range of quarterlyreportses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of quarterlyreportses
	*/
	public static List<quarterlyreports> findAll(int start, int end,
		OrderByComparator<quarterlyreports> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the quarterlyreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of quarterlyreportses
	* @param end the upper bound of the range of quarterlyreportses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of quarterlyreportses
	*/
	public static List<quarterlyreports> findAll(int start, int end,
		OrderByComparator<quarterlyreports> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the quarterlyreportses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of quarterlyreportses.
	*
	* @return the number of quarterlyreportses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static quarterlyreportsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (quarterlyreportsPersistence)PortletBeanLocatorUtil.locate(com.chola.quarterly.service.ClpSerializer.getServletContextName(),
					quarterlyreportsPersistence.class.getName());

			ReferenceRegistry.registerReference(quarterlyreportsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static quarterlyreportsPersistence _persistence;
}