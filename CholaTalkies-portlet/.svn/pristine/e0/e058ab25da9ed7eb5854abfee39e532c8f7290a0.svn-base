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

package com.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.model.cholatalkies;

import java.util.List;

/**
 * The persistence utility for the cholatalkies service. This utility wraps {@link com.service.persistence.impl.cholatalkiesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiesPersistence
 * @see com.service.persistence.impl.cholatalkiesPersistenceImpl
 * @generated
 */
@ProviderType
public class cholatalkiesUtil {
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
	public static void clearCache(cholatalkies cholatalkies) {
		getPersistence().clearCache(cholatalkies);
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
	public static List<cholatalkies> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<cholatalkies> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<cholatalkies> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<cholatalkies> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static cholatalkies update(cholatalkies cholatalkies) {
		return getPersistence().update(cholatalkies);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static cholatalkies update(cholatalkies cholatalkies,
		ServiceContext serviceContext) {
		return getPersistence().update(cholatalkies, serviceContext);
	}

	/**
	* Returns all the cholatalkieses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching cholatalkieses
	*/
	public static List<cholatalkies> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the cholatalkieses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholatalkieses
	* @param end the upper bound of the range of cholatalkieses (not inclusive)
	* @return the range of matching cholatalkieses
	*/
	public static List<cholatalkies> findByCONTENT_ID(long content_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the cholatalkieses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholatalkieses
	* @param end the upper bound of the range of cholatalkieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cholatalkieses
	*/
	public static List<cholatalkies> findByCONTENT_ID(long content_id,
		int start, int end, OrderByComparator<cholatalkies> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholatalkieses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholatalkieses
	* @param end the upper bound of the range of cholatalkieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cholatalkieses
	*/
	public static List<cholatalkies> findByCONTENT_ID(long content_id,
		int start, int end, OrderByComparator<cholatalkies> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first cholatalkies in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkies
	* @throws NoSuchcholatalkiesException if a matching cholatalkies could not be found
	*/
	public static cholatalkies findByCONTENT_ID_First(long content_id,
		OrderByComparator<cholatalkies> orderByComparator)
		throws com.exception.NoSuchcholatalkiesException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first cholatalkies in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkies, or <code>null</code> if a matching cholatalkies could not be found
	*/
	public static cholatalkies fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<cholatalkies> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last cholatalkies in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkies
	* @throws NoSuchcholatalkiesException if a matching cholatalkies could not be found
	*/
	public static cholatalkies findByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholatalkies> orderByComparator)
		throws com.exception.NoSuchcholatalkiesException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last cholatalkies in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkies, or <code>null</code> if a matching cholatalkies could not be found
	*/
	public static cholatalkies fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholatalkies> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the cholatalkieses before and after the current cholatalkies in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current cholatalkies
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cholatalkies
	* @throws NoSuchcholatalkiesException if a cholatalkies with the primary key could not be found
	*/
	public static cholatalkies[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<cholatalkies> orderByComparator)
		throws com.exception.NoSuchcholatalkiesException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the cholatalkieses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of cholatalkieses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching cholatalkieses
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the cholatalkies in the entity cache if it is enabled.
	*
	* @param cholatalkies the cholatalkies
	*/
	public static void cacheResult(cholatalkies cholatalkies) {
		getPersistence().cacheResult(cholatalkies);
	}

	/**
	* Caches the cholatalkieses in the entity cache if it is enabled.
	*
	* @param cholatalkieses the cholatalkieses
	*/
	public static void cacheResult(List<cholatalkies> cholatalkieses) {
		getPersistence().cacheResult(cholatalkieses);
	}

	/**
	* Creates a new cholatalkies with the primary key. Does not add the cholatalkies to the database.
	*
	* @param id the primary key for the new cholatalkies
	* @return the new cholatalkies
	*/
	public static cholatalkies create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the cholatalkies with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholatalkies
	* @return the cholatalkies that was removed
	* @throws NoSuchcholatalkiesException if a cholatalkies with the primary key could not be found
	*/
	public static cholatalkies remove(long id)
		throws com.exception.NoSuchcholatalkiesException {
		return getPersistence().remove(id);
	}

	public static cholatalkies updateImpl(cholatalkies cholatalkies) {
		return getPersistence().updateImpl(cholatalkies);
	}

	/**
	* Returns the cholatalkies with the primary key or throws a {@link NoSuchcholatalkiesException} if it could not be found.
	*
	* @param id the primary key of the cholatalkies
	* @return the cholatalkies
	* @throws NoSuchcholatalkiesException if a cholatalkies with the primary key could not be found
	*/
	public static cholatalkies findByPrimaryKey(long id)
		throws com.exception.NoSuchcholatalkiesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the cholatalkies with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the cholatalkies
	* @return the cholatalkies, or <code>null</code> if a cholatalkies with the primary key could not be found
	*/
	public static cholatalkies fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, cholatalkies> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the cholatalkieses.
	*
	* @return the cholatalkieses
	*/
	public static List<cholatalkies> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cholatalkieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkieses
	* @param end the upper bound of the range of cholatalkieses (not inclusive)
	* @return the range of cholatalkieses
	*/
	public static List<cholatalkies> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cholatalkieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkieses
	* @param end the upper bound of the range of cholatalkieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cholatalkieses
	*/
	public static List<cholatalkies> findAll(int start, int end,
		OrderByComparator<cholatalkies> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholatalkieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkieses
	* @param end the upper bound of the range of cholatalkieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cholatalkieses
	*/
	public static List<cholatalkies> findAll(int start, int end,
		OrderByComparator<cholatalkies> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the cholatalkieses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cholatalkieses.
	*
	* @return the number of cholatalkieses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static cholatalkiesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (cholatalkiesPersistence)PortletBeanLocatorUtil.locate(com.service.ClpSerializer.getServletContextName(),
					cholatalkiesPersistence.class.getName());

			ReferenceRegistry.registerReference(cholatalkiesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static cholatalkiesPersistence _persistence;
}