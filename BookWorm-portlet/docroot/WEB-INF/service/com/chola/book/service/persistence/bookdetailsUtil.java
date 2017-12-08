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

import com.chola.book.model.bookdetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the bookdetails service. This utility wraps {@link com.chola.book.service.persistence.impl.bookdetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see bookdetailsPersistence
 * @see com.chola.book.service.persistence.impl.bookdetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class bookdetailsUtil {
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
	public static void clearCache(bookdetails bookdetails) {
		getPersistence().clearCache(bookdetails);
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
	public static List<bookdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<bookdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<bookdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<bookdetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static bookdetails update(bookdetails bookdetails) {
		return getPersistence().update(bookdetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static bookdetails update(bookdetails bookdetails,
		ServiceContext serviceContext) {
		return getPersistence().update(bookdetails, serviceContext);
	}

	/**
	* Returns all the bookdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching bookdetailses
	*/
	public static List<bookdetails> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the bookdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @return the range of matching bookdetailses
	*/
	public static List<bookdetails> findByCONTENT_ID(long content_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the bookdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookdetailses
	*/
	public static List<bookdetails> findByCONTENT_ID(long content_id,
		int start, int end, OrderByComparator<bookdetails> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookdetailses
	*/
	public static List<bookdetails> findByCONTENT_ID(long content_id,
		int start, int end, OrderByComparator<bookdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first bookdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookdetails
	* @throws NoSuchbookdetailsException if a matching bookdetails could not be found
	*/
	public static bookdetails findByCONTENT_ID_First(long content_id,
		OrderByComparator<bookdetails> orderByComparator)
		throws com.chola.book.exception.NoSuchbookdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first bookdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookdetails, or <code>null</code> if a matching bookdetails could not be found
	*/
	public static bookdetails fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<bookdetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last bookdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookdetails
	* @throws NoSuchbookdetailsException if a matching bookdetails could not be found
	*/
	public static bookdetails findByCONTENT_ID_Last(long content_id,
		OrderByComparator<bookdetails> orderByComparator)
		throws com.chola.book.exception.NoSuchbookdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last bookdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookdetails, or <code>null</code> if a matching bookdetails could not be found
	*/
	public static bookdetails fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<bookdetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the bookdetailses before and after the current bookdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current bookdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookdetails
	* @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	*/
	public static bookdetails[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<bookdetails> orderByComparator)
		throws com.chola.book.exception.NoSuchbookdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the bookdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of bookdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching bookdetailses
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the bookdetails in the entity cache if it is enabled.
	*
	* @param bookdetails the bookdetails
	*/
	public static void cacheResult(bookdetails bookdetails) {
		getPersistence().cacheResult(bookdetails);
	}

	/**
	* Caches the bookdetailses in the entity cache if it is enabled.
	*
	* @param bookdetailses the bookdetailses
	*/
	public static void cacheResult(List<bookdetails> bookdetailses) {
		getPersistence().cacheResult(bookdetailses);
	}

	/**
	* Creates a new bookdetails with the primary key. Does not add the bookdetails to the database.
	*
	* @param id the primary key for the new bookdetails
	* @return the new bookdetails
	*/
	public static bookdetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the bookdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookdetails
	* @return the bookdetails that was removed
	* @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	*/
	public static bookdetails remove(long id)
		throws com.chola.book.exception.NoSuchbookdetailsException {
		return getPersistence().remove(id);
	}

	public static bookdetails updateImpl(bookdetails bookdetails) {
		return getPersistence().updateImpl(bookdetails);
	}

	/**
	* Returns the bookdetails with the primary key or throws a {@link NoSuchbookdetailsException} if it could not be found.
	*
	* @param id the primary key of the bookdetails
	* @return the bookdetails
	* @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	*/
	public static bookdetails findByPrimaryKey(long id)
		throws com.chola.book.exception.NoSuchbookdetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the bookdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bookdetails
	* @return the bookdetails, or <code>null</code> if a bookdetails with the primary key could not be found
	*/
	public static bookdetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, bookdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the bookdetailses.
	*
	* @return the bookdetailses
	*/
	public static List<bookdetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bookdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @return the range of bookdetailses
	*/
	public static List<bookdetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bookdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookdetailses
	*/
	public static List<bookdetails> findAll(int start, int end,
		OrderByComparator<bookdetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the bookdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookdetailses
	*/
	public static List<bookdetails> findAll(int start, int end,
		OrderByComparator<bookdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the bookdetailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bookdetailses.
	*
	* @return the number of bookdetailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static bookdetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (bookdetailsPersistence)PortletBeanLocatorUtil.locate(com.chola.book.service.ClpSerializer.getServletContextName(),
					bookdetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(bookdetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static bookdetailsPersistence _persistence;
}