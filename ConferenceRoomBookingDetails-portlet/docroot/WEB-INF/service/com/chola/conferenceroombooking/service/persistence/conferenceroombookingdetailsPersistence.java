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

package com.chola.conferenceroombooking.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.exception.NoSuchconferenceroombookingdetailsException;
import com.chola.conferenceroombooking.model.conferenceroombookingdetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the conferenceroombookingdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.conferenceroombooking.service.persistence.impl.conferenceroombookingdetailsPersistenceImpl
 * @see conferenceroombookingdetailsUtil
 * @generated
 */
@ProviderType
public interface conferenceroombookingdetailsPersistence extends BasePersistence<conferenceroombookingdetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link conferenceroombookingdetailsUtil} to access the conferenceroombookingdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @return the matching conferenceroombookingdetailses
	*/
	public java.util.List<conferenceroombookingdetails> findByMY_BOOKING(
		long userid, int status);

	/**
	* Returns a range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param status the status
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @return the range of matching conferenceroombookingdetailses
	*/
	public java.util.List<conferenceroombookingdetails> findByMY_BOOKING(
		long userid, int status, int start, int end);

	/**
	* Returns an ordered range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param status the status
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching conferenceroombookingdetailses
	*/
	public java.util.List<conferenceroombookingdetails> findByMY_BOOKING(
		long userid, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator);

	/**
	* Returns an ordered range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param status the status
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching conferenceroombookingdetailses
	*/
	public java.util.List<conferenceroombookingdetails> findByMY_BOOKING(
		long userid, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conferenceroombookingdetails
	* @throws NoSuchconferenceroombookingdetailsException if a matching conferenceroombookingdetails could not be found
	*/
	public conferenceroombookingdetails findByMY_BOOKING_First(long userid,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws NoSuchconferenceroombookingdetailsException;

	/**
	* Returns the first conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching conferenceroombookingdetails, or <code>null</code> if a matching conferenceroombookingdetails could not be found
	*/
	public conferenceroombookingdetails fetchByMY_BOOKING_First(long userid,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator);

	/**
	* Returns the last conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conferenceroombookingdetails
	* @throws NoSuchconferenceroombookingdetailsException if a matching conferenceroombookingdetails could not be found
	*/
	public conferenceroombookingdetails findByMY_BOOKING_Last(long userid,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws NoSuchconferenceroombookingdetailsException;

	/**
	* Returns the last conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching conferenceroombookingdetails, or <code>null</code> if a matching conferenceroombookingdetails could not be found
	*/
	public conferenceroombookingdetails fetchByMY_BOOKING_Last(long userid,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator);

	/**
	* Returns the conferenceroombookingdetailses before and after the current conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	*
	* @param bookid the primary key of the current conferenceroombookingdetails
	* @param userid the userid
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next conferenceroombookingdetails
	* @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	*/
	public conferenceroombookingdetails[] findByMY_BOOKING_PrevAndNext(
		long bookid, long userid, int status,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws NoSuchconferenceroombookingdetailsException;

	/**
	* Removes all the conferenceroombookingdetailses where userid = &#63; and status = &#63; from the database.
	*
	* @param userid the userid
	* @param status the status
	*/
	public void removeByMY_BOOKING(long userid, int status);

	/**
	* Returns the number of conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	*
	* @param userid the userid
	* @param status the status
	* @return the number of matching conferenceroombookingdetailses
	*/
	public int countByMY_BOOKING(long userid, int status);

	/**
	* Caches the conferenceroombookingdetails in the entity cache if it is enabled.
	*
	* @param conferenceroombookingdetails the conferenceroombookingdetails
	*/
	public void cacheResult(
		conferenceroombookingdetails conferenceroombookingdetails);

	/**
	* Caches the conferenceroombookingdetailses in the entity cache if it is enabled.
	*
	* @param conferenceroombookingdetailses the conferenceroombookingdetailses
	*/
	public void cacheResult(
		java.util.List<conferenceroombookingdetails> conferenceroombookingdetailses);

	/**
	* Creates a new conferenceroombookingdetails with the primary key. Does not add the conferenceroombookingdetails to the database.
	*
	* @param bookid the primary key for the new conferenceroombookingdetails
	* @return the new conferenceroombookingdetails
	*/
	public conferenceroombookingdetails create(long bookid);

	/**
	* Removes the conferenceroombookingdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was removed
	* @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	*/
	public conferenceroombookingdetails remove(long bookid)
		throws NoSuchconferenceroombookingdetailsException;

	public conferenceroombookingdetails updateImpl(
		conferenceroombookingdetails conferenceroombookingdetails);

	/**
	* Returns the conferenceroombookingdetails with the primary key or throws a {@link NoSuchconferenceroombookingdetailsException} if it could not be found.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails
	* @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	*/
	public conferenceroombookingdetails findByPrimaryKey(long bookid)
		throws NoSuchconferenceroombookingdetailsException;

	/**
	* Returns the conferenceroombookingdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails, or <code>null</code> if a conferenceroombookingdetails with the primary key could not be found
	*/
	public conferenceroombookingdetails fetchByPrimaryKey(long bookid);

	@Override
	public java.util.Map<java.io.Serializable, conferenceroombookingdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the conferenceroombookingdetailses.
	*
	* @return the conferenceroombookingdetailses
	*/
	public java.util.List<conferenceroombookingdetails> findAll();

	/**
	* Returns a range of all the conferenceroombookingdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @return the range of conferenceroombookingdetailses
	*/
	public java.util.List<conferenceroombookingdetails> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the conferenceroombookingdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of conferenceroombookingdetailses
	*/
	public java.util.List<conferenceroombookingdetails> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator);

	/**
	* Returns an ordered range of all the conferenceroombookingdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of conferenceroombookingdetailses
	*/
	public java.util.List<conferenceroombookingdetails> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<conferenceroombookingdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the conferenceroombookingdetailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of conferenceroombookingdetailses.
	*
	* @return the number of conferenceroombookingdetailses
	*/
	public int countAll();
}