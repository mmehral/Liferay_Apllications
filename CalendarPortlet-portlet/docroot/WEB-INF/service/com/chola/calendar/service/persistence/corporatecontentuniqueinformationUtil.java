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

package com.chola.calendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.model.corporatecontentuniqueinformation;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the corporatecontentuniqueinformation service. This utility wraps {@link com.chola.calendar.service.persistence.impl.corporatecontentuniqueinformationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see corporatecontentuniqueinformationPersistence
 * @see com.chola.calendar.service.persistence.impl.corporatecontentuniqueinformationPersistenceImpl
 * @generated
 */
@ProviderType
public class corporatecontentuniqueinformationUtil {
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
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		getPersistence().clearCache(corporatecontentuniqueinformation);
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
	public static List<corporatecontentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<corporatecontentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<corporatecontentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static corporatecontentuniqueinformation update(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		return getPersistence().update(corporatecontentuniqueinformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static corporatecontentuniqueinformation update(
		corporatecontentuniqueinformation corporatecontentuniqueinformation,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(corporatecontentuniqueinformation, serviceContext);
	}

	/**
	* Returns all the corporatecontentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id) {
		return getPersistence().findByCONTENTID(content_id);
	}

	/**
	* Returns a range of all the corporatecontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @return the range of matching corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end) {
		return getPersistence().findByCONTENTID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	*/
	public static corporatecontentuniqueinformation findByCONTENTID_First(
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	*/
	public static corporatecontentuniqueinformation fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	*/
	public static corporatecontentuniqueinformation findByCONTENTID_Last(
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	*/
	public static corporatecontentuniqueinformation fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the corporatecontentuniqueinformations before and after the current corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current corporatecontentuniqueinformation
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public static corporatecontentuniqueinformation[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the corporatecontentuniqueinformations where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENTID(long content_id) {
		getPersistence().removeByCONTENTID(content_id);
	}

	/**
	* Returns the number of corporatecontentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching corporatecontentuniqueinformations
	*/
	public static int countByCONTENTID(long content_id) {
		return getPersistence().countByCONTENTID(content_id);
	}

	/**
	* Returns all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @return the matching corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id) {
		return getPersistence().findByCORPORATEEVENTID(corporatevent_id);
	}

	/**
	* Returns a range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporatevent_id the corporatevent_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @return the range of matching corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end) {
		return getPersistence()
				   .findByCORPORATEEVENTID(corporatevent_id, start, end);
	}

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporatevent_id the corporatevent_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .findByCORPORATEEVENTID(corporatevent_id, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporatevent_id the corporatevent_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCORPORATEEVENTID(corporatevent_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	*/
	public static corporatecontentuniqueinformation findByCORPORATEEVENTID_First(
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException {
		return getPersistence()
				   .findByCORPORATEEVENTID_First(corporatevent_id,
			orderByComparator);
	}

	/**
	* Returns the first corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	*/
	public static corporatecontentuniqueinformation fetchByCORPORATEEVENTID_First(
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByCORPORATEEVENTID_First(corporatevent_id,
			orderByComparator);
	}

	/**
	* Returns the last corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	*/
	public static corporatecontentuniqueinformation findByCORPORATEEVENTID_Last(
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException {
		return getPersistence()
				   .findByCORPORATEEVENTID_Last(corporatevent_id,
			orderByComparator);
	}

	/**
	* Returns the last corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	*/
	public static corporatecontentuniqueinformation fetchByCORPORATEEVENTID_Last(
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByCORPORATEEVENTID_Last(corporatevent_id,
			orderByComparator);
	}

	/**
	* Returns the corporatecontentuniqueinformations before and after the current corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param id the primary key of the current corporatecontentuniqueinformation
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public static corporatecontentuniqueinformation[] findByCORPORATEEVENTID_PrevAndNext(
		long id, long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException {
		return getPersistence()
				   .findByCORPORATEEVENTID_PrevAndNext(id, corporatevent_id,
			orderByComparator);
	}

	/**
	* Removes all the corporatecontentuniqueinformations where corporatevent_id = &#63; from the database.
	*
	* @param corporatevent_id the corporatevent_id
	*/
	public static void removeByCORPORATEEVENTID(long corporatevent_id) {
		getPersistence().removeByCORPORATEEVENTID(corporatevent_id);
	}

	/**
	* Returns the number of corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @return the number of matching corporatecontentuniqueinformations
	*/
	public static int countByCORPORATEEVENTID(long corporatevent_id) {
		return getPersistence().countByCORPORATEEVENTID(corporatevent_id);
	}

	/**
	* Caches the corporatecontentuniqueinformation in the entity cache if it is enabled.
	*
	* @param corporatecontentuniqueinformation the corporatecontentuniqueinformation
	*/
	public static void cacheResult(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		getPersistence().cacheResult(corporatecontentuniqueinformation);
	}

	/**
	* Caches the corporatecontentuniqueinformations in the entity cache if it is enabled.
	*
	* @param corporatecontentuniqueinformations the corporatecontentuniqueinformations
	*/
	public static void cacheResult(
		List<corporatecontentuniqueinformation> corporatecontentuniqueinformations) {
		getPersistence().cacheResult(corporatecontentuniqueinformations);
	}

	/**
	* Creates a new corporatecontentuniqueinformation with the primary key. Does not add the corporatecontentuniqueinformation to the database.
	*
	* @param id the primary key for the new corporatecontentuniqueinformation
	* @return the new corporatecontentuniqueinformation
	*/
	public static corporatecontentuniqueinformation create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the corporatecontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation that was removed
	* @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public static corporatecontentuniqueinformation remove(long id)
		throws com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException {
		return getPersistence().remove(id);
	}

	public static corporatecontentuniqueinformation updateImpl(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		return getPersistence().updateImpl(corporatecontentuniqueinformation);
	}

	/**
	* Returns the corporatecontentuniqueinformation with the primary key or throws a {@link NoSuchcorporatecontentuniqueinformationException} if it could not be found.
	*
	* @param id the primary key of the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public static corporatecontentuniqueinformation findByPrimaryKey(long id)
		throws com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the corporatecontentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation, or <code>null</code> if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public static corporatecontentuniqueinformation fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, corporatecontentuniqueinformation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the corporatecontentuniqueinformations.
	*
	* @return the corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the corporatecontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @return the range of corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findAll(int start,
		int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of corporatecontentuniqueinformations
	*/
	public static List<corporatecontentuniqueinformation> findAll(int start,
		int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the corporatecontentuniqueinformations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of corporatecontentuniqueinformations.
	*
	* @return the number of corporatecontentuniqueinformations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static corporatecontentuniqueinformationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (corporatecontentuniqueinformationPersistence)PortletBeanLocatorUtil.locate(com.chola.calendar.service.ClpSerializer.getServletContextName(),
					corporatecontentuniqueinformationPersistence.class.getName());

			ReferenceRegistry.registerReference(corporatecontentuniqueinformationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static corporatecontentuniqueinformationPersistence _persistence;
}