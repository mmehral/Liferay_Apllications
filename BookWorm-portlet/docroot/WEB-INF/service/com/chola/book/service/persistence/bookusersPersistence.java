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

import com.chola.book.exception.NoSuchbookusersException;
import com.chola.book.model.bookusers;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the bookusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.book.service.persistence.impl.bookusersPersistenceImpl
 * @see bookusersUtil
 * @generated
 */
@ProviderType
public interface bookusersPersistence extends BasePersistence<bookusers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bookusersUtil} to access the bookusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bookuserses where book_id = &#63;.
	*
	* @param book_id the book_id
	* @return the matching bookuserses
	*/
	public java.util.List<bookusers> findByBOOK_ID(long book_id);

	/**
	* Returns a range of all the bookuserses where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @return the range of matching bookuserses
	*/
	public java.util.List<bookusers> findByBOOK_ID(long book_id, int start,
		int end);

	/**
	* Returns an ordered range of all the bookuserses where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookuserses
	*/
	public java.util.List<bookusers> findByBOOK_ID(long book_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator);

	/**
	* Returns an ordered range of all the bookuserses where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookuserses
	*/
	public java.util.List<bookusers> findByBOOK_ID(long book_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookusers in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookusers
	* @throws NoSuchbookusersException if a matching bookusers could not be found
	*/
	public bookusers findByBOOK_ID_First(long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException;

	/**
	* Returns the first bookusers in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookusers, or <code>null</code> if a matching bookusers could not be found
	*/
	public bookusers fetchByBOOK_ID_First(long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator);

	/**
	* Returns the last bookusers in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookusers
	* @throws NoSuchbookusersException if a matching bookusers could not be found
	*/
	public bookusers findByBOOK_ID_Last(long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException;

	/**
	* Returns the last bookusers in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookusers, or <code>null</code> if a matching bookusers could not be found
	*/
	public bookusers fetchByBOOK_ID_Last(long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator);

	/**
	* Returns the bookuserses before and after the current bookusers in the ordered set where book_id = &#63;.
	*
	* @param id the primary key of the current bookusers
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookusers
	* @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	*/
	public bookusers[] findByBOOK_ID_PrevAndNext(long id, long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException;

	/**
	* Removes all the bookuserses where book_id = &#63; from the database.
	*
	* @param book_id the book_id
	*/
	public void removeByBOOK_ID(long book_id);

	/**
	* Returns the number of bookuserses where book_id = &#63;.
	*
	* @param book_id the book_id
	* @return the number of matching bookuserses
	*/
	public int countByBOOK_ID(long book_id);

	/**
	* Returns all the bookuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching bookuserses
	*/
	public java.util.List<bookusers> findByUSER_ID(long user_id);

	/**
	* Returns a range of all the bookuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @return the range of matching bookuserses
	*/
	public java.util.List<bookusers> findByUSER_ID(long user_id, int start,
		int end);

	/**
	* Returns an ordered range of all the bookuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookuserses
	*/
	public java.util.List<bookusers> findByUSER_ID(long user_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator);

	/**
	* Returns an ordered range of all the bookuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookuserses
	*/
	public java.util.List<bookusers> findByUSER_ID(long user_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookusers
	* @throws NoSuchbookusersException if a matching bookusers could not be found
	*/
	public bookusers findByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException;

	/**
	* Returns the first bookusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookusers, or <code>null</code> if a matching bookusers could not be found
	*/
	public bookusers fetchByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator);

	/**
	* Returns the last bookusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookusers
	* @throws NoSuchbookusersException if a matching bookusers could not be found
	*/
	public bookusers findByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException;

	/**
	* Returns the last bookusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookusers, or <code>null</code> if a matching bookusers could not be found
	*/
	public bookusers fetchByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator);

	/**
	* Returns the bookuserses before and after the current bookusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current bookusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookusers
	* @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	*/
	public bookusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException;

	/**
	* Removes all the bookuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public void removeByUSER_ID(long user_id);

	/**
	* Returns the number of bookuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching bookuserses
	*/
	public int countByUSER_ID(long user_id);

	/**
	* Caches the bookusers in the entity cache if it is enabled.
	*
	* @param bookusers the bookusers
	*/
	public void cacheResult(bookusers bookusers);

	/**
	* Caches the bookuserses in the entity cache if it is enabled.
	*
	* @param bookuserses the bookuserses
	*/
	public void cacheResult(java.util.List<bookusers> bookuserses);

	/**
	* Creates a new bookusers with the primary key. Does not add the bookusers to the database.
	*
	* @param id the primary key for the new bookusers
	* @return the new bookusers
	*/
	public bookusers create(long id);

	/**
	* Removes the bookusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookusers
	* @return the bookusers that was removed
	* @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	*/
	public bookusers remove(long id) throws NoSuchbookusersException;

	public bookusers updateImpl(bookusers bookusers);

	/**
	* Returns the bookusers with the primary key or throws a {@link NoSuchbookusersException} if it could not be found.
	*
	* @param id the primary key of the bookusers
	* @return the bookusers
	* @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	*/
	public bookusers findByPrimaryKey(long id) throws NoSuchbookusersException;

	/**
	* Returns the bookusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bookusers
	* @return the bookusers, or <code>null</code> if a bookusers with the primary key could not be found
	*/
	public bookusers fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, bookusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bookuserses.
	*
	* @return the bookuserses
	*/
	public java.util.List<bookusers> findAll();

	/**
	* Returns a range of all the bookuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @return the range of bookuserses
	*/
	public java.util.List<bookusers> findAll(int start, int end);

	/**
	* Returns an ordered range of all the bookuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookuserses
	*/
	public java.util.List<bookusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator);

	/**
	* Returns an ordered range of all the bookuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookuserses
	*/
	public java.util.List<bookusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bookuserses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bookuserses.
	*
	* @return the number of bookuserses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}