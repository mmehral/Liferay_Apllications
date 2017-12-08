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

package com.chola.annual.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.annual.model.annualreports;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the annualreports service. This utility wraps {@link com.chola.annual.service.persistence.impl.annualreportsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see annualreportsPersistence
 * @see com.chola.annual.service.persistence.impl.annualreportsPersistenceImpl
 * @generated
 */
@ProviderType
public class annualreportsUtil {
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
	public static void clearCache(annualreports annualreports) {
		getPersistence().clearCache(annualreports);
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
	public static List<annualreports> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<annualreports> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<annualreports> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<annualreports> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static annualreports update(annualreports annualreports) {
		return getPersistence().update(annualreports);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static annualreports update(annualreports annualreports,
		ServiceContext serviceContext) {
		return getPersistence().update(annualreports, serviceContext);
	}

	/**
	* Caches the annualreports in the entity cache if it is enabled.
	*
	* @param annualreports the annualreports
	*/
	public static void cacheResult(annualreports annualreports) {
		getPersistence().cacheResult(annualreports);
	}

	/**
	* Caches the annualreportses in the entity cache if it is enabled.
	*
	* @param annualreportses the annualreportses
	*/
	public static void cacheResult(List<annualreports> annualreportses) {
		getPersistence().cacheResult(annualreportses);
	}

	/**
	* Creates a new annualreports with the primary key. Does not add the annualreports to the database.
	*
	* @param id the primary key for the new annualreports
	* @return the new annualreports
	*/
	public static annualreports create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the annualreports with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the annualreports
	* @return the annualreports that was removed
	* @throws NoSuchannualreportsException if a annualreports with the primary key could not be found
	*/
	public static annualreports remove(long id)
		throws com.chola.annual.exception.NoSuchannualreportsException {
		return getPersistence().remove(id);
	}

	public static annualreports updateImpl(annualreports annualreports) {
		return getPersistence().updateImpl(annualreports);
	}

	/**
	* Returns the annualreports with the primary key or throws a {@link NoSuchannualreportsException} if it could not be found.
	*
	* @param id the primary key of the annualreports
	* @return the annualreports
	* @throws NoSuchannualreportsException if a annualreports with the primary key could not be found
	*/
	public static annualreports findByPrimaryKey(long id)
		throws com.chola.annual.exception.NoSuchannualreportsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the annualreports with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the annualreports
	* @return the annualreports, or <code>null</code> if a annualreports with the primary key could not be found
	*/
	public static annualreports fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, annualreports> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the annualreportses.
	*
	* @return the annualreportses
	*/
	public static List<annualreports> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the annualreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of annualreportses
	* @param end the upper bound of the range of annualreportses (not inclusive)
	* @return the range of annualreportses
	*/
	public static List<annualreports> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the annualreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of annualreportses
	* @param end the upper bound of the range of annualreportses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of annualreportses
	*/
	public static List<annualreports> findAll(int start, int end,
		OrderByComparator<annualreports> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the annualreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of annualreportses
	* @param end the upper bound of the range of annualreportses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of annualreportses
	*/
	public static List<annualreports> findAll(int start, int end,
		OrderByComparator<annualreports> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the annualreportses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of annualreportses.
	*
	* @return the number of annualreportses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static annualreportsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (annualreportsPersistence)PortletBeanLocatorUtil.locate(com.chola.annual.service.ClpSerializer.getServletContextName(),
					annualreportsPersistence.class.getName());

			ReferenceRegistry.registerReference(annualreportsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static annualreportsPersistence _persistence;
}