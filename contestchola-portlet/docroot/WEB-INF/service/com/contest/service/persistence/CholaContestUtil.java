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

package com.contest.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.contest.model.CholaContest;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the chola contest service. This utility wraps {@link com.contest.service.persistence.impl.CholaContestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see CholaContestPersistence
 * @see com.contest.service.persistence.impl.CholaContestPersistenceImpl
 * @generated
 */
@ProviderType
public class CholaContestUtil {
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
	public static void clearCache(CholaContest cholaContest) {
		getPersistence().clearCache(cholaContest);
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
	public static List<CholaContest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CholaContest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CholaContest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CholaContest> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CholaContest update(CholaContest cholaContest) {
		return getPersistence().update(cholaContest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CholaContest update(CholaContest cholaContest,
		ServiceContext serviceContext) {
		return getPersistence().update(cholaContest, serviceContext);
	}

	/**
	* Returns all the chola contests where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching chola contests
	*/
	public static List<CholaContest> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the chola contests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of chola contests
	* @param end the upper bound of the range of chola contests (not inclusive)
	* @return the range of matching chola contests
	*/
	public static List<CholaContest> findByCONTENT_ID(long content_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the chola contests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of chola contests
	* @param end the upper bound of the range of chola contests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching chola contests
	*/
	public static List<CholaContest> findByCONTENT_ID(long content_id,
		int start, int end, OrderByComparator<CholaContest> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the chola contests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of chola contests
	* @param end the upper bound of the range of chola contests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching chola contests
	*/
	public static List<CholaContest> findByCONTENT_ID(long content_id,
		int start, int end, OrderByComparator<CholaContest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first chola contest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chola contest
	* @throws NoSuchCholaContestException if a matching chola contest could not be found
	*/
	public static CholaContest findByCONTENT_ID_First(long content_id,
		OrderByComparator<CholaContest> orderByComparator)
		throws com.contest.exception.NoSuchCholaContestException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first chola contest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching chola contest, or <code>null</code> if a matching chola contest could not be found
	*/
	public static CholaContest fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<CholaContest> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last chola contest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chola contest
	* @throws NoSuchCholaContestException if a matching chola contest could not be found
	*/
	public static CholaContest findByCONTENT_ID_Last(long content_id,
		OrderByComparator<CholaContest> orderByComparator)
		throws com.contest.exception.NoSuchCholaContestException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last chola contest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching chola contest, or <code>null</code> if a matching chola contest could not be found
	*/
	public static CholaContest fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<CholaContest> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the chola contests before and after the current chola contest in the ordered set where content_id = &#63;.
	*
	* @param Id the primary key of the current chola contest
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next chola contest
	* @throws NoSuchCholaContestException if a chola contest with the primary key could not be found
	*/
	public static CholaContest[] findByCONTENT_ID_PrevAndNext(long Id,
		long content_id, OrderByComparator<CholaContest> orderByComparator)
		throws com.contest.exception.NoSuchCholaContestException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(Id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the chola contests where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of chola contests where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching chola contests
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the chola contest in the entity cache if it is enabled.
	*
	* @param cholaContest the chola contest
	*/
	public static void cacheResult(CholaContest cholaContest) {
		getPersistence().cacheResult(cholaContest);
	}

	/**
	* Caches the chola contests in the entity cache if it is enabled.
	*
	* @param cholaContests the chola contests
	*/
	public static void cacheResult(List<CholaContest> cholaContests) {
		getPersistence().cacheResult(cholaContests);
	}

	/**
	* Creates a new chola contest with the primary key. Does not add the chola contest to the database.
	*
	* @param Id the primary key for the new chola contest
	* @return the new chola contest
	*/
	public static CholaContest create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the chola contest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the chola contest
	* @return the chola contest that was removed
	* @throws NoSuchCholaContestException if a chola contest with the primary key could not be found
	*/
	public static CholaContest remove(long Id)
		throws com.contest.exception.NoSuchCholaContestException {
		return getPersistence().remove(Id);
	}

	public static CholaContest updateImpl(CholaContest cholaContest) {
		return getPersistence().updateImpl(cholaContest);
	}

	/**
	* Returns the chola contest with the primary key or throws a {@link NoSuchCholaContestException} if it could not be found.
	*
	* @param Id the primary key of the chola contest
	* @return the chola contest
	* @throws NoSuchCholaContestException if a chola contest with the primary key could not be found
	*/
	public static CholaContest findByPrimaryKey(long Id)
		throws com.contest.exception.NoSuchCholaContestException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the chola contest with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the chola contest
	* @return the chola contest, or <code>null</code> if a chola contest with the primary key could not be found
	*/
	public static CholaContest fetchByPrimaryKey(long Id) {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	public static java.util.Map<java.io.Serializable, CholaContest> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the chola contests.
	*
	* @return the chola contests
	*/
	public static List<CholaContest> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the chola contests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chola contests
	* @param end the upper bound of the range of chola contests (not inclusive)
	* @return the range of chola contests
	*/
	public static List<CholaContest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the chola contests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chola contests
	* @param end the upper bound of the range of chola contests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of chola contests
	*/
	public static List<CholaContest> findAll(int start, int end,
		OrderByComparator<CholaContest> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the chola contests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chola contests
	* @param end the upper bound of the range of chola contests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of chola contests
	*/
	public static List<CholaContest> findAll(int start, int end,
		OrderByComparator<CholaContest> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the chola contests from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of chola contests.
	*
	* @return the number of chola contests
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CholaContestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CholaContestPersistence)PortletBeanLocatorUtil.locate(com.contest.service.ClpSerializer.getServletContextName(),
					CholaContestPersistence.class.getName());

			ReferenceRegistry.registerReference(CholaContestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static CholaContestPersistence _persistence;
}