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

package com.branchdetails.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.branchdetails.model.state;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the state service. This utility wraps {@link com.branchdetails.service.persistence.impl.statePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see statePersistence
 * @see com.branchdetails.service.persistence.impl.statePersistenceImpl
 * @generated
 */
@ProviderType
public class stateUtil {
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
	public static void clearCache(state state) {
		getPersistence().clearCache(state);
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
	public static List<state> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<state> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<state> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<state> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static state update(state state) {
		return getPersistence().update(state);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static state update(state state, ServiceContext serviceContext) {
		return getPersistence().update(state, serviceContext);
	}

	/**
	* Caches the state in the entity cache if it is enabled.
	*
	* @param state the state
	*/
	public static void cacheResult(state state) {
		getPersistence().cacheResult(state);
	}

	/**
	* Caches the states in the entity cache if it is enabled.
	*
	* @param states the states
	*/
	public static void cacheResult(List<state> states) {
		getPersistence().cacheResult(states);
	}

	/**
	* Creates a new state with the primary key. Does not add the state to the database.
	*
	* @param state_id the primary key for the new state
	* @return the new state
	*/
	public static state create(long state_id) {
		return getPersistence().create(state_id);
	}

	/**
	* Removes the state with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param state_id the primary key of the state
	* @return the state that was removed
	* @throws NoSuchstateException if a state with the primary key could not be found
	*/
	public static state remove(long state_id)
		throws com.branchdetails.exception.NoSuchstateException {
		return getPersistence().remove(state_id);
	}

	public static state updateImpl(state state) {
		return getPersistence().updateImpl(state);
	}

	/**
	* Returns the state with the primary key or throws a {@link NoSuchstateException} if it could not be found.
	*
	* @param state_id the primary key of the state
	* @return the state
	* @throws NoSuchstateException if a state with the primary key could not be found
	*/
	public static state findByPrimaryKey(long state_id)
		throws com.branchdetails.exception.NoSuchstateException {
		return getPersistence().findByPrimaryKey(state_id);
	}

	/**
	* Returns the state with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param state_id the primary key of the state
	* @return the state, or <code>null</code> if a state with the primary key could not be found
	*/
	public static state fetchByPrimaryKey(long state_id) {
		return getPersistence().fetchByPrimaryKey(state_id);
	}

	public static java.util.Map<java.io.Serializable, state> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the states.
	*
	* @return the states
	*/
	public static List<state> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link stateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of states
	* @param end the upper bound of the range of states (not inclusive)
	* @return the range of states
	*/
	public static List<state> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link stateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of states
	* @param end the upper bound of the range of states (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of states
	*/
	public static List<state> findAll(int start, int end,
		OrderByComparator<state> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the states.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link stateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of states
	* @param end the upper bound of the range of states (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of states
	*/
	public static List<state> findAll(int start, int end,
		OrderByComparator<state> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the states from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of states.
	*
	* @return the number of states
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static statePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (statePersistence)PortletBeanLocatorUtil.locate(com.branchdetails.service.ClpSerializer.getServletContextName(),
					statePersistence.class.getName());

			ReferenceRegistry.registerReference(stateUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static statePersistence _persistence;
}