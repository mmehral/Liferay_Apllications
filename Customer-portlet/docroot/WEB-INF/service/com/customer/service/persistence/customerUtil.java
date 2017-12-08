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

package com.customer.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.customer.model.customer;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the customer service. This utility wraps {@link com.customer.service.persistence.impl.customerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see customerPersistence
 * @see com.customer.service.persistence.impl.customerPersistenceImpl
 * @generated
 */
@ProviderType
public class customerUtil {
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
	public static void clearCache(customer customer) {
		getPersistence().clearCache(customer);
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
	public static List<customer> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<customer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<customer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<customer> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static customer update(customer customer) {
		return getPersistence().update(customer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static customer update(customer customer,
		ServiceContext serviceContext) {
		return getPersistence().update(customer, serviceContext);
	}

	/**
	* Returns all the customers where name = &#63;.
	*
	* @param name the name
	* @return the matching customers
	*/
	public static List<customer> findByName(java.lang.String name) {
		return getPersistence().findByName(name);
	}

	/**
	* Returns a range of all the customers where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @return the range of matching customers
	*/
	public static List<customer> findByName(java.lang.String name, int start,
		int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	* Returns an ordered range of all the customers where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching customers
	*/
	public static List<customer> findByName(java.lang.String name, int start,
		int end, OrderByComparator<customer> orderByComparator) {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the customers where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching customers
	*/
	public static List<customer> findByName(java.lang.String name, int start,
		int end, OrderByComparator<customer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByName(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first customer in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer
	* @throws NoSuchcustomerException if a matching customer could not be found
	*/
	public static customer findByName_First(java.lang.String name,
		OrderByComparator<customer> orderByComparator)
		throws com.customer.exception.NoSuchcustomerException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first customer in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer, or <code>null</code> if a matching customer could not be found
	*/
	public static customer fetchByName_First(java.lang.String name,
		OrderByComparator<customer> orderByComparator) {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last customer in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer
	* @throws NoSuchcustomerException if a matching customer could not be found
	*/
	public static customer findByName_Last(java.lang.String name,
		OrderByComparator<customer> orderByComparator)
		throws com.customer.exception.NoSuchcustomerException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last customer in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer, or <code>null</code> if a matching customer could not be found
	*/
	public static customer fetchByName_Last(java.lang.String name,
		OrderByComparator<customer> orderByComparator) {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the customers before and after the current customer in the ordered set where name = &#63;.
	*
	* @param customerId the primary key of the current customer
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next customer
	* @throws NoSuchcustomerException if a customer with the primary key could not be found
	*/
	public static customer[] findByName_PrevAndNext(long customerId,
		java.lang.String name, OrderByComparator<customer> orderByComparator)
		throws com.customer.exception.NoSuchcustomerException {
		return getPersistence()
				   .findByName_PrevAndNext(customerId, name, orderByComparator);
	}

	/**
	* Removes all the customers where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByName(java.lang.String name) {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of customers where name = &#63;.
	*
	* @param name the name
	* @return the number of matching customers
	*/
	public static int countByName(java.lang.String name) {
		return getPersistence().countByName(name);
	}

	/**
	* Caches the customer in the entity cache if it is enabled.
	*
	* @param customer the customer
	*/
	public static void cacheResult(customer customer) {
		getPersistence().cacheResult(customer);
	}

	/**
	* Caches the customers in the entity cache if it is enabled.
	*
	* @param customers the customers
	*/
	public static void cacheResult(List<customer> customers) {
		getPersistence().cacheResult(customers);
	}

	/**
	* Creates a new customer with the primary key. Does not add the customer to the database.
	*
	* @param customerId the primary key for the new customer
	* @return the new customer
	*/
	public static customer create(long customerId) {
		return getPersistence().create(customerId);
	}

	/**
	* Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerId the primary key of the customer
	* @return the customer that was removed
	* @throws NoSuchcustomerException if a customer with the primary key could not be found
	*/
	public static customer remove(long customerId)
		throws com.customer.exception.NoSuchcustomerException {
		return getPersistence().remove(customerId);
	}

	public static customer updateImpl(customer customer) {
		return getPersistence().updateImpl(customer);
	}

	/**
	* Returns the customer with the primary key or throws a {@link NoSuchcustomerException} if it could not be found.
	*
	* @param customerId the primary key of the customer
	* @return the customer
	* @throws NoSuchcustomerException if a customer with the primary key could not be found
	*/
	public static customer findByPrimaryKey(long customerId)
		throws com.customer.exception.NoSuchcustomerException {
		return getPersistence().findByPrimaryKey(customerId);
	}

	/**
	* Returns the customer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param customerId the primary key of the customer
	* @return the customer, or <code>null</code> if a customer with the primary key could not be found
	*/
	public static customer fetchByPrimaryKey(long customerId) {
		return getPersistence().fetchByPrimaryKey(customerId);
	}

	public static java.util.Map<java.io.Serializable, customer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the customers.
	*
	* @return the customers
	*/
	public static List<customer> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @return the range of customers
	*/
	public static List<customer> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customers
	*/
	public static List<customer> findAll(int start, int end,
		OrderByComparator<customer> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customers
	* @param end the upper bound of the range of customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of customers
	*/
	public static List<customer> findAll(int start, int end,
		OrderByComparator<customer> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the customers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of customers.
	*
	* @return the number of customers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static customerPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (customerPersistence)PortletBeanLocatorUtil.locate(com.customer.service.ClpSerializer.getServletContextName(),
					customerPersistence.class.getName());

			ReferenceRegistry.registerReference(customerUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static customerPersistence _persistence;
}