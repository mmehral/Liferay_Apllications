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

package com.chola.contest.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.contest.model.cholacontest;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the cholacontest service. This utility wraps {@link com.chola.contest.service.persistence.impl.cholacontestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see cholacontestPersistence
 * @see com.chola.contest.service.persistence.impl.cholacontestPersistenceImpl
 * @generated
 */
@ProviderType
public class cholacontestUtil {
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
	public static void clearCache(cholacontest cholacontest) {
		getPersistence().clearCache(cholacontest);
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
	public static List<cholacontest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<cholacontest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<cholacontest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<cholacontest> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static cholacontest update(cholacontest cholacontest) {
		return getPersistence().update(cholacontest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static cholacontest update(cholacontest cholacontest,
		ServiceContext serviceContext) {
		return getPersistence().update(cholacontest, serviceContext);
	}

	/**
	* Returns all the cholacontests where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching cholacontests
	*/
	public static List<cholacontest> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the cholacontests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @return the range of matching cholacontests
	*/
	public static List<cholacontest> findByCONTENT_ID(long content_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the cholacontests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cholacontests
	*/
	public static List<cholacontest> findByCONTENT_ID(long content_id,
		int start, int end, OrderByComparator<cholacontest> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholacontests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cholacontests
	*/
	public static List<cholacontest> findByCONTENT_ID(long content_id,
		int start, int end, OrderByComparator<cholacontest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first cholacontest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholacontest
	* @throws NoSuchcontestException if a matching cholacontest could not be found
	*/
	public static cholacontest findByCONTENT_ID_First(long content_id,
		OrderByComparator<cholacontest> orderByComparator)
		throws com.chola.contest.exception.NoSuchcontestException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first cholacontest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholacontest, or <code>null</code> if a matching cholacontest could not be found
	*/
	public static cholacontest fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<cholacontest> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last cholacontest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholacontest
	* @throws NoSuchcontestException if a matching cholacontest could not be found
	*/
	public static cholacontest findByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholacontest> orderByComparator)
		throws com.chola.contest.exception.NoSuchcontestException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last cholacontest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholacontest, or <code>null</code> if a matching cholacontest could not be found
	*/
	public static cholacontest fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholacontest> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the cholacontests before and after the current cholacontest in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current cholacontest
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cholacontest
	* @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	*/
	public static cholacontest[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<cholacontest> orderByComparator)
		throws com.chola.contest.exception.NoSuchcontestException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the cholacontests where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of cholacontests where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching cholacontests
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the cholacontest in the entity cache if it is enabled.
	*
	* @param cholacontest the cholacontest
	*/
	public static void cacheResult(cholacontest cholacontest) {
		getPersistence().cacheResult(cholacontest);
	}

	/**
	* Caches the cholacontests in the entity cache if it is enabled.
	*
	* @param cholacontests the cholacontests
	*/
	public static void cacheResult(List<cholacontest> cholacontests) {
		getPersistence().cacheResult(cholacontests);
	}

	/**
	* Creates a new cholacontest with the primary key. Does not add the cholacontest to the database.
	*
	* @param id the primary key for the new cholacontest
	* @return the new cholacontest
	*/
	public static cholacontest create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the cholacontest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholacontest
	* @return the cholacontest that was removed
	* @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	*/
	public static cholacontest remove(long id)
		throws com.chola.contest.exception.NoSuchcontestException {
		return getPersistence().remove(id);
	}

	public static cholacontest updateImpl(cholacontest cholacontest) {
		return getPersistence().updateImpl(cholacontest);
	}

	/**
	* Returns the cholacontest with the primary key or throws a {@link NoSuchcontestException} if it could not be found.
	*
	* @param id the primary key of the cholacontest
	* @return the cholacontest
	* @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	*/
	public static cholacontest findByPrimaryKey(long id)
		throws com.chola.contest.exception.NoSuchcontestException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the cholacontest with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the cholacontest
	* @return the cholacontest, or <code>null</code> if a cholacontest with the primary key could not be found
	*/
	public static cholacontest fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, cholacontest> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the cholacontests.
	*
	* @return the cholacontests
	*/
	public static List<cholacontest> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cholacontests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @return the range of cholacontests
	*/
	public static List<cholacontest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cholacontests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cholacontests
	*/
	public static List<cholacontest> findAll(int start, int end,
		OrderByComparator<cholacontest> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholacontests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cholacontests
	*/
	public static List<cholacontest> findAll(int start, int end,
		OrderByComparator<cholacontest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the cholacontests from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cholacontests.
	*
	* @return the number of cholacontests
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static cholacontestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (cholacontestPersistence)PortletBeanLocatorUtil.locate(com.chola.contest.service.ClpSerializer.getServletContextName(),
					cholacontestPersistence.class.getName());

			ReferenceRegistry.registerReference(cholacontestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static cholacontestPersistence _persistence;
}