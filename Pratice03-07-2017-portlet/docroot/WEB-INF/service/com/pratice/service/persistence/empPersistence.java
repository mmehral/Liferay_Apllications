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

package com.pratice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.pratice.exception.NoSuchempException;

import com.pratice.model.emp;

/**
 * The persistence interface for the emp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.pratice.service.persistence.impl.empPersistenceImpl
 * @see empUtil
 * @generated
 */
@ProviderType
public interface empPersistence extends BasePersistence<emp> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link empUtil} to access the emp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the emps where empName = &#63;.
	*
	* @param empName the emp name
	* @return the matching emps
	*/
	public java.util.List<emp> findByEmpName(java.lang.String empName);

	/**
	* Returns a range of all the emps where empName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empName the emp name
	* @param start the lower bound of the range of emps
	* @param end the upper bound of the range of emps (not inclusive)
	* @return the range of matching emps
	*/
	public java.util.List<emp> findByEmpName(java.lang.String empName,
		int start, int end);

	/**
	* Returns an ordered range of all the emps where empName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empName the emp name
	* @param start the lower bound of the range of emps
	* @param end the upper bound of the range of emps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching emps
	*/
	public java.util.List<emp> findByEmpName(java.lang.String empName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator);

	/**
	* Returns an ordered range of all the emps where empName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empName the emp name
	* @param start the lower bound of the range of emps
	* @param end the upper bound of the range of emps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching emps
	*/
	public java.util.List<emp> findByEmpName(java.lang.String empName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first emp in the ordered set where empName = &#63;.
	*
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp
	* @throws NoSuchempException if a matching emp could not be found
	*/
	public emp findByEmpName_First(java.lang.String empName,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator)
		throws NoSuchempException;

	/**
	* Returns the first emp in the ordered set where empName = &#63;.
	*
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp, or <code>null</code> if a matching emp could not be found
	*/
	public emp fetchByEmpName_First(java.lang.String empName,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator);

	/**
	* Returns the last emp in the ordered set where empName = &#63;.
	*
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp
	* @throws NoSuchempException if a matching emp could not be found
	*/
	public emp findByEmpName_Last(java.lang.String empName,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator)
		throws NoSuchempException;

	/**
	* Returns the last emp in the ordered set where empName = &#63;.
	*
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp, or <code>null</code> if a matching emp could not be found
	*/
	public emp fetchByEmpName_Last(java.lang.String empName,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator);

	/**
	* Returns the emps before and after the current emp in the ordered set where empName = &#63;.
	*
	* @param empId the primary key of the current emp
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emp
	* @throws NoSuchempException if a emp with the primary key could not be found
	*/
	public emp[] findByEmpName_PrevAndNext(long empId,
		java.lang.String empName,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator)
		throws NoSuchempException;

	/**
	* Removes all the emps where empName = &#63; from the database.
	*
	* @param empName the emp name
	*/
	public void removeByEmpName(java.lang.String empName);

	/**
	* Returns the number of emps where empName = &#63;.
	*
	* @param empName the emp name
	* @return the number of matching emps
	*/
	public int countByEmpName(java.lang.String empName);

	/**
	* Caches the emp in the entity cache if it is enabled.
	*
	* @param emp the emp
	*/
	public void cacheResult(emp emp);

	/**
	* Caches the emps in the entity cache if it is enabled.
	*
	* @param emps the emps
	*/
	public void cacheResult(java.util.List<emp> emps);

	/**
	* Creates a new emp with the primary key. Does not add the emp to the database.
	*
	* @param empId the primary key for the new emp
	* @return the new emp
	*/
	public emp create(long empId);

	/**
	* Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empId the primary key of the emp
	* @return the emp that was removed
	* @throws NoSuchempException if a emp with the primary key could not be found
	*/
	public emp remove(long empId) throws NoSuchempException;

	public emp updateImpl(emp emp);

	/**
	* Returns the emp with the primary key or throws a {@link NoSuchempException} if it could not be found.
	*
	* @param empId the primary key of the emp
	* @return the emp
	* @throws NoSuchempException if a emp with the primary key could not be found
	*/
	public emp findByPrimaryKey(long empId) throws NoSuchempException;

	/**
	* Returns the emp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param empId the primary key of the emp
	* @return the emp, or <code>null</code> if a emp with the primary key could not be found
	*/
	public emp fetchByPrimaryKey(long empId);

	@Override
	public java.util.Map<java.io.Serializable, emp> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the emps.
	*
	* @return the emps
	*/
	public java.util.List<emp> findAll();

	/**
	* Returns a range of all the emps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emps
	* @param end the upper bound of the range of emps (not inclusive)
	* @return the range of emps
	*/
	public java.util.List<emp> findAll(int start, int end);

	/**
	* Returns an ordered range of all the emps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emps
	* @param end the upper bound of the range of emps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emps
	*/
	public java.util.List<emp> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator);

	/**
	* Returns an ordered range of all the emps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emps
	* @param end the upper bound of the range of emps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of emps
	*/
	public java.util.List<emp> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<emp> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the emps from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of emps.
	*
	* @return the number of emps
	*/
	public int countAll();
}