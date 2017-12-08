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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.pratice.model.emp;

import java.util.List;

/**
 * The persistence utility for the emp service. This utility wraps {@link com.pratice.service.persistence.impl.empPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see empPersistence
 * @see com.pratice.service.persistence.impl.empPersistenceImpl
 * @generated
 */
@ProviderType
public class empUtil {
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
	public static void clearCache(emp emp) {
		getPersistence().clearCache(emp);
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
	public static List<emp> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<emp> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<emp> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<emp> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static emp update(emp emp) {
		return getPersistence().update(emp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static emp update(emp emp, ServiceContext serviceContext) {
		return getPersistence().update(emp, serviceContext);
	}

	/**
	* Returns all the emps where empName = &#63;.
	*
	* @param empName the emp name
	* @return the matching emps
	*/
	public static List<emp> findByEmpName(java.lang.String empName) {
		return getPersistence().findByEmpName(empName);
	}

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
	public static List<emp> findByEmpName(java.lang.String empName, int start,
		int end) {
		return getPersistence().findByEmpName(empName, start, end);
	}

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
	public static List<emp> findByEmpName(java.lang.String empName, int start,
		int end, OrderByComparator<emp> orderByComparator) {
		return getPersistence()
				   .findByEmpName(empName, start, end, orderByComparator);
	}

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
	public static List<emp> findByEmpName(java.lang.String empName, int start,
		int end, OrderByComparator<emp> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEmpName(empName, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first emp in the ordered set where empName = &#63;.
	*
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp
	* @throws NoSuchempException if a matching emp could not be found
	*/
	public static emp findByEmpName_First(java.lang.String empName,
		OrderByComparator<emp> orderByComparator)
		throws com.pratice.exception.NoSuchempException {
		return getPersistence().findByEmpName_First(empName, orderByComparator);
	}

	/**
	* Returns the first emp in the ordered set where empName = &#63;.
	*
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp, or <code>null</code> if a matching emp could not be found
	*/
	public static emp fetchByEmpName_First(java.lang.String empName,
		OrderByComparator<emp> orderByComparator) {
		return getPersistence().fetchByEmpName_First(empName, orderByComparator);
	}

	/**
	* Returns the last emp in the ordered set where empName = &#63;.
	*
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp
	* @throws NoSuchempException if a matching emp could not be found
	*/
	public static emp findByEmpName_Last(java.lang.String empName,
		OrderByComparator<emp> orderByComparator)
		throws com.pratice.exception.NoSuchempException {
		return getPersistence().findByEmpName_Last(empName, orderByComparator);
	}

	/**
	* Returns the last emp in the ordered set where empName = &#63;.
	*
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp, or <code>null</code> if a matching emp could not be found
	*/
	public static emp fetchByEmpName_Last(java.lang.String empName,
		OrderByComparator<emp> orderByComparator) {
		return getPersistence().fetchByEmpName_Last(empName, orderByComparator);
	}

	/**
	* Returns the emps before and after the current emp in the ordered set where empName = &#63;.
	*
	* @param empId the primary key of the current emp
	* @param empName the emp name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emp
	* @throws NoSuchempException if a emp with the primary key could not be found
	*/
	public static emp[] findByEmpName_PrevAndNext(long empId,
		java.lang.String empName, OrderByComparator<emp> orderByComparator)
		throws com.pratice.exception.NoSuchempException {
		return getPersistence()
				   .findByEmpName_PrevAndNext(empId, empName, orderByComparator);
	}

	/**
	* Removes all the emps where empName = &#63; from the database.
	*
	* @param empName the emp name
	*/
	public static void removeByEmpName(java.lang.String empName) {
		getPersistence().removeByEmpName(empName);
	}

	/**
	* Returns the number of emps where empName = &#63;.
	*
	* @param empName the emp name
	* @return the number of matching emps
	*/
	public static int countByEmpName(java.lang.String empName) {
		return getPersistence().countByEmpName(empName);
	}

	/**
	* Caches the emp in the entity cache if it is enabled.
	*
	* @param emp the emp
	*/
	public static void cacheResult(emp emp) {
		getPersistence().cacheResult(emp);
	}

	/**
	* Caches the emps in the entity cache if it is enabled.
	*
	* @param emps the emps
	*/
	public static void cacheResult(List<emp> emps) {
		getPersistence().cacheResult(emps);
	}

	/**
	* Creates a new emp with the primary key. Does not add the emp to the database.
	*
	* @param empId the primary key for the new emp
	* @return the new emp
	*/
	public static emp create(long empId) {
		return getPersistence().create(empId);
	}

	/**
	* Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empId the primary key of the emp
	* @return the emp that was removed
	* @throws NoSuchempException if a emp with the primary key could not be found
	*/
	public static emp remove(long empId)
		throws com.pratice.exception.NoSuchempException {
		return getPersistence().remove(empId);
	}

	public static emp updateImpl(emp emp) {
		return getPersistence().updateImpl(emp);
	}

	/**
	* Returns the emp with the primary key or throws a {@link NoSuchempException} if it could not be found.
	*
	* @param empId the primary key of the emp
	* @return the emp
	* @throws NoSuchempException if a emp with the primary key could not be found
	*/
	public static emp findByPrimaryKey(long empId)
		throws com.pratice.exception.NoSuchempException {
		return getPersistence().findByPrimaryKey(empId);
	}

	/**
	* Returns the emp with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param empId the primary key of the emp
	* @return the emp, or <code>null</code> if a emp with the primary key could not be found
	*/
	public static emp fetchByPrimaryKey(long empId) {
		return getPersistence().fetchByPrimaryKey(empId);
	}

	public static java.util.Map<java.io.Serializable, emp> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the emps.
	*
	* @return the emps
	*/
	public static List<emp> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<emp> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<emp> findAll(int start, int end,
		OrderByComparator<emp> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<emp> findAll(int start, int end,
		OrderByComparator<emp> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the emps from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of emps.
	*
	* @return the number of emps
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static empPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (empPersistence)PortletBeanLocatorUtil.locate(com.pratice.service.ClpSerializer.getServletContextName(),
					empPersistence.class.getName());

			ReferenceRegistry.registerReference(empUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static empPersistence _persistence;
}