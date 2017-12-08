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

import com.chola.book.exception.NoSuchbookpathException;
import com.chola.book.model.bookpath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the bookpath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.book.service.persistence.impl.bookpathPersistenceImpl
 * @see bookpathUtil
 * @generated
 */
@ProviderType
public interface bookpathPersistence extends BasePersistence<bookpath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bookpathUtil} to access the bookpath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bookpaths where book_id = &#63;.
	*
	* @param book_id the book_id
	* @return the matching bookpaths
	*/
	public java.util.List<bookpath> findByBOOK_ID(long book_id);

	/**
	* Returns a range of all the bookpaths where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @return the range of matching bookpaths
	*/
	public java.util.List<bookpath> findByBOOK_ID(long book_id, int start,
		int end);

	/**
	* Returns an ordered range of all the bookpaths where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bookpaths
	*/
	public java.util.List<bookpath> findByBOOK_ID(long book_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator);

	/**
	* Returns an ordered range of all the bookpaths where book_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param book_id the book_id
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bookpaths
	*/
	public java.util.List<bookpath> findByBOOK_ID(long book_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bookpath in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookpath
	* @throws NoSuchbookpathException if a matching bookpath could not be found
	*/
	public bookpath findByBOOK_ID_First(long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator)
		throws NoSuchbookpathException;

	/**
	* Returns the first bookpath in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bookpath, or <code>null</code> if a matching bookpath could not be found
	*/
	public bookpath fetchByBOOK_ID_First(long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator);

	/**
	* Returns the last bookpath in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookpath
	* @throws NoSuchbookpathException if a matching bookpath could not be found
	*/
	public bookpath findByBOOK_ID_Last(long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator)
		throws NoSuchbookpathException;

	/**
	* Returns the last bookpath in the ordered set where book_id = &#63;.
	*
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bookpath, or <code>null</code> if a matching bookpath could not be found
	*/
	public bookpath fetchByBOOK_ID_Last(long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator);

	/**
	* Returns the bookpaths before and after the current bookpath in the ordered set where book_id = &#63;.
	*
	* @param id the primary key of the current bookpath
	* @param book_id the book_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bookpath
	* @throws NoSuchbookpathException if a bookpath with the primary key could not be found
	*/
	public bookpath[] findByBOOK_ID_PrevAndNext(long id, long book_id,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator)
		throws NoSuchbookpathException;

	/**
	* Removes all the bookpaths where book_id = &#63; from the database.
	*
	* @param book_id the book_id
	*/
	public void removeByBOOK_ID(long book_id);

	/**
	* Returns the number of bookpaths where book_id = &#63;.
	*
	* @param book_id the book_id
	* @return the number of matching bookpaths
	*/
	public int countByBOOK_ID(long book_id);

	/**
	* Caches the bookpath in the entity cache if it is enabled.
	*
	* @param bookpath the bookpath
	*/
	public void cacheResult(bookpath bookpath);

	/**
	* Caches the bookpaths in the entity cache if it is enabled.
	*
	* @param bookpaths the bookpaths
	*/
	public void cacheResult(java.util.List<bookpath> bookpaths);

	/**
	* Creates a new bookpath with the primary key. Does not add the bookpath to the database.
	*
	* @param id the primary key for the new bookpath
	* @return the new bookpath
	*/
	public bookpath create(long id);

	/**
	* Removes the bookpath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookpath
	* @return the bookpath that was removed
	* @throws NoSuchbookpathException if a bookpath with the primary key could not be found
	*/
	public bookpath remove(long id) throws NoSuchbookpathException;

	public bookpath updateImpl(bookpath bookpath);

	/**
	* Returns the bookpath with the primary key or throws a {@link NoSuchbookpathException} if it could not be found.
	*
	* @param id the primary key of the bookpath
	* @return the bookpath
	* @throws NoSuchbookpathException if a bookpath with the primary key could not be found
	*/
	public bookpath findByPrimaryKey(long id) throws NoSuchbookpathException;

	/**
	* Returns the bookpath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bookpath
	* @return the bookpath, or <code>null</code> if a bookpath with the primary key could not be found
	*/
	public bookpath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, bookpath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bookpaths.
	*
	* @return the bookpaths
	*/
	public java.util.List<bookpath> findAll();

	/**
	* Returns a range of all the bookpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @return the range of bookpaths
	*/
	public java.util.List<bookpath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the bookpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bookpaths
	*/
	public java.util.List<bookpath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator);

	/**
	* Returns an ordered range of all the bookpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bookpaths
	*/
	public java.util.List<bookpath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bookpath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bookpaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bookpaths.
	*
	* @return the number of bookpaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}