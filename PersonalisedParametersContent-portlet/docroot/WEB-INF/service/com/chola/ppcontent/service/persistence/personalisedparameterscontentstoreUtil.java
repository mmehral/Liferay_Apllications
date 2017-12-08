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

package com.chola.ppcontent.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.ppcontent.model.personalisedparameterscontentstore;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the personalisedparameterscontentstore service. This utility wraps {@link com.chola.ppcontent.service.persistence.impl.personalisedparameterscontentstorePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see personalisedparameterscontentstorePersistence
 * @see com.chola.ppcontent.service.persistence.impl.personalisedparameterscontentstorePersistenceImpl
 * @generated
 */
@ProviderType
public class personalisedparameterscontentstoreUtil {
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
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		getPersistence().clearCache(personalisedparameterscontentstore);
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
	public static List<personalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<personalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<personalisedparameterscontentstore> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static personalisedparameterscontentstore update(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		return getPersistence().update(personalisedparameterscontentstore);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static personalisedparameterscontentstore update(
		personalisedparameterscontentstore personalisedparameterscontentstore,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(personalisedparameterscontentstore, serviceContext);
	}

	/**
	* Returns all the personalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching personalisedparameterscontentstores
	*/
	public static List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id) {
		return getPersistence().findByCONTENTID(content_id);
	}

	/**
	* Returns a range of all the personalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @return the range of matching personalisedparameterscontentstores
	*/
	public static List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end) {
		return getPersistence().findByCONTENTID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the personalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching personalisedparameterscontentstores
	*/
	public static List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the personalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching personalisedparameterscontentstores
	*/
	public static List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching personalisedparameterscontentstore
	* @throws NoSuchpersonalisedparameterscontentstoreException if a matching personalisedparameterscontentstore could not be found
	*/
	public static personalisedparameterscontentstore findByCONTENTID_First(
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws com.chola.ppcontent.exception.NoSuchpersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching personalisedparameterscontentstore, or <code>null</code> if a matching personalisedparameterscontentstore could not be found
	*/
	public static personalisedparameterscontentstore fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching personalisedparameterscontentstore
	* @throws NoSuchpersonalisedparameterscontentstoreException if a matching personalisedparameterscontentstore could not be found
	*/
	public static personalisedparameterscontentstore findByCONTENTID_Last(
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws com.chola.ppcontent.exception.NoSuchpersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching personalisedparameterscontentstore, or <code>null</code> if a matching personalisedparameterscontentstore could not be found
	*/
	public static personalisedparameterscontentstore fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the personalisedparameterscontentstores before and after the current personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current personalisedparameterscontentstore
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next personalisedparameterscontentstore
	* @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	*/
	public static personalisedparameterscontentstore[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws com.chola.ppcontent.exception.NoSuchpersonalisedparameterscontentstoreException {
		return getPersistence()
				   .findByCONTENTID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the personalisedparameterscontentstores where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENTID(long content_id) {
		getPersistence().removeByCONTENTID(content_id);
	}

	/**
	* Returns the number of personalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching personalisedparameterscontentstores
	*/
	public static int countByCONTENTID(long content_id) {
		return getPersistence().countByCONTENTID(content_id);
	}

	/**
	* Caches the personalisedparameterscontentstore in the entity cache if it is enabled.
	*
	* @param personalisedparameterscontentstore the personalisedparameterscontentstore
	*/
	public static void cacheResult(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		getPersistence().cacheResult(personalisedparameterscontentstore);
	}

	/**
	* Caches the personalisedparameterscontentstores in the entity cache if it is enabled.
	*
	* @param personalisedparameterscontentstores the personalisedparameterscontentstores
	*/
	public static void cacheResult(
		List<personalisedparameterscontentstore> personalisedparameterscontentstores) {
		getPersistence().cacheResult(personalisedparameterscontentstores);
	}

	/**
	* Creates a new personalisedparameterscontentstore with the primary key. Does not add the personalisedparameterscontentstore to the database.
	*
	* @param id the primary key for the new personalisedparameterscontentstore
	* @return the new personalisedparameterscontentstore
	*/
	public static personalisedparameterscontentstore create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the personalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the personalisedparameterscontentstore
	* @return the personalisedparameterscontentstore that was removed
	* @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	*/
	public static personalisedparameterscontentstore remove(long id)
		throws com.chola.ppcontent.exception.NoSuchpersonalisedparameterscontentstoreException {
		return getPersistence().remove(id);
	}

	public static personalisedparameterscontentstore updateImpl(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		return getPersistence().updateImpl(personalisedparameterscontentstore);
	}

	/**
	* Returns the personalisedparameterscontentstore with the primary key or throws a {@link NoSuchpersonalisedparameterscontentstoreException} if it could not be found.
	*
	* @param id the primary key of the personalisedparameterscontentstore
	* @return the personalisedparameterscontentstore
	* @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	*/
	public static personalisedparameterscontentstore findByPrimaryKey(long id)
		throws com.chola.ppcontent.exception.NoSuchpersonalisedparameterscontentstoreException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the personalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the personalisedparameterscontentstore
	* @return the personalisedparameterscontentstore, or <code>null</code> if a personalisedparameterscontentstore with the primary key could not be found
	*/
	public static personalisedparameterscontentstore fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, personalisedparameterscontentstore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the personalisedparameterscontentstores.
	*
	* @return the personalisedparameterscontentstores
	*/
	public static List<personalisedparameterscontentstore> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the personalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @return the range of personalisedparameterscontentstores
	*/
	public static List<personalisedparameterscontentstore> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the personalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of personalisedparameterscontentstores
	*/
	public static List<personalisedparameterscontentstore> findAll(int start,
		int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the personalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of personalisedparameterscontentstores
	*/
	public static List<personalisedparameterscontentstore> findAll(int start,
		int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the personalisedparameterscontentstores from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of personalisedparameterscontentstores.
	*
	* @return the number of personalisedparameterscontentstores
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static personalisedparameterscontentstorePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (personalisedparameterscontentstorePersistence)PortletBeanLocatorUtil.locate(com.chola.ppcontent.service.ClpSerializer.getServletContextName(),
					personalisedparameterscontentstorePersistence.class.getName());

			ReferenceRegistry.registerReference(personalisedparameterscontentstoreUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static personalisedparameterscontentstorePersistence _persistence;
}