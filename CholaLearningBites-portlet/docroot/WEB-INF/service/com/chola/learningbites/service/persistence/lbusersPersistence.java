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

package com.chola.learningbites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.learningbites.exception.NoSuchlbusersException;
import com.chola.learningbites.model.lbusers;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the lbusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.learningbites.service.persistence.impl.lbusersPersistenceImpl
 * @see lbusersUtil
 * @generated
 */
@ProviderType
public interface lbusersPersistence extends BasePersistence<lbusers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link lbusersUtil} to access the lbusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the lbuserses where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @return the matching lbuserses
	*/
	public java.util.List<lbusers> findByLB_ID(long lb_id);

	/**
	* Returns a range of all the lbuserses where lb_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lb_id the lb_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @return the range of matching lbuserses
	*/
	public java.util.List<lbusers> findByLB_ID(long lb_id, int start, int end);

	/**
	* Returns an ordered range of all the lbuserses where lb_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lb_id the lb_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lbuserses
	*/
	public java.util.List<lbusers> findByLB_ID(long lb_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator);

	/**
	* Returns an ordered range of all the lbuserses where lb_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lb_id the lb_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lbuserses
	*/
	public java.util.List<lbusers> findByLB_ID(long lb_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lbusers in the ordered set where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbusers
	* @throws NoSuchlbusersException if a matching lbusers could not be found
	*/
	public lbusers findByLB_ID_First(long lb_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException;

	/**
	* Returns the first lbusers in the ordered set where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbusers, or <code>null</code> if a matching lbusers could not be found
	*/
	public lbusers fetchByLB_ID_First(long lb_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator);

	/**
	* Returns the last lbusers in the ordered set where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbusers
	* @throws NoSuchlbusersException if a matching lbusers could not be found
	*/
	public lbusers findByLB_ID_Last(long lb_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException;

	/**
	* Returns the last lbusers in the ordered set where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbusers, or <code>null</code> if a matching lbusers could not be found
	*/
	public lbusers fetchByLB_ID_Last(long lb_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator);

	/**
	* Returns the lbuserses before and after the current lbusers in the ordered set where lb_id = &#63;.
	*
	* @param id the primary key of the current lbusers
	* @param lb_id the lb_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lbusers
	* @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	*/
	public lbusers[] findByLB_ID_PrevAndNext(long id, long lb_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException;

	/**
	* Removes all the lbuserses where lb_id = &#63; from the database.
	*
	* @param lb_id the lb_id
	*/
	public void removeByLB_ID(long lb_id);

	/**
	* Returns the number of lbuserses where lb_id = &#63;.
	*
	* @param lb_id the lb_id
	* @return the number of matching lbuserses
	*/
	public int countByLB_ID(long lb_id);

	/**
	* Returns all the lbuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching lbuserses
	*/
	public java.util.List<lbusers> findByUSER_ID(long user_id);

	/**
	* Returns a range of all the lbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @return the range of matching lbuserses
	*/
	public java.util.List<lbusers> findByUSER_ID(long user_id, int start,
		int end);

	/**
	* Returns an ordered range of all the lbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lbuserses
	*/
	public java.util.List<lbusers> findByUSER_ID(long user_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator);

	/**
	* Returns an ordered range of all the lbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lbuserses
	*/
	public java.util.List<lbusers> findByUSER_ID(long user_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbusers
	* @throws NoSuchlbusersException if a matching lbusers could not be found
	*/
	public lbusers findByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException;

	/**
	* Returns the first lbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbusers, or <code>null</code> if a matching lbusers could not be found
	*/
	public lbusers fetchByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator);

	/**
	* Returns the last lbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbusers
	* @throws NoSuchlbusersException if a matching lbusers could not be found
	*/
	public lbusers findByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException;

	/**
	* Returns the last lbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbusers, or <code>null</code> if a matching lbusers could not be found
	*/
	public lbusers fetchByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator);

	/**
	* Returns the lbuserses before and after the current lbusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current lbusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lbusers
	* @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	*/
	public lbusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException;

	/**
	* Removes all the lbuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public void removeByUSER_ID(long user_id);

	/**
	* Returns the number of lbuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching lbuserses
	*/
	public int countByUSER_ID(long user_id);

	/**
	* Caches the lbusers in the entity cache if it is enabled.
	*
	* @param lbusers the lbusers
	*/
	public void cacheResult(lbusers lbusers);

	/**
	* Caches the lbuserses in the entity cache if it is enabled.
	*
	* @param lbuserses the lbuserses
	*/
	public void cacheResult(java.util.List<lbusers> lbuserses);

	/**
	* Creates a new lbusers with the primary key. Does not add the lbusers to the database.
	*
	* @param id the primary key for the new lbusers
	* @return the new lbusers
	*/
	public lbusers create(long id);

	/**
	* Removes the lbusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lbusers
	* @return the lbusers that was removed
	* @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	*/
	public lbusers remove(long id) throws NoSuchlbusersException;

	public lbusers updateImpl(lbusers lbusers);

	/**
	* Returns the lbusers with the primary key or throws a {@link NoSuchlbusersException} if it could not be found.
	*
	* @param id the primary key of the lbusers
	* @return the lbusers
	* @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	*/
	public lbusers findByPrimaryKey(long id) throws NoSuchlbusersException;

	/**
	* Returns the lbusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lbusers
	* @return the lbusers, or <code>null</code> if a lbusers with the primary key could not be found
	*/
	public lbusers fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, lbusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the lbuserses.
	*
	* @return the lbuserses
	*/
	public java.util.List<lbusers> findAll();

	/**
	* Returns a range of all the lbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @return the range of lbuserses
	*/
	public java.util.List<lbusers> findAll(int start, int end);

	/**
	* Returns an ordered range of all the lbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lbuserses
	*/
	public java.util.List<lbusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator);

	/**
	* Returns an ordered range of all the lbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbuserses
	* @param end the upper bound of the range of lbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of lbuserses
	*/
	public java.util.List<lbusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the lbuserses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of lbuserses.
	*
	* @return the number of lbuserses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}