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

package com.chola.trainingcalendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.model.trainingcontentuniqueinformation;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the trainingcontentuniqueinformation service. This utility wraps {@link com.chola.trainingcalendar.service.persistence.impl.trainingcontentuniqueinformationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcontentuniqueinformationPersistence
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingcontentuniqueinformationPersistenceImpl
 * @generated
 */
@ProviderType
public class trainingcontentuniqueinformationUtil {
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
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		getPersistence().clearCache(trainingcontentuniqueinformation);
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
	public static List<trainingcontentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<trainingcontentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<trainingcontentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static trainingcontentuniqueinformation update(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		return getPersistence().update(trainingcontentuniqueinformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static trainingcontentuniqueinformation update(
		trainingcontentuniqueinformation trainingcontentuniqueinformation,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(trainingcontentuniqueinformation, serviceContext);
	}

	/**
	* Returns all the trainingcontentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id) {
		return getPersistence().findByCONTENTID(content_id);
	}

	/**
	* Returns a range of all the trainingcontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @return the range of matching trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end) {
		return getPersistence().findByCONTENTID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	*/
	public static trainingcontentuniqueinformation findByCONTENTID_First(
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	*/
	public static trainingcontentuniqueinformation fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	*/
	public static trainingcontentuniqueinformation findByCONTENTID_Last(
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	*/
	public static trainingcontentuniqueinformation fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the trainingcontentuniqueinformations before and after the current trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current trainingcontentuniqueinformation
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public static trainingcontentuniqueinformation[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the trainingcontentuniqueinformations where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENTID(long content_id) {
		getPersistence().removeByCONTENTID(content_id);
	}

	/**
	* Returns the number of trainingcontentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching trainingcontentuniqueinformations
	*/
	public static int countByCONTENTID(long content_id) {
		return getPersistence().countByCONTENTID(content_id);
	}

	/**
	* Returns all the trainingcontentuniqueinformations where training_id = &#63;.
	*
	* @param training_id the training_id
	* @return the matching trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id) {
		return getPersistence().findByTRAININGID(training_id);
	}

	/**
	* Returns a range of all the trainingcontentuniqueinformations where training_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param training_id the training_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @return the range of matching trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end) {
		return getPersistence().findByTRAININGID(training_id, start, end);
	}

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations where training_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param training_id the training_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .findByTRAININGID(training_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations where training_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param training_id the training_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTRAININGID(training_id, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	*/
	public static trainingcontentuniqueinformation findByTRAININGID_First(
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException {
		return getPersistence()
				   .findByTRAININGID_First(training_id, orderByComparator);
	}

	/**
	* Returns the first trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	*/
	public static trainingcontentuniqueinformation fetchByTRAININGID_First(
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByTRAININGID_First(training_id, orderByComparator);
	}

	/**
	* Returns the last trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	*/
	public static trainingcontentuniqueinformation findByTRAININGID_Last(
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException {
		return getPersistence()
				   .findByTRAININGID_Last(training_id, orderByComparator);
	}

	/**
	* Returns the last trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	*/
	public static trainingcontentuniqueinformation fetchByTRAININGID_Last(
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByTRAININGID_Last(training_id, orderByComparator);
	}

	/**
	* Returns the trainingcontentuniqueinformations before and after the current trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param id the primary key of the current trainingcontentuniqueinformation
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public static trainingcontentuniqueinformation[] findByTRAININGID_PrevAndNext(
		long id, long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException {
		return getPersistence()
				   .findByTRAININGID_PrevAndNext(id, training_id,
			orderByComparator);
	}

	/**
	* Removes all the trainingcontentuniqueinformations where training_id = &#63; from the database.
	*
	* @param training_id the training_id
	*/
	public static void removeByTRAININGID(long training_id) {
		getPersistence().removeByTRAININGID(training_id);
	}

	/**
	* Returns the number of trainingcontentuniqueinformations where training_id = &#63;.
	*
	* @param training_id the training_id
	* @return the number of matching trainingcontentuniqueinformations
	*/
	public static int countByTRAININGID(long training_id) {
		return getPersistence().countByTRAININGID(training_id);
	}

	/**
	* Caches the trainingcontentuniqueinformation in the entity cache if it is enabled.
	*
	* @param trainingcontentuniqueinformation the trainingcontentuniqueinformation
	*/
	public static void cacheResult(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		getPersistence().cacheResult(trainingcontentuniqueinformation);
	}

	/**
	* Caches the trainingcontentuniqueinformations in the entity cache if it is enabled.
	*
	* @param trainingcontentuniqueinformations the trainingcontentuniqueinformations
	*/
	public static void cacheResult(
		List<trainingcontentuniqueinformation> trainingcontentuniqueinformations) {
		getPersistence().cacheResult(trainingcontentuniqueinformations);
	}

	/**
	* Creates a new trainingcontentuniqueinformation with the primary key. Does not add the trainingcontentuniqueinformation to the database.
	*
	* @param id the primary key for the new trainingcontentuniqueinformation
	* @return the new trainingcontentuniqueinformation
	*/
	public static trainingcontentuniqueinformation create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the trainingcontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingcontentuniqueinformation
	* @return the trainingcontentuniqueinformation that was removed
	* @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public static trainingcontentuniqueinformation remove(long id)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException {
		return getPersistence().remove(id);
	}

	public static trainingcontentuniqueinformation updateImpl(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		return getPersistence().updateImpl(trainingcontentuniqueinformation);
	}

	/**
	* Returns the trainingcontentuniqueinformation with the primary key or throws a {@link NoSuchtrainingcontentuniqueinformationException} if it could not be found.
	*
	* @param id the primary key of the trainingcontentuniqueinformation
	* @return the trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public static trainingcontentuniqueinformation findByPrimaryKey(long id)
		throws com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the trainingcontentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the trainingcontentuniqueinformation
	* @return the trainingcontentuniqueinformation, or <code>null</code> if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public static trainingcontentuniqueinformation fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, trainingcontentuniqueinformation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the trainingcontentuniqueinformations.
	*
	* @return the trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the trainingcontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @return the range of trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findAll(int start,
		int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingcontentuniqueinformations
	*/
	public static List<trainingcontentuniqueinformation> findAll(int start,
		int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the trainingcontentuniqueinformations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of trainingcontentuniqueinformations.
	*
	* @return the number of trainingcontentuniqueinformations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static trainingcontentuniqueinformationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (trainingcontentuniqueinformationPersistence)PortletBeanLocatorUtil.locate(com.chola.trainingcalendar.service.ClpSerializer.getServletContextName(),
					trainingcontentuniqueinformationPersistence.class.getName());

			ReferenceRegistry.registerReference(trainingcontentuniqueinformationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static trainingcontentuniqueinformationPersistence _persistence;
}