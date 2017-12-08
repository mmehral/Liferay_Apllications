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

import com.chola.book.model.bookpath;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the bookpath service. This utility wraps {@link com.chola.book.service.persistence.impl.bookpathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see bookpathPersistence
 * @see com.chola.book.service.persistence.impl.bookpathPersistenceImpl
 * @generated
 */
@ProviderType
public class bookpathUtil {
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
	public static void clearCache(bookpath bookpath) {
		getPersistence().clearCache(bookpath);
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
	public static List<bookpath> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<bookpath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<bookpath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<bookpath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static bookpath update(bookpath bookpath) {
		return getPersistence().update(bookpath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static bookpath update(bookpath bookpath,
		ServiceContext serviceContext) {
		return getPersistence().update(bookpath, serviceContext);
	}

	/**
	* Returns all the bookpaths where book_id = &#63;.
	*
	* @param book_id the book_id
	* @return the matching bookpaths
	*/
	public static List<bookpath> findByBOOK_ID(long book_id) {
		return getPersistence().findByBOOK_ID(book_id);
	}

	/**
	* Returns a range of all the bookpaths where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @return the range of matching bookpaths
	*/
	public static List<bookpath> findByBOOK_ID(long book_id, int start, int end) {
		return getPersistence().findByBOOK_ID(book_id, start, end);
	}

	/**
	* Returns an ordered range of all the bookpaths where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookpaths
	*/
	public static List<bookpath> findByBOOK_ID(long book_id, int start,
		int end, OrderByComparator<bookpath> orderByComparator) {
		return getPersistence()
				   .findByBOOK_ID(book_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookpaths where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookpaths
	*/
	public static List<bookpath> findByBOOK_ID(long book_id, int start,
		int end, OrderByComparator<bookpath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByBOOK_ID(book_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first bookpath in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookpath
	* @throws NoSuchbookpathException if a matching bookpath could not be found
	*/
	public static bookpath findByBOOK_ID_First(long book_id,
		OrderByComparator<bookpath> orderByComparator)
		throws com.chola.book.exception.NoSuchbookpathException {
		return getPersistence().findByBOOK_ID_First(book_id, orderByComparator);
	}

	/**
	* Returns the first bookpath in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookpath, or <code>null</code> if a matching bookpath could not be found
	*/
	public static bookpath fetchByBOOK_ID_First(long book_id,
		OrderByComparator<bookpath> orderByComparator) {
		return getPersistence().fetchByBOOK_ID_First(book_id, orderByComparator);
	}

	/**
	* Returns the last bookpath in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookpath
	* @throws NoSuchbookpathException if a matching bookpath could not be found
	*/
	public static bookpath findByBOOK_ID_Last(long book_id,
		OrderByComparator<bookpath> orderByComparator)
		throws com.chola.book.exception.NoSuchbookpathException {
		return getPersistence().findByBOOK_ID_Last(book_id, orderByComparator);
	}

	/**
	* Returns the last bookpath in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookpath, or <code>null</code> if a matching bookpath could not be found
	*/
	public static bookpath fetchByBOOK_ID_Last(long book_id,
		OrderByComparator<bookpath> orderByComparator) {
		return getPersistence().fetchByBOOK_ID_Last(book_id, orderByComparator);
	}

	/**
	* Returns the bookpaths before and after the current bookpath in the ordered set where book_id = &#63;.
	*
	* @param id the primary key of the current bookpath
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookpath
	* @throws NoSuchbookpathException if a bookpath with the primary key could not be found
	*/
	public static bookpath[] findByBOOK_ID_PrevAndNext(long id, long book_id,
		OrderByComparator<bookpath> orderByComparator)
		throws com.chola.book.exception.NoSuchbookpathException {
		return getPersistence()
				   .findByBOOK_ID_PrevAndNext(id, book_id, orderByComparator);
	}

	/**
	* Removes all the bookpaths where book_id = &#63; from the database.
	*
	* @param book_id the book_id
	*/
	public static void removeByBOOK_ID(long book_id) {
		getPersistence().removeByBOOK_ID(book_id);
	}

	/**
	* Returns the number of bookpaths where book_id = &#63;.
	*
	* @param book_id the book_id
	* @return the number of matching bookpaths
	*/
	public static int countByBOOK_ID(long book_id) {
		return getPersistence().countByBOOK_ID(book_id);
	}

	/**
	* Caches the bookpath in the entity cache if it is enabled.
	*
	* @param bookpath the bookpath
	*/
	public static void cacheResult(bookpath bookpath) {
		getPersistence().cacheResult(bookpath);
	}

	/**
	* Caches the bookpaths in the entity cache if it is enabled.
	*
	* @param bookpaths the bookpaths
	*/
	public static void cacheResult(List<bookpath> bookpaths) {
		getPersistence().cacheResult(bookpaths);
	}

	/**
	* Creates a new bookpath with the primary key. Does not add the bookpath to the database.
	*
	* @param id the primary key for the new bookpath
	* @return the new bookpath
	*/
	public static bookpath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the bookpath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookpath
	* @return the bookpath that was removed
	* @throws NoSuchbookpathException if a bookpath with the primary key could not be found
	*/
	public static bookpath remove(long id)
		throws com.chola.book.exception.NoSuchbookpathException {
		return getPersistence().remove(id);
	}

	public static bookpath updateImpl(bookpath bookpath) {
		return getPersistence().updateImpl(bookpath);
	}

	/**
	* Returns the bookpath with the primary key or throws a {@link NoSuchbookpathException} if it could not be found.
	*
	* @param id the primary key of the bookpath
	* @return the bookpath
	* @throws NoSuchbookpathException if a bookpath with the primary key could not be found
	*/
	public static bookpath findByPrimaryKey(long id)
		throws com.chola.book.exception.NoSuchbookpathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the bookpath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bookpath
	* @return the bookpath, or <code>null</code> if a bookpath with the primary key could not be found
	*/
	public static bookpath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, bookpath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bookpaths.
	*
	* @return the bookpaths
	*/
	public static List<bookpath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bookpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @return the range of bookpaths
	*/
	public static List<bookpath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bookpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookpaths
	*/
	public static List<bookpath> findAll(int start, int end,
		OrderByComparator<bookpath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookpaths
	*/
	public static List<bookpath> findAll(int start, int end,
		OrderByComparator<bookpath> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bookpaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bookpaths.
	*
	* @return the number of bookpaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static bookpathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (bookpathPersistence)PortletBeanLocatorUtil.locate(com.chola.book.service.ClpSerializer.getServletContextName(),
					bookpathPersistence.class.getName());

			ReferenceRegistry.registerReference(bookpathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static bookpathPersistence _persistence;
}