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

package com.chola.listbranch.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.listbranch.model.branchdetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the branchdetails service. This utility wraps {@link com.chola.listbranch.service.persistence.impl.branchdetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see branchdetailsPersistence
 * @see com.chola.listbranch.service.persistence.impl.branchdetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class branchdetailsUtil {
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
	public static void clearCache(branchdetails branchdetails) {
		getPersistence().clearCache(branchdetails);
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
	public static List<branchdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<branchdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<branchdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<branchdetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static branchdetails update(branchdetails branchdetails) {
		return getPersistence().update(branchdetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static branchdetails update(branchdetails branchdetails,
		ServiceContext serviceContext) {
		return getPersistence().update(branchdetails, serviceContext);
	}

	/**
	* Caches the branchdetails in the entity cache if it is enabled.
	*
	* @param branchdetails the branchdetails
	*/
	public static void cacheResult(branchdetails branchdetails) {
		getPersistence().cacheResult(branchdetails);
	}

	/**
	* Caches the branchdetailses in the entity cache if it is enabled.
	*
	* @param branchdetailses the branchdetailses
	*/
	public static void cacheResult(List<branchdetails> branchdetailses) {
		getPersistence().cacheResult(branchdetailses);
	}

	/**
	* Creates a new branchdetails with the primary key. Does not add the branchdetails to the database.
	*
	* @param branch_id the primary key for the new branchdetails
	* @return the new branchdetails
	*/
	public static branchdetails create(long branch_id) {
		return getPersistence().create(branch_id);
	}

	/**
	* Removes the branchdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param branch_id the primary key of the branchdetails
	* @return the branchdetails that was removed
	* @throws NoSuchdetailsException if a branchdetails with the primary key could not be found
	*/
	public static branchdetails remove(long branch_id)
		throws com.chola.listbranch.exception.NoSuchdetailsException {
		return getPersistence().remove(branch_id);
	}

	public static branchdetails updateImpl(branchdetails branchdetails) {
		return getPersistence().updateImpl(branchdetails);
	}

	/**
	* Returns the branchdetails with the primary key or throws a {@link NoSuchdetailsException} if it could not be found.
	*
	* @param branch_id the primary key of the branchdetails
	* @return the branchdetails
	* @throws NoSuchdetailsException if a branchdetails with the primary key could not be found
	*/
	public static branchdetails findByPrimaryKey(long branch_id)
		throws com.chola.listbranch.exception.NoSuchdetailsException {
		return getPersistence().findByPrimaryKey(branch_id);
	}

	/**
	* Returns the branchdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param branch_id the primary key of the branchdetails
	* @return the branchdetails, or <code>null</code> if a branchdetails with the primary key could not be found
	*/
	public static branchdetails fetchByPrimaryKey(long branch_id) {
		return getPersistence().fetchByPrimaryKey(branch_id);
	}

	public static java.util.Map<java.io.Serializable, branchdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the branchdetailses.
	*
	* @return the branchdetailses
	*/
	public static List<branchdetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the branchdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of branchdetailses
	* @param end the upper bound of the range of branchdetailses (not inclusive)
	* @return the range of branchdetailses
	*/
	public static List<branchdetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the branchdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of branchdetailses
	* @param end the upper bound of the range of branchdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of branchdetailses
	*/
	public static List<branchdetails> findAll(int start, int end,
		OrderByComparator<branchdetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the branchdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of branchdetailses
	* @param end the upper bound of the range of branchdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of branchdetailses
	*/
	public static List<branchdetails> findAll(int start, int end,
		OrderByComparator<branchdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the branchdetailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of branchdetailses.
	*
	* @return the number of branchdetailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static branchdetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (branchdetailsPersistence)PortletBeanLocatorUtil.locate(com.chola.listbranch.service.ClpSerializer.getServletContextName(),
					branchdetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(branchdetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static branchdetailsPersistence _persistence;
}