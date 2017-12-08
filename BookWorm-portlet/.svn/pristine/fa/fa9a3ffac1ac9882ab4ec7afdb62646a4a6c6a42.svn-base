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

package com.chola.book.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.book.model.bookusers;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the bookusers service. This utility wraps {@link com.chola.book.service.persistence.impl.bookusersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see bookusersPersistence
 * @see com.chola.book.service.persistence.impl.bookusersPersistenceImpl
 * @generated
 */
@ProviderType
public class bookusersUtil {
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
	public static void clearCache(bookusers bookusers) {
		getPersistence().clearCache(bookusers);
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
	public static List<bookusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<bookusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<bookusers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<bookusers> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static bookusers update(bookusers bookusers) {
		return getPersistence().update(bookusers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static bookusers update(bookusers bookusers,
		ServiceContext serviceContext) {
		return getPersistence().update(bookusers, serviceContext);
	}

	/**
	* Returns all the bookuserses where book_id = &#63;.
	*
	* @param book_id the book_id
	* @return the matching bookuserses
	*/
	public static List<bookusers> findByBOOK_ID(long book_id) {
		return getPersistence().findByBOOK_ID(book_id);
	}

	/**
	* Returns a range of all the bookuserses where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @return the range of matching bookuserses
	*/
	public static List<bookusers> findByBOOK_ID(long book_id, int start, int end) {
		return getPersistence().findByBOOK_ID(book_id, start, end);
	}

	/**
	* Returns an ordered range of all the bookuserses where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookuserses
	*/
	public static List<bookusers> findByBOOK_ID(long book_id, int start,
		int end, OrderByComparator<bookusers> orderByComparator) {
		return getPersistence()
				   .findByBOOK_ID(book_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookuserses where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookuserses
	*/
	public static List<bookusers> findByBOOK_ID(long book_id, int start,
		int end, OrderByComparator<bookusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByBOOK_ID(book_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first bookusers in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookusers
	* @throws NoSuchbookusersException if a matching bookusers could not be found
	*/
	public static bookusers findByBOOK_ID_First(long book_id,
		OrderByComparator<bookusers> orderByComparator)
		throws com.chola.book.exception.NoSuchbookusersException {
		return getPersistence().findByBOOK_ID_First(book_id, orderByComparator);
	}

	/**
	* Returns the first bookusers in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookusers, or <code>null</code> if a matching bookusers could not be found
	*/
	public static bookusers fetchByBOOK_ID_First(long book_id,
		OrderByComparator<bookusers> orderByComparator) {
		return getPersistence().fetchByBOOK_ID_First(book_id, orderByComparator);
	}

	/**
	* Returns the last bookusers in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookusers
	* @throws NoSuchbookusersException if a matching bookusers could not be found
	*/
	public static bookusers findByBOOK_ID_Last(long book_id,
		OrderByComparator<bookusers> orderByComparator)
		throws com.chola.book.exception.NoSuchbookusersException {
		return getPersistence().findByBOOK_ID_Last(book_id, orderByComparator);
	}

	/**
	* Returns the last bookusers in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookusers, or <code>null</code> if a matching bookusers could not be found
	*/
	public static bookusers fetchByBOOK_ID_Last(long book_id,
		OrderByComparator<bookusers> orderByComparator) {
		return getPersistence().fetchByBOOK_ID_Last(book_id, orderByComparator);
	}

	/**
	* Returns the bookuserses before and after the current bookusers in the ordered set where book_id = &#63;.
	*
	* @param id the primary key of the current bookusers
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookusers
	* @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	*/
	public static bookusers[] findByBOOK_ID_PrevAndNext(long id, long book_id,
		OrderByComparator<bookusers> orderByComparator)
		throws com.chola.book.exception.NoSuchbookusersException {
		return getPersistence()
				   .findByBOOK_ID_PrevAndNext(id, book_id, orderByComparator);
	}

	/**
	* Removes all the bookuserses where book_id = &#63; from the database.
	*
	* @param book_id the book_id
	*/
	public static void removeByBOOK_ID(long book_id) {
		getPersistence().removeByBOOK_ID(book_id);
	}

	/**
	* Returns the number of bookuserses where book_id = &#63;.
	*
	* @param book_id the book_id
	* @return the number of matching bookuserses
	*/
	public static int countByBOOK_ID(long book_id) {
		return getPersistence().countByBOOK_ID(book_id);
	}

	/**
	* Returns all the bookuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching bookuserses
	*/
	public static List<bookusers> findByUSER_ID(long user_id) {
		return getPersistence().findByUSER_ID(user_id);
	}

	/**
	* Returns a range of all the bookuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @return the range of matching bookuserses
	*/
	public static List<bookusers> findByUSER_ID(long user_id, int start, int end) {
		return getPersistence().findByUSER_ID(user_id, start, end);
	}

	/**
	* Returns an ordered range of all the bookuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookuserses
	*/
	public static List<bookusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<bookusers> orderByComparator) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookuserses
	*/
	public static List<bookusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<bookusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUSER_ID(user_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first bookusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookusers
	* @throws NoSuchbookusersException if a matching bookusers could not be found
	*/
	public static bookusers findByUSER_ID_First(long user_id,
		OrderByComparator<bookusers> orderByComparator)
		throws com.chola.book.exception.NoSuchbookusersException {
		return getPersistence().findByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the first bookusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookusers, or <code>null</code> if a matching bookusers could not be found
	*/
	public static bookusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<bookusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_First(user_id, orderByComparator);
	}

	/**
	* Returns the last bookusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookusers
	* @throws NoSuchbookusersException if a matching bookusers could not be found
	*/
	public static bookusers findByUSER_ID_Last(long user_id,
		OrderByComparator<bookusers> orderByComparator)
		throws com.chola.book.exception.NoSuchbookusersException {
		return getPersistence().findByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the last bookusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookusers, or <code>null</code> if a matching bookusers could not be found
	*/
	public static bookusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<bookusers> orderByComparator) {
		return getPersistence().fetchByUSER_ID_Last(user_id, orderByComparator);
	}

	/**
	* Returns the bookuserses before and after the current bookusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current bookusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookusers
	* @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	*/
	public static bookusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<bookusers> orderByComparator)
		throws com.chola.book.exception.NoSuchbookusersException {
		return getPersistence()
				   .findByUSER_ID_PrevAndNext(id, user_id, orderByComparator);
	}

	/**
	* Removes all the bookuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public static void removeByUSER_ID(long user_id) {
		getPersistence().removeByUSER_ID(user_id);
	}

	/**
	* Returns the number of bookuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching bookuserses
	*/
	public static int countByUSER_ID(long user_id) {
		return getPersistence().countByUSER_ID(user_id);
	}

	/**
	* Caches the bookusers in the entity cache if it is enabled.
	*
	* @param bookusers the bookusers
	*/
	public static void cacheResult(bookusers bookusers) {
		getPersistence().cacheResult(bookusers);
	}

	/**
	* Caches the bookuserses in the entity cache if it is enabled.
	*
	* @param bookuserses the bookuserses
	*/
	public static void cacheResult(List<bookusers> bookuserses) {
		getPersistence().cacheResult(bookuserses);
	}

	/**
	* Creates a new bookusers with the primary key. Does not add the bookusers to the database.
	*
	* @param id the primary key for the new bookusers
	* @return the new bookusers
	*/
	public static bookusers create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the bookusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookusers
	* @return the bookusers that was removed
	* @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	*/
	public static bookusers remove(long id)
		throws com.chola.book.exception.NoSuchbookusersException {
		return getPersistence().remove(id);
	}

	public static bookusers updateImpl(bookusers bookusers) {
		return getPersistence().updateImpl(bookusers);
	}

	/**
	* Returns the bookusers with the primary key or throws a {@link NoSuchbookusersException} if it could not be found.
	*
	* @param id the primary key of the bookusers
	* @return the bookusers
	* @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	*/
	public static bookusers findByPrimaryKey(long id)
		throws com.chola.book.exception.NoSuchbookusersException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the bookusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bookusers
	* @return the bookusers, or <code>null</code> if a bookusers with the primary key could not be found
	*/
	public static bookusers fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, bookusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bookuserses.
	*
	* @return the bookuserses
	*/
	public static List<bookusers> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bookuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @return the range of bookuserses
	*/
	public static List<bookusers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bookuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookuserses
	*/
	public static List<bookusers> findAll(int start, int end,
		OrderByComparator<bookusers> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookuserses
	*/
	public static List<bookusers> findAll(int start, int end,
		OrderByComparator<bookusers> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bookuserses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bookuserses.
	*
	* @return the number of bookuserses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static bookusersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (bookusersPersistence)PortletBeanLocatorUtil.locate(com.chola.book.service.ClpSerializer.getServletContextName(),
					bookusersPersistence.class.getName());

			ReferenceRegistry.registerReference(bookusersUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static bookusersPersistence _persistence;
}