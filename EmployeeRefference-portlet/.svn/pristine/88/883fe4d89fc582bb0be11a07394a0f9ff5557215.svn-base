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

package com.chola.EmployeeRef.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.EmployeeRef.exception.NoSuchEmployeeRefrenceException;
import com.chola.EmployeeRef.model.EmployeeRefrence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee refrence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see com.chola.EmployeeRef.service.persistence.impl.EmployeeRefrencePersistenceImpl
 * @see EmployeeRefrenceUtil
 * @generated
 */
@ProviderType
public interface EmployeeRefrencePersistence extends BasePersistence<EmployeeRefrence> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployeeRefrenceUtil} to access the employee refrence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the employee refrence in the entity cache if it is enabled.
	*
	* @param employeeRefrence the employee refrence
	*/
	public void cacheResult(EmployeeRefrence employeeRefrence);

	/**
	* Caches the employee refrences in the entity cache if it is enabled.
	*
	* @param employeeRefrences the employee refrences
	*/
	public void cacheResult(java.util.List<EmployeeRefrence> employeeRefrences);

	/**
	* Creates a new employee refrence with the primary key. Does not add the employee refrence to the database.
	*
	* @param refId the primary key for the new employee refrence
	* @return the new employee refrence
	*/
	public EmployeeRefrence create(long refId);

	/**
	* Removes the employee refrence with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param refId the primary key of the employee refrence
	* @return the employee refrence that was removed
	* @throws NoSuchEmployeeRefrenceException if a employee refrence with the primary key could not be found
	*/
	public EmployeeRefrence remove(long refId)
		throws NoSuchEmployeeRefrenceException;

	public EmployeeRefrence updateImpl(EmployeeRefrence employeeRefrence);

	/**
	* Returns the employee refrence with the primary key or throws a {@link NoSuchEmployeeRefrenceException} if it could not be found.
	*
	* @param refId the primary key of the employee refrence
	* @return the employee refrence
	* @throws NoSuchEmployeeRefrenceException if a employee refrence with the primary key could not be found
	*/
	public EmployeeRefrence findByPrimaryKey(long refId)
		throws NoSuchEmployeeRefrenceException;

	/**
	* Returns the employee refrence with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param refId the primary key of the employee refrence
	* @return the employee refrence, or <code>null</code> if a employee refrence with the primary key could not be found
	*/
	public EmployeeRefrence fetchByPrimaryKey(long refId);

	@Override
	public java.util.Map<java.io.Serializable, EmployeeRefrence> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the employee refrences.
	*
	* @return the employee refrences
	*/
	public java.util.List<EmployeeRefrence> findAll();

	/**
	* Returns a range of all the employee refrences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee refrences
	* @param end the upper bound of the range of employee refrences (not inclusive)
	* @return the range of employee refrences
	*/
	public java.util.List<EmployeeRefrence> findAll(int start, int end);

	/**
	* Returns an ordered range of all the employee refrences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee refrences
	* @param end the upper bound of the range of employee refrences (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of employee refrences
	*/
	public java.util.List<EmployeeRefrence> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeRefrence> orderByComparator);

	/**
	* Returns an ordered range of all the employee refrences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee refrences
	* @param end the upper bound of the range of employee refrences (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of employee refrences
	*/
	public java.util.List<EmployeeRefrence> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmployeeRefrence> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the employee refrences from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of employee refrences.
	*
	* @return the number of employee refrences
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}