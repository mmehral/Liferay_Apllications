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

import com.chola.socho.model.idea;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the idea service. This utility wraps {@link com.chola.socho.service.persistence.impl.ideaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see ideaPersistence
 * @see com.chola.socho.service.persistence.impl.ideaPersistenceImpl
 * @generated
 */
@ProviderType
public class ideaUtil {
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
	public static void clearCache(idea idea) {
		getPersistence().clearCache(idea);
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
	public static List<idea> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<idea> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<idea> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<idea> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static idea update(idea idea) {
		return getPersistence().update(idea);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static idea update(idea idea, ServiceContext serviceContext) {
		return getPersistence().update(idea, serviceContext);
	}

	/**
	* Returns all the ideas where topic = &#63;.
	*
	* @param topic the topic
	* @return the matching ideas
	*/
	public static List<idea> findByTOPICS_ID(java.lang.String topic) {
		return getPersistence().findByTOPICS_ID(topic);
	}

	/**
	* Returns a range of all the ideas where topic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topic the topic
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @return the range of matching ideas
	*/
	public static List<idea> findByTOPICS_ID(java.lang.String topic, int start,
		int end) {
		return getPersistence().findByTOPICS_ID(topic, start, end);
	}

	/**
	* Returns an ordered range of all the ideas where topic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topic the topic
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ideas
	*/
	public static List<idea> findByTOPICS_ID(java.lang.String topic, int start,
		int end, OrderByComparator<idea> orderByComparator) {
		return getPersistence()
				   .findByTOPICS_ID(topic, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ideas where topic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topic the topic
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ideas
	*/
	public static List<idea> findByTOPICS_ID(java.lang.String topic, int start,
		int end, OrderByComparator<idea> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTOPICS_ID(topic, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first idea in the ordered set where topic = &#63;.
	*
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching idea
	* @throws NoSuchideaException if a matching idea could not be found
	*/
	public static idea findByTOPICS_ID_First(java.lang.String topic,
		OrderByComparator<idea> orderByComparator)
		throws com.chola.socho.exception.NoSuchideaException {
		return getPersistence().findByTOPICS_ID_First(topic, orderByComparator);
	}

	/**
	* Returns the first idea in the ordered set where topic = &#63;.
	*
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching idea, or <code>null</code> if a matching idea could not be found
	*/
	public static idea fetchByTOPICS_ID_First(java.lang.String topic,
		OrderByComparator<idea> orderByComparator) {
		return getPersistence().fetchByTOPICS_ID_First(topic, orderByComparator);
	}

	/**
	* Returns the last idea in the ordered set where topic = &#63;.
	*
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching idea
	* @throws NoSuchideaException if a matching idea could not be found
	*/
	public static idea findByTOPICS_ID_Last(java.lang.String topic,
		OrderByComparator<idea> orderByComparator)
		throws com.chola.socho.exception.NoSuchideaException {
		return getPersistence().findByTOPICS_ID_Last(topic, orderByComparator);
	}

	/**
	* Returns the last idea in the ordered set where topic = &#63;.
	*
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching idea, or <code>null</code> if a matching idea could not be found
	*/
	public static idea fetchByTOPICS_ID_Last(java.lang.String topic,
		OrderByComparator<idea> orderByComparator) {
		return getPersistence().fetchByTOPICS_ID_Last(topic, orderByComparator);
	}

	/**
	* Returns the ideas before and after the current idea in the ordered set where topic = &#63;.
	*
	* @param id the primary key of the current idea
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next idea
	* @throws NoSuchideaException if a idea with the primary key could not be found
	*/
	public static idea[] findByTOPICS_ID_PrevAndNext(long id,
		java.lang.String topic, OrderByComparator<idea> orderByComparator)
		throws com.chola.socho.exception.NoSuchideaException {
		return getPersistence()
				   .findByTOPICS_ID_PrevAndNext(id, topic, orderByComparator);
	}

	/**
	* Removes all the ideas where topic = &#63; from the database.
	*
	* @param topic the topic
	*/
	public static void removeByTOPICS_ID(java.lang.String topic) {
		getPersistence().removeByTOPICS_ID(topic);
	}

	/**
	* Returns the number of ideas where topic = &#63;.
	*
	* @param topic the topic
	* @return the number of matching ideas
	*/
	public static int countByTOPICS_ID(java.lang.String topic) {
		return getPersistence().countByTOPICS_ID(topic);
	}

	/**
	* Caches the idea in the entity cache if it is enabled.
	*
	* @param idea the idea
	*/
	public static void cacheResult(idea idea) {
		getPersistence().cacheResult(idea);
	}

	/**
	* Caches the ideas in the entity cache if it is enabled.
	*
	* @param ideas the ideas
	*/
	public static void cacheResult(List<idea> ideas) {
		getPersistence().cacheResult(ideas);
	}

	/**
	* Creates a new idea with the primary key. Does not add the idea to the database.
	*
	* @param id the primary key for the new idea
	* @return the new idea
	*/
	public static idea create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the idea with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the idea
	* @return the idea that was removed
	* @throws NoSuchideaException if a idea with the primary key could not be found
	*/
	public static idea remove(long id)
		throws com.chola.socho.exception.NoSuchideaException {
		return getPersistence().remove(id);
	}

	public static idea updateImpl(idea idea) {
		return getPersistence().updateImpl(idea);
	}

	/**
	* Returns the idea with the primary key or throws a {@link NoSuchideaException} if it could not be found.
	*
	* @param id the primary key of the idea
	* @return the idea
	* @throws NoSuchideaException if a idea with the primary key could not be found
	*/
	public static idea findByPrimaryKey(long id)
		throws com.chola.socho.exception.NoSuchideaException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the idea with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the idea
	* @return the idea, or <code>null</code> if a idea with the primary key could not be found
	*/
	public static idea fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, idea> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ideas.
	*
	* @return the ideas
	*/
	public static List<idea> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @return the range of ideas
	*/
	public static List<idea> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ideas
	*/
	public static List<idea> findAll(int start, int end,
		OrderByComparator<idea> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ideas
	*/
	public static List<idea> findAll(int start, int end,
		OrderByComparator<idea> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ideas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ideas.
	*
	* @return the number of ideas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ideaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ideaPersistence)PortletBeanLocatorUtil.locate(com.chola.socho.service.ClpSerializer.getServletContextName(),
					ideaPersistence.class.getName());

			ReferenceRegistry.registerReference(ideaUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static ideaPersistence _persistence;
}