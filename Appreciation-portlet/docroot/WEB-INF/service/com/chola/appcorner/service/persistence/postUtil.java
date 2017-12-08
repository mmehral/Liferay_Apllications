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

import com.chola.appcorner.model.post;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the post service. This utility wraps {@link com.chola.appcorner.service.persistence.impl.postPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see postPersistence
 * @see com.chola.appcorner.service.persistence.impl.postPersistenceImpl
 * @generated
 */
@ProviderType
public class postUtil {
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
	public static void clearCache(post post) {
		getPersistence().clearCache(post);
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
	public static List<post> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<post> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<post> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<post> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static post update(post post) {
		return getPersistence().update(post);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static post update(post post, ServiceContext serviceContext) {
		return getPersistence().update(post, serviceContext);
	}

	/**
	* Returns all the posts where appTo = &#63;.
	*
	* @param appTo the app to
	* @return the matching posts
	*/
	public static List<post> findByAPP_TO(long appTo) {
		return getPersistence().findByAPP_TO(appTo);
	}

	/**
	* Returns a range of all the posts where appTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appTo the app to
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @return the range of matching posts
	*/
	public static List<post> findByAPP_TO(long appTo, int start, int end) {
		return getPersistence().findByAPP_TO(appTo, start, end);
	}

	/**
	* Returns an ordered range of all the posts where appTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appTo the app to
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching posts
	*/
	public static List<post> findByAPP_TO(long appTo, int start, int end,
		OrderByComparator<post> orderByComparator) {
		return getPersistence()
				   .findByAPP_TO(appTo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the posts where appTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appTo the app to
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching posts
	*/
	public static List<post> findByAPP_TO(long appTo, int start, int end,
		OrderByComparator<post> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByAPP_TO(appTo, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first post in the ordered set where appTo = &#63;.
	*
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching post
	* @throws NoSuchpostException if a matching post could not be found
	*/
	public static post findByAPP_TO_First(long appTo,
		OrderByComparator<post> orderByComparator)
		throws com.chola.appcorner.exception.NoSuchpostException {
		return getPersistence().findByAPP_TO_First(appTo, orderByComparator);
	}

	/**
	* Returns the first post in the ordered set where appTo = &#63;.
	*
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching post, or <code>null</code> if a matching post could not be found
	*/
	public static post fetchByAPP_TO_First(long appTo,
		OrderByComparator<post> orderByComparator) {
		return getPersistence().fetchByAPP_TO_First(appTo, orderByComparator);
	}

	/**
	* Returns the last post in the ordered set where appTo = &#63;.
	*
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching post
	* @throws NoSuchpostException if a matching post could not be found
	*/
	public static post findByAPP_TO_Last(long appTo,
		OrderByComparator<post> orderByComparator)
		throws com.chola.appcorner.exception.NoSuchpostException {
		return getPersistence().findByAPP_TO_Last(appTo, orderByComparator);
	}

	/**
	* Returns the last post in the ordered set where appTo = &#63;.
	*
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching post, or <code>null</code> if a matching post could not be found
	*/
	public static post fetchByAPP_TO_Last(long appTo,
		OrderByComparator<post> orderByComparator) {
		return getPersistence().fetchByAPP_TO_Last(appTo, orderByComparator);
	}

	/**
	* Returns the posts before and after the current post in the ordered set where appTo = &#63;.
	*
	* @param id the primary key of the current post
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next post
	* @throws NoSuchpostException if a post with the primary key could not be found
	*/
	public static post[] findByAPP_TO_PrevAndNext(long id, long appTo,
		OrderByComparator<post> orderByComparator)
		throws com.chola.appcorner.exception.NoSuchpostException {
		return getPersistence()
				   .findByAPP_TO_PrevAndNext(id, appTo, orderByComparator);
	}

	/**
	* Removes all the posts where appTo = &#63; from the database.
	*
	* @param appTo the app to
	*/
	public static void removeByAPP_TO(long appTo) {
		getPersistence().removeByAPP_TO(appTo);
	}

	/**
	* Returns the number of posts where appTo = &#63;.
	*
	* @param appTo the app to
	* @return the number of matching posts
	*/
	public static int countByAPP_TO(long appTo) {
		return getPersistence().countByAPP_TO(appTo);
	}

	/**
	* Caches the post in the entity cache if it is enabled.
	*
	* @param post the post
	*/
	public static void cacheResult(post post) {
		getPersistence().cacheResult(post);
	}

	/**
	* Caches the posts in the entity cache if it is enabled.
	*
	* @param posts the posts
	*/
	public static void cacheResult(List<post> posts) {
		getPersistence().cacheResult(posts);
	}

	/**
	* Creates a new post with the primary key. Does not add the post to the database.
	*
	* @param id the primary key for the new post
	* @return the new post
	*/
	public static post create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the post with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the post
	* @return the post that was removed
	* @throws NoSuchpostException if a post with the primary key could not be found
	*/
	public static post remove(long id)
		throws com.chola.appcorner.exception.NoSuchpostException {
		return getPersistence().remove(id);
	}

	public static post updateImpl(post post) {
		return getPersistence().updateImpl(post);
	}

	/**
	* Returns the post with the primary key or throws a {@link NoSuchpostException} if it could not be found.
	*
	* @param id the primary key of the post
	* @return the post
	* @throws NoSuchpostException if a post with the primary key could not be found
	*/
	public static post findByPrimaryKey(long id)
		throws com.chola.appcorner.exception.NoSuchpostException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the post with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the post
	* @return the post, or <code>null</code> if a post with the primary key could not be found
	*/
	public static post fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, post> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the posts.
	*
	* @return the posts
	*/
	public static List<post> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the posts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @return the range of posts
	*/
	public static List<post> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the posts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of posts
	*/
	public static List<post> findAll(int start, int end,
		OrderByComparator<post> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the posts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of posts
	*/
	public static List<post> findAll(int start, int end,
		OrderByComparator<post> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the posts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of posts.
	*
	* @return the number of posts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static postPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (postPersistence)PortletBeanLocatorUtil.locate(com.chola.appcorner.service.ClpSerializer.getServletContextName(),
					postPersistence.class.getName());

			ReferenceRegistry.registerReference(postUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static postPersistence _persistence;
}