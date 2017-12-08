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

package com.chola.appcorner.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.appcorner.model.replied;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the replied service. This utility wraps {@link com.chola.appcorner.service.persistence.impl.repliedPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see repliedPersistence
 * @see com.chola.appcorner.service.persistence.impl.repliedPersistenceImpl
 * @generated
 */
@ProviderType
public class repliedUtil {
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
	public static void clearCache(replied replied) {
		getPersistence().clearCache(replied);
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
	public static List<replied> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<replied> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<replied> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<replied> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static replied update(replied replied) {
		return getPersistence().update(replied);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static replied update(replied replied, ServiceContext serviceContext) {
		return getPersistence().update(replied, serviceContext);
	}

	/**
	* Returns all the replieds where repliedOnPost = &#63;.
	*
	* @param repliedOnPost the replied on post
	* @return the matching replieds
	*/
	public static List<replied> findByREPLIED_POST(long repliedOnPost) {
		return getPersistence().findByREPLIED_POST(repliedOnPost);
	}

	/**
	* Returns a range of all the replieds where repliedOnPost = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param repliedOnPost the replied on post
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @return the range of matching replieds
	*/
	public static List<replied> findByREPLIED_POST(long repliedOnPost,
		int start, int end) {
		return getPersistence().findByREPLIED_POST(repliedOnPost, start, end);
	}

	/**
	* Returns an ordered range of all the replieds where repliedOnPost = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param repliedOnPost the replied on post
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching replieds
	*/
	public static List<replied> findByREPLIED_POST(long repliedOnPost,
		int start, int end, OrderByComparator<replied> orderByComparator) {
		return getPersistence()
				   .findByREPLIED_POST(repliedOnPost, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the replieds where repliedOnPost = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param repliedOnPost the replied on post
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching replieds
	*/
	public static List<replied> findByREPLIED_POST(long repliedOnPost,
		int start, int end, OrderByComparator<replied> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByREPLIED_POST(repliedOnPost, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first replied in the ordered set where repliedOnPost = &#63;.
	*
	* @param repliedOnPost the replied on post
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replied
	* @throws NoSuchrepliedException if a matching replied could not be found
	*/
	public static replied findByREPLIED_POST_First(long repliedOnPost,
		OrderByComparator<replied> orderByComparator)
		throws com.chola.appcorner.exception.NoSuchrepliedException {
		return getPersistence()
				   .findByREPLIED_POST_First(repliedOnPost, orderByComparator);
	}

	/**
	* Returns the first replied in the ordered set where repliedOnPost = &#63;.
	*
	* @param repliedOnPost the replied on post
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching replied, or <code>null</code> if a matching replied could not be found
	*/
	public static replied fetchByREPLIED_POST_First(long repliedOnPost,
		OrderByComparator<replied> orderByComparator) {
		return getPersistence()
				   .fetchByREPLIED_POST_First(repliedOnPost, orderByComparator);
	}

	/**
	* Returns the last replied in the ordered set where repliedOnPost = &#63;.
	*
	* @param repliedOnPost the replied on post
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replied
	* @throws NoSuchrepliedException if a matching replied could not be found
	*/
	public static replied findByREPLIED_POST_Last(long repliedOnPost,
		OrderByComparator<replied> orderByComparator)
		throws com.chola.appcorner.exception.NoSuchrepliedException {
		return getPersistence()
				   .findByREPLIED_POST_Last(repliedOnPost, orderByComparator);
	}

	/**
	* Returns the last replied in the ordered set where repliedOnPost = &#63;.
	*
	* @param repliedOnPost the replied on post
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching replied, or <code>null</code> if a matching replied could not be found
	*/
	public static replied fetchByREPLIED_POST_Last(long repliedOnPost,
		OrderByComparator<replied> orderByComparator) {
		return getPersistence()
				   .fetchByREPLIED_POST_Last(repliedOnPost, orderByComparator);
	}

	/**
	* Returns the replieds before and after the current replied in the ordered set where repliedOnPost = &#63;.
	*
	* @param id the primary key of the current replied
	* @param repliedOnPost the replied on post
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next replied
	* @throws NoSuchrepliedException if a replied with the primary key could not be found
	*/
	public static replied[] findByREPLIED_POST_PrevAndNext(long id,
		long repliedOnPost, OrderByComparator<replied> orderByComparator)
		throws com.chola.appcorner.exception.NoSuchrepliedException {
		return getPersistence()
				   .findByREPLIED_POST_PrevAndNext(id, repliedOnPost,
			orderByComparator);
	}

	/**
	* Removes all the replieds where repliedOnPost = &#63; from the database.
	*
	* @param repliedOnPost the replied on post
	*/
	public static void removeByREPLIED_POST(long repliedOnPost) {
		getPersistence().removeByREPLIED_POST(repliedOnPost);
	}

	/**
	* Returns the number of replieds where repliedOnPost = &#63;.
	*
	* @param repliedOnPost the replied on post
	* @return the number of matching replieds
	*/
	public static int countByREPLIED_POST(long repliedOnPost) {
		return getPersistence().countByREPLIED_POST(repliedOnPost);
	}

	/**
	* Caches the replied in the entity cache if it is enabled.
	*
	* @param replied the replied
	*/
	public static void cacheResult(replied replied) {
		getPersistence().cacheResult(replied);
	}

	/**
	* Caches the replieds in the entity cache if it is enabled.
	*
	* @param replieds the replieds
	*/
	public static void cacheResult(List<replied> replieds) {
		getPersistence().cacheResult(replieds);
	}

	/**
	* Creates a new replied with the primary key. Does not add the replied to the database.
	*
	* @param id the primary key for the new replied
	* @return the new replied
	*/
	public static replied create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the replied with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the replied
	* @return the replied that was removed
	* @throws NoSuchrepliedException if a replied with the primary key could not be found
	*/
	public static replied remove(long id)
		throws com.chola.appcorner.exception.NoSuchrepliedException {
		return getPersistence().remove(id);
	}

	public static replied updateImpl(replied replied) {
		return getPersistence().updateImpl(replied);
	}

	/**
	* Returns the replied with the primary key or throws a {@link NoSuchrepliedException} if it could not be found.
	*
	* @param id the primary key of the replied
	* @return the replied
	* @throws NoSuchrepliedException if a replied with the primary key could not be found
	*/
	public static replied findByPrimaryKey(long id)
		throws com.chola.appcorner.exception.NoSuchrepliedException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the replied with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the replied
	* @return the replied, or <code>null</code> if a replied with the primary key could not be found
	*/
	public static replied fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, replied> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the replieds.
	*
	* @return the replieds
	*/
	public static List<replied> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the replieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @return the range of replieds
	*/
	public static List<replied> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the replieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of replieds
	*/
	public static List<replied> findAll(int start, int end,
		OrderByComparator<replied> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the replieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of replieds
	*/
	public static List<replied> findAll(int start, int end,
		OrderByComparator<replied> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the replieds from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of replieds.
	*
	* @return the number of replieds
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static repliedPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (repliedPersistence)PortletBeanLocatorUtil.locate(com.chola.appcorner.service.ClpSerializer.getServletContextName(),
					repliedPersistence.class.getName());

			ReferenceRegistry.registerReference(repliedUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static repliedPersistence _persistence;
}