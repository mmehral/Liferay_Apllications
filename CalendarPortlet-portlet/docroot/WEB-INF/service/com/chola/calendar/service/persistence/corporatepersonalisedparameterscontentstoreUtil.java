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

import com.chola.calendar.model.corporatepersonalisedparameterscontentstore;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the corporatepersonalisedparameterscontentstore service. This utility wraps {@link com.chola.calendar.service.persistence.impl.corporatepersonalisedparameterscontentstorePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see corporatepersonalisedparameterscontentstorePersistence
 * @see com.chola.calendar.service.persistence.impl.corporatepersonalisedparameterscontentstorePersistenceImpl
 * @generated
 */
@ProviderType
public class corporatepersonalisedparameterscontentstoreUtil {
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
	public static void clearCache(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		getPersistence().clearCache(corporatepersonalisedparameterscontentstore);
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
	public static List<corporatepersonalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<corporatepersonalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<corporatepersonalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static corporatepersonalisedparameterscontentstore update(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		return getPersistence()
				   .update(corporatepersonalisedparameterscontentstore);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static corporatepersonalisedparameterscontentstore update(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(corporatepersonalisedparameterscontentstore,
			serviceContext);
	}

	/**
	* Returns all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching corporatepersonalisedparameterscontentstores
	*/
	public static List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id) {
		return getPersistence().findByCONTENTID(content_id);
	}

	/**
	* Returns a range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @return the range of matching corporatepersonalisedparameterscontentstores
	*/
	public static List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end) {
		return getPersistence().findByCONTENTID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporatepersonalisedparameterscontentstores
	*/
	public static List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching corporatepersonalisedparameterscontentstores
	*/
	public static List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatepersonalisedparameterscontentstore
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a matching corporatepersonalisedparameterscontentstore could not be found
	*/
	public static corporatepersonalisedparameterscontentstore findByCONTENTID_First(
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatepersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatepersonalisedparameterscontentstore, or <code>null</code> if a matching corporatepersonalisedparameterscontentstore could not be found
	*/
	public static corporatepersonalisedparameterscontentstore fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatepersonalisedparameterscontentstore
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a matching corporatepersonalisedparameterscontentstore could not be found
	*/
	public static corporatepersonalisedparameterscontentstore findByCONTENTID_Last(
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatepersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatepersonalisedparameterscontentstore, or <code>null</code> if a matching corporatepersonalisedparameterscontentstore could not be found
	*/
	public static corporatepersonalisedparameterscontentstore fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the corporatepersonalisedparameterscontentstores before and after the current corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current corporatepersonalisedparameterscontentstore
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporatepersonalisedparameterscontentstore
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	public static corporatepersonalisedparameterscontentstore[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatepersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the corporatepersonalisedparameterscontentstores where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENTID(long content_id) {
		getPersistence().removeByCONTENTID(content_id);
	}

	/**
	* Returns the number of corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching corporatepersonalisedparameterscontentstores
	*/
	public static int countByCONTENTID(long content_id) {
		return getPersistence().countByCONTENTID(content_id);
	}

	/**
	* Caches the corporatepersonalisedparameterscontentstore in the entity cache if it is enabled.
	*
	* @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	*/
	public static void cacheResult(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		getPersistence().cacheResult(corporatepersonalisedparameterscontentstore);
	}

	/**
	* Caches the corporatepersonalisedparameterscontentstores in the entity cache if it is enabled.
	*
	* @param corporatepersonalisedparameterscontentstores the corporatepersonalisedparameterscontentstores
	*/
	public static void cacheResult(
		List<corporatepersonalisedparameterscontentstore> corporatepersonalisedparameterscontentstores) {
		getPersistence()
			.cacheResult(corporatepersonalisedparameterscontentstores);
	}

	/**
	* Creates a new corporatepersonalisedparameterscontentstore with the primary key. Does not add the corporatepersonalisedparameterscontentstore to the database.
	*
	* @param id the primary key for the new corporatepersonalisedparameterscontentstore
	* @return the new corporatepersonalisedparameterscontentstore
	*/
	public static corporatepersonalisedparameterscontentstore create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the corporatepersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore that was removed
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	public static corporatepersonalisedparameterscontentstore remove(long id)
		throws com.chola.calendar.exception.NoSuchcorporatepersonalisedparameterscontentstoreException {
		return getPersistence().remove(id);
	}

	public static corporatepersonalisedparameterscontentstore updateImpl(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		return getPersistence()
				   .updateImpl(corporatepersonalisedparameterscontentstore);
	}

	/**
	* Returns the corporatepersonalisedparameterscontentstore with the primary key or throws a {@link NoSuchcorporatepersonalisedparameterscontentstoreException} if it could not be found.
	*
	* @param id the primary key of the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	public static corporatepersonalisedparameterscontentstore findByPrimaryKey(
		long id)
		throws com.chola.calendar.exception.NoSuchcorporatepersonalisedparameterscontentstoreException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the corporatepersonalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore, or <code>null</code> if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	public static corporatepersonalisedparameterscontentstore fetchByPrimaryKey(
		long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, corporatepersonalisedparameterscontentstore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the corporatepersonalisedparameterscontentstores.
	*
	* @return the corporatepersonalisedparameterscontentstores
	*/
	public static List<corporatepersonalisedparameterscontentstore> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the corporatepersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @return the range of corporatepersonalisedparameterscontentstores
	*/
	public static List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the corporatepersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporatepersonalisedparameterscontentstores
	*/
	public static List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the corporatepersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of corporatepersonalisedparameterscontentstores
	*/
	public static List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the corporatepersonalisedparameterscontentstores from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of corporatepersonalisedparameterscontentstores.
	*
	* @return the number of corporatepersonalisedparameterscontentstores
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static corporatepersonalisedparameterscontentstorePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (corporatepersonalisedparameterscontentstorePersistence)PortletBeanLocatorUtil.locate(com.chola.calendar.service.ClpSerializer.getServletContextName(),
					corporatepersonalisedparameterscontentstorePersistence.class.getName());

			ReferenceRegistry.registerReference(corporatepersonalisedparameterscontentstoreUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static corporatepersonalisedparameterscontentstorePersistence _persistence;
}