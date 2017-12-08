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

import com.chola.business.exception.NoSuchbusinesssopusersException;
import com.chola.business.model.businesssopusers;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the businesssopusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.business.service.persistence.impl.businesssopusersPersistenceImpl
 * @see businesssopusersUtil
 * @generated
 */
@ProviderType
public interface businesssopusersPersistence extends BasePersistence<businesssopusers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link businesssopusersUtil} to access the businesssopusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the businesssopuserses where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the matching businesssopuserses
	*/
	public java.util.List<businesssopusers> findByBUSINESS_ID(
		long businessdetails_id);

	/**
	* Returns a range of all the businesssopuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @return the range of matching businesssopuserses
	*/
	public java.util.List<businesssopusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end);

	/**
	* Returns an ordered range of all the businesssopuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesssopuserses
	*/
	public java.util.List<businesssopusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator);

	/**
	* Returns an ordered range of all the businesssopuserses where businessdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param businessdetails_id the businessdetails_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businesssopuserses
	*/
	public java.util.List<businesssopusers> findByBUSINESS_ID(
		long businessdetails_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssopusers
	* @throws NoSuchbusinesssopusersException if a matching businesssopusers could not be found
	*/
	public businesssopusers findByBUSINESS_ID_First(long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator)
		throws NoSuchbusinesssopusersException;

	/**
	* Returns the first businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssopusers, or <code>null</code> if a matching businesssopusers could not be found
	*/
	public businesssopusers fetchByBUSINESS_ID_First(long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator);

	/**
	* Returns the last businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssopusers
	* @throws NoSuchbusinesssopusersException if a matching businesssopusers could not be found
	*/
	public businesssopusers findByBUSINESS_ID_Last(long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator)
		throws NoSuchbusinesssopusersException;

	/**
	* Returns the last businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssopusers, or <code>null</code> if a matching businesssopusers could not be found
	*/
	public businesssopusers fetchByBUSINESS_ID_Last(long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator);

	/**
	* Returns the businesssopuserses before and after the current businesssopusers in the ordered set where businessdetails_id = &#63;.
	*
	* @param id the primary key of the current businesssopusers
	* @param businessdetails_id the businessdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businesssopusers
	* @throws NoSuchbusinesssopusersException if a businesssopusers with the primary key could not be found
	*/
	public businesssopusers[] findByBUSINESS_ID_PrevAndNext(long id,
		long businessdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator)
		throws NoSuchbusinesssopusersException;

	/**
	* Removes all the businesssopuserses where businessdetails_id = &#63; from the database.
	*
	* @param businessdetails_id the businessdetails_id
	*/
	public void removeByBUSINESS_ID(long businessdetails_id);

	/**
	* Returns the number of businesssopuserses where businessdetails_id = &#63;.
	*
	* @param businessdetails_id the businessdetails_id
	* @return the number of matching businesssopuserses
	*/
	public int countByBUSINESS_ID(long businessdetails_id);

	/**
	* Returns all the businesssopuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching businesssopuserses
	*/
	public java.util.List<businesssopusers> findByUSER_ID(long user_id);

	/**
	* Returns a range of all the businesssopuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @return the range of matching businesssopuserses
	*/
	public java.util.List<businesssopusers> findByUSER_ID(long user_id,
		int start, int end);

	/**
	* Returns an ordered range of all the businesssopuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businesssopuserses
	*/
	public java.util.List<businesssopusers> findByUSER_ID(long user_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator);

	/**
	* Returns an ordered range of all the businesssopuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businesssopuserses
	*/
	public java.util.List<businesssopusers> findByUSER_ID(long user_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssopusers
	* @throws NoSuchbusinesssopusersException if a matching businesssopusers could not be found
	*/
	public businesssopusers findByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator)
		throws NoSuchbusinesssopusersException;

	/**
	* Returns the first businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businesssopusers, or <code>null</code> if a matching businesssopusers could not be found
	*/
	public businesssopusers fetchByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator);

	/**
	* Returns the last businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssopusers
	* @throws NoSuchbusinesssopusersException if a matching businesssopusers could not be found
	*/
	public businesssopusers findByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator)
		throws NoSuchbusinesssopusersException;

	/**
	* Returns the last businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businesssopusers, or <code>null</code> if a matching businesssopusers could not be found
	*/
	public businesssopusers fetchByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator);

	/**
	* Returns the businesssopuserses before and after the current businesssopusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current businesssopusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businesssopusers
	* @throws NoSuchbusinesssopusersException if a businesssopusers with the primary key could not be found
	*/
	public businesssopusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator)
		throws NoSuchbusinesssopusersException;

	/**
	* Removes all the businesssopuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public void removeByUSER_ID(long user_id);

	/**
	* Returns the number of businesssopuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching businesssopuserses
	*/
	public int countByUSER_ID(long user_id);

	/**
	* Caches the businesssopusers in the entity cache if it is enabled.
	*
	* @param businesssopusers the businesssopusers
	*/
	public void cacheResult(businesssopusers businesssopusers);

	/**
	* Caches the businesssopuserses in the entity cache if it is enabled.
	*
	* @param businesssopuserses the businesssopuserses
	*/
	public void cacheResult(java.util.List<businesssopusers> businesssopuserses);

	/**
	* Creates a new businesssopusers with the primary key. Does not add the businesssopusers to the database.
	*
	* @param id the primary key for the new businesssopusers
	* @return the new businesssopusers
	*/
	public businesssopusers create(long id);

	/**
	* Removes the businesssopusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssopusers
	* @return the businesssopusers that was removed
	* @throws NoSuchbusinesssopusersException if a businesssopusers with the primary key could not be found
	*/
	public businesssopusers remove(long id)
		throws NoSuchbusinesssopusersException;

	public businesssopusers updateImpl(businesssopusers businesssopusers);

	/**
	* Returns the businesssopusers with the primary key or throws a {@link NoSuchbusinesssopusersException} if it could not be found.
	*
	* @param id the primary key of the businesssopusers
	* @return the businesssopusers
	* @throws NoSuchbusinesssopusersException if a businesssopusers with the primary key could not be found
	*/
	public businesssopusers findByPrimaryKey(long id)
		throws NoSuchbusinesssopusersException;

	/**
	* Returns the businesssopusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businesssopusers
	* @return the businesssopusers, or <code>null</code> if a businesssopusers with the primary key could not be found
	*/
	public businesssopusers fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, businesssopusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the businesssopuserses.
	*
	* @return the businesssopuserses
	*/
	public java.util.List<businesssopusers> findAll();

	/**
	* Returns a range of all the businesssopuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @return the range of businesssopuserses
	*/
	public java.util.List<businesssopusers> findAll(int start, int end);

	/**
	* Returns an ordered range of all the businesssopuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesssopuserses
	*/
	public java.util.List<businesssopusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator);

	/**
	* Returns an ordered range of all the businesssopuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssopuserses
	* @param end the upper bound of the range of businesssopuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businesssopuserses
	*/
	public java.util.List<businesssopusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the businesssopuserses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of businesssopuserses.
	*
	* @return the number of businesssopuserses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}