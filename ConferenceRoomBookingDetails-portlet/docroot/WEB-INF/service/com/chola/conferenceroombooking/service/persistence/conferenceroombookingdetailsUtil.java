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

package com.chola.conferenceroombooking.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.model.conferenceroombookingdetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the conferenceroombookingdetails service. This utility wraps {@link com.chola.conferenceroombooking.service.persistence.impl.conferenceroombookingdetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see conferenceroombookingdetailsPersistence
 * @see com.chola.conferenceroombooking.service.persistence.impl.conferenceroombookingdetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class conferenceroombookingdetailsUtil {
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
	public static void clearCache(
		conferenceroombookingdetails conferenceroombookingdetails) {
		getPersistence().clearCache(conferenceroombookingdetails);
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
	public static List<conferenceroombookingdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<conferenceroombookingdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<conferenceroombookingdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static conferenceroombookingdetails update(
		conferenceroombookingdetails conferenceroombookingdetails) {
		return getPersistence().update(conferenceroombookingdetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static conferenceroombookingdetails update(
		conferenceroombookingdetails conferenceroombookingdetails,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(conferenceroombookingdetails, serviceContext);
	}

	/**
	* Returns all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @return the matching conferenceroombookingdetailses
	*/
	public static List<conferenceroombookingdetails> findByMY_BOOKING(
		long userid, int status) {
		return getPersistence().findByMY_BOOKING(userid, status);
	}

	/**
	* Returns a range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param status the status
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @return the range of matching conferenceroombookingdetailses
	*/
	public static List<conferenceroombookingdetails> findByMY_BOOKING(
		long userid, int status, int start, int end) {
		return getPersistence().findByMY_BOOKING(userid, status, start, end);
	}

	/**
	* Returns an ordered range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param status the status
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching conferenceroombookingdetailses
	*/
	public static List<conferenceroombookingdetails> findByMY_BOOKING(
		long userid, int status, int start, int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		return getPersistence()
				   .findByMY_BOOKING(userid, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param status the status
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching conferenceroombookingdetailses
	*/
	public static List<conferenceroombookingdetails> findByMY_BOOKING(
		long userid, int status, int start, int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMY_BOOKING(userid, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conferenceroombookingdetails
	* @throws NoSuchconferenceroombookingdetailsException if a matching conferenceroombookingdetails could not be found
	*/
	public static conferenceroombookingdetails findByMY_BOOKING_First(
		long userid, int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws com.chola.conferenceroombooking.exception.NoSuchconferenceroombookingdetailsException {
		return getPersistence()
				   .findByMY_BOOKING_First(userid, status, orderByComparator);
	}

	/**
	* Returns the first conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conferenceroombookingdetails, or <code>null</code> if a matching conferenceroombookingdetails could not be found
	*/
	public static conferenceroombookingdetails fetchByMY_BOOKING_First(
		long userid, int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		return getPersistence()
				   .fetchByMY_BOOKING_First(userid, status, orderByComparator);
	}

	/**
	* Returns the last conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conferenceroombookingdetails
	* @throws NoSuchconferenceroombookingdetailsException if a matching conferenceroombookingdetails could not be found
	*/
	public static conferenceroombookingdetails findByMY_BOOKING_Last(
		long userid, int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws com.chola.conferenceroombooking.exception.NoSuchconferenceroombookingdetailsException {
		return getPersistence()
				   .findByMY_BOOKING_Last(userid, status, orderByComparator);
	}

	/**
	* Returns the last conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conferenceroombookingdetails, or <code>null</code> if a matching conferenceroombookingdetails could not be found
	*/
	public static conferenceroombookingdetails fetchByMY_BOOKING_Last(
		long userid, int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		return getPersistence()
				   .fetchByMY_BOOKING_Last(userid, status, orderByComparator);
	}

	/**
	* Returns the conferenceroombookingdetailses before and after the current conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param bookid the primary key of the current conferenceroombookingdetails
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next conferenceroombookingdetails
	* @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	*/
	public static conferenceroombookingdetails[] findByMY_BOOKING_PrevAndNext(
		long bookid, long userid, int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws com.chola.conferenceroombooking.exception.NoSuchconferenceroombookingdetailsException {
		return getPersistence()
				   .findByMY_BOOKING_PrevAndNext(bookid, userid, status,
			orderByComparator);
	}

	/**
	* Removes all the conferenceroombookingdetailses where userid = &#63; and status = &#63; from the database.
	*
	* @param userid the userid
	* @param status the status
	*/
	public static void removeByMY_BOOKING(long userid, int status) {
		getPersistence().removeByMY_BOOKING(userid, status);
	}

	/**
	* Returns the number of conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @return the number of matching conferenceroombookingdetailses
	*/
	public static int countByMY_BOOKING(long userid, int status) {
		return getPersistence().countByMY_BOOKING(userid, status);
	}

	/**
	* Caches the conferenceroombookingdetails in the entity cache if it is enabled.
	*
	* @param conferenceroombookingdetails the conferenceroombookingdetails
	*/
	public static void cacheResult(
		conferenceroombookingdetails conferenceroombookingdetails) {
		getPersistence().cacheResult(conferenceroombookingdetails);
	}

	/**
	* Caches the conferenceroombookingdetailses in the entity cache if it is enabled.
	*
	* @param conferenceroombookingdetailses the conferenceroombookingdetailses
	*/
	public static void cacheResult(
		List<conferenceroombookingdetails> conferenceroombookingdetailses) {
		getPersistence().cacheResult(conferenceroombookingdetailses);
	}

	/**
	* Creates a new conferenceroombookingdetails with the primary key. Does not add the conferenceroombookingdetails to the database.
	*
	* @param bookid the primary key for the new conferenceroombookingdetails
	* @return the new conferenceroombookingdetails
	*/
	public static conferenceroombookingdetails create(long bookid) {
		return getPersistence().create(bookid);
	}

	/**
	* Removes the conferenceroombookingdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was removed
	* @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	*/
	public static conferenceroombookingdetails remove(long bookid)
		throws com.chola.conferenceroombooking.exception.NoSuchconferenceroombookingdetailsException {
		return getPersistence().remove(bookid);
	}

	public static conferenceroombookingdetails updateImpl(
		conferenceroombookingdetails conferenceroombookingdetails) {
		return getPersistence().updateImpl(conferenceroombookingdetails);
	}

	/**
	* Returns the conferenceroombookingdetails with the primary key or throws a {@link NoSuchconferenceroombookingdetailsException} if it could not be found.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails
	* @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	*/
	public static conferenceroombookingdetails findByPrimaryKey(long bookid)
		throws com.chola.conferenceroombooking.exception.NoSuchconferenceroombookingdetailsException {
		return getPersistence().findByPrimaryKey(bookid);
	}

	/**
	* Returns the conferenceroombookingdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails, or <code>null</code> if a conferenceroombookingdetails with the primary key could not be found
	*/
	public static conferenceroombookingdetails fetchByPrimaryKey(long bookid) {
		return getPersistence().fetchByPrimaryKey(bookid);
	}

	public static java.util.Map<java.io.Serializable, conferenceroombookingdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the conferenceroombookingdetailses.
	*
	* @return the conferenceroombookingdetailses
	*/
	public static List<conferenceroombookingdetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the conferenceroombookingdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @return the range of conferenceroombookingdetailses
	*/
	public static List<conferenceroombookingdetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the conferenceroombookingdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of conferenceroombookingdetailses
	*/
	public static List<conferenceroombookingdetails> findAll(int start,
		int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the conferenceroombookingdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of conferenceroombookingdetailses
	*/
	public static List<conferenceroombookingdetails> findAll(int start,
		int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the conferenceroombookingdetailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of conferenceroombookingdetailses.
	*
	* @return the number of conferenceroombookingdetailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static conferenceroombookingdetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (conferenceroombookingdetailsPersistence)PortletBeanLocatorUtil.locate(com.chola.conferenceroombooking.service.ClpSerializer.getServletContextName(),
					conferenceroombookingdetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(conferenceroombookingdetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static conferenceroombookingdetailsPersistence _persistence;
}