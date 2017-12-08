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

package com.chola.birthday.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.birthday.model.birthdaywish;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the birthdaywish service. This utility wraps {@link com.chola.birthday.service.persistence.impl.birthdaywishPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see birthdaywishPersistence
 * @see com.chola.birthday.service.persistence.impl.birthdaywishPersistenceImpl
 * @generated
 */
@ProviderType
public class birthdaywishUtil {
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
	public static void clearCache(birthdaywish birthdaywish) {
		getPersistence().clearCache(birthdaywish);
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
	public static List<birthdaywish> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<birthdaywish> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<birthdaywish> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<birthdaywish> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static birthdaywish update(birthdaywish birthdaywish) {
		return getPersistence().update(birthdaywish);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static birthdaywish update(birthdaywish birthdaywish,
		ServiceContext serviceContext) {
		return getPersistence().update(birthdaywish, serviceContext);
	}

	/**
	* Returns all the birthdaywishs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching birthdaywishs
	*/
	public static List<birthdaywish> findByuserIds(java.lang.String userId) {
		return getPersistence().findByuserIds(userId);
	}

	/**
	* Returns a range of all the birthdaywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @return the range of matching birthdaywishs
	*/
	public static List<birthdaywish> findByuserIds(java.lang.String userId,
		int start, int end) {
		return getPersistence().findByuserIds(userId, start, end);
	}

	/**
	* Returns an ordered range of all the birthdaywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching birthdaywishs
	*/
	public static List<birthdaywish> findByuserIds(java.lang.String userId,
		int start, int end, OrderByComparator<birthdaywish> orderByComparator) {
		return getPersistence()
				   .findByuserIds(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the birthdaywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching birthdaywishs
	*/
	public static List<birthdaywish> findByuserIds(java.lang.String userId,
		int start, int end, OrderByComparator<birthdaywish> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByuserIds(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first birthdaywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching birthdaywish
	* @throws NoSuchbirthdaywishException if a matching birthdaywish could not be found
	*/
	public static birthdaywish findByuserIds_First(java.lang.String userId,
		OrderByComparator<birthdaywish> orderByComparator)
		throws com.chola.birthday.exception.NoSuchbirthdaywishException {
		return getPersistence().findByuserIds_First(userId, orderByComparator);
	}

	/**
	* Returns the first birthdaywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching birthdaywish, or <code>null</code> if a matching birthdaywish could not be found
	*/
	public static birthdaywish fetchByuserIds_First(java.lang.String userId,
		OrderByComparator<birthdaywish> orderByComparator) {
		return getPersistence().fetchByuserIds_First(userId, orderByComparator);
	}

	/**
	* Returns the last birthdaywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching birthdaywish
	* @throws NoSuchbirthdaywishException if a matching birthdaywish could not be found
	*/
	public static birthdaywish findByuserIds_Last(java.lang.String userId,
		OrderByComparator<birthdaywish> orderByComparator)
		throws com.chola.birthday.exception.NoSuchbirthdaywishException {
		return getPersistence().findByuserIds_Last(userId, orderByComparator);
	}

	/**
	* Returns the last birthdaywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching birthdaywish, or <code>null</code> if a matching birthdaywish could not be found
	*/
	public static birthdaywish fetchByuserIds_Last(java.lang.String userId,
		OrderByComparator<birthdaywish> orderByComparator) {
		return getPersistence().fetchByuserIds_Last(userId, orderByComparator);
	}

	/**
	* Returns the birthdaywishs before and after the current birthdaywish in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current birthdaywish
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next birthdaywish
	* @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	*/
	public static birthdaywish[] findByuserIds_PrevAndNext(long id,
		java.lang.String userId,
		OrderByComparator<birthdaywish> orderByComparator)
		throws com.chola.birthday.exception.NoSuchbirthdaywishException {
		return getPersistence()
				   .findByuserIds_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the birthdaywishs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByuserIds(java.lang.String userId) {
		getPersistence().removeByuserIds(userId);
	}

	/**
	* Returns the number of birthdaywishs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching birthdaywishs
	*/
	public static int countByuserIds(java.lang.String userId) {
		return getPersistence().countByuserIds(userId);
	}

	/**
	* Caches the birthdaywish in the entity cache if it is enabled.
	*
	* @param birthdaywish the birthdaywish
	*/
	public static void cacheResult(birthdaywish birthdaywish) {
		getPersistence().cacheResult(birthdaywish);
	}

	/**
	* Caches the birthdaywishs in the entity cache if it is enabled.
	*
	* @param birthdaywishs the birthdaywishs
	*/
	public static void cacheResult(List<birthdaywish> birthdaywishs) {
		getPersistence().cacheResult(birthdaywishs);
	}

	/**
	* Creates a new birthdaywish with the primary key. Does not add the birthdaywish to the database.
	*
	* @param id the primary key for the new birthdaywish
	* @return the new birthdaywish
	*/
	public static birthdaywish create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the birthdaywish with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish that was removed
	* @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	*/
	public static birthdaywish remove(long id)
		throws com.chola.birthday.exception.NoSuchbirthdaywishException {
		return getPersistence().remove(id);
	}

	public static birthdaywish updateImpl(birthdaywish birthdaywish) {
		return getPersistence().updateImpl(birthdaywish);
	}

	/**
	* Returns the birthdaywish with the primary key or throws a {@link NoSuchbirthdaywishException} if it could not be found.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish
	* @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	*/
	public static birthdaywish findByPrimaryKey(long id)
		throws com.chola.birthday.exception.NoSuchbirthdaywishException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the birthdaywish with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish, or <code>null</code> if a birthdaywish with the primary key could not be found
	*/
	public static birthdaywish fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, birthdaywish> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the birthdaywishs.
	*
	* @return the birthdaywishs
	*/
	public static List<birthdaywish> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the birthdaywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @return the range of birthdaywishs
	*/
	public static List<birthdaywish> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the birthdaywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of birthdaywishs
	*/
	public static List<birthdaywish> findAll(int start, int end,
		OrderByComparator<birthdaywish> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the birthdaywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of birthdaywishs
	*/
	public static List<birthdaywish> findAll(int start, int end,
		OrderByComparator<birthdaywish> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the birthdaywishs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of birthdaywishs.
	*
	* @return the number of birthdaywishs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static birthdaywishPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (birthdaywishPersistence)PortletBeanLocatorUtil.locate(com.chola.birthday.service.ClpSerializer.getServletContextName(),
					birthdaywishPersistence.class.getName());

			ReferenceRegistry.registerReference(birthdaywishUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static birthdaywishPersistence _persistence;
}