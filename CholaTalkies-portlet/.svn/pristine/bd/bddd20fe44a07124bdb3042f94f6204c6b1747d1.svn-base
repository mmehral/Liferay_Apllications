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

import com.model.cholatalkiespath;

import java.util.List;

/**
 * The persistence utility for the cholatalkiespath service. This utility wraps {@link com.service.persistence.impl.cholatalkiespathPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiespathPersistence
 * @see com.service.persistence.impl.cholatalkiespathPersistenceImpl
 * @generated
 */
@ProviderType
public class cholatalkiespathUtil {
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
	public static void clearCache(cholatalkiespath cholatalkiespath) {
		getPersistence().clearCache(cholatalkiespath);
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
	public static List<cholatalkiespath> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<cholatalkiespath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<cholatalkiespath> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static cholatalkiespath update(cholatalkiespath cholatalkiespath) {
		return getPersistence().update(cholatalkiespath);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static cholatalkiespath update(cholatalkiespath cholatalkiespath,
		ServiceContext serviceContext) {
		return getPersistence().update(cholatalkiespath, serviceContext);
	}

	/**
	* Returns all the cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @return the matching cholatalkiespaths
	*/
	public static List<cholatalkiespath> findByCTDETAILS_ID(
		java.lang.String cholatalkiesdetaild_id) {
		return getPersistence().findByCTDETAILS_ID(cholatalkiesdetaild_id);
	}

	/**
	* Returns a range of all the cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @return the range of matching cholatalkiespaths
	*/
	public static List<cholatalkiespath> findByCTDETAILS_ID(
		java.lang.String cholatalkiesdetaild_id, int start, int end) {
		return getPersistence()
				   .findByCTDETAILS_ID(cholatalkiesdetaild_id, start, end);
	}

	/**
	* Returns an ordered range of all the cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cholatalkiespaths
	*/
	public static List<cholatalkiespath> findByCTDETAILS_ID(
		java.lang.String cholatalkiesdetaild_id, int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return getPersistence()
				   .findByCTDETAILS_ID(cholatalkiesdetaild_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cholatalkiespaths
	*/
	public static List<cholatalkiespath> findByCTDETAILS_ID(
		java.lang.String cholatalkiesdetaild_id, int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCTDETAILS_ID(cholatalkiesdetaild_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkiespath
	* @throws NoSuchcholatalkiespathException if a matching cholatalkiespath could not be found
	*/
	public static cholatalkiespath findByCTDETAILS_ID_First(
		java.lang.String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws com.exception.NoSuchcholatalkiespathException {
		return getPersistence()
				   .findByCTDETAILS_ID_First(cholatalkiesdetaild_id,
			orderByComparator);
	}

	/**
	* Returns the first cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkiespath, or <code>null</code> if a matching cholatalkiespath could not be found
	*/
	public static cholatalkiespath fetchByCTDETAILS_ID_First(
		java.lang.String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return getPersistence()
				   .fetchByCTDETAILS_ID_First(cholatalkiesdetaild_id,
			orderByComparator);
	}

	/**
	* Returns the last cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkiespath
	* @throws NoSuchcholatalkiespathException if a matching cholatalkiespath could not be found
	*/
	public static cholatalkiespath findByCTDETAILS_ID_Last(
		java.lang.String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws com.exception.NoSuchcholatalkiespathException {
		return getPersistence()
				   .findByCTDETAILS_ID_Last(cholatalkiesdetaild_id,
			orderByComparator);
	}

	/**
	* Returns the last cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkiespath, or <code>null</code> if a matching cholatalkiespath could not be found
	*/
	public static cholatalkiespath fetchByCTDETAILS_ID_Last(
		java.lang.String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return getPersistence()
				   .fetchByCTDETAILS_ID_Last(cholatalkiesdetaild_id,
			orderByComparator);
	}

	/**
	* Returns the cholatalkiespaths before and after the current cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	*
	* @param id the primary key of the current cholatalkiespath
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cholatalkiespath
	* @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	*/
	public static cholatalkiespath[] findByCTDETAILS_ID_PrevAndNext(long id,
		java.lang.String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws com.exception.NoSuchcholatalkiespathException {
		return getPersistence()
				   .findByCTDETAILS_ID_PrevAndNext(id, cholatalkiesdetaild_id,
			orderByComparator);
	}

	/**
	* Removes all the cholatalkiespaths where cholatalkiesdetaild_id = &#63; from the database.
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	*/
	public static void removeByCTDETAILS_ID(
		java.lang.String cholatalkiesdetaild_id) {
		getPersistence().removeByCTDETAILS_ID(cholatalkiesdetaild_id);
	}

	/**
	* Returns the number of cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	* @return the number of matching cholatalkiespaths
	*/
	public static int countByCTDETAILS_ID(
		java.lang.String cholatalkiesdetaild_id) {
		return getPersistence().countByCTDETAILS_ID(cholatalkiesdetaild_id);
	}

	/**
	* Returns all the cholatalkiespaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching cholatalkiespaths
	*/
	public static List<cholatalkiespath> findByCONTENT_ID(long content_id) {
		return getPersistence().findByCONTENT_ID(content_id);
	}

	/**
	* Returns a range of all the cholatalkiespaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @return the range of matching cholatalkiespaths
	*/
	public static List<cholatalkiespath> findByCONTENT_ID(long content_id,
		int start, int end) {
		return getPersistence().findByCONTENT_ID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the cholatalkiespaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cholatalkiespaths
	*/
	public static List<cholatalkiespath> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholatalkiespaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cholatalkiespaths
	*/
	public static List<cholatalkiespath> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENT_ID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first cholatalkiespath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkiespath
	* @throws NoSuchcholatalkiespathException if a matching cholatalkiespath could not be found
	*/
	public static cholatalkiespath findByCONTENT_ID_First(long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws com.exception.NoSuchcholatalkiespathException {
		return getPersistence()
				   .findByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first cholatalkiespath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholatalkiespath, or <code>null</code> if a matching cholatalkiespath could not be found
	*/
	public static cholatalkiespath fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last cholatalkiespath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkiespath
	* @throws NoSuchcholatalkiespathException if a matching cholatalkiespath could not be found
	*/
	public static cholatalkiespath findByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws com.exception.NoSuchcholatalkiespathException {
		return getPersistence()
				   .findByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last cholatalkiespath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholatalkiespath, or <code>null</code> if a matching cholatalkiespath could not be found
	*/
	public static cholatalkiespath fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENT_ID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the cholatalkiespaths before and after the current cholatalkiespath in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current cholatalkiespath
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cholatalkiespath
	* @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	*/
	public static cholatalkiespath[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<cholatalkiespath> orderByComparator)
		throws com.exception.NoSuchcholatalkiespathException {
		return getPersistence()
				   .findByCONTENT_ID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the cholatalkiespaths where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENT_ID(long content_id) {
		getPersistence().removeByCONTENT_ID(content_id);
	}

	/**
	* Returns the number of cholatalkiespaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching cholatalkiespaths
	*/
	public static int countByCONTENT_ID(long content_id) {
		return getPersistence().countByCONTENT_ID(content_id);
	}

	/**
	* Caches the cholatalkiespath in the entity cache if it is enabled.
	*
	* @param cholatalkiespath the cholatalkiespath
	*/
	public static void cacheResult(cholatalkiespath cholatalkiespath) {
		getPersistence().cacheResult(cholatalkiespath);
	}

	/**
	* Caches the cholatalkiespaths in the entity cache if it is enabled.
	*
	* @param cholatalkiespaths the cholatalkiespaths
	*/
	public static void cacheResult(List<cholatalkiespath> cholatalkiespaths) {
		getPersistence().cacheResult(cholatalkiespaths);
	}

	/**
	* Creates a new cholatalkiespath with the primary key. Does not add the cholatalkiespath to the database.
	*
	* @param id the primary key for the new cholatalkiespath
	* @return the new cholatalkiespath
	*/
	public static cholatalkiespath create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the cholatalkiespath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholatalkiespath
	* @return the cholatalkiespath that was removed
	* @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	*/
	public static cholatalkiespath remove(long id)
		throws com.exception.NoSuchcholatalkiespathException {
		return getPersistence().remove(id);
	}

	public static cholatalkiespath updateImpl(cholatalkiespath cholatalkiespath) {
		return getPersistence().updateImpl(cholatalkiespath);
	}

	/**
	* Returns the cholatalkiespath with the primary key or throws a {@link NoSuchcholatalkiespathException} if it could not be found.
	*
	* @param id the primary key of the cholatalkiespath
	* @return the cholatalkiespath
	* @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	*/
	public static cholatalkiespath findByPrimaryKey(long id)
		throws com.exception.NoSuchcholatalkiespathException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the cholatalkiespath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the cholatalkiespath
	* @return the cholatalkiespath, or <code>null</code> if a cholatalkiespath with the primary key could not be found
	*/
	public static cholatalkiespath fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, cholatalkiespath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the cholatalkiespaths.
	*
	* @return the cholatalkiespaths
	*/
	public static List<cholatalkiespath> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cholatalkiespaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @return the range of cholatalkiespaths
	*/
	public static List<cholatalkiespath> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cholatalkiespaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cholatalkiespaths
	*/
	public static List<cholatalkiespath> findAll(int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cholatalkiespaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiespaths
	* @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cholatalkiespaths
	*/
	public static List<cholatalkiespath> findAll(int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the cholatalkiespaths from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cholatalkiespaths.
	*
	* @return the number of cholatalkiespaths
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static cholatalkiespathPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (cholatalkiespathPersistence)PortletBeanLocatorUtil.locate(com.service.ClpSerializer.getServletContextName(),
					cholatalkiespathPersistence.class.getName());

			ReferenceRegistry.registerReference(cholatalkiespathUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static cholatalkiespathPersistence _persistence;
}