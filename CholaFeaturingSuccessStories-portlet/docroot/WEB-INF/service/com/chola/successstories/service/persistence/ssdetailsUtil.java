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

package com.chola.successstories.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.model.ssdetails;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the ssdetails service. This utility wraps {@link com.chola.successstories.service.persistence.impl.ssdetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see ssdetailsPersistence
 * @see com.chola.successstories.service.persistence.impl.ssdetailsPersistenceImpl
 * @generated
 */
@ProviderType
public class ssdetailsUtil {
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
	public static void clearCache(ssdetails ssdetails) {
		getPersistence().clearCache(ssdetails);
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
	public static List<ssdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ssdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ssdetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ssdetails> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ssdetails update(ssdetails ssdetails) {
		return getPersistence().update(ssdetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ssdetails update(ssdetails ssdetails,
		ServiceContext serviceContext) {
		return getPersistence().update(ssdetails, serviceContext);
	}

	/**
	* Returns all the ssdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching ssdetailses
	*/
	public static List<ssdetails> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the ssdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @return the range of matching ssdetailses
	*/
	public static List<ssdetails> findByCONTENT_ID(long content_id, int start,
		int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the ssdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ssdetailses
	*/
	public static List<ssdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<ssdetails> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ssdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ssdetailses
	*/
	public static List<ssdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<ssdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first ssdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ssdetails
	* @throws NoSuchssdetailsException if a matching ssdetails could not be found
	*/
	public static ssdetails findByCONTENT_ID_First(long content_id,
		OrderByComparator<ssdetails> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first ssdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ssdetails, or <code>null</code> if a matching ssdetails could not be found
	*/
	public static ssdetails fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<ssdetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last ssdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ssdetails
	* @throws NoSuchssdetailsException if a matching ssdetails could not be found
	*/
	public static ssdetails findByCONTENT_ID_Last(long content_id,
		OrderByComparator<ssdetails> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last ssdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ssdetails, or <code>null</code> if a matching ssdetails could not be found
	*/
	public static ssdetails fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<ssdetails> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the ssdetailses before and after the current ssdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current ssdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ssdetails
	* @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	*/
	public static ssdetails[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<ssdetails> orderByComparator)
		throws com.chola.successstories.exception.NoSuchssdetailsException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the ssdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of ssdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching ssdetailses
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the ssdetails in the entity cache if it is enabled.
	*
	* @param ssdetails the ssdetails
	*/
	public static void cacheResult(ssdetails ssdetails) {
		getPersistence().cacheResult(ssdetails);
	}

	/**
	* Caches the ssdetailses in the entity cache if it is enabled.
	*
	* @param ssdetailses the ssdetailses
	*/
	public static void cacheResult(List<ssdetails> ssdetailses) {
		getPersistence().cacheResult(ssdetailses);
	}

	/**
	* Creates a new ssdetails with the primary key. Does not add the ssdetails to the database.
	*
	* @param id the primary key for the new ssdetails
	* @return the new ssdetails
	*/
	public static ssdetails create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the ssdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ssdetails
	* @return the ssdetails that was removed
	* @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	*/
	public static ssdetails remove(long id)
		throws com.chola.successstories.exception.NoSuchssdetailsException {
		return getPersistence().remove(id);
	}

	public static ssdetails updateImpl(ssdetails ssdetails) {
		return getPersistence().updateImpl(ssdetails);
	}

	/**
	* Returns the ssdetails with the primary key or throws a {@link NoSuchssdetailsException} if it could not be found.
	*
	* @param id the primary key of the ssdetails
	* @return the ssdetails
	* @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	*/
	public static ssdetails findByPrimaryKey(long id)
		throws com.chola.successstories.exception.NoSuchssdetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the ssdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ssdetails
	* @return the ssdetails, or <code>null</code> if a ssdetails with the primary key could not be found
	*/
	public static ssdetails fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, ssdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ssdetailses.
	*
	* @return the ssdetailses
	*/
	public static List<ssdetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ssdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @return the range of ssdetailses
	*/
	public static List<ssdetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ssdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ssdetailses
	*/
	public static List<ssdetails> findAll(int start, int end,
		OrderByComparator<ssdetails> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ssdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ssdetailses
	*/
	public static List<ssdetails> findAll(int start, int end,
		OrderByComparator<ssdetails> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ssdetailses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ssdetailses.
	*
	* @return the number of ssdetailses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ssdetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ssdetailsPersistence)PortletBeanLocatorUtil.locate(com.chola.successstories.service.ClpSerializer.getServletContextName(),
					ssdetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(ssdetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static ssdetailsPersistence _persistence;
}