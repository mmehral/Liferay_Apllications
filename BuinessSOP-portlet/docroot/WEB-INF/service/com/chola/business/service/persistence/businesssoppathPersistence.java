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

package com.chola.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.exception.NoSuchbusinesssoppathException;
import com.chola.business.model.businesssoppath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the businesssoppath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.business.service.persistence.impl.businesssoppathPersistenceImpl
 * @see businesssoppathUtil
 * @generated
 */
@ProviderType
public interface businesssoppathPersistence extends BasePersistence<businesssoppath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link businesssoppathUtil} to access the businesssoppath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the businesssoppaths where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the matching businesssoppaths
	*/
	public java.util.List<businesssoppath> findBySOP_ID(long businessdetails_id);

	/**
	* Returns a range of all the businesssoppaths where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @return the range of matching businesssoppaths
	*/
	public java.util.List<businesssoppath> findBySOP_ID(
		long businessdetails_id, int start, int end);

	/**
	* Returns an ordered range of all the businesssoppaths where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesssoppaths
	*/
	public java.util.List<businesssoppath> findBySOP_ID(
		long businessdetails_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator);

	/**
	* Returns an ordered range of all the businesssoppaths where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businesssoppaths
	*/
	public java.util.List<businesssoppath> findBySOP_ID(
		long businessdetails_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssoppath
	* @throws NoSuchbusinesssoppathException if a matching businesssoppath could not be found
	*/
	public businesssoppath findBySOP_ID_First(long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator)
		throws NoSuchbusinesssoppathException;

	/**
	* Returns the first businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssoppath, or <code>null</code> if a matching businesssoppath could not be found
	*/
	public businesssoppath fetchBySOP_ID_First(long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator);

	/**
	* Returns the last businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssoppath
	* @throws NoSuchbusinesssoppathException if a matching businesssoppath could not be found
	*/
	public businesssoppath findBySOP_ID_Last(long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator)
		throws NoSuchbusinesssoppathException;

	/**
	* Returns the last businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssoppath, or <code>null</code> if a matching businesssoppath could not be found
	*/
	public businesssoppath fetchBySOP_ID_Last(long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator);

	/**
	* Returns the businesssoppaths before and after the current businesssoppath in the ordered set where businessdetails_id = &#63;.
	*
	* @param id the primary key of the current businesssoppath
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businesssoppath
	* @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	*/
	public businesssoppath[] findBySOP_ID_PrevAndNext(long id,
		long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator)
		throws NoSuchbusinesssoppathException;

	/**
	* Removes all the businesssoppaths where businessdetails_id = &#63; from the database.
	*
	* @param businessdetails_id the businessdetails_id
	*/
	public void removeBySOP_ID(long businessdetails_id);

	/**
	* Returns the number of businesssoppaths where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the number of matching businesssoppaths
	*/
	public int countBySOP_ID(long businessdetails_id);

	/**
	* Caches the businesssoppath in the entity cache if it is enabled.
	*
	* @param businesssoppath the businesssoppath
	*/
	public void cacheResult(businesssoppath businesssoppath);

	/**
	* Caches the businesssoppaths in the entity cache if it is enabled.
	*
	* @param businesssoppaths the businesssoppaths
	*/
	public void cacheResult(java.util.List<businesssoppath> businesssoppaths);

	/**
	* Creates a new businesssoppath with the primary key. Does not add the businesssoppath to the database.
	*
	* @param id the primary key for the new businesssoppath
	* @return the new businesssoppath
	*/
	public businesssoppath create(long id);

	/**
	* Removes the businesssoppath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssoppath
	* @return the businesssoppath that was removed
	* @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	*/
	public businesssoppath remove(long id)
		throws NoSuchbusinesssoppathException;

	public businesssoppath updateImpl(businesssoppath businesssoppath);

	/**
	* Returns the businesssoppath with the primary key or throws a {@link NoSuchbusinesssoppathException} if it could not be found.
	*
	* @param id the primary key of the businesssoppath
	* @return the businesssoppath
	* @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	*/
	public businesssoppath findByPrimaryKey(long id)
		throws NoSuchbusinesssoppathException;

	/**
	* Returns the businesssoppath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businesssoppath
	* @return the businesssoppath, or <code>null</code> if a businesssoppath with the primary key could not be found
	*/
	public businesssoppath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, businesssoppath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the businesssoppaths.
	*
	* @return the businesssoppaths
	*/
	public java.util.List<businesssoppath> findAll();

	/**
	* Returns a range of all the businesssoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @return the range of businesssoppaths
	*/
	public java.util.List<businesssoppath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the businesssoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesssoppaths
	*/
	public java.util.List<businesssoppath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator);

	/**
	* Returns an ordered range of all the businesssoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssoppaths
	* @param end the upper bound of the range of businesssoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businesssoppaths
	*/
	public java.util.List<businesssoppath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssoppath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the businesssoppaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of businesssoppaths.
	*
	* @return the number of businesssoppaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}