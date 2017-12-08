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

package com.chola.knowledgebites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.knowledgebites.exception.NoSuchkbpathException;
import com.chola.knowledgebites.model.kbpath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the kbpath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.knowledgebites.service.persistence.impl.kbpathPersistenceImpl
 * @see kbpathUtil
 * @generated
 */
@ProviderType
public interface kbpathPersistence extends BasePersistence<kbpath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link kbpathUtil} to access the kbpath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the kbpaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching kbpaths
	*/
	public java.util.List<kbpath> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the kbpaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of kbpaths
	* @param end the upper bound of the range of kbpaths (not inclusive)
	* @return the range of matching kbpaths
	*/
	public java.util.List<kbpath> findByCONTENT_ID(long content_id, int start,
		int end);

	/**
	* Returns an ordered range of all the kbpaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of kbpaths
	* @param end the upper bound of the range of kbpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kbpaths
	*/
	public java.util.List<kbpath> findByCONTENT_ID(long content_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator);

	/**
	* Returns an ordered range of all the kbpaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of kbpaths
	* @param end the upper bound of the range of kbpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kbpaths
	*/
	public java.util.List<kbpath> findByCONTENT_ID(long content_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kbpath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbpath
	* @throws NoSuchkbpathException if a matching kbpath could not be found
	*/
	public kbpath findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator)
		throws NoSuchkbpathException;

	/**
	* Returns the first kbpath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbpath, or <code>null</code> if a matching kbpath could not be found
	*/
	public kbpath fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator);

	/**
	* Returns the last kbpath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbpath
	* @throws NoSuchkbpathException if a matching kbpath could not be found
	*/
	public kbpath findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator)
		throws NoSuchkbpathException;

	/**
	* Returns the last kbpath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbpath, or <code>null</code> if a matching kbpath could not be found
	*/
	public kbpath fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator);

	/**
	* Returns the kbpaths before and after the current kbpath in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current kbpath
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kbpath
	* @throws NoSuchkbpathException if a kbpath with the primary key could not be found
	*/
	public kbpath[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator)
		throws NoSuchkbpathException;

	/**
	* Removes all the kbpaths where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of kbpaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching kbpaths
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the kbpath in the entity cache if it is enabled.
	*
	* @param kbpath the kbpath
	*/
	public void cacheResult(kbpath kbpath);

	/**
	* Caches the kbpaths in the entity cache if it is enabled.
	*
	* @param kbpaths the kbpaths
	*/
	public void cacheResult(java.util.List<kbpath> kbpaths);

	/**
	* Creates a new kbpath with the primary key. Does not add the kbpath to the database.
	*
	* @param id the primary key for the new kbpath
	* @return the new kbpath
	*/
	public kbpath create(long id);

	/**
	* Removes the kbpath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kbpath
	* @return the kbpath that was removed
	* @throws NoSuchkbpathException if a kbpath with the primary key could not be found
	*/
	public kbpath remove(long id) throws NoSuchkbpathException;

	public kbpath updateImpl(kbpath kbpath);

	/**
	* Returns the kbpath with the primary key or throws a {@link NoSuchkbpathException} if it could not be found.
	*
	* @param id the primary key of the kbpath
	* @return the kbpath
	* @throws NoSuchkbpathException if a kbpath with the primary key could not be found
	*/
	public kbpath findByPrimaryKey(long id) throws NoSuchkbpathException;

	/**
	* Returns the kbpath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kbpath
	* @return the kbpath, or <code>null</code> if a kbpath with the primary key could not be found
	*/
	public kbpath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, kbpath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the kbpaths.
	*
	* @return the kbpaths
	*/
	public java.util.List<kbpath> findAll();

	/**
	* Returns a range of all the kbpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbpaths
	* @param end the upper bound of the range of kbpaths (not inclusive)
	* @return the range of kbpaths
	*/
	public java.util.List<kbpath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the kbpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbpaths
	* @param end the upper bound of the range of kbpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kbpaths
	*/
	public java.util.List<kbpath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator);

	/**
	* Returns an ordered range of all the kbpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbpaths
	* @param end the upper bound of the range of kbpaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of kbpaths
	*/
	public java.util.List<kbpath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbpath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the kbpaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of kbpaths.
	*
	* @return the number of kbpaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}