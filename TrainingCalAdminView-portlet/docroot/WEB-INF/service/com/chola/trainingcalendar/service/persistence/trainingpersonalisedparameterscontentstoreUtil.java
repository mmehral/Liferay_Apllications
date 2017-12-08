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

import com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the trainingpersonalisedparameterscontentstore service. This utility wraps {@link com.chola.trainingcalendar.service.persistence.impl.trainingpersonalisedparameterscontentstorePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingpersonalisedparameterscontentstorePersistence
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingpersonalisedparameterscontentstorePersistenceImpl
 * @generated
 */
@ProviderType
public class trainingpersonalisedparameterscontentstoreUtil {
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
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		getPersistence().clearCache(trainingpersonalisedparameterscontentstore);
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
	public static List<trainingpersonalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<trainingpersonalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<trainingpersonalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static trainingpersonalisedparameterscontentstore update(
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		return getPersistence()
				   .update(trainingpersonalisedparameterscontentstore);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static trainingpersonalisedparameterscontentstore update(
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(trainingpersonalisedparameterscontentstore,
			serviceContext);
	}

	/**
	* Returns all the trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching trainingpersonalisedparameterscontentstores
	*/
	public static List<trainingpersonalisedparameterscontentstore> findByCONTENTID(
		long content_id) {
		return getPersistence().findByCONTENTID(content_id);
	}

	/**
	* Returns a range of all the trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @return the range of matching trainingpersonalisedparameterscontentstores
	*/
	public static List<trainingpersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end) {
		return getPersistence().findByCONTENTID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainingpersonalisedparameterscontentstores
	*/
	public static List<trainingpersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainingpersonalisedparameterscontentstores
	*/
	public static List<trainingpersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingpersonalisedparameterscontentstore
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a matching trainingpersonalisedparameterscontentstore could not be found
	*/
	public static trainingpersonalisedparameterscontentstore findByCONTENTID_First(
		long content_id,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingpersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingpersonalisedparameterscontentstore, or <code>null</code> if a matching trainingpersonalisedparameterscontentstore could not be found
	*/
	public static trainingpersonalisedparameterscontentstore fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingpersonalisedparameterscontentstore
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a matching trainingpersonalisedparameterscontentstore could not be found
	*/
	public static trainingpersonalisedparameterscontentstore findByCONTENTID_Last(
		long content_id,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingpersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingpersonalisedparameterscontentstore, or <code>null</code> if a matching trainingpersonalisedparameterscontentstore could not be found
	*/
	public static trainingpersonalisedparameterscontentstore fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the trainingpersonalisedparameterscontentstores before and after the current trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current trainingpersonalisedparameterscontentstore
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next trainingpersonalisedparameterscontentstore
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	public static trainingpersonalisedparameterscontentstore[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingpersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the trainingpersonalisedparameterscontentstores where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENTID(long content_id) {
		getPersistence().removeByCONTENTID(content_id);
	}

	/**
	* Returns the number of trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching trainingpersonalisedparameterscontentstores
	*/
	public static int countByCONTENTID(long content_id) {
		return getPersistence().countByCONTENTID(content_id);
	}

	/**
	* Caches the trainingpersonalisedparameterscontentstore in the entity cache if it is enabled.
	*
	* @param trainingpersonalisedparameterscontentstore the trainingpersonalisedparameterscontentstore
	*/
	public static void cacheResult(
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		getPersistence().cacheResult(trainingpersonalisedparameterscontentstore);
	}

	/**
	* Caches the trainingpersonalisedparameterscontentstores in the entity cache if it is enabled.
	*
	* @param trainingpersonalisedparameterscontentstores the trainingpersonalisedparameterscontentstores
	*/
	public static void cacheResult(
		List<trainingpersonalisedparameterscontentstore> trainingpersonalisedparameterscontentstores) {
		getPersistence().cacheResult(trainingpersonalisedparameterscontentstores);
	}

	/**
	* Creates a new trainingpersonalisedparameterscontentstore with the primary key. Does not add the trainingpersonalisedparameterscontentstore to the database.
	*
	* @param id the primary key for the new trainingpersonalisedparameterscontentstore
	* @return the new trainingpersonalisedparameterscontentstore
	*/
	public static trainingpersonalisedparameterscontentstore create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the trainingpersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore that was removed
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	public static trainingpersonalisedparameterscontentstore remove(long id)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingpersonalisedparameterscontentstoreException {
		return getPersistence().remove(id);
	}

	public static trainingpersonalisedparameterscontentstore updateImpl(
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		return getPersistence()
				   .updateImpl(trainingpersonalisedparameterscontentstore);
	}

	/**
	* Returns the trainingpersonalisedparameterscontentstore with the primary key or throws a {@link NoSuchtrainingpersonalisedparameterscontentstoreException} if it could not be found.
	*
	* @param id the primary key of the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	public static trainingpersonalisedparameterscontentstore findByPrimaryKey(
		long id)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingpersonalisedparameterscontentstoreException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the trainingpersonalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore, or <code>null</code> if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	public static trainingpersonalisedparameterscontentstore fetchByPrimaryKey(
		long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, trainingpersonalisedparameterscontentstore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the trainingpersonalisedparameterscontentstores.
	*
	* @return the trainingpersonalisedparameterscontentstores
	*/
	public static List<trainingpersonalisedparameterscontentstore> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the trainingpersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @return the range of trainingpersonalisedparameterscontentstores
	*/
	public static List<trainingpersonalisedparameterscontentstore> findAll(
		int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the trainingpersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingpersonalisedparameterscontentstores
	*/
	public static List<trainingpersonalisedparameterscontentstore> findAll(
		int start, int end,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the trainingpersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingpersonalisedparameterscontentstores
	*/
	public static List<trainingpersonalisedparameterscontentstore> findAll(
		int start, int end,
		OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the trainingpersonalisedparameterscontentstores from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of trainingpersonalisedparameterscontentstores.
	*
	* @return the number of trainingpersonalisedparameterscontentstores
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static trainingpersonalisedparameterscontentstorePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (trainingpersonalisedparameterscontentstorePersistence)PortletBeanLocatorUtil.locate(com.chola.trainingcalendar.service.ClpSerializer.getServletContextName(),
					trainingpersonalisedparameterscontentstorePersistence.class.getName());

			ReferenceRegistry.registerReference(trainingpersonalisedparameterscontentstoreUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static trainingpersonalisedparameterscontentstorePersistence _persistence;
}