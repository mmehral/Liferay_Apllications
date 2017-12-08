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

package com.chola.swagatam.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.model.swagatampath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the swagatampath service. This utility wraps {@link com.chola.swagatam.service.persistence.impl.swagatampathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see swagatampathPersistence
 * @see com.chola.swagatam.service.persistence.impl.swagatampathPersistenceImpl
 * @generated
 */
@ProviderType
public class swagatampathUtil {
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
	public static void clearCache(swagatampath swagatampath) {
		getPersistence().clearCache(swagatampath);
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
	public static List<swagatampath> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<swagatampath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<swagatampath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<swagatampath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static swagatampath update(swagatampath swagatampath) {
		return getPersistence().update(swagatampath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static swagatampath update(swagatampath swagatampath,
		ServiceContext serviceContext) {
		return getPersistence().update(swagatampath, serviceContext);
	}

	/**
	* Returns all the swagatampaths where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @return the matching swagatampaths
	*/
	public static List<swagatampath> findByINDUCTIONID(
		java.lang.String inductionid) {
		return getPersistence().findByINDUCTIONID(inductionid);
	}

	/**
	* Returns a range of all the swagatampaths where inductionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inductionid the inductionid
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @return the range of matching swagatampaths
	*/
	public static List<swagatampath> findByINDUCTIONID(
		java.lang.String inductionid, int start, int end) {
		return getPersistence().findByINDUCTIONID(inductionid, start, end);
	}

	/**
	* Returns an ordered range of all the swagatampaths where inductionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inductionid the inductionid
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching swagatampaths
	*/
	public static List<swagatampath> findByINDUCTIONID(
		java.lang.String inductionid, int start, int end,
		OrderByComparator<swagatampath> orderByComparator) {
		return getPersistence()
				   .findByINDUCTIONID(inductionid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the swagatampaths where inductionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inductionid the inductionid
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching swagatampaths
	*/
	public static List<swagatampath> findByINDUCTIONID(
		java.lang.String inductionid, int start, int end,
		OrderByComparator<swagatampath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByINDUCTIONID(inductionid, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching swagatampath
	* @throws NoSuchswagatampathException if a matching swagatampath could not be found
	*/
	public static swagatampath findByINDUCTIONID_First(
		java.lang.String inductionid,
		OrderByComparator<swagatampath> orderByComparator)
		throws com.chola.swagatam.exception.NoSuchswagatampathException {
		return getPersistence()
				   .findByINDUCTIONID_First(inductionid, orderByComparator);
	}

	/**
	* Returns the first swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching swagatampath, or <code>null</code> if a matching swagatampath could not be found
	*/
	public static swagatampath fetchByINDUCTIONID_First(
		java.lang.String inductionid,
		OrderByComparator<swagatampath> orderByComparator) {
		return getPersistence()
				   .fetchByINDUCTIONID_First(inductionid, orderByComparator);
	}

	/**
	* Returns the last swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching swagatampath
	* @throws NoSuchswagatampathException if a matching swagatampath could not be found
	*/
	public static swagatampath findByINDUCTIONID_Last(
		java.lang.String inductionid,
		OrderByComparator<swagatampath> orderByComparator)
		throws com.chola.swagatam.exception.NoSuchswagatampathException {
		return getPersistence()
				   .findByINDUCTIONID_Last(inductionid, orderByComparator);
	}

	/**
	* Returns the last swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching swagatampath, or <code>null</code> if a matching swagatampath could not be found
	*/
	public static swagatampath fetchByINDUCTIONID_Last(
		java.lang.String inductionid,
		OrderByComparator<swagatampath> orderByComparator) {
		return getPersistence()
				   .fetchByINDUCTIONID_Last(inductionid, orderByComparator);
	}

	/**
	* Returns the swagatampaths before and after the current swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param id the primary key of the current swagatampath
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next swagatampath
	* @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	*/
	public static swagatampath[] findByINDUCTIONID_PrevAndNext(long id,
		java.lang.String inductionid,
		OrderByComparator<swagatampath> orderByComparator)
		throws com.chola.swagatam.exception.NoSuchswagatampathException {
		return getPersistence()
				   .findByINDUCTIONID_PrevAndNext(id, inductionid,
			orderByComparator);
	}

	/**
	* Removes all the swagatampaths where inductionid = &#63; from the database.
	*
	* @param inductionid the inductionid
	*/
	public static void removeByINDUCTIONID(java.lang.String inductionid) {
		getPersistence().removeByINDUCTIONID(inductionid);
	}

	/**
	* Returns the number of swagatampaths where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @return the number of matching swagatampaths
	*/
	public static int countByINDUCTIONID(java.lang.String inductionid) {
		return getPersistence().countByINDUCTIONID(inductionid);
	}

	/**
	* Caches the swagatampath in the entity cache if it is enabled.
	*
	* @param swagatampath the swagatampath
	*/
	public static void cacheResult(swagatampath swagatampath) {
		getPersistence().cacheResult(swagatampath);
	}

	/**
	* Caches the swagatampaths in the entity cache if it is enabled.
	*
	* @param swagatampaths the swagatampaths
	*/
	public static void cacheResult(List<swagatampath> swagatampaths) {
		getPersistence().cacheResult(swagatampaths);
	}

	/**
	* Creates a new swagatampath with the primary key. Does not add the swagatampath to the database.
	*
	* @param id the primary key for the new swagatampath
	* @return the new swagatampath
	*/
	public static swagatampath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the swagatampath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the swagatampath
	* @return the swagatampath that was removed
	* @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	*/
	public static swagatampath remove(long id)
		throws com.chola.swagatam.exception.NoSuchswagatampathException {
		return getPersistence().remove(id);
	}

	public static swagatampath updateImpl(swagatampath swagatampath) {
		return getPersistence().updateImpl(swagatampath);
	}

	/**
	* Returns the swagatampath with the primary key or throws a {@link NoSuchswagatampathException} if it could not be found.
	*
	* @param id the primary key of the swagatampath
	* @return the swagatampath
	* @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	*/
	public static swagatampath findByPrimaryKey(long id)
		throws com.chola.swagatam.exception.NoSuchswagatampathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the swagatampath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the swagatampath
	* @return the swagatampath, or <code>null</code> if a swagatampath with the primary key could not be found
	*/
	public static swagatampath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, swagatampath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the swagatampaths.
	*
	* @return the swagatampaths
	*/
	public static List<swagatampath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the swagatampaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @return the range of swagatampaths
	*/
	public static List<swagatampath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the swagatampaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of swagatampaths
	*/
	public static List<swagatampath> findAll(int start, int end,
		OrderByComparator<swagatampath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the swagatampaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of swagatampaths
	*/
	public static List<swagatampath> findAll(int start, int end,
		OrderByComparator<swagatampath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the swagatampaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of swagatampaths.
	*
	* @return the number of swagatampaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static swagatampathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (swagatampathPersistence)PortletBeanLocatorUtil.locate(com.chola.swagatam.service.ClpSerializer.getServletContextName(),
					swagatampathPersistence.class.getName());

			ReferenceRegistry.registerReference(swagatampathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static swagatampathPersistence _persistence;
}