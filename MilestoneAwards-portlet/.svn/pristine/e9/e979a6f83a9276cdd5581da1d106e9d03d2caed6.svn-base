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

package com.chola.milestone.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.milestone.model.milestone;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the milestone service. This utility wraps {@link com.chola.milestone.service.persistence.impl.milestonePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see milestonePersistence
 * @see com.chola.milestone.service.persistence.impl.milestonePersistenceImpl
 * @generated
 */
@ProviderType
public class milestoneUtil {
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
	public static void clearCache(milestone milestone) {
		getPersistence().clearCache(milestone);
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
	public static List<milestone> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<milestone> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<milestone> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<milestone> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static milestone update(milestone milestone) {
		return getPersistence().update(milestone);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static milestone update(milestone milestone,
		ServiceContext serviceContext) {
		return getPersistence().update(milestone, serviceContext);
	}

	/**
	* Returns all the milestones where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching milestones
	*/
	public static List<milestone> findByuserIds(java.lang.String userId) {
		return getPersistence().findByuserIds(userId);
	}

	/**
	* Returns a range of all the milestones where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @return the range of matching milestones
	*/
	public static List<milestone> findByuserIds(java.lang.String userId,
		int start, int end) {
		return getPersistence().findByuserIds(userId, start, end);
	}

	/**
	* Returns an ordered range of all the milestones where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching milestones
	*/
	public static List<milestone> findByuserIds(java.lang.String userId,
		int start, int end, OrderByComparator<milestone> orderByComparator) {
		return getPersistence()
				   .findByuserIds(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the milestones where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching milestones
	*/
	public static List<milestone> findByuserIds(java.lang.String userId,
		int start, int end, OrderByComparator<milestone> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByuserIds(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first milestone in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching milestone
	* @throws NoSuchmilestoneException if a matching milestone could not be found
	*/
	public static milestone findByuserIds_First(java.lang.String userId,
		OrderByComparator<milestone> orderByComparator)
		throws com.chola.milestone.exception.NoSuchmilestoneException {
		return getPersistence().findByuserIds_First(userId, orderByComparator);
	}

	/**
	* Returns the first milestone in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching milestone, or <code>null</code> if a matching milestone could not be found
	*/
	public static milestone fetchByuserIds_First(java.lang.String userId,
		OrderByComparator<milestone> orderByComparator) {
		return getPersistence().fetchByuserIds_First(userId, orderByComparator);
	}

	/**
	* Returns the last milestone in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching milestone
	* @throws NoSuchmilestoneException if a matching milestone could not be found
	*/
	public static milestone findByuserIds_Last(java.lang.String userId,
		OrderByComparator<milestone> orderByComparator)
		throws com.chola.milestone.exception.NoSuchmilestoneException {
		return getPersistence().findByuserIds_Last(userId, orderByComparator);
	}

	/**
	* Returns the last milestone in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching milestone, or <code>null</code> if a matching milestone could not be found
	*/
	public static milestone fetchByuserIds_Last(java.lang.String userId,
		OrderByComparator<milestone> orderByComparator) {
		return getPersistence().fetchByuserIds_Last(userId, orderByComparator);
	}

	/**
	* Returns the milestones before and after the current milestone in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current milestone
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next milestone
	* @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	*/
	public static milestone[] findByuserIds_PrevAndNext(long id,
		java.lang.String userId, OrderByComparator<milestone> orderByComparator)
		throws com.chola.milestone.exception.NoSuchmilestoneException {
		return getPersistence()
				   .findByuserIds_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the milestones where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByuserIds(java.lang.String userId) {
		getPersistence().removeByuserIds(userId);
	}

	/**
	* Returns the number of milestones where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching milestones
	*/
	public static int countByuserIds(java.lang.String userId) {
		return getPersistence().countByuserIds(userId);
	}

	/**
	* Caches the milestone in the entity cache if it is enabled.
	*
	* @param milestone the milestone
	*/
	public static void cacheResult(milestone milestone) {
		getPersistence().cacheResult(milestone);
	}

	/**
	* Caches the milestones in the entity cache if it is enabled.
	*
	* @param milestones the milestones
	*/
	public static void cacheResult(List<milestone> milestones) {
		getPersistence().cacheResult(milestones);
	}

	/**
	* Creates a new milestone with the primary key. Does not add the milestone to the database.
	*
	* @param id the primary key for the new milestone
	* @return the new milestone
	*/
	public static milestone create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the milestone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the milestone
	* @return the milestone that was removed
	* @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	*/
	public static milestone remove(long id)
		throws com.chola.milestone.exception.NoSuchmilestoneException {
		return getPersistence().remove(id);
	}

	public static milestone updateImpl(milestone milestone) {
		return getPersistence().updateImpl(milestone);
	}

	/**
	* Returns the milestone with the primary key or throws a {@link NoSuchmilestoneException} if it could not be found.
	*
	* @param id the primary key of the milestone
	* @return the milestone
	* @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	*/
	public static milestone findByPrimaryKey(long id)
		throws com.chola.milestone.exception.NoSuchmilestoneException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the milestone with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the milestone
	* @return the milestone, or <code>null</code> if a milestone with the primary key could not be found
	*/
	public static milestone fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, milestone> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the milestones.
	*
	* @return the milestones
	*/
	public static List<milestone> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the milestones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @return the range of milestones
	*/
	public static List<milestone> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the milestones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of milestones
	*/
	public static List<milestone> findAll(int start, int end,
		OrderByComparator<milestone> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the milestones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of milestones
	*/
	public static List<milestone> findAll(int start, int end,
		OrderByComparator<milestone> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the milestones from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of milestones.
	*
	* @return the number of milestones
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static milestonePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (milestonePersistence)PortletBeanLocatorUtil.locate(com.chola.milestone.service.ClpSerializer.getServletContextName(),
					milestonePersistence.class.getName());

			ReferenceRegistry.registerReference(milestoneUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static milestonePersistence _persistence;
}