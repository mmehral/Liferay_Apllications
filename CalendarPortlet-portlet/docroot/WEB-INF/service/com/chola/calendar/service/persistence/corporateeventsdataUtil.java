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

package com.chola.calendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.model.corporateeventsdata;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the corporateeventsdata service. This utility wraps {@link com.chola.calendar.service.persistence.impl.corporateeventsdataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see corporateeventsdataPersistence
 * @see com.chola.calendar.service.persistence.impl.corporateeventsdataPersistenceImpl
 * @generated
 */
@ProviderType
public class corporateeventsdataUtil {
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
	public static void clearCache(corporateeventsdata corporateeventsdata) {
		getPersistence().clearCache(corporateeventsdata);
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
	public static List<corporateeventsdata> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<corporateeventsdata> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<corporateeventsdata> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<corporateeventsdata> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static corporateeventsdata update(
		corporateeventsdata corporateeventsdata) {
		return getPersistence().update(corporateeventsdata);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static corporateeventsdata update(
		corporateeventsdata corporateeventsdata, ServiceContext serviceContext) {
		return getPersistence().update(corporateeventsdata, serviceContext);
	}

	/**
	* Caches the corporateeventsdata in the entity cache if it is enabled.
	*
	* @param corporateeventsdata the corporateeventsdata
	*/
	public static void cacheResult(corporateeventsdata corporateeventsdata) {
		getPersistence().cacheResult(corporateeventsdata);
	}

	/**
	* Caches the corporateeventsdatas in the entity cache if it is enabled.
	*
	* @param corporateeventsdatas the corporateeventsdatas
	*/
	public static void cacheResult(
		List<corporateeventsdata> corporateeventsdatas) {
		getPersistence().cacheResult(corporateeventsdatas);
	}

	/**
	* Creates a new corporateeventsdata with the primary key. Does not add the corporateeventsdata to the database.
	*
	* @param id the primary key for the new corporateeventsdata
	* @return the new corporateeventsdata
	*/
	public static corporateeventsdata create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the corporateeventsdata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata that was removed
	* @throws NoSuchcorporateeventsdataException if a corporateeventsdata with the primary key could not be found
	*/
	public static corporateeventsdata remove(long id)
		throws com.chola.calendar.exception.NoSuchcorporateeventsdataException {
		return getPersistence().remove(id);
	}

	public static corporateeventsdata updateImpl(
		corporateeventsdata corporateeventsdata) {
		return getPersistence().updateImpl(corporateeventsdata);
	}

	/**
	* Returns the corporateeventsdata with the primary key or throws a {@link NoSuchcorporateeventsdataException} if it could not be found.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata
	* @throws NoSuchcorporateeventsdataException if a corporateeventsdata with the primary key could not be found
	*/
	public static corporateeventsdata findByPrimaryKey(long id)
		throws com.chola.calendar.exception.NoSuchcorporateeventsdataException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the corporateeventsdata with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata, or <code>null</code> if a corporateeventsdata with the primary key could not be found
	*/
	public static corporateeventsdata fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, corporateeventsdata> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the corporateeventsdatas.
	*
	* @return the corporateeventsdatas
	*/
	public static List<corporateeventsdata> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the corporateeventsdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporateeventsdatas
	* @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	* @return the range of corporateeventsdatas
	*/
	public static List<corporateeventsdata> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the corporateeventsdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporateeventsdatas
	* @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporateeventsdatas
	*/
	public static List<corporateeventsdata> findAll(int start, int end,
		OrderByComparator<corporateeventsdata> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the corporateeventsdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporateeventsdatas
	* @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of corporateeventsdatas
	*/
	public static List<corporateeventsdata> findAll(int start, int end,
		OrderByComparator<corporateeventsdata> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the corporateeventsdatas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of corporateeventsdatas.
	*
	* @return the number of corporateeventsdatas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static corporateeventsdataPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (corporateeventsdataPersistence)PortletBeanLocatorUtil.locate(com.chola.calendar.service.ClpSerializer.getServletContextName(),
					corporateeventsdataPersistence.class.getName());

			ReferenceRegistry.registerReference(corporateeventsdataUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static corporateeventsdataPersistence _persistence;
}