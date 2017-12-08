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

package com.chola.personalisedparameters.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.personalisedparameters.model.bsopdetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the bsopdetails service. This utility wraps {@link com.chola.personalisedparameters.service.persistence.impl.bsopdetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see bsopdetailsPersistence
 * @see com.chola.personalisedparameters.service.persistence.impl.bsopdetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class bsopdetailsUtil {
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
	public static void clearCache(bsopdetails bsopdetails) {
		getPersistence().clearCache(bsopdetails);
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
	public static List<bsopdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<bsopdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<bsopdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<bsopdetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static bsopdetails update(bsopdetails bsopdetails) {
		return getPersistence().update(bsopdetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static bsopdetails update(bsopdetails bsopdetails,
		ServiceContext serviceContext) {
		return getPersistence().update(bsopdetails, serviceContext);
	}

	/**
	* Caches the bsopdetails in the entity cache if it is enabled.
	*
	* @param bsopdetails the bsopdetails
	*/
	public static void cacheResult(bsopdetails bsopdetails) {
		getPersistence().cacheResult(bsopdetails);
	}

	/**
	* Caches the bsopdetailses in the entity cache if it is enabled.
	*
	* @param bsopdetailses the bsopdetailses
	*/
	public static void cacheResult(List<bsopdetails> bsopdetailses) {
		getPersistence().cacheResult(bsopdetailses);
	}

	/**
	* Creates a new bsopdetails with the primary key. Does not add the bsopdetails to the database.
	*
	* @param id the primary key for the new bsopdetails
	* @return the new bsopdetails
	*/
	public static bsopdetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the bsopdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bsopdetails
	* @return the bsopdetails that was removed
	* @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	*/
	public static bsopdetails remove(long id)
		throws com.chola.personalisedparameters.exception.NoSuchbsopdetailsException {
		return getPersistence().remove(id);
	}

	public static bsopdetails updateImpl(bsopdetails bsopdetails) {
		return getPersistence().updateImpl(bsopdetails);
	}

	/**
	* Returns the bsopdetails with the primary key or throws a {@link NoSuchbsopdetailsException} if it could not be found.
	*
	* @param id the primary key of the bsopdetails
	* @return the bsopdetails
	* @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	*/
	public static bsopdetails findByPrimaryKey(long id)
		throws com.chola.personalisedparameters.exception.NoSuchbsopdetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the bsopdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bsopdetails
	* @return the bsopdetails, or <code>null</code> if a bsopdetails with the primary key could not be found
	*/
	public static bsopdetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, bsopdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bsopdetailses.
	*
	* @return the bsopdetailses
	*/
	public static List<bsopdetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bsopdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @return the range of bsopdetailses
	*/
	public static List<bsopdetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bsopdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bsopdetailses
	*/
	public static List<bsopdetails> findAll(int start, int end,
		OrderByComparator<bsopdetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bsopdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bsopdetailses
	*/
	public static List<bsopdetails> findAll(int start, int end,
		OrderByComparator<bsopdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bsopdetailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bsopdetailses.
	*
	* @return the number of bsopdetailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static bsopdetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (bsopdetailsPersistence)PortletBeanLocatorUtil.locate(com.chola.personalisedparameters.service.ClpSerializer.getServletContextName(),
					bsopdetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(bsopdetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static bsopdetailsPersistence _persistence;
}