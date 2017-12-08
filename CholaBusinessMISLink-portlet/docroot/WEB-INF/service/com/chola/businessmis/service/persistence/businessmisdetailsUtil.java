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

package com.chola.businessmis.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.model.businessmisdetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the businessmisdetails service. This utility wraps {@link com.chola.businessmis.service.persistence.impl.businessmisdetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see businessmisdetailsPersistence
 * @see com.chola.businessmis.service.persistence.impl.businessmisdetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class businessmisdetailsUtil {
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
	public static void clearCache(businessmisdetails businessmisdetails) {
		getPersistence().clearCache(businessmisdetails);
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
	public static List<businessmisdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<businessmisdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<businessmisdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static businessmisdetails update(
		businessmisdetails businessmisdetails) {
		return getPersistence().update(businessmisdetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static businessmisdetails update(
		businessmisdetails businessmisdetails, ServiceContext serviceContext) {
		return getPersistence().update(businessmisdetails, serviceContext);
	}

	/**
	* Returns all the businessmisdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching businessmisdetailses
	*/
	public static List<businessmisdetails> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the businessmisdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @return the range of matching businessmisdetailses
	*/
	public static List<businessmisdetails> findByCONTENT_ID(long content_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the businessmisdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businessmisdetailses
	*/
	public static List<businessmisdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the businessmisdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businessmisdetailses
	*/
	public static List<businessmisdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businessmisdetails
	* @throws NoSuchbusinessmisdetailsException if a matching businessmisdetails could not be found
	*/
	public static businessmisdetails findByCONTENT_ID_First(long content_id,
		OrderByComparator<businessmisdetails> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businessmisdetails, or <code>null</code> if a matching businessmisdetails could not be found
	*/
	public static businessmisdetails fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<businessmisdetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businessmisdetails
	* @throws NoSuchbusinessmisdetailsException if a matching businessmisdetails could not be found
	*/
	public static businessmisdetails findByCONTENT_ID_Last(long content_id,
		OrderByComparator<businessmisdetails> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businessmisdetails, or <code>null</code> if a matching businessmisdetails could not be found
	*/
	public static businessmisdetails fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<businessmisdetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the businessmisdetailses before and after the current businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current businessmisdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businessmisdetails
	* @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	*/
	public static businessmisdetails[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<businessmisdetails> orderByComparator)
		throws com.chola.businessmis.exception.NoSuchbusinessmisdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the businessmisdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of businessmisdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching businessmisdetailses
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the businessmisdetails in the entity cache if it is enabled.
	*
	* @param businessmisdetails the businessmisdetails
	*/
	public static void cacheResult(businessmisdetails businessmisdetails) {
		getPersistence().cacheResult(businessmisdetails);
	}

	/**
	* Caches the businessmisdetailses in the entity cache if it is enabled.
	*
	* @param businessmisdetailses the businessmisdetailses
	*/
	public static void cacheResult(
		List<businessmisdetails> businessmisdetailses) {
		getPersistence().cacheResult(businessmisdetailses);
	}

	/**
	* Creates a new businessmisdetails with the primary key. Does not add the businessmisdetails to the database.
	*
	* @param id the primary key for the new businessmisdetails
	* @return the new businessmisdetails
	*/
	public static businessmisdetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the businessmisdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businessmisdetails
	* @return the businessmisdetails that was removed
	* @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	*/
	public static businessmisdetails remove(long id)
		throws com.chola.businessmis.exception.NoSuchbusinessmisdetailsException {
		return getPersistence().remove(id);
	}

	public static businessmisdetails updateImpl(
		businessmisdetails businessmisdetails) {
		return getPersistence().updateImpl(businessmisdetails);
	}

	/**
	* Returns the businessmisdetails with the primary key or throws a {@link NoSuchbusinessmisdetailsException} if it could not be found.
	*
	* @param id the primary key of the businessmisdetails
	* @return the businessmisdetails
	* @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	*/
	public static businessmisdetails findByPrimaryKey(long id)
		throws com.chola.businessmis.exception.NoSuchbusinessmisdetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the businessmisdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businessmisdetails
	* @return the businessmisdetails, or <code>null</code> if a businessmisdetails with the primary key could not be found
	*/
	public static businessmisdetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, businessmisdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the businessmisdetailses.
	*
	* @return the businessmisdetailses
	*/
	public static List<businessmisdetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the businessmisdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @return the range of businessmisdetailses
	*/
	public static List<businessmisdetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the businessmisdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businessmisdetailses
	*/
	public static List<businessmisdetails> findAll(int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the businessmisdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businessmisdetailses
	*/
	public static List<businessmisdetails> findAll(int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the businessmisdetailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of businessmisdetailses.
	*
	* @return the number of businessmisdetailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static businessmisdetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (businessmisdetailsPersistence)PortletBeanLocatorUtil.locate(com.chola.businessmis.service.ClpSerializer.getServletContextName(),
					businessmisdetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(businessmisdetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static businessmisdetailsPersistence _persistence;
}