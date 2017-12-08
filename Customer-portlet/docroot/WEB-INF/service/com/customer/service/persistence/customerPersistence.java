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

import com.customer.exception.NoSuchcustomerException;

import com.customer.model.customer;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.customer.service.persistence.impl.customerPersistenceImpl
 * @see customerUtil
 * @generated
 */
@ProviderType
public interface customerPersistence extends BasePersistence<customer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link customerUtil} to access the customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the customers where name = &#63;.
	*
	* @param name the name
	* @return the matching customers
	*/
	public java.util.List<customer> findByName(java.lang.String name);

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
	public java.util.List<customer> findByName(java.lang.String name,
		int start, int end);

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
	public java.util.List<customer> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator);

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
	public java.util.List<customer> findByName(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first customer in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer
	* @throws NoSuchcustomerException if a matching customer could not be found
	*/
	public customer findByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator)
		throws NoSuchcustomerException;

	/**
	* Returns the first customer in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching customer, or <code>null</code> if a matching customer could not be found
	*/
	public customer fetchByName_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator);

	/**
	* Returns the last customer in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer
	* @throws NoSuchcustomerException if a matching customer could not be found
	*/
	public customer findByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator)
		throws NoSuchcustomerException;

	/**
	* Returns the last customer in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching customer, or <code>null</code> if a matching customer could not be found
	*/
	public customer fetchByName_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator);

	/**
	* Returns the customers before and after the current customer in the ordered set where name = &#63;.
	*
	* @param customerId the primary key of the current customer
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next customer
	* @throws NoSuchcustomerException if a customer with the primary key could not be found
	*/
	public customer[] findByName_PrevAndNext(long customerId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator)
		throws NoSuchcustomerException;

	/**
	* Removes all the customers where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByName(java.lang.String name);

	/**
	* Returns the number of customers where name = &#63;.
	*
	* @param name the name
	* @return the number of matching customers
	*/
	public int countByName(java.lang.String name);

	/**
	* Caches the customer in the entity cache if it is enabled.
	*
	* @param customer the customer
	*/
	public void cacheResult(customer customer);

	/**
	* Caches the customers in the entity cache if it is enabled.
	*
	* @param customers the customers
	*/
	public void cacheResult(java.util.List<customer> customers);

	/**
	* Creates a new customer with the primary key. Does not add the customer to the database.
	*
	* @param customerId the primary key for the new customer
	* @return the new customer
	*/
	public customer create(long customerId);

	/**
	* Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerId the primary key of the customer
	* @return the customer that was removed
	* @throws NoSuchcustomerException if a customer with the primary key could not be found
	*/
	public customer remove(long customerId) throws NoSuchcustomerException;

	public customer updateImpl(customer customer);

	/**
	* Returns the customer with the primary key or throws a {@link NoSuchcustomerException} if it could not be found.
	*
	* @param customerId the primary key of the customer
	* @return the customer
	* @throws NoSuchcustomerException if a customer with the primary key could not be found
	*/
	public customer findByPrimaryKey(long customerId)
		throws NoSuchcustomerException;

	/**
	* Returns the customer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param customerId the primary key of the customer
	* @return the customer, or <code>null</code> if a customer with the primary key could not be found
	*/
	public customer fetchByPrimaryKey(long customerId);

	@Override
	public java.util.Map<java.io.Serializable, customer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the customers.
	*
	* @return the customers
	*/
	public java.util.List<customer> findAll();

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
	public java.util.List<customer> findAll(int start, int end);

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
	public java.util.List<customer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator);

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
	public java.util.List<customer> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<customer> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the customers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of customers.
	*
	* @return the number of customers
	*/
	public int countAll();
}