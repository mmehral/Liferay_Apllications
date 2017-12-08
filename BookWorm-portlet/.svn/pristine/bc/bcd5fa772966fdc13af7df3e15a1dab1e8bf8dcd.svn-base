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

package com.chola.book.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.book.exception.NoSuchbookdetailsException;
import com.chola.book.model.bookdetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the bookdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.book.service.persistence.impl.bookdetailsPersistenceImpl
 * @see bookdetailsUtil
 * @generated
 */
@ProviderType
public interface bookdetailsPersistence extends BasePersistence<bookdetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bookdetailsUtil} to access the bookdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bookdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching bookdetailses
	*/
	public java.util.List<bookdetails> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the bookdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @return the range of matching bookdetailses
	*/
	public java.util.List<bookdetails> findByCONTENT_ID(long content_id,
		int start, int end);

	/**
	* Returns an ordered range of all the bookdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookdetailses
	*/
	public java.util.List<bookdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator);

	/**
	* Returns an ordered range of all the bookdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookdetailses
	*/
	public java.util.List<bookdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookdetails
	* @throws NoSuchbookdetailsException if a matching bookdetails could not be found
	*/
	public bookdetails findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator)
		throws NoSuchbookdetailsException;

	/**
	* Returns the first bookdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookdetails, or <code>null</code> if a matching bookdetails could not be found
	*/
	public bookdetails fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator);

	/**
	* Returns the last bookdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookdetails
	* @throws NoSuchbookdetailsException if a matching bookdetails could not be found
	*/
	public bookdetails findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator)
		throws NoSuchbookdetailsException;

	/**
	* Returns the last bookdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookdetails, or <code>null</code> if a matching bookdetails could not be found
	*/
	public bookdetails fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator);

	/**
	* Returns the bookdetailses before and after the current bookdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current bookdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookdetails
	* @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	*/
	public bookdetails[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator)
		throws NoSuchbookdetailsException;

	/**
	* Removes all the bookdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of bookdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching bookdetailses
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the bookdetails in the entity cache if it is enabled.
	*
	* @param bookdetails the bookdetails
	*/
	public void cacheResult(bookdetails bookdetails);

	/**
	* Caches the bookdetailses in the entity cache if it is enabled.
	*
	* @param bookdetailses the bookdetailses
	*/
	public void cacheResult(java.util.List<bookdetails> bookdetailses);

	/**
	* Creates a new bookdetails with the primary key. Does not add the bookdetails to the database.
	*
	* @param id the primary key for the new bookdetails
	* @return the new bookdetails
	*/
	public bookdetails create(long id);

	/**
	* Removes the bookdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookdetails
	* @return the bookdetails that was removed
	* @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	*/
	public bookdetails remove(long id) throws NoSuchbookdetailsException;

	public bookdetails updateImpl(bookdetails bookdetails);

	/**
	* Returns the bookdetails with the primary key or throws a {@link NoSuchbookdetailsException} if it could not be found.
	*
	* @param id the primary key of the bookdetails
	* @return the bookdetails
	* @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	*/
	public bookdetails findByPrimaryKey(long id)
		throws NoSuchbookdetailsException;

	/**
	* Returns the bookdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bookdetails
	* @return the bookdetails, or <code>null</code> if a bookdetails with the primary key could not be found
	*/
	public bookdetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, bookdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bookdetailses.
	*
	* @return the bookdetailses
	*/
	public java.util.List<bookdetails> findAll();

	/**
	* Returns a range of all the bookdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @return the range of bookdetailses
	*/
	public java.util.List<bookdetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the bookdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookdetailses
	*/
	public java.util.List<bookdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator);

	/**
	* Returns an ordered range of all the bookdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookdetailses
	*/
	public java.util.List<bookdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bookdetailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bookdetailses.
	*
	* @return the number of bookdetailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}