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

package com.chola.trainingcalendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.model.trainingcalendardata;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the trainingcalendardata service. This utility wraps {@link com.chola.trainingcalendar.service.persistence.impl.trainingcalendardataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcalendardataPersistence
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingcalendardataPersistenceImpl
 * @generated
 */
@ProviderType
public class trainingcalendardataUtil {
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
	public static void clearCache(trainingcalendardata trainingcalendardata) {
		getPersistence().clearCache(trainingcalendardata);
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
	public static List<trainingcalendardata> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<trainingcalendardata> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<trainingcalendardata> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<trainingcalendardata> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static trainingcalendardata update(
		trainingcalendardata trainingcalendardata) {
		return getPersistence().update(trainingcalendardata);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static trainingcalendardata update(
		trainingcalendardata trainingcalendardata, ServiceContext serviceContext) {
		return getPersistence().update(trainingcalendardata, serviceContext);
	}

	/**
	* Caches the trainingcalendardata in the entity cache if it is enabled.
	*
	* @param trainingcalendardata the trainingcalendardata
	*/
	public static void cacheResult(trainingcalendardata trainingcalendardata) {
		getPersistence().cacheResult(trainingcalendardata);
	}

	/**
	* Caches the trainingcalendardatas in the entity cache if it is enabled.
	*
	* @param trainingcalendardatas the trainingcalendardatas
	*/
	public static void cacheResult(
		List<trainingcalendardata> trainingcalendardatas) {
		getPersistence().cacheResult(trainingcalendardatas);
	}

	/**
	* Creates a new trainingcalendardata with the primary key. Does not add the trainingcalendardata to the database.
	*
	* @param id the primary key for the new trainingcalendardata
	* @return the new trainingcalendardata
	*/
	public static trainingcalendardata create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the trainingcalendardata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata that was removed
	* @throws NoSuchtrainingcalendardataException if a trainingcalendardata with the primary key could not be found
	*/
	public static trainingcalendardata remove(long id)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcalendardataException {
		return getPersistence().remove(id);
	}

	public static trainingcalendardata updateImpl(
		trainingcalendardata trainingcalendardata) {
		return getPersistence().updateImpl(trainingcalendardata);
	}

	/**
	* Returns the trainingcalendardata with the primary key or throws a {@link NoSuchtrainingcalendardataException} if it could not be found.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata
	* @throws NoSuchtrainingcalendardataException if a trainingcalendardata with the primary key could not be found
	*/
	public static trainingcalendardata findByPrimaryKey(long id)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcalendardataException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the trainingcalendardata with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata, or <code>null</code> if a trainingcalendardata with the primary key could not be found
	*/
	public static trainingcalendardata fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, trainingcalendardata> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the trainingcalendardatas.
	*
	* @return the trainingcalendardatas
	*/
	public static List<trainingcalendardata> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the trainingcalendardatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendardatas
	* @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	* @return the range of trainingcalendardatas
	*/
	public static List<trainingcalendardata> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the trainingcalendardatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendardatas
	* @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingcalendardatas
	*/
	public static List<trainingcalendardata> findAll(int start, int end,
		OrderByComparator<trainingcalendardata> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the trainingcalendardatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendardatas
	* @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingcalendardatas
	*/
	public static List<trainingcalendardata> findAll(int start, int end,
		OrderByComparator<trainingcalendardata> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the trainingcalendardatas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of trainingcalendardatas.
	*
	* @return the number of trainingcalendardatas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static trainingcalendardataPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (trainingcalendardataPersistence)PortletBeanLocatorUtil.locate(com.chola.trainingcalendar.service.ClpSerializer.getServletContextName(),
					trainingcalendardataPersistence.class.getName());

			ReferenceRegistry.registerReference(trainingcalendardataUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static trainingcalendardataPersistence _persistence;
}