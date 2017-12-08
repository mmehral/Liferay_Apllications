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

package com.usertheme.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.usertheme.model.themecolor;

import java.util.List;

/**
 * The persistence utility for the themecolor service. This utility wraps {@link com.usertheme.service.persistence.impl.themecolorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see themecolorPersistence
 * @see com.usertheme.service.persistence.impl.themecolorPersistenceImpl
 * @generated
 */
@ProviderType
public class themecolorUtil {
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
	public static void clearCache(themecolor themecolor) {
		getPersistence().clearCache(themecolor);
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
	public static List<themecolor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<themecolor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<themecolor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<themecolor> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static themecolor update(themecolor themecolor) {
		return getPersistence().update(themecolor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static themecolor update(themecolor themecolor,
		ServiceContext serviceContext) {
		return getPersistence().update(themecolor, serviceContext);
	}

	/**
	* Returns all the themecolors where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching themecolors
	*/
	public static List<themecolor> findByUSERID(java.lang.String user_id) {
		return getPersistence().findByUSERID(user_id);
	}

	/**
	* Returns a range of all the themecolors where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of themecolors
	* @param end the upper bound of the range of themecolors (not inclusive)
	* @return the range of matching themecolors
	*/
	public static List<themecolor> findByUSERID(java.lang.String user_id,
		int start, int end) {
		return getPersistence().findByUSERID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the themecolors where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of themecolors
	* @param end the upper bound of the range of themecolors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching themecolors
	*/
	public static List<themecolor> findByUSERID(java.lang.String user_id,
		int start, int end, OrderByComparator<themecolor> orderByComparator) {
		return getPersistence()
				   .findByUSERID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the themecolors where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of themecolors
	* @param end the upper bound of the range of themecolors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching themecolors
	*/
	public static List<themecolor> findByUSERID(java.lang.String user_id,
		int start, int end, OrderByComparator<themecolor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSERID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first themecolor in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching themecolor
	* @throws NoSuchthemecolorException if a matching themecolor could not be found
	*/
	public static themecolor findByUSERID_First(java.lang.String user_id,
		OrderByComparator<themecolor> orderByComparator)
		throws com.usertheme.exception.NoSuchthemecolorException {
		return getPersistence().findByUSERID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first themecolor in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching themecolor, or <code>null</code> if a matching themecolor could not be found
	*/
	public static themecolor fetchByUSERID_First(java.lang.String user_id,
		OrderByComparator<themecolor> orderByComparator) {
		return getPersistence().fetchByUSERID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last themecolor in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching themecolor
	* @throws NoSuchthemecolorException if a matching themecolor could not be found
	*/
	public static themecolor findByUSERID_Last(java.lang.String user_id,
		OrderByComparator<themecolor> orderByComparator)
		throws com.usertheme.exception.NoSuchthemecolorException {
		return getPersistence().findByUSERID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last themecolor in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching themecolor, or <code>null</code> if a matching themecolor could not be found
	*/
	public static themecolor fetchByUSERID_Last(java.lang.String user_id,
		OrderByComparator<themecolor> orderByComparator) {
		return getPersistence().fetchByUSERID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the themecolors before and after the current themecolor in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current themecolor
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next themecolor
	* @throws NoSuchthemecolorException if a themecolor with the primary key could not be found
	*/
	public static themecolor[] findByUSERID_PrevAndNext(long id,
		java.lang.String user_id,
		OrderByComparator<themecolor> orderByComparator)
		throws com.usertheme.exception.NoSuchthemecolorException {
		return getPersistence()
				   .findByUSERID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the themecolors where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSERID(java.lang.String user_id) {
		getPersistence().removeByUSERID(user_id);
	}

	/**
	* Returns the number of themecolors where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching themecolors
	*/
	public static int countByUSERID(java.lang.String user_id) {
		return getPersistence().countByUSERID(user_id);
	}

	/**
	* Caches the themecolor in the entity cache if it is enabled.
	*
	* @param themecolor the themecolor
	*/
	public static void cacheResult(themecolor themecolor) {
		getPersistence().cacheResult(themecolor);
	}

	/**
	* Caches the themecolors in the entity cache if it is enabled.
	*
	* @param themecolors the themecolors
	*/
	public static void cacheResult(List<themecolor> themecolors) {
		getPersistence().cacheResult(themecolors);
	}

	/**
	* Creates a new themecolor with the primary key. Does not add the themecolor to the database.
	*
	* @param id the primary key for the new themecolor
	* @return the new themecolor
	*/
	public static themecolor create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the themecolor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the themecolor
	* @return the themecolor that was removed
	* @throws NoSuchthemecolorException if a themecolor with the primary key could not be found
	*/
	public static themecolor remove(long id)
		throws com.usertheme.exception.NoSuchthemecolorException {
		return getPersistence().remove(id);
	}

	public static themecolor updateImpl(themecolor themecolor) {
		return getPersistence().updateImpl(themecolor);
	}

	/**
	* Returns the themecolor with the primary key or throws a {@link NoSuchthemecolorException} if it could not be found.
	*
	* @param id the primary key of the themecolor
	* @return the themecolor
	* @throws NoSuchthemecolorException if a themecolor with the primary key could not be found
	*/
	public static themecolor findByPrimaryKey(long id)
		throws com.usertheme.exception.NoSuchthemecolorException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the themecolor with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the themecolor
	* @return the themecolor, or <code>null</code> if a themecolor with the primary key could not be found
	*/
	public static themecolor fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, themecolor> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the themecolors.
	*
	* @return the themecolors
	*/
	public static List<themecolor> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the themecolors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of themecolors
	* @param end the upper bound of the range of themecolors (not inclusive)
	* @return the range of themecolors
	*/
	public static List<themecolor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the themecolors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of themecolors
	* @param end the upper bound of the range of themecolors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of themecolors
	*/
	public static List<themecolor> findAll(int start, int end,
		OrderByComparator<themecolor> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the themecolors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of themecolors
	* @param end the upper bound of the range of themecolors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of themecolors
	*/
	public static List<themecolor> findAll(int start, int end,
		OrderByComparator<themecolor> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the themecolors from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of themecolors.
	*
	* @return the number of themecolors
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static themecolorPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (themecolorPersistence)PortletBeanLocatorUtil.locate(com.usertheme.service.ClpSerializer.getServletContextName(),
					themecolorPersistence.class.getName());

			ReferenceRegistry.registerReference(themecolorUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static themecolorPersistence _persistence;
}