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

package com.chola.successstories.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.model.sspath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the sspath service. This utility wraps {@link com.chola.successstories.service.persistence.impl.sspathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see sspathPersistence
 * @see com.chola.successstories.service.persistence.impl.sspathPersistenceImpl
 * @generated
 */
@ProviderType
public class sspathUtil {
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
	public static void clearCache(sspath sspath) {
		getPersistence().clearCache(sspath);
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
	public static List<sspath> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<sspath> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<sspath> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<sspath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static sspath update(sspath sspath) {
		return getPersistence().update(sspath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static sspath update(sspath sspath, ServiceContext serviceContext) {
		return getPersistence().update(sspath, serviceContext);
	}

	/**
	* Returns all the sspaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching sspaths
	*/
	public static List<sspath> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the sspaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @return the range of matching sspaths
	*/
	public static List<sspath> findByCONTENT_ID(long content_id, int start,
		int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the sspaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sspaths
	*/
	public static List<sspath> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<sspath> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the sspaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching sspaths
	*/
	public static List<sspath> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<sspath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first sspath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sspath
	* @throws NoSuchsspathException if a matching sspath could not be found
	*/
	public static sspath findByCONTENT_ID_First(long content_id,
		OrderByComparator<sspath> orderByComparator)
		throws com.chola.successstories.exception.NoSuchsspathException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first sspath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sspath, or <code>null</code> if a matching sspath could not be found
	*/
	public static sspath fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<sspath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last sspath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sspath
	* @throws NoSuchsspathException if a matching sspath could not be found
	*/
	public static sspath findByCONTENT_ID_Last(long content_id,
		OrderByComparator<sspath> orderByComparator)
		throws com.chola.successstories.exception.NoSuchsspathException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last sspath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sspath, or <code>null</code> if a matching sspath could not be found
	*/
	public static sspath fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<sspath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the sspaths before and after the current sspath in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current sspath
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sspath
	* @throws NoSuchsspathException if a sspath with the primary key could not be found
	*/
	public static sspath[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<sspath> orderByComparator)
		throws com.chola.successstories.exception.NoSuchsspathException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the sspaths where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of sspaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching sspaths
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the sspath in the entity cache if it is enabled.
	*
	* @param sspath the sspath
	*/
	public static void cacheResult(sspath sspath) {
		getPersistence().cacheResult(sspath);
	}

	/**
	* Caches the sspaths in the entity cache if it is enabled.
	*
	* @param sspaths the sspaths
	*/
	public static void cacheResult(List<sspath> sspaths) {
		getPersistence().cacheResult(sspaths);
	}

	/**
	* Creates a new sspath with the primary key. Does not add the sspath to the database.
	*
	* @param id the primary key for the new sspath
	* @return the new sspath
	*/
	public static sspath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the sspath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the sspath
	* @return the sspath that was removed
	* @throws NoSuchsspathException if a sspath with the primary key could not be found
	*/
	public static sspath remove(long id)
		throws com.chola.successstories.exception.NoSuchsspathException {
		return getPersistence().remove(id);
	}

	public static sspath updateImpl(sspath sspath) {
		return getPersistence().updateImpl(sspath);
	}

	/**
	* Returns the sspath with the primary key or throws a {@link NoSuchsspathException} if it could not be found.
	*
	* @param id the primary key of the sspath
	* @return the sspath
	* @throws NoSuchsspathException if a sspath with the primary key could not be found
	*/
	public static sspath findByPrimaryKey(long id)
		throws com.chola.successstories.exception.NoSuchsspathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the sspath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the sspath
	* @return the sspath, or <code>null</code> if a sspath with the primary key could not be found
	*/
	public static sspath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, sspath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the sspaths.
	*
	* @return the sspaths
	*/
	public static List<sspath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sspaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @return the range of sspaths
	*/
	public static List<sspath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sspaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sspaths
	*/
	public static List<sspath> findAll(int start, int end,
		OrderByComparator<sspath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the sspaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of sspaths
	*/
	public static List<sspath> findAll(int start, int end,
		OrderByComparator<sspath> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the sspaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sspaths.
	*
	* @return the number of sspaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static sspathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (sspathPersistence)PortletBeanLocatorUtil.locate(com.chola.successstories.service.ClpSerializer.getServletContextName(),
					sspathPersistence.class.getName());

			ReferenceRegistry.registerReference(sspathUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static sspathPersistence _persistence;
}