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

package com.chola.ppcontent.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.ppcontent.model.contentuniqueinformation;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the contentuniqueinformation service. This utility wraps {@link com.chola.ppcontent.service.persistence.impl.contentuniqueinformationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see contentuniqueinformationPersistence
 * @see com.chola.ppcontent.service.persistence.impl.contentuniqueinformationPersistenceImpl
 * @generated
 */
@ProviderType
public class contentuniqueinformationUtil {
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
		contentuniqueinformation contentuniqueinformation) {
		getPersistence().clearCache(contentuniqueinformation);
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
	public static List<contentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<contentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<contentuniqueinformation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static contentuniqueinformation update(
		contentuniqueinformation contentuniqueinformation) {
		return getPersistence().update(contentuniqueinformation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static contentuniqueinformation update(
		contentuniqueinformation contentuniqueinformation,
		ServiceContext serviceContext) {
		return getPersistence().update(contentuniqueinformation, serviceContext);
	}

	/**
	* Returns all the contentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching contentuniqueinformations
	*/
	public static List<contentuniqueinformation> findByCONTENTID(
		long content_id) {
		return getPersistence().findByCONTENTID(content_id);
	}

	/**
	* Returns a range of all the contentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @return the range of matching contentuniqueinformations
	*/
	public static List<contentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end) {
		return getPersistence().findByCONTENTID(content_id, start, end);
	}

	/**
	* Returns an ordered range of all the contentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contentuniqueinformations
	*/
	public static List<contentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contentuniqueinformations
	*/
	public static List<contentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCONTENTID(content_id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contentuniqueinformation
	* @throws NoSuchcontentuniqueinformationException if a matching contentuniqueinformation could not be found
	*/
	public static contentuniqueinformation findByCONTENTID_First(
		long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator)
		throws com.chola.ppcontent.exception.NoSuchcontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the first contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contentuniqueinformation, or <code>null</code> if a matching contentuniqueinformation could not be found
	*/
	public static contentuniqueinformation fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_First(content_id, orderByComparator);
	}

	/**
	* Returns the last contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contentuniqueinformation
	* @throws NoSuchcontentuniqueinformationException if a matching contentuniqueinformation could not be found
	*/
	public static contentuniqueinformation findByCONTENTID_Last(
		long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator)
		throws com.chola.ppcontent.exception.NoSuchcontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the last contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contentuniqueinformation, or <code>null</code> if a matching contentuniqueinformation could not be found
	*/
	public static contentuniqueinformation fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		return getPersistence()
				   .fetchByCONTENTID_Last(content_id, orderByComparator);
	}

	/**
	* Returns the contentuniqueinformations before and after the current contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current contentuniqueinformation
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contentuniqueinformation
	* @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	*/
	public static contentuniqueinformation[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator)
		throws com.chola.ppcontent.exception.NoSuchcontentuniqueinformationException {
		return getPersistence()
				   .findByCONTENTID_PrevAndNext(id, content_id,
			orderByComparator);
	}

	/**
	* Removes all the contentuniqueinformations where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public static void removeByCONTENTID(long content_id) {
		getPersistence().removeByCONTENTID(content_id);
	}

	/**
	* Returns the number of contentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching contentuniqueinformations
	*/
	public static int countByCONTENTID(long content_id) {
		return getPersistence().countByCONTENTID(content_id);
	}

	/**
	* Caches the contentuniqueinformation in the entity cache if it is enabled.
	*
	* @param contentuniqueinformation the contentuniqueinformation
	*/
	public static void cacheResult(
		contentuniqueinformation contentuniqueinformation) {
		getPersistence().cacheResult(contentuniqueinformation);
	}

	/**
	* Caches the contentuniqueinformations in the entity cache if it is enabled.
	*
	* @param contentuniqueinformations the contentuniqueinformations
	*/
	public static void cacheResult(
		List<contentuniqueinformation> contentuniqueinformations) {
		getPersistence().cacheResult(contentuniqueinformations);
	}

	/**
	* Creates a new contentuniqueinformation with the primary key. Does not add the contentuniqueinformation to the database.
	*
	* @param id the primary key for the new contentuniqueinformation
	* @return the new contentuniqueinformation
	*/
	public static contentuniqueinformation create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the contentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation that was removed
	* @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	*/
	public static contentuniqueinformation remove(long id)
		throws com.chola.ppcontent.exception.NoSuchcontentuniqueinformationException {
		return getPersistence().remove(id);
	}

	public static contentuniqueinformation updateImpl(
		contentuniqueinformation contentuniqueinformation) {
		return getPersistence().updateImpl(contentuniqueinformation);
	}

	/**
	* Returns the contentuniqueinformation with the primary key or throws a {@link NoSuchcontentuniqueinformationException} if it could not be found.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation
	* @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	*/
	public static contentuniqueinformation findByPrimaryKey(long id)
		throws com.chola.ppcontent.exception.NoSuchcontentuniqueinformationException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the contentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation, or <code>null</code> if a contentuniqueinformation with the primary key could not be found
	*/
	public static contentuniqueinformation fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, contentuniqueinformation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the contentuniqueinformations.
	*
	* @return the contentuniqueinformations
	*/
	public static List<contentuniqueinformation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the contentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @return the range of contentuniqueinformations
	*/
	public static List<contentuniqueinformation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the contentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contentuniqueinformations
	*/
	public static List<contentuniqueinformation> findAll(int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contentuniqueinformations
	*/
	public static List<contentuniqueinformation> findAll(int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the contentuniqueinformations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of contentuniqueinformations.
	*
	* @return the number of contentuniqueinformations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static contentuniqueinformationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (contentuniqueinformationPersistence)PortletBeanLocatorUtil.locate(com.chola.ppcontent.service.ClpSerializer.getServletContextName(),
					contentuniqueinformationPersistence.class.getName());

			ReferenceRegistry.registerReference(contentuniqueinformationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static contentuniqueinformationPersistence _persistence;
}