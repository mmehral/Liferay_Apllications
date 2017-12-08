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

package com.chola.successstories.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.exception.NoSuchsspathException;
import com.chola.successstories.model.sspath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the sspath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.successstories.service.persistence.impl.sspathPersistenceImpl
 * @see sspathUtil
 * @generated
 */
@ProviderType
public interface sspathPersistence extends BasePersistence<sspath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link sspathUtil} to access the sspath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the sspaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching sspaths
	*/
	public java.util.List<sspath> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the sspaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @return the range of matching sspaths
	*/
	public java.util.List<sspath> findByCONTENT_ID(long content_id, int start,
		int end);

	/**
	* Returns an ordered range of all the sspaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sspaths
	*/
	public java.util.List<sspath> findByCONTENT_ID(long content_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator);

	/**
	* Returns an ordered range of all the sspaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching sspaths
	*/
	public java.util.List<sspath> findByCONTENT_ID(long content_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first sspath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sspath
	* @throws NoSuchsspathException if a matching sspath could not be found
	*/
	public sspath findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator)
		throws NoSuchsspathException;

	/**
	* Returns the first sspath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sspath, or <code>null</code> if a matching sspath could not be found
	*/
	public sspath fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator);

	/**
	* Returns the last sspath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sspath
	* @throws NoSuchsspathException if a matching sspath could not be found
	*/
	public sspath findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator)
		throws NoSuchsspathException;

	/**
	* Returns the last sspath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sspath, or <code>null</code> if a matching sspath could not be found
	*/
	public sspath fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator);

	/**
	* Returns the sspaths before and after the current sspath in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current sspath
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sspath
	* @throws NoSuchsspathException if a sspath with the primary key could not be found
	*/
	public sspath[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator)
		throws NoSuchsspathException;

	/**
	* Removes all the sspaths where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of sspaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching sspaths
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the sspath in the entity cache if it is enabled.
	*
	* @param sspath the sspath
	*/
	public void cacheResult(sspath sspath);

	/**
	* Caches the sspaths in the entity cache if it is enabled.
	*
	* @param sspaths the sspaths
	*/
	public void cacheResult(java.util.List<sspath> sspaths);

	/**
	* Creates a new sspath with the primary key. Does not add the sspath to the database.
	*
	* @param id the primary key for the new sspath
	* @return the new sspath
	*/
	public sspath create(long id);

	/**
	* Removes the sspath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the sspath
	* @return the sspath that was removed
	* @throws NoSuchsspathException if a sspath with the primary key could not be found
	*/
	public sspath remove(long id) throws NoSuchsspathException;

	public sspath updateImpl(sspath sspath);

	/**
	* Returns the sspath with the primary key or throws a {@link NoSuchsspathException} if it could not be found.
	*
	* @param id the primary key of the sspath
	* @return the sspath
	* @throws NoSuchsspathException if a sspath with the primary key could not be found
	*/
	public sspath findByPrimaryKey(long id) throws NoSuchsspathException;

	/**
	* Returns the sspath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the sspath
	* @return the sspath, or <code>null</code> if a sspath with the primary key could not be found
	*/
	public sspath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, sspath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the sspaths.
	*
	* @return the sspaths
	*/
	public java.util.List<sspath> findAll();

	/**
	* Returns a range of all the sspaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @return the range of sspaths
	*/
	public java.util.List<sspath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the sspaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sspaths
	*/
	public java.util.List<sspath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator);

	/**
	* Returns an ordered range of all the sspaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sspaths
	* @param end the upper bound of the range of sspaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of sspaths
	*/
	public java.util.List<sspath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<sspath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the sspaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of sspaths.
	*
	* @return the number of sspaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}