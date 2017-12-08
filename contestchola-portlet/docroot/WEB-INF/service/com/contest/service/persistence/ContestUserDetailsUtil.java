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

import com.contest.model.ContestUserDetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the contest user details service. This utility wraps {@link com.contest.service.persistence.impl.ContestUserDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see ContestUserDetailsPersistence
 * @see com.contest.service.persistence.impl.ContestUserDetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class ContestUserDetailsUtil {
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
	public static void clearCache(ContestUserDetails contestUserDetails) {
		getPersistence().clearCache(contestUserDetails);
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
	public static List<ContestUserDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ContestUserDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ContestUserDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ContestUserDetails update(
		ContestUserDetails contestUserDetails) {
		return getPersistence().update(contestUserDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ContestUserDetails update(
		ContestUserDetails contestUserDetails, ServiceContext serviceContext) {
		return getPersistence().update(contestUserDetails, serviceContext);
	}

	/**
	* Returns all the contest user detailses where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @return the matching contest user detailses
	*/
	public static List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id) {
		return getPersistence()
				   .findByCONTESTUSERREFERENCE_ID(contestreference_id);
	}

	/**
	* Returns a range of all the contest user detailses where contestreference_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contestreference_id the contestreference_id
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @return the range of matching contest user detailses
	*/
	public static List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end) {
		return getPersistence()
				   .findByCONTESTUSERREFERENCE_ID(contestreference_id, start,
			end);
	}

	/**
	* Returns an ordered range of all the contest user detailses where contestreference_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contestreference_id the contestreference_id
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contest user detailses
	*/
	public static List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		return getPersistence()
				   .findByCONTESTUSERREFERENCE_ID(contestreference_id, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contest user detailses where contestreference_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contestreference_id the contestreference_id
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contest user detailses
	*/
	public static List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTESTUSERREFERENCE_ID(contestreference_id, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contest user details
	* @throws NoSuchContestUserDetailsException if a matching contest user details could not be found
	*/
	public static ContestUserDetails findByCONTESTUSERREFERENCE_ID_First(
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator)
		throws com.contest.exception.NoSuchContestUserDetailsException {
		return getPersistence()
				   .findByCONTESTUSERREFERENCE_ID_First(contestreference_id,
			orderByComparator);
	}

	/**
	* Returns the first contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contest user details, or <code>null</code> if a matching contest user details could not be found
	*/
	public static ContestUserDetails fetchByCONTESTUSERREFERENCE_ID_First(
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTESTUSERREFERENCE_ID_First(contestreference_id,
			orderByComparator);
	}

	/**
	* Returns the last contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contest user details
	* @throws NoSuchContestUserDetailsException if a matching contest user details could not be found
	*/
	public static ContestUserDetails findByCONTESTUSERREFERENCE_ID_Last(
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator)
		throws com.contest.exception.NoSuchContestUserDetailsException {
		return getPersistence()
				   .findByCONTESTUSERREFERENCE_ID_Last(contestreference_id,
			orderByComparator);
	}

	/**
	* Returns the last contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contest user details, or <code>null</code> if a matching contest user details could not be found
	*/
	public static ContestUserDetails fetchByCONTESTUSERREFERENCE_ID_Last(
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTESTUSERREFERENCE_ID_Last(contestreference_id,
			orderByComparator);
	}

	/**
	* Returns the contest user detailses before and after the current contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param id the primary key of the current contest user details
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contest user details
	* @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	*/
	public static ContestUserDetails[] findByCONTESTUSERREFERENCE_ID_PrevAndNext(
		long id, long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator)
		throws com.contest.exception.NoSuchContestUserDetailsException {
		return getPersistence()
				   .findByCONTESTUSERREFERENCE_ID_PrevAndNext(id,
			contestreference_id, orderByComparator);
	}

	/**
	* Removes all the contest user detailses where contestreference_id = &#63; from the database.
	*
	* @param contestreference_id the contestreference_id
	*/
	public static void removeByCONTESTUSERREFERENCE_ID(long contestreference_id) {
		getPersistence().removeByCONTESTUSERREFERENCE_ID(contestreference_id);
	}

	/**
	* Returns the number of contest user detailses where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @return the number of matching contest user detailses
	*/
	public static int countByCONTESTUSERREFERENCE_ID(long contestreference_id) {
		return getPersistence()
				   .countByCONTESTUSERREFERENCE_ID(contestreference_id);
	}

	/**
	* Caches the contest user details in the entity cache if it is enabled.
	*
	* @param contestUserDetails the contest user details
	*/
	public static void cacheResult(ContestUserDetails contestUserDetails) {
		getPersistence().cacheResult(contestUserDetails);
	}

	/**
	* Caches the contest user detailses in the entity cache if it is enabled.
	*
	* @param contestUserDetailses the contest user detailses
	*/
	public static void cacheResult(
		List<ContestUserDetails> contestUserDetailses) {
		getPersistence().cacheResult(contestUserDetailses);
	}

	/**
	* Creates a new contest user details with the primary key. Does not add the contest user details to the database.
	*
	* @param id the primary key for the new contest user details
	* @return the new contest user details
	*/
	public static ContestUserDetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the contest user details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details that was removed
	* @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	*/
	public static ContestUserDetails remove(long id)
		throws com.contest.exception.NoSuchContestUserDetailsException {
		return getPersistence().remove(id);
	}

	public static ContestUserDetails updateImpl(
		ContestUserDetails contestUserDetails) {
		return getPersistence().updateImpl(contestUserDetails);
	}

	/**
	* Returns the contest user details with the primary key or throws a {@link NoSuchContestUserDetailsException} if it could not be found.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details
	* @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	*/
	public static ContestUserDetails findByPrimaryKey(long id)
		throws com.contest.exception.NoSuchContestUserDetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the contest user details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details, or <code>null</code> if a contest user details with the primary key could not be found
	*/
	public static ContestUserDetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ContestUserDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the contest user detailses.
	*
	* @return the contest user detailses
	*/
	public static List<ContestUserDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the contest user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @return the range of contest user detailses
	*/
	public static List<ContestUserDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the contest user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contest user detailses
	*/
	public static List<ContestUserDetails> findAll(int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contest user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contest user detailses
	*/
	public static List<ContestUserDetails> findAll(int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the contest user detailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of contest user detailses.
	*
	* @return the number of contest user detailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ContestUserDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ContestUserDetailsPersistence)PortletBeanLocatorUtil.locate(com.contest.service.ClpSerializer.getServletContextName(),
					ContestUserDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(ContestUserDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static ContestUserDetailsPersistence _persistence;
}