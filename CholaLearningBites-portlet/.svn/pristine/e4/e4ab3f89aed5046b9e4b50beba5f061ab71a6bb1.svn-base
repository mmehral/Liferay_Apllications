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

package com.chola.learningbites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.learningbites.model.lbdetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the lbdetails service. This utility wraps {@link com.chola.learningbites.service.persistence.impl.lbdetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see lbdetailsPersistence
 * @see com.chola.learningbites.service.persistence.impl.lbdetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class lbdetailsUtil {
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
	public static void clearCache(lbdetails lbdetails) {
		getPersistence().clearCache(lbdetails);
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
	public static List<lbdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<lbdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<lbdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<lbdetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static lbdetails update(lbdetails lbdetails) {
		return getPersistence().update(lbdetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static lbdetails update(lbdetails lbdetails,
		ServiceContext serviceContext) {
		return getPersistence().update(lbdetails, serviceContext);
	}

	/**
	* Returns all the lbdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching lbdetailses
	*/
	public static List<lbdetails> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the lbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @return the range of matching lbdetailses
	*/
	public static List<lbdetails> findByCONTENT_ID(long content_id, int start,
		int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the lbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lbdetailses
	*/
	public static List<lbdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<lbdetails> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lbdetailses
	*/
	public static List<lbdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<lbdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first lbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbdetails
	* @throws NoSuchlbdetailsException if a matching lbdetails could not be found
	*/
	public static lbdetails findByCONTENT_ID_First(long content_id,
		OrderByComparator<lbdetails> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first lbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbdetails, or <code>null</code> if a matching lbdetails could not be found
	*/
	public static lbdetails fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<lbdetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last lbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbdetails
	* @throws NoSuchlbdetailsException if a matching lbdetails could not be found
	*/
	public static lbdetails findByCONTENT_ID_Last(long content_id,
		OrderByComparator<lbdetails> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last lbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbdetails, or <code>null</code> if a matching lbdetails could not be found
	*/
	public static lbdetails fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<lbdetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the lbdetailses before and after the current lbdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current lbdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lbdetails
	* @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	*/
	public static lbdetails[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<lbdetails> orderByComparator)
		throws com.chola.learningbites.exception.NoSuchlbdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the lbdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of lbdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching lbdetailses
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the lbdetails in the entity cache if it is enabled.
	*
	* @param lbdetails the lbdetails
	*/
	public static void cacheResult(lbdetails lbdetails) {
		getPersistence().cacheResult(lbdetails);
	}

	/**
	* Caches the lbdetailses in the entity cache if it is enabled.
	*
	* @param lbdetailses the lbdetailses
	*/
	public static void cacheResult(List<lbdetails> lbdetailses) {
		getPersistence().cacheResult(lbdetailses);
	}

	/**
	* Creates a new lbdetails with the primary key. Does not add the lbdetails to the database.
	*
	* @param id the primary key for the new lbdetails
	* @return the new lbdetails
	*/
	public static lbdetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the lbdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lbdetails
	* @return the lbdetails that was removed
	* @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	*/
	public static lbdetails remove(long id)
		throws com.chola.learningbites.exception.NoSuchlbdetailsException {
		return getPersistence().remove(id);
	}

	public static lbdetails updateImpl(lbdetails lbdetails) {
		return getPersistence().updateImpl(lbdetails);
	}

	/**
	* Returns the lbdetails with the primary key or throws a {@link NoSuchlbdetailsException} if it could not be found.
	*
	* @param id the primary key of the lbdetails
	* @return the lbdetails
	* @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	*/
	public static lbdetails findByPrimaryKey(long id)
		throws com.chola.learningbites.exception.NoSuchlbdetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the lbdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lbdetails
	* @return the lbdetails, or <code>null</code> if a lbdetails with the primary key could not be found
	*/
	public static lbdetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, lbdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the lbdetailses.
	*
	* @return the lbdetailses
	*/
	public static List<lbdetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the lbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @return the range of lbdetailses
	*/
	public static List<lbdetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the lbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lbdetailses
	*/
	public static List<lbdetails> findAll(int start, int end,
		OrderByComparator<lbdetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the lbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of lbdetailses
	*/
	public static List<lbdetails> findAll(int start, int end,
		OrderByComparator<lbdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the lbdetailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of lbdetailses.
	*
	* @return the number of lbdetailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static lbdetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (lbdetailsPersistence)PortletBeanLocatorUtil.locate(com.chola.learningbites.service.ClpSerializer.getServletContextName(),
					lbdetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(lbdetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static lbdetailsPersistence _persistence;
}