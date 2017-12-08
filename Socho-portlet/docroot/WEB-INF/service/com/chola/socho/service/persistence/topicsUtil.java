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

package com.chola.socho.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.socho.model.topics;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the topics service. This utility wraps {@link com.chola.socho.service.persistence.impl.topicsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see topicsPersistence
 * @see com.chola.socho.service.persistence.impl.topicsPersistenceImpl
 * @generated
 */
@ProviderType
public class topicsUtil {
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
	public static void clearCache(topics topics) {
		getPersistence().clearCache(topics);
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
	public static List<topics> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<topics> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<topics> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<topics> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static topics update(topics topics) {
		return getPersistence().update(topics);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static topics update(topics topics, ServiceContext serviceContext) {
		return getPersistence().update(topics, serviceContext);
	}

	/**
	* Returns all the topicses where topicName = &#63;.
	*
	* @param topicName the topic name
	* @return the matching topicses
	*/
	public static List<topics> findByTOPICS_DATA(java.lang.String topicName) {
		return getPersistence().findByTOPICS_DATA(topicName);
	}

	/**
	* Returns a range of all the topicses where topicName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topicName the topic name
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @return the range of matching topicses
	*/
	public static List<topics> findByTOPICS_DATA(java.lang.String topicName,
		int start, int end) {
		return getPersistence().findByTOPICS_DATA(topicName, start, end);
	}

	/**
	* Returns an ordered range of all the topicses where topicName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topicName the topic name
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching topicses
	*/
	public static List<topics> findByTOPICS_DATA(java.lang.String topicName,
		int start, int end, OrderByComparator<topics> orderByComparator) {
		return getPersistence()
				   .findByTOPICS_DATA(topicName, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the topicses where topicName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topicName the topic name
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching topicses
	*/
	public static List<topics> findByTOPICS_DATA(java.lang.String topicName,
		int start, int end, OrderByComparator<topics> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTOPICS_DATA(topicName, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first topics in the ordered set where topicName = &#63;.
	*
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching topics
	* @throws NoSuchtopicsException if a matching topics could not be found
	*/
	public static topics findByTOPICS_DATA_First(java.lang.String topicName,
		OrderByComparator<topics> orderByComparator)
		throws com.chola.socho.exception.NoSuchtopicsException {
		return getPersistence()
				   .findByTOPICS_DATA_First(topicName, orderByComparator);
	}

	/**
	* Returns the first topics in the ordered set where topicName = &#63;.
	*
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching topics, or <code>null</code> if a matching topics could not be found
	*/
	public static topics fetchByTOPICS_DATA_First(java.lang.String topicName,
		OrderByComparator<topics> orderByComparator) {
		return getPersistence()
				   .fetchByTOPICS_DATA_First(topicName, orderByComparator);
	}

	/**
	* Returns the last topics in the ordered set where topicName = &#63;.
	*
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching topics
	* @throws NoSuchtopicsException if a matching topics could not be found
	*/
	public static topics findByTOPICS_DATA_Last(java.lang.String topicName,
		OrderByComparator<topics> orderByComparator)
		throws com.chola.socho.exception.NoSuchtopicsException {
		return getPersistence()
				   .findByTOPICS_DATA_Last(topicName, orderByComparator);
	}

	/**
	* Returns the last topics in the ordered set where topicName = &#63;.
	*
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching topics, or <code>null</code> if a matching topics could not be found
	*/
	public static topics fetchByTOPICS_DATA_Last(java.lang.String topicName,
		OrderByComparator<topics> orderByComparator) {
		return getPersistence()
				   .fetchByTOPICS_DATA_Last(topicName, orderByComparator);
	}

	/**
	* Returns the topicses before and after the current topics in the ordered set where topicName = &#63;.
	*
	* @param id the primary key of the current topics
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next topics
	* @throws NoSuchtopicsException if a topics with the primary key could not be found
	*/
	public static topics[] findByTOPICS_DATA_PrevAndNext(long id,
		java.lang.String topicName, OrderByComparator<topics> orderByComparator)
		throws com.chola.socho.exception.NoSuchtopicsException {
		return getPersistence()
				   .findByTOPICS_DATA_PrevAndNext(id, topicName,
			orderByComparator);
	}

	/**
	* Removes all the topicses where topicName = &#63; from the database.
	*
	* @param topicName the topic name
	*/
	public static void removeByTOPICS_DATA(java.lang.String topicName) {
		getPersistence().removeByTOPICS_DATA(topicName);
	}

	/**
	* Returns the number of topicses where topicName = &#63;.
	*
	* @param topicName the topic name
	* @return the number of matching topicses
	*/
	public static int countByTOPICS_DATA(java.lang.String topicName) {
		return getPersistence().countByTOPICS_DATA(topicName);
	}

	/**
	* Caches the topics in the entity cache if it is enabled.
	*
	* @param topics the topics
	*/
	public static void cacheResult(topics topics) {
		getPersistence().cacheResult(topics);
	}

	/**
	* Caches the topicses in the entity cache if it is enabled.
	*
	* @param topicses the topicses
	*/
	public static void cacheResult(List<topics> topicses) {
		getPersistence().cacheResult(topicses);
	}

	/**
	* Creates a new topics with the primary key. Does not add the topics to the database.
	*
	* @param id the primary key for the new topics
	* @return the new topics
	*/
	public static topics create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the topics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the topics
	* @return the topics that was removed
	* @throws NoSuchtopicsException if a topics with the primary key could not be found
	*/
	public static topics remove(long id)
		throws com.chola.socho.exception.NoSuchtopicsException {
		return getPersistence().remove(id);
	}

	public static topics updateImpl(topics topics) {
		return getPersistence().updateImpl(topics);
	}

	/**
	* Returns the topics with the primary key or throws a {@link NoSuchtopicsException} if it could not be found.
	*
	* @param id the primary key of the topics
	* @return the topics
	* @throws NoSuchtopicsException if a topics with the primary key could not be found
	*/
	public static topics findByPrimaryKey(long id)
		throws com.chola.socho.exception.NoSuchtopicsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the topics with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the topics
	* @return the topics, or <code>null</code> if a topics with the primary key could not be found
	*/
	public static topics fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, topics> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the topicses.
	*
	* @return the topicses
	*/
	public static List<topics> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the topicses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @return the range of topicses
	*/
	public static List<topics> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the topicses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of topicses
	*/
	public static List<topics> findAll(int start, int end,
		OrderByComparator<topics> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the topicses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of topicses
	*/
	public static List<topics> findAll(int start, int end,
		OrderByComparator<topics> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the topicses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of topicses.
	*
	* @return the number of topicses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static topicsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (topicsPersistence)PortletBeanLocatorUtil.locate(com.chola.socho.service.ClpSerializer.getServletContextName(),
					topicsPersistence.class.getName());

			ReferenceRegistry.registerReference(topicsUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static topicsPersistence _persistence;
}