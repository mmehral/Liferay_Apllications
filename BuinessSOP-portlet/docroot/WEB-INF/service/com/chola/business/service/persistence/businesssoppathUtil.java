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

import com.chola.business.model.businesssoppath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the businesssoppath service. This utility wraps {@link com.chola.business.service.persistence.impl.businesssoppathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see businesssoppathPersistence
 * @see com.chola.business.service.persistence.impl.businesssoppathPersistenceImpl
 * @generated
 */
@ProviderType
public class businesssoppathUtil {
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
	public static void clearCache(businesssoppath businesssoppath) {
		getPersistence().clearCache(businesssoppath);
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
	public static List<businesssoppath> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<businesssoppath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<businesssoppath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<businesssoppath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static businesssoppath update(businesssoppath businesssoppath) {
		return getPersistence().update(businesssoppath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static businesssoppath update(businesssoppath businesssoppath,
		ServiceContext serviceContext) {
		return getPersistence().update(businesssoppath, serviceContext);
	}

	/**
	* Returns all the businesssoppaths where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the matching businesssoppaths
	*/
	public static List<businesssoppath> findBySOP_ID(long businessdetails_id) {
		return getPersistence().findBySOP_ID(businessdetails_id);
	}

	/**
	* Returns a range of all the businesssoppaths where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @return the range of matching businesssoppaths
	*/
	public static List<businesssoppath> findBySOP_ID(long businessdetails_id,
		int start, int end) {
		return getPersistence().findBySOP_ID(businessdetails_id, start, end);
	}

	/**
	* Returns an ordered range of all the businesssoppaths where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesssoppaths
	*/
	public static List<businesssoppath> findBySOP_ID(long businessdetails_id,
		int start, int end, OrderByComparator<businesssoppath> orderByComparator) {
		return getPersistence()
				   .findBySOP_ID(businessdetails_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the businesssoppaths where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businesssoppaths
	*/
	public static List<businesssoppath> findBySOP_ID(long businessdetails_id,
		int start, int end,
		OrderByComparator<businesssoppath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySOP_ID(businessdetails_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssoppath
	* @throws NoSuchbusinesssoppathException if a matching businesssoppath could not be found
	*/
	public static businesssoppath findBySOP_ID_First(long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssoppathException {
		return getPersistence()
				   .findBySOP_ID_First(businessdetails_id, orderByComparator);
	}

	/**
	* Returns the first businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssoppath, or <code>null</code> if a matching businesssoppath could not be found
	*/
	public static businesssoppath fetchBySOP_ID_First(long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator) {
		return getPersistence()
				   .fetchBySOP_ID_First(businessdetails_id, orderByComparator);
	}

	/**
	* Returns the last businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssoppath
	* @throws NoSuchbusinesssoppathException if a matching businesssoppath could not be found
	*/
	public static businesssoppath findBySOP_ID_Last(long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssoppathException {
		return getPersistence()
				   .findBySOP_ID_Last(businessdetails_id, orderByComparator);
	}

	/**
	* Returns the last businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssoppath, or <code>null</code> if a matching businesssoppath could not be found
	*/
	public static businesssoppath fetchBySOP_ID_Last(long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator) {
		return getPersistence()
				   .fetchBySOP_ID_Last(businessdetails_id, orderByComparator);
	}

	/**
	* Returns the businesssoppaths before and after the current businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param id the primary key of the current businesssoppath
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businesssoppath
	* @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	*/
	public static businesssoppath[] findBySOP_ID_PrevAndNext(long id,
		long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator)
		throws com.chola.business.exception.NoSuchbusinesssoppathException {
		return getPersistence()
				   .findBySOP_ID_PrevAndNext(id, businessdetails_id,
			orderByComparator);
	}

	/**
	* Removes all the businesssoppaths where businessdetails_id = &#63; from the database.
	*
	* @param businessdetails_id the businessdetails_id
	*/
	public static void removeBySOP_ID(long businessdetails_id) {
		getPersistence().removeBySOP_ID(businessdetails_id);
	}

	/**
	* Returns the number of businesssoppaths where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the number of matching businesssoppaths
	*/
	public static int countBySOP_ID(long businessdetails_id) {
		return getPersistence().countBySOP_ID(businessdetails_id);
	}

	/**
	* Caches the businesssoppath in the entity cache if it is enabled.
	*
	* @param businesssoppath the businesssoppath
	*/
	public static void cacheResult(businesssoppath businesssoppath) {
		getPersistence().cacheResult(businesssoppath);
	}

	/**
	* Caches the businesssoppaths in the entity cache if it is enabled.
	*
	* @param businesssoppaths the businesssoppaths
	*/
	public static void cacheResult(List<businesssoppath> businesssoppaths) {
		getPersistence().cacheResult(businesssoppaths);
	}

	/**
	* Creates a new businesssoppath with the primary key. Does not add the businesssoppath to the database.
	*
	* @param id the primary key for the new businesssoppath
	* @return the new businesssoppath
	*/
	public static businesssoppath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the businesssoppath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssoppath
	* @return the businesssoppath that was removed
	* @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	*/
	public static businesssoppath remove(long id)
		throws com.chola.business.exception.NoSuchbusinesssoppathException {
		return getPersistence().remove(id);
	}

	public static businesssoppath updateImpl(businesssoppath businesssoppath) {
		return getPersistence().updateImpl(businesssoppath);
	}

	/**
	* Returns the businesssoppath with the primary key or throws a {@link NoSuchbusinesssoppathException} if it could not be found.
	*
	* @param id the primary key of the businesssoppath
	* @return the businesssoppath
	* @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	*/
	public static businesssoppath findByPrimaryKey(long id)
		throws com.chola.business.exception.NoSuchbusinesssoppathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the businesssoppath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businesssoppath
	* @return the businesssoppath, or <code>null</code> if a businesssoppath with the primary key could not be found
	*/
	public static businesssoppath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, businesssoppath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the businesssoppaths.
	*
	* @return the businesssoppaths
	*/
	public static List<businesssoppath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the businesssoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @return the range of businesssoppaths
	*/
	public static List<businesssoppath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the businesssoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesssoppaths
	*/
	public static List<businesssoppath> findAll(int start, int end,
		OrderByComparator<businesssoppath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the businesssoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businesssoppaths
	*/
	public static List<businesssoppath> findAll(int start, int end,
		OrderByComparator<businesssoppath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the businesssoppaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of businesssoppaths.
	*
	* @return the number of businesssoppaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static businesssoppathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (businesssoppathPersistence)PortletBeanLocatorUtil.locate(com.chola.business.service.ClpSerializer.getServletContextName(),
					businesssoppathPersistence.class.getName());

			ReferenceRegistry.registerReference(businesssoppathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static businesssoppathPersistence _persistence;
}