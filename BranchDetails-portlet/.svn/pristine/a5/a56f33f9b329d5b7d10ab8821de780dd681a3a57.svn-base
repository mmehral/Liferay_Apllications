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

import com.branchdetails.exception.NoSuchstateException;

import com.branchdetails.model.state;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.branchdetails.service.persistence.impl.statePersistenceImpl
 * @see stateUtil
 * @generated
 */
@ProviderType
public interface statePersistence extends BasePersistence<state> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link stateUtil} to access the state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the state in the entity cache if it is enabled.
	*
	* @param state the state
	*/
	public void cacheResult(state state);

	/**
	* Caches the states in the entity cache if it is enabled.
	*
	* @param states the states
	*/
	public void cacheResult(java.util.List<state> states);

	/**
	* Creates a new state with the primary key. Does not add the state to the database.
	*
	* @param state_id the primary key for the new state
	* @return the new state
	*/
	public state create(long state_id);

	/**
	* Removes the state with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param state_id the primary key of the state
	* @return the state that was removed
	* @throws NoSuchstateException if a state with the primary key could not be found
	*/
	public state remove(long state_id) throws NoSuchstateException;

	public state updateImpl(state state);

	/**
	* Returns the state with the primary key or throws a {@link NoSuchstateException} if it could not be found.
	*
	* @param state_id the primary key of the state
	* @return the state
	* @throws NoSuchstateException if a state with the primary key could not be found
	*/
	public state findByPrimaryKey(long state_id) throws NoSuchstateException;

	/**
	* Returns the state with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param state_id the primary key of the state
	* @return the state, or <code>null</code> if a state with the primary key could not be found
	*/
	public state fetchByPrimaryKey(long state_id);

	@Override
	public java.util.Map<java.io.Serializable, state> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the states.
	*
	* @return the states
	*/
	public java.util.List<state> findAll();

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
	public java.util.List<state> findAll(int start, int end);

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
	public java.util.List<state> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<state> orderByComparator);

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
	public java.util.List<state> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<state> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the states from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of states.
	*
	* @return the number of states
	*/
	public int countAll();
}