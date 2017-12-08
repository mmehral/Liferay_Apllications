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

package com.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.service.model.newhire;

import java.util.List;

/**
 * The persistence utility for the newhire service. This utility wraps {@link com.service.service.persistence.impl.newhirePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see newhirePersistence
 * @see com.service.service.persistence.impl.newhirePersistenceImpl
 * @generated
 */
@ProviderType
public class newhireUtil {
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
	public static void clearCache(newhire newhire) {
		getPersistence().clearCache(newhire);
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
	public static List<newhire> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<newhire> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<newhire> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<newhire> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static newhire update(newhire newhire) {
		return getPersistence().update(newhire);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static newhire update(newhire newhire, ServiceContext serviceContext) {
		return getPersistence().update(newhire, serviceContext);
	}

	/**
	* Caches the newhire in the entity cache if it is enabled.
	*
	* @param newhire the newhire
	*/
	public static void cacheResult(newhire newhire) {
		getPersistence().cacheResult(newhire);
	}

	/**
	* Caches the newhires in the entity cache if it is enabled.
	*
	* @param newhires the newhires
	*/
	public static void cacheResult(List<newhire> newhires) {
		getPersistence().cacheResult(newhires);
	}

	/**
	* Creates a new newhire with the primary key. Does not add the newhire to the database.
	*
	* @param newhire_id the primary key for the new newhire
	* @return the new newhire
	*/
	public static newhire create(long newhire_id) {
		return getPersistence().create(newhire_id);
	}

	/**
	* Removes the newhire with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newhire_id the primary key of the newhire
	* @return the newhire that was removed
	* @throws NoSuchnewhireException if a newhire with the primary key could not be found
	*/
	public static newhire remove(long newhire_id)
		throws com.service.exception.NoSuchnewhireException {
		return getPersistence().remove(newhire_id);
	}

	public static newhire updateImpl(newhire newhire) {
		return getPersistence().updateImpl(newhire);
	}

	/**
	* Returns the newhire with the primary key or throws a {@link NoSuchnewhireException} if it could not be found.
	*
	* @param newhire_id the primary key of the newhire
	* @return the newhire
	* @throws NoSuchnewhireException if a newhire with the primary key could not be found
	*/
	public static newhire findByPrimaryKey(long newhire_id)
		throws com.service.exception.NoSuchnewhireException {
		return getPersistence().findByPrimaryKey(newhire_id);
	}

	/**
	* Returns the newhire with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param newhire_id the primary key of the newhire
	* @return the newhire, or <code>null</code> if a newhire with the primary key could not be found
	*/
	public static newhire fetchByPrimaryKey(long newhire_id) {
		return getPersistence().fetchByPrimaryKey(newhire_id);
	}

	public static java.util.Map<java.io.Serializable, newhire> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the newhires.
	*
	* @return the newhires
	*/
	public static List<newhire> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the newhires.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of newhires
	* @param end the upper bound of the range of newhires (not inclusive)
	* @return the range of newhires
	*/
	public static List<newhire> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the newhires.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of newhires
	* @param end the upper bound of the range of newhires (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of newhires
	*/
	public static List<newhire> findAll(int start, int end,
		OrderByComparator<newhire> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the newhires.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of newhires
	* @param end the upper bound of the range of newhires (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of newhires
	*/
	public static List<newhire> findAll(int start, int end,
		OrderByComparator<newhire> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the newhires from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of newhires.
	*
	* @return the number of newhires
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static newhirePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (newhirePersistence)PortletBeanLocatorUtil.locate(com.service.service.ClpSerializer.getServletContextName(),
					newhirePersistence.class.getName());

			ReferenceRegistry.registerReference(newhireUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static newhirePersistence _persistence;
}