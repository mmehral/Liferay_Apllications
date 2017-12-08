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

package com.chola.conferenceroombooking.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.model.facilitymaster;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the facilitymaster service. This utility wraps {@link com.chola.conferenceroombooking.service.persistence.impl.facilitymasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see facilitymasterPersistence
 * @see com.chola.conferenceroombooking.service.persistence.impl.facilitymasterPersistenceImpl
 * @generated
 */
@ProviderType
public class facilitymasterUtil {
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
	public static void clearCache(facilitymaster facilitymaster) {
		getPersistence().clearCache(facilitymaster);
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
	public static List<facilitymaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<facilitymaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<facilitymaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<facilitymaster> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static facilitymaster update(facilitymaster facilitymaster) {
		return getPersistence().update(facilitymaster);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static facilitymaster update(facilitymaster facilitymaster,
		ServiceContext serviceContext) {
		return getPersistence().update(facilitymaster, serviceContext);
	}

	/**
	* Caches the facilitymaster in the entity cache if it is enabled.
	*
	* @param facilitymaster the facilitymaster
	*/
	public static void cacheResult(facilitymaster facilitymaster) {
		getPersistence().cacheResult(facilitymaster);
	}

	/**
	* Caches the facilitymasters in the entity cache if it is enabled.
	*
	* @param facilitymasters the facilitymasters
	*/
	public static void cacheResult(List<facilitymaster> facilitymasters) {
		getPersistence().cacheResult(facilitymasters);
	}

	/**
	* Creates a new facilitymaster with the primary key. Does not add the facilitymaster to the database.
	*
	* @param facility_id the primary key for the new facilitymaster
	* @return the new facilitymaster
	*/
	public static facilitymaster create(long facility_id) {
		return getPersistence().create(facility_id);
	}

	/**
	* Removes the facilitymaster with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param facility_id the primary key of the facilitymaster
	* @return the facilitymaster that was removed
	* @throws NoSuchfacilitymasterException if a facilitymaster with the primary key could not be found
	*/
	public static facilitymaster remove(long facility_id)
		throws com.chola.conferenceroombooking.exception.NoSuchfacilitymasterException {
		return getPersistence().remove(facility_id);
	}

	public static facilitymaster updateImpl(facilitymaster facilitymaster) {
		return getPersistence().updateImpl(facilitymaster);
	}

	/**
	* Returns the facilitymaster with the primary key or throws a {@link NoSuchfacilitymasterException} if it could not be found.
	*
	* @param facility_id the primary key of the facilitymaster
	* @return the facilitymaster
	* @throws NoSuchfacilitymasterException if a facilitymaster with the primary key could not be found
	*/
	public static facilitymaster findByPrimaryKey(long facility_id)
		throws com.chola.conferenceroombooking.exception.NoSuchfacilitymasterException {
		return getPersistence().findByPrimaryKey(facility_id);
	}

	/**
	* Returns the facilitymaster with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param facility_id the primary key of the facilitymaster
	* @return the facilitymaster, or <code>null</code> if a facilitymaster with the primary key could not be found
	*/
	public static facilitymaster fetchByPrimaryKey(long facility_id) {
		return getPersistence().fetchByPrimaryKey(facility_id);
	}

	public static java.util.Map<java.io.Serializable, facilitymaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the facilitymasters.
	*
	* @return the facilitymasters
	*/
	public static List<facilitymaster> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the facilitymasters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of facilitymasters
	* @param end the upper bound of the range of facilitymasters (not inclusive)
	* @return the range of facilitymasters
	*/
	public static List<facilitymaster> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the facilitymasters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of facilitymasters
	* @param end the upper bound of the range of facilitymasters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of facilitymasters
	*/
	public static List<facilitymaster> findAll(int start, int end,
		OrderByComparator<facilitymaster> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the facilitymasters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of facilitymasters
	* @param end the upper bound of the range of facilitymasters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of facilitymasters
	*/
	public static List<facilitymaster> findAll(int start, int end,
		OrderByComparator<facilitymaster> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the facilitymasters from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of facilitymasters.
	*
	* @return the number of facilitymasters
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static facilitymasterPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (facilitymasterPersistence)PortletBeanLocatorUtil.locate(com.chola.conferenceroombooking.service.ClpSerializer.getServletContextName(),
					facilitymasterPersistence.class.getName());

			ReferenceRegistry.registerReference(facilitymasterUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static facilitymasterPersistence _persistence;
}